
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
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.data._
import play.core.j.PlayFormsMagicForJava._
import scala.jdk.CollectionConverters._

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
  def apply/*7.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*8.1*/("""
"""),format.raw/*9.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        """),format.raw/*12.62*/("""
        """),format.raw/*13.9*/("""<title>"""),_display_(/*13.17*/title),format.raw/*13.22*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*14.54*/routes/*14.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*14.101*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*15.59*/routes/*15.65*/.Assets.versioned("images/favicon.png")),format.raw/*15.104*/("""">
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
		<!--loader -->
		<script src="loading-spinner.js"></script>
		 <script src=""""),_display_(/*21.18*/routes/*21.24*/.Assets.versioned("javascripts/loading-spinner.js")),format.raw/*21.75*/("""" type="text/javascript"></script>
    </head>
    <body>
        """),format.raw/*25.32*/("""
        """),_display_(/*26.10*/content),format.raw/*26.17*/("""

        """),format.raw/*28.9*/("""<script src=""""),_display_(/*28.23*/routes/*28.29*/.Assets.versioned("javascripts/main.js")),format.raw/*28.69*/("""" type="text/javascript"></script>
    </body>
</html>
"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-12-22T21:12:22.950849
                  SOURCE: /Users/manikhossain/Downloads/TweeterLytics-HGG02-master/app/views/main.scala.html
                  HASH: 32af829c99c39349493b61b20e731733036f3859
                  MATRIX: 1165->260|1289->291|1316->292|1396->397|1432->406|1467->414|1493->419|1582->481|1597->487|1660->528|1748->589|1763->595|1824->634|2221->1004|2236->1010|2308->1061|2402->1217|2439->1227|2467->1234|2504->1244|2545->1258|2560->1264|2621->1304
                  LINES: 32->7|37->8|38->9|41->12|42->13|42->13|42->13|43->14|43->14|43->14|44->15|44->15|44->15|50->21|50->21|50->21|53->25|54->26|54->26|56->28|56->28|56->28|56->28
                  -- GENERATED --
              */
          