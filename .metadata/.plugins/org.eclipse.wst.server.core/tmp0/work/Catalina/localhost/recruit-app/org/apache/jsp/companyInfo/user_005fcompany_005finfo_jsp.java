/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.86
 * Generated at: 2024-06-23 09:14:07 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.companyInfo;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class user_005fcompany_005finfo_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<!-- <link href=\"../assets/css/company/company-info-list-1.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<link href=\"../assets/css/company/company-info-list-2.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<link href=\"../assets/css/company/company-info-list-3.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<link href=\"../assets/css/company/company-info-list-4.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<link href=\"../assets/css/company/company-info-list-5.css\" rel=\"stylesheet\" type=\"text/css\" /> 헤더 변경됨 -->\r\n");
      out.write("<!-- <link href=\"../assets/css/company/company-info-list-7.css\" rel=\"stylesheet\" type=\"text/css\" /> -->\r\n");
      out.write("<link href=\"../assets/css/company/company-info-list-6.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH\" crossorigin=\"anonymous\">\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz\" crossorigin=\"anonymous\"></script>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../assets/layout/user/lib.jsp", out, false);
      out.write("  \r\n");
      out.write("<!-- golgolz start -->\r\n");
      out.write("	<!-- golgolz end -->\r\n");
      out.write("<style text=\"text/css\">\r\n");
      out.write("	#btnSearchCompany{width:70px; height:40px; background-color:#FFFFFF; border:1px solid #333; margin-left:5px; font-size:15px}\r\n");
      out.write("	#content{\r\n");
      out.write("			width: 100%;\r\n");
      out.write("			max-width: 1300px;\r\n");
      out.write("			margin: 0 auto;\r\n");
      out.write("			box-sizing: border-box;\r\n");
      out.write("			padding: 20px;\r\n");
      out.write("	}\r\n");
      out.write("	#companyinfoList{ display:none; }\r\n");
      out.write("	.btnCompany{\r\n");
      out.write("		background-color: white;\r\n");
      out.write("		font-size: 12px;\r\n");
      out.write("		color: black;\r\n");
      out.write("		padding: 5px 10px;\r\n");
      out.write("		border: 1px solid #ccc;\r\n");
      out.write("		border-radius: 10px;\r\n");
      out.write("	}\r\n");
      out.write("</style>\r\n");
      out.write("<script text=\"text/javascript\">\r\n");
      out.write("	$(function(){\r\n");
      out.write("		<!-- golgolz start -->\r\n");
      out.write("		$(\"li\").slice(0, 5).show(); // 초기갯수\r\n");
      out.write("	    $(\"#load\").click(function(e){ // 클릭시 more\r\n");
      out.write("	        e.preventDefault();\r\n");
      out.write("	        $(\"li:hidden\").slice(0, 5).show(); // 클릭시 more 갯수 지정\r\n");
      out.write("	        if($(\"li:hidden\").length == 0){ // 컨텐츠 남아있는지 확인\r\n");
      out.write("	        	$(\"#load\").hide(); // 더 보기 버튼 숨기기\r\n");
      out.write("	        }\r\n");
      out.write("	    });\r\n");
      out.write("		<!-- golgolz end -->\r\n");
      out.write("	});\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <div id=\"__next\" data-reactroot=\"\">\r\n");
      out.write("		");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../assets/layout/user/header.jsp", out, false);
      out.write("\r\n");
      out.write("		<main class=\"JobsFeed_Jobsfeed__DpeV9\">  \r\n");
      out.write("			<section class=\"Section_Section__P1hhc\">\r\n");
      out.write("			<!-- golgolz start -->\r\n");
      out.write("			<div id=\"content\">\r\n");
      out.write("    <form id=\"frmSearchCompany\" action=\"/Salary/Index#salarySearchCompany\" method=\"get\">\r\n");
      out.write("        <div class=\"row salarySearchCompany\" id=\"salarySearchCompany\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"search searchCompany\">\r\n");
      out.write("                    <!-- <div class=\"popup\" aria-live=\"polite\" aria-hidden=\"true\" id=\"autocompletePane\">\r\n");
      out.write("                        <div class=\"noResult\" id=\"noResultPane\" style=\"display:none\">\r\n");
      out.write("                            <p>검색 결과가 없음.</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"list\" id=\"recommendPane\" style=\"display:none\">\r\n");
      out.write("                            <ul></ul>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"list\" id=\"resultPane\" style=\"display:none\">\r\n");
      out.write("                            <ul></ul>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"popupFooter\" id=\"recommendButtonPane\" style=\"display:none\">\r\n");
      out.write("                            <button type=\"button\" class=\"button buttonDeleteAll\"><span>전체삭제</span></button>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div> -->\r\n");
      out.write("                </div>\r\n");
      out.write("                <div style=\"border:1px solid #ccc; padding-top:30px; padding-bottom:20px; margin:auto; width:950px;\">\r\n");
      out.write("                <div style=\"margin-bottom:18px; text-align:left; margin-left:45px; font-size:22px; color:#333\"><strong>기업 검색</strong></div>\r\n");
      out.write("                    <table style=\"margin:auto; border-collapse:collapse; width:100%; height:180px\">\r\n");
      out.write("                        <tbody>\r\n");
      out.write("                            <tr style=\"border-top:1px solid #ccc; border-bottom:1px solid #ccc;\">\r\n");
      out.write("                                <th style=\"border-left:1px solid transparent; font-size:15px; border-right:1px solid transparent; color:black;\">기업명</th>\r\n");
      out.write("                                <td style=\"text-align:left; padding-left:20px; border-left:1px solid transparent; border-right:1px solid transparent;\">\r\n");
      out.write("                                    <input type=\"text\" name=\"company_name\" value=\"\" style=\"border:1px solid #ccc; width:250px; height:22px;\">\r\n");
      out.write("                                </td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <tr style=\"border-bottom:1px solid #ccc;\">\r\n");
      out.write("                                <th style=\"border-left:1px solid transparent; font-size:15px; border-right:1px solid transparent; color:black;\">평균 연봉</th>\r\n");
      out.write("                                <td style=\"text-align:left; padding-left:20px; border-left:1px solid transparent; border-right:1px solid transparent;\">\r\n");
      out.write("                                    <input type=\"text\" name=\"avg_sal\" value=\"\" style=\"border:1px solid #ccc; width:100px; height:22px;\"><span style=\"font-size:13px; color:black\"> 만원 이상</span>\r\n");
      out.write("                                </td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <tr style=\"border-bottom:1px solid #ccc;\">\r\n");
      out.write("                                <th style=\"border-left:1px solid transparent; font-size:15px; border-right:1px solid transparent; color:black;\">기업 구분</th>\r\n");
      out.write("                                <td style=\"text-align:left; padding-left:20px; border-left:1px solid transparent; border-right:1px solid transparent;\">\r\n");
      out.write("                                    <label style=\"margin-left:10px\">\r\n");
      out.write("                                        <input type=\"radio\" name=\"company-classification\" value=\"0\"><span style=\"font-size:13px; color:black\"> 대기업</span>\r\n");
      out.write("                                    </label>\r\n");
      out.write("                                    <label style=\"margin-left:10px\">\r\n");
      out.write("                                        <input type=\"radio\" name=\"company-classification\" value=\"1\"><span style=\"font-size:13px; color:black\"> 중견기업</span>\r\n");
      out.write("                                    </label>\r\n");
      out.write("                                    <label style=\"margin-left:10px\">\r\n");
      out.write("                                        <input type=\"radio\" name=\"company-classification\" value=\"2\"><span style=\"font-size:13px; color:black\"> 중소기업</span>\r\n");
      out.write("                                    </label>\r\n");
      out.write("                                </td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <tr style=\"border-bottom:1px solid #ccc;\">\r\n");
      out.write("                                <td colspan=\"2\" style=\"text-align:center; margin-right:50px; border-left:1px solid transparent; border-right:1px solid transparent; border-bottom:1px solid transparent; color:black;\">\r\n");
      out.write("                                    <input type=\"submit\" value=\"검색\" class=\"btn btn-secondary btn-lg\"/>\r\n");
      out.write("                                    <input type=\"submit\" value=\"초기화\" style=\"color:black\" class=\"btn btn-outline-secondary btn-lg\"/>\r\n");
      out.write("                                </td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                        </tbody>\r\n");
      out.write("                    </table>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"row salaryList salaryCompanyList\" style=\"margin-top:30px\">\r\n");
      out.write("            <input type=\"hidden\" id=\"hidMemChk\" value=\"0\" />\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"listHeader\">\r\n");
      out.write("                    <div class=\"total\">총 <em>1</em>건<span class=\"subtitle\"></span></div>\r\n");
      out.write("                    <div style=\"text-align:right\">\r\n");
      out.write("                    	<input class=\"btnCompany\" type=\"button\" value=\"최신등록순\"/>\r\n");
      out.write("                    	<input class=\"btnCompany\" type=\"button\" value=\"기업이름순\"/>\r\n");
      out.write("                    	<input class=\"btnCompany\" type=\"button\" value=\"평균연봉 높은순\"/>\r\n");
      out.write("                    	<input class=\"btnCompany\" type=\"button\" value=\"사원 많은순\"/>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"noData\" id=\"listNoData\" style=\"display:none\">\r\n");
      out.write("                    <p><strong>‘직무선택’</strong>에 대한 검색결과가 없습니다.<br>다른 검색어로 검색해주세요.</p>\r\n");
      out.write("                </div>\r\n");
      out.write("                <ul class=\"list\" id=\"listCompany\" style=\"padding-top:30px\" >\r\n");
      out.write("                    <li id=\"companyinfoList_1\">\r\n");
      out.write("                        <a href=\"http://localhost/recruit-app/companyInfo/user_company_detail.jsp\" target=\"_blank\">\r\n");
      out.write("                            <div class=\"thumbnail\">\r\n");
      out.write("                                <img src=\"//imgs.jobkorea.co.kr/img1/_whitebg/200X80/Co_Logo/Logo/2011/10/2w1aj007Pm_gWzi2y3i2jm0djMcSj_ldjm.gif?v=202406041618&amp;hash=r&amp;serviceCode=CL\" onerror=\"companylogoOnError('/salary/logourl?ucono=1882711' , this)\">\r\n");
      out.write("                                <div class=\"inner\">넥슨코리아</div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"headers\">\r\n");
      out.write("                                <div class=\"text\">넥슨코리아</div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"summary\">\r\n");
      out.write("                                <div class=\"item\">매출액 3조 9000억</div>\r\n");
      out.write("                                <div class=\"item\">사원수 3,500명</div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"salary\">\r\n");
      out.write("                                <div class=\"inner\"><strong>2,847</strong>만원</div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li id=\"companyinfoList_2\">\r\n");
      out.write("                        <a href=\"http://localhost/recruit-app/companyInfo/user_company_detail.jsp\" target=\"_blank\">\r\n");
      out.write("                            <div class=\"thumbnail\">\r\n");
      out.write("                                <img src=\"//imgs.jobkorea.co.kr/img1/_whitebg/200X80/Co_Logo/Logo/2011/10/2w1aj007Pm_gWzi2y3i2jm0djMcSj_ldjm.gif?v=202406041618&amp;hash=r&amp;serviceCode=CL\" onerror=\"companylogoOnError('/salary/logourl?ucono=1882711' , this)\">\r\n");
      out.write("                                <div class=\"inner\">넥슨코리아</div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"headers\">\r\n");
      out.write("                                <div class=\"text\">넥슨코리아</div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"summary\">\r\n");
      out.write("                                <div class=\"item\">매출액 3조 9000억</div>\r\n");
      out.write("                                <div class=\"item\">사원수 3,500명</div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"salary\">\r\n");
      out.write("                                <div class=\"inner\"><strong>2,847</strong>만원</div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li id=\"companyinfoList_3\">\r\n");
      out.write("                        <a href=\"http://localhost/recruit-app/companyInfo/user_company_detail.jsp\" target=\"_blank\">\r\n");
      out.write("                            <div class=\"thumbnail\">\r\n");
      out.write("                                <img src=\"//imgs.jobkorea.co.kr/img1/_whitebg/200X80/Co_Logo/Logo/2011/10/2w1aj007Pm_gWzi2y3i2jm0djMcSj_ldjm.gif?v=202406041618&amp;hash=r&amp;serviceCode=CL\" onerror=\"companylogoOnError('/salary/logourl?ucono=1882711' , this)\">\r\n");
      out.write("                                <div class=\"inner\">넥슨코리아</div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"headers\">\r\n");
      out.write("                                <div class=\"text\">넥슨코리아</div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"summary\">\r\n");
      out.write("                                <div class=\"item\">매출액 3조 9000억</div>\r\n");
      out.write("                                <div class=\"item\">사원수 3,500명</div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"salary\">\r\n");
      out.write("                                <div class=\"inner\"><strong>2,847</strong>만원</div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li id=\"companyinfoList_4\">\r\n");
      out.write("                        <a href=\"http://localhost/recruit-app/companyInfo/user_company_detail.jsp\" target=\"_blank\">\r\n");
      out.write("                            <div class=\"thumbnail\">\r\n");
      out.write("                                <img src=\"//imgs.jobkorea.co.kr/img1/_whitebg/200X80/Co_Logo/Logo/2011/10/2w1aj007Pm_gWzi2y3i2jm0djMcSj_ldjm.gif?v=202406041618&amp;hash=r&amp;serviceCode=CL\" onerror=\"companylogoOnError('/salary/logourl?ucono=1882711' , this)\">\r\n");
      out.write("                                <div class=\"inner\">넥슨코리아</div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"headers\">\r\n");
      out.write("                                <div class=\"text\">넥슨코리아</div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"summary\">\r\n");
      out.write("                                <div class=\"item\">매출액 3조 9000억</div>\r\n");
      out.write("                                <div class=\"item\">사원수 3,500명</div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"salary\">\r\n");
      out.write("                                <div class=\"inner\"><strong>2,847</strong>만원</div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li id=\"companyinfoList_5\">\r\n");
      out.write("                        <a href=\"http://localhost/recruit-app/companyInfo/user_company_detail.jsp\" target=\"_blank\">\r\n");
      out.write("                            <div class=\"thumbnail\">\r\n");
      out.write("                                <img src=\"//imgs.jobkorea.co.kr/img1/_whitebg/200X80/Co_Logo/Logo/2011/10/2w1aj007Pm_gWzi2y3i2jm0djMcSj_ldjm.gif?v=202406041618&amp;hash=r&amp;serviceCode=CL\" onerror=\"companylogoOnError('/salary/logourl?ucono=1882711' , this)\">\r\n");
      out.write("                                <div class=\"inner\">넥슨코리아</div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"headers\">\r\n");
      out.write("                                <div class=\"text\">넥슨코리아</div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"summary\">\r\n");
      out.write("                                <div class=\"item\">매출액 3조 9000억</div>\r\n");
      out.write("                                <div class=\"item\">사원수 3,500명</div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"salary\">\r\n");
      out.write("                                <div class=\"inner\"><strong>2,847</strong>만원</div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li id=\"companyinfoList\">\r\n");
      out.write("                        <a href=\"http://localhost/recruit-app/companyInfo/user_company_detail.jsp\" target=\"_blank\">\r\n");
      out.write("                            <div class=\"thumbnail\">\r\n");
      out.write("                                <img src=\"//imgs.jobkorea.co.kr/img1/_whitebg/200X80/Co_Logo/Logo/2011/10/2w1aj007Pm_gWzi2y3i2jm0djMcSj_ldjm.gif?v=202406041618&amp;hash=r&amp;serviceCode=CL\" onerror=\"companylogoOnError('/salary/logourl?ucono=1882711' , this)\">\r\n");
      out.write("                                <div class=\"inner\">넥슨코리아</div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"headers\">\r\n");
      out.write("                                <div class=\"text\">넥슨코리아</div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"summary\">\r\n");
      out.write("                                <div class=\"item\">매출액 3조 9000억</div>\r\n");
      out.write("                                <div class=\"item\">사원수 3,500명</div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"salary\">\r\n");
      out.write("                                <div class=\"inner\"><strong>2,847</strong>만원</div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li id=\"companyinfoList\">\r\n");
      out.write("                        <a href=\"http://localhost/recruit-app/companyInfo/user_company_detail.jsp\" target=\"_blank\">\r\n");
      out.write("                            <div class=\"thumbnail\">\r\n");
      out.write("                                <img src=\"//imgs.jobkorea.co.kr/img1/_whitebg/200X80/Co_Logo/Logo/2011/10/2w1aj007Pm_gWzi2y3i2jm0djMcSj_ldjm.gif?v=202406041618&amp;hash=r&amp;serviceCode=CL\" onerror=\"companylogoOnError('/salary/logourl?ucono=1882711' , this)\">\r\n");
      out.write("                                <div class=\"inner\">넥슨코리아</div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"headers\">\r\n");
      out.write("                                <div class=\"text\">넥슨코리아</div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"summary\">\r\n");
      out.write("                                <div class=\"item\">매출액 3조 9000억</div>\r\n");
      out.write("                                <div class=\"item\">사원수 3,500명</div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"salary\">\r\n");
      out.write("                                <div class=\"inner\"><strong>2,847</strong>만원</div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    \r\n");
      out.write("                    <div style=\"/* border-top:1px solid #ccc; */ height:50px; width:100%; text-align:center;font-size:18px; padding-top:5px\">\r\n");
      out.write("                    	<a href=\"#\" id=\"load\">더 보기 +</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- <div style=\"text-align:center;\">\r\n");
      out.write("                <nav aria-label=\"...\">\r\n");
      out.write("                    <ul class=\"pagination pagination-lg\" style=\"display: inline-flex;\">\r\n");
      out.write("                        <li class=\"page-item disabled\">\r\n");
      out.write("                            <span class=\"page-link\">&lt;</span>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"page-item\"><a class=\"page-link\" href=\"#\">1</a></li>\r\n");
      out.write("                        <li class=\"page-item active\" aria-current=\"page\">\r\n");
      out.write("                            <span class=\"page-link\">2</span>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"page-item\"><a class=\"page-link\" href=\"#\">3</a></li>\r\n");
      out.write("                        <li class=\"page-item\">\r\n");
      out.write("                            <a class=\"page-link\" href=\"#\">&gt;</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </nav>\r\n");
      out.write("            </div> -->\r\n");
      out.write("        </div>\r\n");
      out.write("    </form>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("			<!-- golgolz end -->\r\n");
      out.write("			</section>\r\n");
      out.write("			");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../assets/layout/user/footer.jsp", out, false);
      out.write("  \r\n");
      out.write("		</main>\r\n");
      out.write("	</div>\r\n");
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
