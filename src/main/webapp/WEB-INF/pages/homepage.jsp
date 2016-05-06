<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE>
<html>
<%@include file="../fragments/header.jsp" %>
<%@ taglib prefix="sec"
           uri="http://www.springframework.org/security/tags" %>
<body>
<div id="wrapper">
    <!-- Navigation -->
    <nav class="navbar navbar-default navbar-static-top" role="navigation" style="margin-bottom: 0">
        <jsp:include page="../fragments/header_panel.jsp" />
        <jsp:include page="../fragments/left_panel.jsp" />
    </nav>
</div>

<!-- jQuery -->
<script src="template/js/jquery.js"></script>

<!-- Bootstrap Core JavaScript -->
<script src="../template/js/bootstrap.min.js"></script>

<!-- Metis Menu Plugin JavaScript -->
<script src="../template/js/plugins/metisMenu/metisMenu.min.js"></script>

<!-- Morris Charts JavaScript -->
<script src="../template/js/plugins/morris/raphael.min.js"></script>
<script src="../template/js/plugins/morris/morris.min.js"></script>
<script src="../template/js/plugins/morris/morris-data.js"></script>

<!-- Custom Theme JavaScript -->
<script src="../template/js/sb-admin-2.js"></script>
</body>
</html>