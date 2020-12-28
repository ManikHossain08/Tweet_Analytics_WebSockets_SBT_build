
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/main("TweeterLytics")/*3.23*/ {_display_(Seq[Any](format.raw/*3.25*/("""
"""),format.raw/*4.1*/("""<div class="container">
  <div class="jumbotron">
  	<h1 class="center">Welcome to TweeterLytics!</h1>
  </div>
</div>
<div class="center">
  <input id="searchTerm" class="input-lg" type="text" placeholder="enter search term(s)"/> 
<button id="goButton" type="button" class="btn btn-info" onclick="search()"><span class="glyphicon glyphicon-search"></span> Go</button>
<button id="clearButton" type="button" class="btn btn-warning" onclick="clearInput()">Clear Input</button>
</div>
<br><br><hr>
<div class="row">
<div class="col-md-3">
</div>
<div class="col-md-6" id="demo">
</div>
<div class="col-md-3">
</div>
</div>
""")))}),format.raw/*23.2*/("""
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-12-22T21:12:22.958340
                  SOURCE: /Users/manikhossain/Downloads/TweeterLytics-HGG02-master/app/views/index.scala.html
                  HASH: ce446362c154020b0d5b10c8db96a4bb57a360a4
                  MATRIX: 900->1|996->4|1023->6|1052->27|1091->29|1118->30|1770->652
                  LINES: 27->1|32->2|33->3|33->3|33->3|34->4|53->23
                  -- GENERATED --
              */
          