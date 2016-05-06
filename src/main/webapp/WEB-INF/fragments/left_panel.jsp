<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<%@include file="header.jsp" %>
<body>
<div class="navbar-default sidebar" role="navigation">
    <div class="sidebar-nav navbar-collapse">
        <ul class="nav" id="side-menu">
            <li class="sidebar-search">
                <div class="input-group custom-search-form">
                    <input type="text" class="form-control" placeholder="Search...">
                                <span class="input-group-btn">
                                <button class="btn btn-default" type="button">
                                    <i class="fa fa-search"></i>
                                </button>
                            </span>
                </div>
                <!-- /input-group -->
            </li>
            <li>
                <a class="active" href="index.html"><i class="fa fa-dashboard fa-fw"></i> Dashboard</a>
            </li>
            <li>
                <a href="#"><i class="fa fa-files-o fa-fw"></i> Sample Pages<span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">
                    <li>
                        <a href="addUserSystemPage.html">Add user system</a>
                    </li>
                    <li>
                        <a href="loginPage.html">List of system users</a>
                    </li>
                    <li>
                        <a href="loginPage.html">Add visitor</a>
                    </li>
                    <li>
                        <a href="loginPage.html">List visitors</a>
                    </li>
                    <li>
                        <a href="loginPage.html">Black List</a>
                    </li>
                    <li>
                        <a href="loginPage.html">Login page</a>
                    </li>
                </ul>
            </li>
        </ul>
    </div>
</div>
</body>
</html>
