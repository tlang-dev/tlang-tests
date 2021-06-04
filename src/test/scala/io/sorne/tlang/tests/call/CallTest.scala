package io.sorne.tlang.tests.call

import dev.tlang.tlang.runner.RunMain
import org.scalatest.funsuite.AnyFunSuite

class CallTest extends AnyFunSuite {

  val RET: String = System.lineSeparator()

  test("Call func in entity") {
    val output = new java.io.ByteArrayOutputStream
    val file = getClass.getResource("/Call/FuncInEntity")
    Console.withOut(output)(RunMain.runDir(file.getPath))
    assert("Hello, World!" + RET == output.toString)
  }

  test("Call func in model entity") {
    val output = new java.io.ByteArrayOutputStream
    val file = getClass.getResource("/Call/FuncInModel")
    Console.withOut(output)(RunMain.runDir(file.getPath))
    assert("Hello, World!" + RET == output.toString)
  }

}
