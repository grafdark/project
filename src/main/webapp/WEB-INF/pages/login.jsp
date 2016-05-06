<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<!DOCTYPE>
<html>
<%@include file="../fragments/header.jsp" %>
<body>
<div class="container">
    <div class="row">
        <div class="col-md-4 col-md-offset-4">
            <div class="login-panel panel panel-default">
                <div class="panel-heading">
                    <h3 class="panel-title">Please Sign In</h3>
                </div>
                <div class="panel-body">
                    <form role="form" method="post" action="j_spring_security_check">
                        <fieldset>
                            <div class="form-group">
                                <input class="form-control" placeholder="Login" name='j_username'  autofocus >
                            </div>
                            <div class="form-group">
                                <input class="form-control" placeholder="Password"type="password" name='j_password'  value="">
                            </div>
                            <div class="checkbox">
                                <label>
                                    <input name="remember" type="checkbox" value="Remember Me">Remember Me
                                </label>
                            </div>
                            ${error}
                            <!-- Change this to a button or input when using this as a form -->
                            <input class="btn btn-lg btn-success btn-block" type="submit"
                                   value="Login" />
                        </fieldset>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>
