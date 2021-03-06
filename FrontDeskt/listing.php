<!DOCTYPE html>
<html lang="en">
<head>

	<!-- Meta -->
	<meta charset="utf-8">
	<meta name="keywords" content="HTML5 Template" />
	<meta name="description" content="Listingpro - Template HTML5">
	<meta name="author" content="">
	
	<!-- Title -->
	<title>patypluss - Home</title>
	
	<!-- Mobile Meta -->
	<meta name="viewport" content="width=device-width, initial-scale=1">
	
	<!-- Favicon -->
	<link rel="shortcut icon" href="images/favicon.png" type="image/x-icon">
	
	<!-- CSS -->
	<link href="lib/bootstrap/css/bootstrap.css" type="text/css" rel="stylesheet" />
	<link href="css/colors.css" type="text/css" rel="stylesheet" />
	<link href="css/font.css" type="text/css" rel="stylesheet" />
	<link href="lib/jQuery.filer-master/css/jquery.filer.css" type="text/css" rel="stylesheet" />
	<link href="lib/jQuery.filer-master/css/themes/jquery.filer-dragdropbox-theme.css" type="text/css" rel="stylesheet" />
	<link href="lib/popup/css/component.css" type="text/css" rel="stylesheet" />
	<link href="lib/icon8/styles.min.css" type="text/css" rel="stylesheet" />
	<link href="lib/font-awesome/css/font-awesome.min.css" type="text/css" rel="stylesheet" />
	<link type="text/css" rel="stylesheet" href="lib/jquerym.menu/css/jquery.mmenu.all.css" />
	<link href='css/mapbox.css' rel='stylesheet' />
	<link href='lib/chosen/chosen.css' rel='stylesheet' />
	<link href='https://api.mapbox.com/mapbox.js/plugins/leaflet-markercluster/v0.4.0/MarkerCluster.css' rel='stylesheet' />
	<link href='https://api.mapbox.com/mapbox.js/plugins/leaflet-markercluster/v0.4.0/MarkerCluster.Default.css' rel='stylesheet' />
	<link href="css/main.css" type="text/css" rel="stylesheet" />

	<!-- IE8 support of HTML5 elements and media queries -->
	<!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
	<![endif]-->
</head>
<body class="listing" data-userlink ="login.html">
	<div id="page">
	<!--==================================Header Open=================================-->
	<header class="">

	<header class="lp-header-bg">
	<!--==================================Cabezera=================================-->
	<? include("header.php");?>

	<!--==================================Registro=================================-->
	<? include("register.php");?>	
	
	<!--==================================Sub Header=================================-->
	<? include("sub-header.php");?>		


		<div class="lp-topbar">
			<div class="container">
				<div class="row">
					<div class="col-md-8 col-sm-8 text-left">
						<ul class="lp-topbar-menu">
							<li>
								<a href="index.html">Home</a>
							</li>
							<li>
								<a href="about.html">About</a>
							</li>
							<li>
								<a href="contact.html">Contact</a>
							</li>
						</ul>
					</div>
					<div class="col-md-4 col-sm-4 text-right">
						<div class="lp-join-now">
							<span>
								<!-- Contacts icon by Icons8 -->
								<img class="icon icons8-Contacts" src="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAADIAAAAyCAYAAAAeP4ixAAADNElEQVRoge2ZLWhbURTHn3iig8IiIiomIgqrqJiomJgIrCKiomKig4iKioiKioiJiEJExURFRGEbRERMVERkENhE5BgTGUxEVERkUBERURFR8Zu45+5durzk3feRm7H8IRB455z3u9/3nOd5a6317wjYAcrAOdAEroAqcAhsuOabK8AHKsBX5qsP7LrmnSlgE+gasCMZhRpwDJwCDeBGnk+Bt8COa/Y/AjaAn0YDDgA/xNYH3j8YoUaY/VIlPQvwHdiKYO8De0AdGItvcxms86AKwL38rOe9bAoTacyzLBijglQE4jpBjHOJ8TFNNluItkAcJ4ixKzGGKaJZQ/QEopgwDgApYcUC0NtpIWEc5w3R227shQrkVqEhn4ThdYIYTyXGrzTZbCH04fYmQYznEqOfJpstRFUg3qUQ4zJNNluIA4H4nCDGtcQop8lmC1ESiElM/7zcCgD20+azAdE33lpMfx+4kBjttPlsQAYCETu/AIoSo5cmmy1E4vmNylcgwX0tsVDpLMAQqMbwr4mv88XuAx0BuYnhr6/wXVwnV8Aj4IcAvbDweyk+37LksxKqUgJQt/Cpi89VlmxWMnaeCZCLYJ8zplVxCYjRRZCbdObNd1lXOiFzt+WGieC6ohuTn2GTMxoBsOeCda5Qta2pATkGTlAFioL8HxnPR66ZQ2WcCQPCpbNKdzn6IhFcAPOow7ItozBGnRUVYHulG0JQDZkusNvSdqxSydTzPA9VOdTTaWGCBLSMKeh+wcsoNI0pBXARwa9m2N9LjOVWGlHnwCuCO5aGaROUT4/m+O8bdq0HndAFjsjyGwqq6n5GUHgGdTpfAttiUzeeNVBnS15+JbHVqolPAVUInxjPxqhS6sJbgm0jysCt8aIB6pvH5gzbU+COcE2Bs5COqhDUynRH/WUbpwE+6oONVh84jOC3I6PTkd4dy/86EbJJ1Ce6vvHe1qxOs2mIXgd3wEnsQPHfXzZGt0ecnIUgBR0ia8CFUAfoUFjsslDgCcHiK2XEaMOj04QpNgVzgg84X7LDs5MxzaMvfuCDtVPGQu2GAC0bJ3OrXTXdRm1EbmEo93ocd2TXWut/1W9KptrZf/2YyAAAAABJRU5ErkJggg==" alt="join-now">
							</span>
							<a class=" md-trigger" data-modal="modal-3">Join Now</a>
						</div>
					</div>
				</div>
			</div>
		</div><!-- ../topbar -->
		
		<!-- Login Popup -->
		<div class="md-modal md-effect-3" id="modal-3">
			<div class="login-form-popup lp-border-radius-8">
				<div class="siginincontainer">
					<h1 class="text-center">Sign in</h1>
					<form class="form-horizontal margin-top-30"  method="post">
						<div class="form-group">
							<label for="username">Username or Email Address *</label>
							<input type="text" class="form-control" id="username" />
						</div>
						<div class="form-group">
							<label for="password">Password *</label>
							<input type="password" class="form-control" id="password" />
						</div>
						<div class="form-group">
							<div class="checkbox pad-bottom-10">
								<input id="check1" type="checkbox" name="price-on-call" value="price-on-call">
								<label for="check1">Keep me signed in</label>
							</div>
						</div>
						
						<div class="form-group">
							<input type="submit" value="Sign in" class="lp-secondary-btn width-full btn-first-hover" /> 
						</div>
					</form>	
					<div class="pop-form-bottom">
						<div class="bottom-links">
							<a  class="signUpClick">Not a member? Sign up</a>
							<a  class="forgetPasswordClick pull-right" >Forgot Password</a>
						</div>
						<p class="margin-top-15">Connect with your Social Network</p>
						<ul class="social-login list-style-none">
							<li><button id="logingoogle" class="google flaticon-googleplus" ><i class="fa fa-google-plus"></i><span>Google</span></button></li>
							<li><button id="loginfacebook" class="facebook flaticon-facebook" ><i class="fa fa-facebook"></i><span>Facebook</span></button></li>
							<li><button id="logintwitter" class="twitter flaticon-twitter" ><i class="fa fa-twitter"></i><span>Twitter</span></button></li>
						</ul>
					</div>
				<a class="md-close"><i class="fa fa-close"></i></a>
				</div>
				<div class="siginupcontainer">
					<h1 class="text-center">Sign Up</h1>
					<form class="form-horizontal margin-top-30"  method="post">
						<div class="form-group">
							<label for="username">Username *</label>
							<input type="text" class="form-control" id="username2" />
						</div>
						<div class="form-group">
							<label for="password">Email Address *</label>
							<input type="email" class="form-control" id="password2" />
						</div>
						<div class="form-group">
							<p>A password will be e-mailed to you.</p>
						</div>
						<div class="form-group">
							<input type="submit" value="Register" class="lp-secondary-btn width-full btn-first-hover" /> 
						</div>
					</form>	
					<div class="pop-form-bottom">
						<div class="bottom-links">
							<a class="signInClick" >Already have an account? Sign in</a>
							<a class="forgetPasswordClick pull-right" >Forgot Password</a>
						</div>
						<p class="margin-top-15">Connect with your Social Network</p>
						<ul class="social-login list-style-none">
							<li><button id="logingoogle2" class="google flaticon-googleplus" ><i class="fa fa-google-plus"></i><span>Google</span></button></li>
							<li><button id="loginfacebook2" class="facebook flaticon-facebook" ><i class="fa fa-facebook"></i><span>Facebook</span></button></li>
							<li><button id="logintwitter2" class="twitter flaticon-twitter" ><i class="fa fa-twitter"></i><span>Twitter</span></button></li>
						</ul>
					</div>
				<a class="md-close"><i class="fa fa-close"></i></a>
				</div>
				<div class="forgetpasswordcontainer">
					<h1 class="text-center">Forgotten Password</h1>
					<form class="form-horizontal margin-top-30"  method="post">
						<div class="form-group">
							<label for="password">Email Address *</label>
							<input type="email" class="form-control" id="email2" />
						</div>
						<div class="form-group">
							<input type="submit" value="Get New Password" class="lp-secondary-btn width-full btn-first-hover" /> 
						</div>
					</form>	
					<div class="pop-form-bottom">
						<div class="bottom-links">
							<a class="cancelClick" >Cancel</a>
						</div>
					</div>
				<a class="md-close"><i class="fa fa-close"></i></a>
				</div>
			</div>	
		</div>
		<!-- ../Login Popup -->
		
		<!-- Popup Open -->
		<div class="md-modal md-effect-3" id="modal-2">
			<div class="container">
				<div class="md-content ">
					<div class="row popup-inner-left-padding ">
						<div class="col-md-6 lp-insert-data">
						</div>
						<div class="col-md-6">
							<div id="quickmap" class="quickmap"></div>
							<a class="md-close widget-map-click"><i class="fa fa-close"></i></a>
						</div>
					</div>
				</div>
			</div>
		</div>
		<!-- Popup Close -->
		<div class="md-overlay"></div> <!-- Overlay for Popup -->
							<div id="menu">
								<ul>
									<li><a href="listing.html#">Categories </a>
										<ul class="sub-menu">
											<li class="has-menu"><a href="listing.html">Food </a>
												<ul class="sub-menu">
													<li><a href="listing.html">Restaurents </a></li>
													<li><a href="listing.html">Cafe </a></li>
													<li><a href="listing.html">Bars</a></li>
												</ul>
											</li>
											<li><a href="listing.html">Beauty & Spas </a></li>
											<li><a href="listing.html">Real Estate </a></li>
											<li><a href="listing.html">Automotive </a></li>
										</ul>
									</li>
									<li><a href="listing.html#">Pages</a>
										<ul class="sub-menu">
											<li><a href="listing.html">Listing </a></li>
											<li><a href="listing-sidebar.html">Listing - Sidebar </a></li>
											<li><a href="listing-map.html">Listing - Map </a></li>
											<li><a href="author.html">Author </a></li>
											<li><a href="post-detail.html">Post Detail </a></li>
											<li><a href="post-submit.html">Post Submit </a></li>
											<li><a href="login.html">Join Us</a></li><li><a href="index-1.html">Home 2</a></li>
										</ul>
									</li>
									<li><a href="listing.html#">Blog</a>
										<ul class="sub-menu">
											<li><a href="blog-archive.html">Blog </a></li>
											<li><a href="blog-detail.html">Blog Detail </a></li>
										</ul>
									</li>
									<li>
										<a href="listing.html#">Elements</a>
											<ul class="sub-menu">
											<li><a href="pricing.html">Pricing </a></li>
											<li><a href="404.html">404 Page </a></li>
											<li><a href="testimonials.html">Testimonials </a></li>
										</ul>
									</li>
								</ul>
							</div>
		<div class="lp-menu-bar  lp-menu-bar-color">
			<div class="container">
					<div class="row">
						<div class="col-md-4 col-xs-6 lp-logo-container">
							<div class="lp-logo">
								<a href="index.html">
									<img src="images/logo.png" alt="" />
								</a>
							</div>
						</div>
						<div class="col-xs-6 mobile-nav-icon">
							<a href="listing.html#menu" class="nav-icon">
								<span class="icon-bar"></span>
								<span class="icon-bar"></span>
								<span class="icon-bar"></span>
							</a>
						</div>
						<div class="col-md-8 col-xs-12 lp-menu-container">
							<div class="pull-right lp-add-listing-btn">
								<ul>
									<li><a href="post-submit.html"><i class="fa fa-plus"></i> Add Listing</a></li>
								</ul>
							</div>
							<div class="lp-menu pull-right menu">
								<ul>
									<li><a href="listing.html#">Categories <i class="icons8-angle-down drop-down-icon"></i></a>
										<ul class="sub-menu">
											<li class="has-menu"><a href="listing.html">Food </a>
												<ul class="sub-menu">
													<li><a href="listing.html">Restaurents </a></li>
													<li><a href="listing.html">Cafe </a></li>
													<li><a href="listing.html">Bars</a></li>
												</ul>
											</li>
											<li><a href="listing.html">Beauty & Spas </a></li>
											<li><a href="listing.html">Real Estate </a></li>
											<li><a href="listing.html">Automotive </a></li>
										</ul>
									</li>
									<li><a href="listing.html#">Pages <i class="icons8-angle-down drop-down-icon"></i></a>
										<ul class="sub-menu">
											<li><a href="listing.html">Listing </a></li>
											<li><a href="listing-sidebar.html">Listing - Sidebar </a></li>
											<li><a href="listing-map.html">Listing - Map </a></li>
											<li><a href="author.html">Author </a></li>
											<li><a href="post-detail.html">Post Detail </a></li>
											<li><a href="post-submit.html">Post Submit </a></li>
											<li><a href="login.html">Join Us</a></li><li><a href="index-1.html">Home 2</a></li>
										</ul>
									</li>
									<li><a href="listing.html#">Blog <i class="icons8-angle-down drop-down-icon"></i></a>
										<ul class="sub-menu">
											<li><a href="blog-archive.html">Blog </a></li>
											<li><a href="blog-detail.html">Blog Detail </a></li>
										</ul>
									</li>
									<li>
										<a href="listing.html#">Elements <i class="icons8-angle-down drop-down-icon"></i></a>
											<ul class="sub-menu">
											<li><a href="pricing.html">Pricing </a></li>
											<li><a href="404.html">404 Page </a></li>
											<li><a href="testimonials.html">Testimonials </a></li>
										</ul>
									</li>
								</ul>
							</div>
						</div>
					</div>
				</div>
		</div><!-- ../menu-bar -->
		<div class="page-heading listing-page archive-page ">
			<div class="page-heading-inner-container text-center">
				<h1>Food</h1>
				<ul class="breadcrumbs">
					<li><a href="index.html">Home</a></li>
					<li><span>Food</span></li>
				</ul>
			</div>
			<div class="page-header-overlay"></div>
		</div><!-- ../Home Search Container -->
	</header>
	<!--==================================Header Close=================================-->
	
	<!--==================================Section Open=================================-->
	<section>
		<div class="container page-container">
			<div class="row">
				<div class="col-md-12 search-row margin-top-subtract-35  margin-bottom-35">
					<form class="form-inline clearfix">
						<div class="form-group">
							<div class="input-group">
								<div class="input-group-addon lp-border"><i class="fa fa-search"></i></div>
									<input type="text" class="form-control lp-border input-width-299 border-right-radius" id="searchInput" placeholder="What is your Interest?">
							</div>
						</div>
						<div class="form-group">
							<div class="input-group">
								<div class="input-group-addon lp-border"><i class="fa fa-crosshairs"></i></div>
									<div class="ui-widget border-dropdown">
									  <select class="comboboxs">
										<option value="">Select one...</option>
										<option value="All Locations">All Locations</option>
										<option value="London">London</option>
										<option value="Birmingham">Birmingham</option>
										<option value="Bristol">Bristol</option>
										<option value="Manchester">Manchester</option>
										<option value="Newcastle">Newcastle</option>
										<option value="Glasgow">Glasgow</option>
									  </select>
									</div>
							</div>
						</div>
						<div class="form-group">
							<div class="input-group">
								<div class="input-group-addon lp-border"><i class="fa fa-list"></i></div>
									<div class="ui-widget comboboxCategory border-dropdown">
									  <select id="comboboxCategory">
										<option value="">Select one...</option>
										<option value="All Categories">All Categories</option>
										<option value="Food">Food</option>
										<option value="Beauty & Spas">Beauty & Spas</option>
										<option value="Real Estate">Real Estate</option>
										<option value="Automotive">Automotive</option>
										<option value="Restaurents">Restaurents</option>
										<option value="Cafe">Cafe</option>
									  </select>
									</div>
							
							</div>
						</div>
						<div class="form-group margin-right-0">
							<div class="input-group margin-right-0">
								<div class="input-group-addon lp-border"><i class="fa fa-tag"></i></div>
									<select data-placeholder="Tags" class="chosen-select tag-select-one" multiple >
										
										<option value="Food">Food</option>
										<option value="Cafe">Cafe</option>
										<option value="Fast Food">Fast Food</option>
										<option value="Automotive">Automotive</option>
										<option value="Restaurents">Restaurents</option>
									</select>
							</div>
						</div>
					</form>
				</div>
			</div>
			<div class="row">
				<div class="col-md-12">
					<div class="LPtagsContainer "></div>
				</div>
			</div>
			<div class="row listing-page-result-row margin-bottom-25">
				<div class="col-md-4 col-sm-4 text-left">
					<p>10 Results</p>
				</div>
				<div class="col-md-4 col-sm-4  text-center">
					<p class="view-on-map">
						<!-- Marker icon by Icons8 -->
						<img class="icon icons8-Marker" src="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAADIAAAAyCAYAAAAeP4ixAAAEoklEQVRoQ91Z4XEWNxDVqgGggjgVYCrAVICpIKYCnAIs7ckFYCoIVBC7gpgKMBXgVIDTwG3mfbNiNJc7aXXffZ4M+mN/c7qTnnb37dsVuZ9k0NY4QgiviejUOXfknHvqnDvWNe6ccw/OuXsRuU4p3Wy59iZAmPlIRKJzDgCwecsAqGsi+p2Z8f9eY28gIYRIROcZgIh89d5/dM7tLMDM+OuYGZbZWWgcxzMieq47fxCRq5TSsA+S1UCY+amI/JVdR0Q+ee+Zme8tG4IVx3FkIvotux4RvVprnVVAcLoKAmBggXNmvrUAmM5h5pNxHK/UQg8KZmfFntENRC3xDW4iIp+996drTzFvFN8cxxHx8hLuSES/9n6zC0jpTgCRUjrpObXW3BDCrYK5G4bhRWt++bwLSAgBPh3VnU56T621MbUMwDwXkSGlxK138nMzEKXYL3ApInqR2ci6kHUeYkbjr8vFzEBCCB/BMGCnlNKZdWNr5q1ZywwkxvhdrYFArFKsusg7zfA/Mjsyuvf+Q8sl1foglIdhGJ5ZDsMEhJlPReRPxEZKKW9s9vvMfCYi7ysZHi7zlpmvaxsMIdwhVojoTWsuvmMCkk2tcuJqaQMK4g88F5Eb7/1Vzi+aL86J6PVu4cYGC2L5kFKCcqgOK5AdLWqymk18ZX7RE4dM+c8owFaDOQe9leZNQGKMYKvjGlsVJ3iTUoJ4XBw5X9QoVtUD1jXlFCsQwa6GYVicX4CFXqrKlYJiq5uMMTbX7cojlg9a5pQmssy3zPnfA9GY+y4i/6SUmjWOybWyT9eCvaBLs2vV6PwgwV4AWeT0HOyo+oZheFML9hgj6hhIkUU9ldkNNN4ij548ksVibWFI8XsielKjX60oGS7jvT9ayvIFC5rEo8m1isxele55nlrjGgXT5eXlZ/y+uLh4iQoSljAmxJy7tsvsOfBaFIznADOOIwTmkzn3Ukuc1WRHuR4RPWtpM7NrYWKP9lHRCFlxmpsMCGzEj8qWatfE6gHlQZlcS4Ggrn73SDIeZS/6Y2gVLWq7VUDWSOuW0FvQYugFoGSAsGyWDF0JMU8u3AsyfFYUrtl8+U5Bu109AbNraSCj1oBMvx2G4dW+m557P8aIguqoRuFz7/UCKXPF5nV7kc3/Timhd2weXUAOHfSWjL+ErBtIEfRdwdg62sIa1Yy/GRC1yuYdlX2s0ZUQJ8yCawQEJazSVLuHtsZqIGqVnZDcgsEyU/V2F1clxOmpqgzJatck7BYS4DnaRyLSzVSbAJnkFQACHXfdPE06L6sPYy/XKrL9Tm6vcYuiNdqVxfdOiAuugUsftG0Q+OYkOaHb41YbtkUY3Xlk7oNFmWvqQalLATzYz1QBPgoQDXz0an+xbCyEkEuCZi+5BSA/38QiGvgmFyuac12u2AK0GZBJbpllsQlLmYumFohNWGu6SK5Z5tpChQzZm6Wm625qEXUx3J8jXtAW+nHqRXtnlShsWWVzIApmdzGUtRj+6r3gJtrsIHlk6aQKSs7ZHrX4JlT7qEA0+HfdELWIqfXZcqGl5wdxrbxYvjfHb+/95vfyJaiDAll7umve+xc6iKNgzDxqMAAAAABJRU5ErkJggg==" alt="map">
						<a class="md-trigger mobilelink" data-modal="modal-4">View on map</a>
					</p>
				</div>
				<div class="col-md-4 col-sm-4  text-right">
					<p>Showing all Café Listings <a href="listing.html#" class="achor-color">Reset</a></p>
				</div>
			</div>
			<div class="mobile-map-space">
			
					<!-- Popup Open -->
	
					<div class="md-modal md-effect-3 mobilemap" id="modal-4">
						<div class="md-content mapbilemap-content">
							<div id='map' class="listingmap"></div>
							<a class="md-close mapbilemap-close"><i class="fa fa-close"></i></a>
						</div>
					</div>
					<!-- Popup Close -->
					<div class="md-overlay md-overlayi"></div> <!-- Overlay for Popup -->
			</div>
					<div class="row lp-list-page-grid">
						<div class="col-md-3 col-sm-6 lp-grid-box-contianer lp-grid-box-contianer1" data-title="The Dorchester grill" data-reviews="4" data-number="+007-123-4567-89" data-email="jhonruss@example.com" data-website="www.example.com" data-price="$200" data-pricetext="Text about your price" data-description="Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam eaque ipsa quae ab illo inventore veritatis et quasi archeum" data-userimage="images/user-thumb-94x94.png" data-username="Jhon Russel" data-userlisting="14" data-fb="www.facebook.com" data-gplus="www.plus.google.com" data-linkedin="www.linkedin.com" data-instagram="www.instagram.com" data-twitter="www.twitter.com" data-lattitue="40.6700" data-longitute="-73.9400"  data-id="11"  data-posturl="post-detail.html" data-authorurl="author.html">
							<div class="lp-grid-box lp-border lp-border-radius-8">
								<div class="lp-grid-box-thumb-container" >
									<div class="lp-grid-box-thumb">
										<img src="images/grid/grid-1.png" alt="grid-1" />
									</div><!-- ../grid-box-thumb -->
									<div class="lp-grid-box-quick">
										<ul class="lp-post-quick-links">
											<li>
												<a class="icon-quick-eye md-trigger" data-modal="modal-2"><i class="fa fa-eye"></i></a>
											</li>
										</ul>
									</div><!-- ../grid-box-quick-->
								</div>
								<div class="lp-grid-box-description ">
									<h4 class="lp-h4">
										<a href="post-detail.html">
											The Dorchester grill
										</a>
									</h4>
									<p>
										<i class="fa fa-map-marker"></i>
										<span>Brighton, The City of Brighton</span>
									</p>
									<ul class="lp-grid-box-price">
										<li class="category-cion"><a href="listing.html">
										<!-- Food icon by Icons8 -->
										<img class="icon icons8-Food" src="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAADIAAAAyCAYAAAAeP4ixAAADaklEQVRoQ+1aQVbbMBD9013YlJ6gUS9AOAHKCZoscRZNT0B6AuAENSdoukhYAiewOQHhAlU4QWEDu07fKLZxDI4jm5S2T14ltjTSn5k/kr5NemKuiNDBK1wMnMeB6ueHlvnI/3igdl3uU3dq+BUwZENGgaL8+Ol8XO9nQIodNw2u7oTLAHogTSPmI1LCKZ9aPrUSD3iOeI40JUNJf59aPrV8aq32wAqOzKRnFKilo0V3asru2937X7eyuyZA6hAPxNVzxfZlqeVq9zEikx9zEL1ngor31dzVUJ32+tS0iWHAfBMNPrTr2Ej75FMrBrDHhG68r+T3xi99ajQxIgCXUaB03QFzdq5JT01IwAEzjuOBOqpr1KWfnpgjIhwycBIHauTSd0mQmJqIAC1zFyA9As6aesdlMqlyw0A/DtS5S9+0rZ6YIRG+AXzHLWqTPjPb9MBzgN7+CZ5k/EgmEPfVrQuQ7tTsMTAioGdBEPWEElaKyYX6exyooYth17Z6asYEfHJNZZ2kUTYe8w2DevFA2YVyAcRWEZ4lUdkY6R/JaT3ZcamSaXVixgVE2Buocd6JmTimp0bC9ZWBOVrYdQ15VWQkhfGAKwLaDHyJAxVW9ck/r1p3iirfohQzZthC96XAWBD3iBJptlbJdQKyID4EzA4DMVroNwVTAHHNLeg6Np2AWL4sg5mD0U8J5ZIKSRHpgHAm6QSgNgix5QwkBYN7jInwUf4zY4w3OF6XnFI88AuHRLAV0BJ0C8M6kShuRco06iWOFD2+WHQ4lGqWTEhKnYC6KIJKJi/AZaFKzhJ8x0yjYoVxjWztiCxtAxZEHRF4KJvLBNBtPFDvltpNzE8ibNt7ixo/xhbCJlGoXbWqPKUnpkME+yKmTN5nxm5dTq0avxZH6hisGqjKSVXPq+yv5Mhzxl31qKoJrvvcAynzlI/IujlU0s6nlk+tgsjcMKOy7j61/uvUym1RrktE5p1/YouSCQfP6FGZPgZsRMB4MY7oiTkgQphIME+EgyUBgyFb95OXInqjbXxyUpRUkVOeCBNWo2XG57LzxaNoBlgRgxESYRYF6rIpKOeIlH6/JWcMolGVMmiVS+YwPbvkAYioUfwOa12AzkCSN0M7yQCX1rOLD8ScpE0BBEDkWInkXmLvSZFwAPLsG6u0/288R19KOGbU8gAAAABJRU5ErkJggg==" alt="restaurents"></a></li>
										<li><span>$200.00</span></li>
									</ul>
								</div><!-- ../grid-box-description-->
								<div class="lp-grid-box-bottom">
									<div class="pull-left">
										<i class="fa fa-star"></i>
										<i class="fa fa-star"></i>
										<i class="fa fa-star"></i>
										<i class="fa fa-star"></i>
										<i class="fa fa-star-o"></i>
										<span class="rating-ratio">4.0</span>
									</div>
									<div class="pull-right">
										<a href="listing.html#" class="lp-add-to-fav simptip-position-top simptip-movable" data-tooltip="Add to favorites">
										<i></i>
										</a>
									</div>
									<div class="clearfix"></div>
								</div><!-- ../grid-box-bottom-->
							</div><!-- ../grid-box -->
						</div>
						<div class="col-md-3 col-sm-6 lp-grid-box-contianer" data-title="3 Bed Detached House" data-reviews="5" data-number="+001-587-4567-89" data-email="russel@example.com" data-website="www.example.com" data-price="$50,000" data-pricetext="Text about your price" data-description="Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam eaque ipsa quae ab illo inventore veritatis et quasi archeum" data-userimage="images/user-thumb-94x94.png" data-username="Jhon Russel" data-userlisting="14"  data-fb="www.facebook.com" data-gplus="www.plus.google.com" data-linkedin="www.linkedin.com" data-instagram="www.instagram.com" data-twitter="www.twitter.com" data-lattitue="51.516576" data-longitute="-0.137508"  data-id="12"  data-posturl="post-detail.html" data-authorurl="author.html" >
							<div class="lp-grid-box lp-border lp-border-radius-8">
								<div class="lp-grid-box-thumb-container">
									<div class="lp-grid-box-thumb">
										<img src="images/grid/grid-2.png" alt="grid-2" />
									</div><!-- ../grid-box-thumb -->
									<div class="lp-grid-box-quick">
										<ul class="lp-post-quick-links">
											<li>
												<a class="icon-quick-eye md-trigger" data-modal="modal-2"><i class="fa fa-eye"></i></a>
											</li>
										</ul>
									</div><!-- ../grid-box-quick-->
								</div>
								<div class="lp-grid-box-description ">
									<h4 class="lp-h4">
										<a href="post-detail.html">
											3 Bed Detached House
										</a>
									</h4>
									<p>
										<i class="fa fa-map-marker"></i>
										<span>Newcastle, Tyne and Wear</span>
									</p>
									<ul class="lp-grid-box-price">
										<li class="category-cion"><a href="listing.html">
											<!-- Home icon by Icons8 -->
											<img class="icon icons8-Home" src="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAADIAAAAyCAYAAAAeP4ixAAACVElEQVRoQ+3YvXnbMBAG4O9Ku4kyAiaIvAG4QVJGKiJvYE+SbGClEFtlA2EDyxNghNhNVCIPIEKmGJIHKgDFAu5s0gTeOxz+CAl/5FbPcMAWBjPcolBfxGuq5ijVhx3iD3ZEmNs2jME+JSYdZKOfjwjzdgwWfbAYtRR3KYKXBCI3+okIK4swhqRjkFEVZq2W4j42JjqkiVBLsbedlhs9T4mJCulC+OhzmKLUpi1Tu4Vg+8m+EDoEOEQI5uqQUASH8RCfgebvfUH974y8I9wUe+drgsvkcZjhuZqa3QQgS70m4NvoEFnqBwK+V525V0ux5gD153KjV0R4cv8PPKqF+GExaiFW9m+jZOSsEwaDEbVh9o5pfCc5JBaCwySFxEb0YZo1E63YUyH6MEWp1W4h3O4gCiQ1oguDW/wK2TUHTb+y1J8J2Fazy08/q3BRuvS5H1KuPUKhvgrFfYuF2PkecNvxmQGSI06ZqdYUY2DPMAW3PvVCroW4BNMJuTZiKKYVMhXEEMw/kKkhQjFnkDrCfiDkHMDNJjGf+5W+bQI4QZqXBVOGVJvUs8sMB2kgXgB8mjjE9bF+M0NNhLmBpAN+TxlibvCRDrCL5AlD8nRtgxeLsNuBIbvOmDXAfaveL5uAOoaq7cDcI4YeaLjGYz5vBthjDLBvXUcuyUjXxQEHGTIz9vUrQ5qRHprFoe9zQz56RkKHSoZ07DhyRnKNVBHINZJrhFuaLxwqeWjloZWHVn8Eco3kGsk1kmukMwKjHnUnebAKLI/RX2sLVu/BavQeBjbYBvkLODEBNn2o34UAAAAASUVORK5CYII=" alt="realestate">
										</a></li>
										<li><span>$50,000</span></li>
									</ul>
								</div><!-- ../grid-box-description-->
								<div class="lp-grid-box-bottom">
									<div class="pull-left">
										<i class="fa fa-star"></i>
										<i class="fa fa-star"></i>
										<i class="fa fa-star"></i>
										<i class="fa fa-star-o"></i>
										<i class="fa fa-star-o"></i>
										<span class="rating-ratio">3.0</span>
									</div>
									<div class="pull-right">
										<span class=" simptip-position-top simptip-movable" data-tooltip="Marked as hot" >
										<i class="fa fa-fire hot-post" title=""></i>
										</span>
										<a href="listing.html#" class="lp-add-to-fav simptip-position-top simptip-movable" data-tooltip="Add to favorites">
										<i></i>
										</a>
									</div>
									<div class="clearfix"></div>
								</div><!-- ../grid-box-bottom-->
							</div><!-- ../grid-box -->
						</div>
						<div class="col-md-3 col-sm-6 lp-grid-box-contianer"  data-title="Photography" data-reviews="4" data-number="+007-123-4567-89" data-email="jhonruss@example.com" data-website="www.example.com" data-price="$20/h" data-pricetext="Text about your price" data-description="Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam eaque ipsa quae ab illo inventore veritatis et quasi archeum" data-userimage="images/user-thumb-94x94.png" data-username="Jhon Russel" data-userlisting="14"  data-fb="www.facebook.com" data-gplus="www.plus.google.com" data-linkedin="www.linkedin.com" data-instagram="www.instagram.com" data-twitter="www.twitter.com" data-lattitue="51.514070" data-longitute="-0.142292"  data-id="10"  data-posturl="post-detail.html" data-authorurl="author.html">
							<div class="lp-grid-box lp-border lp-border-radius-8">
								<div class="lp-grid-box-thumb-container">
									<div class="lp-grid-box-thumb">
										<img src="images/grid/grid-3.png" alt="grid-3" />
									</div><!-- ../grid-box-thumb -->
									<div class="lp-grid-box-quick">
										<ul class="lp-post-quick-links">
											<li>
												<a class="icon-quick-eye md-trigger" data-modal="modal-2"><i class="fa fa-eye"></i></a>
											</li>
										</ul>
									</div><!-- ../grid-box-quick-->
								</div>
								<div class="lp-grid-box-description ">
									<h4 class="lp-h4">
										<a href="post-detail.html">
											Photography
										</a>
									</h4>
									<p>
										<i class="fa fa-map-marker"></i>
										<span>Brighton, The City of Brighton</span>
									</p>
									<ul class="lp-grid-box-price">
										<li  class="category-cion"><a href="listing.html">
											<!-- Camera icon by Icons8 -->
<img class="icon icons8-Camera" src="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAADIAAAAyCAYAAAAeP4ixAAAEXUlEQVRoQ+1ZTVrbSBB9xWrMJswJQs8FhpwgrRPELCMvQk4QcwIyJ4g5AWRhZYlyAjcnIFxgmpxgzCbJipqv2mohbP20bIn444MlVv+8rupXr14TnsgfPREceAaybZHsJSL6wu7hFz7gDkMiHLQBzYxv2EGKP3BqDtU8dGznQByIH5i1BbC8YQdoF1EomO6BJHZCwAeAb5loaN4qE3qq8p3+YjUxpwC9YODUxGocMr4UiE7sjABdNQEDqYnV4fLv+ovdJ4aV/zPjlRmpbyGbWJlnag+IcOXmISjzVt00zVMKJEosNw2cxWplrJ7aj0Q4YeCzidVR0xx1v+vEnhPwjhn/mJH62DTX6mYS+46AcxlYttkQkAwcmlilTYs3ABkScFF6d0rIIAeip/YAhAsC9rPB17NYrTBOlFjJ+dc1mygdtw6oKLGSmn+XjWXGHIT3/sAcEAcCjmn2mPEVhPNNT3SdjYeMETLAHcZEeOPuUBZ9cnT5E1cSidB8DFmw72/01B4R4cxFZheK/AUFcDmLVSVTbbIxYTPc4Q0IQzD2fI1xtYIwByPFDr6GsFNxH3pqU4mMBIB8zhcvqAsf48wNkjxsWQv8Ytk8J3VUXtwYAwaM41DaXtQczORAJCL/ubsxwJ++iurEWn/pGbgxsVJtI6IT+4mArJjxLYOExVIwbvxGM4IRchkSeChFMMv7iYnVcciankUlIq5mFKk2Sv6d+0nB/H02+sszWePc2Z0T9tOuujNNsItJk9TIpM2YiMdZVTcY4LBpXC0QF7I7drWEd+ioTWrdqwIHQoemSZ6Orqqz8WBMrKK606sF0njsFR/oos4a0H7TaVatI9Ghn3wTorc6B+IvXpZOrSOxDEruTx6ZGt3WPZBMaHZZiwrazVSlWKdA7lUv3/IGKbUSlWKKVajgboEkdkzApy5U7woYr4KBYxOryfLvnQIpK6rrEkYJEK+CS5VHp0D01F6J7NikmapksKzJkuptRupV3xFZKapdRUTmKSvafv5OI1K3UBeAHhOIa4D6TC0AVY2ey4ZSrdX2FJ/OZX8q9OsLou/W1tVYZQURP2Bdm/EYBTFjFmdK9CFR6rrXTllLgCxEHq5cVICorXwvE40FQ6TS7OsciAOTyfhNUyxrshYp1WCb9gJkKcXWikzRmgoxRHoDsmiKIP253Jc5djAJeSIoPEWIZ7UnIHiAYRNx9AYkb1nzbtEZ2hKdlICUge9F84GAlwwMnQGxACCmW7AL3zuQAgGI9K6zWIv3/JIZ4zZEUQSykBeEqI3J0Kb6O4OOxfJxJy+n7v3cawBzeaYAIW1t0GW+lsiX3GmsevNos+HH/tY7Ns5pfOBYMN6bkXI20Lb/ee/XmR0D2l+48YnN3yIkMgRMZrG63EYwUWJfMyCttaTpvRtfYBmxLc9zh3EbUTzYk7Nhjx68j+RgFi+ywuOCtvSBZQvwXbO490s2bOevur8L6DOQ33XyVes+R+Q5Ij2dwP9TYAKAKNjkVAAAAABJRU5ErkJggg==" alt="camera">
										</a></li>
										<li  class="category-cion"><a href="listing.html">
											<!-- Camera icon by Icons8 -->
<img class="icon icons8-Camera" src="data:image/png;base64,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" alt="camera">
										</a></li>
										<li><span>$20/h</span></li>
									</ul>
								</div><!-- ../grid-box-description-->
								<div class="lp-grid-box-bottom">
									<div class="pull-left">
										<i class="fa fa-star"></i>
										<i class="fa fa-star"></i>
										<i class="fa fa-star"></i>
										<i class="fa fa-star"></i>
										<i class="fa fa-star"></i>
										<span class="rating-ratio">5.0</span>
									</div>
									<div class="pull-right">
										<a href="listing.html#" class="lp-add-to-fav simptip-position-top simptip-movable" data-tooltip="Add to favorites">
										<i></i>
										</a>
									</div>
									<div class="clearfix"></div>
								</div><!-- ../grid-box-bottom-->
							</div><!-- ../grid-box -->
						</div>
						<div class="col-md-3 col-sm-6 lp-grid-box-contianer"  data-title="Hotel Rammizine" data-reviews="3" data-number="+041-923-4367-89" data-email="jhonruss@example.com" data-website="www.example.com" data-price="Price on call" data-pricetext="Text about your price" data-description="Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam eaque ipsa quae ab illo inventore veritatis et quasi archeum" data-userimage="images/user-thumb-94x94.png" data-username="Jhon Russel" data-userlisting="14" data-fb="www.facebook.com" data-gplus="www.plus.google.com" data-linkedin="www.linkedin.com" data-instagram="www.instagram.com" data-twitter="www.twitter.com" data-lattitue="51.512306" data-longitute="-0.119221"  data-id="1"  data-posturl="post-detail.html" data-authorurl="author.html">
							<div class="lp-grid-box lp-border lp-border-radius-8">
								<div class="lp-grid-box-thumb-container">
									<div class="lp-grid-box-thumb">
										<img src="images/grid/grid-4.png" alt="grid-4" />
									</div><!-- ../grid-box-thumb -->
									<div class="lp-grid-box-quick">
										<ul class="lp-post-quick-links">
											<li>
												<a class="icon-quick-eye md-trigger" data-modal="modal-2"><i class="fa fa-eye"></i></a>
											</li>
										</ul>
									</div><!-- ../grid-box-quick-->
								</div>
								<div class="lp-grid-box-description ">
									<h4 class="lp-h4">
										<a href="post-detail.html">
											Hotel Rammizine
										</a>
									</h4>
									<p>
										<i class="fa fa-map-marker"></i>
										<span>Brighton, The City of Brighton</span>
									</p>
									<ul class="lp-grid-box-price">
										<li  class="category-cion"><a href="listing.html">
											<!-- 5 Star Hotel icon by Icons8 -->
<img class="icon icons8-5-Star-Hotel" src="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAADIAAAAyCAYAAAAeP4ixAAACWUlEQVRoQ+1ZvXnbMBB95zKN5REwQZQJAk0QuwxZRJnAHsEj2BNYKciUsScQNrAzAUZI0qQ0/IEy80E0IQIgKOhTwE68H9w7HN7hKMLAw79LrlXEZyb6VFPL25hoEEgt1w2Qgi16gSSW7wTCKznHCT5BYU7AuVZWwD0IT3jGQ2OcUC5K9tRNqnVHeC1XBHwxDRTwTRRsqd+lljsD0YqLWmrk71+Nfq4LNjcdpJabsew8I7ySvwjqz6a06FSU7Mw0Ti13AsJ/yBn+4kqU7LoppUpe4x1uxAX73fxOLHcqreawA5cAzokwG2K2fciVgk7gPYBbp8POK7kkwt0+ggtdQyl8FSVbWUtL7wQRHl/p9hYKqz70oQGMsWuqhLCkTaVAKXwwY9s67C2lKr19Bbsas/BUtryWNxqM2Qr0WttANEsRZl20UwUV4retGn1mTBbdArKopdLO1wUbvLqEBBHLpi9OJyC8ko9E2GqGbVD66iIKdtHpL5PqBwNpDW0Z7e7gvvTNdZ12xFZyh/T+/wRyDKWlp8OPfUCUwoMoWTOztM+illPrv2FXp9KKRZux/ASzVqwAYvkJBpL7iGULYvWd3EdsmTyE906sta8rh2+fCimtqfuCr//cR2K1gCh+ch85psPeOwLneaTzTSBGQnIf+ffxIc8j4UwcTL/hS05jGQwkzyN5HtlkwIeWvej3EOYOG0AvIGPmBZcMj/HvCmT0vDAAZLR/JyC+JOpT276+R5WW72IZiGPGghuio3/z26/XtT+G/+M+I74ZSqW/63OQlQZTBWtbt/t3xgvz/SNvFqVEmwAAAABJRU5ErkJggg==" alt="hotels">
										</a></li>
										<li><span>Price on call</span></li>
									</ul>
								</div><!-- ../grid-box-description-->
								<div class="lp-grid-box-bottom">
									<div class="pull-left">
										<i class="fa fa-star"></i>
										<i class="fa fa-star"></i>
										<i class="fa fa-star"></i>
										<i class="fa fa-star-o"></i>
										<i class="fa fa-star-o"></i>
										<span class="rating-ratio">3.0</span>
									</div>
									<div class="pull-right">
										<a href="listing.html#" class="lp-add-to-fav simptip-position-top simptip-movable" data-tooltip="Add to favorites">
										<i></i>
										</a>
									</div>
									<div class="clearfix"></div>
								</div><!-- ../grid-box-bottom-->
							</div><!-- ../grid-box -->
						</div>
						<div class="col-md-3 col-sm-6 lp-grid-box-contianer lp-grid-box-contianer1" data-title="5th Generation Laptop" data-reviews="4" data-number="+007-123-4567-89" data-email="jhonruss@example.com" data-website="www.example.com" data-price="$200.00" data-pricetext="Text about your price" data-description="Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam eaque ipsa quae ab illo inventore veritatis et quasi archeum" data-userimage="images/user-thumb-94x94.png" data-username="Jhon Russel" data-userlisting="14" data-fb="www.facebook.com" data-gplus="www.plus.google.com" data-linkedin="www.linkedin.com" data-instagram="www.instagram.com" data-twitter="www.twitter.com" data-lattitue="40.6700" data-longitute="-73.9400" data-id="2"  data-posturl="post-detail.html" data-authorurl="author.html" >
							<div class="lp-grid-box lp-border lp-border-radius-8">
								<div class="lp-grid-box-thumb-container" >
									<div class="lp-grid-box-thumb">
										<img src="images/grid/grid-5.png" alt="grid-5" />
									</div><!-- ../grid-box-thumb -->
									<div class="lp-grid-box-quick">
										<ul class="lp-post-quick-links">
											<li>
												<a class="icon-quick-eye md-trigger" data-modal="modal-2"><i class="fa fa-eye"></i></a>
											</li>
										</ul>
									</div><!-- ../grid-box-quick-->
								</div>
								<div class="lp-grid-box-description ">
									<h4 class="lp-h4">
										<a href="post-detail.html">
											5th Generation Laptop
										</a>
									</h4>
									<p>
										<i class="fa fa-map-marker"></i>
										<span>Brighton, The City of Brighton</span>
									</p>
									<ul class="lp-grid-box-price">
										<li class="category-cion"><a href="listing.html">
										<!-- Food icon by Icons8 -->
										<img class="icon icons8-Food" src="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAADAAAAAwCAYAAABXAvmHAAABYUlEQVRoQ+1Y0VGDQBTcTQNqBYoVxA6wAv01aUIr0SbUX60glJAKgqnA0IDrQEYnAnKTOcgdmccv947dt3vvmCVG/nDk+GEEQitoCkSpQPqaX0B4hJCSOA0JUsIGRAbiIbtLPupYGhYqwVPIQ4Ju+3ZFZIKrOokmgef8jcRNbARKPBLes3lyu4utjcBnaNv817xShWyenHUSuH7JtbtgMUuCTioXngY4V8GhreXCYwSGVsQUsEPs6TGzkFnILNT9Z2AXmadDnOU2hWwKOU3SvcAsZBYyC+19ka02AE88GzdQuYrF7PJPTnWEsUqkwRagQuTUGWyV2lfR4heeSKXh7aRCYoYJ7lujxfpFMZB5B9uWR0Ag5qnjEE5aM404zHX5rgx7uY3TtQx/WF1w6++3U6m6B36nDjQFeb7vVgddL60FLn+mUtDkuQ/iRqCPLvrsYQr4dK+PWlOgjy767DF6Bb4BAAIIyCXX8RcAAAAASUVORK5CYII=" alt="restaurents"></a></li>
										<li><span>$200.00</span></li>
									</ul>
								</div><!-- ../grid-box-description-->
								<div class="lp-grid-box-bottom">
									<div class="pull-left">
										<i class="fa fa-star"></i>
										<i class="fa fa-star"></i>
										<i class="fa fa-star"></i>
										<i class="fa fa-star"></i>
										<i class="fa fa-star-o"></i>
										<span class="rating-ratio">4.0</span>
									</div>
									<div class="pull-right">
										<span class=" simptip-position-top simptip-movable" data-tooltip="Marked as hot" >
										<i class="fa fa-fire hot-post" title=""></i>
										</span>
										<a href="listing.html#" class="lp-add-to-fav simptip-position-top simptip-movable" data-tooltip="Add to favorites">
										<i></i>
										</a>
									</div>
									<div class="clearfix"></div>
								</div><!-- ../grid-box-bottom-->
							</div><!-- ../grid-box -->
						</div>
						<div class="col-md-3 col-sm-6 lp-grid-box-contianer" data-title="Takai Car 2000" data-reviews="5" data-number="+001-587-4567-89" data-email="russel@example.com" data-website="www.example.com" data-price="$50,000" data-pricetext="Text about your price" data-description="Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam eaque ipsa quae ab illo inventore veritatis et quasi archeum" data-userimage="images/user-thumb-94x94.png" data-username="Jhon Russel" data-userlisting="14"  data-fb="www.facebook.com" data-gplus="www.plus.google.com" data-linkedin="www.linkedin.com" data-instagram="www.instagram.com" data-twitter="www.twitter.com" data-lattitue="51.516576" data-longitute="-0.137508" data-id="3"  data-posturl="post-detail.html" data-authorurl="author.html" >
							<div class="lp-grid-box lp-border lp-border-radius-8">
								<div class="lp-grid-box-thumb-container">
									<div class="lp-grid-box-thumb">
										<img src="images/grid/grid-6.png" alt="grid-6" />
									</div><!-- ../grid-box-thumb -->
									<div class="lp-grid-box-quick">
										<ul class="lp-post-quick-links">
											<li>
												<a class="icon-quick-eye md-trigger" data-modal="modal-2"><i class="fa fa-eye"></i></a>
											</li>
										</ul>
									</div><!-- ../grid-box-quick-->
								</div>
								<div class="lp-grid-box-description ">
									<h4 class="lp-h4">
										<a href="post-detail.html">
											Takai Car 2000
										</a>
									</h4>
									<p>
										<i class="fa fa-map-marker"></i>
										<span>Newcastle, Tyne and Wear</span>
									</p>
									<ul class="lp-grid-box-price">
										<li class="category-cion"><a href="listing.html">
											<!-- Home icon by Icons8 -->
											<img class="icon icons8-Home" src="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAADIAAAAyCAYAAAAeP4ixAAADRUlEQVRoQ+1YzXnaQBB941PkS0gF8VZgXIGXCoyPgYPtCkIHcSoIqSD4gHzErkByBRYNZJ0OnIu5efLNIhHCh5C0K4jjaC/wgTRv37z52yW8kkWvhAcaIi9NyUaRRpEteaAJrS051tlso4iz67b0YmVF9Ni0AXwE0CVCy3VfDNwAuIp7Sj69VyUiemzOifDNG3XJADNGcV9d+NosTURfmwM8415UYOArCMP4g3pYt4FOaFh+j3pqrX09MS3McE7AF3mOGRdxX418yJQnEpqIAM2M27ivuptAi4hk72YKM+MRQCfuq8SVTCkiv0OKf3JAB/GpEuDcVZaIGNChGRFwxowE++gU2c4DLSRiw+AJxoZUyRCoRGRiWjRDDODQJ1+KiaQeA3AX9ZQuI30VIlaVsWkTcQzQ27LOWt3HRiL62mhiRDYhCSovuVeNViWSkrEV0TVf/iBie8QeTsCQXtGS5C6jwDaeYSAGQ6piQoSEA0w35Y8lkpbWCZEl8GKXVYsglS0hRhz11W22WVpOZjD/YKIbSAXZwwPeIHGtIj7esI4FpG9pEA5IvgPHqzZtpYPtQQnp0AxpPnLccYDu39h4WdLLBAl8DqL3VqV9KNJjI926zYwjn4ZUdjN1PqfH5oYIJwxckUuFqXMzPrbmZRv3EmL/NBFxQibE/0NEh+YMjEFWmm2lkMm3p658wiLv3ap4hYqkZTnK6y2+Q94qEVe8YiJpNUt7ywCBHeyAGTQxD9PSl8R9dVSHMln1rIq3kchibJcGuU/t1d4i3qMnTlIy3ociH7wlIt8f06lz0UcWvQU4zTtT69B0CZhUmYpz8yLrZRXxsvIrKkpDvCTCp3UgHOBdXqeXLksMU0dYZTZc8ZjxeT40Cpm05S9vzNWwK7nKeBL6ILm8uFx7HumERhL7mCtK7UqgDrz1txzptQ8DDwhwtC7ZMcO9TKWuJ7pl0otLCA+83BNiJzQyIh8KGWIMeA9TAadnHDJBJmYZradRT9VyhvHFyyViS2x6KZATMlMOoOsa+33xii8f5mE2EHVSQlNmDH0v1DaUYie8QiKuCbzr9xoiu/Z4EV6jSJGHdv1/o8iuPV6E1yhS5KFd/98osmuPF+H9AkKsIa0CLZEmAAAAAElFTkSuQmCC" alt="realestate">
										</a></li>
										<li class="category-cion"><a href="listing.html">
											<!-- Home icon by Icons8 -->
											<img class="icon icons8-Home" src="data:image/png;base64,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" alt="realestate">
										</a></li>
										<li><span>$50,000</span></li>
									</ul>
								</div><!-- ../grid-box-description-->
								<div class="lp-grid-box-bottom">
									<div class="pull-left">
										<i class="fa fa-star"></i>
										<i class="fa fa-star"></i>
										<i class="fa fa-star"></i>
										<i class="fa fa-star"></i>
										<i class="fa fa-star"></i>
										<span class="rating-ratio">5.0</span>
									</div>
									<div class="pull-right">
										<a href="listing.html#" class="lp-add-to-fav simptip-position-top simptip-movable" data-tooltip="Add to favorites">
										<i></i>
										</a>
									</div>
									<div class="clearfix"></div>
								</div><!-- ../grid-box-bottom-->
							</div><!-- ../grid-box -->
						</div>
						<div class="col-md-3 col-sm-6 lp-grid-box-contianer"  data-title="Suny Mobile for sale" data-reviews="4" data-number="+007-123-4567-89" data-email="jhonruss@example.com" data-website="www.example.com" data-price="$150.00" data-pricetext="Text about your price" data-description="Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam eaque ipsa quae ab illo inventore veritatis et quasi archeum" data-userimage="images/user-thumb-94x94.png" data-username="Jhon Russel" data-userlisting="14"  data-fb="www.facebook.com" data-gplus="www.plus.google.com" data-linkedin="www.linkedin.com" data-instagram="www.instagram.com" data-twitter="www.twitter.com" data-lattitue="51.514070" data-longitute="-0.142292" data-id="4"  data-posturl="post-detail.html" data-authorurl="author.html">
							<div class="lp-grid-box lp-border lp-border-radius-8">
								<div class="lp-grid-box-thumb-container">
									<div class="lp-grid-box-thumb">
										<img src="images/grid/grid-7.png" alt="grid-7" />
									</div><!-- ../grid-box-thumb -->
									<div class="lp-grid-box-quick">
										<ul class="lp-post-quick-links">
											<li>
												<a class="icon-quick-eye md-trigger" data-modal="modal-2"><i class="fa fa-eye"></i></a>
											</li>
										</ul>
									</div><!-- ../grid-box-quick-->
								</div>
								<div class="lp-grid-box-description ">
									<h4 class="lp-h4">
										<a href="post-detail.html">
											Suny Mobile for sale
										</a>
									</h4>
									<p>
										<i class="fa fa-map-marker"></i>
										<span>Brighton, The City of Brighton</span>
									</p>
									<ul class="lp-grid-box-price">
										<li  class="category-cion"><a href="listing.html">
<!-- iPhone icon by Icons8 -->
<img class="icon icons8-iPhone" src="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAADIAAAAyCAYAAAAeP4ixAAACCElEQVRoQ+1awVUCMRD94QYnSzBWoBW4VCAcXQ5qBWIH2IFWIB5Yj0IFmw60g0AHevE6voRdRR7LMtkFfLzhCEMyf/6fCeGvwoG81IHggABxTEYjewvgWimcVmGWgCmAMZq4N139EbJWECPRqz3CF9KqAJYTJoID0TY9/c4FEwZkZN/mIOiTSPXRwji0kp7ZFxspwgDAuQfTguauxwYSjayT0lMGIgqpXlG124k1HgzwaGLd57ASAsSzQcCdifUDZ7Oy2IyZ1PWMibUui1/8nA2knVhyC5CCNpd6Gv3IjLPt31gCxibWXfduvn4aa1ZurOBVG+Ubh8OYfzNPfO9AuBXMgS8nLkC4kqirgsJIQeVra3bpkWycy9TKpCbSqioFmVoytZYqIAdigSTqKoxMLZlaW+o5kZZIS6S1/gooPSI9Ij0iPbK6AnX9yJOLlVystjRl/q20uH+9LsdXPZfqONm9y1QFCBEmpqc7e/VHygBEib1yMSbWz2WxuwYy9/kIN6anh+uS+/UbgY3i56ZoCqJZ2js53gR4HsOWVp6cd18bOHP2W9GGbCCJTRUQ7cQMzejPWXG++AANTIoAOTBeWmvYayfWObkDB8K7xU11vHV72iWVPTAwVAoXHPrLY71vH2R5s6W1mExW7U5lQEQzUso9wjHgMhHcI+VV3U9EJUb2k/LqXQ8GyDfcDKhRa+yP+gAAAABJRU5ErkJggg==" alt="mobile">
										</a></li>
										<li><span>$150.00</span></li>
									</ul>
								</div><!-- ../grid-box-description-->
								<div class="lp-grid-box-bottom">
									<div class="pull-left">
										<i class="fa fa-star"></i>
										<i class="fa fa-star"></i>
										<i class="fa fa-star"></i>
										<i class="fa fa-star"></i>
										<i class="fa fa-star-o"></i>
										<span class="rating-ratio">4.0</span>
									</div>
									<div class="pull-right">
										<a href="listing.html#" class="lp-add-to-fav simptip-position-top simptip-movable" data-tooltip="Add to favorites">
										<i></i>
										</a>
									</div>
									<div class="clearfix"></div>
								</div><!-- ../grid-box-bottom-->
							</div><!-- ../grid-box -->
						</div>
						<div class="col-md-3 col-sm-6 lp-grid-box-contianer"  data-title="Luxury Spa in London" data-reviews="3" data-number="+041-923-4367-89" data-email="jhonruss@example.com" data-website="www.example.com" data-price="$60/h" data-pricetext="Text about your price" data-description="Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam eaque ipsa quae ab illo inventore veritatis et quasi archeum" data-userimage="images/user-thumb-94x94.png" data-username="Jhon Russel" data-userlisting="14" data-fb="www.facebook.com" data-gplus="www.plus.google.com" data-linkedin="www.linkedin.com" data-instagram="www.instagram.com" data-twitter="www.twitter.com" data-lattitue="51.512306" data-longitute="-0.119221"  data-id="5"  data-posturl="post-detail.html" data-authorurl="author.html">
							<div class="lp-grid-box lp-border lp-border-radius-8">
								<div class="lp-grid-box-thumb-container">
									<div class="lp-grid-box-thumb">
										<img src="images/grid/grid-8.png" alt="grid-8" />
									</div><!-- ../grid-box-thumb -->
									<div class="lp-grid-box-quick">
										<ul class="lp-post-quick-links">
											<li>
												<a class="icon-quick-eye md-trigger" data-modal="modal-2"><i class="fa fa-eye"></i></a>
											</li>
										</ul>
									</div><!-- ../grid-box-quick-->
								</div>
								<div class="lp-grid-box-description ">
									<h4 class="lp-h4">
										<a href="post-detail.html">
											Luxury Spa in London
										</a>	
									</h4>
									<p>
										<i class="fa fa-map-marker"></i>
										<span>Brighton, The City of Brighton</span>
									</p>
									<ul class="lp-grid-box-price">
										<li  class="category-cion"><a href="listing.html">
											<!-- 5 Star Hotel icon by Icons8 -->
<img class="icon icons8-5-Star-Hotel" src="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAADIAAAAyCAYAAAAeP4ixAAACcElEQVRoQ+1awXXTQBD9kxsnQgV4KyAdsK4Ac4xywFQQpwN3gKmA+GBxTKiApYKECjZUAJy4MbxZbD/i7GqkjZB5ZHX0jFb/z/wZ7Y5MaLhs7V8BmIBhiXDY5Nu3jYEbMBwOsHTHxmnrU8zBXvhD/MAFAVZbYAg7AwtXmbOmZ8WJrPwVEY4A/s5MMxzAuWNzMwTozTPsyh+JGoh4BtBjBt66ysxSGO4QsSs/JcK7QOIRjdxL821IArvPEkJEuJLfmTBOySxG5JIIL5jx2p2Y86FJ2NpPAJyKrJkhQbwE8CRgApauMtMYphiRr1LYTDCDy6n2MwLepIInDcBVxrQiMq49i+PHykTr529lyL73I2L4ICHgzFVmsW46cwJON89N4boDdm9Ear8QwDH5jGsv7fd5U4DJbjvU7VgPnZE/wXbNOjOuaVz7awDPdm/eA5Eg6czr8z8jLU3Smr0QyZRA8jYt4pq9ZKRkJBEBTTqavUirSKtIq3kzW2qk1EipkVIjwx51tTe3Zle71nraON0M6xiQY+e5q8wyJvdM/wnJRLNhVpBNhAEZu8jBfxQDHEaawByET8HO4Ux9b//UyTSbyBY88xcGzWXaGH77CUvgOYieRhtQpv/voWB6epNNhBkfZDiWGtKtJ5KStTDduK+/BlSzqzXS94svtZ4GVLM/HCKZXahrlytdayPVpLRK10p8itC6nFbMmv3hFHtpvx0joElHs///0uoY0N7c+9w0br8O9Yau5UKyX3MnJmznd6/O0srdC7XEmu1WiHRNbXaoW95YMlIy0lIqXd16l1ZXAH37t/7nQ0P73dv7ZYOp6T3zC1HtqHqb2BmDAAAAAElFTkSuQmCC" alt="hotels">
										</a></li>
										<li><span>$60/h</span></li>
									</ul>
								</div><!-- ../grid-box-description-->
								<div class="lp-grid-box-bottom">
									<div class="pull-left">
										<i class="fa fa-star"></i>
										<i class="fa fa-star"></i>
										<i class="fa fa-star"></i>
										<i class="fa fa-star-o"></i>
										<i class="fa fa-star-o"></i>
										<span class="rating-ratio">3.0</span>
									</div>
									<div class="pull-right">
										<a href="listing.html#" class="lp-add-to-fav simptip-position-top simptip-movable" data-tooltip="Add to favorites">
										<i></i>
										</a>
									</div>
									<div class="clearfix"></div>
								</div><!-- ../grid-box-bottom-->
							</div><!-- ../grid-box -->
						</div>
						<div class="col-md-3 col-sm-6 lp-grid-box-contianer lp-grid-box-contianer1" data-title="Dream Home" data-reviews="4" data-number="+007-123-4567-89" data-email="jhonruss@example.com" data-website="www.example.com" data-price="$2050.00" data-pricetext="Text about your price" data-description="Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam eaque ipsa quae ab illo inventore veritatis et quasi archeum" data-userimage="images/user-thumb-94x94.png" data-username="Jhon Russel" data-userlisting="14" data-fb="www.facebook.com" data-gplus="www.plus.google.com" data-linkedin="www.linkedin.com" data-instagram="www.instagram.com" data-twitter="www.twitter.com" data-lattitue="40.6700" data-longitute="-73.9400"  data-id="6"  data-posturl="post-detail.html" data-authorurl="author.html" >
							<div class="lp-grid-box lp-border lp-border-radius-8">
								<div class="lp-grid-box-thumb-container" >
									<div class="lp-grid-box-thumb">
										<img src="images/grid/grid-9.png" alt="grid-9" />
									</div><!-- ../grid-box-thumb -->
									<div class="lp-grid-box-quick">
										<ul class="lp-post-quick-links">
											<li>
												<a class="icon-quick-eye md-trigger" data-modal="modal-2"><i class="fa fa-eye"></i></a>
											</li>
										</ul>
									</div><!-- ../grid-box-quick-->
								</div>
								<div class="lp-grid-box-description ">
									<h4 class="lp-h4">
										<a href="post-detail.html">
											Dream Home
										</a>
									</h4>
									<p>
										<i class="fa fa-map-marker"></i>
										<span>Brighton, The City of Brighton</span>
									</p>
									<ul class="lp-grid-box-price">
										<li class="category-cion"><a href="listing.html">
											<!-- Home icon by Icons8 -->
											<img class="icon icons8-Home" src="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAADIAAAAyCAYAAAAeP4ixAAACVElEQVRoQ+3YvXnbMBAG4O9Ku4kyAiaIvAG4QVJGKiJvYE+SbGClEFtlA2EDyxNghNhNVCIPIEKmGJIHKgDFAu5s0gTeOxz+CAl/5FbPcMAWBjPcolBfxGuq5ijVhx3iD3ZEmNs2jME+JSYdZKOfjwjzdgwWfbAYtRR3KYKXBCI3+okIK4swhqRjkFEVZq2W4j42JjqkiVBLsbedlhs9T4mJCulC+OhzmKLUpi1Tu4Vg+8m+EDoEOEQI5uqQUASH8RCfgebvfUH974y8I9wUe+drgsvkcZjhuZqa3QQgS70m4NvoEFnqBwK+V525V0ux5gD153KjV0R4cv8PPKqF+GExaiFW9m+jZOSsEwaDEbVh9o5pfCc5JBaCwySFxEb0YZo1E63YUyH6MEWp1W4h3O4gCiQ1oguDW/wK2TUHTb+y1J8J2Fazy08/q3BRuvS5H1KuPUKhvgrFfYuF2PkecNvxmQGSI06ZqdYUY2DPMAW3PvVCroW4BNMJuTZiKKYVMhXEEMw/kKkhQjFnkDrCfiDkHMDNJjGf+5W+bQI4QZqXBVOGVJvUs8sMB2kgXgB8mjjE9bF+M0NNhLmBpAN+TxlibvCRDrCL5AlD8nRtgxeLsNuBIbvOmDXAfaveL5uAOoaq7cDcI4YeaLjGYz5vBthjDLBvXUcuyUjXxQEHGTIz9vUrQ5qRHprFoe9zQz56RkKHSoZ07DhyRnKNVBHINZJrhFuaLxwqeWjloZWHVn8Eco3kGsk1kmukMwKjHnUnebAKLI/RX2sLVu/BavQeBjbYBvkLODEBNn2o34UAAAAASUVORK5CYII=" alt="realestate"></a></li>
										<li><span>$2050.00</span></li>
									</ul>
								</div><!-- ../grid-box-description-->
								<div class="lp-grid-box-bottom">
									<div class="pull-left">
										<i class="fa fa-star"></i>
										<i class="fa fa-star"></i>
										<i class="fa fa-star"></i>
										<i class="fa fa-star"></i>
										<i class="fa fa-star-o"></i>
										<span class="rating-ratio">4.0</span>
									</div>
									<div class="pull-right">
										<a href="listing.html#" class="lp-add-to-fav simptip-position-top simptip-movable" data-tooltip="Add to favorites">
										<i></i>
										</a>
									</div>
									<div class="clearfix"></div>
								</div><!-- ../grid-box-bottom-->
							</div><!-- ../grid-box -->
						</div>
						<div class="col-md-3 col-sm-6 lp-grid-box-contianer" data-title="Buy now 10 shots" data-reviews="3" data-number="+001-587-4567-89" data-email="russel@example.com" data-website="www.example.com" data-price="$50" data-pricetext="Text about your price" data-description="Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam eaque ipsa quae ab illo inventore veritatis et quasi archeum" data-userimage="images/user-thumb-94x94.png" data-username="Jhon Russel" data-userlisting="14"  data-fb="www.facebook.com" data-gplus="www.plus.google.com" data-linkedin="www.linkedin.com" data-instagram="www.instagram.com" data-twitter="www.twitter.com" data-lattitue="51.516576" data-longitute="-0.137508"  data-id="7" data-posturl="post-detail.html" data-authorurl="author.html" >
							<div class="lp-grid-box lp-border lp-border-radius-8">
								<div class="lp-grid-box-thumb-container">
									<div class="lp-grid-box-thumb">
										<img src="images/grid/grid-10.png" alt="grid-10" />
									</div><!-- ../grid-box-thumb -->
									<div class="lp-grid-box-quick">
										<ul class="lp-post-quick-links">
											<li>
												<a class="icon-quick-eye md-trigger" data-modal="modal-2"><i class="fa fa-eye"></i></a>
											</li>
										</ul>
									</div><!-- ../grid-box-quick-->
								</div>
								<div class="lp-grid-box-description ">
									<h4 class="lp-h4">
										<a href="post-detail.html">
											Buy now 10 shots
										</a>
									</h4>
									<p>
										<i class="fa fa-map-marker"></i>
										<span>Newcastle, Tyne and Wear</span>
									</p>
									<ul class="lp-grid-box-price">
										<li class="category-cion"><a href="listing.html">
											<!-- Camera icon by Icons8 -->
<img class="icon icons8-Camera" src="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAADIAAAAyCAYAAAAeP4ixAAAEXUlEQVRoQ+1ZTVrbSBB9xWrMJswJQs8FhpwgrRPELCMvQk4QcwIyJ4g5AWRhZYlyAjcnIFxgmpxgzCbJipqv2mohbP20bIn444MlVv+8rupXr14TnsgfPREceAaybZHsJSL6wu7hFz7gDkMiHLQBzYxv2EGKP3BqDtU8dGznQByIH5i1BbC8YQdoF1EomO6BJHZCwAeAb5loaN4qE3qq8p3+YjUxpwC9YODUxGocMr4UiE7sjABdNQEDqYnV4fLv+ovdJ4aV/zPjlRmpbyGbWJlnag+IcOXmISjzVt00zVMKJEosNw2cxWplrJ7aj0Q4YeCzidVR0xx1v+vEnhPwjhn/mJH62DTX6mYS+46AcxlYttkQkAwcmlilTYs3ABkScFF6d0rIIAeip/YAhAsC9rPB17NYrTBOlFjJ+dc1mygdtw6oKLGSmn+XjWXGHIT3/sAcEAcCjmn2mPEVhPNNT3SdjYeMETLAHcZEeOPuUBZ9cnT5E1cSidB8DFmw72/01B4R4cxFZheK/AUFcDmLVSVTbbIxYTPc4Q0IQzD2fI1xtYIwByPFDr6GsFNxH3pqU4mMBIB8zhcvqAsf48wNkjxsWQv8Ytk8J3VUXtwYAwaM41DaXtQczORAJCL/ubsxwJ++iurEWn/pGbgxsVJtI6IT+4mArJjxLYOExVIwbvxGM4IRchkSeChFMMv7iYnVcciankUlIq5mFKk2Sv6d+0nB/H02+sszWePc2Z0T9tOuujNNsItJk9TIpM2YiMdZVTcY4LBpXC0QF7I7drWEd+ioTWrdqwIHQoemSZ6Orqqz8WBMrKK606sF0njsFR/oos4a0H7TaVatI9Ghn3wTorc6B+IvXpZOrSOxDEruTx6ZGt3WPZBMaHZZiwrazVSlWKdA7lUv3/IGKbUSlWKKVajgboEkdkzApy5U7woYr4KBYxOryfLvnQIpK6rrEkYJEK+CS5VHp0D01F6J7NikmapksKzJkuptRupV3xFZKapdRUTmKSvafv5OI1K3UBeAHhOIa4D6TC0AVY2ey4ZSrdX2FJ/OZX8q9OsLou/W1tVYZQURP2Bdm/EYBTFjFmdK9CFR6rrXTllLgCxEHq5cVICorXwvE40FQ6TS7OsciAOTyfhNUyxrshYp1WCb9gJkKcXWikzRmgoxRHoDsmiKIP253Jc5djAJeSIoPEWIZ7UnIHiAYRNx9AYkb1nzbtEZ2hKdlICUge9F84GAlwwMnQGxACCmW7AL3zuQAgGI9K6zWIv3/JIZ4zZEUQSykBeEqI3J0Kb6O4OOxfJxJy+n7v3cawBzeaYAIW1t0GW+lsiX3GmsevNos+HH/tY7Ns5pfOBYMN6bkXI20Lb/ee/XmR0D2l+48YnN3yIkMgRMZrG63EYwUWJfMyCttaTpvRtfYBmxLc9zh3EbUTzYk7Nhjx68j+RgFi+ywuOCtvSBZQvwXbO490s2bOevur8L6DOQ33XyVes+R+Q5Ij2dwP9TYAKAKNjkVAAAAABJRU5ErkJggg==" alt="camera">
										</a></li>
										<li><span>$50</span></li>
									</ul>
								</div><!-- ../grid-box-description-->
								<div class="lp-grid-box-bottom">
									<div class="pull-left">
										<i class="fa fa-star"></i>
										<i class="fa fa-star"></i>
										<i class="fa fa-star"></i>
										<i class="fa fa-star-o"></i>
										<i class="fa fa-star-o"></i>
										<span class="rating-ratio">3.0</span>
									</div>
									<div class="pull-right">
										<a href="listing.html#" class="lp-add-to-fav simptip-position-top simptip-movable" data-tooltip="Add to favorites">
										<i></i>
										</a>
									</div>
									<div class="clearfix"></div>
								</div><!-- ../grid-box-bottom-->
							</div><!-- ../grid-box -->
						</div>
						<div class="col-md-3 col-sm-6 lp-grid-box-contianer"  data-title="Cabet Bar in Brighton" data-reviews="5" data-number="+007-123-4567-89" data-email="jhonruss@example.com" data-website="www.example.com" data-price="$200" data-pricetext="Text about your price" data-description="Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam eaque ipsa quae ab illo inventore veritatis et quasi archeum" data-userimage="images/user-thumb-94x94.png" data-username="Jhon Russel" data-userlisting="14"  data-fb="www.facebook.com" data-gplus="www.plus.google.com" data-linkedin="www.linkedin.com" data-instagram="www.instagram.com" data-twitter="www.twitter.com" data-lattitue="51.514070" data-longitute="-0.142292"  data-posturl="post-detail.html"  data-id="8" data-authorurl="author.html">
							<div class="lp-grid-box lp-border lp-border-radius-8">
								<div class="lp-grid-box-thumb-container">
									<div class="lp-grid-box-thumb">
										<img src="images/grid/grid-11.png" alt="grid-11" />
									</div><!-- ../grid-box-thumb -->
									<div class="lp-grid-box-quick">
										<ul class="lp-post-quick-links">
											<li>
												<a class="icon-quick-eye md-trigger" data-modal="modal-2"><i class="fa fa-eye"></i></a>
											</li>
										</ul>
									</div><!-- ../grid-box-quick-->
								</div>
								<div class="lp-grid-box-description ">
									<h4 class="lp-h4">
										<a href="post-detail.html">
											Cabet Bar in Brighton
										</a>
									</h4>
									<p>
										<i class="fa fa-map-marker"></i>
										<span>Brighton, The City of Brighton</span>
									</p>
									<ul class="lp-grid-box-price">
										<li  class="category-cion">
										<a href="listing.html">
										<!-- Food icon by Icons8 -->
										<img class="icon icons8-Food" src="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAADIAAAAyCAYAAAAeP4ixAAADaklEQVRoQ+1aQVbbMBD9013YlJ6gUS9AOAHKCZoscRZNT0B6AuAENSdoukhYAiewOQHhAlU4QWEDu07fKLZxDI4jm5S2T14ltjTSn5k/kr5NemKuiNDBK1wMnMeB6ueHlvnI/3igdl3uU3dq+BUwZENGgaL8+Ol8XO9nQIodNw2u7oTLAHogTSPmI1LCKZ9aPrUSD3iOeI40JUNJf59aPrV8aq32wAqOzKRnFKilo0V3asru2937X7eyuyZA6hAPxNVzxfZlqeVq9zEikx9zEL1ngor31dzVUJ32+tS0iWHAfBMNPrTr2Ej75FMrBrDHhG68r+T3xi99ajQxIgCXUaB03QFzdq5JT01IwAEzjuOBOqpr1KWfnpgjIhwycBIHauTSd0mQmJqIAC1zFyA9As6aesdlMqlyw0A/DtS5S9+0rZ6YIRG+AXzHLWqTPjPb9MBzgN7+CZ5k/EgmEPfVrQuQ7tTsMTAioGdBEPWEElaKyYX6exyooYth17Z6asYEfHJNZZ2kUTYe8w2DevFA2YVyAcRWEZ4lUdkY6R/JaT3ZcamSaXVixgVE2Buocd6JmTimp0bC9ZWBOVrYdQ15VWQkhfGAKwLaDHyJAxVW9ck/r1p3iirfohQzZthC96XAWBD3iBJptlbJdQKyID4EzA4DMVroNwVTAHHNLeg6Np2AWL4sg5mD0U8J5ZIKSRHpgHAm6QSgNgix5QwkBYN7jInwUf4zY4w3OF6XnFI88AuHRLAV0BJ0C8M6kShuRco06iWOFD2+WHQ4lGqWTEhKnYC6KIJKJi/AZaFKzhJ8x0yjYoVxjWztiCxtAxZEHRF4KJvLBNBtPFDvltpNzE8ibNt7ixo/xhbCJlGoXbWqPKUnpkME+yKmTN5nxm5dTq0avxZH6hisGqjKSVXPq+yv5Mhzxl31qKoJrvvcAynzlI/IujlU0s6nlk+tgsjcMKOy7j61/uvUym1RrktE5p1/YouSCQfP6FGZPgZsRMB4MY7oiTkgQphIME+EgyUBgyFb95OXInqjbXxyUpRUkVOeCBNWo2XG57LzxaNoBlgRgxESYRYF6rIpKOeIlH6/JWcMolGVMmiVS+YwPbvkAYioUfwOa12AzkCSN0M7yQCX1rOLD8ScpE0BBEDkWInkXmLvSZFwAPLsG6u0/288R19KOGbU8gAAAABJRU5ErkJggg==" alt="restaurents"></a>
										</li>
										<li  class="category-cion">
										<a href="listing.html">
										<!-- Food icon by Icons8 -->
										<img class="icon icons8-Food" src="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAADIAAAAyCAYAAAAeP4ixAAADxUlEQVRoge1ZMWwUVxDdwqArLYEEkVxYCIkUKSJQJCtxlJl/JkoBiAI6CieiSEGR4oJSUJjSAslFKmShLXb//MhIIOTC5RWgEMk0CUVAd/tnrCAhBJILFy6u2BT777jDBtvw52whP+mX+968nfm78+cnyT4+ESAxI3EZdTlpDdWEIX82uomwDPmzwzPi5PdKVOajcRLPVZw8F4tzSyDJf0hcgi2mYnECFZMhKxyL8/2CjscrQVmDZnMkJjcSv0DiEog/j8m7KcDydCiBe7G5jeO0yrS/Ept7oxjJvJZY7yU5uRObewMM8Z9VRtomNvd3efFVKNvl2NwDgJRHw4Zcj70/ukCSV0hcQsqjGvxJkiSJyf33Wv+Pt1edVk6rGQHrrwzLiOqGR+LZIHRVT8P/GjRmtTQSJL4deqKftDQM8Y/ByG0tjQSJ71dG/Dk1DefPBSP3tTQSdPIQiUvM299oaRgnX4esP9TSSJD4KRKXmPkTahqZPxEy8lRLI0HLr5G4rN99fkhLo373+SEkLtHyay2NBK1/icQlLPBRLY1vM/msMuJfamkkSP4JEpcma53U0jCZnAxN6T9aGgkSLyFxCbm/oKUBub8Q9siSlkaCxFerLwrfUtNwfEv7p5tA3hoLIqsaTV3VlMpalfXWWGz+AXTPI4b8zfjc/mbsWcA7AVn7OJJ0kKQDVEzG42Xo8Wbt47F43y9q/bXeuT3niY/mo2KyV1LWX4sR47ZwcaE8CGF8g+QFia9P2ZVjO+WZsivHkPh64CiBeO7iQnlQI+Z3ok7+SNXW+04w9MCQXD71uDyw1bOnHpcHDMllJP8gPNtB4tk6+SPDiH1ThIHB6ptDkSyDLWYg5wlwPA4p1yDlGjgeh5wnwBYzSLLcd4haBcvTu2agH5DyqHFyo1vn21uyZpzcUD2bfygg5RoQnzck8+j4UXeQEAJ/hY4fGZJ5ID4PKdd2O94doWtkt+P4aOwb2WvYN7LX8EkYgQU+2pscarflmugfsYL1jd2O54PQ39Fid4Ifse1XBzSbI1UmpBOGCHOm1ylLB6xv7Om/OtCzw2B9o3tRiiRrYH0Dms2RYK7Rl6EXQPyb5lhp+4GnXIM/2l9Azj8bJ4tIvN4tI+NkERyPb3gmb40Z4nt9/VcHiZeA+Bew/KXW5dHmBprNEbA8jU5ab3WzHeNkEfLizJYcxD8EQ+sDHE5aYHl6KIaqEumJ/2tIMiB/CejZ4R1zpTwK5C8ZkgxJnrz5whUzCqEPAon/inkztfnyf6sbGaxxnTWU6+l9KON/AEKJ9oB5vdUAAAAASUVORK5CYII=" alt="restaurents"></a>
										</li>
										<li><span>$200</span></li>
									</ul>
								</div><!-- ../grid-box-description-->
								<div class="lp-grid-box-bottom">
									<div class="pull-left">
										<i class="fa fa-star"></i>
										<i class="fa fa-star"></i>
										<i class="fa fa-star"></i>
										<i class="fa fa-star"></i>
										<i class="fa fa-star"></i>
										<span class="rating-ratio">5.0</span>
									</div>
									<div class="pull-right">
										<a href="listing.html#" class="lp-add-to-fav simptip-position-top simptip-movable" data-tooltip="Add to favorites">
										<i></i>
										</a>
									</div>
									<div class="clearfix"></div>
								</div><!-- ../grid-box-bottom-->
							</div><!-- ../grid-box -->
						</div>
						<div class="col-md-3 col-sm-6 lp-grid-box-contianer"  data-title="5 Star Moon Hotel" data-reviews="3" data-number="+041-923-4367-89" data-email="jhonruss@example.com" data-website="www.example.com" data-price="Price on call" data-pricetext="Text about your price" data-description="Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam eaque ipsa quae ab illo inventore veritatis et quasi archeum" data-userimage="images/user-thumb-94x94.png" data-username="Jhon Russel" data-userlisting="14" data-fb="www.facebook.com" data-gplus="www.plus.google.com" data-linkedin="www.linkedin.com" data-instagram="www.instagram.com" data-twitter="www.twitter.com" data-lattitue="51.512306" data-longitute="-0.119221"  data-id="9"  data-posturl="post-detail.html" data-authorurl="author.html">
							<div class="lp-grid-box lp-border lp-border-radius-8">
								<div class="lp-grid-box-thumb-container">
									<div class="lp-grid-box-thumb">
										<img src="images/grid/grid-12.png" alt="grid-12" />
									</div><!-- ../grid-box-thumb -->
									<div class="lp-grid-box-quick">
										<ul class="lp-post-quick-links">
											<li>
												<a class="icon-quick-eye md-trigger" data-modal="modal-2"><i class="fa fa-eye"></i></a>
											</li>
										</ul>
									</div><!-- ../grid-box-quick-->
								</div>
								<div class="lp-grid-box-description ">
									<h4 class="lp-h4">
										<a href="post-detail.html">
											5 Star Moon Hotel
										</a>
									</h4>
									<p>
										<i class="fa fa-map-marker"></i>
										<span>Brighton, The City of Brighton</span>
									</p>
									<ul class="lp-grid-box-price">
										<li  class="category-cion"><a href="listing.html">
											<!-- 5 Star Hotel icon by Icons8 -->
<img class="icon icons8-5-Star-Hotel" src="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAADIAAAAyCAYAAAAeP4ixAAACWUlEQVRoQ+1ZvXnbMBB95zKN5REwQZQJAk0QuwxZRJnAHsEj2BNYKciUsScQNrAzAUZI0qQ0/IEy80E0IQIgKOhTwE68H9w7HN7hKMLAw79LrlXEZyb6VFPL25hoEEgt1w2Qgi16gSSW7wTCKznHCT5BYU7AuVZWwD0IT3jGQ2OcUC5K9tRNqnVHeC1XBHwxDRTwTRRsqd+lljsD0YqLWmrk71+Nfq4LNjcdpJabsew8I7ySvwjqz6a06FSU7Mw0Ti13AsJ/yBn+4kqU7LoppUpe4x1uxAX73fxOLHcqreawA5cAzokwG2K2fciVgk7gPYBbp8POK7kkwt0+ggtdQyl8FSVbWUtL7wQRHl/p9hYKqz70oQGMsWuqhLCkTaVAKXwwY9s67C2lKr19Bbsas/BUtryWNxqM2Qr0WttANEsRZl20UwUV4retGn1mTBbdArKopdLO1wUbvLqEBBHLpi9OJyC8ko9E2GqGbVD66iIKdtHpL5PqBwNpDW0Z7e7gvvTNdZ12xFZyh/T+/wRyDKWlp8OPfUCUwoMoWTOztM+illPrv2FXp9KKRZux/ASzVqwAYvkJBpL7iGULYvWd3EdsmTyE906sta8rh2+fCimtqfuCr//cR2K1gCh+ch85psPeOwLneaTzTSBGQnIf+ffxIc8j4UwcTL/hS05jGQwkzyN5HtlkwIeWvej3EOYOG0AvIGPmBZcMj/HvCmT0vDAAZLR/JyC+JOpT276+R5WW72IZiGPGghuio3/z26/XtT+G/+M+I74ZSqW/63OQlQZTBWtbt/t3xgvz/SNvFqVEmwAAAABJRU5ErkJggg==" alt="hotels">
										</a></li>
										<li><span>Price on call</span></li>
									</ul>
								</div><!-- ../grid-box-description-->
								<div class="lp-grid-box-bottom">
									<div class="pull-left">
										<i class="fa fa-star"></i>
										<i class="fa fa-star"></i>
										<i class="fa fa-star"></i>
										<i class="fa fa-star-o"></i>
										<i class="fa fa-star-o"></i>
										<span class="rating-ratio">3.0</span>
									</div>
									<div class="pull-right">
										<span class=" simptip-position-top simptip-movable" data-tooltip="Marked as hot" >
										<i class="fa fa-fire hot-post" title=""></i>
										</span>
										<a href="listing.html#" class="lp-add-to-fav simptip-position-top simptip-movable" data-tooltip="Add to favorites">
										<i></i>
										</a>
									</div>
									<div class="clearfix"></div>
								</div><!-- ../grid-box-bottom-->
							</div><!-- ../grid-box -->
						</div>
					</div>
		</div>
	</section>
	<!--==================================Section Close=================================-->
	
	<!--==================================Footer Open=================================-->
	<footer class="text-center">
		<div class="footer-upper-bar">
			<div class="container">
				<div class="row">
					<div class="col-md-12">
						<ul class="footer-menu">
							<li><a href="index.html">Home</a></li>
							<li><a href="blog-archive.html">Blog</a></li>
							<li><a href="contact.html">Contact</a></li>
							<li><a href="login.html">Join Us</a></li>
						</ul>
					</div>
				</div>
			</div>
		</div><!-- ../footer-upper-bar -->
		<div class="footer-bottom-bar">
			<div class="container">
				<div class="row">
					<div class="col-md-12">
						<ul class="footer-about-company">
							<li>Copyright © 2016 Listingpro</li>
							<li>45 B Road NY. USA</li>
							<li>Tel: 007-123-456</li>
						</ul>
						<p class="credit-links">Proudly Listingpro by <a href="http://www.takethemes.com/" target="_blank">Takethemes</a></p>
						<ul class="social-icons footer-social-icons">
							<li><a href="listing.html#"><!-- Facebook icon by Icons8 -->
								<img class="icon icons8-Facebook" src="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAADIAAAAyCAYAAAAeP4ixAAAC10lEQVRoQ+1ai3HTQBTc7QAqgFQQqADoAFcAHZBUAFRAUgGkApIKCBUkqYCkA6hgmVXuPGf7ZF0snyTP6GY8ceyT7+17+z7Se0TLkvQBwFsAr8KrbesQn98C8OuS5FXuQK5/KOk9gG8AXg4h4Q5n3AM4JXmZXrsCRJIBnIQNDwDOAFyTtDZGW5LMCrPDsr0IgpyRPI1CLYFIstCfwhdG7P8ntyQZjBXudU6yUXwDJNDpZ/jy9dgW6NJesNBN2LcwzSKQP8EnJmuJjC9Hy9yTPKKkjwC+A3ggOVUHzxpJkh3fPrMwkB8AHGoPxhoRVeIvFwZirjkqTN43MvSy3Jb/1kDUeD25kVO6nG4K3y/lHwNIqBqceK3R1C+vAZj3zlu/S6LnKEBC2HSYLw0qTUTaZvnBgQQQvwA8s7YBOMi4dvqbOK+zt0H6rwNQJ+XHABKDygVJh/ytq5TygwJJKofiXDVVIE/OVVMF4mj0BsA7kn6/XJLsM58BOIptBIGutDA0tVpzVVJZZH3mkIA0IHPW6goIoXJ/VFIpF0t+tG3PtjP6nj8lavUqkaoDiQekVsrxPbdvzbLP06SZKRzrUmtfQEZ39j7cl+QSxeWMC0e/b12DUatLozkJJX0JuaWznJk6kFgJfCVpUAdrkdZK4FCd/Yikb7TGt0iP8PuPpOuwrau6j6Snz5m9yxyPT0nrJsTZIgVWyCqpTwYuPXP2kQJNzT5SoKSNLTO1CrQ2U6tASTO1eilJkh/hH9ds9NRy9qQpejdI660ikNgQbVpvflTpnkVnL2IX0/uaikBiN3oR29OxO1qlIVoDSNIIbZ7wDzIwsG8grQMDwfzpCMcJyfNdqdR6X51puD61aJXkMZM4XrI6whEPXptHMd18QVFTsui+ekcgwQJuS9i5Y+thCcJnt405GUCcwtmXYfb1O55aMmPax5zWblgczWIL2XlmzHWXDJ6tAIhC/QfJdOM+5ZDCYAAAAABJRU5ErkJggg==" alt="facebook"></a></li>
							<li><a href="listing.html#"><!-- Google Plus icon by Icons8 -->
								<img class="icon icons8-Google-Plus" src="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAADIAAAAyCAYAAAAeP4ixAAAEFElEQVRoQ+2a8VEVQQzGkwqUCoQKhArUCpQKhAqECoQK1AqECsQKlArUCsQKhAri/J7Jzd6+23t3B3dv/yAzzGOYPV6+TfbLl+ypFMzM9kXkrYjw+bK0bqG/fxeRnyJyqap8rpnmf3EAHypwvrRHgDrNAbWAmNkbEfksIk9F5E5ELkTkSlV5eGtmZmQEvh2JyBMRuRWRY1W9CqcaIGbGIkBglyJyoqo8UI2ZGRv80VMevw4DzAqIme2KyA+PBEiJRLWWbDobfaCqNwHkm58JDhORqd7MjLR67al/qB6N334mdmtLp9KOeprd+JnZAwg5905EPqnqSfWhSBxs+W5mMNILEXm1bXYau4nOZhyLayLy1w/52P9T0/pbgFhNHk31pQGiqmtVfuo/XfK5CMQjkCV3ve+7HiNSSyTCj3tHxMyQB8gZdBo9S8muReRsrho1GYgXIVQyMh9VgExIJTaAaH5OkdulRuihIjsJSKI6r1W11TV6Q4ZKoF/ALlT1+KEc7tFcqzo4mH4TcclznXLGzNBqdJdhs8ue0RFJZLP0FU8zI9WeOZKvqkrazWZTgDRSZgOQUNM4f6Oqe7Oh+N8UDk+tRGWGTzulvsX7/i+xcG7pc18gTa+c73YGeo0UHjo6o4Dw5ZlKLrbEGZBzVT0b4nyuwodGcgoQBhIM7MJo+teGZQlFU2cGt85LAmEUEz1yFD3otRkZeR/NNGaHYcaYYrgYEE8v5AjTi+ceFkCshnhJdf/D74xohqRUrFkUSPKl1AYqOxqLSAUwlnSm3CZQWwGSOjWFbqe2110EMPqwl3Y0G7WyjAEzRbFotQLh3MBeIRYB0CsYqwNiZszDMCKQ9ySAa7Fa6WBvOj99KmFSarkCppZw2HEchgp2ir4kjUwRTIciaI2l5iyI7+n03IFzT58WxXpPAh2nLDaoui/CWmZGRxhT+l569aJIg9XUGlWlQPba7EAyVho06HYwpFX0JXubCuQSQLhygJmwwR1ftgEbi+QSQNJDOAYIlZ9J+Z2qUv1nscGsZWboqWCiQQcXj5P+fdZbsBTIytES3ZlZKt9ZS1Q677qTOkEEiAZt7mApPzZkfha5FrljitJ70ZNdcfFdgIGG2em1W19vrJikAGKUlJ8AJNJ3ddGz8erN6wPropIHICITd/AUyJg6LnK9nV+94QDNELsLTRbv1n23qSc8kxY9KnyA4gWDUb3I2Ej4GSR9YVQ+D+J6OtJrkengFMc7JE0U6dWAI31hIBQsA2ckSLVmZiGXmAvsNy8MeKgQgjGPgqnoK2p8hQMiCbnUfoUjoU3AACJeXIl+/Ne2QDlrch5j4h8v/Bx1vlSTgIF5AJAyVE1pxn0LIFqEUrzJdcoNhoKl0j5jSWCcA84vP5BRZzH+B8zg25A0mqpxAAAAAElFTkSuQmCC" alt="google-plus"></a></li>
							<li><a href="listing.html#"><!-- LinkedIn icon by Icons8 -->
								<img class="icon icons8-LinkedIn" src="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAADIAAAAyCAYAAAAeP4ixAAADv0lEQVRoQ+1a7VEbMRTcrSDpIFBBoIKQCoIrSKggUEGggkAFgQogFYRUELuCQAUJFbzMnp8uurNOJxv7Ds9YM/6B0fm02vf2fUhExzCzjwCOABz4p2vqEN9PAehzT/Im9UK2vzSzYwBfAewNscIV3vEA4IzkXfxsA4iZCcCpT5gBuPZd0G6MNsxMViHr+ATgrS/kkuRZWFQNxMwuAXwG8ATgnKT+fnHDzLTR5wBeAbgiWW18BcTN6dZBHJEclYG+3XOGfvm8icwsAPntPiHbe5FMJHxZTMgVHkju08xkd98AzEjKFrdmmJksRz4zERA5tKR2a9gIO+3+IlZuBES2JiYOu3zDY4qoDIxpJ6QaSU0fitLIV6YCYpXXkwsxxYVAZifzS41rkidDLTz1nnr9OSARdZJkMRKCkIKmREESeEJS5jnKKAUSzK6SuHilkUhMSR6OgmIeOuYW1cNIp9mZ2WsAf3JmOQS4UiB/3Xz2SSrHqYeZKRdT/HkiKVCjjFIgQZrvSE5aQJQJyFduSHaJwcbBlQLRrktq5dRiJHZ2/U8icNBma+Orb1pGv4+4/Cp2CMCb1gIfxcjYeVkRIy1TUhqtj4aUqqFiQ7LQWlc/I1HUz62z8p8l52pDPkQVqH5fwiIz1gZ9LzXXIkbCpL7dVlZQOtcXKpHIDYFSCnTR9+6lgGTSlzrOFKQ61VwfEgllBmKzqn08LokpgVQSW5kwgPckBSw5xgSiElrFW25xEph7V8sF6V/FR/oSymUYCVVnFkRYpAfcIP2d+dzgjPTZeur/UT5XVYEdc4pUa22MRDv9xcsCBVQFWWUPaiIkTc3MNEcxbCFxdd8aHkhGojud2szUMRH4umMyto+EZkGdEbgfKG6o7r4gqUU3hplJyX4A+EkyBOR6zuA+ErHRcNyoFZWsa6JyIeknYwDJ1TbFvphgbFgfWbWAazh0oq+wYySpGFGuVZLOdJpHdyen3yzXRXlprpUCupZnd0DiVszOtObesjOtdTTo2ju5ll3dqdYzWqY7RnJpxjNNKxxfLRz0lHZGlumi5AJiXxXZfjY66Jllj97MTA2Adz0vUA/qeJm5iRSl+D2tFCnUONXRWzgMHfWco4+Njnr9//mNO22oi7fmQDQ6TXskude+MKAGgBpi23lhwFkJVzgERlc4rlahe9PPmJmumYRLDc0rHFGrJoDRV2JFrRoV/aMy5Ook0ZE/hyPyRlel65qTALXPQza92aW/ry7MafaaU0vahD5cPAtXi0pftu556heHi2fJo/B/rbIkXGKb1eoAAAAASUVORK5CYII=" alt="linkedin"></a></li>
							<li><a href="listing.html#"><!-- Instagram icon by Icons8 -->
								<img class="icon icons8-Instagram" src="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAADIAAAAyCAYAAAAeP4ixAAAFNUlEQVRoQ9WagVUUQQyGkwqUCpQKlArUCoQKxAqUCoQKhAqECsQK1AqECtQKxAri+8ZkzQ67d3vL3HHOe/dg7/Z25k/+JP9kTmVkmNkrEXkuIk/9NXbrJt6/EhFel6r6aWhCrd80s30ReS8ijzexwhlz/BCRI1W9zN/tATEzALz1G36KyKmIfFFVrHFvw8xgBexgbY98IaeqehSL6oCYGYt+4x+AmOutG2YGGAzOOFPVYvgCxOn00T/cu28PLLOee+ib33cAzQLId4+JrfGEmT0UkQ8iQszmQWy8FpFD98wPVd1VM+MNvvBTVbcmwM3ss8fFkIM+qeq+mRH4xMwBQM5FhFS7Nd5wupsj2FHVG38PL/0qMaHK2iNeLriAa2SFrYoNMytAWHB2SX4/xcoVQAa/sCzg1v35FCDZc82BuJWgKl6GCvxlUIugCH8vlmXGACIio9RaCxAze+eZZGrCIFDPVfVkyLtm9kVEno14vgR7UyBmRsUl6wUAFAEpktdNWN49hYdYAK+o0AB6raosvBuefklELyswaK3DlAD+hsZdYqSSNF9F5Lhe0FgsuQGOk9XfqurZqrHXrX8uEDPDC9QgRi91mxlWxOp4KccI1u8p2EpyQDWK3eQxCiSl4ykP+82Cwwsu/dFoUGjRIOjxwIXzHHpCxQdTJnUh+2JhjKRsMeWZLwDhfKYSh/WhGfy+qmKEz/FiBDEZjGfcONV4xqQR9WWRR0brii+YAgplCp0qENdu6V7g1ivzReO5J56OA0xUaihIgS4VPY86FOYCIThJs19VFTqgnEMZAOL50ORDJnYDALiAUdU9f16k3RNVZb61AAmVHJQKYCuBiJVVYMrCE8WKqm0OJO1Zikr2RQCMwC7AJpH7toXxLLEBjXY9Xv6p2mpLe2dqpR1k2ZUl+d/RbA6Qik4UxvN6rqYxkiRD0Ip0Sb0ok88F4UBiTxT7jPDSLSO18Aj7AGhU5H5L+d+T46p76RqJs9PaI720PFcRjHlu1NIL9iOTCuKiDU3vAdVEcym2SSBUYXJ+UKt3PReAG4WKTz26VtWniVrlujW1olD998EeDbw6/dKJLAJu7kgdk42k33B/qbheEClcKNYWBREl/dgLYiiIWw2RO6df5zLVt1u4mYVE6VTsKl6pBGctUQb7bK2AxMILnWrhF5J8CphaNUdQp/q0PtHoXgkdlGV8UAzP8P4UGU8jGrpmSoWMH+16NvGIA2ELGw3vvLEKSc5t/I9sIX2WIwlPqaRv5EjZAvB5SP9qY1Ua00OebQbEFxUUI2aYNHaJWJTXsi0rXiALcsYRu0OMgwQapFSAagrEwUTPmMuuA+Lcj5YPO0m8ENYvzQdvQEQ/lzOZOIuhcRcNjcFQaw6k8kzQCWtO2pc4lSJO+P5CT6zNI+nBWB+L5oZbNOh+VzEC5bK3eAwNPTw6GBO1W9bikTyJ15Qp8RFfK3EytC9flL7XDiR5KFo+0cTOMRJNbBpxsw5YVwbi+2eCc2uGmZE8kC/duUluB9XyPLawW3WC5cklCmZsif/J//roLTUVoAEFbxYFWrvRCyrdFmpNqOTe0VtU6q6PlBoNgKH4YYF7oZnTiSYH6wBEPhsJlXwQx9ND+gmKjR20tDb41Od1ZyOpi1902cIfDDjN8Fh92DJ14lb3AYDjiNJ2Gv3BgH+Yf8Ix69Cl1aqX1JEsafo/4Ug1IIOBblzTJLvXgHcPQHOCO474OhAlHQ9IgFpybMLQq8wxKGluAak0FKDI1VGdV5mw5b3sW+KHZ4Oa7A8mMc1cZlo+UAAAAABJRU5ErkJggg==" alt="instagram"></a></li>
							<li><a href="listing.html#"><!-- Tumblr icon by Icons8 -->
								<img class="icon icons8-Tumblr" src="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAADIAAAAyCAYAAAAeP4ixAAADeUlEQVRoQ+2ajXHTQBCF91UAVACpAKgAOgBXQFIBSQWECkgqIKkgSQWECnAqIKmApIJlPs2d5uScrL8jthndjMdjSzrtu919tz8naxnu/snM3pvZm/Bpu/Up/l+aGZ9LSVe5F2r1T3f/aGbfzOzVU0g44h23ZnYk6TJ9tgHE3QFwGG64M7MTM7uWxGpsbLg7VoF1INvLIMiJpKMoVA3E3RH6c7gAYn5v3XB3wLDgjFNJ1cJXQII5XYSLbzetga7VCxr6Fe5bYGYRyO/gE1uriYwvR83cStqTu++b2Xczu5O0rQ6eVZK74/j4zAIgZ2YG1e6MNiKqxF/OAYKtwQqTfcPdj83sS2b5aqfssv8h1xNfWQLEK6+XHu0pQyYNpPHHzJ7nnisxf27eWv5SQNwdAAB5kFSDKTV/26L+CyBEBFD4T0lsXtXYRSBZ0tgpIInTPbAfSbrfOY0E34D52IO+SoK56rETGnF3hMcvoO8bSXw3xtYDCfkKgSUMdUN0mprUqmmtofIzSQdDqf6R6Q5dseAPRJ+RmUh09nMgAmtdm9m7dYJO2WNG06+7xwCTfOVYEmw1agxdxKIbYomXl2S0KRopGdJMnmsGEldgxV6pbixabPhHQgxZX9qUs6e5fS1YmzAtwFNA55JI7kaN0aY1dMMrSQ5FWWsGUiBxmzXSx/u6fKDrep93rLtndvbZ2WdnX+9Fs4+M8BF6K6+r+uxKcyYkXiRotDMIVRrNmz6MVlIjUdBsyTWpz1JZoYJO4Zlcn/yeWlgsnN9LetFH+PSekkBYxQ9mdtCWLSaF8pycZJpVF2pMFFwSSOxTXElihbMjNJOiBtAKH8L/5ZRNsySQWPMFwJ4kBBw0tgJIcNhYLm1NsHqFGSP2mmIaCUBwWJz+mZn1rlO5O4xFP4XvRhW/r0pTIGtZZ8CECIPjAwbzonRK9bFubbs79S1MkXvjYQReQc2Y2tgg+k1qzjdFW29hYoSJvfCudYCxMEt65nXhu+uheH219Rb7GlV3tO8kHTZPDs68rDoaioPSKtqKxzEmHURIioWL2J6O3dGdaYgm2qi60f/XgYHAPGmZ51DSaQkzKz2HuxOXxeMlzSMcifOkYDA3ftMTnGTLU8EEEoHxiCJibNZoebcdcwJAX+aZKufQ52E6LKb9mFM6YxIbEaUShm9ywHaR6bJ7zV8Cie0+55PMmQAAAABJRU5ErkJggg==" alt="tumblr"></a></li>
						</ul>
					</div>
				</div>
			</div>
		</div><!-- ../footer-bottom-bar -->
	</footer>
	<a href="post-submit.html" class="add-listing-mobile lp-search-btn">Add listing</a>
</div>
	<!--==================================Footer Close=================================-->
	
	
	
	<!--==================================Javscript=================================-->


		<script type="text/javascript" src="js/jquery-lib.js"></script><!-- Jquery Library -->
		<script type="text/javascript" src="js/jquery-migrate-1.3.0.min.js"></script>
		<script type="text/javascript" src="https://maps.googleapis.com/maps/api/js?sensor=false"></script>
		<script type="text/javascript" src='js/mapbox.js'></script>
		<script type="text/javascript" src='js/leaflet.markercluster.js'></script>
		<script type="text/javascript" src="js/build.min.js"></script>
		<script type="text/javascript" src="lib/chosen/chosen.jquery.js" ></script>
		<script type="text/javascript" src="js/jquery-ui.js"></script>
		<script type="text/javascript" src="lib/slick/slick.min.js"></script>
		<script type="text/javascript" src="lib/jquerym.menu/js/jquery.mmenu.min.all.js"></script>
		<script type="text/javascript" src="lib/Magnific-Popup-master/jquery.magnific-popup.min.js"></script>
		<script type="text/javascript" src="lib/jQuery.filer-master/js/jquery.filer.min.js"></script>
		<script type="text/javascript" src="js/bootstrap-rating.js"></script>
		<script type="text/javascript" src="lib/popup/js/classie.js"></script> <!-- Popup -->
		<script type="text/javascript" src="lib/popup/js/modalEffects.js"></script> <!-- Popup -->
		<script type="text/javascript" src="js/main.js"></script>
		
</body>
</html>