package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class p4_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t\t<!-- 공통 lib-->\r\n");
      out.write("\t\t<script src=\"lib/jquery-1.9.0.js\"></script>\r\n");
      out.write("\t\t<script src=\"lib/jquery-ui-1.9.2.custom.js\"></script>\r\n");
      out.write("\t\t<script src=\"assets/bootstrap/js/bootstrap.js\"></script>\r\n");
      out.write("\t\t<script src=\"assets/bootstrap/js/prettify.js\"></script>\r\n");
      out.write("\t\t<script src=\"assets/bootstrap/js/application.js\"></script>\r\n");
      out.write("\t\t<script src=\"js/p4.js\"></script>\r\n");
      out.write("\t</head>\r\n");
      out.write("\r\n");
      out.write("\t<body data-spy=\"scroll\" data-target=\".bs-docs-sidebar\">\r\n");
      out.write("\t\t<!-- Navbar -->\r\n");
      out.write("\t\t<div class=\"navbar navbar-inverse navbar-fixed-top\">\r\n");
      out.write("\t\t\t<div class=\"navbar-inner\">\r\n");
      out.write("\t\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"btn btn-navbar\" data-toggle=\"collapse\" data-target=\".nav-collapse\">\r\n");
      out.write("\t\t\t\t\t\t<span class=\"icon-bar\"></span> <span class=\"icon-bar\"></span> <span class=\"icon-bar\"></span>\r\n");
      out.write("\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t<a class=\"brand\" href=\"/jcf-showcase/index.html\">JCF-Showcase</a>\r\n");
      out.write("\t\t\t\t\t<div class=\"nav-collapse collapse\">\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"nav\">\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"\"><a href=\"/jcf-showcase/index.html\">Home</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"\"><a href=\"/jcf-showcase/openpage.do?viewname=p1\">JCF SUA</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"\"><a href=\"/jcf-showcase/openpage.do?viewname=p2\">파일업로드/다운로드</a>\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"\"><a href=\"/jcf-showcase/openpage.do?viewname=p3\">대용량조회</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"active\"><a href=\"/jcf-showcase/openpage.do?viewname=p4\">예외 및 메시지처리</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"\"><a href=\"/jcf-showcase/openpage.do?viewname=p5\">JCF Query </a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"\"><a href=\"/jcf-showcase/openpage.do?viewname=p6\">활용 CASE</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"\"><a href=\"#\">JCF-IAM(개발예정)</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- Subhead -->\r\n");
      out.write("\t\t<header id=\"overview\"> </header>\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<!-- Docs nav -->\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t<div class=\"span3 bs-docs-sidebar\">\r\n");
      out.write("\t\t\t\t\t<ul class=\"nav nav-list bs-docs-sidenav\">\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#p41\"> <i class=\"icon-chevron-right\"></i>예외처리</a>\r\n");
      out.write("\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#p41_0\">비즈니스 예외처리</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#p41_1\">Parameter를 맵핑한 비즈니스 예외처리</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#p41_2\">시스템 예외에 대한 메시지처리</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#p42\"> <i class=\"icon-chevron-right\"></i>다국어 처리</a>\r\n");
      out.write("\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#p42_1\">Client 브라우저의 locale 값에 따른 메시지 다국어 처리</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#p42_3\">Parameter 기반의 다국어 처리</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"span9\">\r\n");
      out.write("\t\t\t\t\t<!-- Request Mapping -->\r\n");
      out.write("\t\t\t\t\t<section id=\"p41\">\r\n");
      out.write("\t         \t\t\t<div class=\"page-header\">\r\n");
      out.write("\t\t\t\t\t\t\t<h3 >예외처리</h3>\r\n");
      out.write("\t\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t \t\t\tJCF 를 활용하여 비즈니스 예외와 시스템 예외에 대하여 일괄적으로 처리한다.<br/>\r\n");
      out.write("\t\t\t\t\t \t\t\t관련 코드는 com.jcf.sample.exception 패키지에 자세히 나와있다.\r\n");
      out.write("\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<section id=\"p41_0\">\r\n");
      out.write("\t\t\t\t\t\t\t<h4 >비즈니스 예외처리</h4>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"bs-docs-example\" ><br />ID 가 누락되었다는 예외 메시지를 던진다.\r\n");
      out.write("\t\t\t\t\t\t\t\t<button class=\"btn\" id=\"p41_0_btn1\">예외메시지</button><br /> <br />\r\n");
      out.write("\t\t\t\t\t\t\t\t<div id=\"p41_0_result\" class=\"bs-docs-example-result\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<pre class=\"prettyprint linenums\">\r\n");
      out.write("\r\n");
      out.write("&lt;!-- MessageSource --&gt;\r\n");
      out.write("&lt;bean id=\"messageSource\" class=\"org.springframework.context.support.ReloadableResourceBundleMessageSource\"&gt;\r\n");
      out.write("\t&lt;property name=\"basename\" value=\"classpath:/META-INF/messages/message\" /&gt;\r\n");
      out.write("\t&lt;property name=\"defaultEncoding\" value=\"utf-8\" /&gt;\r\n");
      out.write("&lt;/bean&gt;\r\n");
      out.write("\r\n");
      out.write("&lt;bean id=\"messageSourceAccessor\" class=\"org.springframework.context.support.MessageSourceAccessor\"&gt;\r\n");
      out.write("\t&lt;constructor-arg ref=\"messageSource\" /&gt;\r\n");
      out.write("&lt;/bean&gt;\r\n");
      out.write("\r\n");
      out.write("public void makeBizException(String id) {\r\n");
      out.write("\tif (StringUtils.isEmpty(id)) {\r\n");
      out.write("\t\tthrow new BizException(\"MSG_0001\");\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("\t\t\t\t\t\t\t</pre>\r\n");
      out.write("\t\t\t\t\t\t</section>\r\n");
      out.write("\t\t\t\t\t\t<section id=\"p41_1\">\r\n");
      out.write("\t\t\t\t\t\t\t<h4 >Parameter를 맵핑한 비즈니스 예외처리</h4>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"bs-docs-example\" ><br />{0} 에 들어갈 메시지를 넣어줄 수 있다.\r\n");
      out.write("\t\t\t\t\t\t\t\t<button class=\"btn\" id=\"p41_1_btn1\">예외메시지</button><br /> <br />\r\n");
      out.write("\t\t\t\t\t\t\t\t<div id=\"p41_1_result\" class=\"bs-docs-example-result\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<pre class=\"prettyprint linenums\">\r\n");
      out.write("\r\n");
      out.write("&lt;!-- message.properties --&gt;\r\n");
      out.write("ERR_0002={0} (\\uC774)\\uAC00 \\uD2C0\\uB9BD\\uB2C8\\uB2E4.\r\n");
      out.write("\r\n");
      out.write("public void makeBizExceptionWithParam() {\r\n");
      out.write("\tthrow new BizException(\"ERR_0002\", new String[]{\"PASSWORD\"});\r\n");
      out.write("}\r\n");
      out.write("\t\t\t\t\t\t\t</pre>\r\n");
      out.write("\t\t\t\t\t\t</section>\r\n");
      out.write("\t\t\t\t\t\t<section id=\"p41_2\">\r\n");
      out.write("\t\t\t\t\t\t\t<h4>시스템 예외에 대한 메시지처리 </h4>\r\n");
      out.write("\t\t\t\t\t\t\t<p>시스템 예외에 대한 메시지처리 .</p>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"bs-docs-example\" ><br />\r\n");
      out.write("\t\t\t\t\t\t\t\t<button class=\"btn\" id=\"p41_2_btn1\">시스템 예외메시지</button><br /> <br />\r\n");
      out.write("\t\t\t\t\t\t\t\t<div id=\"p41_2_result\" class=\"bs-docs-example-result\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write(" \t\t\t\t\t\t\t<pre class=\"prettyprint linenums\">\r\n");
      out.write("\r\n");
      out.write("&lt;!-- javascript --&gt;\r\n");
      out.write("$.ajax({\r\n");
      out.write("\t...\r\n");
      out.write("\terror : function(request, status, error){\r\n");
      out.write("\t  $('#p41_2_result').html(\"예상치 못한 시스템 예외가 발생하였습니다.\");\r\n");
      out.write("    }\r\n");
      out.write("    ...\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("public void makeSysException() {\r\n");
      out.write("\tcommonDao.queryForMap(\"no_namespace.no_sql\", null);\r\n");
      out.write("}\r\n");
      out.write("\t\t\t\t\t\t\t</pre>\r\n");
      out.write("\t\t\t\t\t\t</section>\r\n");
      out.write("\t\t\t\t\t</section>\r\n");
      out.write("\t\t\t\t\t<section id=\"p42\">\r\n");
      out.write("        \t\t\t\t<div class=\"page-header\">\r\n");
      out.write("\t\t\t\t\t\t\t<h3 >다국어 처리</h3>\r\n");
      out.write("\t\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t\tJCF 다국어 처리 기능은 Spring의 Local resolver 통해 다국어를 지원한다.<br/>\r\n");
      out.write("\t\t\t\t\t \t\t\t관련 코드는 com.jcf.sample.message 패키지에 자세히 나와있다.\r\n");
      out.write("\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<section id=\"p42_1\">\r\n");
      out.write("\t\t\t\t\t\t\t<h4>Client의 locale 값에 따른 메시지 다국어 처리</h4>\r\n");
      out.write("\t\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t   Client의 locale 값에 따른 메시지 다국어 처리.<br>\r\n");
      out.write("\t\t\t\t\t\t\t   사용자의 브라우져에서 보내진 request 헤더의 accept-language부분에서 Locale을 읽어들인다. (AcceptHeaderLocaleResolver)\r\n");
      out.write("\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"bs-docs-example\" ><br/>\r\n");
      out.write("\t\t\t\t\t\t\t\t현재 SessionLocaleResolver 로 처리되어 있으며 이 설정을 사용하기 위해서는 SessionLocaleResolver 관련설정을 주석처리하여 실행한다.<br/><br />\r\n");
      out.write("\t\t\t\t\t\t\t\t<button class=\"btn\" id=\"p42_3_btn1\">Client 브라우저의 locale 값에 따른 메시지</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t<br /> <br />\r\n");
      out.write("\t\t\t\t\t\t\t\t<div id=\"p42_3_result\"  class=\"bs-docs-example-result\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<pre class=\"prettyprint linenums\">\r\n");
      out.write("\r\n");
      out.write("&lt;!-- Default --&gt;\r\n");
      out.write("&lt;bean id=\"localeResolver\" class=\"org.springframework.web.servlet.i18n.AcceptHeaderLocaleResolver\" /&gt;\r\n");
      out.write("\r\n");
      out.write("@RequestMapping(\"/getLocalMsg\")\r\n");
      out.write("public void getLocalMessage(MciRequest request, MciResponse response) {\r\n");
      out.write("\tString msg = messageSourceAccessor.getMessage(\"MSG_0001\");\r\n");
      out.write("\r\n");
      out.write("\tresponse.addSuccessMessage(\"Message : \" + msg);\r\n");
      out.write("}\r\n");
      out.write("\t\t\t\t\t\t\t</pre>\r\n");
      out.write("\t\t\t\t\t\t</section>\r\n");
      out.write("\t\t\t\t\t\t<section id=\"p42_3\">\r\n");
      out.write("\t\t\t\t\t\t\t<h4>Parameter 기반의 다국어 처리</h4>\r\n");
      out.write("\t\t\t\t\t\t\t<p>HandlerMapping에 인터셉터를 등록하여 특정 파라미터에 넘어 온 값으로 locale을 알아내어 다국어를 처리한다. (SessionLocaleResolver)</p>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"bs-docs-example\" ><br />\r\n");
      out.write("\t\t\t\t\t\t\t\t<button class=\"btn\" id=\"p42_2_btn1\">한글 설정</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t<button class=\"btn\" id=\"p42_2_btn2\">영문 설정</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t<br /> <br />\r\n");
      out.write("\t\t\t\t\t\t\t\t<div id=\"p42_2_result\"  class=\"bs-docs-example-result\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<pre class=\"prettyprint linenums\">\r\n");
      out.write("\r\n");
      out.write("&lt;!-- 다국어 설정 --&gt;\r\n");
      out.write("&lt;bean id=\"localeResolver\" class=\"org.springframework.web.servlet.i18n.SessionLocaleResolver\" /&gt;\r\n");
      out.write("\r\n");
      out.write("&lt;bean id=\"localeChangeInterceptor\" class=\"org.springframework.web.servlet.i18n.LocaleChangeInterceptor\"&gt;\r\n");
      out.write("   \t&lt;property name=\"paramName\" value=\"toLang\"/&gt;\r\n");
      out.write("&lt;/bean&gt;\r\n");
      out.write("\r\n");
      out.write("&lt;jcfsua:sua-config ...&gt;\r\n");
      out.write("\t...\r\n");
      out.write("\t&lt;jcfsua:custom-interceptor ref=\"localeChangeInterceptor\"/&gt;\r\n");
      out.write("\t...\r\n");
      out.write("&lt;/jcfsua:sua-config&gt;\r\n");
      out.write("\r\n");
      out.write("@RequestMapping(\"/getMultiLang\")\r\n");
      out.write("public void getMultiLang(MciRequest request, MciResponse response) {\r\n");
      out.write("\tString msg = messageSourceAccessor.getMessage(\"MSG_0002\");\r\n");
      out.write("\r\n");
      out.write("\tresponse.addSuccessMessage(\"Message : \" + msg);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</pre>\r\n");
      out.write("\t\t\t\t\t\t</section>\r\n");
      out.write("\t\t\t\t\t</section>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
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
      out.write("</html>\r\n");
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
