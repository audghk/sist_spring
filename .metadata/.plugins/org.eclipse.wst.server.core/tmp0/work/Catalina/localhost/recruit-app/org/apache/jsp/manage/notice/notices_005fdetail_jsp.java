/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.86
 * Generated at: 2024-06-29 08:12:35 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.manage.notice;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class notices_005fdetail_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  public java.lang.String getServletInfo() {
    return "";
  }

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(3);
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

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
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
      out.write("<!-- golgolz start -->\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../../assets/layout/admin/lib.jsp", out, false);
      out.write("\r\n");
      out.write("<link href=\"https://i.jobkorea.kr/content/css/ver_2/mtc/mtc_lounge-sv-202402231655.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("	$(function(){\r\n");
      out.write("		$(\"#notice_menu\").addClass(\"bg-gradient-primary\");\r\n");
      out.write("	});\r\n");
      out.write("</script>\r\n");
      out.write("<style>\r\n");
      out.write("	.noticeViewWrap{\r\n");
      out.write("		margin-left: 25px;\r\n");
      out.write("		margin-top: 0px;\r\n");
      out.write("	}\r\n");
      out.write("</style>\r\n");
      out.write("<!-- golgolz end -->\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../../assets/layout/admin/header.jsp", out, false);
      out.write("\r\n");
      out.write("	<main\r\n");
      out.write("		class=\"main-content position-relative max-height-vh-100 h-100 border-radius-lg ps--active-y\">\r\n");
      out.write("		<nav\r\n");
      out.write("			class=\"navbar navbar-main navbar-expand-lg px-0 mx-4 shadow-none border-radius-xl\"\r\n");
      out.write("			id=\"navbarBlur\" data-scroll=\"true\">\r\n");
      out.write("			<div class=\"container-fluid py-1 px-3\">\r\n");
      out.write("				<nav aria-label=\"breadcrumb\">\r\n");
      out.write("					<ol\r\n");
      out.write("						class=\"breadcrumb bg-transparent mb-0 pb-0 pt-1 px-0 me-sm-6 me-5\">\r\n");
      out.write("						<li class=\"breadcrumb-item text-sm\"><a\r\n");
      out.write("							class=\"opacity-5 text-dark\" href=\"javascript:;\">\r\n");
      out.write("							관리자 기능</a></li>\r\n");
      out.write("						<!-- 하단의 대시보드 텍스트를 본인 기능으로 변경 필요  -->\r\n");
      out.write("						<li class=\"breadcrumb-item text-sm text-dark active\"\r\n");
      out.write("							aria-current=\"page\">공지사항 관리</li>\r\n");
      out.write("					</ol>\r\n");
      out.write("					<h6 class=\"font-weight-bolder mb-0\">공지사항 상세</h6>\r\n");
      out.write("				</nav>\r\n");
      out.write("			</div>\r\n");
      out.write("		</nav>\r\n");
      out.write("		<div class=\"container-fluid py-4\">\r\n");
      out.write("			<!-- golgolz start -->\r\n");
      out.write("			<div>\r\n");
      out.write("				<div class=\"loungeContent noticeViewContent\" id=\"notice_detail_view\">\r\n");
      out.write("			        <div class=\"noticeViewWrap\">\r\n");
      out.write("			            <p class=\"noticeTit\">\r\n");
      out.write("			                <span style=\"font-size:15px\">일반공지</span>\r\n");
      out.write("			                <span style=\"margin-left:20px; color:#000000; font-size:15px\">[시스템 점검 공지] 3/28(목) AM 01시-05시</span>\r\n");
      out.write("			                <span style=\"margin-left: auto\">2020.02.03</span>\r\n");
      out.write("			            </p>\r\n");
      out.write("			            <div class=\"noticeView\">\r\n");
      out.write("			                <!--// 공지사항 내용 -->\r\n");
      out.write("			                        <p>안녕하세요. 잡코리아 운영자입니다. 더욱 좋은 서비스로 보답할 수 있도록 노력하겠습니다.</p>\r\n");
      out.write("			                <!-- 공지사항 내용 //-->\r\n");
      out.write("			            </div>\r\n");
      out.write("			            <div>\r\n");
      out.write("			                <input type=\"button\" class=\"btn btn-outline-dark btn-sm detail-control\" value=\"뒤로\" onclick=\"location.href='http://localhost/recruit-app/manage/notice/notices.jsp'\">\r\n");
      out.write("			                <input type=\"button\" class=\"btn btn-outline-warning btn-sm\" value=\"수정\" onclick=\"location.href='http://localhost/recruit-app/manage/notice/notices_update.jsp'\">\r\n");
      out.write("			                <input type=\"button\" class=\"btn btn-outline-danger btn-sm\" value=\"삭제\" onclick=\"location.href='http://localhost/recruit-app/manage/notice/notices.jsp'\">\r\n");
      out.write("			            </div>\r\n");
      out.write("			        </div>\r\n");
      out.write("			    </div>\r\n");
      out.write("			</div>\r\n");
      out.write("			<!-- golgolz end -->\r\n");
      out.write("		</div>\r\n");
      out.write("	</main>\r\n");
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
