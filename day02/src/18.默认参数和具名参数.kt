fun main(args: Array<String>) {
    var path = "www.baidu.com"
    var params = "10086"
//    sendRequest(path, params)
    sendRequest(path = path, method = "GET", params = params) // 具名参数,可以调换参数位置,最终不影响方法的调用
}

// 若通过具名参数调用,这里参数位置不影响; 若通过默认参数调用,默认参数需放到最后
fun sendRequest(method: String = "GET", path: String, params: String,id: String = "123") {
    println("method = $method, path = $path, params = $params, id = $id")
}

