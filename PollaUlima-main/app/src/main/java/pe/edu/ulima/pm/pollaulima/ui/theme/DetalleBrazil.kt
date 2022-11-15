package pe.edu.ulima.pm.pollaulima.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import pe.edu.ulima.pm.pollaulima.R

@Composable
fun DetalleBrazil() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = "DetalleBrazil"){
        composable(route = "DetalleBrazil"){
            MainDetalleBrazil(navController = navController)
        }

        composable("Paises") {
            Paises()
        }
        composable("Polla") {
            Polla()
        }
    }
}

@Composable
fun MainDetalleBrazil(navController: NavController) {

    Column(
        verticalArrangement = Arrangement.aligned(alignment = Alignment.Top),
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {

        Text(
            modifier = Modifier.align(Alignment.CenterHorizontally),
            text = "Brasil",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )
        //Espaciador
        Spacer(modifier = Modifier.height(10.dp))
        //Imagen de la bandera del pais
        Image(painter = painterResource(R.drawable.bbrasil),
            contentDescription = "DetalleBrazil",
            modifier = Modifier
        )
        Divider(
            modifier = Modifier
                .fillMaxWidth()
                .height(4.dp)
                .background(color = Color.Black)
        )
        Column {
            Text(

                text = "              Dirección:",
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .height(32.dp))
            Text(text = "              ",
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .height(32.dp))
        }
        Spacer(modifier = Modifier.height(10.dp))
        Divider(
            modifier = Modifier
                .fillMaxWidth()
                .height(4.dp)
                .background(color = Color.Black)
        )
        Column {
            Text(

                text = "              Sitio Web:",
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .height(32.dp))
            Text(text = "              ",
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .height(32.dp))
        }
        Spacer(modifier = Modifier.height(10.dp))
        Divider(
            modifier = Modifier
                .fillMaxWidth()
                .height(4.dp)
                .background(color = Color.Black)
        )
        Column {
            Text(
                text = "              Colores:",
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .height(32.dp))
            Text(text = "              ",
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .height(32.dp))
        }
        Spacer(modifier = Modifier.height(10.dp))
        Divider(
            modifier = Modifier
                .fillMaxWidth()
                .height(4.dp)
                .background(color = Color.Black)
        )
        Column {
            Text(
                text = "              Estadio:",
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .height(32.dp))
            Text(text = "              ",
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .height(32.dp))
        }
        Spacer(modifier = Modifier.height(80.dp))
        Row{
            Button(
                onClick = {
                    navController.navigate("Paises")

                },
                modifier = Modifier
                    .width(198.dp)
                    .height(98.dp)
            ) {
                Text(text = "Equipos")
            }
            Button(
                onClick = {
                    navController.navigate("Polla")

                },
                modifier = Modifier

                    .width(208.dp)
                    .height(98.dp)
            ) {
                Text(text = "Polla")

            }
        }

    }

}

