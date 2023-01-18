package com.example.hospitolyasub.MenObsulug

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Card
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Chat
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.hospitolyasub.Navigeshon.Screen


@Composable
fun MenyHospitil(navController: NavController) {
    val scrollState = rememberScrollState()

    Column(modifier = Modifier
        .verticalScroll(scrollState)
        .fillMaxSize()
        .padding(start = 15.dp, end = 15.dp, bottom = 30.dp, top = 15.dp),
        verticalArrangement = Arrangement.spacedBy(13.dp),
        horizontalAlignment = Alignment.CenterHorizontally) {

        Row(modifier = Modifier.padding(start = 1.dp)) {
            Icon(Icons.Filled.KeyboardArrowLeft, contentDescription = "", tint = Color.Blue)
            Text(text = "Назад", modifier = Modifier
                .fillMaxWidth(1f)
                //  .clickable { navController.navigate(Screen.Avtorizatsia.route) }, color = Color.Blue,
            )
            //  Button(modifier = Modifier.height(20.dp).width(40.dp).background(Color.Black), onClick = { navController.navigate(Screen.ChatMain.route) }) {
            //}


        }

        val contextForToast = LocalContext.current.applicationContext

        Box(modifier = Modifier.fillMaxSize()) {

            FloatingActionButton(
                modifier = Modifier
                    //.padding(all = 16.dp)
                    .align(alignment = Alignment.BottomEnd),
                onClick = {
                    navController.navigate(Screen.Lood.route)
                    Toast.makeText(contextForToast, "Click", Toast.LENGTH_SHORT)
                        .show()
                }) {
                Icon(imageVector = Icons.Filled.Chat, contentDescription = "Add")
            }
        }



        Text(text = "Меню обслуживания", fontSize = 25.sp)

        val GradientColors = listOf(Color.White, Color.White, Color.White)
        Card(modifier = Modifier
            .fillMaxHeight()
            .padding(1.dp), shape = RoundedCornerShape(20.dp), elevation = 15.dp) {
            Box(Modifier
                .height(130.dp)
                .width(360.dp)
                .clip(RoundedCornerShape(15.dp))
                .background(
                    brush = Brush.linearGradient(
                        colors = GradientColors))
                .clickable { navController.navigate(Screen.Doctor.route) }
            ) {
                Text(text = "Терапевт",
                    modifier = Modifier
                        .fillMaxWidth(1f)
                        .padding(20.dp),
                    fontSize = 34.sp,
                    textAlign = TextAlign.Center,
                    color = Color.Black)
            }
        }
        Card(modifier = Modifier
            .fillMaxHeight()
            .padding(1.dp),shape = RoundedCornerShape(20.dp), elevation = 15.dp) {
            Box(
                Modifier
                    .height(130.dp)
                    .width(360.dp)
                    .clip(RoundedCornerShape(15.dp))
                    .background(
                        brush = Brush.linearGradient(
                            colors = GradientColors))
                //.clickable { navController.navigate(Screen.PersonPeople.route) }

            ) {
                Text(text = "Кардиолог",
                    modifier = Modifier
                        .fillMaxWidth(1f)
                        .padding(20.dp),
                    fontSize = 34.sp,
                    textAlign = TextAlign.Center,
                    color = Color.Black)
            }
        }
        Card(modifier = Modifier
            .fillMaxHeight()
            .padding(1.dp),shape = RoundedCornerShape(20.dp), elevation = 15.dp) {
            Box(Modifier
                .height(130.dp)
                .width(360.dp)
                .clip(RoundedCornerShape(15.dp))
                .background(
                    brush = Brush.linearGradient(
                        colors = GradientColors))
                //.clickable { navController.navigate(Screen.Avtorizatsia.route) }
            ) {
                Text(text = "Лор",
                    modifier = Modifier
                        .fillMaxWidth(1f)
                        .padding(20.dp),
                    fontSize = 34.sp,
                    textAlign = TextAlign.Center,
                    color = Color.Black)
            }
        }

        Card(modifier = Modifier
            .fillMaxHeight()
            .padding(1.dp),shape = RoundedCornerShape(20.dp), elevation = 15.dp) {
            Box(Modifier
                .height(130.dp)
                .width(360.dp)
                .clip(RoundedCornerShape(15.dp))
                .background(
                    brush = Brush.linearGradient(
                        colors = GradientColors))
                //    .clickable { navController.navigate(Screen.Avtorizatsia.route) }
            ) {
                Text(text = "Нервопотолог",
                    modifier = Modifier
                        .fillMaxWidth(1f)
                        .padding(20.dp),
                    fontSize = 34.sp,
                    textAlign = TextAlign.Center,
                    color = Color.Black)
            }
        }

        Card(modifier = Modifier
            .fillMaxHeight()
            .padding(1.dp),shape = RoundedCornerShape(20.dp), elevation = 15.dp) {
            Box(Modifier
                .height(130.dp)
                .width(360.dp)
                .clip(RoundedCornerShape(15.dp))
                .background(
                    brush = Brush.linearGradient(
                        colors = GradientColors))
                //  .clickable { navController.navigate(Screen.Avtorizatsia.route) }
            ) {
                Text(text = "УЗИ",
                    modifier = Modifier
                        .fillMaxWidth(1f)
                        .padding(20.dp),
                    fontSize = 34.sp,
                    textAlign = TextAlign.Center,
                    color = Color.Black)
            }
        }
        Card(modifier = Modifier
            .fillMaxHeight()
            .padding(1.dp),shape = RoundedCornerShape(20.dp), elevation = 15.dp) {
            Box(Modifier
                .height(130.dp)
                .width(360.dp)
                .clip(RoundedCornerShape(15.dp))
                .background(
                    brush = Brush.linearGradient(
                        colors = GradientColors))
                //.clickable { navController.navigate(Screen.Avtorizatsia.route) }
            ) {
                Text(text = "Уролог",
                    modifier = Modifier
                        .fillMaxWidth(1f)
                        .padding(20.dp),
                    fontSize = 34.sp,
                    textAlign = TextAlign.Center,
                    color = Color.Black)
            }
        }

        Card(modifier = Modifier
            .fillMaxHeight()
            .padding(1.dp),shape = RoundedCornerShape(20.dp), elevation = 15.dp) {
            Box(Modifier
                .height(130.dp)
                .width(360.dp)
                .clip(RoundedCornerShape(15.dp))
                .background(
                    brush = Brush.linearGradient(
                        colors = GradientColors))
                // .clickable { navController.navigate(Screen.Avtorizatsia.route) }
            ) {
                Text(text = "Коженный",
                    modifier = Modifier
                        .fillMaxWidth(1f)
                        .padding(20.dp),
                    fontSize = 34.sp,
                    textAlign = TextAlign.Center,
                    color = Color.Black)
            }
        }

        Card(modifier = Modifier
            .fillMaxHeight()
            .padding(1.dp),shape = RoundedCornerShape(20.dp), elevation = 15.dp) {
            Box(Modifier
                .height(130.dp)
                .width(360.dp)
                .clip(RoundedCornerShape(15.dp))
                .background(
                    brush = Brush.linearGradient(
                        colors = GradientColors))
                //.clickable { navController.navigate(Screen.Avtorizatsia.route) }
            ) {
                Text(text = "Глазной",
                    modifier = Modifier
                        .fillMaxWidth(1f)
                        .padding(20.dp),
                    fontSize = 34.sp,
                    textAlign = TextAlign.Center,
                    color = Color.Black)
            }
        }
    }
}