<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>

<head>

</head>

<body>

    <div class="sitePath">
        <ul>
            <li class="pathHome"><a href="<c:url value="/app/home" />">Home</a></li>
            <li><a href="#">Administrator</a></li>
            <li><a href="#">Commons</a></li>
            <li class="pathSelected">Code Management</li>
        </ul>
    </div>

    <h1 class="pageTitleH1">Code Management</h1>

    <h3 class="pageTitleH3">코드 수정</h3>

    <table class="tableDataGrid" style="width: 700px;">
        <tr>
            <th width="136"><span class="c-c60000 txtNormal">*</span>User</th>
            <td width="560"><input type="text" style="width: 543px;" class="inputText" /></td>
        </tr>
        <tr>
            <th><span class="c-c60000 txtNormal">*</span>User Name</th>
            <td><input type="text" style="width: 543px;" class="inputText" /></td>
        </tr>
        <tr>
            <th><span class="c-c60000 txtNormal">*</span>Company Name</th>
            <td><input type="text" style="width: 543px;" class="inputText" /></td>
        </tr>
        <tr>
            <th><span class="c-c60000 txtNormal">*</span>Division Name</th>
            <td><input type="text" style="width: 543px;" class="inputText" /></td>
        </tr>
        <tr>
            <th>Telephone Number</th>
            <td><input type="text" style="width: 543px;" class="inputText" /></td>
        </tr>
        <tr>
            <th>E-mail Address</th>
            <td><input type="text" style="width: 543px;" class="inputText" /></td>
        </tr>
        <tr>
            <th>Creator</th>
            <td><b>Cheolmin Yu</b> (2009-02-10, 13:00:00)</td>
        </tr>
        <!--
        <tr>
            <th>Modifier</th>
            <td>&nbsp;</td>
        </tr>
        -->
    </table>

    <table class="tableBtn" style="width: 700px;">
        <tr>
            <td align="left">
                <table><tr><td><table class="btnTypeC"><tr><td><a href="<c:url value="/app/code/list" />">List</a></td></tr></table></td></tr></table>
            </td>
            <td align="right">
                <table>
                    <tr>
                        <td><table class="btnTypeC"><tr><td><a href="#">Delete</a></td></tr></table></td>
                        <td class="btnStylePadd"></td>
                        <td><table class="btnTypeC"><tr><td><a href="#">Save</a></td></tr></table></td>
                    </tr>
                </table>
            </td>
        </tr>
    </table>

</body>

</html>
