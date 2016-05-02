<script src="//ajax.googleapis.com/ajax/libs/angularjs/1.5.3/angular.min.js"></script>


<!--
<script>
  angular.module('registro', [])
    .controller('RegistroController', ['$scope', function($scope) 
    {
      $scope.usuario = {};

      $scope.update = function(person) {
        $scope.usuario = angular.copy(usuario);

      };
    }])
    ;
</script>
-->





<div class="md-modal md-effect-3" id="modal-3">
	<div class="login-form-popup lp-border-radius-8">
		<div class="siginincontainer" ng-controller="ExampleController">
			<h1 class="text-center"><?php echo SIGN_IN;?></h1>
			<form class="form-horizontal margin-top-30"  method="post">
				<div class="form-group">
					<label for="username"><?php echo USERNAME;?> <?php echo OR_;?> <?php echo EMAIL;?> *</label>
					<input type="text" class="form-control" id="username" ng-model="user.username"/>
				</div>
				<div class="form-group">
					<label for="password"><?php echo PASSWORD;?></label>
					<input type="password" class="form-control" id="password" ng-model="user.pass" />
				</div>
				<div class="form-group">
					<div class="checkbox pad-bottom-10">
						<input id="check1" type="checkbox" name="price-on-call" value="price-on-call">
						<label for="check1"><?php echo KEEP_ME_SIGNED_IN;?></label>
					</div>
				</div>
				
				<div class="form-group">
					<a href="<?=$_SERVER['PHP_SELF']?>">
					<input type="submit" ng-click="update(user)" onClick="window.location.reload()" value="<?php echo ENTER;?>" class="lp-secondary-btn width-full btn-first-hover" /> 
					</a>

				</div>
				<pre>user = {{user | json}}</pre>
    			<pre>master = {{master | json}}</pre>


			</form>	
			<div class="pop-form-bottom">
				<div class="bottom-links">
					<a  class="signUpClick"><?php echo NOT_A_MEMBER;?> <?php echo SIGN_UP;?></a>
					<a  class="forgetPasswordClick pull-right" ><?php echo FORGOT_PASSWORD;?></a>
				</div>
				<p class="margin-top-15"><?php echo CONNECT_WITH_YOUR_SOCIAL_NETWORK;?></p>
				<ul class="social-login list-style-none">
					<li><button id="logingoogle" class="google flaticon-googleplus" ><i class="fa fa-google-plus"></i><span>Google</span></button></li>
					<li><button id="loginfacebook" class="facebook flaticon-facebook" ><i class="fa fa-facebook"></i><span>Facebook</span></button></li>
					<li><button id="logintwitter" class="twitter flaticon-twitter" ><i class="fa fa-twitter"></i><span>Twitter</span></button></li>
				</ul>
			</div>
		<a class="md-close"><i class="fa fa-close"></i></a>
		</div>
		<div class="siginupcontainer" >
			<h1 class="text-center"><?php echo REGISTRO;?></h1>
			<form novalidate class="css-form"  method="post" ><!--class="form-horizontal margin-top-30 css-form"-->
				
				<div class="form-group" >
					<label for="password"><?php echo EMAIL;?> *</label>
					<input type="email" class="form-control" id="email" ng-model="usuario.email"/>
				</div>
				<div class="form-group">
					<label for="username"><?php echo USERNAME;?> *</label>
					<input type="text" class="form-control" id="username" ng-model="usuario.username"/>
				</div>
				<div class="form-group">
					<label for="password"><?php echo PASSWORD;?> *</label>
					<input type="password" class="form-control" id="password" ng-model="usuario.password"/>
				</div>
				<div class="form-group">
					<a href="<?=$_SERVER['PHP_SELF']?>"><input type="submit" value="<?php echo REGISTER;?>" class="lp-secondary-btn width-full btn-first-hover"/> </a>
				</div>
			</form>	




			<div class="pop-form-bottom">
				<div class="bottom-links">
					<a class="signInClick" ><?php echo ALREADY_HAVE_AN_ACCOUNT;?> <?php echo ENTER;?></a>
					<!--<a class="forgetPasswordClick pull-right" >Forgot Password</a>-->
				</div>
				<p class="margin-top-15"><?php echo CONNECT_WITH_YOUR_SOCIAL_NETWORK;?></p>
				<ul class="social-login list-style-none">
					<li><button id="logingoogle2" class="google flaticon-googleplus" ><i class="fa fa-google-plus"></i><span>Google</span></button></li>
					<li><button id="loginfacebook2" class="facebook flaticon-facebook" ><i class="fa fa-facebook"></i><span>Facebook</span></button></li>
					<li><button id="logintwitter2" class="twitter flaticon-twitter" ><i class="fa fa-twitter"></i><span>Twitter</span></button></li>
				</ul>
			</div>
		<a class="md-close"><i class="fa fa-close"></i></a>
		</div>
		<div class="forgetpasswordcontainer">
			<h1 class="text-center"><?php echo FORGOT_PASSWORD;?></h1>
			<form class="form-horizontal margin-top-30"  method="post">
				<div class="form-group">
					<label for="password"><?php echo EMAIL;?> *</label>
					<input type="email" class="form-control" id="email2" />
				</div>
				<div class="form-group">
					<input type="submit" value="<?php echo GET_NEW_PASSWORD;?>" class="lp-secondary-btn width-full btn-first-hover" /> 
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
<style type="text/css">
  .css-form input.ng-invalid.ng-touched {
    background-color: #FA787E;
  }

  .css-form input.ng-valid.ng-touched {
    background-color: #78FA89;
  }
</style>


<script>
var app = angular.module("myApp", []);

	app.controller('MainController', ['$scope', function($scope) { 
	  $scope.title = 'Top Sellers in Books'; 
	}]);



    angular.module('formExample', [])
      .controller('ExampleController', ['$scope', function($scope) {
        $scope.master = {};


        $scope.update = function(user) {
          $scope.master = angular.copy(user);
          document.cookie = "CookieUsuario="+$scope.master.username;
        };
      }]);
  </script>


<!-- Popup Close -->