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
                    <h5>资料管理</h5>
                </div>
                <div class="ibox-content">
                    <form role="form" class="form-horizontal" id="addForm">
                        <div class="col-sm-3">
                            <div class="form-group">
                                <label class="col-sm-3 control-label">姓名</label>
                                <div class="col-sm-6"><input type="text" class="form-control" id="customerName" placeholder="姓名"></div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-3 control-label">日期</label>
                                <div class="col-sm-5">
                                    <input type="text" class="datepicker" placeholder="请输入日期" />
                                    <!--<input type="text" class="datepicker" placeholder="结束日期" />-->
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-3 control-label">微信号</label>
                                <div class="col-sm-6"><input type="text" class="form-control" id="wechart" placeholder="微信号"></div>
                            </div>
                        </div>
                        <div class="col-sm-3">
                            <div class="form-group">
                                <label class="col-sm-3 control-label">地址</label>
                                <div class="col-sm-7">
                                    <input type="text" class="form-control" id="address" placeholder="地址">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-3 control-label">类型</label>
                                <div class="col-sm-4">
                                    <select name="type" id="searchType" class="form-control">
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
                                    <select name="type" id="searchStatus" class="form-control">
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
                                <div class="col-sm-6"><input type="text" class="form-control" id="orderNo"></div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-4 control-label">淘宝订单号</label>
                                    <div class="col-sm-6"><input type="text" class="form-control" id="wechart">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-4 control-label">淘宝账号</label>
                                <div class="col-sm-6"><input type="text" class="form-control" id="wechart"></div>
                            </div>
                        </div>
                    </from>
                </div>
                <div class="ibox-content">
                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    <button type="button" class="btn btn-primary" id="searchBth" >查询</button>
                    <button type="button" class="btn btn-success" id="resetBtn">重置</button>
                    <button type="button" class="btn btn-warning" id="addBtn">批量定金</button>
                    <button type="button" class="btn btn-danger" id="addBtn">批量完结</button>
                    <button type="button" class="btn btn-inverse" id="addBtn">批量打印</button>
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


<div id="add-modal" class="modal fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header bg-info">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true"></button>
                <h4 class="modal-title">
                    <i class="icon-pencil"></i>
                    <span  style="font-weight:bold">菜单新增</span>
                </h4>
            </div>
            <form class="form-horizontal form-bordered form-row-strippe" id="addForm" action="" data-toggle="validator">
                <div class="modal-body" id="add-data">

                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-sm" data-dismiss="modal">取消</button>
                    <button type="button" id="save-btn" class="btn btn-sm btn-success">确定</button>
                </div>
            </form>
        </div>
    </div>
</div>


<div id="upd-modal" class="modal fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header bg-info">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true"></button>
                <h4 class="modal-title">
                    <i class="icon-pencil"></i>
                    <span  style="font-weight:bold">菜单修改</span>
                </h4>
            </div>
            <form class="form-horizontal form-bordered form-row-strippe" id="updForm" action="" data-toggle="validator">
                <div class="modal-body" id="upd-data">

                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-sm" data-dismiss="modal">取消</button>
                    <button type="button" id="upd-btn" class="btn btn-sm btn-success">确定</button>
                </div>
            </form>
        </div>
    </div>
</div>

<!-- Page-Level Scripts -->
<script>
    var seasons = {};//类型
    var types = {};//菜单显示分类
    var seasonList;
    var typeList;
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
        $("#searchType option").each(function(){  //遍历所有option
              types[$(this).val()] = $(this).html();
         })
        $.jgrid.defaults.styleUI = 'Bootstrap';
        $("#table_list").jqGrid({
            datatype: "json",
            url: '${ctx}/product/page',
            mtype : 'POST',
            height: 300,
            autowidth: true,
            shrinkToFit: true,
            rowNum: 14,
            rowList: [10, 20, 30],
            colNames: ['id', '姓名', '类型', '订单日期','公司','区域','送货时间', '操作'],
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
                    width : 200
                },
                {
                    name: 'id',
                    index: 'id',
                    width: 200,
                    sortable: false,
                    formatter: function(cellvalue, options, rowObject){
                        var html = '<button class="btn btn-info" name="edit-btn" onClick="goUpdate('+cellvalue+')" data-key="'+cellvalue+'" type="button"><i class="fa fa-paste"></i> 编辑</button>&nbsp;&nbsp;';
                        html += '<button class="btn btn-warning" onClick="deleteRow('+cellvalue+')"  type="button"><i class="fa fa-warning"></i> <span class="bold">删除</span> </button>&nbsp;&nbsp;';
                        html += '<button class="btn btn-inverse" onClick="printRow('+cellvalue+')"  type="button"><i class="fa fa-warning"></i> <span class="bold">打印</span> </button>';
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



        $('#addBtn').bind('click',function(){
            var fmenuList;
            postAsync('${ctx}/fmenu/getFMenuList',{'parentId':0},function(result){fmenuList=result.data;});
            $('#add-data').html(template('add-tmpl',{
                'typeList':typeList,
                'seasonList':seasonList
            }));
            initImageUpload('add_path');
            $("#add-modal").modal({backdrop: 'static', keyboard: false});
        });


        $('#save-btn').bind('click',function(){
            save();
        });

        $('#searchBth').bind('click',function(){
            search();
        });

        $('#resetBtn').bind('click',function(){
            $('#searchForm')[0].reset();
        });

        $('#upd-btn').bind('click',function(){
            update();
        });



    });

   

    function goUpdate(id){
        var data;
        postAsync('${ctx}/product/getProduct',{'id':id},function(result){data=result.data});
        $('#upd-data').html(template('upd-tmpl',{
                'data':data,
                'seasonList':seasonList,
                'typeList':typeList
            }));
        initImageUpload('upd_path');
        $("#upd-modal").modal({backdrop: 'static', keyboard: false});
    }

    function update(){
        var param = {};
        $('#updForm .form-control').each(function(){
            var name = $(this).attr('name');
            var value = $(this).val();
            param[name] = value;
        });
        if(!validate(param)){
            return;
        }
        postAjax('${ctx}/product/update',param,function(result){
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
        $('#searchForm .form-control').each(function(){
            var name = $(this).attr('name');
            var value = $(this).val();
            param[name] = value;
        });
        $('#table_list').jqGrid('setGridParam',{
            postData : param,
            //查询重载第一页
            page : 1
        }).trigger("reloadGrid"); //重新载入
    }


    function save(){
        var param = {};
        $('#addForm .form-control').each(function(){
            var name = $(this).attr('name');
            var value = $(this).val();
            param[name] = value;
        });
        if(!validate(param)){
            return;
        }
        postAjax('${ctx}/product/add',param,function(result){
            if(result.success){
                $("#table_list").trigger("reloadGrid");
                swal("提示！", "新增成功!", "success");
                $("#add-modal").modal("hide");
            }else{
                swal("提示！", result.msg, "error");
            }
        });

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
            postAjax('${ctx}/product/delete',{'id':id},function(result){
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

    function validate(param){
        if (!param['type']) {
            swal("提示信息", "类型不能为空", "error");
            return false;
        }
        if (!param['season']) {
            swal("提示信息", "季节不能为空", "error");
            return false;
        }
        if (!param['imgUrl']) {
            swal("提示信息", "图片不能为空", "error");
            return false;
        }
        return true;
    }
</script>
</body>



<!-- script templcate -->
<script id="add-tmpl" type="text/html">
    <div class="row">
        <div class="col-md-12">
            <div class="form-group">
                <label class="control-label col-md-2">类型:</label>
                <div class="col-md-10">
                    <select name="type" class="form-control" placeholder="类型">
                    <option value="">---请选择---</option>
                        {{each typeList as value i}}
                            <option value="{{value.id}}">{{value.menuName}}</option>
                        {{/each}}
                    </select>
                </div>
            </div>

            <div class="form-group">
                <label class="control-label col-md-2">季节:</label>
                <div class="col-md-10">
                    <select name="season" class="form-control" placeholder="季节">
                    <option value="">---请选择---</option>
                        {{each seasonList as value i}}
                            <option value="{{value.id}}">{{value.name}}</option>
                        {{/each}}
                    </select>
                </div>
            </div>

            <div class="form-group">
             <label class="control-label col-md-2">排序:</label>
                 <div class="col-md-10">
                       <input name="ordered" type="text"  class="form-control" placeholder="排序" />                 
                 </div>          
            </div>

                <div class="form-group">
                    <label class="control-label col-md-2">图片:</label>
                    <div class="col-md-10">
                        <div class="demo l_f">
                            <div class="logobox"><div class="resizebox"><img src="${ctx}/assets/img/upload.png" width="100px" alt="" height="100px"/></div></div>
                            <div class="logoupload">
                                <input type="hidden" name="imgUrl" id="add_path" class="form-control"   />
                                <div class="btnbox"><a id="uploadBtnHolder" class="uploadbtn" href="javascript:;">上传替换</a></div>
                                <div style="clear:both;height:0;overflow:hidden;"></div>
                                <div class="progress-box" style="display:none;">
                                    <div class="progress-num">上传进度：<b>0%</b></div>
                                    <div class="progress-bar"><div style="width:0%;" class="bar-line"></div></div>
                                </div>
                            </div>

                        </div> <div class="prompt"><p>图片大小<b>120px*60px</b>图片大小小于5MB,</p><p>支持.jpg;.gif;.png;.jpeg格式的图片</p></div>
                    </div>
                </div>

            
        </div>
    </div>
</script>


<script id="upd-tmpl" type="text/html">
<input type="hidden" name="id" class="form-control" value="{{data.id}}" />
    <div class="row">
        <div class="col-md-12">
            <div class="form-group">
                <label class="control-label col-md-2">类型:</label>
                <div class="col-md-10">
                    <select name="type" class="form-control" placeholder="类型">
                    <option value="">---请选择---</option>
                        {{each typeList as value i}}
                            {{if data.type == value.id}}
                            <option value="{{value.id}}" selected >{{value.menuName}}</option>
                                {{else}}
                                <option value="{{value.id}}" >{{value.menuName}}</option>
                            {{/if}}
                        {{/each}}
                    </select>
                </div>
            </div>

            <div class="form-group">
                <label class="control-label col-md-2">季节:</label>
                <div class="col-md-10">
                    <select name="season" class="form-control" placeholder="季节">
                    <option value="">---请选择---</option>
                        {{each seasonList as value i}}
                            {{if data.season==value.id}}
                            <option value="{{value.id}}" selected>{{value.name}}</option>
                            {{else}}
                            <option value="{{value.id}}">{{value.name}}</option>
                            {{/if}}
                        {{/each}}
                    </select>
                </div>
            </div>

            <div class="form-group">
             <label class="control-label col-md-2">排序:</label>
                 <div class="col-md-10">
                       <input name="ordered" type="text" value="{{data.ordered}}"  class="form-control" placeholder="排序" />                 
                 </div>          
            </div>

                <div class="form-group">
                    <label class="control-label col-md-2">图片:</label>
                    <div class="col-md-10">
                        <div class="demo l_f">
                            <div class="logobox"><div class="resizebox"><img src="${ctx}/{{data.imgUrl}}" width="100px" alt="" height="100px"/></div></div>
                            <div class="logoupload">
                                <input type="hidden" name="imgUrl" value="{{data.imgUrl}}" id="upd_path" class="form-control"   />
                                <div class="btnbox"><a id="uploadBtnHolder" class="uploadbtn" href="javascript:;">上传替换</a></div>
                                <div style="clear:both;height:0;overflow:hidden;"></div>
                                <div class="progress-box" style="display:none;">
                                    <div class="progress-num">上传进度：<b>0%</b></div>
                                    <div class="progress-bar"><div style="width:0%;" class="bar-line"></div></div>
                                </div>
                            </div>

                        </div> <div class="prompt"><p>图片大小<b>120px*60px</b>图片大小小于5MB,</p><p>支持.jpg;.gif;.png;.jpeg格式的图片</p></div>
                    </div>
                </div>

            
        </div>
    </div>
</script>


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

    var swfImageUpload;

    function initImageUpload(imgId){
        var settings = {
            flash_url : "${ctx}/assets/js/plugins/swfupload/swfupload.swf",
            flash9_url : "${ctx}/assets/js/plugins/swfupload/swfupload_fp9.swf",
            upload_url: "${ctx}/upload/file",// 接受上传的地址
            file_size_limit : "15MB",// 文件大小限制
            file_types : "*.jpg;*.gif;*.png;*.jpeg;",// 限制文件类型
            file_types_description : "图片",// 说明，自己定义
            file_upload_limit : 100,
            file_queue_limit : 0,
            custom_settings : {},
            debug: false,
            // Button settings
            button_image_url: "${ctx}/assets/js/plugins/swfupload/upload-btn.png",
            button_width: "95",
            button_height: "30 ",
            button_placeholder_id: 'uploadBtnHolder',
            button_window_mode : SWFUpload.WINDOW_MODE.TRANSPARENT,
            button_cursor : SWFUpload.CURSOR.HAND,
            button_action: SWFUpload.BUTTON_ACTION.SELECT_FILE,

            moving_average_history_size: 40,

            // The event handler functions are defined in handlers.js
            swfupload_preload_handler : preLoad,
            swfupload_load_failed_handler : loadFailed,
            file_queued_handler : fileQueued,
            file_dialog_complete_handler: fileDialogComplete,
            upload_start_handler : function (file) {
                initProgress();
                updateProgress(file);
            },
            upload_progress_handler : function(file, bytesComplete, bytesTotal) {
                updateProgress(file);
            },
            upload_success_handler : function(file, data, response) {
                // 上传成功后处理函数
                var fileInfo = eval("(" + data + ")");
                successAction(fileInfo,imgId);
            },
            upload_error_handler : function(file, errorCode, message) {
                alert('上传发生了错误！');
            },
            file_queue_error_handler : function(file, errorCode, message) {
                if(errorCode == -110) {
                    alert('您选择的文件太大了。');
                }
            }
        };
        swfImageUpload = new SWFUpload(settings);
    }


    $(document).ready(function() {

    });
</script>



</html>
