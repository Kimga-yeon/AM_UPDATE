/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.56
 * Generated at: 2020-09-15 02:24:38 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.company;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class about_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>about AM</title>\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("\t#about-wrapper{\r\n");
      out.write("\t\tborder-top: 3px solid #eceaea; \r\n");
      out.write("\t\tborder-bottom: 3px solid #eceaea; \r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t#about h2{font-family: 'S-CoreDream-6Bold';}\r\n");
      out.write("\t#about p{font-family: 'S-CoreDream-4Regular';}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<!-- ------------------------- header ---------------------------- -->\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/views/common/header.jsp", out, false);
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- ------------------------- main ---------------------------- -->\r\n");
      out.write("\t<section class=\"ftco-section\" id=\"about\">\r\n");
      out.write("\t\t<div class=\"overlay\"></div>\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t<div class=\"row justify-content-center pb-5\">\r\n");
      out.write("\t\t\t\t<div class=\"col-md-7 heading-section text-center fadeInUp\">\r\n");
      out.write("\t\t\t\t\t<span class=\"subheading\">Welcome to AM</span>\r\n");
      out.write("\t\t\t\t\t<h2>회사 소개</h2>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"row\" id=\"about-wrapper\">\r\n");
      out.write("\t\t\t\t<div\r\n");
      out.write("\t\t\t\t\tclass=\"col-md-6 img img-3 d-flex justify-content-center align-items-center\"\r\n");
      out.write("\t\t\t\t\tstyle=\"background-image: url('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/images/about_img.jpg');\"></div>\r\n");
      out.write("\t\t\t\t<div class=\"col-md-6 wrap-about px-md-5 py-5 bg-light\">\r\n");
      out.write("\t\t\t\t\t<div class=\"heading-section\">\r\n");
      out.write("\t\t\t\t\t\t<h2 class=\"mb-4\" id=\"about-title\">\r\n");
      out.write("\t\t\t\t\t\t\t최고의 아르바이트<br>관리 시스템\r\n");
      out.write("\t\t\t\t\t\t</h2>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t소규모 사업장에서도 부담 없이 사용할 수 있는<br> 인사, 근무, 급여 관리 프로그램이 필요하신가요?<br>\r\n");
      out.write("\t\t\t\t\t\t\t<br> 저희 AM은<br> 사장님과 아르바이트생 모두를 행복하게 만듭니다.<br>\r\n");
      out.write("\t\t\t\t\t\t\t<br> 사장님에게는 알바생의 휴무나 초과수당,<br> 정확한 월급 지급과 명세서까지<br>\r\n");
      out.write("\t\t\t\t\t\t\t간편하게 이용하고 관리하는 시스템을 제공합니다.<br>\r\n");
      out.write("\t\t\t\t\t\t\t<br> 알바생에게는 정확한 계산을 통해 급여를 받고,<br> 스케쥴 관리가 가능한 시스템을\r\n");
      out.write("\t\t\t\t\t\t\t제공합니다.\r\n");
      out.write("\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</section>\r\n");
      out.write("\r\n");
      out.write("\t<!-- ------------------------- footer ---------------------------- -->\r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/views/common/footer.jsp", out, false);
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
