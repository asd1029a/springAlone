<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<%@include file="../includes/header.jsp"%>

            <div class="row">
                <div class="col-lg-12">
                    <h1 class="page-header">Board Read</h1>
                </div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
            <div class="row">
                <div class="col-lg-12">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            Board Read Page
                        </div>
                        <!-- /.panel-heading -->
                        <form role="form" action="/board/modify" method="post">
                        <div class="form-group">
                        	<label>Bno</label> <input class="form-control" name="bno" value="${board.bno}" readonly>
                        </div>
                        <div class="form-group">
                        	<label>Title</label> <input class="form-control" name="title" value="${board.title}">
                        </div>
                        <div class="form-group">
                        	<label>Text area</label> <textarea rows="3" class="form-control" name="content">${board.content} </textarea>
                        </div>
                         <div class="form-group">
                        	<label>Writer</label> <input class="form-control" name="writer" value="${board.writer}" readonly>
                        </div>
                         <div class="form-group">
                        	<label>Regdate</label> <input class="form-control" name="regdate" value='<fmt:formatDate pattern="yyyy/MM/dd" value="${board.regdate}"/>' readonly>
                        </div>
                         <div class="form-group">
                        	<label>Update Date</label> <input class="form-control" name="updateDate" value='<fmt:formatDate pattern="yyyy/MM/dd" value="${board.updateDate}"/>' readonly>
                        </div>
                        <button type='submit' data-oper='modify' class="btn btn-default">Modify</button>
                        <button type='submit' data-oper='remove' class="btn btn-danger" >Remove</button>
                        <button type='submit' data-oper='list' class="btn btn-info">List</button>
                        <!-- /.panel-body -->
                        </form>
                    </div>
                    <!-- /.panel -->
                </div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
            <script type="text/javascript">
            $(document).ready(function(){
            	var formObj = $("form");
            	
            	$('button').on("click",function(e){
            		e.preventDefault();
            		
            		var operation = $(this).data("oper");
            		
            		console.log(operation);
            		
            		if(operation === 'remove'){
            			formObj.attr("action","/board/remove");
            		}else if(operation === 'list'){
            			formObj.attr("action","/board/list").attr("method","get");
            			formObj.empty();
            		}
            		formObj.submit();
            	})
            })
            </script>
<%@include file="../includes/footer.jsp" %>
  