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
                        <div class="form-group">
                        	<label>Bno</label> <input class="form-control" name="bno" value="${board.bno}" readonly>
                        </div>
                        <div class="form-group">
                        	<label>Title</label> <input class="form-control" name="title" value="${board.title}" readonly>
                        </div>
                        <div class="form-group">
                        	<label>Text area</label> <textarea rows="3" class="form-control" name="content" readonly>${board.content} </textarea>
                        </div>
                         <div class="form-group">
                        	<label>Writer</label> <input class="form-control" name="writer" value="${board.writer}" readonly>
                        </div>
                        <button data-oper='modify' class="btn btn-default" onclick="location.href='/board/modify?bno=${board.bno}'">Modify</button>
                        <button data-oper='list' class="btn btn-info" onclick="location.href='/board/list'">List</button>
                        <!-- /.panel-body -->
                        <form id='operForm' action="/board/modify" method="get">
                        	<input type="hidden" id="bno" name="bno" value="${board.bno}">
                        </form>
                    </div>
                    <!-- /.panel -->
                </div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
            <script type="text/javascript">
            	$(document).ready(function(){
            		var operForm = $("#operForm");
            		$("button[data-oper='modify']").on("click",function(e){
            			operForm.attr("action","/board/modify").submit();
            		});
            		$("button[data-oper='list']").on("click",function(e){
            			operForm.find("#bno").remove();
            			operForm.attr("action","/board/list");
            			operForm.submit();
            		});
            	})
            </script>
<%@include file="../includes/footer.jsp" %>
  