# Rest API

    Get
    서버에서 데이터를 검색합니다.
    @PathVariable
    @RequestParam

    Post
    서버로 데이터를 보내 새로운 리소스를 생성합니다.
    @RequestBody

    Put
    서버의 기존 리소스를 업데이트하거나 교체합니다.
    @RequestBody

    Patch
    기존 리소스를 부분적으로 업데이트합니다.
    @RequestParam

    Delete
    서버에서 리소스를 삭제합니다.
    @PathVariable
    @RequestParam

# Rest API 어노테이션

    선언 : @RestController
    설명 추가: @Parameter(description = "이름")
    필수 여부: @PathVariable(value = "email", required = false)
             @RequestParam(required = false)
             @RequestBody(required = true)

# Swagger

    1. Dependency 추가
        pom.xml 참조
    2. Config 추가
        SwaggerConfig.java 참조
    3. 접속 URL
        http://localhost:8080/swagger-ui/index.html
