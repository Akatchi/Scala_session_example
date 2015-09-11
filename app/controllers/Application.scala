package controllers

import javax.inject.Inject

import play.api._
import play.api.data.Form
import play.api.i18n.{I18nSupport, MessagesApi}
import play.api.mvc._
import play.api.data.Forms._

class Application @Inject()(val messagesApi: MessagesApi) extends Controller with I18nSupport {

  val SESSION_VAR = "user_value"
  var sessionValue = ""

  val sessionForm = Form(
    tuple(
      "value" -> text,
      "session" -> text
    )
  )

  def index = Action { implicit request =>
    // Fill the form with the session variable
    Ok(views.html.index(sessionForm.fill("", sessionValue), sessionValue))
  }

  def addToSession = Action { implicit request =>
    sessionForm.bindFromRequest.fold(
    formWithErrors => {
      BadRequest(views.html.index(formWithErrors))
    }, {
      case (value, session) => {
        // Update the session value iwth the new set requirement
        sessionValue = (session + " " + value)
        Redirect(routes.Application.index())
      }
    })
  }

}
