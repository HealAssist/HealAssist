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
<link href="../../assets/global/plugins/jquery-ui/jquery-ui.min.css" rel="stylesheet"/>
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
<body class="page-header-fixed page-sidebar-closed-hide-logo page-sidebar-closed-hide-logo">
	<!-- BEGIN HEADER -->
	<div class="page-header navbar navbar-fixed-top">
		<!-- BEGIN HEADER INNER -->
		<div class="page-header-inner">
			<!-- BEGIN LOGO -->
			<div class="page-logo">
				<a href="index.html"> <img src="../../assets/admin/layout4/img/logo-light.png" alt="logo" class="logo-default" />
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
						<li class="dropdown dropdown-user dropdown-dark"><a href="#" class="dropdown-toggle" data-toggle="dropdown" data-hover="dropdown" data-close-others="true"> <span class="username username-hide-on-mobile"> Priyanka </span> <!-- DOC: Do not remove below empty space(&nbsp;) as its purposely used --> <img alt="" class="img-circle" src="../../assets/admin/layout4/img/avatar2.jpg" />
						</a>
							<ul class="dropdown-menu dropdown-menu-default">
								<li><a href="extra_profile.html"> <i class="icon-user"></i> My Profile
								</a></li>
								<li><a href="page_calendar.html"> <i class="icon-calendar"></i> My Calendar
								</a></li>
								<li><a href="inbox.html"> <i class="icon-envelope-open"></i> My Inbox <span class="badge badge-danger"> 3 </span>
								</a></li>
								<li><a href="page_todo.html"> <i class="icon-rocket"></i> My Tasks <span class="badge badge-success"> 7 </span>
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
					<li class="start"><a href="dashboard.html"> <i class="icon-home"></i> <span class="title">Dashboard</span>
					</a></li>
					<li class="active"><a href="javascript:;"> <i class="icon-basket"></i> <span class="title">Patient Management</span> <span class="arrow "></span>
					</a>
						<ul class="sub-menu">
							<li class="active"><a href="newPatient.jsp"> <i class="icon-home"></i> New Patient
							</a></li>
							<li><a href="searchPatient.html"> <i class="icon-basket"></i> View Patient
							</a></li>
						</ul></li>
					<li><a href="javascript:;"> <i class="icon-rocket"></i> <span class="title">Messages</span> <span class="arrow "></span>
					</a>
						<ul class="sub-menu">
							<li><a href="message_inbox.html"> <span class="badge badge-warning">10</span>Inbox
							</a></li>
							<li><a href="sent.html"> sent</a></li>
						</ul></li>
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
						<h1>New Patient</h1>
					</div>
					<!-- END PAGE TITLE -->
				</div>
				<!-- END PAGE HEAD -->
				<!-- BEGIN PAGE BREADCRUMB -->
				<ul class="page-breadcrumb breadcrumb hide">
					<li><a href="dashboard.html">Dashboard</a><i class="fa fa-circle"></i></li>
					<li class="active">New Patient</li>
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
								<h3 class="form-section">Patient Personal Details</h3>
								<div class="row">
									<div class="col-md-6">
										<div class="form-group">
											<label class="control-label col-md-3">Full Name</label>
											<div class="col-md-9">
												<input type="text" class="form-control" placeholder="Full Name" name="fullName">
											</div>
										</div>
									</div>
									<!--/span-->
									<div class="col-md-6">
										<div class="form-group">
											<label class="control-label col-md-3">E-mail</label>
											<div class="col-md-9">
												<input type="text" class="form-control" placeholder="E-mail Address" name="email">
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
												<select class="form-control" name="gender">
													<option value="m">Male</option>
													<option value="f">Female</option>
												</select>
											</div>
										</div>
									</div>
									<!--/span-->
									<div class="col-md-6">
										<div class="form-group">
											<label class="control-label col-md-3">Phone No</label>
											<div class="col-md-9">
												<input type="text" class="form-control" placeholder="Phone No" name="phoneNo">
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
												<input type="text" class="form-control" placeholder="Age" name="age">
											</div>
										</div>
									</div>

									<div class="col-md-6">
										<div class="form-group">
											<label class="control-label col-md-3">Address</label>
											<div class="col-md-9">
												<input type="text" class="form-control" placeholder="Address" name="address">
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
												<input type="text" class="form-control" placeholder="City / Town" name="cityTown">
											</div>
										</div>
									</div>

									<div class="col-md-6">
										<div class="form-group">
											<label class="control-label col-md-3">Country</label>
											<div class="col-md-9">
												<select name="country" id="select2_sample4" class="select2 select2me form-control">
													<option value=""></option>
													<option value="AF">Afghanistan</option>
													<option value="AL">Albania</option>
													<option value="DZ">Algeria</option>
													<option value="AS">American Samoa</option>
													<option value="AD">Andorra</option>
													<option value="AO">Angola</option>
													<option value="AI">Anguilla</option>
													<option value="AR">Argentina</option>
													<option value="AM">Armenia</option>
													<option value="AW">Aruba</option>
													<option value="AU">Australia</option>
													<option value="AT">Austria</option>
													<option value="AZ">Azerbaijan</option>
													<option value="BS">Bahamas</option>
													<option value="BH">Bahrain</option>
													<option value="BD">Bangladesh</option>
													<option value="BB">Barbados</option>
													<option value="BY">Belarus</option>
													<option value="BE">Belgium</option>
													<option value="BZ">Belize</option>
													<option value="BJ">Benin</option>
													<option value="BM">Bermuda</option>
													<option value="BT">Bhutan</option>
													<option value="BO">Bolivia</option>
													<option value="BA">Bosnia and Herzegowina</option>
													<option value="BW">Botswana</option>
													<option value="BV">Bouvet Island</option>
													<option value="BR">Brazil</option>
													<option value="IO">British Indian Ocean Territory</option>
													<option value="BN">Brunei Darussalam</option>
													<option value="BG">Bulgaria</option>
													<option value="BF">Burkina Faso</option>
													<option value="BI">Burundi</option>
													<option value="KH">Cambodia</option>
													<option value="CM">Cameroon</option>
													<option value="CA">Canada</option>
													<option value="CV">Cape Verde</option>
													<option value="KY">Cayman Islands</option>
													<option value="CF">Central African Republic</option>
													<option value="TD">Chad</option>
													<option value="CL">Chile</option>
													<option value="CN">China</option>
													<option value="CX">Christmas Island</option>
													<option value="CC">Cocos (Keeling) Islands</option>
													<option value="CO">Colombia</option>
													<option value="KM">Comoros</option>
													<option value="CG">Congo</option>
													<option value="CD">Congo, the Democratic Republic of the</option>
													<option value="CK">Cook Islands</option>
													<option value="CR">Costa Rica</option>
													<option value="CI">Cote d'Ivoire</option>
													<option value="HR">Croatia (Hrvatska)</option>
													<option value="CU">Cuba</option>
													<option value="CY">Cyprus</option>
													<option value="CZ">Czech Republic</option>
													<option value="DK">Denmark</option>
													<option value="DJ">Djibouti</option>
													<option value="DM">Dominica</option>
													<option value="DO">Dominican Republic</option>
													<option value="EC">Ecuador</option>
													<option value="EG">Egypt</option>
													<option value="SV">El Salvador</option>
													<option value="GQ">Equatorial Guinea</option>
													<option value="ER">Eritrea</option>
													<option value="EE">Estonia</option>
													<option value="ET">Ethiopia</option>
													<option value="FK">Falkland Islands (Malvinas)</option>
													<option value="FO">Faroe Islands</option>
													<option value="FJ">Fiji</option>
													<option value="FI">Finland</option>
													<option value="FR">France</option>
													<option value="GF">French Guiana</option>
													<option value="PF">French Polynesia</option>
													<option value="TF">French Southern Territories</option>
													<option value="GA">Gabon</option>
													<option value="GM">Gambia</option>
													<option value="GE">Georgia</option>
													<option value="DE">Germany</option>
													<option value="GH">Ghana</option>
													<option value="GI">Gibraltar</option>
													<option value="GR">Greece</option>
													<option value="GL">Greenland</option>
													<option value="GD">Grenada</option>
													<option value="GP">Guadeloupe</option>
													<option value="GU">Guam</option>
													<option value="GT">Guatemala</option>
													<option value="GN">Guinea</option>
													<option value="GW">Guinea-Bissau</option>
													<option value="GY">Guyana</option>
													<option value="HT">Haiti</option>
													<option value="HM">Heard and Mc Donald Islands</option>
													<option value="VA">Holy See (Vatican City State)</option>
													<option value="HN">Honduras</option>
													<option value="HK">Hong Kong</option>
													<option value="HU">Hungary</option>
													<option value="IS">Iceland</option>
													<option value="IN">India</option>
													<option value="ID">Indonesia</option>
													<option value="IR">Iran (Islamic Republic of)</option>
													<option value="IQ">Iraq</option>
													<option value="IE">Ireland</option>
													<option value="IL">Israel</option>
													<option value="IT">Italy</option>
													<option value="JM">Jamaica</option>
													<option value="JP">Japan</option>
													<option value="JO">Jordan</option>
													<option value="KZ">Kazakhstan</option>
													<option value="KE">Kenya</option>
													<option value="KI">Kiribati</option>
													<option value="KP">Korea, Democratic People's Republic of</option>
													<option value="KR">Korea, Republic of</option>
													<option value="KW">Kuwait</option>
													<option value="KG">Kyrgyzstan</option>
													<option value="LA">Lao People's Democratic Republic</option>
													<option value="LV">Latvia</option>
													<option value="LB">Lebanon</option>
													<option value="LS">Lesotho</option>
													<option value="LR">Liberia</option>
													<option value="LY">Libyan Arab Jamahiriya</option>
													<option value="LI">Liechtenstein</option>
													<option value="LT">Lithuania</option>
													<option value="LU">Luxembourg</option>
													<option value="MO">Macau</option>
													<option value="MK">Macedonia, The Former Yugoslav Republic of</option>
													<option value="MG">Madagascar</option>
													<option value="MW">Malawi</option>
													<option value="MY">Malaysia</option>
													<option value="MV">Maldives</option>
													<option value="ML">Mali</option>
													<option value="MT">Malta</option>
													<option value="MH">Marshall Islands</option>
													<option value="MQ">Martinique</option>
													<option value="MR">Mauritania</option>
													<option value="MU">Mauritius</option>
													<option value="YT">Mayotte</option>
													<option value="MX">Mexico</option>
													<option value="FM">Micronesia, Federated States of</option>
													<option value="MD">Moldova, Republic of</option>
													<option value="MC">Monaco</option>
													<option value="MN">Mongolia</option>
													<option value="MS">Montserrat</option>
													<option value="MA">Morocco</option>
													<option value="MZ">Mozambique</option>
													<option value="MM">Myanmar</option>
													<option value="NA">Namibia</option>
													<option value="NR">Nauru</option>
													<option value="NP">Nepal</option>
													<option value="NL">Netherlands</option>
													<option value="AN">Netherlands Antilles</option>
													<option value="NC">New Caledonia</option>
													<option value="NZ">New Zealand</option>
													<option value="NI">Nicaragua</option>
													<option value="NE">Niger</option>
													<option value="NG">Nigeria</option>
													<option value="NU">Niue</option>
													<option value="NF">Norfolk Island</option>
													<option value="MP">Northern Mariana Islands</option>
													<option value="NO">Norway</option>
													<option value="OM">Oman</option>
													<option value="PK">Pakistan</option>
													<option value="PW">Palau</option>
													<option value="PA">Panama</option>
													<option value="PG">Papua New Guinea</option>
													<option value="PY">Paraguay</option>
													<option value="PE">Peru</option>
													<option value="PH">Philippines</option>
													<option value="PN">Pitcairn</option>
													<option value="PL">Poland</option>
													<option value="PT">Portugal</option>
													<option value="PR">Puerto Rico</option>
													<option value="QA">Qatar</option>
													<option value="RE">Reunion</option>
													<option value="RO">Romania</option>
													<option value="RU">Russian Federation</option>
													<option value="RW">Rwanda</option>
													<option value="KN">Saint Kitts and Nevis</option>
													<option value="LC">Saint LUCIA</option>
													<option value="VC">Saint Vincent and the Grenadines</option>
													<option value="WS">Samoa</option>
													<option value="SM">San Marino</option>
													<option value="ST">Sao Tome and Principe</option>
													<option value="SA">Saudi Arabia</option>
													<option value="SN">Senegal</option>
													<option value="SC">Seychelles</option>
													<option value="SL">Sierra Leone</option>
													<option value="SG">Singapore</option>
													<option value="SK">Slovakia (Slovak Republic)</option>
													<option value="SI">Slovenia</option>
													<option value="SB">Solomon Islands</option>
													<option value="SO">Somalia</option>
													<option value="ZA">South Africa</option>
													<option value="GS">South Georgia and the South Sandwich Islands</option>
													<option value="ES">Spain</option>
													<option value="LK">Sri Lanka</option>
													<option value="SH">St. Helena</option>
													<option value="PM">St. Pierre and Miquelon</option>
													<option value="SD">Sudan</option>
													<option value="SR">Suriname</option>
													<option value="SJ">Svalbard and Jan Mayen Islands</option>
													<option value="SZ">Swaziland</option>
													<option value="SE">Sweden</option>
													<option value="CH">Switzerland</option>
													<option value="SY">Syrian Arab Republic</option>
													<option value="TW">Taiwan, Province of China</option>
													<option value="TJ">Tajikistan</option>
													<option value="TZ">Tanzania, United Republic of</option>
													<option value="TH">Thailand</option>
													<option value="TG">Togo</option>
													<option value="TK">Tokelau</option>
													<option value="TO">Tonga</option>
													<option value="TT">Trinidad and Tobago</option>
													<option value="TN">Tunisia</option>
													<option value="TR">Turkey</option>
													<option value="TM">Turkmenistan</option>
													<option value="TC">Turks and Caicos Islands</option>
													<option value="TV">Tuvalu</option>
													<option value="UG">Uganda</option>
													<option value="UA">Ukraine</option>
													<option value="AE">United Arab Emirates</option>
													<option value="GB">United Kingdom</option>
													<option value="US">United States</option>
													<option value="UM">United States Minor Outlying Islands</option>
													<option value="UY">Uruguay</option>
													<option value="UZ">Uzbekistan</option>
													<option value="VU">Vanuatu</option>
													<option value="VE">Venezuela</option>
													<option value="VN">Viet Nam</option>
													<option value="VG">Virgin Islands (British)</option>
													<option value="VI">Virgin Islands (U.S.)</option>
													<option value="WF">Wallis and Futuna Islands</option>
													<option value="EH">Western Sahara</option>
													<option value="YE">Yemen</option>
													<option value="ZM">Zambia</option>
													<option value="ZW">Zimbabwe</option>
												</select>
											</div>
										</div>
									</div>
									<!--/span-->

								</div>
								<div class="row">
									<div class="col-md-6">
										<div class="form-group">
											<label class="control-label col-md-3">Pincode</label>
											<div class="col-md-9">
												<input type="text" class="form-control" name="pincode" placeholder="Pincode">
											</div>
										</div>
									</div>

									<div class="col-md-6">
										<div class="form-group">
											<label class="control-label col-md-3">User Name</label>
											<div class="col-md-9">
												<input type="text" class="form-control" name="userName" placeholder="User name">
											</div>
										</div>
									</div>

								</div>
								<div class="row">
									<div class="col-md-6">
										<div class="form-group">
											<label class="control-label col-md-3">Password</label>
											<div class="col-md-9">
												<input type="password" class="form-control" name="password" placeholder="Password">
											</div>
										</div>
									</div>

									<div class="col-md-6">
										<div class="form-group">
											<label class="control-label col-md-3">Retype Password</label>
											<div class="col-md-9">
												<input type="password" class="form-control" name="rPassword" placeholder="Retype Password">
											</div>
										</div>
									</div>
									<!--/span-->
								</div>
								<h3 class="form-section">Patient Health Details</h3>
								<input type="hidden" class="casesCount" name="casesCount" value="0" />
								<div class="cases">
									<div class=" portlet-tabs">
										<ul class="nav nav-tabs case-tabs">
											<li><a href="#" class="add-case" data-toggle="tab"> + Add Case </a></li>
										</ul>
										<div class="tab-content tab-content-case"></div>
									</div>
									<div class="row hidden" id="case-template">
										<input type="hidden" class="case-field prescriptionCount" data-name="prescriptionCount" name="prescriptionCount" value="0" />
										<div class="col-md-6">
											<div class="form-group">
												<label class="control-label col-md-3">Case Date</label>
												<div class="col-md-9">
													<div class="input-group date form_meridian_datetime">
														<input type="text" size="16" class="form-control case-field" data-name="case-date" name="case-date"> <span class="input-group-btn">
															<button class="btn default date-set" type="button">
																<i class="fa fa-calendar"></i>
															</button>
														</span>
													</div>
													<!-- /input-group -->
												</div>
											</div>
										</div>
										<div class="col-md-6">
											<div class="form-group">
												<label class="control-label col-md-3">Doctor</label>
												<div class="col-md-9">
													<select class="form-control case-field select2" name="doctor" data-name="doctor">
														<option value="">Select Doctor</option>
														<!-- Get all doctor names -->
														<%
															String sql1 = "select ud.user_id,ud.USER_FULL_NAME from user_details ud where ud.user_type_id=2";
															DBConnection db = new DBConnection();

															db.ps = db.getConnection().prepareStatement(sql1);
															db.rs = db.ps.executeQuery();

															while (db.rs.next()) {
														%>
														<option value="<%=db.rs.getString(1)%>">
															<%=db.rs.getString(2)%></option>
														<%
															}
														%>
													</select>
													<!-- /input-group -->
												</div>
											</div>
										</div>

										<div class="col-md-6">
											<div class="form-group">
												<label class="control-label col-md-3">Case Title</label>
												<div class="col-md-9">
													<input type="text" size="16" class="form-control case-field" name="case-title" data-name="case-title">
													<!-- /input-group -->
												</div>
											</div>
										</div>
										<div class="col-md-6">
											<div class="form-group">
												<label class="control-label col-md-3">Case Info</label>
												<div class="col-md-9">
													<textarea class="form-control case-field" name="case-info" data-name="case-info"></textarea>
													<!-- /input-group -->
												</div>
											</div>
										</div>

										<div class="prescriptions">
											<div class=" portlet-tabs">
												<ul class="nav nav-tabs prescription-tabs">
													<li><a href="#" class="add-prescription" data-toggle="tab"> + Add Prescription </a></li>
												</ul>
												<div class="tab-content tab-content-prescription"></div>
											</div>
										</div>
									</div>
									<div class="row hidden" id="prescription-template">
										<input type="hidden" class="prescription-field coursesCount" name="coursesCount" data-name="coursesCount" value="1" />
										<div class="col-md-6">
											<div class="form-group">
												<label class="control-label col-md-3">Prescription Date</label>
												<div class="col-md-9">
													<div class="input-group date form_meridian_datetime" data-date="2012-12-21T15:25:00Z">
														<input type="text" size="16" class="form-control prescription-field" name="prescription-date" data-name="prescription-date"> <span class="input-group-btn">
															<button class="btn default date-set" type="button">
																<i class="fa fa-calendar"></i>
															</button>
														</span>
													</div>
													<!-- /input-group -->
												</div>
											</div>
										</div>
										<div class="col-md-6">
											<div class="form-group">
												<label class="control-label col-md-3">Prescription Info</label>
												<div class="col-md-9">
													<textarea class="form-control prescription-field" name="prescription-remarks" data-name="prescription-remarks"></textarea>
													<!-- /input-group -->
												</div>
											</div>
										</div>
										<div class="col-md-12 margin-bottom-10">
											<a href="#" class="btn grey addCourse">Add Course</a>
										</div>
									</div>

									<div id="course_template" style="display: none">
										<div class="col-md-12 course">
											<div class="col-md-4">
												<input type="text" class="form-control course-field tablet" name="tablet" data-name="tablet" placeholder="Tablet Name">
											</div>
											<div class="col-md-4">
												<select name="noOfTimes" data-name="noOfTimes" class="form-control course-field">
													<option value="">Select No of Times</option>
													<option value="001">001</option>
													<option value="011">011</option>
													<option value="010">010</option>
													<option value="100">100</option>
													<option value="101">101</option>
													<option value="110">110</option>
													<option value="111">111</option>
												</select>
											</div>
											<div class="col-md-4">
												<div class="input-group input-large date-picker input-daterange" data-date="10/11/2012" data-date-format="mm/dd/yyyy">
													<input type="text" class="form-control course-field" name="startDate" data-name="startDate"> <span class="input-group-addon"> to </span> <input type="text" class="form-control course-field" name="endDate" data-name="endDate">
												</div>
												<!-- /input-group -->
												<span class="help-block"> Select date range </span>
											</div>
										</div>
									</div>

								</div>
							</div>
							<div class="form-actions">
								<div class="row">
									<div class="col-md-6">
										<div class="row">
											<div class="col-md-offset-3 col-md-9">
												<button type="submit" class="btn green">Submit</button>
												<button type="button" class="btn default">Cancel</button>
											</div>
										</div>
									</div>
									<div class="col-md-6"></div>
								</div>
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

					$('.date-picker').datepicker({
					rtl : Metronic.isRTL(),
					orientation : "left",
					autoclose : true
					});

					$(".case-tabs")
							.on("click", "a:not('.add-case')", function(e) {
								e.preventDefault();
								$(this).tab('show');
							})
							.on("click", "li span.close", function() {
								if (confirm('Do you want to remove this Case Details?')) {
									var anchor = $(this).siblings('a');
									$(anchor.attr('href')).remove();
									$(this).parent().remove();
									liList = $(".case-tabs li");
									if (liList.length > 1)
										liList.children('a').first().click();
									casePrescriptionRefresh();
								}
							});

					$('.add-case')
							.click(function(e) {
								e.preventDefault();
								var id = $(".case-tabs").children().length; //think about it ;)
								$(this)
										.closest('li')
										.before('<li class="case-li"><a href="#case_'+id+'">Case <span class="caseNum">' + id + '</span></a><span class="close">x</span></li>');
								$('.tab-content-case')
										.append('<div class="tab-pane case-tab" id="case_'+id+'"></div>');
								newCase = $("#case-template").clone();
								$(".case-field", newCase)
										.each(function() {
											$this = $(this);
											$this.attr("name", $this
													.attr("name") + '_' + id);
										});
								$('#case_' + id).append(newCase.html());
								$(".casesCount").first()
										.val(parseInt($(".casesCount").first()
												.val()) + 1);
								$(".form_meridian_datetime")
										.datetimepicker({
										isRTL : Metronic.isRTL(),
										format : "dd MM yyyy - HH:ii P",
										showMeridian : true,
										autoclose : true,
										pickerPosition : (Metronic.isRTL() ? "bottom-right" : "bottom-left"),
										todayBtn : true
										}).change(function() {
											console.log($(this).val());

										});
								//$(".nav-tabs li").children('a').first().click();
							});

					$(".cases")
							.on("click", ".prescription-tabs a:not('.add-prescription')", function(e) {
								e.preventDefault();
								$(this).tab('show');
							})
							.on("click", ".prescription-tabs li span.presClose", function() {
								if (confirm('Do you want to remove this Prescription Details?')) {
									var anchor = $(this).siblings('a');
									$(anchor.attr('href')).remove();
									$(this).parent().remove();
									thisCase = $(this).closest(".case-tab");
									liList = $(".prescription-tabs li", thisCase);
									if (liList.length > 1)
										liList.children('a').first().click();
									casePrescriptionRefresh();
								}
							});

					$(".cases")
							.on("click", ".add-prescription", function(e) {
								e.preventDefault();
								thisCase = $(this).closest(".case-tab");
								caseNum = $(".case-tab").index(thisCase) + 1;
								var id = $(".prescription-tabs", thisCase)
										.children().length; //think about it ;)
								$(this)
										.closest('li')
										.before('<li class="prescription-li"><a href="#prescription_'+caseNum+'-'+id+'">Prescription <span class="caseNum">' + caseNum + '</span>-<span class="prescriptionNum">' + id + '</span></a><span class="presClose">x</span></li>');
								courseTemplate = $("#course_template").clone();
								prescriptionTemplate = $("#prescription-template")
										.clone();
								//$('.tab-content-prescription', thisCase).append('<div class="tab-pane prescription-tab" id="prescription_'+caseNum+'-'+id+'"><div class="margin-bottom-10"><a href="#" class="btn grey addCourse">Add Course</a></div>'+courseTemplate+'</div>');
								$('.tab-content-prescription', thisCase)
										.append('<div class="tab-pane prescription-tab" id="prescription_'+caseNum+'-'+id+'"></div>');

								$(".prescription-field", prescriptionTemplate)
										.each(function() {
											$this = $(this);
											$this
													.attr("name", $this
															.attr("name") + '_' + caseNum + '-' + id);
										});
								$('#prescription_' + caseNum + '-' + id)
										.append(prescriptionTemplate.html());

								$(".course-field", courseTemplate)
										.each(function() {
											$this = $(this);
											$this
													.attr("name", $this
															.attr("name") + '_' + caseNum + '-' + id + '-' + 1);
										});
								$('#prescription_' + caseNum + '-' + id)
										.append(courseTemplate.html());

								$(".prescriptionCount", thisCase)
										.first()
										.val(parseInt($(".prescriptionCount", thisCase)
												.first().val()) + 1);

								$(".form_meridian_datetime")
										.datetimepicker({
										isRTL : Metronic.isRTL(),
										format : "dd MM yyyy - HH:ii P",
										showMeridian : true,
										autoclose : true,
										pickerPosition : (Metronic.isRTL() ? "bottom-right" : "bottom-left"),
										todayBtn : true
										});

								$('.date-picker').datepicker({
								rtl : Metronic.isRTL(),
								orientation : "left",
								autoclose : true
								});
								
								
								$(".tablet")
										.autocomplete({
										source : function(request, response) {
											$
													.ajax({
													url : "https://pubchem.ncbi.nlm.nih.gov/pcautocp/pcautocp.cgi",
													dataType : "jsonp",
													data : {
													q : request.term,
													dict : 'pc_compoundnames',
													n : 20
													},
													success : function(data) {
														response(data.autocp_array);
													}
													});
										},
										minLength : 3,
										open : function() {
											$(this)
													.removeClass("ui-corner-all")
													.addClass("ui-corner-top");
										},
										close : function() {
											$(this)
													.removeClass("ui-corner-top")
													.addClass("ui-corner-all");
										}
									});
							});

					$(".cases")
							.on("click", ".addCourse", function(e) {
								e.preventDefault();
								thisCase = $(this).closest(".case-tab");
								caseNum = $(".case-tab").index(thisCase) + 1;

								thisPrescription = $(this)
										.closest(".prescription-tab");
								prescriptionNum = $(".prescription-tab", thisCase)
										.index(thisPrescription) + 1;

								var id = $(".course", thisPrescription).length + 1;

								courseTemplate = $("#course_template").clone();

								$(".course-field", courseTemplate)
										.each(function() {
											$this = $(this);
											$this
													.attr("name", $this
															.attr("name") + '_' + caseNum + '-' + prescriptionNum + '-' + id);
										});
								$(thisPrescription).append(courseTemplate
										.html());

								$(".coursesCount", thisPrescription)
										.first()
										.val(parseInt($(".coursesCount", thisPrescription)
												.first().val()) + 1);
								$(".form_meridian_datetime")
										.datetimepicker({
										isRTL : Metronic.isRTL(),
										format : "dd MM yyyy - HH:ii P",
										showMeridian : true,
										autoclose : true,
										pickerPosition : (Metronic.isRTL() ? "bottom-right" : "bottom-left"),
										todayBtn : true
										});

								$('.date-picker').datepicker({
								rtl : Metronic.isRTL(),
								orientation : "left",
								autoclose : true
								});
								
								$(".tablet")
								.autocomplete({
								source : function(request, response) {
									$
											.ajax({
											url : "https://pubchem.ncbi.nlm.nih.gov/pcautocp/pcautocp.cgi",
											dataType : "jsonp",
											data : {
											q : request.term,
											dict : 'pc_compoundnames',
											n : 20
											},
											success : function(data) {
												response(data.autocp_array);
											}
											});
								},
								minLength : 3,
								open : function() {
									$(this)
											.removeClass("ui-corner-all")
											.addClass("ui-corner-top");
								},
								close : function() {
									$(this)
											.removeClass("ui-corner-top")
											.addClass("ui-corner-all");
								}
							});
								
							});

					$(".form_meridian_datetime")
							.datetimepicker({
							isRTL : Metronic.isRTL(),
							format : "dd MM yyyy - HH:ii P",
							showMeridian : true,
							autoclose : true,
							pickerPosition : (Metronic.isRTL() ? "bottom-right" : "bottom-left"),
							todayBtn : true
							});

					function casePrescriptionRefresh() {
						$caseLis = $(".case-li");
						$caseLis
								.each(function(index) {
									caseNum = index + 1;
									thisCaseLi = $(this);
									$(".caseNum", thisCaseLi).text(caseNum);
									$(".casesCount").first()
											.val(parseInt(caseNum));
									thisCase = $($("a", thisCaseLi).first()
											.attr("href"));
									$(".case-field", thisCase)
											.each(function() {
												$thisField = $(this);
												$thisField
														.attr("name", $thisField
																.attr("data-name") + '_' + caseNum);
											});
									$(".caseNum", thisCase).text(caseNum);
									$prescriptionLis = $(".prescription-li", thisCase);
									$prescriptionLis
											.each(function(pIndex) {
												presNum = pIndex + 1;
												thisPresLi = $(this);
												$(".prescriptionNum", thisPresLi)
														.text(presNum);
												$(".prescriptionCount", thisCase)
														.first()
														.val(parseInt(presNum));
												thisPres = $($("a", thisPresLi)
														.first().attr("href"));
												$(".prescription-field", thisPres)
														.each(function() {
															$thisField = $(this);
															$thisField
																	.attr("name", $thisField
																			.attr("data-name") + '_' + caseNum + '-' + presNum);
														});

												$(".course", thisPres)
														.each(function(cIndex) {
															courseNum = cIndex + 1;
															thisCourse = $(this);
															$(".course-field", thisCourse)
																	.each(function() {
																		$thisField = $(this);
																		$thisField
																				.attr("name", $thisField
																						.attr("data-name") + '_' + caseNum + '-' + presNum + '-' + courseNum);
																	});
														});
											});
								});

						$caseLis
								.each(function(index) {
									caseNum = index + 1;
									thisCaseLi = $(this);
									thisCase = $($("a", thisCaseLi).first()
											.attr("href"));

									$prescriptionLis = $(".prescription-li", thisCase);
									$prescriptionLis
											.each(function(pIndex) {
												presNum = pIndex + 1;
												thisPresLi = $(this);
												thisPres = $($("a", thisPresLi)
														.first().attr("href"));
												thisPres
														.attr("id", 'prescription_' + caseNum + '-' + presNum);
												$("a", thisPresLi)
														.first()
														.attr("href", '#prescription_' + caseNum + '-' + presNum);
											});
									thisCase.attr("id", 'case_' + caseNum);
									$("a", thisCaseLi).first()
											.attr("href", '#case_' + caseNum);
								});

					}

				});
	</script>
	<!-- END JAVASCRIPTS -->
</body>
<!-- END BODY -->
</html>