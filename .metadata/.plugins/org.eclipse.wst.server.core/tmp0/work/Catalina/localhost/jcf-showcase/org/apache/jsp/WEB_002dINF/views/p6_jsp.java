package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class p6_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("\t\t<meta name=\"description\" content=\"jcf showcase\">\r\n");
      out.write("\t\t<meta name=\"author\" content=\"jcf\">\r\n");
      out.write("\t\t<title>JCF Showcase</title>\r\n");
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
      out.write("\t\t<script src=\"js/p6.js\"></script>\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body data-spy=\"scroll\" data-target=\".bs-docs-sidebar\">\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- Navbar -->\r\n");
      out.write("\t\t<div class=\"navbar navbar-inverse navbar-fixed-top\">\r\n");
      out.write("\t\t\t<div class=\"navbar-inner\">\r\n");
      out.write("\t\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"btn btn-navbar\" data-toggle=\"collapse\"\r\n");
      out.write("\t\t\t\t\t\tdata-target=\".nav-collapse\">\r\n");
      out.write("\t\t\t\t\t\t<span class=\"icon-bar\"></span> <span class=\"icon-bar\"></span> <span\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"icon-bar\"></span>\r\n");
      out.write("\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t<a class=\"brand\" href=\"/jcf-showcase/index.html\">JCF-Showcase</a>\r\n");
      out.write("\t\t\t\t\t<div class=\"nav-collapse collapse\">\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"nav\">\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"\"><a href=\"/jcf-showcase/index.html\">Home</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"\"><a href=\"/jcf-showcase/openpage.do?viewname=p1\">JCF SUA</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"\"><a href=\"/jcf-showcase/openpage.do?viewname=p2\">파일업로드/다운로드</a>\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"\"><a href=\"/jcf-showcase/openpage.do?viewname=p3\">대용량조회</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"\"><a href=\"/jcf-showcase/openpage.do?viewname=p4\">예외 및 메시지처리</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"\"><a href=\"/jcf-showcase/openpage.do?viewname=p5\">JCF Query</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"active\"><a href=\"openpage.do?viewname=p6\">활용 CASE</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"\"><a href=\"#\">JCF-IAM(개발예정)</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- Subhead -->\r\n");
      out.write("\t\t<header id=\"overview\"> </header>\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<!-- Docs nav -->\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t<div class=\"span3 bs-docs-sidebar\">\r\n");
      out.write("\t\t\t\t\t<ul class=\"nav nav-list bs-docs-sidenav\">\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#p61\"> <i class=\"icon-chevron-right\"></i>Sample 예제</a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"span9\">\r\n");
      out.write("\t\t\t\t\t<!-- Request Mapping -->\r\n");
      out.write("\t\t\t\t\t<section id=\"p61\">\r\n");
      out.write("\t         \t\t\t<div class=\"page-header\">\r\n");
      out.write("\t\t\t\t\t\t\t<h3>Sample 예제</h3>\r\n");
      out.write("\t\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t\tJCF 를 활용한 화면 Sample 예제로써 조회 및 입력, 수정 작업을 할 수 있다.<br/>\r\n");
      out.write("\t\t\t\t\t\t\t\t관련코드는 com.jcf.sample.example 패키지에 나와있다.<br/>\r\n");
      out.write("\t\t\t\t\t\t\t\t참고로 업/다운로드 테스트는 소스를 받은뒤 각자 로컬에서 확인할 수 있다.\r\n");
      out.write("\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<section id=\"p61_1\">\r\n");
      out.write("\t\t\t\t\t\t\t<h4>List 조회</h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t<table class=\"table table-striped\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<thead>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<th>아이디</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<th>이름</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<th>핸드폰번호</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<th>지원부서</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t</section>\r\n");
      out.write("\t\t\t\t\t\t<section id=\"p62\">\r\n");
      out.write("\t\t\t\t\t\t\t<h4 id=\"headings\">Sample 입력, 수정</h4>\r\n");
      out.write("\t\t\t\t\t\t\t<br/><br/>\r\n");
      out.write("\t\t\t\t\t\t\t<form id=\"p62_1_Form\"  action=\"/jcf-showcase/sample/example/saveExample.do\" class=\"form-horizontal\"  method=\"post\"  enctype=\"multipart/form-data\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"bs-docs-example\" id=\"p62_1\"><br/>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"hidden\" name=\"applyId\" id=\"p62_1_applyId\"  />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"control-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<label class=\"control-label\" for=\"p62_1_applyName\">이름</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"controls\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"applyName\" id=\"p62_1_applyName\" placeholder=\"이름\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<br/>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<!--\r\n");
      out.write("\t                      \t\t\t\t<div class=\"control-group\">\r\n");
      out.write("\t                      \t           \t\t<div id=\"p62_1_pic\" >\r\n");
      out.write("\t                      \t           \t\t\t<label class=\"control-label\" for=\"p21_2_param3\">사진 업로드 (DB저장)</label>\r\n");
      out.write("\t                      \t           \t\t\t<div class=\"controls\"><input type=\"file\" name=\"dbFileId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t -->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"control-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<label class=\"control-label\" for=\"p62_1_phoneNum\">휴대폰 번호</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"controls\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"phoneNum\" id=\"p62_1_phoneNum\" placeholder=\"휴대폰 번호\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"control-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<label class=\"control-label\" for=\"p62_1_applyDept\">지원부서</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div id=\"applyDept_combo\" class=\"controls\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<select name=\"applyDept\" id=\"p62_1_applyDept\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"01\"  selected=\"selected\">물류팀</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"02\">인사팀</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"03\">홍보팀</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t                                    </div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"control-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<label class=\"control-label\">포트폴리오 첨부<br/>파일시스템에 저장</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"controls\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div id=\"p62_4_iframe\" class=\"form-horizontal\">\r\n");
      out.write("\t                           \t\t\t\t\t\t<iframe src=\"openpage.do?viewname=p6_iframe_1\" width=\"500\" height=\"120\" name=\"main\" style=\"border:0;\"></iframe>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"controls\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<button class=\"btn\" type=\"submit\" id=\"p62_1_btn2\">저장</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<button class=\"btn\" type=\"reset\" id=\"p62_1_btn1\">신규</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<br />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"hidden\" name=\"fileName\" id=\"p62_1_attchName\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"hidden\" name=\"callName\" id=\"p62_1_attchId\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t    \t<input type=\"hidden\" name=\"fold\" id=\"p62_1_attchFold\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t    \t<input type=\"hidden\" name=\"dbFileId\" id=\"p62_1_dbFileId\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t\t</section>\r\n");
      out.write("\t\t\t\t\t</section>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- Footer -->\r\n");
      out.write("\t\t<footer class=\"footer\">\r\n");
      out.write("\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t \t\t<p>Homepage : <a href=\"http://jcf.daewoobrenic.co.kr/blog/\">JCF Blog</a></p>\r\n");
      out.write("        \t\t<p>E-Mail : <a href=\"mailto:jcf@disc.co.kr\">jcf@disc.co.kr</a></p>\r\n");
      out.write("        \t\t<p>Copyright © 2013 Daewoo Information Systems Co., Ltd..</p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</footer>\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- Analytics -->\r\n");
      out.write("\t\t<script>\r\n");
      out.write("\t\t\tvar _gauges = _gauges || [];\r\n");
      out.write("\t\t\t(function() {\r\n");
      out.write("\t\t\t\tvar t = document.createElement('script');\r\n");
      out.write("\t\t\t\tt.type = 'text/javascript';\r\n");
      out.write("\t\t\t\tt.async = true;\r\n");
      out.write("\t\t\t\tt.id = 'gauges-tracker';\r\n");
      out.write("\t\t\t\tt.setAttribute('data-site-id', '4f0dc9fef5a1f55508000013');\r\n");
      out.write("\t\t\t\tt.src = '//secure.gaug.es/track.js';\r\n");
      out.write("\t\t\t\tvar s = document.getElementsByTagName('script')[0];\r\n");
      out.write("\t\t\t\ts.parentNode.insertBefore(t, s);\r\n");
      out.write("\t\t\t})();\r\n");
      out.write("\t\t</script>\r\n");
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
