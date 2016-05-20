<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<!-- saved from url=(0029)http://hackerzhou.me/ex_love/ -->
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en"><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Our Love Story</title>
	
	<style type="text/css">
		@font-face {
			font-family: digit;
			src: url('digital-7_mono.ttf') format("truetype");
		}
	</style>
	<link href="./css/default.css" type="text/css" rel="stylesheet">
	<script type="text/javascript" src="./js/jquery.js"></script>
	<script type="text/javascript" src="./js/garden_dev.js"></script>
    <script type="text/javascript" src="./js/functions_dev.js"></script>
</head>

<body>
	<div id="mainDiv">
		<div id="content" style="width: 1110px; height: 625px; margin-top: 10px; margin-left: 157px;">
			<div id="code" style="margin-top: 112.5px;">
				<span class="comments">/**</span><br>
				<span class="space"><span class="comments">* We are both Fudan SSers and programmers,</span><br>
				<span class="space"><span class="comments">* so I write some code to celebrate our 1st anniversary.</span><br>
				<span class="space"><span class="comments">*/</span><br>
				Boy i = <span class="keyword">new</span> Boy(<span class="string">"hackerzhou"</span>);<br>
				Girl u = <span class="keyword">new</span> Girl(<span class="string">"MaryNee"</span>);<br>
				<span class="comments">// Nov 2, 2010, I told you I love you. </span><br>
				i.love(u);<br>
				<span class="comments">// Luckily, you accepted and became my girlfriend eversince.</span><br>
				u.accepted();<br>
				<span class="comments">// Since then, I miss u every day.</span><br>
				i.miss(u);<br>
				<span class="comments">// And take care of u and our love.</span><br>
				i.takeCareOf(u);<br>
				<span class="comments">// You say that you won't be so easy to marry me.</span><br>
				<span class="comments">// So I keep waiting and I have confidence that you will.</span><br>
				<span class="keyword">boolean</span> isHesitate = <span class="keyword">true</span>;<br>
				<span class="keyword">while</span> (isHesitate) {<br>
				<span class="placeholder">i.waitFor(u);<br>
				<span class="placeholder"><span class="comments">// I think it is an important decision</span><br>
				<span class="placeholder"><span class="comments">// and you should think it over.</span><br>
				<span class="placeholder">isHesitate = u.thinkOver();<br>
				}<br>
				<span class="comments">// After a romantic wedding, we will live happily ever after.</span><br>
				i.marry(u);<br>
				i.liveHappilyWith(u);<br>
			</span></span></span></span></span></span></span>_</div>
			<div id="loveHeart">
				<canvas id="garden" width="670" height="625"></canvas>
				<div id="words" style="position: absolute; top: 205px; left: 667px;">
					<div id="messages" style="display: none;">
						Minyue, I have fallen in love with you for
						<div id="elapseClock"><span class="digit">5</span> year <span class="digit">6</span> month <span class="digit">17</span> day <span class="digit">12</span> hr <span class="digit">57</span> min <span class="digit">16</span> sec</div>
					</div>
					<div id="loveu" style="display: none;">
						Love u forever and ever.<br>
						<div class="signature">- hackerzhou</div>
					</div>
				</div>
			</div>
		</div>
		<div id="copyright">
			Inspired by <a href="http://www.openrise.com/lab/FlowerPower/">FlowerPower</a> project.<br>
			Copyright © 2016 <a href="http://hackerzhou.me/">wangzhp.me</a> 2016-forever
		</div>
	</div>
	<script type="text/javascript">
		var offsetX = $("#loveHeart").width() / 2;
		var offsetY = $("#loveHeart").height() / 2 - 55;
		var displayMode = 1;
		var together = new Date();
		together.setFullYear(2010, 10, 2);
		together.setHours(20);
		together.setMinutes(0);
		together.setSeconds(0);
		together.setMilliseconds(0);
		
		$("#loveHeart").click(function(){
			displayMode *= -1;
			timeElapse(together, displayMode);
		});
		
		if (!document.createElement('canvas').getContext) {
			var msg = document.createElement("div");
			msg.id = "errorMsg";
			msg.innerHTML = "Your browser doesn't support HTML5!<br/>Recommend use Chrome 14+/IE 9+/Firefox 7+/Safari 4+"; 
			document.body.appendChild(msg);
			$("#code").css("display", "none")
			$("#copyright").css("position", "absolute");
			$("#copyright").css("bottom", "10px");
		    document.execCommand("stop");
		} else {
			setTimeout(function () {
				adjustWordsPosition();
				startHeartAnimation();
			}, 5000);

			timeElapse(together, displayMode);
			setInterval(function () {
				timeElapse(together, displayMode);
			}, 500);

			adjustCodePosition();
			$("#code").typewriter();
		}
	</script>


</body></html>