package com.e.imageview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    RadioButton rdoMinato, rdoNaruto, rdoTanjiro;
    ImageView imageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rdoMinato=findViewById(R.id.rdoMinato);
        rdoNaruto=findViewById(R.id.rdoNaruto);
        rdoTanjiro=findViewById(R.id.rdoTanjiro);

        imageView=findViewById(R.id.imgView);

        rdoMinato.setOnClickListener(this);
        rdoNaruto.setOnClickListener(this);
        rdoTanjiro.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.rdoMinato:
                imageView.setImageResource(R.drawable.minato);
                break;
            case R.id.rdoNaruto:
                imageView.setImageResource(R.drawable.naruto);
                break;
            case R.id.rdoTanjiro:
                imageView.setImageResource(R.drawable.tanjiro);
                break;


        }





    }
}
