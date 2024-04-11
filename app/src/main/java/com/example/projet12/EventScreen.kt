package com.example.projet12

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
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.KeyboardArrowRight
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
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.projet12.Data.DataColor

@Composable
fun EventScreen(){
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
                    Text(text = "GET Events", fontSize = 30.sp)
                }
                Column (horizontalAlignment = Alignment.CenterHorizontally){
                    //ajouter profil
                    Row(modifier = Modifier
                        .size(60.dp)
                        .clip(RoundedCornerShape(50))
                        .background(Color.Blue)
                    ) {
                        Image(painter = painterResource(id = R.drawable.profil), contentDescription =null, modifier = Modifier.fillMaxSize())
                    }
                    Row {
                        Text(text = "Nambinina")
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
                Text(text = "Search event", style = MaterialTheme.typography.bodyMedium, fontWeight = FontWeight.Bold)
            }
            Row(modifier = Modifier
                .padding(top = 16.dp, bottom = 16.dp)
                .size(120.dp, 30.dp)
                .background(shape = RoundedCornerShape(8.dp), color = Color.LightGray)
                .clip(RoundedCornerShape(8.dp)), horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ){
                Icon(imageVector = Icons.Default.Star, contentDescription = null)
                Text(text = "Conférence", color = Color.Black)
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
                    BottomMenuItem(icon = Icons.Default.Home)
                    BottomMenuItem(icon = Icons.Default.DateRange, clique = true)
                    //BottomMenuItem(icon = Icons.Default.DateRange)
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
                .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceAround){
                Column {
                    Text(text = "All Events", style = TextStyle(
                     fontWeight = FontWeight.Bold
                    ))
                }
                Column {
                    Text(text = "Attending")
                }

            }
            CreeLigneConference("Conférence avec E-Tech", "Vitrine numérique, ESPA", "Mai 13, 2024")
            CreeLigneConference("Conférence avec E-Tech", "Vitrine numérique, ESPA", "Mai 13, 2024")
            CreeLigneConference("Conférence avec E-Tech", "Vitrine numérique, ESPA", "Mai 13, 2024")
            CreeLigneConference("Conférence avec E-Tech", "Vitrine numérique, ESPA", "Mai 13, 2024")
            CreeLigneConference("Conférence avec E-Tech", "Vitrine numérique, ESPA", "Mai 13, 2024")
        }

    }
}
@Preview(showBackground = true)
@Composable
fun EventScreenPreview(){
    EventScreen()
}
@Composable
fun BottomMenuItem(icon: ImageVector, clique :Boolean = false){

    if (clique == true){
        Column(horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .size(width = 80.dp, height = 50.dp)
                .clip(shape = RoundedCornerShape(16.dp))
                .background(Color.LightGray)) {
            Icon(imageVector = icon, contentDescription = null, modifier = Modifier.size(40.dp), tint = Color.Black)
        }
    }else{
        Column(horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.size(width = 80.dp, height = 60.dp)) {
            Icon(imageVector = icon, contentDescription = null, modifier = Modifier.size(40.dp), tint = Color.Black)
        }
    }
}

@Composable
fun CreeLigneOuverture(title:String, location: String, date:String){
    Row (modifier = Modifier
        .fillMaxWidth()
        .padding(bottom = 16.dp)
        .background(shape = RoundedCornerShape(16.dp), color = Color.LightGray)
        .height(120.dp)
        .clip(RoundedCornerShape(16.dp)),
        verticalAlignment = Alignment.CenterVertically){
        Column(modifier = Modifier
            .size(100.dp, 160.dp)
            .padding(horizontal = 8.dp),
            verticalArrangement = Arrangement.Center
        ) {
            Image(painter = painterResource(id = R.drawable.ouverture), contentDescription =null )
        }
        Column(modifier = Modifier
            .padding(horizontal = 8.dp)
            .align(alignment = Alignment.CenterVertically)) {
            Row {
                Text(text = title, color = Color.Black, fontWeight = FontWeight.SemiBold)
            }
            Row {
                Icon(imageVector = Icons.Default.DateRange, contentDescription = null, tint = Color.Blue)
                Text(text = date,style = TextStyle(
                    color = Color.Blue
                )
                )
            }
            Row {
                Icon(imageVector = Icons.Default.LocationOn, contentDescription = null, tint = DataColor.couleur_vert)
                Text(text = location, style = TextStyle(
                    color = Color.Green
                ))
            }


        }
        Column(modifier = Modifier
            .padding(start = 8.dp)
            .align(alignment = Alignment.CenterVertically), horizontalAlignment = Alignment.End) {
            Icon(imageVector = Icons.Default.KeyboardArrowRight, contentDescription = null, tint = Color.Blue)
        }
    }
}
@Composable
fun CreeLigneMiniProjet(title:String, location: String, date:String){
    Row (modifier = Modifier
        .fillMaxWidth()
        .padding(bottom = 16.dp)
        .background(shape = RoundedCornerShape(16.dp), color = Color.LightGray)
        .height(120.dp)
        .clip(RoundedCornerShape(16.dp)),
        verticalAlignment = Alignment.CenterVertically){
        Column(modifier = Modifier
            .size(100.dp, 160.dp)
            .padding(horizontal = 8.dp),
            verticalArrangement = Arrangement.Center
        ) {
            Image(painter = painterResource(id = R.drawable.miniprojet), contentDescription =null )
        }
        Column(modifier = Modifier
            .padding(horizontal = 8.dp)
            .align(alignment = Alignment.CenterVertically)) {
            Row {
                Text(text = title, color = Color.Black, fontWeight = FontWeight.SemiBold)
            }
            Row {
                Icon(imageVector = Icons.Default.DateRange, contentDescription = null, tint = Color.Blue)
                Text(text = date,style = TextStyle(
                    color = Color.Blue
                )
                )
            }
            Row {
                Icon(imageVector = Icons.Default.LocationOn, contentDescription = null, tint = DataColor.couleur_vert)
                Text(text = location, style = TextStyle(
                    color = Color.Green
                ))
            }


        }
        Column(modifier = Modifier
            .padding(start = 8.dp)
            .align(alignment = Alignment.CenterVertically), horizontalAlignment = Alignment.End) {
            Icon(imageVector = Icons.Default.KeyboardArrowRight, contentDescription = null, tint = Color.Blue)
        }
    }
}

@Composable
fun CreeLigneConference(title:String, location: String, date:String){
    Row (modifier = Modifier
        .fillMaxWidth()
        .padding(bottom = 16.dp)
        .background(shape = RoundedCornerShape(16.dp), color = Color.LightGray)
        .height(120.dp)
        .clip(RoundedCornerShape(16.dp)),
        verticalAlignment = Alignment.CenterVertically){
        Column(modifier = Modifier
            .size(100.dp, 160.dp)
            .padding(horizontal = 8.dp),
            verticalArrangement = Arrangement.Center
        ) {
            Image(painter = painterResource(id = R.drawable.conference), contentDescription =null )
        }
        Column(modifier = Modifier
            .padding(horizontal = 8.dp)
            .align(alignment = Alignment.CenterVertically)) {
            Row {
                Text(text = title, color = Color.Black, fontWeight = FontWeight.SemiBold)
            }
            Row {
                Icon(imageVector = Icons.Default.DateRange, contentDescription = null, tint = Color.Blue)
                Text(text = date,style = TextStyle(
                    color = Color.Blue
                )
                )
            }
            Row {
                Icon(imageVector = Icons.Default.LocationOn, contentDescription = null, tint = DataColor.couleur_vert)
                Text(text = location, style = TextStyle(
                    color = Color.Green
                ))
            }


        }
        Column(modifier = Modifier
            .padding(start = 8.dp)
            .align(alignment = Alignment.CenterVertically), horizontalAlignment = Alignment.End) {
            Icon(imageVector = Icons.Default.KeyboardArrowRight, contentDescription = null, tint = Color.Blue)
        }
    }
}

@Composable
fun CreeLigneFinale(title:String, location: String, date:String){
    Row (modifier = Modifier
        .fillMaxWidth()
        .padding(bottom = 16.dp)
        .background(shape = RoundedCornerShape(16.dp), color = Color.LightGray)
        .height(120.dp)
        .clip(RoundedCornerShape(16.dp)),
        verticalAlignment = Alignment.CenterVertically){
        Column(modifier = Modifier
            .size(100.dp, 160.dp)
            .padding(horizontal = 8.dp),
            verticalArrangement = Arrangement.Center
        ) {
            Image(painter = painterResource(id = R.drawable.sport), contentDescription =null )
        }
        Column(modifier = Modifier
            .padding(horizontal = 8.dp)
            .align(alignment = Alignment.CenterVertically)) {
            Row {
                Text(text = title, color = Color.Black, fontWeight = FontWeight.SemiBold)
            }
            Row {
                Icon(imageVector = Icons.Default.DateRange, contentDescription = null, tint = Color.Blue)
                Text(text = date,style = TextStyle(
                    color = Color.Blue
                )
                )
            }
            Row {
                Icon(imageVector = Icons.Default.LocationOn, contentDescription = null, tint = DataColor.couleur_vert)
                Text(text = location, style = TextStyle(
                    color = Color.Green
                ))
            }


        }
        Column(modifier = Modifier
            .padding(start = 8.dp)
            .align(alignment = Alignment.CenterVertically), horizontalAlignment = Alignment.End) {
            Icon(imageVector = Icons.Default.KeyboardArrowRight, contentDescription = null, tint = Color.Blue)
        }
    }
}

@Composable
fun CreeLigneReception(title:String, location: String, date:String){
    Row (modifier = Modifier
        .fillMaxWidth()
        .padding(bottom = 16.dp)
        .background(shape = RoundedCornerShape(16.dp), color = Color.LightGray)
        .height(120.dp)
        .clip(RoundedCornerShape(16.dp)),
        verticalAlignment = Alignment.CenterVertically){
        Column(modifier = Modifier
            .size(100.dp, 160.dp)
            .padding(horizontal = 8.dp),
            verticalArrangement = Arrangement.Center
        ) {
            Image(painter = painterResource(id = R.drawable.reception), contentDescription =null )
        }
        Column(modifier = Modifier
            .padding(horizontal = 8.dp)
            .align(alignment = Alignment.CenterVertically)) {
            Row {
                Text(text = title, color = Color.Black, fontWeight = FontWeight.SemiBold)
            }
            Row {
                Icon(imageVector = Icons.Default.DateRange, contentDescription = null, tint = Color.Blue)
                Text(text = date,style = TextStyle(
                    color = Color.Blue
                )
                )
            }
            Row {
                Icon(imageVector = Icons.Default.LocationOn, contentDescription = null, tint = DataColor.couleur_vert)
                Text(text = location, style = TextStyle(
                    color = Color.Green
                ))
            }


        }
        Column(modifier = Modifier
            .padding(start = 8.dp)
            .align(alignment = Alignment.CenterVertically), horizontalAlignment = Alignment.End) {
            Icon(imageVector = Icons.Default.KeyboardArrowRight, contentDescription = null, tint = Color.Blue)
        }
    }
}