package pe.edu.ulima.pm.pollaulima.ui.theme


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.runtime.Composable
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.BlendMode.Companion.Screen
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import pe.edu.ulima.pm.pollaulima.R

@Composable
fun PaginaPrincipal() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = "Pagina Principal"
    ) {
        composable("Pagina Principal") {
            MainPrincipal(navController = navController)

        }
        composable("Paises") {
            Paises()
        }
    }
}
@Composable
fun MainPrincipal(navController: NavHostController) {

    var text by remember {
        mutableStateOf("")
    }
    //Columna de la pagina principal
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        Image(modifier = Modifier.align(Alignment.CenterHorizontally),
            painter = painterResource(id = R.drawable.descarga),
            contentDescription = "Ulima")
        //Titulo de la aplicación

        Text(
            modifier = Modifier.align(Alignment.CenterHorizontally),
            text = "Polla ULima",
            fontSize = 42.sp,
            fontWeight = FontWeight.Bold
        )
        //Espaciador, que seperara el titulo, el texto, caja de texto y el boton
        Spacer(modifier = Modifier.height(100.dp))
        //textos que indica los codigos de los estudiantes
        Text(
            modifier = Modifier.align(Alignment.CenterHorizontally),
            text = "20150634",
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(20.dp))
        Text(
            modifier = Modifier.align(Alignment.CenterHorizontally),
            text = "20192247",
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(50.dp))
        //caja de texto para ingresar el Codigo
        TextField(
            value = text, onValueChange = {
                text = it
            },
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(100.dp))
        //Boton Ingresar
        Button(
            onClick = {
                navController.navigate("Paises")

            },
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .fillMaxWidth()
                .height(48.dp)
        ) {
            Text(text = "Ingresar")

        }
    }
}
