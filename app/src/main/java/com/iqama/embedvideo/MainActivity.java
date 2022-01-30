package com.iqama.embedvideo;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.LinearLayout;


public class MainActivity extends AppCompatActivity {

    LinearLayout songOne,songTwo,songThree,songFour,songFive,songSix,songSeven,songEight,songNine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        songOne=findViewById(R.id.songOne);
        songTwo=findViewById(R.id.songTwo);
        songThree=findViewById(R.id.songThree);
        songFour=findViewById(R.id.songFour);
        songFive=findViewById(R.id.songFive);
        songSix=findViewById(R.id.songSix);
        songSeven=findViewById(R.id.songSeven);
        songEight=findViewById(R.id.songEight);
        songNine=findViewById(R.id.songNine);

    songOne.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            SongPlayer.tv_Url="https://www.youtube.com/embed/4Q4Vpa2y1w8";
            Intent newIntet= new Intent(MainActivity.this,SongPlayer.class);
            startActivity(newIntet);








        }
    });
    songTwo.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            SongPlayer.tv_Url="https://www.youtube.com/embed/f67N0JRqFtc";
            Intent newIntet= new Intent(MainActivity.this,SongPlayer.class);
            startActivity(newIntet);








        }
    });

        songThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SongPlayer.tv_Url="https://www.youtube.com/embed/N1N47e9Rtk8";
                Intent newIntet= new Intent(MainActivity.this,SongPlayer.class);
                startActivity(newIntet);







            }
        });

        songFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SongPlayer.tv_Url="https://www.youtube.com/embed/QcDm7LAT8G0";
                Intent newIntet= new Intent(MainActivity.this,SongPlayer.class);
                startActivity(newIntet);








            }
        });


        songFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SongPlayer.tv_Url="https://www.youtube.com/embed/AaYJJxtMMEg";
                Intent newIntet= new Intent(MainActivity.this,SongPlayer.class);
                startActivity(newIntet);








            }
        });

        songSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SongPlayer.tv_Url="https://www.youtube.com/embed/zkM3zqHMqzI";
                Intent newIntet= new Intent(MainActivity.this,SongPlayer.class);
                startActivity(newIntet);








            }
        });


        songSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SongPlayer.tv_Url="https://www.youtube.com/embed/T5D4qZbl6Q4";
                Intent newIntet= new Intent(MainActivity.this,SongPlayer.class);
                startActivity(newIntet);








            }
        });

        songEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SongPlayer.tv_Url="https://www.youtube.com/embed/6S8PjwS51ZA";
                Intent newIntet= new Intent(MainActivity.this,SongPlayer.class);
                startActivity(newIntet);








            }
        });

        songNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SongPlayer.tv_Url="https://www.youtube.com/embed/yZV4rGm_nlM";
                Intent newIntet= new Intent(MainActivity.this,SongPlayer.class);
                startActivity(newIntet);








            }
        });

    }
}