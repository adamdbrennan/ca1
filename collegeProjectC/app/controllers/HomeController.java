package controllers;

import play.mvc.*;

import play.api.Environment;
import play.data.*;
import play.db.ebean.Transactional;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;

import models.*;
import models.users.*;

import views.html.*;

public class HomeController extends Controller {
    private FormFactory formFactory;

    public Result dashboard() {
        if(session().get("username") == null)
            return redirect(controllers.routes.LoginController.login());
        return ok(dashboard.render());
    }
}