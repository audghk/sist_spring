/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.86
 * Generated at: 2024-07-14 16:48:57 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.user.mypage.qna;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class mypageWriteQNA_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/C:/dev/workspace_spring/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/recruit-app/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1716272562048L));
  }

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
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../../../assets/layout/user/lib.jsp", out, false);
      out.write("  \r\n");
      out.write("    <link href=\"https://i.jobkorea.kr/content/css/ver_2/mtc/mtc_lounge-sv-202402231655.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("    <link href=\"https://i.jobkorea.kr/content/css/ver_2/help/help-sv-202402231655.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("    <link rel=\"shortcut icon\" href=\"https://static.wanted.co.kr/favicon/new/favicon.ico\"/>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://asset.wanted.co.kr/userweb/www/_next/static/css/c76e012c05e1318d.css\" crossorigin=\"anonymous\" data-n-g=\"\"/>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"http://localhost/recruit-app/assets/css/mypage.css\"/>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"http://localhost/recruit-app/assets/css/signup.css\"/>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"http://localhost/recruit-app/assets/css/layout/user/btn-bootstrap.css\" />\r\n");
      out.write("    <style type=\"text/css\">\r\n");
      out.write("    </style>\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("    $(function(){\r\n");
      out.write("    	 $(\"#btnSend\").click(function(event){\r\n");
      out.write("             var category = $(\"#category\").val();\r\n");
      out.write("             var title = $(\"#title\").val();\r\n");
      out.write("             var content = $(\"#content\").val();\r\n");
      out.write("             var agree = $(\"#lb_agree\").is(\":checked\");\r\n");
      out.write("             \r\n");
      out.write("             if (category === \"\") {\r\n");
      out.write("                 alert(\"카테고리를 선택하세요.\");\r\n");
      out.write("                 event.preventDefault();\r\n");
      out.write("             } else if (title.trim() === \"\") {\r\n");
      out.write("                 alert(\"제목을 입력하세요.\");\r\n");
      out.write("                 event.preventDefault();\r\n");
      out.write("             } else if (content.trim() === \"\") {\r\n");
      out.write("                 alert(\"내용을 입력하세요.\");\r\n");
      out.write("                 event.preventDefault();\r\n");
      out.write("             } else if (!agree) {\r\n");
      out.write("                 alert(\"개인정보 수집 및 이용에 동의해주세요.\");\r\n");
      out.write("                 event.preventDefault();\r\n");
      out.write("             } else {\r\n");
      out.write("                 $(\"#Qnaform\").submit();\r\n");
      out.write("             }\r\n");
      out.write("         });\r\n");
      out.write("     });\r\n");
      out.write("    </script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <div id=\"__next\" data-reactroot=\"\">\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../../../assets/layout/user/header.jsp", out, false);
      out.write("\r\n");
      out.write("        <main class=\"JobsFeed_Jobsfeed__DpeV9\">  \r\n");
      out.write("            <section class=\"Section_Section__P1hhc\">\r\n");
      out.write("                <div class=\"MainLayout_MainLayout__root__p6itg\">\r\n");
      out.write("                    <div class=\"Grid_Grid__container__J9CcC Grid_Grid__spacing__5__ZwgDV\">\r\n");
      out.write("                        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../mypage_layout.jsp", out, false);
      out.write("\r\n");
      out.write("                        <div class=\"Grid_Grid__item__FUkSS Grid_Grid__justify_center__QJu2X Grid_Grid__align-items_flex-start__PA0JE Grid_Grid__grid__xs__12__rVqKh Grid_Grid__grid__md__6__9g_JE\" style=\"margin-left:30px\">\r\n");
      out.write("                            <div style=\"margin:30px auto 0; width:731px\">\r\n");
      out.write("                                <div class=\"loungeContent inquiryContent inquiryContent--selection\">\r\n");
      out.write("                                    <div class=\"topHdWrap\">\r\n");
      out.write("                                        <h1 style=\"font-size: 25px;\"><strong>문의</strong></h1>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"inquiryFormWrap\">\r\n");
      out.write("                                        <div class=\"mtcTplTab\">\r\n");
      out.write("                                            <ul class=\"tabItems\">\r\n");
      out.write("                                                <li class=\"on\"><a href=\"http://localhost/recruit-app/user/mypage/qna/mypageQnaForm.do\">문의</a></li>\r\n");
      out.write("                                                <li class=\"\"><a href=\"http://localhost/recruit-app/user/mypage/qna/mypageQNAList.do\">문의 내역</a></li>\r\n");
      out.write("                                            </ul>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"inquiryForm inquiryForm--selection\">\r\n");
      out.write("                                            <form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/user/mypage/qna/mypageWriteQNA.do\" method=\"post\" id=\"Qnaform\">\r\n");
      out.write("                                                <fieldset>\r\n");
      out.write("                                                    <legend>문의하기 입력</legend>\r\n");
      out.write("                                                    <div class=\"tbInquiryBx\">\r\n");
      out.write("                                                        <div class=\"tbRow\">\r\n");
      out.write("                                                            <div class=\"tbCell tbTh\">문의종류 <em>(필수)</em></div>\r\n");
      out.write("                                                            <div class=\"tbCell\">\r\n");
      out.write("                                                                <div>\r\n");
      out.write("                                                                    <label for=\"lb_view_1\" id=\"lb_type\"></label>\r\n");
      out.write("                                                                    <select style=\"width:180px; height:35px\" id=\"category\" name=\"category\">\r\n");
      out.write("                                                                        <option value=\"\">선택</option>\r\n");
      out.write("                                                                        <option value=\"서비스 문의\">서비스 문의</option>\r\n");
      out.write("                                                                        <option value=\"오류신고\">오류 신고</option>\r\n");
      out.write("                                                                        <option value=\"제안사항\">제안 사항</option>\r\n");
      out.write("                                                                    </select>\r\n");
      out.write("                                                                </div>\r\n");
      out.write("                                                            </div>\r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                        <div class=\"tbRow\">\r\n");
      out.write("                                                            <div class=\"tbCell tbTh\"><label for=\"title\">제목 <em>(필수)</em></label></div>\r\n");
      out.write("                                                            <div class=\"tbCell\">\r\n");
      out.write("                                                                <textarea name=\"title\" id=\"title\" title=\"제목을 입력하세요.\" style=\"height:35px; width:400px ;font-size:15px\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.title}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</textarea>\r\n");
      out.write("                                                            </div>\r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                        <div class=\"tbRow\">\r\n");
      out.write("                                                            <div class=\"tbCell tbTh\"><label for=\"content\">내용 <em>(필수)</em></label></div>\r\n");
      out.write("                                                            <div>\r\n");
      out.write("                                                                <textarea name=\"content\" id=\"content\" title=\"내용을 입력하세요.\" style=\"height:350px; width:400px\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.content}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</textarea>\r\n");
      out.write("                                                            </div>\r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                        <div id=\"privacyBx1\" class=\"privacyBx\">\r\n");
      out.write("                                                            <div class=\"mtcChk-Bx privacyBx__check-box\">\r\n");
      out.write("                                                                <input type=\"checkbox\" id=\"lb_agree\" name=\"\" value=\"\" />\r\n");
      out.write("                                                                <label for=\"lb_agree\" class=\"bxIpt privacyBx__title\">개인정보 수집 및 이용에 동의합니다.</label>\r\n");
      out.write("                                                            </div>\r\n");
      out.write("                                                            <dl>\r\n");
      out.write("                                                                <dt class=\"privacyBx__title\" for=\"lb_agree\"></dt>\r\n");
      out.write("                                                                <dd class=\"privacyBx__info\">\r\n");
      out.write("                                                                    <span class=\"privacyBx__info privacyBx__info--black\">문의에 대한 처리 및 답변을 위해 아이디, e-메일 정보가 수집</span>되며, 수집된 정보는 <span class=\"privacyBx__info privacyBx__info--black\">3년간 보관</span>합니다.<br>회원님은 동의를 거부할 수 있으며, 거부 시 응대지원이 원활하지 않을 수 있습니다.\r\n");
      out.write("                                                                </dd>\r\n");
      out.write("                                                            </dl>\r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                        <div class=\"inquiryBtn\" style=\"margin-bottom:30px\">\r\n");
      out.write("                                                            <button type=\"submit\" class=\"btnInq\" id=\"btnSend\"><span>문의하기</span></button>\r\n");
      out.write("                                                            <button type=\"button\" class=\"btnInq btnCancel\"><span>취소</span></button>\r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                </fieldset>\r\n");
      out.write("                                            </form>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </section>\r\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../../../assets/layout/user/footer.jsp", out, false);
      out.write("\r\n");
      out.write("        </main>\r\n");
      out.write("    </div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
