package lecture07.kotlin

import java.io.BufferedReader
import java.io.File
import java.io.FileReader

class FilePrinter {

    //checked/unchecked Exception을 구분하지 않음. 모두 unchecked
    fun readFile() {
        val currentFile = File(".")
        val file = File(currentFile.absolutePath + "/a.txt")
        val reader = BufferedReader(FileReader(file))
        println(reader.readLine())
        reader.close()
    }

    // use라는 inline 함수 사용
    fun readFile(path: String) {
        BufferedReader(FileReader(path)).use { reader ->
            println(reader.readLine())
        }
    }
}