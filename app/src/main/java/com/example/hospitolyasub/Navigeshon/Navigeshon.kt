package com.example.hospitolyasub.Navigeshon

import android.os.Build
import androidx.activity.ComponentActivity
import androidx.annotation.RequiresApi
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.hospitolyasub.Avtoritheatsia.Animatsia
import com.example.hospitolyasub.Avtoritheatsia.Informatsia_Hospitol
import com.example.hospitolyasub.Avtoritheatsia.Registratsia_TextFilde
import com.example.hospitolyasub.LoginScreen
import com.example.hospitolyasub.MenObsulug.Doctor
import com.example.hospitolyasub.MenObsulug.DoctorHospitol.Akramov_Aziz
import com.example.hospitolyasub.MenObsulug.MenyHospitil
import com.google.firebase.auth.FirebaseAuth


@RequiresApi(Build.VERSION_CODES.N)
@Composable
fun Navigeshon() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.Animatsia.route) {
        composable(route = Screen.Animatsia.route){
            Animatsia(navController = navController)
        }
        composable(route = Screen.LoginScreen.route){
            LoginScreen(auth = FirebaseAuth.getInstance() , navController = navController)
        }
        composable(route = Screen.Registratsia_TextFilde.route){
            Registratsia_TextFilde(context = ComponentActivity(), navController = navController)
        }
        composable(route = Screen.MenyHospitil.route){
            MenyHospitil(navController = navController)
        }
        composable(route = Screen.Doctor.route){
            Doctor(navController = navController)
        }
        composable(route = Screen.Akramov_Aziz.route){
            Akramov_Aziz(navController = navController)
        }
        composable(route = Screen.Informatsia_Hospitol.route){
            Informatsia_Hospitol(navController = navController)
        }
//        composable(route = Screen.ChatMain.route){
//
//        }







    }
}
