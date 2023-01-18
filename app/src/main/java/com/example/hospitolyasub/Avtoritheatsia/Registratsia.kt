package com.example.hospitolyasub.Avtoritheatsia

import android.util.Log
import androidx.activity.ComponentActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import com.example.hospitolyasub.R
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase


@Composable
fun Registratsia_TextFilde(context: ComponentActivity, navController: NavController) {
    val auth = Firebase.auth
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(8.dp),
        verticalArrangement = Arrangement.spacedBy(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Column(modifier = Modifier.padding(top = 20.dp)) {
            Text(modifier = Modifier.padding(start = 17.dp),
                text = "Лечебно диагностический",
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold)
            Row(modifier = Modifier) {
                Text(modifier = Modifier.padding(start = 90.dp),
                    text = " центр ",
                    fontSize = 25.sp,
                    fontWeight = FontWeight.Bold)
                Text(modifier = Modifier,
                    text = "'Яъсуб'",
                    fontSize = 25.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Red)

            }

            Image(
                painter = painterResource(id = R.drawable.regis_yasub),
                contentDescription = "Yasub Logo",
                modifier = Modifier
                    .height(200.dp)
                    .width(450.dp)
            )
        }


        val emailValue = remember { mutableStateOf(TextFieldValue()) }
        val passwordValue = remember { mutableStateOf(TextFieldValue()) }

        OutlinedTextField(
            label = {
                Text("Email")
            },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
            value = emailValue.value,
            singleLine = true,
            modifier = Modifier.fillMaxWidth(),
            onValueChange = {
                emailValue.value = it
            })
        OutlinedTextField(
            label = {
                Text("Password")
            },
            singleLine = true,
            visualTransformation = PasswordVisualTransformation(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            value = passwordValue.value,
            modifier = Modifier.fillMaxWidth(),
            onValueChange = {
                passwordValue.value = it
            })
        //   Spacer(modifier = Modifier.padding(8.dp))
        Card(
            shape = RoundedCornerShape(20.dp),
            elevation = 15.dp) {
            Button(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp),

                onClick = {
                    auth.createUserWithEmailAndPassword(
                        emailValue.value.text.trim(),
                        passwordValue.value.text.trim()
                    )
                        .addOnCompleteListener(context) { task ->
                            if (task.isSuccessful) {
                                Log.d("AUTH", "Success!")
                            } else {
                                Log.d("Auth", "Failed: ${task.exception}")
                            }
                        }
                },
                colors = ButtonDefaults.buttonColors(backgroundColor = Color.Black,
                    contentColor = Color.White),
                elevation = ButtonDefaults.elevation(
                    defaultElevation = 10.dp,
                    pressedElevation = 10.dp,
                    disabledElevation = 10.dp)
            ) {
                Text(text = "Register", fontSize = 20.sp)

            }

        }
    }
}