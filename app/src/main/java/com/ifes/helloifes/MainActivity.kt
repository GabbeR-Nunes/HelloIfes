package com.ifes.helloifes

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ifes.helloifes.ui.theme.HelloIfesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            HelloIfesTheme {
                    Greeting()
                }
            }
        }
    }

@Composable
fun Greeting() {

    Box(
        modifier = Modifier.fillMaxSize().background(Color(0xff224ee0))
    )


    Column(
        modifier = Modifier.padding(top = 32.dp),
        verticalArrangement = Arrangement.spacedBy(60.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Cartão Digital do Estudante",
            color = Color(0xffdae022),
            fontSize = 42.sp,
            textAlign = TextAlign.Center,
            lineHeight = 32.sp

        )

        Column(
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            Text(
                text = "Gabriely Julia Rodrigues Nunes",
                color = Color.White,
                fontSize = 32.sp,
                textAlign = TextAlign.Center

            )
            Text(
                text = "Estudante de Técnico em Informática no IFES",
                color = Color.White,
                fontSize = 24.sp,
                textAlign = TextAlign.Center,
                lineHeight = 32.sp

            )
            Text(
                text = "\"Comandante de Linha e Líder do Fanclube do Bruno Coutinho 👌😘\"",
                color = Color(0xffe0a722),
                fontSize = 24.sp,
                textAlign = TextAlign.Center,
                lineHeight = 32.sp

            )

        }

        Text(
            text = "lógica é comigo mesmo",
            color = Color(0xffdae022),
            fontSize = 20.sp,
            textAlign = TextAlign.Center,
            lineHeight = 32.sp

        )

    }
}
