package controllers;


import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.BodyParsers;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index() {
        System.out.println("This is long line in order to test the checkstyle su checks in the code.................................");
        return ok(views.html.index.render());
    }

}
