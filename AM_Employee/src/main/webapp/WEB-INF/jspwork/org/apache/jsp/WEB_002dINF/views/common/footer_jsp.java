/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.56
 * Generated at: 2020-09-11 02:45:16 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.common;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class footer_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write(" <footer class=\"ftco-footer\">\r\n");
      out.write("      <div class=\"container\">\r\n");
      out.write("        <div class=\"row mb-5\">\r\n");
      out.write("          <div class=\"col-sm-12 col-md\">\r\n");
      out.write("            <div class=\"ftco-footer-widget mb-4\">\r\n");
      out.write("              <h2 class=\"ftco-heading-2 logo\"><a href=\"#\">AM</a></h2>\r\n");
      out.write("              <p>Albeit Management System</p>\r\n");
      out.write("              <ul class=\"ftco-footer-social list-unstyled mt-2\">\r\n");
      out.write("                <li><a href=\"#\"><span class=\"fa fa-twitter\"></span></a></li>\r\n");
      out.write("                <li><a href=\"#\"><span class=\"fa fa-facebook\"></span></a></li>\r\n");
      out.write("                <li><a href=\"#\"><span class=\"fa fa-instagram\"></span></a></li>\r\n");
      out.write("              </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"col-sm-12 col-md\">\r\n");
      out.write("            <div class=\"ftco-footer-widget mb-4 ml-md-4\">\r\n");
      out.write("              <h2 class=\"ftco-heading-2\">Company</h2>\r\n");
      out.write("              <ul class=\"list-unstyled\">\r\n");
      out.write("             \t<li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/company/about\"><span class=\"fa fa-chevron-right mr-2\"></span>About</a></li>\r\n");
      out.write("                <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/company/contact\"><span class=\"fa fa-chevron-right mr-2\"></span>Customer Service</a></li>\r\n");
      out.write("              </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"col-sm-12 col-md\">\r\n");
      out.write("            <div class=\"ftco-footer-widget mb-4 ml-md-4\">\r\n");
      out.write("              <h2 class=\"ftco-heading-2\">User</h2>\r\n");
      out.write("              <ul class=\"list-unstyled\">\r\n");
      out.write("                <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/member/login\"><span class=\"fa fa-chevron-right mr-2\"></span>Join us</a></li>\r\n");
      out.write("                <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/member/signUp\"><span class=\"fa fa-chevron-right mr-2\"></span>Login</a></li>\r\n");
      out.write("              </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"col-sm-12 col-md\">\r\n");
      out.write("             <div class=\"ftco-footer-widget mb-4\">\r\n");
      out.write("              <h2 class=\"ftco-heading-2\">Family</h2>\r\n");
      out.write("              <ul class=\"list-unstyled\">\r\n");
      out.write("                <li><a href=\"#\"><span class=\"fa fa-chevron-right mr-2\"></span>사장님</a></li>\r\n");
      out.write("                <li><a href=\"#\"><span class=\"fa fa-chevron-right mr-2\"></span>알바생</a></li>\r\n");
      out.write("                <li><a href=\"#\"><span class=\"fa fa-chevron-right mr-2\"></span>관리자</a></li>\r\n");
      out.write("              </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"col-sm-12 col-md\">\r\n");
      out.write("            <div class=\"ftco-footer-widget mb-4\">\r\n");
      out.write("            \t<h2 class=\"ftco-heading-2\">Have a Questions?</h2>\r\n");
      out.write("            \t<div class=\"block-23 mb-3\">\r\n");
      out.write("\t              <ul>\r\n");
      out.write("\t                <li><span class=\"icon fa fa-map marker\"></span><span class=\"text\">서울특별시 중구<br>남대문로 120<br>대일빌딩 2F, 3F</span></li>\r\n");
      out.write("\t                <li><a href=\"tel://12345678\"><span class=\"icon fa fa-phone\"></span><span class=\"text\">+ 1234-5678</span></a></li>\r\n");
      out.write("\t                <li><a href=\"mailto:AlbeitManagement@gmail.com\"><span class=\"icon fa fa-paper-plane pr-4\"></span><span class=\"text\">AlbeitManagement@gmail.com</span></a></li>\r\n");
      out.write("\t              </ul>\r\n");
      out.write("\t            </div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"container-fluid px-0 py-5 bg-black\">\r\n");
      out.write("      \t<div class=\"container\">\r\n");
      out.write("      \t\t<div class=\"row\">\r\n");
      out.write("\t          <div class=\"col-md-12\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t            <p class=\"mb-0\" style=\"color: rgba(255,255,255,.5);\"><!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->\r\n");
      out.write("\t  Copyright &copy;<script>document.write(new Date().getFullYear());</script> All rights reserved | This template is made with <i class=\"fa fa-heart color-danger\" aria-hidden=\"true\"></i> by Colorlib.com\r\n");
      out.write("\t  <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. --></p>\r\n");
      out.write("\t          </div>\r\n");
      out.write("\t        </div>\r\n");
      out.write("      \t</div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </footer>\r\n");
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
