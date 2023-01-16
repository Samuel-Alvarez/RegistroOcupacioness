package com.example.registroocupaciones.ui.registro.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Close
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.registroocupaciones.ui.theme.RegistroOcupacionesTheme


@Composable
fun RegistroScreen(){
    Box(
        Modifier
            .fillMaxSize()
            .padding(16.dp)) {
        Registro(Modifier.align(Alignment.Center))
    }
}

@Composable
fun Registro(modifier: Modifier) {
    Column(modifier = modifier) {
        Elementos(Modifier.align(Alignment.CenterHorizontally))
        Spacer(modifier = Modifier.padding(16.dp))
        DescripcionField()
        Spacer(modifier = Modifier.padding(4.dp))
        SalarioField()
        Spacer(modifier = Modifier.padding(16.dp))
        RegistroButton(Modifier.align(Alignment.CenterHorizontally))
    }
}

@Composable
fun Elementos(modifier: Modifier) {
    Text(text = "Registro de Ocupaciones",
    modifier = modifier)
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DescripcionField(){
    TextField(value = "", onValueChange = {},
        modifier = Modifier.fillMaxWidth(),
        placeholder = { Text(text = "Descripcion")},
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
        singleLine = true,
        maxLines = 1,
        colors = TextFieldDefaults.outlinedTextFieldColors(textColor = Color(0xFFE7DFDF),
            backgroundColor = Color(0xFFE7DFDF),

        )
    )
}
@Composable
fun SalarioField() {
    TextField(value = "", onValueChange = {},
        placeholder = { Text(text = "Salario")},
        modifier = Modifier.fillMaxWidth(),
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Decimal),
        singleLine = true,
        maxLines = 1,
        colors = TextFieldDefaults.outlinedTextFieldColors(textColor = Color(0xFFE7DFDF),
            backgroundColor = Color(0xFFE7DFDF),
        )
    )
}
@Composable
fun RegistroButton(modifier: Modifier) {
    OutlinedButton(onClick = {}, modifier = Modifier
        .fillMaxWidth()
        .height(48.dp), colors = ButtonDefaults.buttonColors(
        backgroundColor = Color(0xFF6575CE),
        disabledContentColor = Color(0xFF6575CE),
        contentColor = Color.White,
        disabledBackgroundColor = Color.White
    )
    ) {
        Icon(imageVector = Icons.Default.Add, contentDescription = "Guardar")
        Text(text = "Guardar",
        modifier = modifier)
    }
}


