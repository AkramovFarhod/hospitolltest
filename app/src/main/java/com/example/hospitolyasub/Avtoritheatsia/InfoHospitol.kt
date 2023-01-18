package com.example.hospitolyasub.Avtoritheatsia

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*

import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.hospitolyasub.Navigeshon.Screen
import com.example.hospitolyasub.R


@Composable
fun Informatsia_Hospitol(navController: NavController) {
    val scrollState = rememberScrollState()
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(1.dp)
            .verticalScroll(scrollState),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(10.dp),

        ) {
        Row(modifier = Modifier.padding(11.dp)) {
            Icon(Icons.Filled.KeyboardArrowLeft, contentDescription = "", tint = Color.Blue)
            Text(text = "Назад", modifier = Modifier.fillMaxWidth(1f).clickable { navController.navigate(
                Screen.Registratsia_TextFilde.route) }, color = Color.Blue, fontSize = 17.sp )
        }
        /////////
        Row(modifier = Modifier.horizontalScroll(rememberScrollState())){
            val scrollState = rememberScrollState()
            Image(painter = painterResource(id = R.drawable.image1),
                contentDescription = "",
                modifier = Modifier
                    .width(360.dp)
                    .height(200.dp)
                    .horizontalScroll(scrollState))
            Image(painter = painterResource(id = R.drawable.image2),
                contentDescription = "",
                modifier = Modifier
                    .width(400.dp)
                    .height(200.dp))
            // .horizontalScroll(scrollState))
            Image(painter = painterResource(id = R.drawable.image3),
                contentDescription = "",
                modifier = Modifier
                    .width(400.dp)
                    .height(200.dp))
            //  .horizontalScroll(scrollState))
            Image(painter = painterResource(id = R.drawable.image4),
                contentDescription = "",
                modifier = Modifier
                    .width(400.dp)
                    .height(200.dp))
            //.horizontalScroll(scrollState))
        }
        Text(text = "О клинике Яъсуб", fontSize = 25.sp, fontWeight = FontWeight.Bold)
        Text(modifier = Modifier.padding(start = 15.dp, end = 5.dp), text = "Наша клиника занимает почетное место среди наиболее прогрессивных клиник Худжанда. Клиника была основана в 2012 году. Мы предоставляем медицинские услуги в соответствии с высокими международными стандартами.", fontSize = 16.sp)
        Text(text ="Наши преимущества", fontSize = 25.sp, fontWeight = FontWeight.Bold)
        Text(text = "Современное оборудование", fontSize = 20.sp, fontWeight = FontWeight.Bold)
        Text(modifier = Modifier.padding(start = 15.dp, end = 5.dp), text = "В нашей клинике используется новейшее медицинское оборудование, имеющее все необходимые сертификаты и лицензии.", fontSize = 16.sp)
        Text(text = "Квалифицированные врачи", fontSize = 20.sp, fontWeight = FontWeight.Bold)
        Text(modifier = Modifier.padding(start = 15.dp, end = 5.dp), text = "Квалифицированные врачи, уютные кабинеты и довольные пациенты: на Днепропетровщине определили лучшие амбулатории.", fontSize = 16.sp)
        Image(painter = painterResource(id = R.drawable.image5),
            contentDescription = "",
            modifier = Modifier
                .width(400.dp)
                .height(200.dp))
        //.horizontalScroll(scrollState))


    }
}
