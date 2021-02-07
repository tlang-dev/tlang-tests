package io.sorne.tlang.tests.packager

import io.sorne.tlang.bagman.Packager
import org.scalatest.funsuite.AnyFunSuite

import java.io.{FileInputStream, InputStream}
import java.nio.file.Paths
import java.util.zip.{CRC32, CheckedInputStream}

class PackagerTest extends AnyFunSuite {

  test("Test packager") {
    val file = getClass.getResource("/packager")
    Packager.createDefaultPackage(Paths.get(file.getPath)) match {
      case Left(value) => throw new Exception
      case Right(path) =>
        assert(1653519264L == getChecksumCRC32(new FileInputStream(Paths.get(path.toString, "TestPackager.tbag").toFile), 1024))
        assert(1272764691L == getChecksumCRC32(new FileInputStream(Paths.get(path.toString, "TBagManifest.yaml").toFile), 1024))
    }
  }


  def getChecksumCRC32(stream: InputStream, bufferSize: Int): Long = {
    val checkedInputStream = new CheckedInputStream(stream, new CRC32)
    val buffer = new Array[Byte](bufferSize)
    while ( {
      checkedInputStream.read(buffer, 0, buffer.length) >= 0
    }) {
    }
    checkedInputStream.getChecksum.getValue
  }

}
