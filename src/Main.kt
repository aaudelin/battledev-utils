import java.io.File
import java.nio.file.Files
import java.nio.file.Path
import kotlin.streams.toList

fun main(args: Array<String>) {

    // First argument is the program name you want to test
    // IsoContest for instance
    var programName = args[0]

    // Second argument is the program directory path you want to test
    var programFolder = args[1]

    // Third argument is the folder where you unzip the downloaded
    // sample files from battledev
    var testsFolder = args[2]

    var exercice = 0
    var success = true

    Runtime.getRuntime().exec("javac $programFolder/$programName.java").waitFor()

    Files.list(Path.of(testsFolder))
        .filter {
            it.toString().split(File.separator).last().startsWith("input")
        }
        .forEach {
            if (!success) return@forEach

            val inputLines = it.toFile().readLines()
            var outputName = it.toString().replace(File.separator + "input", File.separator + "output")
            val outputLines = File(outputName).readLines()

            println("Lauching exercise ${++exercice}")

            var process = Runtime.getRuntime().exec("java -classpath $programFolder; $programName")
            val bufferedWriter = process.outputStream.bufferedWriter()
            inputLines.forEach {
                bufferedWriter.appendln("$it")
            }
            bufferedWriter.close()
            process.errorStream.bufferedReader().lines().forEach { println("Debug : $it") }
            val result = process.inputStream.bufferedReader().lines().toList()

            for ((index, element) in result.withIndex()) {
                    if (element != outputLines[index]) {
                        println("Error : Expected ${outputLines[index]}")
                        println("Error : Actual : $element")
                        success = false
                        return@forEach
                    }
            }

            println("Exercise ${++exercice} completed with success")
        }

    if(success) {
        println("All exercises completed with success")
    }

}