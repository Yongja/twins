package org.apache.jsp.WEB_002dINF.views.redirect;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class p1_005fiframe_005f3_005fSuccuss_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("\t\t<title>Insert title here</title>\r\n");
      out.write("\r\n");
      out.write("\t\t<link href=\"/jcf-showcase/assets/bootstrap/css/bootstrap.css\" rel=\"stylesheet\">\r\n");
      out.write("\t\t<link href=\"/jcf-showcase/assets/bootstrap/css/bootstrap-responsive.css\" rel=\"stylesheet\">\r\n");
      out.write("\t\t<link href=\"/jcf-showcase/assets/bootstrap/css/docs.css\" rel=\"stylesheet\">\r\n");
      out.write("\t\t<link href=\"/jcf-showcase/assets/bootstrap/css/prettify.css\" rel=\"stylesheet\">\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"/jcf-showcase/assets/css/jquery-ui-1.9.2.custom.css\" />\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- 공통 lib-->\r\n");
      out.write("\t\t<script src=\"/jcf-showcase/lib/jquery-1.9.0.js\"></script>\r\n");
      out.write("\t\t<script src=\"/jcf-showcase/lib/jquery-ui-1.9.2.custom.js\"></script>\r\n");
      out.write("\t\t<script src=\"/jcf-showcase/assets/bootstrap/js/bootstrap.js\"></script>\r\n");
      out.write("\t\t<script src=\"/jcf-showcase/assets/bootstrap/js/prettify.js\"></script>\r\n");
      out.write("\t\t<script src=\"/jcf-showcase/assets/bootstrap/js/application.js\"></script>\r\n");
      out.write("\t\t<script src=\"/jcf-showcase/js/p1.js\"></script>\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body>\r\n");
      out.write("\t\t<div id=\"p11_5_result\" class=\"bs-docs-example-result\">\r\n");
      out.write("\t\t\t<p>\r\n");
      out.write("페이지가 성공적으로 이동되었습니다.</br>\r\n");
      out.write("본 페이지는 src > META-INF > spring> jcf-context.xml 에서 설정한 webflow-prefix 의 경로인 /WEB-INF/views/ 하위의 파일 중에\r\n");
      out.write(" response.setViewName 아규먼트인 \"/redirect/p1_iframe_3_Succuss\".jsp\" 파일을 호출합니다.</br>\r\n");
      out.write("즉 WebContent/WEB-INF/views/redirect/p1_iframe_3_Succuss.jsp\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<a href=\"/jcf-showcase/openpage.do?viewname=p1_iframe_3\" class=\"btn btn-link\">이전 페이지로</a>\r\n");
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
