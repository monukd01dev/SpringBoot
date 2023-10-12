<%@ page contentType="text/html; ISO-8859-1" language="java" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>home</title>
</head>
<body>
    <h1>how to add jsp confguaration in spring boot</h1>
    <ol>
        <li>create webapp folder in src/main/webapp/views/your.jsp</li>
        <li>create handler for your jsp</li>
        <li>set configuration inside application.properties
            <ul>
                <li>spring.mvc.view.prefix=/views/</li>
                <li>spring.mvc.view.suffix=.jsp</li>
            </ul>
        </li>
        <li>add dependency "Tomcat Embed Jasper" and please don't mention the version</li>
    </ol>
</body>
</html>