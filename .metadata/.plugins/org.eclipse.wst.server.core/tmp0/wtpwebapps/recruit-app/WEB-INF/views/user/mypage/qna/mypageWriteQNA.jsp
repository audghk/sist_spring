<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <jsp:include page="../../../assets/layout/user/lib.jsp" />  
    <link href="https://i.jobkorea.kr/content/css/ver_2/mtc/mtc_lounge-sv-202402231655.css" rel="stylesheet" type="text/css" />
    <link href="https://i.jobkorea.kr/content/css/ver_2/help/help-sv-202402231655.css" rel="stylesheet" type="text/css" />
    <link rel="shortcut icon" href="https://static.wanted.co.kr/favicon/new/favicon.ico"/>
    <link rel="stylesheet" href="https://asset.wanted.co.kr/userweb/www/_next/static/css/c76e012c05e1318d.css" crossorigin="anonymous" data-n-g=""/>
    <link rel="stylesheet" href="http://localhost/recruit-app/assets/css/mypage.css"/>
    <link rel="stylesheet" href="http://localhost/recruit-app/assets/css/signup.css"/>
    <link rel="stylesheet" href="http://localhost/recruit-app/assets/css/layout/user/btn-bootstrap.css" />
    <style type="text/css">
    </style>
    <script type="text/javascript">
    $(function(){
    	 $("#btnSend").click(function(event){
             var category = $("#category").val();
             var title = $("#title").val();
             var content = $("#content").val();
             var agree = $("#lb_agree").is(":checked");
             
             if (category === "") {
                 alert("카테고리를 선택하세요.");
                 event.preventDefault();
             } else if (title.trim() === "") {
                 alert("제목을 입력하세요.");
                 event.preventDefault();
             } else if (content.trim() === "") {
                 alert("내용을 입력하세요.");
                 event.preventDefault();
             } else if (!agree) {
                 alert("개인정보 수집 및 이용에 동의해주세요.");
                 event.preventDefault();
             } else {
                 $("#Qnaform").submit();
             }
         });
     });
    </script>
</head>
<body>
    <div id="__next" data-reactroot="">
        <jsp:include page="../../../assets/layout/user/header.jsp" />
        <main class="JobsFeed_Jobsfeed__DpeV9">  
            <section class="Section_Section__P1hhc">
                <div class="MainLayout_MainLayout__root__p6itg">
                    <div class="Grid_Grid__container__J9CcC Grid_Grid__spacing__5__ZwgDV">
                        <jsp:include page="../mypage_layout.jsp"/>
                        <div class="Grid_Grid__item__FUkSS Grid_Grid__justify_center__QJu2X Grid_Grid__align-items_flex-start__PA0JE Grid_Grid__grid__xs__12__rVqKh Grid_Grid__grid__md__6__9g_JE" style="margin-left:30px">
                            <div style="margin:30px auto 0; width:731px">
                                <div class="loungeContent inquiryContent inquiryContent--selection">
                                    <div class="topHdWrap">
                                        <h1 style="font-size: 25px;"><strong>문의</strong></h1>
                                    </div>
                                    <div class="inquiryFormWrap">
                                        <div class="mtcTplTab">
                                            <ul class="tabItems">
                                                <li class="on"><a href="http://localhost/recruit-app/user/mypage/qna/mypageQnaForm.do">문의</a></li>
                                                <li class=""><a href="http://localhost/recruit-app/user/mypage/qna/mypageQNAList.do">문의 내역</a></li>
                                            </ul>
                                        </div>
                                        <div class="inquiryForm inquiryForm--selection">
                                            <form action="${pageContext.request.contextPath}/user/mypage/qna/mypageWriteQNA.do" method="post" id="Qnaform">
                                                <fieldset>
                                                    <legend>문의하기 입력</legend>
                                                    <div class="tbInquiryBx">
                                                        <div class="tbRow">
                                                            <div class="tbCell tbTh">문의종류 <em>(필수)</em></div>
                                                            <div class="tbCell">
                                                                <div>
                                                                    <label for="lb_view_1" id="lb_type"></label>
                                                                    <select style="width:180px; height:35px" id="category" name="category">
                                                                        <option value="">선택</option>
                                                                        <option value="서비스 문의">서비스 문의</option>
                                                                        <option value="오류신고">오류 신고</option>
                                                                        <option value="제안사항">제안 사항</option>
                                                                    </select>
                                                                </div>
                                                            </div>
                                                        </div>
                                                        <div class="tbRow">
                                                            <div class="tbCell tbTh"><label for="title">제목 <em>(필수)</em></label></div>
                                                            <div class="tbCell">
                                                                <textarea name="title" id="title" title="제목을 입력하세요." style="height:35px; width:400px ;font-size:15px">${param.title}</textarea>
                                                            </div>
                                                        </div>
                                                        <div class="tbRow">
                                                            <div class="tbCell tbTh"><label for="content">내용 <em>(필수)</em></label></div>
                                                            <div>
                                                                <textarea name="content" id="content" title="내용을 입력하세요." style="height:350px; width:400px">${param.content}</textarea>
                                                            </div>
                                                        </div>
                                                        <div id="privacyBx1" class="privacyBx">
                                                            <div class="mtcChk-Bx privacyBx__check-box">
                                                                <input type="checkbox" id="lb_agree" name="" value="" />
                                                                <label for="lb_agree" class="bxIpt privacyBx__title">개인정보 수집 및 이용에 동의합니다.</label>
                                                            </div>
                                                            <dl>
                                                                <dt class="privacyBx__title" for="lb_agree"></dt>
                                                                <dd class="privacyBx__info">
                                                                    <span class="privacyBx__info privacyBx__info--black">문의에 대한 처리 및 답변을 위해 아이디, e-메일 정보가 수집</span>되며, 수집된 정보는 <span class="privacyBx__info privacyBx__info--black">3년간 보관</span>합니다.<br>회원님은 동의를 거부할 수 있으며, 거부 시 응대지원이 원활하지 않을 수 있습니다.
                                                                </dd>
                                                            </dl>
                                                        </div>
                                                        <div class="inquiryBtn" style="margin-bottom:30px">
                                                            <button type="submit" class="btnInq" id="btnSend"><span>문의하기</span></button>
                                                            <button type="button" class="btnInq btnCancel"><span>취소</span></button>
                                                        </div>
                                                    </div>
                                                </fieldset>
                                            </form>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </section>
            <jsp:include page="../../../assets/layout/user/footer.jsp" />
        </main>
    </div>
</body>
</html>
