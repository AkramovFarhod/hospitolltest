package com.example.hospitolyasub.Navigeshon

sealed class Screen(val route: String){
    object LoginScreen : Screen("LoginScreen_screen")
    object Registratsia_TextFilde : Screen("Registratsia_TextFilde_screen")
    object Animatsia : Screen("Animatsia_screen")
    object Akramov_Aziz : Screen("Akramov_Aziz_screen")
    object Doctor : Screen("Doctor_screen")
    object MenyHospitil : Screen("MenyHospitil_screen")
    object Kalendar : Screen("Kalendar_screen")
    object Informatsia_Hospitol : Screen("Informatsia_Hospitol_screen")
    object ChatMain : Screen("ChatMain_screen")
    object Lood : Screen("Lood_screen")



}
