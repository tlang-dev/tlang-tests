package io.sorne.tlang.tests.`for`

import dev.tlang.tlang.runner.RunMain
import org.scalatest.funsuite.AnyFunSuite

class ForTest extends AnyFunSuite {

  test("SimpleFors") {
    val output = new java.io.ByteArrayOutputStream
    val file = getClass.getResource("/For/SimpleFors")
    Console.withOut(output)(RunMain.runDir(file.getPath))
    assert("OK1\nOK1\nOK1\nOK1\nOK1\nOK2\nOK2\nOK2\nOK2\nOK2\nOK3\nOK3\nOK3\nOK3\nOK3\n" == output.toString)
  }

}
