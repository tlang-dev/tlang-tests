package io.sorne.tlang.tests.template

import dev.tlang.tlang.runner.RunMain
import org.scalatest.funsuite.AnyFunSuite

class TemplateTest extends AnyFunSuite {



  test("Simple replace") {
    val output = new java.io.ByteArrayOutputStream
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

  test("Tmpl for") {
    val output = new java.io.ByteArrayOutputStream
    val res =
      """package package1
        |
        |class MyClass {
        |def main(args: Array[String]) {
        |
        |}
        |
        |}""".stripMargin
    val file = getClass.getResource("/Template/TmplFor")
    Console.withOut(output)(RunMain.runDir(file.getPath))
    println(output.toString)
//    assert(output.toString.contains(res))
  }

}
