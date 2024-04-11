package com.example.projet12

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Done
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Star
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
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun HomeScreen(){
    Scaffold (topBar = {
        Column (modifier = Modifier.background(Color.Blue),
            horizontalAlignment = Alignment.CenterHorizontally){
            Row(modifier = Modifier
                .fillMaxWidth()
                .height(100.dp),
                horizontalArrangement = Arrangement.SpaceAround,
                verticalAlignment = Alignment.CenterVertically) {
                Column(modifier = Modifier
                    .size(80.dp)
                    .clip(RoundedCornerShape(50))
                    .background(Color.Blue)) {
                    Image(painter = painterResource(id = R.drawable.logo), contentDescription =null)

                }
                Column {
                    //Pour ajouter TITRE
                    Text(text = "GET 2024", fontSize = 30.sp)
                }
                Column (horizontalAlignment = Alignment.CenterHorizontally){
                    //ajouter profil
                    Row(modifier = Modifier
                        .size(80.dp)
                        .clip(RoundedCornerShape(50))
                        .background(Color.Blue)
                    ) {
                        Image(painter = painterResource(id = R.drawable.profil), contentDescription =null, modifier = Modifier.fillMaxSize())
                    }
                    Row {
                        //Text(text = "ESPA")
                    }
                }
            }

            Row(modifier = Modifier
                .padding(top = 16.dp)
                .fillMaxWidth()
                .background(shape = RoundedCornerShape(16.dp), color = Color.LightGray)
                .height(35.dp)
                .clip(RoundedCornerShape(24.dp))
                , horizontalArrangement = Arrangement.Absolute.Left,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(imageVector = Icons.Default.Search, contentDescription = null,
                    modifier = Modifier.padding(start = 8.dp, end = 16.dp))
                Text(text = "Rechercher", style = MaterialTheme.typography.bodyMedium, fontWeight = FontWeight.Bold)
            }
            Row(modifier = Modifier
                .padding(top = 16.dp, bottom = 16.dp)
                .size(120.dp, 30.dp)
                .background(shape = RoundedCornerShape(8.dp), color = Color.LightGray)
                .clip(RoundedCornerShape(8.dp)), horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ){
                //Icon(imageVector = Icons.Default.Star, contentDescription = null)
                Icon(imageVector = Icons.Default.Done, contentDescription = null)
                Text(text = "Evénements")
            }
        }

    }
        ,bottomBar = {
        BottomAppBar {
            NavigationBar {
                Row(
                    horizontalArrangement = Arrangement.SpaceAround,
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color.White)
                ) {

                    BottomMenuItem(icon = Icons.Default.Home, clique = true)
                    BottomMenuItem(icon = Icons.Default.DateRange)
                    BottomMenuItem(icon = Icons.Default.Notifications)
                    BottomMenuItem(icon = Icons.Default.Person)
                }
            }
        }
    },modifier = Modifier
            .background(Color.Blue)
            .padding(horizontal = 16.dp, vertical = 8.dp)
    ) {
        Column(modifier = Modifier
            .padding(it)
            .background(Color.Blue)
            .verticalScroll(rememberScrollState()),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Row (modifier = Modifier
                .padding(bottom = 24.dp)
                .fillMaxWidth()){
                Text(text = "Plus récents", style = TextStyle(
                    fontWeight = FontWeight.Bold
                ))


            }
            CreeLigneOuverture("Ouverture de la semaine TCO", "AMPHI 1, Vontorona", "13 Mai 2024")
            Row (modifier = Modifier.fillMaxWidth()){
                Text(text = "Catégories", fontWeight = FontWeight.Bold)
            }
            Row (modifier = Modifier
                .height(120.dp)
                .horizontalScroll(rememberScrollState()),
                verticalAlignment = Alignment.CenterVertically){
                CreateOuverture()
                CreateConference()
                CreateConcours()
                CreateFinale()
                CreateReception()
            }
            Row (modifier = Modifier
                .padding(bottom = 10.dp)
                .fillMaxWidth()){
                Text(text = "Recommendés", fontWeight = FontWeight.Bold)
            }

            CreeLigneConference("Conférence avec les partenariats", "Vitrine numérique, ESPA", "14 Mai 2024")
            CreeLigneMiniProjet("Concours Mini-projet", "Vitrine numérique, ESPA", "15 Mai 2024")
            CreeLigneFinale("Finale sports", "CNAPS, Vontovorona", "16 Mai 2024")
            CreeLigneReception("Réception 2024", "Espace Rose, ByPass", "17 Mai 2024")
        }

    }
}
@Composable
fun CreateOuverture(){
    Column (modifier = Modifier
        .padding(end = 30.dp)
        .size(width = 120.dp, height = 100.dp)
        .clip(shape = RoundedCornerShape(16.dp))
        .background(Color.LightGray),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceAround){
        Row (modifier = Modifier.size(60.dp)){
            Image(painter = painterResource(id = R.drawable.ouverture), contentDescription = null)
        }
        Row {
            Text(text = "Ouverture", color= Color.Black)
        }
    }
}

@Composable
fun CreateConference(){
    Column (modifier = Modifier
        .padding(end = 30.dp)
        .size(width = 120.dp, height = 100.dp)
        .clip(shape = RoundedCornerShape(16.dp))
        .background(Color.LightGray),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceAround){
        Row (modifier = Modifier.size(60.dp)){
            Image(painter = painterResource(id = R.drawable.conference), contentDescription = null)
        }
        Row {
            Text(text = "Conférences", color= Color.Black)
        }
    }
}

@Composable
fun CreateConcours(){
    Column (modifier = Modifier
        .padding(end = 30.dp)
        .size(width = 120.dp, height = 100.dp)
        .clip(shape = RoundedCornerShape(16.dp))
        .background(Color.LightGray),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceAround){
        Row (modifier = Modifier.size(60.dp)){
            Image(painter = painterResource(id = R.drawable.miniprojet), contentDescription = null)
        }
        Row {
            Text(text = "Mini-projet", color= Color.Black)
        }
    }
}

@Composable
fun CreateFinale(){
    Column (modifier = Modifier
        .padding(end = 30.dp)
        .size(width = 120.dp, height = 100.dp)
        .clip(shape = RoundedCornerShape(16.dp))
        .background(Color.LightGray),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceAround){
        Row (modifier = Modifier.size(60.dp)){
            Image(painter = painterResource(id = R.drawable.sport), contentDescription = null)
        }
        Row {
            Text(text = "Sports", color= Color.Black)
        }
    }
}

@Composable
fun CreateReception(){
    Column (modifier = Modifier
        .padding(end = 30.dp)
        .size(width = 120.dp, height = 100.dp)
        .clip(shape = RoundedCornerShape(16.dp))
        .background(Color.LightGray),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceAround){
        Row (modifier = Modifier.size(60.dp)){
            Image(painter = painterResource(id = R.drawable.reception), contentDescription = null)
        }
        Row {
            Text(text = "Réception", color= Color.Black)
        }
    }
}
@Preview(showBackground = true)
@Composable
fun HomeScreenPreview(){
    HomeScreen()
}
