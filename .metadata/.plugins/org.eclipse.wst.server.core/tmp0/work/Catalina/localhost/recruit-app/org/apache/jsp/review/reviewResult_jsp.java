/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.86
 * Generated at: 2024-06-30 12:08:04 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.review;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class reviewResult_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

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
      out.write("<!doctype html>\r\n");
      out.write("<html class=\"no-js win ko-KR\" lang=\"ko-KR\" xmlns=\"http://www.w3.org/1999/xhtml\" prefix=\"og:http://ogp.me/ns#\" xml:lang=\"ko-KR\" foxified=\"\"> \r\n");
      out.write(" <head> \r\n");
      out.write("  <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\"> \r\n");
      out.write("  <title>구지직 GoojzzK</title> \r\n");
      out.write("  <link rel=\"stylesheet\" href=\"http://localhost/recruit-app/assets/css/review/c76e012c05e1318d.css\" crossorigin=\"anonymous\" data-n-g=\"\"> \r\n");
      out.write("  <link rel=\"stylesheet\" href=\"http://localhost/recruit-app/assets/css/review/pretendardvariable-dynamic-subset.min.css\"> \r\n");
      out.write("  <link rel=\"stylesheet\" href=\"http://localhost/recruit-app/assets/css/review/layout.css\"> \r\n");
      out.write("  <link href=\"http://localhost/recruit-app/assets/css/review/common-sv-202405271315.css\" rel=\"stylesheet\" type=\"text/css\"> \r\n");
      out.write("  <link rel=\"stylesheet\" href=\"http://localhost/recruit-app/assets/css/review/pretendard.css\">\r\n");
      out.write("  \r\n");
      out.write("    <link href=\"../assets/css/company/company-info-detail-3.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("    <link href=\"../assets/css/company/company-info-detail-4.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("    <link href=\"../assets/css/company/company-info-detail-5.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("    <link href=\"../assets/css/company/company-info-detail-6.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("	<link href=\"../assets/css/company/company-info-detail-7.css\" rel=\"stylesheet\" type=\"text/css\" /> \r\n");
      out.write("	<link href=\"../assets/css/company/company-info-detail-8.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("	\r\n");
      out.write("	<link href=\"../assets/css/company/company-info-list-6.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("  \r\n");
      out.write("  <style>\r\n");
      out.write("    </style> <!-- golgolz start --> <!--bootstrap 시작--> \r\n");
      out.write("  <link href=\"http://localhost/recruit-app/assets/css/review/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH\" crossorigin=\"anonymous\"> \r\n");
      out.write("  <title>(주)커리어앤스카우트 2024년 기업정보|기업리뷰 3건,5.0 리뷰평점|잡플래닛</title>\r\n");
      out.write("  <link rel=\"stylesheet\" media=\"all\" href=\"http://localhost/recruit-app/assets/css/review/desktop_any_language_newtemp-d32b6cf831bb4740bce993bfd96c569c6baeaf94d7f80f1fd4e9067b626891fe.css\" data-turbolinks-track=\"true\">\r\n");
      out.write("  <link rel=\"stylesheet\" media=\"all\" href=\"http://localhost/recruit-app/assets/css/review/jpcommon_desktop-d7d02c5d04814f9edee3ac58d449a441ba65aefc82944a890cddcc312ac1ad73.css\" data-turbolinks-track=\"true\">\r\n");
      out.write("  <link rel=\"stylesheet\" media=\"all\" href=\"http://localhost/recruit-app/assets/css/review/desktop_common_v2-174463b871c8b1f684e874f394980fc8267d7f870a87bb3185b66ed659e8287e.css\" data-turbolinks-track=\"true\">\r\n");
      out.write("  <link rel=\"stylesheet\" media=\"all\" href=\"http://localhost/recruit-app/assets/css/review/desktop_ko-KR_newtemp-f550b8856ce3e095f203010a136d24dd3b4391f319743678ad50c02ac602f35c.css\" data-turbolinks-track=\"true\">\r\n");
      out.write("  <link rel=\"stylesheet\" media=\"all\" href=\"http://localhost/recruit-app/assets/css/review/desktop_front-fe3c4b71d9e9065f7509e7887570cca6902a467a78a1a74aad66c8f140ccd872.css\" data-turbolinks-track=\"true\">\r\n");
      out.write("  <link rel=\"stylesheet\" media=\"all\" href=\"http://localhost/recruit-app/assets/css/review/desktop_jply_style-5722c441eee9f7605fda329c4150d3eb40981b085c777dd037842f553e51eaf5.css\" data-turbolinks-track=\"true\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"http://localhost/recruit-app/assets/css/review/7f85a56ba4.css\">\r\n");
      out.write("  \r\n");
      out.write("  <style text=\"text/css\">\r\n");
      out.write("		<!-- golgolz start -->\r\n");
      out.write("		\r\n");
      out.write("		/* 포함된 header.jsp의 스타일 */\r\n");
      out.write("        .Menu_MenuNav__EOf3X {\r\n");
      out.write("            color: #666666; /* 폰트 색상 적용 */\r\n");
      out.write("        }\r\n");
      out.write("		<!-- golgolz end -->\r\n");
      out.write("	</style> \r\n");
      out.write(" \r\n");
      out.write("  <script text=\"text/javascript\">\r\n");
      out.write("		$(function(){\r\n");
      out.write("			<!-- golgolz start -->\r\n");
      out.write("			<!-- golgolz end -->\r\n");
      out.write("		});\r\n");
      out.write("	</script> \r\n");
      out.write("	\r\n");
      out.write(" </head> \r\n");
      out.write(" <body class=\"viewReviews before_login schbar_keyword_off chrome fixed_header\" data-locale=\"ko-KR\" data-domain=\"www.jobplanet.co.kr\" data-write-guide-enabled=\"true\"> \r\n");
      out.write("  <div id=\"__next\" data-reactroot=\"\"> \r\n");
      out.write("  ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../assets/layout/user/header.jsp", out, false);
      out.write("\r\n");
      out.write("   \r\n");
      out.write("   <main class=\"JobsFeed_Jobsfeed__DpeV9\"> \r\n");
      out.write("    <section class=\"Section_Section__P1hhc\"> <!-- golgolz start --> \r\n");
      out.write("     <link rel=\"stylesheet\" media=\"all\" href=\"http://localhost/recruit-app/assets/css/review/companies-afa4d7b5c5b020895de3ce30935faf8c1cc0ae8954ef59a46484c2edbc9108d5.css\" data-turbolinks-track=\"true\"> \r\n");
      out.write("    <div class=\"company-header-container\">\r\n");
      out.write("    <div class=\"company-header-branding background-type4\">\r\n");
      out.write("        <div class=\"company-header-branding-container \">\r\n");
      out.write("            <input type=\"hidden\" id=\"mId\" value=\"\">\r\n");
      out.write("            <input type=\"hidden\" id=\"cId\" value=\"\">\r\n");
      out.write("            <input type=\"hidden\" id=\"jkcId\" value=\"nexonhr\">\r\n");
      out.write("            <input type=\"hidden\" id=\"devPath\" value=\"https://www.jobkorea.co.kr\">\r\n");
      out.write("                    <div class=\"logo\"><a href=\"/company/1882711\"><img src=\"//imgs.jobkorea.co.kr/img1/_whitebg/200X80/Co_Logo/Logo/2011/10/2w1aj007Pm_gWzi2y3i2jm0djMcSj_ldjm.gif?v=202406091636&amp;hash=r&amp;serviceCode=CL\" onerror=\"companylogoOnError('//imgs.jobkorea.co.kr/img1/_whitebg/200X80/Co_Logo/Logo/2011/10/2w1aj007Pm_gWzi2y3i2jm0djMcSj_ldjm.gif?v=202406091636&amp;hash=r&amp;serviceCode=CL' , this)\" alt=\"(주)넥슨코리아 로고\" class=\"screen-out\"></a></div>\r\n");
      out.write("            <div class=\"company-header-branding-body\">\r\n");
      out.write("                <div class=\"special-feature\"></div>\r\n");
      out.write("                <div class=\"name\">\r\n");
      out.write("                    (주)넥슨코리아\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"summary\">\r\n");
      out.write("                        <div class=\"summary-item\">넥슨그룹 계열사</div>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"summary-item\">컴퓨터·하드웨어·장비 </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"company-nav\" role=\"navigation\"  style=\"background-color: #ffffff;\">\r\n");
      out.write("    <div class=\"company-nav-container\">\r\n");
      out.write("\r\n");
      out.write("            <a href=\"../companyInfo/user_company_detail.jsp\" class=\"company-nav-item activecompany-nav-item\">\r\n");
      out.write("                <div class=\"name\">기업정보</div>\r\n");
      out.write("                <div class=\"post\">\r\n");
      out.write("                    <div class=\"header screen-out\">게시물</div>\r\n");
      out.write("                    <div class=\"value\"></div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("            </a>\r\n");
      out.write("            \r\n");
      out.write("                <a href=\"reviewResult.jsp\" class=\"company-nav-item active\">\r\n");
      out.write("                    <div class=\"name\">기업리뷰</div>\r\n");
      out.write("                    <div class=\"post\">\r\n");
      out.write("                        <div class=\"header screen-out\">게시물</div>\r\n");
      out.write("                        <div class=\"value\">53</div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </a>\r\n");
      out.write("                <a href=\"../recruit/recruits.jsp\" class=\"company-nav-item \">\r\n");
      out.write("                    <div class=\"name\">채용공고</div>\r\n");
      out.write("                    <div class=\"post\">\r\n");
      out.write("                        <div class=\"header screen-out\">게시물</div>\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                </a>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("    \r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("      <div id=\"contents_wrap\" style=\"background-color: #ffffff;\" > \r\n");
      out.write("       <div id=\"contents\" class=\"jpcont_col2_a\"  > \r\n");
      out.write("        <div id=\"mainContents\" class=\"jpcont_lft\" style=\"\r\n");
      out.write("width: 100%; \r\n");
      out.write("max-width: 1300px; \r\n");
      out.write("margin: 0 auto; \r\n");
      out.write("box-sizing: border-box;\r\n");
      out.write("padding: 20px;         \r\n");
      out.write("          \"> \r\n");
      out.write("          \r\n");
      out.write("         <div id=\"premiumReviewStatistics\" class=\"jpcont_wrap\"> \r\n");
      out.write("          <div class=\"review_stats_wrap review_summary\"  \"> \r\n");
      out.write("           <div class=\"review_stats_container\"> \r\n");
      out.write("            <div class=\"review_stats_wrapper total\"> \r\n");
      out.write("             <div class=\"stats_hd\"> \r\n");
      out.write("              <h2 class=\"stats_ttl\"> <em>전체 리뷰</em> 통계 </h2> \r\n");
      out.write("             </div> \r\n");
      out.write("             <div class=\"stats_smr_sec left_sec \"> \r\n");
      out.write("              <div class=\"rate_star_top\"> \r\n");
      out.write("               <div class=\"rate_star_wrap type2\">\r\n");
      out.write("                <span class=\"rate_point\">5.0</span> \r\n");
      out.write("                <div class=\"rate_star_ty1\">\r\n");
      out.write("                 <span class=\"bg_rate_star\"><span class=\"val_starmark\" style=\"width: 100%;\"><span class=\"alt_txt\">5.0</span></span></span>\r\n");
      out.write("                </div> \r\n");
      out.write("               </div> \r\n");
      out.write("              </div> \r\n");
      out.write("              <div class=\"rate_bar_set barfill total\"> \r\n");
      out.write("               <div class=\"job_tooltip_box hover block\"> \r\n");
      out.write("                <div class=\"rate_bar_group\"> \r\n");
      out.write("                 <div class=\"rate_bar_title\">\r\n");
      out.write("                  이직시 나의 커리어에 도움이 될까요?\r\n");
      out.write("                 </div> \r\n");
      out.write("                 <div class=\"rate_bar_unit\">\r\n");
      out.write("                  <span class=\"rate_bar_val\" style=\"max-width: 100%;\"></span><span class=\"txt_point\">5.0</span>\r\n");
      out.write("                 </div> \r\n");
      out.write("                </div> \r\n");
      out.write("               </div> \r\n");
      out.write("               <div class=\"job_tooltip_box hover block\"> \r\n");
      out.write("                <div class=\"rate_bar_group\"> \r\n");
      out.write("                 <div class=\"rate_bar_title\">\r\n");
      out.write("                  연차를 자유롭게 사용해도 될까요?\r\n");
      out.write("                 </div> \r\n");
      out.write("                 <div class=\"rate_bar_unit\">\r\n");
      out.write("                  <span class=\"rate_bar_val\" style=\"max-width: 100%;\"></span><span class=\"txt_point\">5.0</span>\r\n");
      out.write("                 </div> \r\n");
      out.write("                </div> \r\n");
      out.write("               </div> \r\n");
      out.write("               <div class=\"job_tooltip_box hover block\"> \r\n");
      out.write("                <div class=\"rate_bar_group\"> \r\n");
      out.write("                 <div class=\"rate_bar_title\">\r\n");
      out.write("                  급여는 만족스럽나요?\r\n");
      out.write("                 </div> \r\n");
      out.write("                 <div class=\"rate_bar_unit\">\r\n");
      out.write("                  <span class=\"rate_bar_val\" style=\"max-width: 100%;\"></span><span class=\"txt_point\">5.0</span>\r\n");
      out.write("                 </div> \r\n");
      out.write("                </div> \r\n");
      out.write("               </div> \r\n");
      out.write("               <div class=\"job_tooltip_box hover block\"> \r\n");
      out.write("                <div class=\"rate_bar_group\"> \r\n");
      out.write("                 <div class=\"rate_bar_title\">\r\n");
      out.write("                  복지 혜택이 충분한가요?\r\n");
      out.write("                 </div> \r\n");
      out.write("                 <div class=\"rate_bar_unit\">\r\n");
      out.write("                  <span class=\"rate_bar_val\" style=\"max-width: 100%;\"></span><span class=\"txt_point\">5.0</span>\r\n");
      out.write("                 </div> \r\n");
      out.write("                </div> \r\n");
      out.write("               </div> \r\n");
      out.write("              </div> \r\n");
      out.write("             </div> \r\n");
      out.write("            </div> \r\n");
      out.write("           </div> \r\n");
      out.write("          </div> \r\n");
      out.write("         </div> \r\n");
      out.write("         <div id=\"premiumReviewChart\" class=\"jpcont_wrap\"></div><!-- 프리미엄 --> <!--<div class=\"jpcont_wrap\">\r\n");
      out.write("      </div>--> \r\n");
      out.write("         <div id=\"reviewsContainer\" class=\"jpcont_wrap\"> \r\n");
      out.write("          <article id=\"viewReviewsFilter\" class=\"filter\"> \r\n");
      out.write("           <div class=\"col1Wrap jply_review_filter\"> \r\n");
      out.write("           </div> \r\n");
      out.write("           <div id=\"viewReviewsTitle\" class=\"result\">\r\n");
      out.write("             총 <span class=\"num\">3</span>개의 기업리뷰 \r\n");
      out.write("           </div> \r\n");
      out.write("          </article> \r\n");
      out.write("          <article id=\"viewReviewsList\" class=\"article_ty1\"> \r\n");
      out.write("           <div class=\"section_wrap\"> \r\n");
      out.write("            <div class=\"section_body\"> \r\n");
      out.write("             <div class=\"section_group\"> \r\n");
      out.write("              <section class=\"content_ty4 video_ad_content\" data-content_type=\"review\" data-content_id=\"3038782\" data-company_id=\"361411\"> \r\n");
      out.write("               <div class=\"content_wrap\"> \r\n");
      out.write("                <div class=\"content_top_ty2\"> <span class=\"ico_pers\"></span> <span class=\"txt1\">영업/제휴</span> <span class=\"vbar\">|</span> <span class=\"txt1\"> 현직원 </span> <span class=\"vbar\">|</span> <span class=\"txt1\">서울</span> <span class=\"vbar\">|</span> <span class=\"txt1\">2022. 05</span> \r\n");
      out.write("                </div> \r\n");
      out.write("                <div class=\"ctbody_col2\"> \r\n");
      out.write("                 <dl class=\"ctbody_lft\"> \r\n");
      out.write("                  <dd class=\"sta_box\"> \r\n");
      out.write("                   <div class=\"us_star_m\"> \r\n");
      out.write("                    <div class=\"star_score\" style=\"width:80%;\">\r\n");
      out.write("                     평점\r\n");
      out.write("                    </div> \r\n");
      out.write("                   </div> \r\n");
      out.write("                  </dd> \r\n");
      out.write("                  <dt class=\"df_tit\">\r\n");
      out.write("                   커리어\r\n");
      out.write("                  </dt> \r\n");
      out.write("                  <dd class=\"blo_box1\"> \r\n");
      out.write("                   <div class=\"us_bl_s\"> \r\n");
      out.write("                    <div class=\"bl_score\" style=\"width:100%;\">\r\n");
      out.write("                     평점\r\n");
      out.write("                    </div> \r\n");
      out.write("                   </div> \r\n");
      out.write("                  </dd> \r\n");
      out.write("                  <dt class=\"df_tit\">\r\n");
      out.write("                   휴가 및 연차\r\n");
      out.write("                  </dt> \r\n");
      out.write("                  <dd class=\"blo_box1\"> \r\n");
      out.write("                   <div class=\"us_bl_s\"> \r\n");
      out.write("                    <div class=\"bl_score\" style=\"width:60%;\">\r\n");
      out.write("                     평점\r\n");
      out.write("                    </div> \r\n");
      out.write("                   </div> \r\n");
      out.write("                  </dd> \r\n");
      out.write("                  <dt class=\"df_tit\">\r\n");
      out.write("                   연봉\r\n");
      out.write("                  </dt> \r\n");
      out.write("                  <dd class=\"blo_box1\"> \r\n");
      out.write("                   <div class=\"us_bl_s\"> \r\n");
      out.write("                    <div class=\"bl_score\" style=\"width:60%;\">\r\n");
      out.write("                     평점\r\n");
      out.write("                    </div> \r\n");
      out.write("                   </div> \r\n");
      out.write("                  </dd> \r\n");
      out.write("                  <dt class=\"df_tit\">\r\n");
      out.write("                   복지 혜택\r\n");
      out.write("                  </dt> \r\n");
      out.write("                  <dd class=\"blo_box1\"> \r\n");
      out.write("                   <div class=\"us_bl_s\"> \r\n");
      out.write("                    <div class=\"bl_score\" style=\"width:80%;\">\r\n");
      out.write("                     평점\r\n");
      out.write("                    </div> \r\n");
      out.write("                   </div> \r\n");
      out.write("                  </dd> \r\n");
      out.write("                 </dl> \r\n");
      out.write("                 <div class=\"content_body_ty1\"> \r\n");
      out.write("                  <div class=\"us_label_wrap\"> \r\n");
      out.write("                   <h2 class=\"us_label \"> <span class=\"us_label_box\">BEST</span> \"완벽한 회사는 아니고 부족한 점도 많지만, 어쨌든 미래를 보고 다니는 회사\" </h2> \r\n");
      out.write("                  </div> \r\n");
      out.write("                  <dl class=\"tc_list\"> \r\n");
      out.write("                   <dt class=\"merit\">\r\n");
      out.write("                    장점\r\n");
      out.write("                   </dt> \r\n");
      out.write("                   <dd class=\"df1\"> <span>- 글로벌 진출이라는게 이런 것이구나 라는 것을 체감할 수 있음. 많을 때는 회사의 1/3은 해외 어딘가에 나가있는 듯. <br>- 해외영업/기술영업에 뜻이 있고, sales-driven한 환경에서 제품 개발에도 참여하면서 커리어를 발전시키고 싶다면 생각해 볼만한 환경임. <br>- 딜을 성사시킨 것이 실물로 나타나고 눈 앞에서 작동하는 것을 볼 때의 쾌감이 있음.</span> \r\n");
      out.write("                   </dd> \r\n");
      out.write("                   <dt class=\"disadvantages\">\r\n");
      out.write("                    단점\r\n");
      out.write("                   </dt> \r\n");
      out.write("                   <dd class=\"df1\"> <span>- 유연함의 이면에 감춰진 혼란함. 이젠 규모가 꽤 되는데, 아직도 갖춰지지 않은게 많음. <br>- 다른 리뷰에서 언급된 탁구대, 다트는 이미 예전에 없어졌고, 회사 규모가 커지면서 자연스럽게 한 팀으로 돌아갈 수 있는 시기는 지난 듯. 조금씩이지만 계속 나아지고는 있는 건 다행이랄까. <br>- 분야가 조금 특수하기 때문에 자신이랑 안 맞는다고 느끼기 쉬울 듯. 새로운 분야에서 빠르게 학습하며 새로운 스킬셋을 쌓는다고 생각하고 많이 공부하고 노력해야 함.</span> \r\n");
      out.write("                   </dd> \r\n");
      out.write("                   <dt class=\"df_tit\">\r\n");
      out.write("                    경영진에 바라는 점\r\n");
      out.write("                   </dt> \r\n");
      out.write("                   <dd class=\"df1\"> <span>아직 스타트업이라고 하지만 이제 규모도 꽤 커졌고, 현 직원들과 지원자들이 회사를 바라보는 관점과 기대치도 달라지고 있습니다. 기술과 사업이 확장되는 만큼 체계를 갖추고 조직을 안정화하는 일에도 더 많은<br> 신경을 써주세요.</span> \r\n");
      out.write("                   </dd> \r\n");
      out.write("                   <dd style=\"display: flex; justify-content: flex-end; margin-top: 20px;\"> <button type=\"button\" class=\"btn btn-dark\">추천</button> \r\n");
      out.write("                   </dd> \r\n");
      out.write("                  </dl> \r\n");
      out.write("                 </div> \r\n");
      out.write("                </div> \r\n");
      out.write("               </div> \r\n");
      out.write("              </section> \r\n");
      out.write("				<div class=\"pg_bottom um_pagination\"> \r\n");
      out.write("  <div style=\"text-align:center;\">\r\n");
      out.write("    <button id=\"load-more-btn\" class=\"load-more\">더보기...</button>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("             </div> \r\n");
      out.write("            </div> \r\n");
      out.write("           </div> \r\n");
      out.write("          </article> \r\n");
      out.write("         </div> \r\n");
      out.write("        </div> \r\n");
      out.write("       </div> \r\n");
      out.write("      </div> \r\n");
      out.write("     <!-- golgolz end --> \r\n");
      out.write("    </section> \r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../assets/layout/user/footer.jsp", out, false);
      out.write(" \r\n");
      out.write("   </main> \r\n");
      out.write("  </div>  \r\n");
      out.write(" </body>\r\n");
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
