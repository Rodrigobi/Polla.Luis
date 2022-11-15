package pe.edu.ulima.pm.pollaulima.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
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
fun Polla() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = "Polla"){
        composable(route = "Polla"){
            MainPolla(navController = navController)
        }


        composable("Paises") {
            Paises()
        }
    }
}

@Composable
fun MainPolla(navController: NavController) {
    var number1 by remember {
        mutableStateOf("")
    }
    var number2 by remember {
        mutableStateOf("")
    }
    var number3 by remember {
        mutableStateOf("")
    }
    var number4 by remember {
        mutableStateOf("")
    }
    var number5 by remember {
        mutableStateOf("")
    }
    var number6 by remember {
        mutableStateOf("")
    }
    var number7 by remember {
        mutableStateOf("")
    }
    Column(
        verticalArrangement = Arrangement.aligned(alignment = Alignment.Top),
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {

        Text(
            modifier = Modifier.align(Alignment.CenterHorizontally),
            text = "Polla",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )
        //Espaciador
        Spacer(modifier = Modifier.height(80.dp))
        Divider(
            modifier = Modifier
                .fillMaxWidth()
                .height(4.dp)
                .background(color = Color.Black)
        )
        Row {
            Text(
                text = "              Qatar   VS    Ecuador                    ",
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .height(32.dp))
            TextField(
                value = number1, onValueChange = {
                    number1 = it
                },
                modifier = Modifier.width(70.dp)
            )
        }
        Divider(
            modifier = Modifier
                .fillMaxWidth()
                .height(4.dp)
                .background(color = Color.Black)
        )
        Row {
            Text(
                text = "              England   VS    Iran                       ",
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .height(32.dp))
            TextField(
                value = number2, onValueChange = {
                    number2 = it
                },
                modifier = Modifier.width(70.dp)
            )
        }
        Divider(
            modifier = Modifier
                .fillMaxWidth()
                .height(4.dp)
                .background(color = Color.Black)
        )
        Row {
            Text(
                text = "              Senegalar   VS    Netherlands    ",
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .height(32.dp))
            TextField(
                value = number3, onValueChange = {
                    number3 = it
                },
                modifier = Modifier.width(70.dp)
            )
        }
        Divider(
            modifier = Modifier
                .fillMaxWidth()
                .height(4.dp)
                .background(color = Color.Black)
        )
        Row {
            Text(
                text = "              USA   VS    Wales                          ",
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .height(32.dp))
            TextField(
                value = number4, onValueChange = {
                    number4 = it
                },
                modifier = Modifier.width(70.dp)
            )
        }
        Divider(
            modifier = Modifier
                .fillMaxWidth()
                .height(4.dp)
                .background(color = Color.Black)
        )
        Row {
            Text(
                text = "              Argentina   VS    Saudi Arabia    ",
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .height(32.dp))
            TextField(
                value = number5, onValueChange = {
                    number5 = it
                },
                modifier = Modifier.width(70.dp)
            )
        }
        Divider(
            modifier = Modifier
                .fillMaxWidth()
                .height(4.dp)
                .background(color = Color.Black)
        )
        Row {
            Text(
                text = "              Denamark   VS    Tunisia             ",
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .height(32.dp))
            TextField(
                value = number6, onValueChange = {
                    number6 = it
                },
                modifier = Modifier.width(70.dp)
            )
        }
        Divider(
            modifier = Modifier
                .fillMaxWidth()
                .height(4.dp)
                .background(color = Color.Black)
        )
        Row {
            Text(
                text = "              Qatar   VS    Ecuador                    ",
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .height(32.dp))
            TextField(
                value = number7, onValueChange = {
                    number7 = it
                },
                modifier = Modifier.width(70.dp)
            )
        }
        Divider(
            modifier = Modifier
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
        }
    }
}