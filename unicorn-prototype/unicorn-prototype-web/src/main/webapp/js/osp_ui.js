document.title=":: Unicorn Prototype - brainage.net ::"; // title

function fncInit(){}

// document.write('<div id="divCalendar" style="position: absolute;display:none"><iframe id="_iframe-calendar" style="width:166px;height:139px;" src="calender.html" frameborder="0" scrolling="no"></iframe></div>'); 
//document.write('<iframe id="divCalendar" style="position: absolute;display:none;width:166px;height:139px;" src="calender.html" frameborder="0" scrolling="no"></iframe>') 

	function Calendar(para)
	{
		//alert(document.getElementById(para));
		obj = document.getElementById(para);
		target = obj;															
		var point = get_objxy(obj);
		
		with (document.getElementById("divCalendar").style) {
			left = point.x + "px";
			top  = point.y+target.offsetHeight+1+ "px";
			visibility = "visible";
		}		
		//document.getElementById("divCalendar").style.left = 100;
		
		
		document.getElementById("divCalendar").style.display = (document.getElementById("divCalendar").style.display == "block") ? "none" : "block";

		//window.frames["_iframe-calendar"].location.replace("calender.html");
	}
	function closeClendar()
	{
		document.getElementById("divCalendar").style.display = "none" ;
	}
	function get_objxy(aTag){
		var oTmp = aTag;
		var pt = new Point(0,0);
		do {
			pt.x += oTmp.offsetLeft;
			pt.y += oTmp.offsetTop;
			oTmp = oTmp.offsetParent;
		} while(oTmp.tagName!="BODY");
		
		return pt;
	}		
	function Point(iX, iY){
		this.x	= iX;
		this.y	= iY;
	}	

document.write('<div id="interVeil" style="position:absolute;display:none;z-index:998"></div>');
document.write('<div id="divPopup" style="position:absolute;display:none;z-index:999"><iframe id="_iframe-popup" style="width:554px;height:332px;" src="" frameborder="0" scrolling="no"></iframe></div>'); 


	function popupWindow(pType,pFile)
	{
		var pWidth = -1;
		
		getviewpoint();
		viewVeil();
		
		if (pType=="L") pWidth = 690 ;
		if (pType=="M") pWidth = 560 ;
		if (pType=="S") pWidth = 420 ;
		
		document.getElementById("divPopup").style.left = parseInt((docwidth-pWidth)/2)+"px" ;
		document.getElementById("divPopup").style.top = parseInt((docheight-332)/2)+"px" ;
		
		document.getElementById("divPopup").style.display = (document.getElementById("divPopup").style.display == "block") ? "none" : "block";
		
		document.getElementById("_iframe-popup").style.width=pWidth+"px" ;
		document.getElementById("_iframe-popup").src="frame.html?type="+pType+"&file="+pFile;
		
		
	}
	
	function getviewpoint()
	{ //get window viewpoint numbers
		var ie=document.all && !window.opera;
		var domclientWidth=document.documentElement && parseInt(document.documentElement.clientWidth) || 100000; //Preliminary doc width in non IE browsers
		this.standardbody=(document.compatMode=="CSS1Compat")? document.documentElement : document.body; //create reference to common "body" across doctypes
		this.scroll_top=(ie)? this.standardbody.scrollTop : window.pageYOffset;
		this.scroll_left=(ie)? this.standardbody.scrollLeft : window.pageXOffset;
		this.docwidth=(ie)? this.standardbody.clientWidth : (/Safari/i.test(navigator.userAgent))? window.innerWidth : Math.min(domclientWidth, window.innerWidth-16);
		this.docheight=(ie)? this.standardbody.clientHeight: window.innerHeight;
	}	
	


	function viewVeil()
	{
		document.getElementById("interVeil").style.width=docwidth+"px"; //set up veil over page
		document.getElementById("interVeil").style.height=docheight+"px"; //set up veil over page
		document.getElementById("interVeil").style.left=0; //Position veil over page
		document.getElementById("interVeil").style.top=0; //Position veil over page
		document.getElementById("interVeil").style.visibility="visible"; //Show veil over page
		document.getElementById("interVeil").style.display="block"; //Show veil over page
	}
	function closeVeil()
	{
		document.getElementById("interVeil").style.display="none";
	}
	function closePopup()
	{
		document.getElementById("divPopup").style.display = "none";
		closeVeil();
	}
	function closePopupWin()
	{
		this.parent.closePopup();
	}	