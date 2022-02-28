rootProject.name = "dependabot-test"

include("moduleA", "moduleB")

project(":moduleA").projectDir = file("subfolder/moduleA")
project(":moduleB").projectDir = file("subfolder/moduleB")
