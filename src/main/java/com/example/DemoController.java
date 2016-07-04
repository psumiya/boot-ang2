package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * This controller maps requests and returns views.
 * 
 * @author sumiyapathak
 *
 */
@Controller
public class DemoController {

	/**
	 * This method maps the "/hello" requests and returns a view "/index.html".
	 * Spring resolves this view using the default view resolvers and searches
	 * for this file in the default static files location (typically
	 * /src/main/resources/static).
	 * 
	 * <p>
	 * When using JSP or other server-templating technology, a custom view
	 * resolver will need to be configured so that the server knows ehere to
	 * render the view from.
	 * </p>
	 * 
	 * @return the view location
	 */
	@RequestMapping("/hello")
	public String index() {
		return "/index.html";
	}

}
