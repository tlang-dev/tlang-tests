package io.sorne.tlang.tests.`if`

import io.sorne.tlang.runner.RunMain
import org.scalatest.funsuite.AnyFunSuite

class IfTest extends AnyFunSuite {

  val output = new java.io.ByteArrayOutputStream

  test("SimpleIfs") {
    val file = getClass.getResource("/If/SimpleIfs")
    Console.withOut(output)(RunMain.runDir(file.getPath))
    assert("OK1\nOK2\nOK3\nOK4\nOK5\nOK6\nOK7\nOK8\n" == output.toString)
  }

}