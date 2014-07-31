package pages

import geb.Page

/**
 * Created with IntelliJ IDEA.
 * User: yusoof
 * Date: 31/07/14
 * Time: 22:41
 * To change this template use File | Settings | File Templates.
 */
class AbTestPages extends Page{

    static at={
        url.toString().contains("abtest")
    }

    static content = {
        titleText {$("div", class: "example")}.find("p")
    }
}
