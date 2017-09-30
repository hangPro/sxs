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
                    <form class="form-horizontal" id="productForm">
                      <div class="alert alert-success" role="alert">客户信息</div>
                      <div class="form-group form-group-sm">
                        <label class="col-sm-2 control-label" for="customerName">姓名</label>
                        <div class="col-sm-5">
                          <input class="form-control" type="text" id="customerName" placeholder="请输入姓名">
                        </div>
                      </div>
                      <div class="form-group form-group-sm">
                        <label class="col-sm-2 control-label" for="customerPhone">电话</label>
                        <div class="col-sm-5">
                          <input class="form-control" type="text" id="customerPhone" placeholder="请输入电话">
                        </div>
                      </div>
                      <div class="form-group form-group-sm">
                        <label class="col-sm-2 control-label" for="wechart">微信号</label>
                        <div class="col-sm-5">
                          <input class="form-control" type="text" id="wechart" placeholder="请输入微信号">
                        </div>
                      </div>
                      <div class="form-group form-group-sm">
                        <label class="col-sm-2 control-label" for="tbAccNo">淘宝账号</label>
                        <div class="col-sm-5">
                          <input class="form-control" type="text" id="tbAccNo" placeholder="请输入淘宝账号">
                        </div>
                      </div>
                      <div class="form-group form-group-sm">
                        <label class="col-sm-2 control-label" for="tbOrderNo">淘宝订单号</label>
                        <div class="col-sm-5">
                          <input class="form-control" type="text" id="tbOrderNo" placeholder="请输入淘宝订单号">
                        </div>
                      </div>
                      <div class="form-group form-group-sm">
                          <label class="col-sm-2 control-label">订单日期</label>
                          <div class="col-sm-5">
                              <input type="text" class="datepicker" id="orderTime" placeholder="请输入订单日期" />
                          </div>
                      </div>
                      <div class="form-group form-group-sm">
                          <label class="col-sm-2 control-label">交货日期</label>
                          <div class="col-sm-5">
                              <input type="text" class="datepicker" id="sendTime" placeholder="请输入交货日期" />
                          </div>
                      </div>
                      <div class="form-group form-group-sm">
                          <label class="col-sm-2 control-label">所属公司</label>
                          <div class="col-sm-5">
                              <input type="text" class="form-control" id="companyName" placeholder="请输入所属公司" />
                          </div>
                      </div>
                      <div class="form-group form-group-sm">
                          <label class="col-sm-2 control-label">所属区域</label>
                          <div class="col-sm-5">
                              <input type="text" class="form-control" id="address" placeholder="请输入所属区域" />
                          </div>
                      </div>
                      <div class="form-group form-group-sm">
                          <label class="col-sm-2 control-label">性别</label>
                          <div class="col-sm-5">
                              <label class="checkbox-inline">
                                <input type="checkbox" name="customerSex" id="customerSex1" value="1"> 男
                              </label>
                              <label class="checkbox-inline">
                                <input type="checkbox" name="customerSex" id="customerSex2" value="2"> 女
                              </label>
                          </div>
                      </div>
                      <div class="form-group form-group-sm">
                          <label class="col-sm-2 control-label">布料编号</label>
                          <div class="col-sm-5">
                              <input type="text" class="form-control" id="clothNo" placeholder="请输入布料编号" />
                          </div>
                      </div>
                      <div class="form-group form-group-sm">
                          <label class="col-sm-2 control-label">布料用料</label>
                          <div class="col-sm-5">
                              <input type="text" class="form-control" id="clothDesc" placeholder="请输入布料用料" />
                          </div>
                      </div>
                      <div class="form-group form-group-sm">
                          <label class="col-sm-2 control-label">单价</label>
                          <div class="col-sm-5">
                              <input type="number" class="form-control" id="price" placeholder="请输入单价" />
                          </div>
                      </div>
                      <div class="form-group form-group-sm">
                          <label class="col-sm-2 control-label">订单金额</label>
                          <div class="col-sm-5">
                              <input type="number" class="form-control" id="orderAmount" placeholder="请输入订单金额" />
                          </div>
                      </div>
                      <div class="form-group form-group-sm">
                          <label class="col-sm-2 control-label">订金</label>
                          <div class="col-sm-5">
                              <input type="number" class="form-control" id="depositAmount" placeholder="请输入订金" />
                          </div>
                      </div>
                      <div class="form-group form-group-sm">
                        <label class="col-sm-2 control-label">是否试身</label>
                        <div class="col-sm-5">
                            <label class="checkbox-inline">
                              <input type="checkbox" name="bodyStatus" id="bodyStatus1" value="1" checked> 否
                            </label>
                            <label class="checkbox-inline">
                              <input type="checkbox" name="bodyStatus" id="bodyStatus2" value="2"> 是
                            </label>
                        </div>
                      </div>
                      <div class="form-group form-group-sm">
                        <label class="col-sm-2 control-label">是否交货</label>
                        <div class="col-sm-5">
                            <label class="checkbox-inline">
                              <input type="checkbox" name="sendStatus" id="sendStatus1" value="1" checked> 否
                            </label>
                            <label class="checkbox-inline">
                              <input type="checkbox" name="sendStatus" id="sendStatus2" value="2"> 是
                            </label>
                        </div>
                      </div>
                      <div class="alert alert-success" role="alert">订单信息</div>
                      <div class="form-group form-group-sm">
                          <label class="col-sm-2 control-label"></label>
                          <div class="col-sm-5">
                              <a href="javascript:void(0);" class="btn btn-primary" data="1" role="button">衬衫</a>
                              <a href="javascript:void(0);" class="btn btn-default" data="2" role="button">西装</a>
                              <a href="javascript:void(0);" class="btn btn-default" data="3" role="button">马甲</a>
                          </div>
                      </div>
                      <div class="form-group form-group-sm">
                          <label class="col-sm-2 control-label">前衣长</label>
                          <div class="col-sm-2">
                              <input type="number" class="form-control" id="qycNum" placeholder="前衣长" />
                          </div>
                          <label class="col-sm-1 control-label">裤长</label>
                          <div class="col-sm-2">
                              <input type="number" class="form-control" id="kcNum" placeholder="裤长" />
                          </div>
                      </div>
                      <div class="form-group form-group-sm">
                          <label class="col-sm-2 control-label">后衣长</label>
                          <div class="col-sm-2">
                              <input type="number" class="form-control" id="hycNum" placeholder="后衣长" />
                          </div>
                          <label class="col-sm-1 control-label">裙长</label>
                          <div class="col-sm-2">
                              <input type="number" class="form-control" id="qcNum" placeholder="裙长" />
                          </div>
                      </div>
                      <div class="form-group form-group-sm">
                          <label class="col-sm-2 control-label">胸围</label>
                          <div class="col-sm-2">
                              <input type="number" class="form-control" id="xwNum" placeholder="胸围" />
                          </div>
                          <label class="col-sm-1 control-label">腰围</label>
                          <div class="col-sm-2">
                              <input type="number" class="form-control" id="ywNum" placeholder="腰围" />
                          </div>
                      </div>
                      <div class="form-group form-group-sm">
                          <label class="col-sm-2 control-label">下摆</label>
                          <div class="col-sm-2">
                              <input type="number" class="form-control" id="xbNum" placeholder="下摆" />
                          </div>
                          <label class="col-sm-1 control-label">臀围</label>
                          <div class="col-sm-2">
                              <input type="number" class="form-control" id="twNum" placeholder="臀围" />
                          </div>
                      </div>
                      <div class="form-group form-group-sm">
                          <label class="col-sm-2 control-label">肩宽</label>
                          <div class="col-sm-2">
                              <input type="number" class="form-control" id="jkNum" placeholder="肩宽" />
                          </div>
                          <label class="col-sm-1 control-label">横档</label>
                          <div class="col-sm-2">
                              <input type="number" class="form-control" id="hdNum" placeholder="横档" />
                          </div>
                      </div>
                      <div class="form-group form-group-sm">
                          <label class="col-sm-2 control-label">袖长</label>
                          <div class="col-sm-2">
                              <input type="number" class="form-control" id="xcNum" placeholder="袖长" />
                          </div>
                          <label class="col-sm-1 control-label">中档</label>
                          <div class="col-sm-2">
                              <input type="number" class="form-control" id="zdNum" placeholder="中档" />
                          </div>
                      </div>
                      <div class="form-group form-group-sm">
                          <label class="col-sm-2 control-label">袖口</label>
                          <div class="col-sm-2">
                              <input type="number" class="form-control" id="xkNum" placeholder="袖口" />
                          </div>
                          <label class="col-sm-1 control-label">裤脚口</label>
                          <div class="col-sm-2">
                              <input type="number" class="form-control" id="kjkNum" placeholder="裤脚口" />
                          </div>
                      </div>
                      <div class="form-group form-group-sm">
                          <label class="col-sm-2 control-label">上袖肥</label>
                          <div class="col-sm-2">
                              <input type="number" class="form-control" id="sxfNum" placeholder="上袖肥" />
                          </div>
                          <label class="col-sm-1 control-label">直档</label>
                          <div class="col-sm-2">
                              <input type="number" class="form-control" id="zhidNum" placeholder="直档" />
                          </div>
                      </div>
                      <div class="form-group form-group-sm">
                          <label class="col-sm-2 control-label">下袖肥</label>
                          <div class="col-sm-2">
                              <input type="number" class="form-control" id="xxfNum" placeholder="下袖肥" />
                          </div>
                          <label class="col-sm-1 control-label">前胸宽</label>
                          <div class="col-sm-2">
                              <input type="number" class="form-control" id="qxkNum" placeholder="前胸宽" />
                          </div>
                      </div>
                      <div class="form-group form-group-sm">
                          <label class="col-sm-2 control-label">后背宽</label>
                          <div class="col-sm-2">
                              <input type="number" class="form-control" id="hbkNum" placeholder="后背宽" />
                          </div>
                          <label class="col-sm-1 control-label">胸距</label>
                          <div class="col-sm-2">
                              <input type="number" class="form-control" id="xjNum" placeholder="胸距" />
                          </div>
                      </div>
                      <div class="form-group form-group-sm">
                          <label class="col-sm-2 control-label">胸高</label>
                          <div class="col-sm-2">
                              <input type="number" class="form-control" id="xgNum" placeholder="胸高" />
                          </div>
                          <label class="col-sm-1 control-label">领围</label>
                          <div class="col-sm-2">
                              <input type="number" class="form-control" id="lwNum" placeholder="领围" />
                          </div>
                      </div>
                      <div class="form-group">
                          <label class="col-sm-2 control-label" for="formGroupInputSmall"></label>
                          <div class="col-sm-5"><button type="button" id="formSubmit" class="btn btn-success btn-lg">提交</button></div>
                       </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>
<script>
$(function () {
    $(".datepicker").datepicker({
        language: "zh-CN",
        autoclose: true,//选中之后自动隐藏日期选择框
        clearBtn: true,//清除按钮
        todayBtn : "linked",//今日按钮
        todayHighlight : true,
        setStartDate : '2012-01-01',
        startDate : new Date() ,
        format: "yyyy-mm-dd"//日期格式，详见 http://bootstrap-datepicker.readthedocs.org/en/release/options.html#format
    });
    /**
    $("input").each(function(){
        $(this).attr("disabled",true);
    });**/
    $('a').click(function(){
        $("a").attr("class","btn btn-default");
        $(this).attr("class","btn btn-primary");
    });
    $('#customerSex1').click(function(){
        $('#customerSex2').prop("checked",false);
    });
    $('#bodyStatus1').click(function(){
        $('#bodyStatus2').prop("checked",false);
    });
    $('#sendStatus2').click(function(){
        $('#bodyStatus1').prop("checked",false);
    });
    $('#formSubmit').bind('click', function(){
        var data = eval('({})');
        $("input").each(function(){
            if($(this).attr('type') == 'checkbox' && $(this).attr('checked')){
                var key = $(this).attr('name');
                data[key] = $(this).val();
                return true;
            }else {
                var key = $(this).attr('id');
                data[key] = $(this).val();
            }
        });
        var typeVal = $("a[class='btn btn-primary']").attr("data");
        data['type'] = typeVal;
        console.log(data);
        postAsync('${ctx}/product/add',data,function(result){
            console.log(result);
            if(result.success){
                swal("提示！", "下单成功!", "success");
                $("input").each(function(){
                    $(this).val("");
                });
            }else{
                swal("提示！", result.msg, "error");
            }
        });
    });

});
</script>
</body>
</html>
