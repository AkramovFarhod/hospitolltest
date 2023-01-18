package com.example.hospitolyasub.MenObsulug.DoctorHospitol

import android.app.DatePickerDialog
import android.icu.util.Calendar
import android.os.Build
import android.widget.DatePicker
import androidx.annotation.RequiresApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import com.example.hospitolyasub.R
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import java.util.*


@RequiresApi(Build.VERSION_CODES.N)
@Composable
fun Akramov_Aziz(navController: NavController) {
    Column( modifier = Modifier
        .fillMaxSize()
        // .background(Color.White),
        .padding(start = 2.dp, end = 2.dp),
        horizontalAlignment = Alignment.CenterHorizontally)
    {
        Image(painter = painterResource(id = R.drawable.vrach),
            contentDescription = "",
            modifier = Modifier
                .width(400.dp)
                .height(250.dp)
                //.padding(start = 10.dp, end = 10.dp)
                .clip(shape = RoundedCornerShape(25.dp))
        )
        Column(modifier = Modifier.padding(top = 1.dp), verticalArrangement = Arrangement.spacedBy(5.dp),horizontalAlignment = Alignment.CenterHorizontally) {
            Text(modifier = Modifier.padding(2.dp), text = "Речаи кори", fontSize = 29.sp, fontWeight = FontWeight.Bold)
            Card(modifier = Modifier.padding(1.dp),shape = RoundedCornerShape(20.dp), elevation = 15.dp) {
                Box(modifier = Modifier
                    .width(350.dp)
                    .height(55.dp))
                //.background(Color.Gray))
                {
                    Text(text = "Душанбе  8:00 то 20:00.", modifier = Modifier.fillMaxWidth(1f) ,  fontSize=22.sp, textAlign = TextAlign.Center)
                }
            }
            Card(modifier = Modifier.padding(1.dp),shape = RoundedCornerShape(20.dp), elevation = 15.dp) {
                Box(modifier = Modifier
                    .width(350.dp)
                    .height(55.dp))
                //.background(Color.Gray))
                {
                    Text(text = "Сешанбе  12:00 то 21:00.", modifier = Modifier.fillMaxWidth(1f) ,  fontSize=22.sp, textAlign = TextAlign.Center)
                }
            }
            Card(modifier = Modifier.padding(1.dp),shape = RoundedCornerShape(20.dp), elevation = 15.dp) {
                Box(modifier = Modifier
                    .width(350.dp)
                    .height(55.dp))
                //.background(Color.Gray))
                {
                    Text(text = "Чоршанбе  7:00 то 17:00.", modifier = Modifier.fillMaxWidth(1f) ,  fontSize=22.sp, textAlign = TextAlign.Center)
                }
            }
            Card(modifier = Modifier.padding(1.dp),shape = RoundedCornerShape(20.dp), elevation = 15.dp) {
                Box(modifier = Modifier
                    .width(350.dp)
                    .height(55.dp))
                //.background(Color.Gray))
                {
                    Text(text = "Панчшанбе  6:00 то 12:00.", modifier = Modifier.fillMaxWidth(1f) ,  fontSize=22.sp, textAlign = TextAlign.Center)
                }
            }
            Card(modifier = Modifier.padding(1.dp),shape = RoundedCornerShape(20.dp), elevation = 15.dp) {
                Box(modifier = Modifier
                    .width(350.dp)
                    .height(55.dp))
                //.background(Color.Gray))
                {
                    Text(text = "Чумъа  9:30 то 15:50.", modifier = Modifier.fillMaxWidth(1f) ,  fontSize=22.sp, textAlign = TextAlign.Center)
                }
            }
            Card(modifier = Modifier.padding(1.dp, bottom = 10.dp),shape = RoundedCornerShape(20.dp), elevation = 15.dp) {
                Box(modifier = Modifier
                    .width(350.dp)
                    .height(55.dp))
                //.background(Color.Gray))
                {
                    Text(text = "Шанбе  13:00 то 18:00.", modifier = Modifier.fillMaxWidth(1f) ,  fontSize=22.sp, textAlign = TextAlign.Center)
                }
            }

        }
//  Kalendar
        val mContext = LocalContext.current

        val mYear: Int
        val mMonth: Int
        val mDay: Int

        val mCalendar = Calendar.getInstance()

        mYear = mCalendar.get(Calendar.YEAR)
        mMonth = mCalendar.get(Calendar.MONTH)
        mDay = mCalendar.get(Calendar.DAY_OF_MONTH)


        mCalendar.time = Date()


        val mDate = remember { mutableStateOf("") }

        val mDatePickerDialog = DatePickerDialog(
            mContext,
            { _: DatePicker, mYear: Int, mMonth: Int, mDayOfMonth: Int ->
                mDate.value = "$mDayOfMonth/${mMonth + 1}/$mYear"
            }, mYear, mMonth, mDay
        )


        Scaffold(
            floatingActionButton = {
                FloatingActionButton(

                    onClick = { mDatePickerDialog.show()}) {
                    Icon(Icons.Filled.Add, contentDescription = "Добавить")
                    /* FAB content */
                }
            },
            isFloatingActionButtonDocked = true,
            bottomBar = {
                BottomAppBar(

                    // Defaults to null, that is, No cutout
                    cutoutShape = MaterialTheme.shapes.small.copy(
                        CornerSize(percent = 50)
                    )
                ) {
                    /* Bottom app bar content */
                }
            }
        ) {
            // Screen content
        }

    }
}