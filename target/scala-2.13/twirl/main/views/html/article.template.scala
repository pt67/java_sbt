
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

object article extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/main("merokam")/*3.17*/ {_display_(Seq[Any](format.raw/*3.19*/("""
  """),format.raw/*4.3*/("""<h1>Articles</h1>
<p>Article page </p>
<img src= '"""),_display_(/*6.13*/routes/*6.19*/.Assets.versioned("images/5.jpg")),format.raw/*6.52*/("""'/>
<a href="\">Home</a>
""")))}),format.raw/*8.2*/("""
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
                  DATE: 2019-08-11T21:06:32.475
                  SOURCE: /home/crazcodernp/merokam/app/views/article.scala.html
                  HASH: 924fd986ff1b3e711024511bcfea1d0d6a61daa7
                  MATRIX: 943->1|1039->4|1066->6|1089->21|1128->23|1157->26|1234->77|1248->83|1301->116|1356->142
                  LINES: 28->1|33->2|34->3|34->3|34->3|35->4|37->6|37->6|37->6|39->8
                  -- GENERATED --
              */
          