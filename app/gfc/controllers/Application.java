package gfc.controllers;

import play.*;
import play.mvc.*;

import javax.xml.transform.Result;

public class Application extends Controller {

    public static Result index() {
        return ok(index.render("Your new application is ready."));
    }

}
