
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

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[Form[String],String,Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(sessionForm: Form[String], session: String = "No session data found!")(implicit messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._

Seq[Any](format.raw/*1.102*/("""

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
        """),format.raw/*17.9*/("""<button>Add</button>
    """)))}),format.raw/*18.6*/("""

""")))}),format.raw/*20.2*/("""
"""))
      }
    }
  }

  def render(sessionForm:Form[String],session:String,messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply(sessionForm,session)(messages)

  def f:((Form[String],String) => (Messages) => play.twirl.api.HtmlFormat.Appendable) = (sessionForm,session) => (messages) => apply(sessionForm,session)(messages)

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Fri Sep 11 11:50:31 CEST 2015
                  SOURCE: /home/akatchi/Dropbox/Libraries/Playframework/activator-dist-1.3.6/opdracht-5/app/views/index.scala.html
                  HASH: fbb20d065ebafc04fb50a277c398dc62d18734c8
                  MATRIX: 549->1|760->101|788->120|815->122|846->145|885->147|917->153|973->184|1000->191|1033->197|1070->208|1085->214|1143->263|1183->265|1220->275|1389->423|1425->432|1481->458|1514->461
                  LINES: 20->1|25->1|27->4|28->5|28->5|28->5|30->7|31->8|31->8|33->10|35->12|35->12|35->12|35->12|36->13|39->16|40->17|41->18|43->20
                  -- GENERATED --
              */
          