document.title="SAMSUNG Developer Portal"; // title

function pop(url,name,w,h) { window.open(url,name,'width='+w+',height='+h+',scrollbars=auto'); } // Popup()
function pops(url,name,w,h) { window.open(url,name,'width='+w+',height='+h+',scrollbars=yes,resizable=no'); } // Popup()

function flashAM(URL,width,height,vars,bgColor,winmode) { //÷ 

	var id=URL.split("/")[URL.split("/").length-1].split(".")[0];
	if(vars==null) vars='';
	if(bgColor==null) bgColor='#FFFFFF';
	if(winmode==null) winmode='opaque';

	document.write("	<object classid='clsid:d27cdb6e-ae6d-11cf-96b8-444553540000' codebase='http://fpdownload.macromedia.com/pub/shockwave/cabs/flash/swflash.cab#version=8,0,0,0' "); 
	document.write("		width='"+width+"' height='"+height+"' id='"+id+"' align='middle'> ");
	document.write("	<param name='allowScriptAccess' value='sameDomain' /> ");
	document.write("	<param name='movie'	value='"+URL+"' /> ");
	document.write("	<param name='FlashVars'		alue='"+vars+"' /> ");
	document.write("	<param name='wmode'	value='"+winmode+"' /> ");
	document.write("	<param name='menu'			value='false' /> ");
	document.write("	<param name='quality'		value='high' /> ");
	document.write("	<param name='bgcolor'	value='"+bgColor+"' /> ");
	document.write("	<embed src='"+URL+"' flashVars='"+vars+"' wmode='"+winmode+"' menu='false' quality='high' ");
	document.write("		bgcolor='"+bgColor+"' width='"+width+"' height='"+height+"' name='"+id+"' align='middle' ");
	document.write("		allowScriptAccess='sameDomain' type='application/x-shockwave-flash' pluginspage='http://www.macromedia.com/go/getflashplayer' /> ");
	document.write("	</object> ");
}

function setPng24(obj) { //ie6 png̹
	obj.width=obj.height=1; 
	obj.className=obj.className.replace(/\bpng24\b/i,''); 
	obj.style.filter = "progid:DXImageTransform.Microsoft.AlphaImageLoader(src='"+ obj.src +"',sizingMethod='image');";
	obj.src='';  
	return ''; 
}

/* ie 6.0 background  flicker   */
try {
  document.execCommand('BackgroundImageCache', false, true);
} catch(e) {}



//DOCUMENT LEFT MENU SCRIPT
function ShowMenu()
	{
		document.getElementById("localMenuTd").style.display ="block";
		document.getElementById("viewHideMenu").style.display ="block";
		document.getElementById("viewShowMenu").style.display ="none";
		document.getElementById("contentsTd").style.paddingLeft ="35px";
	}
	
function HideMenu()
	{
		document.getElementById("localMenuTd").style.display ="none";
		document.getElementById("viewHideMenu").style.display ="none";
		document.getElementById("viewShowMenu").style.display ="block";
		document.getElementById("contentsTd").style.paddingLeft ="0px";
	}

//doc tab
function View_List(idx)
	{
		var maxidx =8; //리스트최대값
		for(var i = 1 ; i <= maxidx ; i++)
			{
				if(i == idx)
					{
						document.getElementById("ContentList_"+i).style.display ="block";
						document.getElementById("SelectCell_"+i).style.backgroundColor="#F3F7FB";
					}
				else 
					{
						document.getElementById("ContentList_"+i).style.display ="none";
						document.getElementById("SelectCell_"+i).style.backgroundColor="#ffffff";
					}
			}
		
	}


