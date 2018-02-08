<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="ax" tagdir="/WEB-INF/tags" %>

<ax:set key="title" value="${pageName}"/>
<ax:set key="page_desc" value="${PAGE_REMARK}"/>
<ax:set key="page_auto_height" value="true"/>

<ax:layout name="base">
    <jsp:attribute name="script">
        <ax:script-lang key="ax.script" />
        <script type="text/javascript" src="<c:url value='/assets/js/view/eventpage.js' />"></script>
    </jsp:attribute>
    <jsp:body>

        <ax:page-buttons></ax:page-buttons>


        <div role="page-header">
            <ax:form name="searchView0">
                <ax:tbl clazz="ax-search-tbl" minWidth="500px">
                    <ax:tr>
                        <ax:td label='검색조건' width="300px">
                            <input type="text" data-ax-path="contents" class="form-control" />
                        </ax:td>
                    </ax:tr>
                </ax:tbl>
            </ax:form>
            <div class="H10"></div>
        </div>

        <ax:split-layout name="ax1" orientation="vertical">
            <ax:split-panel width="900" style="">

                <!-- 목록 -->
                <div class="ax-button-group" data-fit-height-aside="grid-view-01">
                    <div class="left">
                        <h2><i class="cqc-list"></i>프로그램 목록 </h2>
                    </div>
                    <div class="right">
                        <button type="button" class="btn btn-default" data-grid-view-01-btn="add"><i class="cqc-circle-with-plus"></i> 추가</button>
                        <button type="button" class="btn btn-default" data-grid-view-01-btn="delete"><i class="cqc-circle-with-plus"></i> 삭제</button>
                    </div>
                </div>
                <div data-ax5grid="grid-view-01" data-fit-height-content="grid-view-01" style="height: 300px;"></div>

            </ax:split-panel>
            <ax:splitter></ax:splitter>
            <ax:split-panel width="*" style="padding-left: 10px;" scroll="scroll">

                <!-- 폼 -->
                <div class="ax-button-group" role="panel-header">
                    <div class="left">
                        <h2><i class="cqc-news"></i>
                            <ax:lang id="ax.admin.sample.parent.information"/>
                        </h2>
                    </div>
                    <div class="right">
                        <button type="button" class="btn btn-default" data-form-view-01-btn="form-clear">
                            <i class="cqc-erase"></i>
                            <ax:lang id="ax.admin.clear"/>
                        </button>
                    </div>
                </div>

                <ax:form name="formView01">
                    <ax:tbl clazz="ax-form-tbl" minWidth="500px">
                        <ax:tr>
                            <ax:td label="넘버링" width="300px">
                                <input type="text" data-ax-path="id" class="form-control" readonly>
                            </ax:td>
                        </ax:tr>
                        <ax:tr>
                            <ax:td label="페이지 제목" width="300px">
                                <input type="text" data-ax-path="name" title="상호" class="form-control"/>
                            </ax:td>
                        </ax:tr>
                        <ax:tr>
                            <ax:td label="매체" width="300px">
                                <input type="text" data-ax-path="partner" title="상호" class="form-control"/>
                            </ax:td>
                        </ax:tr>
                        <ax:tr>
                            <ax:td label="토크 유/무" width="300px">
                                <input type="text" data-ax-path="type" title="상호" class="form-control"/>
                            </ax:td>
                        </ax:tr>
                        <ax:tr>
                            <ax:td label="cash url 정보" width="300px">
                                <input type="text" data-ax-path="appId" title="상호" class="form-control"/>
                            </ax:td>
                        </ax:tr>
                        <ax:tr>
                            <ax:td label="템플릿" width="300px">
                                <input type="text" data-ax-path="template" title="상호" class="form-control"/>
                            </ax:td>
                        </ax:tr>
                        <ax:tr>
                            <ax:td label="템플릿 파라미터" width="300px">
                                <input type="text" data-ax-path="templateParams" title="상호" class="form-control"/>
                            </ax:td>
                        </ax:tr>
                    </ax:tbl>

                </ax:form>

            </ax:split-panel>
        </ax:split-layout>

    </jsp:body>
</ax:layout>
