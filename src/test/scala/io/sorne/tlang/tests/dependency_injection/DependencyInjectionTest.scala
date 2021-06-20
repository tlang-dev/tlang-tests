package io.sorne.tlang.tests.dependency_injection

import dev.tlang.tlang.runner.RunMain
import org.scalatest.funsuite.AnyFunSuite

class DependencyInjectionTest extends AnyFunSuite{

  val RET: String = System.lineSeparator()

  test("Simple dependency injection") {
    val output = new java.io.ByteArrayOutputStream
    val file = getClass.getResource("/DependencyInjection/SimpleInjection")
    Console.withOut(output)(RunMain.runDir(file.getPath))
    assert("Hello, World!" + RET == output.toString)
  }
}
