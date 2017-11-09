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
                    <h5>资料管理</h5>
                </div>
                <div class="ibox-content">
                    <form role="form" class="form-horizontal" id="searchForm">
                        <div class="col-sm-3">
                            <div class="form-group">
                                <label class="col-sm-3 control-label">姓名</label>
                                <div class="col-sm-6"><input type="text" class="form-control" name="customerName" id="customerName" placeholder="姓名"></div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-3 control-label">日期</label>
                                <div class="col-sm-5">
                                    <input type="text" name="orderTime" id="orderTime" class="datepicker" placeholder="请输入日期" />
                                    <!--<input type="text" class="datepicker" placeholder="结束日期" />-->
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-3 control-label">微信号</label>
                                <div class="col-sm-6"><input type="text" class="form-control" name="wechart" id="wechart" placeholder="微信号"></div>
                            </div>
                        </div>
                        <div class="col-sm-3">
                            <div class="form-group">
                                <label class="col-sm-3 control-label">地址</label>
                                <div class="col-sm-7">
                                    <input type="text" class="form-control" name="address" id="address" placeholder="地址">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-3 control-label">类型</label>
                                <div class="col-sm-4">
                                    <select name="type" id="type" name="type" class="form-control">
                                        <option value="">全部</option>
                                        <option value="1">衬衫</option>
                                        <option value="2">西装</option>
                                        <option value="3">马甲</option>
                                    </select>
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-3 control-label">订单状态</label>
                                <div class="col-sm-4">
                                    <select name="type" id="orderStatus" name="orderStatus" class="form-control">
                                        <option value="">全部</option>
                                        <option value="1">未定金</option>
                                        <option value="2">已定金</option>
                                        <option value="3">已完结</option>
                                    </select>
                                </div>
                            </div>
                        </div>
                        <div class="col-sm-3">
                            <div class="form-group">
                                <label class="col-sm-4 control-label">订单编号</label>
                                <div class="col-sm-6"><input type="text" class="form-control" name="orderNo" id="orderNo"></div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-4 control-label">淘宝订单号</label>
                                    <div class="col-sm-6"><input type="text" class="form-control" name="tbOrderNo" id="tbOrderNo">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-4 control-label">淘宝账号</label>
                                <div class="col-sm-6"><input type="text" class="form-control" name="tbAccNo" id="tbAccNo"></div>
                            </div>
                        </div>
                    </from>
                </div>
                <div class="ibox-content">
                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    <button type="button" class="btn btn-primary" id="searchBth" >查询</button>
                    <button type="button" class="btn btn-success" id="resetBtn">重置</button>
                    <button type="button" class="btn btn-warning" id="priceBtn">批量定金</button>
                    <button type="button" class="btn btn-danger" id="finishBtn">批量完结</button>
                    <button type="button" class="btn btn-inverse" id="printBtn">批量打印</button>
                </div>
                <!-- <h4>用户列表</h4> -->
                <div class="jqGrid_wrapper">
                    <table id="table_list"></table>
                    <div id="pager_list"></div>
                </div>
                <p>&nbsp;</p>
            </div>
        </div>
    </div>
</div>

<!-- Page-Level Scripts -->
<script>
    function UnixToDate(unixTime, isFull, timeZone) {
        if (typeof (timeZone) == 'number')
        {
          unixTime = parseInt(unixTime) + parseInt(timeZone) * 60 * 60;
        }
        var time = new Date(unixTime);
        var ymdhis = "";
        ymdhis += time.getUTCFullYear() + "-";
        ymdhis += (time.getMonth()+1) + "-";
        ymdhis += time.getDate();
        if (isFull === true)
        {
          ymdhis += " " + time.getUTCHours() + ":";
          ymdhis += time.getUTCMinutes() + ":";
          ymdhis += time.getUTCSeconds();
        }
        return ymdhis;
      }
    $(function () {
        $(".datepicker").datepicker({
            language: "zh-CN",
            autoclose: true,//选中之后自动隐藏日期选择框
            clearBtn: true,//清除按钮
            todayBtn: true,//今日按钮
            setStartDate : '2012-01-01',
            format: "yyyy-mm-dd"//日期格式，详见 http://bootstrap-datepicker.readthedocs.org/en/release/options.html#format
        });
        var types = new Array();
        $("#type option").each(function(){  //遍历所有option
              types[$(this).val()] = $(this).html();
         })
        var orderStatusList = new Array();
        $("#orderStatus option").each(function(){  //遍历所有option
              orderStatusList[$(this).val()] = $(this).html();
         })
        $.jgrid.defaults.styleUI = 'Bootstrap';
        $("#table_list").jqGrid({
            datatype: "json",
            url: '${ctx}/product/queryPcPage',
            mtype : 'POST',
            height: 300,
            autowidth: true,
            shrinkToFit: true,
            rowNum: 14,
            rowList: [10, 20, 30],
            colNames: ['id', '姓名', '类型', '订单日期','公司','区域','送货时间','状态', '操作'],
            colModel: [
                {
                    name: 'id',
                    index: 'id',
                    width: 60,
                    sorttype: "int"
                },
                {
                    name: 'customerName',
                    index: 'customerName',
                    width: 90
                },
                {
                    name: 'type',
                    index: 'type',
                    width: 90,
                    formatter : function(cellvalue, options, rowObject){
                       return types[cellvalue];
                    }
                },
                {
                    name: 'orderTime',
                    index: 'orderTime',
                    formatter:'date',
                    formatter: function(cellValue, options, rowObject) {
                        if(cellValue != ''){
                            return UnixToDate(cellValue)
                        }else{
                            return '';
                        }
                    },//jqgrid自定义格式化
                    width: 90
                },
                {
                    name:'companyName',
                    index:'companyName',
                    width : 100
                },
                {
                    name:'address',
                    index:'address',
                    width : 100
                },
                {
                    name:'sendTime',
                    index:'sendTime',
                    formatter: function(cellValue, options, rowObject) {
                        if(cellValue != ''){
                            return UnixToDate(cellValue)
                        }else{
                            return '';
                        }
                    },
                    width : 200
                },
                {
                    name:'orderStatus',
                    index:'orderStatus',
                    width : 100,
                    formatter : function(cellvalue, options, rowObject){
                       return orderStatusList[cellvalue];
                    }
                },
                {
                    name: 'id',
                    index: 'id',
                    width: 200,
                    sortable: false,
                    formatter: function(cellvalue, options, rowObject){
                        var html = '<a class="btn btn-info" name="edit-btn" href="${ctx}/product/infoPage?id='+cellvalue+'" data-key="'+cellvalue+'" type="button"><i class="fa fa-paste"></i> 编辑</a>&nbsp;&nbsp;';
                        html += '<button class="btn btn-warning" onClick="deleteRow('+cellvalue+')"  type="button"><i class="fa fa-warning"></i> <span class="bold">删除</span> </button>&nbsp;&nbsp;';
                        html += '<a class="btn btn-primary" href="${ctx}/product/print?ids='+cellvalue+'" target="_blank"  role="button"><i class="fa fa-warning"></i> <span class="bold">打印</span> </a>';
                        return html;
                    }
                }
            ],
            pager: "#pager_list",
            viewrecords: true,
            hidegrid: false,
            jsonReader :{
                root: "result",    // json中代表实际模型数据的入口
                page: "pageNum",    // json中代表当前页码的数据
                total: "pages",    // json中代表页码总数的数据
                records: "total", // json中代表数据行总数的数据
                repeatitems: false
            },
            multiselect : true,
            autowidth: true,
            sortname: 'id',
            viewrecords: true,
            sortorder: "desc"
        });
        $('#searchBth').bind('click',function(){
            search();
        });
        $('#resetBtn').bind('click',function(){
            $('#searchForm')[0].reset();
        });
        $('#priceBtn').bind('click',function(){
            var grid = $('#table_list');
            var rowKey = grid.getGridParam("selrow");
            var orderStatus = 2;
            if (rowKey) {
                var selectedIDs = grid.getGridParam("selarrrow");
                updateOrders(selectedIDs,orderStatus);
            }else{
                swal("提示！", "请选择记录！!", "error");
                return;
            }
        });
        $('#finishBtn').bind('click',function(){
            var grid = $('#table_list');
            var rowKey = grid.getGridParam("selrow");
            var orderStatus = 3;
            if (rowKey) {
                var selectedIDs = grid.getGridParam("selarrrow");
                updateOrders(selectedIDs,orderStatus);
            }else{
                swal("提示！", "请选择记录！!", "error");
                return;
            }
        });
        $('#printBtn').bind('click',function(){
            var grid = $('#table_list');
            var rowKey = grid.getGridParam("selrow");
            if (rowKey) {
                var selectedIDs = grid.getGridParam("selarrrow");
                //window.location.href = "${ctx}/product/print?ids="+selectedIDs;
                window.open("${ctx}/product/print?ids="+selectedIDs);
            }else{
                swal("提示！", "请选择记录！!", "error");
                return;
            }
        });
    });

    function updateOrders(arrayObj,orderStatus){
        postAjax('${ctx}/product/updateOrders',{'ids[]':arrayObj,'orderStatus':orderStatus},function(result){
            if(result.success){
                $("#table_list").trigger("reloadGrid");
                swal("提示！", "修改成功!", "success");
                $("#upd-modal").modal("hide");
            }else{
                swal("提示！", result.msg, "error");
            }
        });
    }

    function search(){
        var param = {};
        $('#searchForm input').each(function(){
            var name = $(this).attr('name');
            var value = $(this).val();
            param[name] = value;
        });
        param['orderStatus'] = $('#orderStatus').val();
        param['type'] = $('#type').val();
        $('#table_list').jqGrid('setGridParam',{
            postData : param,
            //查询重载第一页
            page : 1
        }).trigger("reloadGrid"); //重新载入
    }
    //删除记录
    function deleteRow(id){
        swal({
            title:"",
            text:"确定删除吗？",
            type:"warning",
            showCancelButton:"true",
            showConfirmButton:"true",
            confirmButtonText:"确定",
            cancelButtonText:"取消",
            animation:"slide-from-top"
        }, function() {
            postAjax('${ctx}/product/delete',{'id':id,'status':1},function(result){
                if(result.success){
                    $("#table_list").trigger("reloadGrid");
                    swal("操作成功!", "已成功删除数据！", "success");
                }else{
                    swal("提示信息", "删除失败", "error");
                }
            });
        });
    }
    //打印记录
    function printRow(id){
        swal({
            title:"",
            text:"确定打印吗？",
            type:"warning",
            showCancelButton:"true",
            showConfirmButton:"true",
            confirmButtonText:"确定",
            cancelButtonText:"取消",
            animation:"slide-from-top"
        }, function() {
            window.open("${ctx}/test/report","_blank");
            //window.location.href = "${ctx}/test/report";
        });
    }
</script>
</body>

<script type="text/javascript">
    function updateProgress(file) {
        $('.progress-box .progress-bar > div').css('width', parseInt(file.percentUploaded) + '%');
        $('.progress-box .progress-num > b').html(SWFUpload.speed.formatPercent(file.percentUploaded));
        if(parseInt(file.percentUploaded) == 100) {
            // 如果上传完成了
            $('.progress-box').hide();
        }
    }

    function initProgress() {
        $('.progress-box').show();
        $('.progress-box .progress-bar > div').css('width', '0%');
        $('.progress-box .progress-num > b').html('0%');
    }

    function successAction(fileInfo,imgId) {
        var up_path = fileInfo.path;
        var up_width = fileInfo.width;
        var up_height = fileInfo.height;
        var _up_width,_up_height;
        if(up_width > 120) {
            _up_width = 120;
            _up_height = _up_width*up_height/up_width;
        }
        $(".logobox .resizebox").css({width: _up_width, height: _up_height});
        $(".logobox .resizebox > img").attr('src', '../'+up_path);
        $(".logobox .resizebox > img").attr('width', _up_width);
        $(".logobox .resizebox > img").attr('height', _up_height);
        $('#'+imgId).val(up_path);
    }


    $(document).ready(function() {

    });
</script>



</html>
