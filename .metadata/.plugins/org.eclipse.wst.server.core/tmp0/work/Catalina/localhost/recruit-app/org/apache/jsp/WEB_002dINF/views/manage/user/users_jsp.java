/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.86
 * Generated at: 2024-07-13 07:23:31 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.manage.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class users_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  public java.lang.String getServletInfo() {
    return "";
  }

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

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

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
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
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
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../../assets/layout/admin/lib.jsp", out, false);
      out.write("\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.7.1.js\"></script>\r\n");
      out.write("<script src=\"https://code.jquery.com/ui/1.13.3/jquery-ui.js\"></script>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://code.jquery.com/ui/1.13.3/themes/base/jquery-ui.css\">\r\n");
      out.write("<script src=\"http://localhost/recruit-app/assets/js/admin/datepicker-ko.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("	$(function(){\r\n");
      out.write("		\r\n");
      out.write("		");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("		\r\n");
      out.write("		var startNum = 1;\r\n");
      out.write("		var endNum = startNum + itemsPerPage;\r\n");
      out.write("		var itemsPerPage = 10;\r\n");
      out.write("		var showPages = 3;\r\n");
      out.write("		var totalPages = 0;\r\n");
      out.write("		var currentPage = 1;\r\n");
      out.write("		\r\n");
      out.write("		//초기로딩\r\n");
      out.write("	    updateUserList(true);\r\n");
      out.write("		\r\n");
      out.write("		$.datepicker.setDefaults($.datepicker.regional['ko']);\r\n");
      out.write("		$(\"#user_menu\").addClass(\"bg-gradient-primary\");\r\n");
      out.write("		\r\n");
      out.write("	    	$(\"#start_date_first\").datepicker({\r\n");
      out.write("	    		showOtherMonths: true,\r\n");
      out.write("	    	    selectOtherMonths: true,\r\n");
      out.write("	    	    showButtonPanel: true,\r\n");
      out.write("	    	    dateFormat: \"yy-mm-dd\"\r\n");
      out.write("	    	});\r\n");
      out.write("	    	\r\n");
      out.write("	    	$(\"#end_date_first\").datepicker({\r\n");
      out.write("	  	    	showOtherMonths: true,\r\n");
      out.write("	  	    	selectOtherMonths: true,\r\n");
      out.write("	  	    	showButtonPanel: true,\r\n");
      out.write("	  	    	dateFormat: \"yy-mm-dd\"\r\n");
      out.write("	  		});\r\n");
      out.write("	    	\r\n");
      out.write("	    	function updateUserList(isFirst) {\r\n");
      out.write("				var searchVO = {};\r\n");
      out.write("			    \r\n");
      out.write("			    if (isFirst) {\r\n");
      out.write("			        searchVO = {\r\n");
      out.write("			            startNum: 1,\r\n");
      out.write("			            endNum: itemsPerPage\r\n");
      out.write("			        };\r\n");
      out.write("			    } else {\r\n");
      out.write("			        searchVO = getSearchVO();\r\n");
      out.write("			    }\r\n");
      out.write("				\r\n");
      out.write("			    $.ajax({\r\n");
      out.write("		            url: \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/api/manage/users.do\",\r\n");
      out.write("		            method: 'GET',\r\n");
      out.write("		            data: searchVO,\r\n");
      out.write("		            dataType: 'JSON',\r\n");
      out.write("		            success: function(data) {\r\n");
      out.write("		                populateTable(data);\r\n");
      out.write("		                countUserList(searchVO);\r\n");
      out.write("		                updatePagination();\r\n");
      out.write("		                if(!(data && data.length > 0)){\r\n");
      out.write("		                    $(\"#sodr_list tbody\").html('<tr><td colspan=\"10\" style=\"font-size: 16px; font-weight: bold;\">검색 결과가 없습니다.</td></tr>');\r\n");
      out.write("		                }\r\n");
      out.write("		                $(\".fc_result\").text(data.length); \r\n");
      out.write("		            },\r\n");
      out.write("		            error: function(xhr, status, error) {\r\n");
      out.write("		                console.error(\"Error fetching data: \" + error);\r\n");
      out.write("		                $(\"#sodr_list tbody\").html('<tr><td colspan=\"10\" style=\"font-size: 16px; font-weight: bold;\">데이터를 불러오는 데 실패했습니다.</td></tr>');\r\n");
      out.write("		            }\r\n");
      out.write("		        });\r\n");
      out.write("		    }\r\n");
      out.write("	    	\r\n");
      out.write("	    	function populateTable(userList) {\r\n");
      out.write("	            var tableBody = $(\"#sodr_list tbody\");\r\n");
      out.write("	            tableBody.empty();\r\n");
      out.write("\r\n");
      out.write("	            $.each(userList, function(index, userInfo) {\r\n");
      out.write("	                var row = $('<tr>')\r\n");
      out.write("	                    .addClass('list0')\r\n");
      out.write("	                    .attr('data-user-id',userInfo.userId);\r\n");
      out.write("	                \r\n");
      out.write("	                var form = $('<form>')\r\n");
      out.write("	                  .attr('method', 'POST')\r\n");
      out.write("	                  .attr('action', 'http://localhost/recruit-app/manage/userDetail.do');\r\n");
      out.write("\r\n");
      out.write("	                var hiddenInput = $('<input>')\r\n");
      out.write("	                  .attr('type', 'hidden')\r\n");
      out.write("	                  .attr('name', 'userId')\r\n");
      out.write("	                  .val(userInfo.userId);\r\n");
      out.write("\r\n");
      out.write("	                form.append(hiddenInput);\r\n");
      out.write("\r\n");
      out.write("	                // 버튼 요소 생성 (폼 제출 용도)\r\n");
      out.write("	                var detailButton = $('<input>')\r\n");
      out.write("	                  .attr('type', 'submit') // submit 타입으로 변경\r\n");
      out.write("	                  .attr('value', '상세조회')\r\n");
      out.write("	                  .addClass('btn btn-outline-secondary btn-sm detailBtn')\r\n");
      out.write("	                  .css('font-weight', 'bold')\r\n");
      out.write("	                  .css('margin', '0px auto');\r\n");
      out.write("\r\n");
      out.write("	                form.append(detailButton);\r\n");
      out.write("	                \r\n");
      out.write("	             // 마스킹된 데이터를 span 요소로 감싸고 data-original 속성에 원본 데이터 저장\r\n");
      out.write("	                row.append($('<td>').text(index + startNum))\r\n");
      out.write("	                  .append($('<td>')\r\n");
      out.write("				      .append($('<span>')\r\n");
      out.write("				        .addClass('masked-data')\r\n");
      out.write("				        .attr('data-original', userInfo.name)\r\n");
      out.write("				        .attr('data-type', 'name') // 데이터 타입 추가\r\n");
      out.write("				        .text(maskData(userInfo.name, 'name')) // maskData 함수 사용\r\n");
      out.write("				      )\r\n");
      out.write("				      .append($('<button>')\r\n");
      out.write("				        .addClass('reveal-button')\r\n");
      out.write("				        .text('👁️‍🗨️')\r\n");
      out.write("				      )\r\n");
      out.write("				    )\r\n");
      out.write("	                  .append($('<td>')\r\n");
      out.write("				      .append($('<span>')\r\n");
      out.write("				        .addClass('masked-data')\r\n");
      out.write("				        .attr('data-original', userInfo.userId)\r\n");
      out.write("				        .attr('data-type', 'email') // 데이터 타입 추가\r\n");
      out.write("				        .text(maskData(userInfo.userId, 'email')) // maskData 함수 사용\r\n");
      out.write("				      )\r\n");
      out.write("				      .append($('<button>')\r\n");
      out.write("				        .addClass('reveal-button')\r\n");
      out.write("				        .text('👁️‍🗨️')\r\n");
      out.write("				      )\r\n");
      out.write("				    )\r\n");
      out.write("	                  .append($('<td>')\r\n");
      out.write("				      .append($('<span>')\r\n");
      out.write("				        .addClass('masked-data')\r\n");
      out.write("				        .attr('data-original', userInfo.phone)\r\n");
      out.write("				        .attr('data-type', 'phone') // 데이터 타입 추가\r\n");
      out.write("				        .text(maskData(userInfo.phone, 'phone')) // maskData 함수 사용\r\n");
      out.write("				      )\r\n");
      out.write("				      .append($('<button>')\r\n");
      out.write("				        .addClass('reveal-button')\r\n");
      out.write("				        .text('👁️‍🗨️')\r\n");
      out.write("				      )\r\n");
      out.write("				    )\r\n");
      out.write("	                   //.append($('<td>').text(userInfo.phone))\r\n");
      out.write("	                   .append($('<td>').text(userInfo.signupDate))\r\n");
      out.write("	                   .append($('<td>').append(form));\r\n");
      out.write("\r\n");
      out.write("	                tableBody.append(row);\r\n");
      out.write("	            });//each\r\n");
      out.write("	    	}//function\r\n");
      out.write("	    	\r\n");
      out.write("	          \r\n");
      out.write("	            function getSearchVO() {\r\n");
      out.write("	        	    return {\r\n");
      out.write("	        	    	category: $(\"select[name='category']\").val(),\r\n");
      out.write("	        	        keyword: $(\"input[name='keyword']\").val(),\r\n");
      out.write("	        	        signupDateStart: $(\"#start_date_first\").val() || undefined,\r\n");
      out.write("	        	        signupDateEnd: $(\"#end_date_first\").val() || undefined,\r\n");
      out.write("	        	        startNum: startNum,\r\n");
      out.write("	        	        endNum: startNum + itemsPerPage - 1\r\n");
      out.write("	        	    };\r\n");
      out.write("	        	}//function\r\n");
      out.write("	        	\r\n");
      out.write("	            \r\n");
      out.write("	            function countUserList(searchVO){\r\n");
      out.write("	        		$.ajax({\r\n");
      out.write("	                    url: \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/api/manage/user/counts.do\",\r\n");
      out.write("	                    method: 'GET',\r\n");
      out.write("	                    data: searchVO,\r\n");
      out.write("	                    dataType: 'JSON',\r\n");
      out.write("	                    async: false,\r\n");
      out.write("	                    success: function(data) {\r\n");
      out.write("	                    	totalPages = data;\r\n");
      out.write("	                    	$(\".fc_all\").text(JSON.stringify(data)); \r\n");
      out.write("	                    },\r\n");
      out.write("	                    error: function(xhr, status, error) {\r\n");
      out.write("	                        console.error(\"Error fetching data: \" + error);\r\n");
      out.write("	                    }\r\n");
      out.write("	                });//ajax\r\n");
      out.write("	        	}//function\r\n");
      out.write("	        	\r\n");
      out.write("	        	$(\"#btn-reset\").click(function(e){\r\n");
      out.write("	        		e.preventDefault();\r\n");
      out.write("	        		$(\".frm_input\").val('');\r\n");
      out.write("	        	});//click\r\n");
      out.write("	        	\r\n");
      out.write("	        	$(\"#btn-search\").click(function(e){\r\n");
      out.write("	        		e.preventDefault();\r\n");
      out.write("	        		updateUserList(false);\r\n");
      out.write("	        	});//click\r\n");
      out.write("	            \r\n");
      out.write("	            $('.pagination').on('click', '.page-link', function(e) {\r\n");
      out.write("	                \r\n");
      out.write("	                e.preventDefault();\r\n");
      out.write("	                var clickedPage = $(this).data('page');\r\n");
      out.write("	                if (clickedPage) {\r\n");
      out.write("	                    currentPage = clickedPage;\r\n");
      out.write("	                    startNum = itemsPerPage * (currentPage - 1) + 1;\r\n");
      out.write("	                    updateUserList(false);\r\n");
      out.write("	                } else if ($(this).attr('id') === 'prev-page') {\r\n");
      out.write("	                    if (currentPage > 1) {\r\n");
      out.write("	                        currentPage--;\r\n");
      out.write("	                        startNum = itemsPerPage * (currentPage - 1) + 1;\r\n");
      out.write("	                        updateUserList(false);\r\n");
      out.write("	                    }\r\n");
      out.write("	                } else if ($(this).attr('id') === 'next-page') {\r\n");
      out.write("	                    if (currentPage < Math.ceil(totalPages / itemsPerPage)) {\r\n");
      out.write("	                        currentPage++;\r\n");
      out.write("	                        startNum = itemsPerPage * (currentPage - 1) + 1;\r\n");
      out.write("	                        updateUserList(false);\r\n");
      out.write("	                    }\r\n");
      out.write("	                }\r\n");
      out.write("	        	\r\n");
      out.write("	    	});//function\r\n");
      out.write("	            \r\n");
      out.write("	         // 페이지네이션 업데이트\r\n");
      out.write("	            function updatePagination() {\r\n");
      out.write("	         		var currentGroup = Math.ceil(currentPage / showPages);\r\n");
      out.write("	            	var startPage = (currentGroup - 1) * showPages + 1;\r\n");
      out.write("	                var paginationHtml = '';\r\n");
      out.write("	                var endPage = Math.min(Math.ceil(totalPages / itemsPerPage) , startPage + showPages - 1);\r\n");
      out.write("	                paginationHtml += '<li class=\"page-items' + (currentPage === 1 ? ' disabled' : '') + '\">';\r\n");
      out.write("	                paginationHtml += '<a class=\"page-link\" href=\"#\" aria-label=\"Previous\" id=\"prev-page\">';\r\n");
      out.write("	                paginationHtml += '<span aria-hidden=\"true\">&laquo;</span></a></li>';\r\n");
      out.write("\r\n");
      out.write("	                for (var i = startPage; i <= endPage; i++) {\r\n");
      out.write("	                    paginationHtml += '<li class=\"page-items' + (i === currentPage ? ' active' : '') + '\">';\r\n");
      out.write("	                    paginationHtml += '<a class=\"page-link\" href=\"#\" data-page=\"' + i + '\">' + i + '</a></li>';\r\n");
      out.write("	                }\r\n");
      out.write("\r\n");
      out.write("	                paginationHtml += '<li class=\"page-items' + (currentPage === Math.ceil(totalPages / itemsPerPage) ? ' disabled' : '') + '\">';\r\n");
      out.write("	                paginationHtml += '<a class=\"page-link\" href=\"#\" aria-label=\"Next\" id=\"next-page\">';\r\n");
      out.write("	                paginationHtml += '<span aria-hidden=\"true\">&raquo;</span></a></li>';\r\n");
      out.write("\r\n");
      out.write("	                $('.pagination').html(paginationHtml);\r\n");
      out.write("	            }//function\r\n");
      out.write("	            \r\n");
      out.write("	            $(document).on('click', '.reveal-button', function() {\r\n");
      out.write("	                var $maskedData = $(this).siblings('.masked-data');\r\n");
      out.write("	                var originalData = $maskedData.attr('data-original');\r\n");
      out.write("	                var dataType = $maskedData.attr('data-type');\r\n");
      out.write("	                var currentData = $maskedData.text();\r\n");
      out.write("\r\n");
      out.write("	                if (currentData === maskData(originalData, dataType)) {\r\n");
      out.write("	                    $maskedData.text(originalData);\r\n");
      out.write("	                } else { \r\n");
      out.write("	                    $maskedData.text(maskData(originalData, dataType)); \r\n");
      out.write("	                }\r\n");
      out.write("	            });//click\r\n");
      out.write("	            \r\n");
      out.write("	            function maskString(str, startLen = 2, endLen = 2) {\r\n");
      out.write("	              if (!str) return '';\r\n");
      out.write("	              const length = str.length;\r\n");
      out.write("	              const maskLen = Math.max(0, length - startLen - endLen); \r\n");
      out.write("	              return str.substring(0, startLen) + '*'.repeat(maskLen) + str.substring(length - endLen);\r\n");
      out.write("	            }//function\r\n");
      out.write("	            \r\n");
      out.write("	            function maskData(data, type) {\r\n");
      out.write("	            	  if (!data) return '';\r\n");
      out.write("\r\n");
      out.write("	            	  switch (type) {\r\n");
      out.write("	            	    case 'email':\r\n");
      out.write("	            	      return maskString(data, 2, 2);\r\n");
      out.write("	            	    case 'name':\r\n");
      out.write("	            	      return maskString(data, 1, 1);\r\n");
      out.write("	            	    case 'phone':\r\n");
      out.write("	            	      const match = data.match(/^(\\d{3})-(\\d{4})-(\\d{4})$/);\r\n");
      out.write("	            	      if (match) {\r\n");
      out.write("	            	        return maskString(data, 4, 5); \r\n");
      out.write("	            	      } else {\r\n");
      out.write("	            	        return maskString(data, 4, 5); \r\n");
      out.write("	            	      }\r\n");
      out.write("	            	    default:\r\n");
      out.write("	            	      return data; \r\n");
      out.write("	            	  }\r\n");
      out.write("	            	}//function\r\n");
      out.write("	});//ready\r\n");
      out.write("</script>\r\n");
      out.write("<!-- golgolz start -->\r\n");
      out.write("<link href=\"http://localhost//recruit-app/assets/css/pagenation.css\" rel=\"stylesheet\" />\r\n");
      out.write("<link href=\"http://localhost//recruit-app/assets/css/manage/order/admin.css\" rel=\"stylesheet\" />\r\n");
      out.write("<link href=\"http://localhost//recruit-app/assets/css/manage/order/reset.css\" rel=\"stylesheet\" />\r\n");
      out.write("<link href=\"http://localhost/recruit-app/assets/css/manage/goods/goods.css\" rel=\"stylesheet\" />\r\n");
      out.write("<link href=\"http://localhost/recruit-app/assets/css/manage/goods/default.css\" rel=\"stylesheet\" />\r\n");
      out.write("<!-- golgolz end -->\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../../assets/layout/admin/header.jsp", out, false);
      out.write("\r\n");
      out.write("	<main\r\n");
      out.write("		class=\"main-content position-relative max-height-vh-100 h-100 border-radius-lg ps ps--active-y\">\r\n");
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
      out.write("							aria-current=\"page\">사용자 관리</li>\r\n");
      out.write("					</ol>\r\n");
      out.write("					<h6 class=\"font-weight-bolder mb-0\">사용자 관리</h6>\r\n");
      out.write("				</nav>\r\n");
      out.write("			</div>\r\n");
      out.write("		</nav>\r\n");
      out.write("		<div class=\"container-fluid\">\r\n");
      out.write("			<!-- golgolz start -->\r\n");
      out.write("			<div class=\"s_wrap\">\r\n");
      out.write("				<form name=\"fsearch\" id=\"fsearch\">\r\n");
      out.write("					<input type=\"hidden\" name=\"code\" value=\"list\">\r\n");
      out.write("					<div class=\"tbl_frm01\">\r\n");
      out.write("						<table>\r\n");
      out.write("							<colgroup> \r\n");
      out.write("								<col class=\"w100\">\r\n");
      out.write("								<col>\r\n");
      out.write("							</colgroup>\r\n");
      out.write("							<tbody>\r\n");
      out.write("								<tr>\r\n");
      out.write("									<th scope=\"row\">검색어</th>\r\n");
      out.write("									<td>\r\n");
      out.write("										<input type=\"hidden\" name=\"page\" value=\"1\" />\r\n");
      out.write("										<select name=\"category\">\r\n");
      out.write("												<option value=\"1\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.category eq '1' ? \" selected\" : \"\" }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(">아이디</option>\r\n");
      out.write("												<option value=\"2\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.category eq '2' ? \" selected\" : \"\" }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(">회원명</option>\r\n");
      out.write("												<option value=\"3\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.category eq '3' ? \" selected\" : \"\" }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(">핸드폰번호</option>\r\n");
      out.write("										</select> \r\n");
      out.write("										<input type=\"text\" name=\"keyword\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ param.keyword }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" class=\"frm_input\" size=\"30\">\r\n");
      out.write("									</td>\r\n");
      out.write("								</tr>\r\n");
      out.write("								<tr>\r\n");
      out.write("									<th scope=\"row\">회원 가입기간</th>\r\n");
      out.write("              						<td class=\"box text\">\r\n");
      out.write("              							<input type=\"text\" id=\"start_date_first\" class=\"frm_input\" size=\"10\"> - \r\n");
      out.write("              							<input type=\"text\" id=\"end_date_first\" class=\"frm_input\" size=\"10\"> \r\n");
      out.write("              						</td>\r\n");
      out.write("								</tr>\r\n");
      out.write("							</tbody>\r\n");
      out.write("						</table>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"btn_confirm\">\r\n");
      out.write("						<input type=\"button\" value=\"검색\" id=\"btn-search\" class=\"btn btn-secondary btn-sm\"> \r\n");
      out.write("						<input type=\"button\" value=\"초기화\" id=\"btn-reset\" class=\"btn btn-outline-secondary btn-sm\">\r\n");
      out.write("					</div>\r\n");
      out.write("				</form>\r\n");
      out.write("				<div class=\"local_ov mart30\">\r\n");
      out.write("					전체 : <b class=\"fc_all\"></b>건 중 <b class=\"fc_result fc_red\"></b>건 조회\r\n");
      out.write("				</div>\r\n");
      out.write("				<form name=\"forderlist\" id=\"forderlist\" method=\"post\">\r\n");
      out.write("					<input type=\"hidden\" name=\"q1\" value=\"code=list\"> \r\n");
      out.write("					<input type=\"hidden\" name=\"page\" value=\"1\">\r\n");
      out.write("				</form>\r\n");
      out.write("				<div class=\"tbl_head01\">\r\n");
      out.write("					<table id=\"sodr_list\">\r\n");
      out.write("						<colgroup>\r\n");
      out.write("							<col class=\"w90\">\r\n");
      out.write("							<col class=\"w90\">\r\n");
      out.write("							<col class=\"w90\">\r\n");
      out.write("							<col class=\"w90\">\r\n");
      out.write("							<col class=\"w90\">\r\n");
      out.write("							<col class=\"w90\">\r\n");
      out.write("						</colgroup>\r\n");
      out.write("						<thead>\r\n");
      out.write("						<tr>\r\n");
      out.write("							<th scope=\"col\">번호</th>\r\n");
      out.write("							<th scope=\"col\">회원명</th>\r\n");
      out.write("							<th scope=\"col\">아이디</th>\r\n");
      out.write("							<th scope=\"col\">핸드폰번호</th>\r\n");
      out.write("							<th scope=\"col\">가입일자</th>\r\n");
      out.write("							<th scope=\"col\">상세조회</th>\r\n");
      out.write("						</tr>\r\n");
      out.write("						</thead>\r\n");
      out.write("						<tbody>\r\n");
      out.write("						</tbody>\r\n");
      out.write("					</table>\r\n");
      out.write("				</div>\r\n");
      out.write("				<!-- 관리자 페이지네이션 시작 -->\r\n");
      out.write("				<div class=\"alignCenter\">\r\n");
      out.write("          			<table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" width=\"100%\">\r\n");
      out.write("            			<tbody>\r\n");
      out.write("              				<tr>\r\n");
      out.write("                				<td align=\"center\">\r\n");
      out.write("						        	<div id=\"pageNation\">\r\n");
      out.write("										<div style=\"justify-content: center;\">\r\n");
      out.write("											<nav aria-label=\"Page navigation example\">\r\n");
      out.write("												<ul class=\"pagination\" style=\"justify-content: center;\">\r\n");
      out.write("													<li>\r\n");
      out.write("														<a class=\"page-link\" href=\"#\" aria-label=\"Previous\">\r\n");
      out.write("														<span aria-hidden=\"true\">&laquo;</span>\r\n");
      out.write("														</a>\r\n");
      out.write("													</li>\r\n");
      out.write("													<li><a class=\"page-link\" href=\"#\">1</a></li>\r\n");
      out.write("													<li><a class=\"page-link\" href=\"#\">2</a></li>\r\n");
      out.write("													<li><a class=\"page-link\" href=\"#\">3</a></li>\r\n");
      out.write("													<li>\r\n");
      out.write("														<a class=\"page-link\" href=\"#\" aria-label=\"Next\">\r\n");
      out.write("														<span aria-hidden=\"true\">&raquo;</span>\r\n");
      out.write("														</a>\r\n");
      out.write("													</li>\r\n");
      out.write("												</ul>\r\n");
      out.write("											</nav>\r\n");
      out.write("										</div>	\r\n");
      out.write("							        </div>		\r\n");
      out.write("                				</td>\r\n");
      out.write("              				</tr>\r\n");
      out.write("            			</tbody>\r\n");
      out.write("          			</table>\r\n");
      out.write("        		</div>	\r\n");
      out.write("				<!-- 관리자 페이지네이션 끝 -->\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</main>\r\n");
      out.write("	<!-- golgolz start -->\r\n");
      out.write("	<!-- golgolz end -->\r\n");
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

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f0_reused = false;
    try {
      _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f0.setParent(null);
      // /WEB-INF/views/manage/user/users.jsp(15,2) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ not empty resultMsg }", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
      if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("			alert('");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${resultMsg}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("');\r\n");
          out.write("    	");
          int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      _jspx_th_c_005fif_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f0_reused);
    }
    return false;
  }
}
