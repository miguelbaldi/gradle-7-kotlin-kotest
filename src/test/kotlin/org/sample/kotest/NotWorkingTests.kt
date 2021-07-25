package org.sample.kotest

import io.kotest.core.spec.style.WordSpec
import io.kotest.matchers.shouldBe

class NotWorkingTests : WordSpec({
    "Hello" When {
        "asked for length" should {
            "Hello".length shouldBe 5 // If we set wrong value here, test is shown on HTML report with wrong package(default-package)
        }
        "appended to Bob" should {
            "Hello " + "Bob" shouldBe "Hello Bob"
        }
    }
})
