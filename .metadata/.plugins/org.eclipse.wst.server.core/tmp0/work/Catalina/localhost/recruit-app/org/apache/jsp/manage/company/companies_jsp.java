/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.86
 * Generated at: 2024-07-04 09:24:26 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.manage.company;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class companies_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../../assets/layout/admin/lib.jsp", out, false);
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("	$(function() {\n");
      out.write("		$(\"#company_menu\").addClass(\"bg-gradient-primary\");		\n");
      out.write("	});\n");
      out.write("</script>\n");
      out.write("<!-- golgolz start -->\n");
      out.write("<link href=\"http://localhost/recruit-app/assets/css/manage/order/admin.css\" rel=\"stylesheet\" />\n");
      out.write("<link href=\"http://localhost/recruit-app/assets/css/manage/order/reset.css\" rel=\"stylesheet\" />\n");
      out.write("<!-- golgolz end -->\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("	");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../../assets/layout/admin/header.jsp", out, false);
      out.write("\n");
      out.write("	<main\n");
      out.write("		class=\"main-content position-relative max-height-vh-100 h-100 border-radius-lg ps ps--active-y\">\n");
      out.write("		<nav\n");
      out.write("			class=\"navbar navbar-main navbar-expand-lg px-0 mx-4 shadow-none border-radius-xl\"\n");
      out.write("			id=\"navbarBlur\" data-scroll=\"true\">\n");
      out.write("			<div class=\"container-fluid py-1 px-3\">\n");
      out.write("				<nav aria-label=\"breadcrumb\">\n");
      out.write("					<ol\n");
      out.write("						class=\"breadcrumb bg-transparent mb-0 pb-0 pt-1 px-0 me-sm-6 me-5\">\n");
      out.write("						<li class=\"breadcrumb-item text-sm\"><a\n");
      out.write("							class=\"opacity-5 text-dark\" href=\"javascript:;\"> 관리자 기능</a></li>\n");
      out.write("						<!-- 하단의 대시보드 텍스트를 본인 기능으로 변경 필요  -->\n");
      out.write("						<li class=\"breadcrumb-item text-sm text-dark active\"\n");
      out.write("							aria-current=\"page\">기업 관리</li>\n");
      out.write("					</ol>\n");
      out.write("					<h6 class=\"font-weight-bolder mb-0\">기업 관리</h6>\n");
      out.write("				</nav>\n");
      out.write("			</div>\n");
      out.write("		</nav>\n");
      out.write("		<div class=\"container-fluid\">\n");
      out.write("			<div class=\"s_wrap\">\n");
      out.write("				<form name=\"fsearch\" id=\"fsearch\">\n");
      out.write("					<input type=\"hidden\" name=\"code\" value=\"list\">\n");
      out.write("					<div class=\"tbl_frm01\">\n");
      out.write("						<table>\n");
      out.write("							<colgroup>\n");
      out.write("								<col class=\"w100\">\n");
      out.write("								<col>\n");
      out.write("							</colgroup>\n");
      out.write("							<tbody>\n");
      out.write("								<tr>\n");
      out.write("									<th scope=\"row\">기업명</th>\n");
      out.write("									<td><input type=\"hidden\" name=\"page\" value=\"1\" />\n");
      out.write("										");
      out.write("\n");
      out.write("										<input type=\"text\" name=\"keyword\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ param.keyword }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" class=\"frm_input\" size=\"30\">\n");
      out.write("									</td>\n");
      out.write("								</tr>\n");
      out.write("								<tr>\n");
      out.write("									<th scope=\"row\">평균 연봉</th>\n");
      out.write("									<td class=\"box text\">\n");
      out.write("										<input type=\"text\" name=\"keyword\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ param.keyword }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" class=\"frm_input\" size=\"13\"> 만원 ~\n");
      out.write("										<input type=\"text\" name=\"keyword\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ param.keyword }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" class=\"frm_input\" size=\"13\"> 만원\n");
      out.write("									</td>\n");
      out.write("								</tr>\n");
      out.write("								<tr>\n");
      out.write("									<th scope=\"row\">기업 구분</th>\n");
      out.write("									<td>\n");
      out.write("										<label class=\"od_status\"> \n");
      out.write("											<input type=\"radio\" name=\"compC\" value=\"0\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.delivery eq '0' ? \" checked\" : \"\" }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("> 전체\n");
      out.write("										</label> \n");
      out.write("										<label class=\"od_status\">\n");
      out.write("											<input type=\"radio\" name=\"compC\" value=\"1\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.delivery eq '1' ? \" checked\" : \"\" }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("> 대기업\n");
      out.write("										</label>\n");
      out.write("										<label class=\"od_status\"> \n");
      out.write("											<input type=\"radio\" name=\"compC\" value=\"2\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.delivery eq '2' ? \" checked\" : \"\" }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("> 중견기업\n");
      out.write("										</label>\n");
      out.write("										<label class=\"od_status\"> \n");
      out.write("											<input type=\"radio\" name=\"compC\" value=\"2\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.delivery eq '2' ? \" checked\" : \"\" }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("> 중소기업\n");
      out.write("										</label>\n");
      out.write("									</td>\n");
      out.write("								</tr>\n");
      out.write("								<tr>\n");
      out.write("									<th scope=\"row\">사원수</th>\n");
      out.write("									<td>\n");
      out.write("										<label class=\"od_status\"> \n");
      out.write("											<input type=\"radio\" name=\"headC\" value=\"0\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.delivery eq '0' ? \" checked\" : \"\" }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("> 전체\n");
      out.write("										</label> \n");
      out.write("										<label class=\"od_status\">\n");
      out.write("											<input type=\"radio\" name=\"headC\" value=\"1\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.delivery eq '1' ? \" checked\" : \"\" }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("> 5인 미만\n");
      out.write("										</label>\n");
      out.write("										<label class=\"od_status\"> \n");
      out.write("											<input type=\"radio\" name=\"headC\" value=\"2\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.delivery eq '2' ? \" checked\" : \"\" }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("> 50인 미만\n");
      out.write("										</label>\n");
      out.write("										<label class=\"od_status\"> \n");
      out.write("											<input type=\"radio\" name=\"headC\" value=\"2\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.delivery eq '2' ? \" checked\" : \"\" }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("> 50인 이상\n");
      out.write("										</label>\n");
      out.write("									</td>\n");
      out.write("								</tr>\n");
      out.write("							</tbody>\n");
      out.write("						</table>\n");
      out.write("					</div>\n");
      out.write("					<div class=\"btn_confirm\">\n");
      out.write("					    <input type=\"submit\" value=\"검색\" class=\"btn btn-secondary btn-sm\"/>\n");
      out.write("						<input type=\"submit\" value=\"초기화\" class=\"btn btn-outline-secondary btn-sm\"/>\n");
      out.write("					</div>\n");
      out.write("				</form>\n");
      out.write("				<div class=\"local_ov mart30\">\n");
      out.write("					전체 : <b class=\"fc_red\">3</b> 건 조회\n");
      out.write("				</div>\n");
      out.write("				<form name=\"forderlist\" id=\"forderlist\" method=\"post\">\n");
      out.write("					<input type=\"hidden\" name=\"q1\" value=\"code=list\"> <input\n");
      out.write("						type=\"hidden\" name=\"page\" value=\"1\">\n");
      out.write("				</form>\n");
      out.write("				<div class=\"tbl_head01\">\n");
      out.write("					<table id=\"sodr_list\">\n");
      out.write("						<colgroup>\n");
      out.write("							<col class=\"w40\">\n");
      out.write("							<col class=\"w40\">\n");
      out.write("							<col class=\"w60\">\n");
      out.write("							<col class=\"w60\">\n");
      out.write("							<col class=\"w90\">\n");
      out.write("							<col class=\"w90\">\n");
      out.write("						</colgroup>\n");
      out.write("						<thead>\n");
      out.write("							<tr>\n");
      out.write("								<th scope=\"col\">번호</th>\n");
      out.write("								<th scope=\"col\">기업로고</th>\n");
      out.write("								<th scope=\"col\">기업이름</th>\n");
      out.write("								<th scope=\"col\">기업구분</th>\n");
      out.write("								<th scope=\"col\">평균연봉</th>\n");
      out.write("								<th scope=\"col\">상세보기</th>\n");
      out.write("							</tr>\n");
      out.write("						</thead>\n");
      out.write("						<tbody>\n");
      out.write("							<tr class=\"list0\">\n");
      out.write("								<td>1</td>\n");
      out.write("								<td>삼성전자</td>\n");
      out.write("								<td>삼성전자</td>\n");
      out.write("								<td>대기업</td>\n");
      out.write("								<td>5,361만</td>\n");
      out.write("								<td>\n");
      out.write("									<input type=\"button\" value=\"바로가기\" class=\"btn btn-outline-secondary btn-sm\" style=\"font-weight: bold; margin: 0px auto;\" onclick=\"location.href='http://localhost/recruit-app/manage/company/detail.jsp'\"/>\n");
      out.write("								</td>\n");
      out.write("							</tr>\n");
      out.write("							<tr class=\"list0\">\n");
      out.write("								<td>2</td>\n");
      out.write("								<td>중소전자</td>\n");
      out.write("								<td>중소전자</td>\n");
      out.write("								<td>중소기업</td>\n");
      out.write("								<td>5,361만</td>\n");
      out.write("								<td>\n");
      out.write("									<input type=\"button\" value=\"바로가기\" class=\"btn btn-outline-secondary btn-sm\" style=\"font-weight: bold; margin: 0px auto;\" onclick=\"location.href='http://localhost/recruit-app/manage/company/detail.jsp'\"/>\n");
      out.write("								</td>\n");
      out.write("							</tr>\n");
      out.write("							<tr class=\"list0\">\n");
      out.write("								<td>3</td>\n");
      out.write("								<td>중견전자</td>\n");
      out.write("								<td>중견전자</td>\n");
      out.write("								<td>중견기업</td>\n");
      out.write("								<td>5,361만</td>\n");
      out.write("								<td>\n");
      out.write("									<input type=\"button\" value=\"바로가기\" class=\"btn btn-outline-secondary btn-sm\" style=\"font-weight: bold; margin: 0px auto;\" onclick=\"location.href='http://localhost/recruit-app/manage/company/detail.jsp'\"/>\n");
      out.write("								</td>\n");
      out.write("							</tr>\n");
      out.write("						</tbody>\n");
      out.write("					</table>\n");
      out.write("				</div>\n");
      out.write("				<div class=\"alignCenter\">\n");
      out.write("					<table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" width=\"100%\">\n");
      out.write("						<tbody>\n");
      out.write("							<tr>\n");
      out.write("								<td align=\"center\">\n");
      out.write("									<div id=\"pageNation\"></div>\n");
      out.write("								</td>\n");
      out.write("								<td align=\"right\">\n");
      out.write("									<input type=\"button\" value=\"등록하기\" class=\"btn btn-outline-success btn-sm float-right\" style=\"font-weight: bold; margin: 10px auto;\" onclick=\"location.href='http://localhost/recruit-app/manage/company/detail.jsp'\" />\n");
      out.write("								</td>\n");
      out.write("							</tr>\n");
      out.write("						</tbody>\n");
      out.write("					</table>\n");
      out.write("					<div style=\"justify-content: center;\">\n");
      out.write("					<nav aria-label=\"Page navigation example\">\n");
      out.write("					  <ul class=\"pagination\" style=\"justify-content: center;\">\n");
      out.write("					    <li>\n");
      out.write("					      <a class=\"page-link\" href=\"#\" aria-label=\"Previous\">\n");
      out.write("					        <span aria-hidden=\"true\">&laquo;</span>\n");
      out.write("					      </a>\n");
      out.write("					    </li>\n");
      out.write("					    <li><a class=\"page-link\" href=\"#\">1</a></li>\n");
      out.write("					    <li><a class=\"page-link\" href=\"#\">2</a></li>\n");
      out.write("					    <li><a class=\"page-link\" href=\"#\">3</a></li>\n");
      out.write("					    <li>\n");
      out.write("					      <a class=\"page-link\" href=\"#\" aria-label=\"Next\">\n");
      out.write("					        <span aria-hidden=\"true\">&raquo;</span>\n");
      out.write("					      </a>\n");
      out.write("					    </li>\n");
      out.write("					  </ul>\n");
      out.write("					</nav>\n");
      out.write("					</div>\n");
      out.write("				</div>\n");
      out.write("			</div>\n");
      out.write("		</div>\n");
      out.write("	</main>\n");
      out.write("</body>\n");
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
