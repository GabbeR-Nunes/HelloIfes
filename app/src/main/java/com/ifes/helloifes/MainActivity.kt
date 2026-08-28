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
        modifier = Modifier.padding(top = 35.dp),
        verticalArrangement = Arrangement.spacedBy(65.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Dupla Dinâmica Líderes do Fanclube do Bruno Cardoso Coutinho ( DDLFBCC) PLUS",
            color = Color(0xffdae022),
            fontSize = 42.sp,
            textAlign = TextAlign.Center,
            lineHeight = 50.sp

        )

        Column(
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            Text(
                text = "   Gabriely Julia                Rafael Antunes",
                color = Color.White,
                fontSize = 20.sp,
                textAlign = TextAlign.Center

            )
            Text(
                text = "  Rodrigues Nunes               Hoffmann",
                color = Color.White,
                fontSize = 20.sp,
                textAlign = TextAlign.Center

            )

            Text(
                text = "Estudantes de Técnico em Informática no IFES",
                color = Color.Yellow,
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
            text = "mestres em paparicar a orelha do divino e glorioso Bruno Cardume Coutão",
            color = Color(0xffdae022),
            fontSize = 20.sp,
            textAlign = TextAlign.Center,
            lineHeight = 32.sp

        )

    }
}
