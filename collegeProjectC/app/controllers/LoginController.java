package controllers;

import play.mvc.*;

import play.api.Environment;
import play.data.*;
import play.db.ebean.Transactional;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;

import models.*;

import views.html.*;

public class LoginController extends Controller {
    private FormFactory formFactory;

    public Result login() {
    	if(session().get("username") != null)
            return redirect(controllers.routes.HomeController.dashboard());

        //Form<Login> loginForm = formFactory.form(Login.class);
        return ok(login.render());
    }

    public Result processLogin() {
    	//User.authenticate();
    	session("username", "adz");
    	return redirect(controllers.routes.HomeController.dashboard());
    }

    public Result logout() {
    	session().clear();
    	return redirect(controllers.routes.LoginController.login());
    }
}