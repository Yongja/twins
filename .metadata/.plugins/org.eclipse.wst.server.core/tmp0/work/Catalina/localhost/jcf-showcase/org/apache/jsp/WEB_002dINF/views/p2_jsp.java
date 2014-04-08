package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class p2_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\\\r\n");
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
      out.write("\t\t<script src=\"js/p2.js\"></script>\r\n");
      out.write("\t</head>\r\n");
      out.write("\r\n");
      out.write("\t<body data-spy=\"scroll\" data-target=\".bs-docs-sidebar\">\r\n");
      out.write("\t\t<!-- Navbar -->\r\n");
      out.write("\t\t<div class=\"navbar navbar-inverse navbar-fixed-top\">\r\n");
      out.write("\t\t\t<div class=\"navbar-inner\">\r\n");
      out.write("\t\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"btn btn-navbar\" data-toggle=\"collapse\"\r\n");
      out.write("\t\t\t\t\t\tdata-target=\".nav-collapse\">\r\n");
      out.write("\t\t\t\t\t\t<span class=\"icon-bar\"></span> <span class=\"icon-bar\"></span> <span class=\"icon-bar\"></span>\r\n");
      out.write("\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t<a class=\"brand\" href=\"/jcf-showcase/index.html\">JCF-Showcase</a>\r\n");
      out.write("\t\t\t\t\t<div class=\"nav-collapse collapse\">\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"nav\">\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"\"><a href=\"/jcf-showcase/index.html\">Home</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"\"><a href=\"/jcf-showcase/openpage.do?viewname=p1\">JCF SUA</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"active\"><a href=\"/jcf-showcase/openpage.do?viewname=p2\">파일업로드/다운로드</a>\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"\"><a href=\"/jcf-showcase/openpage.do?viewname=p3\">대용량조회</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"\"><a href=\"/jcf-showcase/openpage.do?viewname=p4\">예외 및 메시지처리</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"\"><a href=\"openpage.do?viewname=p5\">JCF Query </a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"\"><a href=\"openpage.do?viewname=p6\">활용 CASE</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"\"><a href=\"#\">JCF-IAM(개발예정)</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- Subhead -->\r\n");
      out.write("\t\t<header id=\"overview\"> </header>\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!-- Docs nav -->\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t<div class=\"span3 bs-docs-sidebar\">\r\n");
      out.write("\t\t\t\t\t<ul class=\"nav nav-list bs-docs-sidenav\">\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#p21\"> <i class=\"icon-chevron-right\"></i>파일 업/다운로드</a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#p21_1\">파일시스템 기반에 파일과 데이터를 같이 보내는 경우</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#p21_2\">파일시스템 기반에 파일과 데이터를 별도로 보내는 경우 (선파일, 후데이터)</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"span9\">\r\n");
      out.write("\t\t\t\t<!-- Request Mapping -->\r\n");
      out.write("\t\t\t\t\t<section id=\"p21\">\r\n");
      out.write("\t\t\t\t\t\t<div  class=\"page-header\">\r\n");
      out.write("\t\t\t\t\t\t\t<h3>파일 업/다운로드</h3>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<p>JCF-UPLOAD 는 파일 업/다운로드 기능과 업무를 분리하여, 간단한 설정과 구현을 통하여 파일 업로드와 다운로드 기능을 제공한다.<br/>\r\n");
      out.write("\t\t\t\t\t\t관련 코드는com.jcf.sample.file 패키지 및 applicationContext-file.xml 에 자세히 나와있다.<br/>\r\n");
      out.write("\t\t\t\t\t\t참고로 업/다운로드 테스트는 소스를 받은뒤 각자 로컬에서 확인할 수 있다.\r\n");
      out.write("\t\t\t\t\t\t</p>\r\n");
      out.write("\t           \t\t\t<section id=\"p21_1\">\r\n");
      out.write("\t       \t\t\t\t\t<h4 id=\"headings\">파일시스템 기반에 파일과 데이터를 같이 보내는 경우</h4>\r\n");
      out.write("\t\t\t\t\t\t\t<p> 데이터와 함께 파일은 서버의 파일시스템에 파일을 업로드한다.<br/>\r\n");
      out.write("\t\t\t\t\t\t\t\t업로드 기본 경로는 app.propertis 파일에 fileBasePath로 설정된 경로이다.</p>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"bs-docs-example\" >\r\n");
      out.write("\t\t\t\t\t  \t\t\t<iframe src=\"openpage.do?viewname=p2_iframe_1\"  width=\"500\" height=\"220\"  name=\"main\" style=\"border:0;\"></iframe>\r\n");
      out.write("\t\t\t\t\t\t\t</div><br/>\r\n");
      out.write("\t\t\t\t\t\t\t<pre class=\"prettyprint linenums\">\r\n");
      out.write("\r\n");
      out.write("&lt;bean id=\"webFlowFileOperator\" class=\"jcf.sua.ux.webflow.mvc.file.WebFlowFileOperator\"&gt;\r\n");
      out.write("\t\t&lt;property name=\"receiver\" ref=\"uploadToFile\" /&gt;\r\n");
      out.write("\t\t&lt;property name=\"uploadEventHandlers\"&gt;\r\n");
      out.write("\t\t\t&lt;map&gt;\r\n");
      out.write("\t\t\t\t&lt;entry key=\"/**/*FileUpload*\" value-ref=\"fileUploadEventHandler\"/&gt;\r\n");
      out.write("\t\t\t&lt;/map&gt;\r\n");
      out.write("\t\t&lt;/property&gt;\r\n");
      out.write("&lt;/bean&gt;\r\n");
      out.write("\r\n");
      out.write("&lt;bean id=\"fileUploadEventHandler\" class=\"com.jcf.system.file.upload.ShowcaseFileUploadEventHandler\" /&gt;\r\n");
      out.write("\r\n");
      out.write("public class ShowcaseFileUploadEventHandler implements UploadEventHandler {\r\n");
      out.write("\t...\r\n");
      out.write("\t@Override\r\n");
      out.write("\tpublic void postprocess(String folder, MultiPartInfo info, PersistenceManager persistenceManager) {\r\n");
      out.write("\t\tList list = info.getFileInfos();\r\n");
      out.write("\r\n");
      out.write("\t\tfor (FileInfo fileInfo : list) {\r\n");
      out.write("\t\t\tlogger.info(\"File Name : \" + fileInfo.getName());\r\n");
      out.write("\t\t\tlogger.info(\"Modified Name : \" + fileInfo.getCallName());\r\n");
      out.write("\t\t\tlogger.info(\"Upload Path : \" + fileInfo.getFolder());\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\t...\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("@RequestMapping(\"/sampleFileUploadWithInfo\")\r\n");
      out.write("public void sampleFileUploadWithInfo(MciRequest request, MciResponse response) {\r\n");
      out.write("\tresponse.addParam(\"content\", request.getParam(\"content\"));\r\n");
      out.write("\r\n");
      out.write("\tresponse.setViewName(\"/redirect/p2_iframe_1_Succuss\");\r\n");
      out.write("}\r\n");
      out.write("\t\t\t\t\t\t\t</pre>\r\n");
      out.write("\t\t\t\t\t\t</section>\r\n");
      out.write("\t\t\t\t\t\t<section id=\"p21_2\">\r\n");
      out.write("\t\t\t\t\t\t\t<h4 id=\"headings\">파일시스템 기반에 파일과 데이터를 따로 보내는 경우</h4>\r\n");
      out.write("\t\t\t\t\t\t\t<p>파일을 먼저 업로드 한 후 데이터를 보낸다.</p>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"bs-docs-example\" >\r\n");
      out.write("\t\t\t\t\t\t\t\t<form id=\"p21_1_Form\" class=\"form-horizontal\" method=\"post\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"control-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<label class=\"control-label\" for=\"p21_2_param1\">내용 : </label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"controls\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"param1\" id=\"p21_2_param1\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"control-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<label  class=\"control-label\" for=\"p21_2_param3\">파일 : </label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"controls\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div  id=\"p21_iframe\" >\r\n");
      out.write("\t\t                              \t\t\t<iframe src=\"openpage.do?viewname=p2_iframe_2\" name=\"main\" style=\"border:0;\"></iframe>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<button class=\"btn\" type=\"submit\" id=\"p21_2_btn1\">전송</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div id=\"p21_2_result\"  class=\"bs-docs-example-result\">  </div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<pre class=\"prettyprint linenums\">\r\n");
      out.write("\r\n");
      out.write("@RequestMapping(\"/sampleFileUpload\")\r\n");
      out.write("public void sampleUpload(MciRequest request, MciResponse response) {\r\n");
      out.write("\tresponse.setViewName(\"/redirect/p2_iframe_2_Succuss\");\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("@RequestMapping(\"/afterUploadAction\")\r\n");
      out.write("public void sampleAfterUplaod(MciRequest request, MciResponse response) {\r\n");
      out.write("\tMap paramMap = request.getMap(\"DS_IN\");\r\n");
      out.write("\r\n");
      out.write("\tresponse.addSuccessMessage(paramMap.toString() + \"데이터와 파일이 저장 되었습니다.\");\r\n");
      out.write("}\r\n");
      out.write("\t\t\t\t\t\t\t</pre>\r\n");
      out.write("\t\t\t\t\t\t</section>\r\n");
      out.write("\t\t\t\t\t\t<!--\r\n");
      out.write("\t\t\t\t\t\t<section id=\"p21_3\">\r\n");
      out.write("\t\t   \t\t\t\t\t<h4>파일을 byte[]로 받는 경우</h4>\r\n");
      out.write("\t\t\t\t\t\t\t<p>파일과 데이터와 보내 Byte[] 타입으로 받는다.</p>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"bs-docs-example\">\r\n");
      out.write("\t\t  \t\t\t\t\t\t<iframe src=\"openpage.do?viewname=p2_iframe_3\"  width=\"500\" height=\"200\"  name=\"main\" style=\"border:0;\"></iframe>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div  id=\"p21_3_result\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<pre class=\"prettyprint linenums\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</pre>\r\n");
      out.write("\t\t\t\t\t\t</section>\r\n");
      out.write("\t\t\t\t\t\t -->\r\n");
      out.write("\t\t\t\t\t</section>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- Footer\r\n");
      out.write("\t    ================================================== -->\r\n");
      out.write("\t\t<footer class=\"footer\">\r\n");
      out.write("\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t <p>Homepage : <a href=\"http://jcf.daewoobrenic.co.kr/blog/\">JCF Blog</a></p>\r\n");
      out.write("\t         <p>E-Mail : <a href=\"mailto:jcf@disc.co.kr\">jcf@disc.co.kr</a></p>\r\n");
      out.write("\t         <p>Copyright © 2013 Daewoo Information Systems Co., Ltd..</p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</footer>\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- Analytics\r\n");
      out.write("\t    ================================================== -->\r\n");
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
