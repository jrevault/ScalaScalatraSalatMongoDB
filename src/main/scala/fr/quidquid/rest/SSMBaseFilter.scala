package fr.quidquid.rest


import org.scalatra._
import java.net.URL
import scalate.ScalateSupport
import org.fusesource.scalate.layout.{DefaultLayoutStrategy}
import org.fusesource.scalate.TemplateEngine

class SSMBaseFilter extends ScalatraFilter with ScalateSupport {

  beforeAll {
    templateEngine.layoutStrategy = new DefaultLayoutStrategy(templateEngine, TemplateEngine.templateTypes.map("/WEB-INF/scalate/layouts/default." + _):_*)
  }

  beforeSome( "/api/*" ) {
    // contentType = "text/json"
    // Uncomment previous line for real use, next line is for browser testing only
    contentType = "text/html"
  }

  get("/") {
    <html>
      <body>
        <h1>Hello tarie! (a very stupid french word game)</h1>
        Say <a href="hello-scalate">hello to Scalate...</a>.
      </body>
    </html>
  }

  notFound {
    // If no route matches, then try to render a Scaml template
    val templateBase = requestPath match {
      case s if s.endsWith("/") => s + "index"
      case s => s
    }
    val templatePath = "/WEB-INF/scalate/templates/" + templateBase + ".scaml"

    servletContext.getResource(templatePath) match {
      case url: URL => 
        contentType = "text/html"
        templateEngine.layout(templatePath)
      case _ => 
        filterChain.doFilter(request, response)
    } 
  }
}
