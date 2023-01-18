package com.example.hospitolyasub


import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.util.Patterns
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.annotation.RequiresApi
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusDirection
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.*
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.lifecycleScope
import androidx.navigation.NavController
import com.example.hospitolyasub.MainActivity.Companion.TAG
import com.example.hospitolyasub.Navigeshon.Navigeshon
import com.example.hospitolyasub.Navigeshon.Screen
import com.example.hospitolyasub.ui.theme.HospitolYasubTheme
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class MainActivity : ComponentActivity() {

    //private val viewModel: LoginViewModel by viewModels()


    companion object {
        val TAG: String = MainActivity::class.java.simpleName
    }

    private val auth by lazy {
        Firebase.auth
    }


    @RequiresApi(Build.VERSION_CODES.N)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HospitolYasubTheme {
               Navigeshon()

                }
            }
        }
    }


@Composable
fun LoginScreen(auth: FirebaseAuth, navController: NavController) {

    val focusManager = LocalFocusManager.current

    var email by remember {
        mutableStateOf("")
    }

    var password by remember {
        mutableStateOf("")
    }

    val isEmailValid by derivedStateOf {
        Patterns.EMAIL_ADDRESS.matcher(email).matches()
    }

    val isPasswordValid by derivedStateOf {
        password.length > 7
    }

    var isPasswordVisible by remember {
        mutableStateOf(false)
    }
    Column(
        modifier = Modifier
            .background(color = Color.LightGray)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {
        Text(
            text ="Добро пожаловать !",
            fontFamily = FontFamily.SansSerif,
            fontWeight = FontWeight.Bold,
            fontStyle = FontStyle.Italic,
            fontSize = 32.sp,
            modifier = Modifier.padding(top = 16.dp)

        )

        Image(
            painter = painterResource(id = R.drawable.yasub ),
            contentDescription = "Yasub Logo",
            modifier = Modifier
                .size(150.dp)
                .height(70.dp)
                .width(40.dp)
                .clickable { navController.navigate(Screen.Informatsia_Hospitol.route) }
        )

        Text(
            text ="Информация о клинике...",
            fontFamily = FontFamily.SansSerif,
            fontWeight = FontWeight.Bold,
            fontStyle = FontStyle.Italic,
            fontSize = 20.sp,
            modifier = Modifier.padding(bottom = 16.dp)
        )

        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 8.dp),
            shape = RoundedCornerShape(16.dp),
            border = BorderStroke(1.dp, Color.Black)
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(8.dp),
                modifier = Modifier.padding(all = 10.dp)
            ){
                OutlinedTextField(value = email, onValueChange ={ email = it},
                    label = { Text("Email Address") },
                    placeholder = { Text("abc@gmail.com") },
                    singleLine = true,
                    modifier = Modifier.fillMaxWidth(),
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Email,
                        imeAction = ImeAction.Next
                    ),
                    keyboardActions = KeyboardActions(
                        onNext = { focusManager.moveFocus(FocusDirection.Down)}
                    ),
                    isError = !isEmailValid,
                    trailingIcon = {
                        if (email.isNotBlank()) {
                            IconButton(onClick = { email = "" }) {
                                Icon(imageVector = Icons.Filled.Clear , contentDescription ="Cler email" )
                            }
                        }
                    }
                )
                OutlinedTextField(value = password,
                    onValueChange ={ password = it},
                    label = { Text("Password") },
                    singleLine = true,
                    modifier = Modifier.fillMaxWidth(),
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Password,
                        imeAction = ImeAction.Done
                    ),
                    keyboardActions = KeyboardActions(
                        onDone = { focusManager.clearFocus()}
                    ),
                    isError = !isPasswordValid,
                    trailingIcon = {
                        IconButton(onClick = {isPasswordVisible = !isPasswordVisible}) {
                            Icon(imageVector = if (isPasswordVisible) Icons.Default.Visibility else Icons.Default.VisibilityOff,
                                contentDescription = "Toggle password visibility")

                        }
                    },visualTransformation = if (isPasswordVisible) VisualTransformation.None else PasswordVisualTransformation()
                )

                Button(onClick = {
                    auth.signInWithEmailAndPassword(email, password)
                        .addOnCompleteListener {

                            if (it.isSuccessful){
                                Log.d(TAG,"The user Акаунт сушествуют")
                                navController.navigate(Screen.MenyHospitil.route)
                            }else{
                                Log.w(TAG,"The user Нету Такого аккунта",it.exception)
                            }
                        }
                },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(45.dp),
                    //
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color.Red),
                    enabled = isEmailValid && isPasswordValid) {
                    Text(text = "Войти",
                        fontWeight = FontWeight.Bold,
                        color = Color.Black,
                        fontSize = 16.sp)
                }
            }
        }

        Row(horizontalArrangement = Arrangement.End,
            modifier = Modifier.fillMaxWidth()
        ){
            TextButton(onClick = { /*TODO*/ }) {
                Text(
                    color = Color.Black,
                    fontStyle = FontStyle.Italic,
                    text = "Забыли пароль ?",
                    modifier = Modifier.padding(end = 8.dp)
                )
            }
        }
        Button(
            onClick = {
                navController.navigate(Screen.Registratsia_TextFilde.route)


            },
            enabled = true,
            modifier = Modifier
                .fillMaxWidth()
                .width(40.dp)
                .padding(top = 180.dp, start = 10.dp, end = 10.dp),
            colors = ButtonDefaults.buttonColors(backgroundColor = Color.White)
        ){
            Text(
                text = "Регистрация...",
                fontWeight = FontWeight.Bold,
                color = Color.Black,
                fontSize = 16.sp,


                )


        }
    }
}

//         //////  Test//////
//@Composable
//fun ChatMain() {
//
//    var username by remember {
//        mutableStateOf(TextFieldValue(""))
//    }
//
//    var showProgress: Boolean by remember {
//        mutableStateOf(false)
//    }
//
//    viewModel.loadingState.observe(this, Observer { uiLoadingState ->
//        showProgress = when (uiLoadingState) {
//            is LoginViewModel.UiLoadingState.Loading -> {
//                true
//            }
//
//            is LoginViewModel.UiLoadingState.NotLoading -> {
//                false
//            }
//        }
//    })
//
//    ConstraintLayout(modifier = Modifier
//        .fillMaxSize()
//        .padding(start = 35.dp, end = 35.dp)
//    ) {
//
//        val (
//            logo, usernameTextField, btnLoginAsUser, btnLoginAsGuest, progressBar,
//        ) = createRefs()
//
//        Image(
//            painter = painterResource(id = R.drawable.chat_logo),
//            contentDescription = "Logo",
//            modifier = Modifier
//                .height(120.dp)
//                .width(120.dp)
//                .constrainAs(logo) {
//                    start.linkTo(parent.start)
//                    end.linkTo(parent.end)
//                    top.linkTo(parent.top, margin = 100.dp)
//                }
//        )
//
//        OutlinedTextField(
//            value = username,
//            onValueChange = { newValue -> username = newValue },
//            label = { Text(text = "Enter Username") },
//            modifier = Modifier
//                .fillMaxWidth()
//                .constrainAs(usernameTextField) {
//                    start.linkTo(parent.start)
//                    end.linkTo(parent.end)
//                    top.linkTo(logo.bottom, margin = 32.dp)
//                },
//            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
//        )
//
//        Button(
//            onClick = {
//                viewModel.loginUser(username.text, getString(R.string.jwt_token))
//            },
//            modifier = Modifier
//                .fillMaxWidth()
//                .constrainAs(btnLoginAsUser) {
//                    start.linkTo(parent.start)
//                    end.linkTo(parent.end)
//                    top.linkTo(usernameTextField.bottom, margin = 16.dp)
//                }
//        ) {
//            Text(text = "Login as User")
//
//        }
//
//        Button(
//            onClick = {
//                viewModel.loginUser(username.text)
//            },
//            modifier = Modifier
//                .fillMaxWidth()
//                .constrainAs(btnLoginAsGuest) {
//                    start.linkTo(parent.start)
//                    end.linkTo(parent.end)
//                    top.linkTo(btnLoginAsUser.bottom, margin = 8.dp)
//                }
//        ) {
//            Text(text = "Login as Guest")
//
//        }
//
//        if (showProgress) {
//            CircularProgressIndicator(
//                modifier = Modifier.constrainAs(progressBar) {
//                    start.linkTo(parent.start)
//                    end.linkTo(parent.end)
//                    top.linkTo(btnLoginAsGuest.bottom, margin = 16.dp)
//                }
//            )
//        }
//    }
//}
//
//fun subscribeToEvents() {
//
//    lifecycleScope.launchWhenStarted {
//
//        viewModel.loginEvent.collect { event ->
//
//            when (event) {
//                is LoginViewModel.LogInEvent.ErrorInputTooShort -> {
//                    showToast("Invalid! Enter more than 3 characters.")
//                }
//
//                is LoginViewModel.LogInEvent.ErrorLogIn -> {
//                    val errorMessage = event.error
//                    showToast("Error: $errorMessage")
//                }
//
//                is LoginViewModel.LogInEvent.Success -> {
//                    showToast("Login Successful!")
//                    startActivity(Intent(this@MainActivity, ChannelListActivity::class.java))
//                    finish()
//                }
//            }
//        }
//    }
//}
//
//private fun showToast(msg: String) {
//    Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
//}
//}
