package controllers

import javax.inject.Inject

import play.api._
import play.api.data.Form
import play.api.i18n.{I18nSupport, MessagesApi}
import play.api.mvc._
import play.api.data.Forms._

class Application @Inject()(val messagesApi: MessagesApi) extends Controller with I18nSupport {

  val SESSION_VAR = "user_value"

  // Create a custom form //L   
  val sessionForm = Form(
    single(
      "value" -> text
    )
  )

  def index = Action { implicit request =>
    // Check if the session variable is set
    // If so we hand the current session with the value
    // from SESSION_VAR so we can print this in the
    // view
    request.session.get(SESSION_VAR).map { item =>
      Ok(views.html.index(sessionForm, item))
    }.getOrElse {
      Ok(views.html.index(sessionForm))
    }
  }

  def addToSession = Action { implicit request =>
    sessionForm.bindFromRequest.fold(
    formWithErrors => {
      BadRequest(views.html.index(formWithErrors))
    }, {
      case (value) => {
        var currentValue = ""

        // Get the current value from the session so we
        // can append to this later on
        request.session.get(SESSION_VAR).map { item =>
          currentValue = item
        }

        // Append to the current value from the session
        Redirect(routes.Application.index()).withSession(
            request.session + (SESSION_VAR -> (currentValue + " " + value)))
      }
    })
  }

}
