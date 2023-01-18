package com.example.hospitolyasub.MenObsulug

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import com.example.hospitolyasub.R
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.hospitolyasub.Navigeshon.Screen


@Composable
fun Doctor(navController: NavController) {
    val scrollState = rememberScrollState()
    Column(modifier = Modifier
        .verticalScroll(scrollState)
        .fillMaxSize()
        .padding(start = 15.dp, end = 15.dp, bottom = 30.dp, top = 15.dp), verticalArrangement = Arrangement.spacedBy(13.dp),
        horizontalAlignment = Alignment.CenterHorizontally) {

        Row(modifier = Modifier.padding(start = 1.dp)) {
            Icon(Icons.Filled.KeyboardArrowLeft, contentDescription = "", tint = Color.Blue)
            Text(text = "Назад", modifier = Modifier
                .fillMaxWidth(1f)
                .clickable {
                    navController.navigate(Screen.MenyHospitil.route)
                }, color = Color.Blue, )
        }


        Text(text = "Доктор", fontSize = 25.sp)


        Box(Modifier
            .height(100.dp)
            .width(360.dp)
            .clip(RoundedCornerShape(30.dp))
            .background(Color.LightGray)
            .clickable { navController.navigate(Screen.Akramov_Aziz.route) }
        ){
            Row() {
                Image(painter = painterResource(id = R.drawable.doctor1),
                    contentDescription ="Person",
                    modifier = Modifier
                        .padding(1.dp)
                        .size(100.dp)
                        .clip(CircleShape))
                Column() {
                    Text(modifier = Modifier.padding(start = 6.dp, top = 7.dp), text = "Назаров Дилмурод ", fontSize = 17.sp, fontWeight = FontWeight.Bold,textAlign = TextAlign.Center)
                    //Text(modifier = Modifier.padding(start = 10.dp, top = 7.dp), text = "", fontSize = 17.sp, fontWeight = FontWeight.Bold,)

                }
            }
        }


        Box(Modifier
            .height(100.dp)
            .width(360.dp)
            .clip(RoundedCornerShape(30.dp))
            .background(Color.LightGray)
            //.clickable { navController.navigate(Screen.Avtorizatsia.route) }
        ){
            Row() {
                Image(painter = painterResource(id = R.drawable.doctor1),
                    contentDescription ="Person",
                    modifier = Modifier
                        .padding(1.dp)
                        .size(100.dp)
                        .clip(CircleShape))
                Column() {
                    Text(modifier = Modifier.padding(start = 6.dp, top = 7.dp), text = "Назаров Дилмурод ", fontSize = 17.sp, fontWeight = FontWeight.Bold,textAlign = TextAlign.Center)
                    //Text(modifier = Modifier.padding(start = 10.dp, top = 7.dp), text = "", fontSize = 17.sp, fontWeight = FontWeight.Bold,)

                }
            }
        }

        Box(Modifier
            .height(100.dp)
            .width(360.dp)
            .clip(RoundedCornerShape(30.dp))
            .background(Color.LightGray)
            //  .clickable { navController.navigate(Screen.Avtorizatsia.route) }
        ){
            Row() {
                Image(painter = painterResource(id = R.drawable.doctor1),
                    contentDescription ="Person",
                    modifier = Modifier
                        .padding(1.dp)
                        .size(100.dp)
                        .clip(CircleShape))
                Column() {
                    Text(modifier = Modifier.padding(start = 6.dp, top = 7.dp), text = "Назаров Дилмурод ", fontSize = 17.sp, fontWeight = FontWeight.Bold,textAlign = TextAlign.Center)
                    //Text(modifier = Modifier.padding(start = 10.dp, top = 7.dp), text = "", fontSize = 17.sp, fontWeight = FontWeight.Bold,)

                }
            }
        }

        Box(Modifier
            .height(100.dp)
            .width(360.dp)
            .clip(RoundedCornerShape(30.dp))
            .background(Color.LightGray)
            // .clickable { navController.navigate(Screen.Avtorizatsia.route) }
        ){
            Row() {
                Image(painter = painterResource(id = R.drawable.doctor1),
                    contentDescription ="Person",
                    modifier = Modifier
                        .padding(1.dp)
                        .size(100.dp)
                        .clip(CircleShape))
                Column() {
                    Text(modifier = Modifier.padding(start = 6.dp, top = 7.dp), text = "Назаров Дилмурод ", fontSize = 17.sp, fontWeight = FontWeight.Bold,textAlign = TextAlign.Center)
                    //Text(modifier = Modifier.padding(start = 10.dp, top = 7.dp), text = "", fontSize = 17.sp, fontWeight = FontWeight.Bold,)

                }
            }
        }

        Box(Modifier
            .height(100.dp)
            .width(360.dp)
            .clip(RoundedCornerShape(30.dp))
            .background(Color.LightGray)
            //.clickable { navController.navigate(Screen.Avtorizatsia.route) }
        ){
            Row() {
                Image(painter = painterResource(id = R.drawable.doctor1),
                    contentDescription ="Person",
                    modifier = Modifier
                        .padding(1.dp)
                        .size(100.dp)
                        .clip(CircleShape))
                Column() {
                    Text(modifier = Modifier.padding(start = 6.dp, top = 7.dp), text = "Назаров Дилмурод ", fontSize = 17.sp, fontWeight = FontWeight.Bold,textAlign = TextAlign.Center)
                    //Text(modifier = Modifier.padding(start = 10.dp, top = 7.dp), text = "", fontSize = 17.sp, fontWeight = FontWeight.Bold,)

                }
            }
        }

        Box(Modifier
            .height(100.dp)
            .width(360.dp)
            .clip(RoundedCornerShape(30.dp))
            .background(Color.LightGray)
            // .clickable { navController.navigate(Screen.Avtorizatsia.route) }
        ){
            Row() {
                Image(painter = painterResource(id = R.drawable.doctor1),
                    contentDescription ="Person",
                    modifier = Modifier
                        .padding(1.dp)
                        .size(100.dp)
                        .clip(CircleShape))
                Column() {
                    Text(modifier = Modifier.padding(start = 6.dp, top = 7.dp), text = "Назаров Дилмурод ", fontSize = 17.sp, fontWeight = FontWeight.Bold,textAlign = TextAlign.Center)
                    //Text(modifier = Modifier.padding(start = 10.dp, top = 7.dp), text = "", fontSize = 17.sp, fontWeight = FontWeight.Bold,)

                }
            }
        }

        Box(Modifier
            .height(100.dp)
            .width(360.dp)
            .clip(RoundedCornerShape(30.dp))
            .background(Color.LightGray)
            // .clickable { navController.navigate(Screen.Avtorizatsia.route) }
        ){
            Row() {
                Image(painter = painterResource(id = R.drawable.doctor1),
                    contentDescription ="Person",
                    modifier = Modifier
                        .padding(1.dp)
                        .size(100.dp)
                        .clip(CircleShape))
                Column() {
                    Text(modifier = Modifier.padding(start = 6.dp, top = 7.dp), text = "Назаров Дилмурод ", fontSize = 17.sp, fontWeight = FontWeight.Bold,textAlign = TextAlign.Center)
                    //Text(modifier = Modifier.padding(start = 10.dp, top = 7.dp), text = "", fontSize = 17.sp, fontWeight = FontWeight.Bold,)

                }
            }
        }

        Box(Modifier
            .height(100.dp)
            .width(360.dp)
            .clip(RoundedCornerShape(30.dp))
            .background(Color.LightGray)
            //  .clickable { navController.navigate(Screen.Avtorizatsia.route) }
        ){
            Row() {
                Image(painter = painterResource(id = R.drawable.doctor1),
                    contentDescription ="Person",
                    modifier = Modifier
                        .padding(1.dp)
                        .size(100.dp)
                        .clip(CircleShape))
                Column() {
                    Text(modifier = Modifier.padding(start = 6.dp, top = 7.dp), text = "Назаров Дилмурод ", fontSize = 17.sp, fontWeight = FontWeight.Bold,textAlign = TextAlign.Center)
                    //Text(modifier = Modifier.padding(start = 10.dp, top = 7.dp), text = "", fontSize = 17.sp, fontWeight = FontWeight.Bold,)

                }
            }
        }


    }
}

