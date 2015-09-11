
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[Form[scala.Tuple2[String, String]],String,Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(sessionForm: Form[(String, String)], session: String = "No session data found!")(implicit messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._

Seq[Any](format.raw/*1.112*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("Welcome to Play")/*5.25*/ {_display_(Seq[Any](format.raw/*5.27*/("""

    """),format.raw/*7.5*/("""<h1>Session values: </h1>
    """),_display_(/*8.6*/session),format.raw/*8.13*/("""

    """),format.raw/*10.5*/("""<hr>

    """),_display_(/*12.6*/helper/*12.12*/.form(action = routes.Application.addToSession())/*12.61*/ {_display_(Seq[Any](format.raw/*12.63*/("""
        """),_display_(/*13.10*/inputText(
            field = sessionForm("value"),
            args = '_label -> "Value to add to session", 'placeholder -> "Some value"
        )),format.raw/*16.10*/("""
        """),_display_(/*17.10*/inputText(
            field = sessionForm("session"),
            args = 'type -> "hidden"
        )),format.raw/*20.10*/("""
        """),format.raw/*21.9*/("""<button>Add</button>
    """)))}),format.raw/*22.6*/("""

""")))}),format.raw/*24.2*/("""
"""))
      }
    }
  }

  def render(sessionForm:Form[scala.Tuple2[String, String]],session:String,messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply(sessionForm,session)(messages)

  def f:((Form[scala.Tuple2[String, String]],String) => (Messages) => play.twirl.api.HtmlFormat.Appendable) = (sessionForm,session) => (messages) => apply(sessionForm,session)(messages)

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Fri Sep 11 14:48:49 CEST 2015
                  SOURCE: /home/akatchi/Dropbox/Libraries/Playframework/activator-dist-1.3.6/opdracht-5/app/views/index.scala.html
                  HASH: c5a39146c03ebca1955d34824774a47545dfcafa
                  MATRIX: 571->1|792->111|820->130|847->132|878->155|917->157|949->163|1005->194|1032->201|1065->207|1102->218|1117->224|1175->273|1215->275|1252->285|1421->433|1458->443|1580->544|1616->553|1672->579|1705->582
                  LINES: 20->1|25->1|27->4|28->5|28->5|28->5|30->7|31->8|31->8|33->10|35->12|35->12|35->12|35->12|36->13|39->16|40->17|43->20|44->21|45->22|47->24
                  -- GENERATED --
              */
          