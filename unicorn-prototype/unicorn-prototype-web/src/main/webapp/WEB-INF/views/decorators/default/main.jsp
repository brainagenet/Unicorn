<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>

<html>

<head>
    <meta charset="UTF-8">
    <meta http-equiv="Imagetoolbar" content="no" />
    <meta http-equiv="X-UA-Compatible" content="IE=EmulateIE7" />
    <link href="<c:url value="/images/favicon.ico" />" rel="shortcut icon" type="image/x-icon" />
    <link rel="stylesheet" href="<c:url value="/css/inc/layoutBaseComponent.css" />" type="text/css"  media="screen" />
    <link rel="stylesheet" href="<c:url value="/css/inc/base.css" />" type="text/css"  media="screen" />
    <link rel="stylesheet" href="<c:url value="/css/inc/tableGrid.css" />" type="text/css"  media="screen" />
    <link rel="stylesheet" href="<c:url value="/css/inc/font.css" />" type="text/css"  media="screen" />
    <link rel="stylesheet" href="<c:url value="/css/osp_ui.css" />" type="text/css"  media="screen" />
    <link rel="stylesheet" href="<c:url value="/css/inc/print.css" />" type="text/css"  media="print" />
    <!--
    <script src="<c:url value="/js/ui.js" />" type="text/javascript" charset="utf-8"></script>
    <script src="<c:url value="/js/osp_ui.js" />" type="text/javascript" charset="utf-8"></script>
    -->
    <title>:: Unicorn Prototype - brainage.net ::</title>
    <decorator:head />
</head>

<body>

<div id="naviMain">
    <h1>Unicorn Prototype</h1>
    <div class="naviMenu">
        <ul>
            <li class="first"><a href="#">Billing</a></li>
            <li><a href="#">Location </a></li>
            <li><a href="#">Social</a></li>
            <li><a href="#">Content</a></li>
            <li><a href="#">Context</a></li>
            <li><a href="#">Analysis</a></li>
            <li><a href="#">Advertisement</a></li>
            <li><a href="#" class="naviMenuSelected">Administrator</a></li>
        </ul>
    </div>
</div>

<div id="contentsWrap">
    <div id="contentsWrapDiv">
        <!--leftMenu-->
        <div class="naviLocal">
            <h3 class="localTitle"><span>Social</span></h3>
            <div class="localMenuList">
                <ul class="localDepth01List">
                    <li><a href="#" class="selectedDepth01">Profile</a>
                    <!--depth02-->                                                         
                        <ul class="localDepth02List">                                        
                            <li><a href="#" class="selectedDepth02">Customer Type Management</a></li>                        
                            <li><a href="#">Meta Management</a></li>
                        </ul>                                                                
                    <!--//depth02-->
                    </li>
                    <li><a href="#">Workspace</a></li>
                    <li><a href="#">Group</a></li>
                </ul>
                <div class="leftBanner"><!-- <a href="#"><img src="<c:url value="/images/common/layout/banner_left1.gif" />" alt="" /></a> --></div>
            </div>
        </div>
        <!--//leftMenu-->
        
        <!--contentsPrint-->
        <div class="contentsPrint">
            <decorator:body />
        </div>
        <!--//contentsPrint-->
    </div>
</div>

<div id="siteInfo">
    <div class="footerWrap">
        <div class="footerLogo"><img src="<c:url value="/images/common/layout/footer_logo.gif" />" alt="SAMSUNG" /></div>
        <div class="footerCopyright">All contents copyright ⓒ Samsung Electronics Co.Ltd.</div>
    </div>
</div>

</body>

</html>
