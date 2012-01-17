<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

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
    
    <!--Main Start-->
    <table class="pageTitleH3Table pageTitleH3TableTop">
        <tr>
            <td width="700" class="pageTitleH3TdLeft"><h3 class="pageTitleH3">Select Search condition</h3></td>
        </tr>
    </table>

    <table class="tableSearchBox" style="width: 700px;">
        <tr>
            <td class="tableSearchTdBox">
                <table class="tableSearchCont">
                    <tr>
                        <th width="100">Application</th>
                        <td width="126"><select style="width: 100px;">
                                <option>ALL</option>
                                <option>OMP</option>
                                <option>LC</option>
                        </select></td>
                        <th width="100">Type Status</th>
                        <td width="126"><select style="width: 100px;">
                                <option>ALL</option>
                                <option>Active</option>
                                <option>Inactive</option>
                        </select></td>
                        <th width="100">Type Name</th>
                        <td width="126"><input type="text" class="inputText"
                            style="width: 100px;" value="seller" /></td>
                        <td width="98" align="right"><a href="#"><img src="<c:url value="/images/common/btn/btn_search2.gif" />" alt="search" /></a></td>
                    </tr>
                </table>
            </td>
        </tr>
    </table>

    <table class="pageTitleH3Table pageTitleH3TableTop" style="width: 700px;">
        <tr>
            <td class="pageTitleH3TdRight">
                <table style="float: right;">
                    <tr>
                        <td><table class="btnTypeE"><tr><td><a href="<c:url value="/app/code/new" />">Create Code</a></td></tr></table></td>
                        <td class="btnStylePadd"></td>
                        <td><table class="btnTypeF"><tr><td><a href="#">Modify</a></td></tr></table></td>
                        <td class="btnStylePadd"></td>
                        <td><table class="btnTypeF"><tr><td><a href="#">Delete</a></td></tr></table></td>
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
                <td>9</td>
                <td class="dataLeft">OMP</td>
                <td class="dataLeft"><a href="#">TV Seller</a></td>
                <td class="dataLeft">Seller who sells phones.</td>
                <td>Active</td>
                <td>2012-01-05 15:00</td>
            </tr>
            <tr>
                <td><input type="checkbox" /></td>
                <td>8</td>
                <td class="dataLeft">OMP</td>
                <td class="dataLeft"><a href="#">MMORPG</a></td>
                <td class="dataLeft">Seller who sells game applications</td>
                <td>Active</td>
                <td>2012-01-05 15:00</td>
            </tr>
            <tr class="tableTr_r">
                <td><input type="checkbox" /></td>
                <td>7</td>
                <td class="dataLeft">OMP</td>
                <td class="dataLeft"><a href="#">Computer Seller</a></td>
                <td class="dataLeft">Seller who sells computers</td>
                <td>Active</td>
                <td>2012-01-05 15:00</td>
            </tr>
            <tr>
                <td><input type="checkbox" /></td>
                <td>6</td>
                <td class="dataLeft">OMP</td>
                <td class="dataLeft"><a href="#">Book Seller</a></td>
                <td class="dataLeft">Seller who sells books</td>
                <td class="c-c60000">Inactive</td>
                <td>2012-01-05 15:00</td>
            </tr>
            <tr class="tableTr_r">
                <td><input type="checkbox" /></td>
                <td>5</td>
                <td class="dataLeft">OMP</td>
                <td class="dataLeft"><a href="#">Computer Seller</a></td>
                <td class="dataLeft">Seller who sells cosmetic</td>
                <td>Active</td>
                <td>2012-01-05 15:00</td>
            </tr>
            <tr>
                <td><input type="checkbox" /></td>
                <td>4</td>
                <td class="dataLeft">OMP</td>
                <td class="dataLeft"><a href="#">Utility Seller</a></td>
                <td class="dataLeft">Seller who sells software utilities</td>
                <td>Active</td>
                <td>2012-01-05 15:00</td>
            </tr>
            <tr class="tableTr_r">
                <td><input type="checkbox" /></td>
                <td>3</td>
                <td class="dataLeft">LC</td>
                <td class="dataLeft"><a href="#">Chat</a></td>
                <td class="dataLeft">Seller who sells chat applications</td>
                <td class="c-c60000">Inactive</td>
                <td>2012-01-05 15:00</td>
            </tr>
            <tr>
                <td><input type="checkbox" /></td>
                <td>2</td>
                <td class="dataLeft">LC</td>
                <td class="dataLeft"><a href="#">Social Group Seller</a></td>
                <td class="dataLeft">Manager who manage the social community</td>
                <td>Active</td>
                <td>2012-01-05 15:00</td>
            </tr>
            <tr class="tableTr_r">
                <td><input type="checkbox" /></td>
                <td>1</td>
                <td class="dataLeft">LC</td>
                <td class="dataLeft"><a href="#">Any Seller</a></td>
                <td class="dataLeft">……..</td>
                <td>Active</td>
                <td>2012-01-05 15:00</td>
            </tr>
        </tbody>
    </table>

    <table class="tablePaging" style="width: 700px">
        <tr>
            <td><a href="#"><img src="<c:url value="/images/common/btn/btn_page_first.gif" />" alt="" /></a> <a
                href="#"><img src="<c:url value="/images/common/btn/btn_page_back.gif" />" alt="" /></a> <span
                class="pagingSelected">1</span> <span>|</span> <span><a href="#">2</a></span> <span>|</span>
                <span><a href="#">3</a></span> <span>|</span> <span><a href="#">4</a></span> <span>|</span>
                <span><a href="#">5</a></span> <span>|</span> <span><a href="#">6</a></span> <span>|</span>
                <span><a href="#">7</a></span> <span>|</span> <span><a href="#">8</a></span> <span>|</span>
                <span><a href="#">9</a></span> <span>|</span> <span><a href="#">10</a></span> <a
                href="#"><img src="<c:url value="/images/common/btn/btn_page_next.gif" />" alt="" /></a> <a
                href="#"><img src="<c:url value="/images/common/btn/btn_page_end.gif" />" alt="" /></a></td>
        </tr>
    </table>


</body>

</html>
