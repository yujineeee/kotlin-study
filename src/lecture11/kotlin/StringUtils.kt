package lecture11.kotlin

fun isDirectoryPath(path: String): Boolean {
    return path.endsWith("/")
}