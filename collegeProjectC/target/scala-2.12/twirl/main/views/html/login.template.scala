
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

object login extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html>
    <head>
        <title>Login Form</title>

        <style>
            body """),format.raw/*7.18*/("""{"""),format.raw/*7.19*/("""
                """),format.raw/*8.17*/("""background:#f1f2f7;
            """),format.raw/*9.13*/("""}"""),format.raw/*9.14*/("""
            """),format.raw/*10.13*/("""#login-form """),format.raw/*10.25*/("""{"""),format.raw/*10.26*/("""
                """),format.raw/*11.17*/("""justify-content:center;
                background-color:white;
                width:15em;
                margin:0 auto;
                margin-top:20%;
                text-align:center;
                padding-top:0.5em;
                padding-bottom:2em;
                border-radius:2px;
                box-shadow: 0px 5px rgba(0,0,0,0.1);
            """),format.raw/*21.13*/("""}"""),format.raw/*21.14*/("""
            """),format.raw/*22.13*/("""#login-form #title """),format.raw/*22.32*/("""{"""),format.raw/*22.33*/("""
                """),format.raw/*23.17*/("""padding-top:1em;
                padding-bottom:2em;
                font-family:Helvetica;
            """),format.raw/*26.13*/("""}"""),format.raw/*26.14*/("""
            """),format.raw/*27.13*/("""#login-form input[type="text"], #login-form input[type="password"] """),format.raw/*27.80*/("""{"""),format.raw/*27.81*/("""
                """),format.raw/*28.17*/("""border:3px solid rgba(255,255,255,0.1);
                padding:3px;
                font-size:0.9em;
                background-color:#eaeaea;
                border-radius:2px;
                width:80%;
            """),format.raw/*34.13*/("""}"""),format.raw/*34.14*/("""
            """),format.raw/*35.13*/("""#login-form input[type="submit"] """),format.raw/*35.46*/("""{"""),format.raw/*35.47*/("""
                """),format.raw/*36.17*/("""background-color:#f67a6e;
                color:white;
                border:none;
                padding:5px;
                font-size:1em;
                border-radius:4px;
                padding-top:6px;
                padding-bottom:6px;
                padding-left:3px;
                padding-right:3px;
                width:80%;
            """),format.raw/*47.13*/("""}"""),format.raw/*47.14*/("""
        """),format.raw/*48.9*/("""</style>
    </head>

    <body>
        <div id="login-form">
            <form method="get" action="processLogin">
                <div id="title">Authorization Required</div>
                <input type="text" placeholder="Username" name="uname" />
                <br><br>
                <input type="password" placeholder="Password" name="pass" />
                <br><br><br>

                <input type="submit" value="Login" />
            </form>
    </body>
</html>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Mar 18 22:54:06 CET 2019
                  SOURCE: /root/collegeProjectC/app/views/login.scala.html
                  HASH: 54d7c52ef9db301a2a27d63a92baac343931febb
                  MATRIX: 1030->0|1159->102|1187->103|1231->120|1290->152|1318->153|1359->166|1399->178|1428->179|1473->196|1862->557|1891->558|1932->571|1979->590|2008->591|2053->608|2185->712|2214->713|2255->726|2350->793|2379->794|2424->811|2670->1029|2699->1030|2740->1043|2801->1076|2830->1077|2875->1094|3259->1450|3288->1451|3324->1460
                  LINES: 33->1|39->7|39->7|40->8|41->9|41->9|42->10|42->10|42->10|43->11|53->21|53->21|54->22|54->22|54->22|55->23|58->26|58->26|59->27|59->27|59->27|60->28|66->34|66->34|67->35|67->35|67->35|68->36|79->47|79->47|80->48
                  -- GENERATED --
              */
          