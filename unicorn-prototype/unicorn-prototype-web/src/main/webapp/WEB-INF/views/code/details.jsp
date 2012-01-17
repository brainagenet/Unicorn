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

    <table class="pageTitleH3Table pageTitleH3TableTop" style="width: 700px;">
        <tr>
            <td class="pageTitleH3TdLeft"><h3 class="pageTitleH3">Code Detail</h3></td>
            <td class="pageTitleH3TdRight">
                <table style="float: right;">
                    <tr>
                        <td><table class="btnTypeE"><tr><td><a href="<c:url value="/app/code/10/edit" />">Modify</a></td></tr></table></td>
                        <td class="btnStylePadd"></td>
                        <td><table class="btnTypeE"><tr><td><a href="#">Delete</a></td></tr></table></td>
                    </tr>
                </table>
            </td>
        </tr>
    </table>

    <table class="tableDataGrid" style="width: 700px;">
        <tr>
            <th width="126">Content Type :</th>
            <td width="574">Application</td>
        </tr>
        <tr>
            <th>Use :</th>
            <td>Use</td>
        </tr>
        <tr>
            <th>Description :</th>
            <td>Ex) Application관련 Content 를 입력할 때 사용 되는 Content Type 이다. <br /> Download와
                미리보기(image)를 지원 가능하다.<br />
            </td>
        </tr>
    </table>

    <table class="pageTitleH3Table" style="width: 700px;">
        <tr>
            <td class="pageTitleH3TdLeft"><h3 class="pageTitleH3">Code Mapping</h3></td>
            <td class="pageTitleH3TdRight">
                <table style="float: right;">
                    <tr>
                        <td><table class="btnTypeE"><tr><td><a href="#">New</a></td></tr></table></td>
                        <td class="btnStylePadd"></td>
                        <td><table class="btnTypeF"><tr><td><a href="#">Modify</a></td></tr></table></td>
                        <td class="btnStylePadd"></td>
                        <td><table class="btnTypeF"><tr><td><a href="#">Delete</a></td></tr></table></td>
                        <td class="btnStylePadd"></td>
                        <td><table class="btnTypeF"><tr><td><a href="#">Order</a></td></tr></table></td>
                    </tr>
                </table>
            </td>
        </tr>
    </table>

    <table class="tableListGrid" style="width: 700px;">
        <thead>
            <tr>
                <th width="40"><input type="checkbox" /></th>
                <th width="50">NO.</th>
                <th width="80">Code ID</th>
                <th width="100">Code Name</th>
                <th>Description</th>
                <th width="60">Status</th>
                <th width="110" class="thLineEnd">Created On</th>
            </tr>
        </thead>
        <tbody>
            <tr>
                <td><input type="checkbox" /></td>
                <td>10</td>
                <td class="dataLeft"><a href="<c:url value="/app/code/10" />">OMP</a></td>
                <td class="dataLeft"><a href="<c:url value="/app/code/10" />">TV Seller</a></td>
                <td class="dataLeft">seller who sells TVs.</td>
                <td>Active</td>
                <td>2012-01-05 15:00</td>
            </tr>
            <tr class="tableTr_r">
                <td><input type="checkbox" /></td>
                <td>10</td>
                <td class="dataLeft"><a href="<c:url value="/app/code/10" />">OMP</a></td>
                <td class="dataLeft"><a href="<c:url value="/app/code/10" />">TV Seller</a></td>
                <td class="dataLeft">seller who sells TVs.</td>
                <td>Active</td>
                <td>2012-01-05 15:00</td>
            </tr>
        </tbody>
    </table>

</body>

</html>
