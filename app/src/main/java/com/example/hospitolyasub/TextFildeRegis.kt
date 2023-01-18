package com.example.hospitolyasub


//@Composable
//fun ShowForm(context: ComponentActivity) {
//    val auth = Firebase.auth
//
//   // val context = LocalContext.current
//    val focusManager = LocalFocusManager.current
//    val scrollState = rememberScrollState()
//
//    val name = rememberSaveable { mutableStateOf(TextFieldValue()) }
//    val surname = remember { mutableStateOf(TextFieldValue()) }
//    val email = remember { mutableStateOf(TextFieldValue()) }
//    val phone = remember { mutableStateOf(TextFieldValue()) }
//    val password = remember { mutableStateOf(TextFieldValue()) }
//    val confirmPassword = remember { mutableStateOf(TextFieldValue()) }
//
//    var validateName by rememberSaveable { mutableStateOf(true) }
//    var validateSurname by rememberSaveable { mutableStateOf(true) }
//    var validateEmail by rememberSaveable { mutableStateOf(true) }
//    var validatePhone by rememberSaveable { mutableStateOf(true) }
//    var validatePassword by rememberSaveable { mutableStateOf(true) }
//    var validateConfirmPassword by rememberSaveable { mutableStateOf(true) }
//    var validatearePasswordsEqual by rememberSaveable { mutableStateOf(true) }
//    var isPasswordVisible by rememberSaveable { mutableStateOf(false) }
//    var isConfirmPasswordVisible by rememberSaveable { mutableStateOf(false) }
//
//    val validateNameError = "Please, input a valid name"
//    val validateSurnameError = "Please, input a valid surname"
//    val validateEmailError = "The format of the email doesn't seem rifht"
//    val validatePhoneError = "The format of the phone number doesn't seem right"
//    val validatePasswordError = "Must mix capital and non-capital letters, a number, special character and a minimum length of 8 "
//    val validateEqualPasswordError = "Passwords must be equal"
//
//    fun validateData(
//        name: String,
//        surname: String,
//        email: String,
//        phone: String,
//        password: String,
//        confirmPassword: String,
//    ): Boolean {
//        val passwordRegex = "(?=.*\\d)(?=.*[a-z])(?=/*[A-Z])(?=.*[@#\$%^&+=]).{8,}".toRegex()
//
//        validateName = name.isNotBlank()
//        validateSurname = surname.isNotBlank()
//        validateEmail = Patterns.EMAIL_ADDRESS.matcher(email).matches()
//        validatePhone = Patterns.PHONE.matcher(phone).matches()
//        validatePassword = passwordRegex.matches(password)
//        validateConfirmPassword = passwordRegex.matches(confirmPassword)
//        validatearePasswordsEqual = password == confirmPassword
//
//        return validateName && validateSurname && validateEmail && validatePhone && validatePassword && validateConfirmPassword && validatearePasswordsEqual
//        }
//
//    fun register(
//        name: String,
//        surname: String,
//        email: String,
//        phone: String,
//        password: String,
//        confirmPassword: String
//    ) {
//        if (validateData(name, surname,email,phone, password, confirmPassword)){
//            //Add the registration logic here ;)
//            Log.d(MainActivity::class.java.simpleName, "Name: $name, Surname: $surname, Phone: $phone, Password: $password")
//        }else {
//            Toast.makeText(context,"Please, review fields",Toast.LENGTH_SHORT).show()
//        }
//    }
//
//
//    Column(modifier = Modifier
//        .fillMaxSize()
//        .verticalScroll(scrollState),
//        horizontalAlignment = Alignment.CenterHorizontally,
//    verticalArrangement = Arrangement.Top
//    ) {
//        Text(text = "Register to our app",
//            style = MaterialTheme.typography.h5,
//            modifier = Modifier.padding(vertical = 20.dp),
//            color = Color.Blue
//        )
//
//        CustomOutlinedTextField(
//            value = name.value,
//            onValueChange = { name.value = it },
//            label = "Name",
//            showError = !validateName,
//            errorMessage = validateNameError,
//            leadingIconImageVector = Icons.Default.PermIdentity,
//            keyboardOptions = KeyboardOptions(
//                keyboardType = KeyboardType.Text,
//                imeAction = ImeAction.Next
//            ),
//            keyboardActions = KeyboardActions(
//                onNext = { focusManager.moveFocus(FocusDirection.Down) }
//            )
//        )
//        val emailValue = remember { mutableStateOf(TextFieldValue()) }
//        val passwordValue = remember { mutableStateOf(TextFieldValue()) }
//
//        OutlinedTextField(
//            label = {
//                Text("Email")
//            },
//
//            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
//            value = emailValue.value,
//            singleLine = true,
//            modifier = Modifier.fillMaxWidth(),
//            onValueChange = {
//                emailValue.value = it
//            })
//
//        CustomOutlinedTextField(
//            value = surname.value,
//            onValueChange = { surname.value = it },
//            label = "Surname",
//            showError = !validateSurname,
//            errorMessage = validateSurnameError,
//            leadingIconImageVector = Icons.Default.PermIdentity,
//            keyboardOptions = KeyboardOptions(
//                keyboardType = KeyboardType.Text,
//                imeAction = ImeAction.Next
//            ),
//            keyboardActions = KeyboardActions(
//                onNext = { focusManager.moveFocus(FocusDirection.Down) }
//            )
//        )
//
//        CustomOutlinedTextField(
//            value = email.value,
//            onValueChange = { email.value = it },
//            label = "Email Address",
//            showError = !validateEmail,
//            errorMessage = validateEmailError,
//            leadingIconImageVector = Icons.Default.AlternateEmail,
//            keyboardOptions = KeyboardOptions(
//                keyboardType = KeyboardType.Email,
//                imeAction = ImeAction.Next
//            ),
//            keyboardActions = KeyboardActions(
//                onNext = { focusManager.moveFocus(FocusDirection.Down) }
//            )
//        )
//
//
//        CustomOutlinedTextField(
//            value = phone.value,
//            onValueChange = { phone.value = it },
//            label = "Phone Number",
//            showError = !validatePhone,
//            errorMessage = validatePhoneError,
//            leadingIconImageVector = Icons.Default.Phone,
//            keyboardOptions = KeyboardOptions(
//                keyboardType = KeyboardType.Phone,
//                imeAction = ImeAction.Next
//            ),
//            keyboardActions = KeyboardActions(
//                onNext = { focusManager.moveFocus(FocusDirection.Down) }
//            )
//        )
//
//        CustomOutlinedTextField(
//            value = password.value,
//            onValueChange = { password.value = it },
//            label = "Password",
//            showError = !validatePassword,
//            errorMessage = validatePasswordError,
//            isPasswordField = true,
//            isPasswordVisible = isPasswordVisible,
//            onVisibilityChange = { isPasswordVisible = it },
//            leadingIconImageVector = Icons.Default.Password,
//            keyboardOptions = KeyboardOptions(
//                keyboardType = KeyboardType.Text,
//                imeAction = ImeAction.Next
//            ),
//            keyboardActions = KeyboardActions(
//                onNext = { focusManager.moveFocus(FocusDirection.Down) }
//            )
//        )
//        OutlinedTextField(
//            label = {
//                Text("Password")
//            },
//            singleLine = true,
//            visualTransformation = PasswordVisualTransformation(),
//            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
//            value = password.value,
//            modifier = Modifier.fillMaxWidth(),
//            onValueChange = {
//                password.value = it
//            })
//
//        CustomOutlinedTextField(
//            value = confirmPassword.value,
//            onValueChange = { confirmPassword.value = it },
//            label = "Confirm Password",
//            showError = !validateConfirmPassword || !validatearePasswordsEqual,
//            errorMessage = if (!validateConfirmPassword) validatePasswordError else validateEqualPasswordError,
//            isPasswordField = true,
//            isPasswordVisible = isConfirmPasswordVisible,
//            onVisibilityChange = { isConfirmPasswordVisible = it },
//            leadingIconImageVector = Icons.Default.Password,
//            keyboardOptions = KeyboardOptions(
//                keyboardType = KeyboardType.Text,
//                imeAction = ImeAction.Done
//            ),
//            keyboardActions = KeyboardActions(
//                onDone = { focusManager.clearFocus() }
//            )
//        )
//
//        Button(
//            onClick = {
//                auth.createUserWithEmailAndPassword(
//                    email.value.text.trim(),
//                    password.value.text.trim(),
//
//                )
//                    .addOnCompleteListener(context) { task ->
//                        if (task.isSuccessful) {
//                            Log.d("AUTH", "Success!")
//                        } else {
//                            Log.d("Auth", "Failed: ${task.exception}")
//                        }
//                    }
//            },
//            modifier = Modifier
//                .padding(20.dp)
//                .fillMaxWidth(0.9f),
//            colors = ButtonDefaults.buttonColors(backgroundColor = Color.Blue,
//                contentColor = Color.White)
//        ) {
//            Text(text = "Register", fontSize = 20.sp)
//        }
//
//
//
//    }
//}
