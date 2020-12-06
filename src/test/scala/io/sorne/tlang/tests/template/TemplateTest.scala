package io.sorne.tlang.tests.template

import io.sorne.tlang.runner.RunMain
import org.scalatest.funsuite.AnyFunSuite

class TemplateTest extends AnyFunSuite {

  val output = new java.io.ByteArrayOutputStream

  test("Simple replace") {
    val res =
      """package package1
        |
        |class MyClass {
        |def main(args: Array[String]) {
        |
        |}
        |
        |}""".stripMargin
    val file = getClass.getResource("/Template/SimpleReplace")
    Console.withOut(output)(RunMain.runDir(file.getPath))
    assert(output.toString.contains(res))
  }

}
