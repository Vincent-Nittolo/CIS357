package com.example.uibuild

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApp()
        }
    }
}


@Composable
fun MyApp() {
    var switchState1 by remember { mutableStateOf(false)}
    var switchState2 by remember { mutableStateOf(false)}
    var switchState3 by remember { mutableStateOf(false)}
    var switchState4 by remember { mutableStateOf(false)}
    var switchState5 by remember { mutableStateOf(false)}
    var switchState6 by remember { mutableStateOf(false)}

    Column(modifier = Modifier.fillMaxSize().background(Color.Black) // Set background to black
            .padding(10.dp)) {
        Row(modifier = Modifier.padding((20.dp))) {
            Spacer(modifier = Modifier.height(0.dp))
            Text(text = "Vinny's Alarm UI", color = Color.Cyan)
            Spacer(modifier = Modifier.width(300.dp))
            Text(text = "+", color = Color.Cyan)
            Spacer(modifier = Modifier.width(15.dp))
            Text(text = ":", color = Color.Cyan)
        }
        Button(onClick = {},
            colors = ButtonDefaults.buttonColors(
            containerColor = Color.DarkGray,
            contentColor = Color.LightGray
            ),
            modifier = Modifier
            .width(400.dp)
            .height(110.dp),
            shape = RoundedCornerShape(15.dp)) {
            Row(modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start) {
                Text(
                    "6:55",
                    fontSize = 40.sp,
                    modifier = Modifier.padding(start = 0.dp, top = 0.dp)
                )
                Text("AM", fontSize = 15.sp, modifier = Modifier.padding(start = 5.dp, top = 15.dp))
                Text(
                    "Wed, Sep 24",
                    fontSize = 10.sp,
                    modifier = Modifier.padding(start = 130.dp, top = 0.dp)
                )
                Switch(checked = switchState1, onCheckedChange = { switchState1 = it },
                    modifier = Modifier
                        .padding(start = 20.dp)
                        .scale(scaleX = .7f, scaleY = .5f),
                    colors = SwitchDefaults.colors(
                        checkedThumbColor = Color.White,
                        checkedTrackColor = Color.Cyan,
                        uncheckedThumbColor = Color.White,
                        uncheckedTrackColor = Color.LightGray)
                )
            }
        }
        Spacer(modifier = Modifier.height(15.dp))
        Button(onClick = {},
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.DarkGray,
                contentColor = Color.LightGray
            ),
            modifier = Modifier
                .width(400.dp)
                .height(110.dp),
            shape = RoundedCornerShape(15.dp)) {
            Row(modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start) {
                Text(
                    "6:56",
                    fontSize = 40.sp,
                    modifier = Modifier.padding(start = 0.dp, top = 0.dp)
                )
                Text("AM", fontSize = 15.sp, modifier = Modifier.padding(start = 5.dp, top = 15.dp))
                Text(
                    "Wed, Sep 24",
                    fontSize = 10.sp,
                    modifier = Modifier.padding(start = 130.dp, top = 0.dp)
                )
                Switch(checked = switchState2, onCheckedChange = { switchState2 = it },
                    modifier = Modifier
                        .padding(start = 20.dp)
                        .scale(scaleX = .7f, scaleY = .5f),
                    colors = SwitchDefaults.colors(
                        checkedThumbColor = Color.White,
                        checkedTrackColor = Color.Cyan,
                        uncheckedThumbColor = Color.White,
                        uncheckedTrackColor = Color.LightGray)
                )
            }
        }
        Spacer(modifier = Modifier.height(15.dp))
        Button(onClick = {},
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.DarkGray,
                contentColor = Color.LightGray
            ),
            modifier = Modifier
                .width(400.dp)
                .height(110.dp),
            shape = RoundedCornerShape(15.dp)) {
            Row(modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start) {
                Text(
                    "6:57",
                    fontSize = 40.sp,
                    modifier = Modifier.padding(start = 0.dp, top = 0.dp)
                )
                Text("AM", fontSize = 15.sp, modifier = Modifier.padding(start = 5.dp, top = 15.dp))
                Text(
                    "Wed, Sep 24",
                    fontSize = 10.sp,
                    modifier = Modifier.padding(start = 130.dp, top = 0.dp)
                )
                Switch(checked = switchState3, onCheckedChange = { switchState3 = it },
                    modifier = Modifier
                        .padding(start = 20.dp)
                        .scale(scaleX = .7f, scaleY = .5f),
                    colors = SwitchDefaults.colors(
                        checkedThumbColor = Color.White,
                        checkedTrackColor = Color.Cyan,
                        uncheckedThumbColor = Color.White,
                        uncheckedTrackColor = Color.LightGray)
                )
            }
        }
        Spacer(modifier = Modifier.height(15.dp))
        Button(onClick = {},
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.DarkGray,
                contentColor = Color.LightGray
            ),
            modifier = Modifier
                .width(400.dp)
                .height(110.dp),
            shape = RoundedCornerShape(15.dp)) {
            Row(modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start) {
                Text(
                    "6:58",
                    fontSize = 40.sp,
                    modifier = Modifier.padding(start = 0.dp, top = 0.dp)
                )
                Text("AM", fontSize = 15.sp, modifier = Modifier.padding(start = 5.dp, top = 15.dp))
                Text(
                    "Wed, Sep 24",
                    fontSize = 10.sp,
                    modifier = Modifier.padding(start = 130.dp, top = 0.dp)
                )
                Switch(checked = switchState4, onCheckedChange = { switchState4 = it },
                    modifier = Modifier
                        .padding(start = 20.dp)
                        .scale(scaleX = .7f, scaleY = .5f),
                    colors = SwitchDefaults.colors(
                        checkedThumbColor = Color.White,
                        checkedTrackColor = Color.Cyan,
                        uncheckedThumbColor = Color.White,
                        uncheckedTrackColor = Color.LightGray)
                )
            }
        }
        Spacer(modifier = Modifier.height(15.dp))
        Button(onClick = {},
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.DarkGray,
                contentColor = Color.LightGray
            ),
            modifier = Modifier
                .width(400.dp)
                .height(110.dp),
            shape = RoundedCornerShape(15.dp)) {
            Row(modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start) {
                Text(
                    "6:59",
                    fontSize = 40.sp,
                    modifier = Modifier.padding(start = 0.dp, top = 0.dp)
                )
                Text("AM", fontSize = 15.sp, modifier = Modifier.padding(start = 5.dp, top = 15.dp))
                Text(
                    "Wed, Sep 24",
                    fontSize = 10.sp,
                    modifier = Modifier.padding(start = 130.dp, top = 0.dp)
                )
                Switch(checked = switchState5, onCheckedChange = { switchState5 = it },
                    modifier = Modifier
                        .padding(start = 20.dp)
                        .scale(scaleX = .7f, scaleY = .5f),
                    colors = SwitchDefaults.colors(
                        checkedThumbColor = Color.White,
                        checkedTrackColor = Color.Cyan,
                        uncheckedThumbColor = Color.White,
                        uncheckedTrackColor = Color.LightGray)
                )
            }
        }
        Spacer(modifier = Modifier.height(15.dp))
        Button(onClick = {},
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.DarkGray,
                contentColor = Color.LightGray
            ),
            modifier = Modifier
                .width(400.dp)
                .height(110.dp),
            shape = RoundedCornerShape(15.dp)) {
            Row(modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start) {
                Text(
                    "7:00",
                    fontSize = 40.sp,
                    modifier = Modifier.padding(start = 0.dp, top = 0.dp)
                )
                Text("AM", fontSize = 15.sp, modifier = Modifier.padding(start = 5.dp, top = 15.dp))
                Text(
                    "Wed, Sep 24",
                    fontSize = 10.sp,
                    modifier = Modifier.padding(start = 130.dp, top = 0.dp)
                )
                Switch(checked = switchState6, onCheckedChange = { switchState6 = it },
                    modifier = Modifier
                        .padding(start = 20.dp)
                        .scale(scaleX = .7f, scaleY = .5f),
                    colors = SwitchDefaults.colors(
                        checkedThumbColor = Color.White,
                        checkedTrackColor = Color.Cyan,
                        uncheckedThumbColor = Color.White,
                        uncheckedTrackColor = Color.LightGray)
                )
            }
        }
        Spacer(modifier = Modifier.height(15.dp))
        Row(){
            Image(
                painter = painterResource(id = R.drawable.bottomicons),
                contentDescription = "My Image",
                modifier = Modifier
                    .width(400.dp)
                    .height(100.dp)
            )
        }
    }
}

