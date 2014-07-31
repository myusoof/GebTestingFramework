package pages

import geb.Page
import geb.navigator.Navigator

/**
 * Created with IntelliJ IDEA.
 * User: yusoof
 * Date: 31/07/14
 * Time: 22:32
 * To change this template use File | Settings | File Templates.
 */
class InterOpsPage extends Page{
    static url = "http://the-internet.herokuapp.com/"
    static at = {
       title.contains("The Internet")
    }

    static content = {
        labelField {text -> $("li").find("a")}
    }
}
