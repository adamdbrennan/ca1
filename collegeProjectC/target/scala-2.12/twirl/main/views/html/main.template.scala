
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(pagename: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""<!DOCTYPE html>
<html>
	<head>
		<title>"""),_display_(/*5.11*/pagename),format.raw/*5.19*/("""</title>

		<style>
			body """),format.raw/*8.9*/("""{"""),format.raw/*8.10*/("""
				"""),format.raw/*9.5*/("""padding:0;
				margin:0;
				background:#f1f2f7;
			"""),format.raw/*12.4*/("""}"""),format.raw/*12.5*/("""
			"""),format.raw/*13.4*/("""navbar """),format.raw/*13.11*/("""{"""),format.raw/*13.12*/("""
				"""),format.raw/*14.5*/("""justify-content:center;
				align-items:center;
				display:flex;
				width:100%;
				height:50px;
				background-color:white;
				box-shadow: 0px 2px rgba(0,0,0,0.1);
				font-size:1em;
				margin-bottom:10px;
			"""),format.raw/*23.4*/("""}"""),format.raw/*23.5*/("""
			"""),format.raw/*24.4*/("""navbar #contents """),format.raw/*24.21*/("""{"""),format.raw/*24.22*/("""
				"""),format.raw/*25.5*/("""display:flex;
				align-items:center;
				width:80%;
			"""),format.raw/*28.4*/("""}"""),format.raw/*28.5*/("""
			"""),format.raw/*29.4*/("""navbar #contents #logo """),format.raw/*29.27*/("""{"""),format.raw/*29.28*/("""
				"""),format.raw/*30.5*/("""font-weight:bold;
				font-size:1.3em;
			"""),format.raw/*32.4*/("""}"""),format.raw/*32.5*/("""
		"""),format.raw/*33.3*/("""</style>
	</head>

	<body>
		<navbar>
			<div id="contents">
				<span id="logo">CompanyName</span>
				<div style="margin-left:auto;">
					<a href="logout">Log Out</a>
				</div>
			</div>
		</navbar>
	</body>
	"""),_display_(/*46.3*/content),format.raw/*46.10*/("""
"""),format.raw/*47.1*/("""</html>"""))
      }
    }
  }

  def render(pagename:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(pagename)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (pagename) => (content) => apply(pagename)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Mar 18 22:47:13 CET 2019
                  SOURCE: /root/collegeProjectC/app/views/main.scala.html
                  HASH: de613ce854908eaff874e2ac3ec3d3cc03e490a4
                  MATRIX: 952->1|1079->35|1146->76|1174->84|1228->112|1256->113|1287->118|1366->170|1394->171|1425->175|1460->182|1489->183|1521->188|1762->402|1790->403|1821->407|1866->424|1895->425|1927->430|2010->486|2038->487|2069->491|2120->514|2149->515|2181->520|2250->562|2278->563|2308->566|2548->780|2576->787|2604->788
                  LINES: 28->1|33->2|36->5|36->5|39->8|39->8|40->9|43->12|43->12|44->13|44->13|44->13|45->14|54->23|54->23|55->24|55->24|55->24|56->25|59->28|59->28|60->29|60->29|60->29|61->30|63->32|63->32|64->33|77->46|77->46|78->47
                  -- GENERATED --
              */
          