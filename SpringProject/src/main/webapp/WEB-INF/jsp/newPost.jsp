<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page session="true" %>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="../../favicon.ico">

    <title>Blog Test</title>

    <!-- Bootstrap core CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
    <!-- Custom styles for this template -->
    <link href="blog.css" rel="stylesheet">

</head>
<body>


        <div class="container">
            <form class="form-horizontal" action="submit" method="post">
                <fieldset>
                    <!-- Form Name -->
                    <p align="center"><legend>New Post</legend></p>

                    <!-- Text input-->
                    <div class="form-group">
                        <label class="col-md-4 control-label" for="postTitle">Title</label>
                        <div class="col-md-6">
                            <input id="username" name="username" type="text" placeholder="Post a title" class="form-control input-md" required="">
                        </div>
                    </div>

                    <!-- Text input-->
                    <div class="form-group">
                        <label class="col-md-4 control-label" for="category">Category</label>
                        <div class="col-md-6">
                            <input id="password" name="password" type="text" placeholder="Give a category" class="form-control input-md" required="">
                        </div>
                    </div>

                    <!-- Button -->
                    <div class="form-group">
                        <label class="col-md-4 control-label" for="postButton"></label>
                        <div class="col-md-4" align="center">
                            <button id="postButton" name="postButton" class="btn btn-success">Submit</button>
                        </div>
                    </div>

                </fieldset>
            </form>

        </div>
</body>
</html>
