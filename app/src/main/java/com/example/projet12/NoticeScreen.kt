package com.example.projet12

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun NoticeScreen() {
    Scaffold(topBar = {
        Column(
            modifier = Modifier.background(Color.Blue),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(100.dp),
                horizontalArrangement = Arrangement.SpaceAround,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column(
                    modifier = Modifier
                        .size(80.dp)
                        .clip(RoundedCornerShape(50))
                        .background(Color.Blue)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.logo),
                        contentDescription = null
                    )

                }
                Column {
                    Text(text = "GET Events", fontSize = 30.sp)
                }
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    //ajouter profil
                    Row(
                        modifier = Modifier
                            .size(60.dp)
                            .clip(RoundedCornerShape(50))
                            .background(Color.Blue)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.profil),
                            contentDescription = null,
                            modifier = Modifier.fillMaxSize()
                        )
                    }
                    Row {
                        Text(text = "Nambinina")
                    }
                }
            }



        }

    }, bottomBar = {
        BottomAppBar {
            NavigationBar {
                Row(
                    horizontalArrangement = Arrangement.SpaceAround,
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color.White)
                ) {
                    BottomMenuItem(icon = Icons.Default.Home)
                    BottomMenuItem(icon = Icons.Default.DateRange)
                    Column(horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center,
                        modifier = Modifier.size(width = 80.dp, height = 60.dp)
                            .clip(shape = RoundedCornerShape(16.dp))
                            .background(Color.LightGray)) {
                        Icon(imageVector = Icons.Default.Notifications, contentDescription = null, modifier = Modifier.size(40.dp))
                    }
                    //BottomMenuItem(icon = Icons.Default.Notifications)
                    BottomMenuItem(icon = Icons.Default.Person)
                }
            }
        }
    }, modifier = Modifier
        .background(Color.Blue)
        .padding(horizontal = 16.dp, vertical = 8.dp)
    ) {
        Column(modifier = Modifier
            .fillMaxSize()
            .background(Color.Blue)) {

        }
    }

}
@Preview(showBackground = true)
@Composable
fun NoticeScreenPreview(){
    NoticeScreen()
}
@Composable
fun CreateNotice(){

}
