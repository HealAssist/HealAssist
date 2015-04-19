<!DOCTYPE html>
<!-- 
Template Name: Metronic - Responsive Admin Dashboard Template build with Twitter Bootstrap 3.3.2
Version: 3.6.2
Author: KeenThemes
Website: http://www.keenthemes.com/
Contact: support@keenthemes.com
Follow: www.twitter.com/keenthemes
Like: www.facebook.com/keenthemes
Purchase: http://themeforest.net/item/metronic-responsive-admin-dashboard-template/4021469?ref=keenthemes
License: You must have a valid license purchased only from themeforest(the above link) in order to legally use the theme for your project.
-->
<!--[if IE 8]> <html lang="en" class="ie8 no-js"> <![endif]-->
<!--[if IE 9]> <html lang="en" class="ie9 no-js"> <![endif]-->
<!--[if !IE]><!-->
<%@page import="com.healAssist.beans.CourseDetails"%>
<%@page import="com.healAssist.beans.PrescriptionDetails"%>
<%@page import="com.healAssist.beans.CaseDetails"%>
<%@page import="com.healAssist.beans.UserDetails"%>
<%@page import="com.healAssist.connection.DBConnection"%>
<html lang="en" class="no-js">
<!--<![endif]-->
<!-- BEGIN HEAD -->
<head>
<meta charset="utf-8" />
<title>Metronic | Admin Dashboard Template</title>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta content="width=device-width, initial-scale=1" name="viewport" />
<meta content="" name="description" />
<meta content="" name="author" />
<!-- BEGIN GLOBAL MANDATORY STYLES -->
<link href="http://fonts.googleapis.com/css?family=Open+Sans:400,300,600,700&subset=all" rel="stylesheet" type="text/css" />
<link href="../../assets/global/plugins/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css" />
<link href="../../assets/global/plugins/simple-line-icons/simple-line-icons.min.css" rel="stylesheet" type="text/css" />
<link href="../../assets/global/plugins/bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
<link href="../../assets/global/plugins/uniform/css/uniform.default.css" rel="stylesheet" type="text/css" />
<link href="../../assets/global/plugins/bootstrap-switch/css/bootstrap-switch.min.css" rel="stylesheet" type="text/css" />
<!-- END GLOBAL MANDATORY STYLES -->
<!-- BEGIN PAGE LEVEL PLUGIN STYLES -->
<link rel="stylesheet" type="text/css" href="../../assets/global/plugins/select2/select2.css" />
<link href="../../assets/global/plugins/bootstrap-daterangepicker/daterangepicker-bs3.css" rel="stylesheet" type="text/css" />
<link rel="stylesheet" type="text/css" href="../../assets/global/plugins/bootstrap-datepicker/css/datepicker3.css" />
<link href="../../assets/global/plugins/fullcalendar/fullcalendar.min.css" rel="stylesheet" type="text/css" />
<link href="../../assets/global/plugins/jqvmap/jqvmap/jqvmap.css" rel="stylesheet" type="text/css" />
<link href="../../assets/global/plugins/morris/morris.css" rel="stylesheet" type="text/css">
<link rel="stylesheet" type="text/css" href="../../assets/global/plugins/bootstrap-datetimepicker/css/bootstrap-datetimepicker.min.css" />
<link rel="stylesheet" type="text/css" href="../../assets/global/plugins/bootstrap-datetimepicker/css/bootstrap-datetimepicker.min.css" />
<!-- END PAGE LEVEL PLUGIN STYLES -->
<!-- BEGIN PAGE STYLES -->
<link href="../../assets/admin/pages/css/tasks.css" rel="stylesheet" type="text/css" />
<!-- END PAGE STYLES -->
<!-- BEGIN THEME STYLES -->
<!-- DOC: To use 'rounded corners' style just load 'components-rounded.css' stylesheet instead of 'components.css' in the below style tag -->
<link href="../../assets/global/css/components-rounded.css" id="style_components" rel="stylesheet" type="text/css" />
<link href="../../assets/global/css/plugins.css" rel="stylesheet" type="text/css" />
<link href="../../assets/admin/layout4/css/layout.css" rel="stylesheet" type="text/css" />
<link href="../../assets/admin/layout4/css/themes/light.css" rel="stylesheet" type="text/css" id="style_color" />
<link href="../../assets/admin/layout4/css/custom.css" rel="stylesheet" type="text/css" />
<style>
.nav-tabs>li {
	position: relative;
}

.nav-tabs>li>a {
	display: inline-block;
}

.nav-tabs>li>span {
	display: none;
	cursor: pointer;
	position: absolute;
	right: 6px;
	top: 8px;
	color: red;
}

.nav-tabs>li:hover>span {
	display: inline-block;
}
</style>
<!-- END THEME STYLES -->
<link rel="shortcut icon" href="favicon.ico" />
</head>
<!-- END HEAD -->
<!-- BEGIN BODY -->
<!-- DOC: Apply "page-header-fixed-mobile" and "page-footer-fixed-mobile" class to body element to force fixed header or footer in mobile devices -->
<!-- DOC: Apply "page-sidebar-closed" class to the body and "page-sidebar-menu-closed" class to the sidebar menu element to hide the sidebar by default -->
<!-- DOC: Apply "page-sidebar-hide" class to the body to make the sidebar completely hidden on toggle -->
<!-- DOC: Apply "page-sidebar-closed-hide-logo" class to the body element to make the logo hidden on sidebar toggle -->
<!-- DOC: Apply "page-sidebar-hide" class to body element to completely hide the sidebar on sidebar toggle -->
<!-- DOC: Apply "page-sidebar-fixed" class to have fixed sidebar -->
<!-- DOC: Apply "page-footer-fixed" class to the body element to have fixed footer -->
<!-- DOC: Apply "page-sidebar-reversed" class to put the sidebar on the right side -->
<!-- DOC: Apply "page-full-width" class to the body element to have full width page without the sidebar menu -->
<%
	UserDetails ud = null;
	if(session.getAttribute("userDetails") != null){
		ud = (UserDetails) session.getAttribute("userDetails");
	}
%>

<body class="page-header-fixed page-sidebar-closed-hide-logo page-sidebar-closed-hide-logo">
	<!-- BEGIN HEADER -->
	<div class="page-header navbar navbar-fixed-top">
		<!-- BEGIN HEADER INNER -->
		<div class="page-header-inner">
			<!-- BEGIN LOGO -->
			<div class="page-logo">
				<a href="#"> <img src="../../assets/admin/layout4/img/logo-light.png" alt="logo" class="logo-default" />
				</a>
				<div class="menu-toggler sidebar-toggler">
					<!-- DOC: Remove the above "hide" to enable the sidebar toggler button on header -->
				</div>
			</div>
			<!-- END LOGO -->
			<!-- BEGIN RESPONSIVE MENU TOGGLER -->
			<a href="javascript:;" class="menu-toggler responsive-toggler" data-toggle="collapse" data-target=".navbar-collapse"> </a>
			<!-- END RESPONSIVE MENU TOGGLER -->
			<!-- BEGIN PAGE ACTIONS -->
			<!-- DOC: Remove "hide" class to enable the page header actions -->
			<!--<div class="page-actions hide">
			<div class="btn-group">
				<button type="button" class="btn red-haze btn-sm dropdown-toggle" data-toggle="dropdown" data-hover="dropdown" data-close-others="true">
				<span class="hidden-sm hidden-xs">Actions&nbsp;</span><i class="fa fa-angle-down"></i>
				</button>
				<ul class="dropdown-menu" role="menu">
					<li>
						<a href="#">
						<i class="icon-docs"></i> New Post </a>
					</li>
					<li>
						<a href="#">
						<i class="icon-tag"></i> New Comment </a>
					</li>
					<li>
						<a href="#">
						<i class="icon-share"></i> Share </a>
					</li>
					<li class="divider">
					</li>
					<li>
						<a href="#">
						<i class="icon-flag"></i> Comments <span class="badge badge-success">4</span>
						</a>
					</li>
					<li>
						<a href="#">
						<i class="icon-users"></i> Feedbacks <span class="badge badge-danger">2</span>
						</a>
					</li>
				</ul>
			</div>
		</div>-->
			<!-- END PAGE ACTIONS -->
			<!-- BEGIN PAGE TOP -->
			<div class="page-top">
				<!-- BEGIN HEADER SEARCH BOX -->
				<!-- DOC: Apply "search-form-expanded" right after the "search-form" class to have half expanded search box -->
				<!--<form class="search-form" action="extra_search.html" method="GET">
				<div class="input-group">
					<input type="text" class="form-control input-sm" placeholder="Search..." name="query">
					<span class="input-group-btn">
					<a href="javascript:;" class="btn submit"><i class="icon-magnifier"></i></a>
					</span>
				</div>
			</form>-->
				<!-- END HEADER SEARCH BOX -->
				<!-- BEGIN TOP NAVIGATION MENU -->

				<div class="top-menu">
					<ul class="nav navbar-nav pull-right">
						<li class="separator hide"></li>
						<!-- BEGIN NOTIFICATION DROPDOWN -->
						<!-- DOC: Apply "dropdown-dark" class after below "dropdown-extended" to change the dropdown styte -->
						<!-- BEGIN USER LOGIN DROPDOWN -->
						<!-- DOC: Apply "dropdown-dark" class after below "dropdown-extended" to change the dropdown styte -->
						<li class="dropdown dropdown-extended dropdown-notification dropdown-dark" id="header_notification_bar"><a href="#" class="dropdown-toggle" data-toggle="dropdown" data-close-others="true"> <i class="icon-bell"></i> <span class="badge badge-success notificationCount notificationBadge notificationHide hide"> 0</span>
						</a>
							<ul class="dropdown-menu">
								<li class="external">
									<h3>
										<span class="bold notificationCount">0</span> unread notifications
									</h3> <!-- <a href="extra_profile.html">view all</a> -->
								</li>
								<li class="notification-list-wrapper-li notificationHide hide">
									<ul class="dropdown-menu-list scroller notification-list-ul" style="height: 250px;" data-handle-color="#637283">

									</ul>
								</li>
							</ul></li>
						<li class="separator hide"></li>
						<li class="dropdown dropdown-user dropdown-dark"><a href="#" class="dropdown-toggle" data-toggle="dropdown" data-hover="dropdown" data-close-others="true"> <span class="username username-hide-on-mobile"> <%=ud.getFullName()%>
							</span> <!-- DOC: Do not remove below empty space(&nbsp;) as its purposely used -->
						</a>
							<ul class="dropdown-menu dropdown-menu-default">
								<li><a href="#"> <i class="icon-user"></i> My Profile
								</a></li>
								<li class="divider"></li>
								<li><a href="login_soft.html"> <i class="icon-key"></i> Log Out
								</a></li>
							</ul></li>
						<!-- END USER LOGIN DROPDOWN -->
					</ul>
				</div>
				<!-- END TOP NAVIGATION MENU -->
			</div>
			<!-- END PAGE TOP -->
		</div>
		<!-- END HEADER INNER -->
	</div>
	<!-- END HEADER -->
	<div class="clearfix"></div>
	<!-- BEGIN CONTAINER -->
	<div class="page-container">
		<!-- BEGIN SIDEBAR -->
		<div class="page-sidebar-wrapper">
			<!-- DOC: Set data-auto-scroll="false" to disable the sidebar from auto scrolling/focusing -->
			<!-- DOC: Change data-auto-speed="200" to adjust the sub menu slide up/down speed -->
			<div class="page-sidebar navbar-collapse collapse">
				<!-- BEGIN SIDEBAR MENU -->
				<!-- DOC: Apply "page-sidebar-menu-light" class right after "page-sidebar-menu" to enable light sidebar menu style(without borders) -->
				<!-- DOC: Apply "page-sidebar-menu-hover-submenu" class right after "page-sidebar-menu" to enable hoverable(hover vs accordion) sub menu mode -->
				<!-- DOC: Apply "page-sidebar-menu-closed" class right after "page-sidebar-menu" to collapse("page-sidebar-closed" class must be applied to the body element) the sidebar sub menu mode -->
				<!-- DOC: Set data-auto-scroll="false" to disable the sidebar from auto scrolling/focusing -->
				<!-- DOC: Set data-keep-expand="true" to keep the submenues expanded -->
				<!-- DOC: Set data-auto-speed="200" to adjust the sub menu slide up/down speed -->
				<ul class="page-sidebar-menu " data-keep-expanded="false" data-auto-scroll="true" data-slide-speed="200">
					<li class="start active"><a href="viewPatient.jsp"> <i class="icon-home"></i> <span class="title">Dashboard</span></a></li>
				</ul>
				<!-- END SIDEBAR MENU -->
			</div>
		</div>
		<!-- END SIDEBAR -->
		<!-- BEGIN CONTENT -->
		<div class="page-content-wrapper">
			<div class="page-content">
				<!-- BEGIN PAGE HEAD -->
				<div class="page-head">
					<!-- BEGIN PAGE TITLE -->
					<div class="page-title">
						<h1>Your Details</h1>
					</div>
					<!-- END PAGE TITLE -->
				</div>
				<!-- END PAGE HEAD -->
				<!-- BEGIN PAGE BREADCRUMB -->
				<ul class="page-breadcrumb breadcrumb hide">
					<li><a href="#">Dashboard</a><i class="fa fa-circle"></i></li>
				</ul>
				<!-- END PAGE BREADCRUMB -->
				<!-- BEGIN PAGE CONTENT INNER -->
				<div class="portlet light bordered">
					<div class="portlet-title">
						<div class="caption">
							<i class="icon-equalizer font-red-sunglo"></i> <span class="caption-subject font-red-sunglo bold uppercase">Patient Details</span>
						</div>
					</div>
					<div class="portlet-body form">
						<!-- BEGIN FORM-->
						<form action="/healAssist/GetNewPatient" method="post" class="form-horizontal">
							<div class="form-body">
								<h3 class="form-section">Personal Details</h3>
								<div class="row">
									<div class="col-md-6">
										<div class="form-group">
											<label class="control-label col-md-3">Full Name</label>
											<div class="col-md-9">
												<p class="form-control-static"><%=ud.getFullName()%></p>
											</div>

										</div>
									</div>
									<!--/span-->
									<div class="col-md-6">
										<div class="form-group">
											<label class="control-label col-md-3">E-mail</label>
											<div class="col-md-9">
												<p class="form-control-static"><%=ud.getUserEmail()%>
												</p>

											</div>
										</div>
									</div>
									<!--/span-->
								</div>
								<!--/row-->
								<div class="row">
									<div class="col-md-6">
										<div class="form-group">
											<label class="control-label col-md-3">Gender</label>
											<div class="col-md-9">
												<p class="form-control-static"><%=ud.getGenderDesc()%></p>
											</div>

										</div>
									</div>
									<!--/span-->
									<div class="col-md-6">
										<div class="form-group">
											<label class="control-label col-md-3">Phone No</label>
											<div class="col-md-9">
												<p class="form-control-static"><%=ud.getUserPhone()%></p>
											</div>

										</div>
									</div>
									<!--/span-->
								</div>
								<!--/row-->
								<div class="row">
									<div class="col-md-6">
										<div class="form-group">
											<label class="control-label col-md-3">Age</label>
											<div class="col-md-9">
												<p class="form-control-static"><%=ud.getAge()%></p>


											</div>
										</div>
									</div>

									<div class="col-md-6">
										<div class="form-group">
											<label class="control-label col-md-3">Address</label>
											<div class="col-md-9">
												<p class="form-control-static"><%=ud.getAddress()%></p>
											</div>
										</div>
									</div>
									<!--/span-->
								</div>
								<!--/row-->
								<div class="row">
									<div class="col-md-6">
										<div class="form-group">
											<label class="control-label col-md-3">City / Town</label>
											<div class="col-md-9">
												<p class="form-control-static"><%=ud.getCity()%></p>
											</div>

										</div>
									</div>

									<div class="col-md-6">
										<div class="form-group">
											<label class="control-label col-md-3">Country</label>
											<div class="col-md-9">
												<p class="form-control-static"><%=ud.getCountry()%></p>

											</div>
										</div>
									</div>
									<!--/span-->
								</div>
								<h3 class="form-section">Health Details</h3>
								<%
									if(ud.getCases() != null && ud.getCases().size() > 0){
								%>

								<div class="cases">
									<div class=" portlet-tabs">
										<ul class="nav nav-tabs case-tabs">
											<%
												int caseNum = 0;	
												for(CaseDetails caseD : ud.getCases()){
													caseNum++;
											%>
											<li class="case-li <% if(caseNum == 1){%>active<%} %>"><a href="#case_<%=caseNum%>" data-toggle="tab">Case <span class="caseNum"><%=caseNum%></span></a></li>
											<%
												}
											%>
										</ul>
										<div class="tab-content tab-content-case" data-size='auto'>
											<%
												caseNum = 0;	
												for(CaseDetails caseD : ud.getCases()){
													caseNum++;
											%>
											<div class="tab-pane case-tab <% if(caseNum == 1){%>active<%} %>" id="case_<%=caseNum%>">
												<div class="col-md-6">
													<div class="form-group">
														<label class="control-label col-md-3">Case Date</label>
														<div class="col-md-9">
															<p class="form-control-static"><%=caseD.getCaseDate()%></p>
														</div>
													</div>
												</div>
												<div class="col-md-6">
													<div class="form-group">
														<label class="control-label col-md-3">Doctor</label>
														<div class="col-md-9">
															<p class="form-control-static"><%=caseD.getDoctorName()%></p>
														</div>
													</div>
												</div>

												<div class="col-md-6">
													<div class="form-group">
														<label class="control-label col-md-3">Case Title</label>
														<div class="col-md-9">
															<p class="form-control-static"><%=caseD.getCaseTitle()%></p>
														</div>
													</div>
												</div>
												<div class="col-md-6">
													<div class="form-group">
														<label class="control-label col-md-3">Case Info</label>
														<div class="col-md-9">
															<p class="form-control-static"><%=caseD.getCaseInfo()%></p>
														</div>
													</div>
												</div>
												<%
													if(caseD.getPrescriptions() != null && caseD.getPrescriptions().size() > 0){
												%>
												<div class="prescriptions">
													<div class=" portlet-tabs">
														<ul class="nav nav-tabs prescription-tabs">
															<%
																int prescriptionNum = 0;	
																for(PrescriptionDetails presD : caseD.getPrescriptions()){
																	prescriptionNum++;
															%>
															<li class="prescription-li <% if(prescriptionNum == 1){%>active<%} %>"><a href="#prescription_<%=caseNum %>-<%=prescriptionNum %>">Prescription <span class="caseNum"><%=caseNum %></span>-<span class="prescriptionNum"><%=prescriptionNum %></span></a></li>
															<% 
																}
															%>
														</ul>
														<div class="tab-content tab-content-prescription">
															<%
																prescriptionNum = 0;	
																for(PrescriptionDetails presD : caseD.getPrescriptions()){
																	prescriptionNum++;
															%>
															<div class="tab-pane prescription-tab <% if(prescriptionNum == 1){%>active<%} %>" id="prescription_<%=caseNum %>-<%=prescriptionNum %>">
																<div class="col-md-6">
																	<div class="form-group">
																		<label class="control-label col-md-3">Prescription Date</label>
																		<div class="col-md-9">
																			<p class="form-control-static"><%=presD.getPrescriptioDate()%></p>
																		</div>
																	</div>
																</div>
																<div class="col-md-6">
																	<div class="form-group">
																		<label class="control-label col-md-3">Prescription Info</label>
																		<div class="col-md-9">
																			<p class="form-control-static"><%=presD.getPrescriptionRemarks()%></p>
																		</div>
																	</div>
																</div>
																<%
																	for(CourseDetails courseD : presD.getCourses()){
																		prescriptionNum++;
																%>
																<div class="col-md-12 course">
																	<div class="col-md-4">
																		<p class="form-control-static"><%=courseD.getTabletId()%></p>
																	</div>
																	<div class="col-md-4">
																		<p class="form-control-static"><%=courseD.getNoOfTimesDay()%></p>
																	</div>
																	<div class="col-md-4">
																		<p class="form-control-static">
																			<%=courseD.getStartDate()%>
																			<span class="input-group-addon"> to </span>
																			<%=courseD.getEndDate()%>
																		</p>
																	</div>
																</div>
																<%
																	}
																%>
																
															</div>
															<%
																}
															%>
														</div>
													</div>
												</div>
												<%
													}
												%>
											</div>
											<%
												}
											%>
										</div>
									</div>
								</div>
								<%
									}
								%>
							</div>
							
						</form>
						<!-- END FORM-->
					</div>
				</div>
			</div>
			<!-- END PAGE CONTENT INNER -->
		</div>
	</div>
	<!-- END CONTENT -->
	<!-- END CONTAINER -->
	<!-- BEGIN FOOTER -->
	<div class="page-footer">
		<div class="page-footer-inner"></div>
		<div class="scroll-to-top">
			<i class="icon-arrow-up"></i>
		</div>
	</div>
	<!-- END FOOTER -->
	<!-- BEGIN JAVASCRIPTS(Load javascripts at bottom, this will reduce page load time) -->
	<!-- BEGIN CORE PLUGINS -->
	<!--[if lt IE 9]>
<script src="../../assets/global/plugins/respond.min.js"></script>
<script src="../../assets/global/plugins/excanvas.min.js"></script> 
<![endif]-->
	<script src="../../assets/global/plugins/jquery.min.js" type="text/javascript"></script>
	<script src="../../assets/global/plugins/jquery-migrate.min.js" type="text/javascript"></script>
	<!-- IMPORTANT! Load jquery-ui.min.js before bootstrap.min.js to fix bootstrap tooltip conflict with jquery ui tooltip -->
	<script src="../../assets/global/plugins/jquery-ui/jquery-ui.min.js" type="text/javascript"></script>
	<script src="../../assets/global/plugins/bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
	<script src="../../assets/global/plugins/bootstrap-hover-dropdown/bootstrap-hover-dropdown.min.js" type="text/javascript"></script>
	<script src="../../assets/global/plugins/jquery-slimscroll/jquery.slimscroll.min.js" type="text/javascript"></script>
	<script src="../../assets/global/plugins/jquery.blockui.min.js" type="text/javascript"></script>
	<script src="../../assets/global/plugins/jquery.cokie.min.js" type="text/javascript"></script>
	<script src="../../assets/global/plugins/uniform/jquery.uniform.min.js" type="text/javascript"></script>
	<script src="../../assets/global/plugins/bootstrap-switch/js/bootstrap-switch.min.js" type="text/javascript"></script>
	<!-- END CORE PLUGINS -->
	<!-- BEGIN PAGE LEVEL PLUGINS -->
	<script type="text/javascript" src="../../assets/global/plugins/bootstrap-datepicker/js/bootstrap-datepicker.js"></script>
	<script type="text/javascript" src="../../assets/global/plugins/bootstrap-timepicker/js/bootstrap-timepicker.min.js"></script>
	<script type="text/javascript" src="../../assets/global/plugins/clockface/js/clockface.js"></script>
	<script type="text/javascript" src="../../assets/global/plugins/bootstrap-daterangepicker/moment.min.js"></script>
	<script type="text/javascript" src="../../assets/global/plugins/bootstrap-daterangepicker/daterangepicker.js"></script>
	<script type="text/javascript" src="../../assets/global/plugins/bootstrap-colorpicker/js/bootstrap-colorpicker.js"></script>
	<script type="text/javascript" src="../../assets/global/plugins/bootstrap-datetimepicker/js/bootstrap-datetimepicker.min.js"></script>
	<script type="text/javascript" src="../../assets/global/plugins/select2/select2.min.js"></script>
	<!-- END PAGE LEVEL PLUGINS -->
	<!-- BEGIN PAGE LEVEL SCRIPTS -->
	<script src="../../assets/global/scripts/metronic.js" type="text/javascript"></script>
	<script src="../../assets/admin/layout4/scripts/layout.js" type="text/javascript"></script>
	<script src="../../assets/admin/layout4/scripts/demo.js" type="text/javascript"></script>


	<!-- END PAGE LEVEL SCRIPTS -->
	d
	<script>
		jQuery(document)
				.ready(function() {
					Metronic.init(); // init metronic core componets
					Layout.init(); // init layout
					Demo.init(); // init demo features 
			userId = "<%=ud.getUserId()%>";
			
			function getNotifications(data){
				notificationCount = data.length;
				$notificationBar = $("#header_notification_bar");
				$(".notificationCount",$notificationBar).text(notificationCount);
				
				if(notificationCount > 0){
					$(".notificationHide",$notificationBar ).removeClass("hide");
					$(".notification-list-ul",$notificationBar ).empty();
					
					$.each(data, function(key, notification){
						$notificationLi = $('<li class="notification-li"><a href="javascript:;"><span class="details"></span><span class="notificationId hide"></span></a></li>');
						$(".details", $notificationLi).text(notification.notificationComment);
						$(".notificationId", $notificationLi).text(notification.notificationId);
						$(".notification-list-ul",$notificationBar ).append($notificationLi);
					});
				}
				else{
					$(".notificationHide",$notificationBar ).addClass("hide");
					$(".notification-list-ul",$notificationBar ).empty();
				}
			}
			
			url = "<%=request.getContextPath()%>/GetNotifications?userId="+userId;
			$.getJSON(url).done(function(data){
				getNotifications(data);
			});
			
			$("#header_notification_bar").on("click",".notification-li", function(){
				$this = $(this);
				notificationId = $(".notificationId", $this).text();
				var updNotifyUrl = "<%=request.getContextPath()%>/UpdNotifications?notificationId=" + notificationId + "&userId=" + userId;
						$.getJSON(updNotifyUrl).done(function(data) {
							getNotifications(data);
						});
					});
		
			$(".tab-content").each(function(){
				console.log($(this).css("height"));
			});
		});
	</script>
	<!-- END JAVASCRIPTS -->
</body>
<!-- END BODY -->
</html>