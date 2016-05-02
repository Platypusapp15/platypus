<!DOCTYPE html>
<html>
<head>

	<!-- Meta -->
	<meta charset="utf-8">
	<meta name="keywords" content="HTML5 Template" />
	<meta name="description" content="Listingpro - Template HTML5">
	<meta name="author" content="">
	
	<!-- Title -->
	<title>platypuss - <?php echo HOME;?></title>
	
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
	<link href="lib/Magnific-Popup-master/magnific-popup.css" type="text/css" rel="stylesheet" />
	<link href="lib/popup/css/component.css" type="text/css" rel="stylesheet" />
	<link href="lib/icon8/styles.min.css" type="text/css" rel="stylesheet" />
	<link href="lib/font-awesome/css/font-awesome.min.css" type="text/css" rel="stylesheet" />
	<link type="text/css" rel="stylesheet" href="lib/jquerym.menu/css/jquery.mmenu.all.css" />
	<link href='css/mapbox.css' rel='stylesheet' />
	<link href='lib/chosen/chosen.css' rel='stylesheet' />
	<link href='https://api.mapbox.com/mapbox.js/plugins/leaflet-markercluster/v0.4.0/MarkerCluster.css' rel='stylesheet' />
	<link href='https://api.mapbox.com/mapbox.js/plugins/leaflet-markercluster/v0.4.0/MarkerCluster.Default.css' rel='stylesheet' />
	<link href="css/main.css" type="text/css" rel="stylesheet" />
	<script src="//ajax.googleapis.com/ajax/libs/angularjs/1.5.3/angular.min.js"></script>

	<!-- IE8 support of HTML5 elements and media queries -->
	<!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
	<![endif]-->




</head>
<body ng-app="myApp">
<div id="page">
	<header class="lp-header-bg">
	<!--==================================Cabezera=================================-->
	<? include("header.php");?>
	
	<!--==================================Registro=================================-->
	<? include("register.php");?>
	<!--==================================SubHeader=================================-->
	<div class="md-overlay"></div> <!-- Overlay for Popup -->
		<div class="lp-menu-bar">
			<div class="container">
					<div class="row">
						<div class="col-md-4 col-xs-6 lp-logo-container">
							<div class="lp-logo">
								<a href="index.php">
									<img src="images/logo.png" alt="" />
								</a>
							</div>
						</div>
						<div class="col-xs-6 mobile-nav-icon">
							<a href="index.php#menu" class="nav-icon">
								<span class="icon-bar"></span>
								<span class="icon-bar"></span>
								<span class="icon-bar"></span>
							</a>
						</div>
						
						
						<div class="col-md-8 col-xs-12 lp-menu-container">
							<div class="pull-right lp-add-listing-btn">
								<ul>
									<li><a href="post-submit.php"><i class="fa fa-plus"></i> <?php echo ADDRESTAURANT;?></a></li>
								</ul>
							</div>
						</div>
					</div>
				</div>
		</div><!-- ../menu-bar -->
		
		

	<!--==================================Body Open=================================-->
		<div class="lp-home-banner-contianer">
			<div class="lp-home-banner-contianer-inner">
				<div class="container">
					<div class="row">
						<div class="col-md-12 col-sm-12 text-center">
							<h1><?php echo LABEL_BIENVENIDA;?></h1>
						</div>
						<div class="col-md-8 col-xs-12 col-md-offset-2 col-sm-offset-0">
							<div class="lp-search-bar">
								<form method="post" action="listing.html" >
									<div class="lp-search-bar-left">
														
									<div class="ui-widget border-dropdown">
									  <select class="comboboxs">
										<option value="">Select one...</option>
										<option value="All Locations"><?php echo ALL_CATGORIES;?></option>
										<option value="London">Japones</option>
										<option value="Birmingham">Mediterrano</option>
										<option value="Bristol">Italiano</option>
										<option value="Manchester">Barbacoa</option>
										<option value="Newcastle">Libanes</option>
										<option value="Glasgow">Burguers</option>
									  </select>
									</div>
										<input type="text" placeholder="<?php echo RESTAURANTE_BOX;?>" name="keywords" class="lp-search-input lp-home-search-input" />
									</div>
									<div class="lp-search-bar-right">
										<input type="submit" value="Search" class="lp-search-btn" />
										<i class="icons8-search lp-search-icon"></i>
									</div>
									<div class="clearfix"></div> <!-- ../clearfix -->
												
								</form>
							</div><!-- ../search-bar -->

							<div class="text-center lp-search-description">
								<p>Hav’nt any idea, let’s explore best & hot <br>
								deals you are interested in
								</p>
								<img src="images/banner/banner-arrow.png" alt="banner-arrow" class="banner-arrow" />
							</div>
						</div>
					</div>
				</div>
			</div>
		</div><!-- ../Home Search Container -->
	</header>

	<!--==================================Body Close=================================-->

	<!--==================================Footer=================================-->
	<? include("footer.php");?>		

	


</div>
	

	
	<!--==================================Javscript=================================-->


		<script type="text/javascript" src="js/jquery-lib.js"></script><!-- Jquery Library -->
		<script type="text/javascript" src="js/jquery-migrate-1.3.0.min.js"></script>
		<script type="text/javascript" src='js/mapbox.js'></script>
		<script type="text/javascript" src='js/leaflet.markercluster.js'></script>
		<script type="text/javascript" src="https://maps.googleapis.com/maps/api/js"></script>
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