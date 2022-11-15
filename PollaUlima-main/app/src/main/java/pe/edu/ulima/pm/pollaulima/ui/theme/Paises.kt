package pe.edu.ulima.pm.pollaulima.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
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

@Composable
fun Paises() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = "Paises"){
        composable(route = "Paises"){
            MainPaises(navController = navController)
        }

        composable("DetalleUruguay") {
            DetalleUruguay()
        }
        composable("DetalleAlemania") {
            DetalleAlemania()
        }
        composable("DetalleEspana") {
            DetalleEspana()
        }
        composable("DetalleArgentina") {
            DetalleArgentina()
        }
        composable("DetalleGhana") {
            DetalleGhana()
        }
        composable("DetalleBrazil") {
            DetalleBrazil()
        }
        composable("Polla") {
            Polla()
        }
    }
}

@Composable
fun MainPaises(navController: NavController) {

    Column(
        verticalArrangement = Arrangement.aligned(alignment = Alignment.Top),
        modifier = androidx.compose.ui.Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {

        Text(
            modifier = Modifier.align(Alignment.CenterHorizontally),
            text = "Equipos",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )
        //Espaciador
        Spacer(modifier = Modifier.height(80.dp))
        Divider(
            modifier = androidx.compose.ui.Modifier
                .fillMaxWidth()
                .height(4.dp)
                .background(color = Color.Black)
        )
        Row {
            Image(painter = painterResource(pe.edu.ulima.pm.pollaulima.R.drawable.uruguay),
                contentDescription = "DetalleUruguay",
                modifier = Modifier
                    .clickable {
                        navController.navigate("DetalleUruguay")
                    })
            Column {
                Text(

                    text = "              Uruguay",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = androidx.compose.ui.Modifier
                        .height(32.dp)
                        .clickable {
                            navController.navigate("DetalleUruguay")
                        })
                Text(text = "              Fundado: 1900",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = androidx.compose.ui.Modifier
                        .height(32.dp)
                        .clickable {
                            navController.navigate("DetalleUruguay")
                        })
            }
        }
        Divider(
            modifier = androidx.compose.ui.Modifier
                .fillMaxWidth()
                .height(4.dp)
                .background(color = Color.Black)
        )
        Row {
            Image(painter = painterResource(pe.edu.ulima.pm.pollaulima.R.drawable.alemania),
                contentDescription = "DetalleAlemania",
                modifier = Modifier
                    .clickable {
                        navController.navigate("DetalleAlemania")
                    })
            Column {
                Text(

                    text = "              Germany",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = androidx.compose.ui.Modifier
                        .height(32.dp)
                        .clickable {
                            navController.navigate("DetalleAlemania")
                        })
                Text(text = "              Fundado: 1900",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = androidx.compose.ui.Modifier
                        .height(32.dp)
                        .clickable {
                            navController.navigate("DetalleAlemania")
                        })
            }
        }
        Divider(
            modifier = androidx.compose.ui.Modifier
                .fillMaxWidth()
                .height(4.dp)
                .background(color = Color.Black)
        )
        Row {
            Image(painter = painterResource(pe.edu.ulima.pm.pollaulima.R.drawable.espana),
                contentDescription = "DetalleEspana",
                modifier = Modifier
                    .clickable {
                        navController.navigate("DetalleEspana")
                    })
            Column {
                Text(

                    text = "              Spain",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = androidx.compose.ui.Modifier
                        .height(32.dp)
                        .clickable {
                            navController.navigate("DetalleEspana")
                        })
                Text(text = "              Fundado: 1909",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = androidx.compose.ui.Modifier
                        .height(32.dp)
                        .clickable {
                            navController.navigate("DetalleEspana")
                        })}}
        Divider(
            modifier = androidx.compose.ui.Modifier
                .fillMaxWidth()
                .height(4.dp)
                .background(color = Color.Black)
        )
        Row {
            Image(painter = painterResource(pe.edu.ulima.pm.pollaulima.R.drawable.argentina),
                contentDescription = "DetalleArgentina",
                modifier = Modifier
                    .clickable {
                        navController.navigate("DetalleArgentina")
                    })
            Column {
                Text(
                    text = "              Argentina",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = androidx.compose.ui.Modifier
                        .height(32.dp)
                        .clickable {
                            navController.navigate("DetalleArgentina")
                        })
                Text(text = "              Fundado: 1893",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = androidx.compose.ui.Modifier
                        .height(32.dp)
                        .clickable {
                            navController.navigate("DetalleArgentina")
                        })
            }
        }
        Divider(
            modifier = androidx.compose.ui.Modifier
                .fillMaxWidth()
                .height(4.dp)
                .background(color = Color.Black)
        )
        Row {
            Image(painter = painterResource(pe.edu.ulima.pm.pollaulima.R.drawable.ghana),
                contentDescription = "DetalleGhana",
                modifier = Modifier
                    .clickable {
                        navController.navigate("DetalleGhana")
                    })
            Column {
                Text(
                    text = "              Ghana",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = androidx.compose.ui.Modifier
                        .height(32.dp)
                        .clickable {
                            navController.navigate("DetalleGhana")
                        })
                Text(text = "              Fundado: 1957",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = androidx.compose.ui.Modifier
                        .height(32.dp)
                        .clickable {
                            navController.navigate("DetalleGhana")
                        })}
        }
        Divider(
            modifier = androidx.compose.ui.Modifier
                .fillMaxWidth()
                .height(4.dp)
                .background(color = Color.Black)
        )
        Row {
            Image(painter = painterResource(pe.edu.ulima.pm.pollaulima.R.drawable.brasil),
                contentDescription = "DetalleBrazil",
                modifier = Modifier
                    .clickable {
                        navController.navigate("DetalleBrazil")
                    })
            Column {
                Text(

                    text = "              Brazil",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = androidx.compose.ui.Modifier
                        .height(32.dp)
                        .clickable {
                            navController.navigate("DetalleBrazil")
                        })


                Text(text = "              Fundado: 1914",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = androidx.compose.ui.Modifier
                        .height(32.dp)
                        .clickable {
                            navController.navigate("DetalleBrazil")
                        })
            }
        }
        Divider(
            modifier = androidx.compose.ui.Modifier
                .fillMaxWidth()
                .height(4.dp)
                .background(color = Color.Black)
        )
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
}}}