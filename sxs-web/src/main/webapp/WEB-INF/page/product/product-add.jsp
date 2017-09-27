<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title> - jqGird</title>
    <meta name="keywords" content="">
    <meta name="description" content="">
    <base target="_blank">
    <link rel="shortcut icon" href="favicon.ico">
    <style>
        #alertmod_table_list_2 {
            top: 900px !important;
        }
    </style>
    <jsp:include page="../include.jsp"></jsp:include>
</head>

<body class="gray-bg">
<div class="wrapper wrapper-content  animated fadeInRight">
    <div class="row">
        <div class="col-sm-12">
            <div class="ibox ">
                <div class="ibox-title">
                    <h5>资料录入</h5>
                </div>
                <div class="ibox-content">
                    <form class="form-horizontal" action="${ctx}/product/add">
                      <div class="form-group form-group-sm">
                        <label class="col-sm-2 control-label" for="formGroupInputSmall">Small label</label>
                        <div class="col-sm-5">
                          <input class="form-control" type="text" id="formGroupInputSmall" placeholder="Small input">
                        </div>
                      </div>
                      <div class="form-group form-group-sm">
                        <label class="col-sm-2 control-label" for="formGroupInputSmall">Small label</label>
                        <div class="col-sm-5">
                          <input class="form-control" type="text" id="formGroupInputSmall" placeholder="Small input">
                        </div>
                      </div>
                      <div class="form-group form-group-sm">
                        <label class="col-sm-2 control-label" for="formGroupInputSmall">Small label</label>
                        <div class="col-sm-5">
                          <input class="form-control" type="text" id="formGroupInputSmall" placeholder="Small input">
                        </div>
                      </div>
                      <div class="form-group form-group-sm">
                        <label class="col-sm-2 control-label" for="formGroupInputSmall">Small label</label>
                        <div class="col-sm-5">
                          <input class="form-control" type="text" id="formGroupInputSmall" placeholder="Small input">
                        </div>
                      </div>
                      <div class="form-group">
                        <label class="col-sm-2 control-label" for="formGroupInputSmall"></label>
                        <div class="col-sm-5"><button type="submit" class="btn btn-primary">Submit</button></div>
                      </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>
