package com.example.gonzalo.pianos;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button a,b,c,d,e,f,g;

    private SoundPool soundPool;

    private int sound_a, sound_b, sound_c, sound_d, sound_e, sound_f, sound_g;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        a = (Button)findViewById(R.id.a);
        b = (Button)findViewById(R.id.b);
        c = (Button)findViewById(R.id.c);
        d = (Button)findViewById(R.id.d);
        e = (Button)findViewById(R.id.e);
        f = (Button)findViewById(R.id.f);
        g = (Button)findViewById(R.id.g);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
            soundPool = new SoundPool.Builder().setMaxStreams(5).build();
        }
        else soundPool = new SoundPool(5, AudioManager.STREAM_MUSIC, 0);

        sound_a = soundPool.load(this, R.raw.dos, 1);
        sound_b = soundPool.load(this, R.raw.re, 1);
        sound_c = soundPool.load(this, R.raw.mi, 1);
        sound_d = soundPool.load(this, R.raw.fa, 1);
        sound_e = soundPool.load(this, R.raw.sol, 1);
        sound_f = soundPool.load(this, R.raw.la, 1);
        sound_g = soundPool.load(this, R.raw.si, 1);

        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                soundPool.play(sound_a,1,1,0,0,1);

            }
        });

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                soundPool.play(sound_b,1,1,0,0,1);

            }
        });

        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                soundPool.play(sound_c,1,1,0,0,1);

            }
        });

        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                soundPool.play(sound_d,1,1,0,0,1);

            }
        });

        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                soundPool.play(sound_e,1,1,0,0,1);

            }
        });

        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                soundPool.play(sound_f,1,1,0,0,1);

            }
        });

        g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                soundPool.play(sound_g,1,1,0,0,1);

            }
        });
    }
}
