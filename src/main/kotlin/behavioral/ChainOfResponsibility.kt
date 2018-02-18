package behavioral

class HttpRequest(val accept: String, val length: Int)

class HttpResponse(var content: String, val statusCode: Int)


class HttpHandler(var request: HttpRequest, var response: HttpResponse)

fun httpGet(path: String, handler: HttpHandler.() -> Unit) {

}

fun main(args: Array<String>) {
    httpGet("/videos") {
        if (request.accept == "ajfdskl") {
            response.content = "bla"
        }
    }
}