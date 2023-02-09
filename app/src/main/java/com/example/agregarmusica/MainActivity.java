package com.example.agregarmusica;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnPlay;
    MediaPlayer musica;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPlay =(Button)findViewById(R.id.btnReproducir);
        musica = MediaPlayer.create(this,R.raw.simpson);

        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(musica.isPlaying()){
                    musica.pause();
                    btnPlay.setBackgroundResource(R.drawable.play);
                }else{
                    musica.start();
                    btnPlay.setBackgroundResource(R.drawable.pausa);
                }
            }
        });

    }




}