<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<body>
<div id="wrapper">
    <!-- Navigation -->
    <nav class="navbar navbar-default navbar-static-top" role="navigation" style="margin-bottom: 0">
        <jsp:include page="../../fragments/header_panel.jsp"/>
        <jsp:include page="../../fragments/left_panel.jsp"/>
    </nav>
    <div id="page-wrapper">
        <div class="row">
            <div class="col-lg-12">
                <h1 class="page-header">Dashboard</h1>

                <form role="form">
                    <div class="form-group">
                        <label>First name</label>
                        <input class="form-control" placeholder="Enter first name ">
                    </div>
                    <div class="form-group">
                        <label>Last name</label>
                        <input class="form-control" placeholder="Enter last name">
                    </div>
                    <!-- Change this to a button or input when using this as a form -->
                    <input class="btn btn-lg btn-success btn-block" type="submit"
                           value="Submit"/>
                </form>
            </div>
        </div>
        <!-- /.row -->
    </div>
    <!-- /#page-wrapper -->
</div>
</body>
</html>
