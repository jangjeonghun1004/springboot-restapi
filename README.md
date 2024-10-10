# **@RestController을 활용한 Rest API**
    Get
        @PathVariable(value = "email", required = false)
        @RequestParam(value = "email", required = true)

    Post
        @RequestBody

    Put
        @RequestBody

    Delete
        @PathVariable(value = "email", required = false)
        @RequestParam(value = "email", required = true)


# **Rest API 관련 어노테이션**
    @Parameter(description = "이름")


# **Swagger UI**
    http://localhost:8080/swagger-ui/index.html
