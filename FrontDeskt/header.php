<? 

// Definimos el idioma por defecto, en este 
// caso será es (español) 
$idiomaActual = 'es';
// Si se ha seleccionado un idioma se guarda 
// una cookie con el idioma 
if(isset($_GET['idioma'])){ 
  setcookie ("idioma", $_GET['idioma'], time () + 7*24*60*60); 
  $idiomaActual = $_GET['idioma']; 

} 
elseif(isset($_COOKIE['idioma'])){ 

// Miramos que exista el archivo del idioma 
  if(file_exists("lang/".$_COOKIE['idioma'].".php")){ 
    $idiomaActual = $_COOKIE['idioma']; 
    //echo "Value is: " . $_COOKIE['idioma'];
  } 
} 

// Incluimos el archivo del idioma seleccionado 
// o el archivo por defecto si no se seleccionó 
// idioma o si no se encuentra el archivo 
include "lang/".$idiomaActual.".php"; 

// Definimos el usuario actual por defecto
$NombreUsuarioActual = '';

//preguntamos si la variable aun no esta definida
if (isset($_GET['CookieUsuario'])==true)
{
	setcookie ("CookieUsuario", 'root', time () + 0);
	echo "variable no definida";
}
elseif(isset($_COOKIE['CookieUsuario']))
{
	//echo "variable definida";
	$NombreUsuarioActual = $_COOKIE['CookieUsuario'];
	echo "<br>Value is: " . $_COOKIE['CookieUsuario'];

}
else
{
	
}
	echo '<br>cookie: ' . $_COOKIE['CookieUsuario'];
	echo '<br>variable: ' . $NombreUsuarioActual;
?>

		<div class="lp-header-overlay"></div> <!-- ../header-overlay -->
		<div class="lp-topbar">
			<div class="container">
				<div class="row">
					<div class="col-md-8 col-sm-8 text-left">
						<ul class="lp-topbar-menu">
							<li>
								<a href="index.php"><?php echo HOME;?></a>
							</li>
							<li>
								<a href="about.php"><?php echo ABOUT;?></a>
							</li>
							<li>
								<a href="contact.html"><?php echo CONTACT;?></a>
							</li>
						</ul>
					</div>
					<div class="col-md-4 col-sm-4 text-right">
						<div class="lp-join-now">
							<span>
								<!-- Contacts icon by Icons8 -->
								
							
							
                            
                            <div class="lp-join-now lp-menu pull-right menu ">
								<ul>
								<?php if ( $_COOKIE['CookieUsuario']=='') : ?>
	                                <li>
	                                	<a class=" md-trigger" data-modal="modal-3">
	                                	<img class="icon icons8-Contacts" src="images/icon_login.png" alt="join-now">
	                                	<?php echo MY_ACCOUNT; ?>

	                                	</a>

	                                </li>

								<?php else : ?>
									<li>
	                                	<a href="">
	                                	<img class="icon icons8-Contacts" src="images/icon_login.png" alt="join-now">
	                                	<?php echo $_COOKIE['CookieUsuario']; ?>
	                                	</a>
										<ul class="sub-menu">
											<li>
												<a href="#">
												<?php echo Confguración;?>
												</a>
											</li>
	                                		<li>
	                                    		<a href=""
	                                    		onclick="BorrarUsuario()"
	                                    		><?php echo Salir;?>
	                                    		</a>
	                                		</li>
										</ul>
									</li>
								<?php endif;?>
								<li><a href=""><span><img class="icon icons8-Contacts" src="images/icon_world.png" alt="lenguaje"><?php echo LANGUAJE;?></a>
									<ul class="sub-menu">
										<li>
											<a href=""
											onclick="changeCookie('es')">
											<?php echo SPANISH;?>
											</a>
										</li>
                                		<li>
                                    		<a href=""
                                    		onclick="changeCookie('en')"
                                    		><?php echo ENGLISH;?>
                                    		</a>
                                		</li>
									</ul>
								</li>
                                 </ul>
                             </div>
							</span>
                            
						</div>

					</div>

				</div>
			</div>
		</div><!-- ../topbar -->

		<script>

function changeCookie(lengua)
{
    document.cookie = "idioma="+lengua;
}
function LoginUsuario(nombre)
{
	document.cookie = "CookieUsuario="+nombre;
}
function BorrarUsuario()
{
	document.cookie = "CookieUsuario="+"";
	document.write("NombreUsuarioActual = " + "");
}
</script>

