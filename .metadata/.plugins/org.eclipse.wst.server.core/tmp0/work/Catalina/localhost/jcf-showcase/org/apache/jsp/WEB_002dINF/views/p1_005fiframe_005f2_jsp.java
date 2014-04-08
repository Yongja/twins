package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class p1_005fiframe_005f2_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<title>JCF Showcase</title>\r\n");
      out.write("\t\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("\t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("\t\t<meta name=\"description\" content=\"jcf showcase\">\r\n");
      out.write("\t\t<meta name=\"author\" content=\"jcf\">\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- Le styles -->\r\n");
      out.write("\t\t<link href=\"assets/bootstrap/css/bootstrap.css\" rel=\"stylesheet\">\r\n");
      out.write("\t\t<link href=\"assets/bootstrap/css/bootstrap-responsive.css\" rel=\"stylesheet\">\r\n");
      out.write("\t\t<link href=\"assets/bootstrap/css/docs.css\" rel=\"stylesheet\">\r\n");
      out.write("\t\t<link href=\"assets/bootstrap/css/prettify.css\" rel=\"stylesheet\">\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"assets/css/jquery-ui-1.9.2.custom.css\" />\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- 공통 lib-->\r\n");
      out.write("\t\t<script src=\"lib/jquery-1.9.0.js\"></script>\r\n");
      out.write("\t\t<script src=\"lib/jquery-ui-1.9.2.custom.js\"></script>\r\n");
      out.write("\t\t<script src=\"assets/bootstrap/js/bootstrap.js\"></script>\r\n");
      out.write("\t\t<script src=\"assets/bootstrap/js/prettify.js\"></script>\r\n");
      out.write("\t\t<script src=\"assets/bootstrap/js/application.js\"></script>\r\n");
      out.write("\t\t<script src=\"js/p1.js\"></script>\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body>\r\n");
      out.write("\t\t<form id=\"p11_6_Form\" name=\"p11_6_Form\"\r\n");
      out.write("\t\t\taction=\"/jcf-showcase/sample/sua/getMapForm.do\" method=\"post\" class=\"form-horizontal\">\r\n");
      out.write("\t\t\t<div class=\"control-group\">\r\n");
      out.write("\t\t\t\t<label class=\"control-label\" for=\"p11_6_param1\">아이디</label>\r\n");
      out.write("\t\t\t\t<div class=\"controls\">\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"name\" id=\"p11_5_param1\" placeholder=\"아이디\" />\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"control-group\">\r\n");
      out.write("\t\t\t\t<label class=\"control-label\" for=\"p11_6_param2\">나이</label>\r\n");
      out.write("\t\t\t\t<div class=\"controls\">\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"age\" id=\"p11_6_param2\" onBlur=onlyNumber(this) placeholder=\"나이(숫자)\" />\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"control-group\">\r\n");
      out.write("\t\t\t\t<div class=\"controls\">\r\n");
      out.write("\t\t\t\t\t<button class=\"btn\" type=\"submit\" id=\"p11_6_btn1\">전송</button>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
