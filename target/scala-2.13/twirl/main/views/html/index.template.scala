
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/main("merokam")/*3.17*/ {_display_(Seq[Any](format.raw/*3.19*/("""
  """),format.raw/*4.3*/("""<h1>Hello world!</h1>
<p>This is java first web application </p>
<a href="/article">Read Article</a>
<img src= '"""),_display_(/*7.13*/routes/*7.19*/.Assets.versioned("images/5.jpg")),format.raw/*7.52*/("""'/>
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
                  DATE: 2019-08-22T12:16:46.964
                  SOURCE: /home/crazcodernp/merokam/app/views/index.scala.html
                  HASH: ce58cede56315b6573fc3112015134c249d9d016
                  MATRIX: 941->1|1037->4|1064->6|1087->21|1126->23|1155->26|1294->139|1308->145|1361->178|1395->183
                  LINES: 28->1|33->2|34->3|34->3|34->3|35->4|38->7|38->7|38->7|39->8
                  -- GENERATED --
              */
          