<%--
  Created by IntelliJ IDEA.
  User: Liu_King
  Date: 2022-3-4
  Time: 10:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div class="left-arrow">
    <ul>
        <c:choose>
            <c:when test="${stu_user.stu_type == 0}">
                <li>
                    <span class="fa fa-user-o"></span>
                    <a href="/user?action=page&pageIndex=1&pageSize=10">用户信息管理</a>
                </li>
                <li>
                    <span class="fa fa-book"></span>
                    <a href="/project?action=page&pageIndex=1&pageSize=10">考试科目管理</a>
                </li>
                <li>
                    <span class="fa fa-cogs"></span>
                    <a href="/type?action=page&pageIndex=1&pageSize=10">考试类别管理</a>
                </li>
            </c:when>
            <c:when test="${stu_user.stu_type == 1}">
                <li>
                    <span class="fa fa-building-o"></span>
                    <a href="/grade?action=page&pageIndex=1&pageSize=10">年级信息管理</a>
                </li>
                <li>
                    <span class="fa fa-child"></span>
                    <a href="/student?action=page&pageIndex=1&pageSize=10">学生信息管理</a>
                </li>
                <li>
                    <span class="fa fa-exam"></span>
                    <a href="/exam?action=page&pageIndex=1&pageSize=10">考试信息管理</a>
                </li>
            </c:when>
        </c:choose>
    </ul>
</div>