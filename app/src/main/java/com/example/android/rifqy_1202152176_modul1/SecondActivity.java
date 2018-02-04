package com.example.android.rifqy_1202152176_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    private int Uang = 65000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_Text_Makanan);
        String message2 = intent.getStringExtra(MainActivity.EXTRA_Text_Porsi);

        String tempatmakan = intent.getStringExtra("tempat");
        String harga = intent.getStringExtra("harga");

        int Total = Integer.valueOf(harga) * Integer.valueOf(message2);

        TextView textView = (TextView) findViewById(R.id.text_menu_2);
        TextView textView2 = (TextView) findViewById(R.id.text_porsi_2);

        TextView textView3 = (TextView) findViewById(R.id.text_subheader);
        TextView textView4 = (TextView) findViewById(R.id.text_harga_2);


        textView.setText(message);
        textView2.setText(message2);

        textView3.setText(tempatmakan);
        textView4.setText(String.valueOf(Total));

        if (Total > Uang){
            Toast toast = Toast.makeText(this, "Jangan disini makan malamnya, uang kamu tidak cukup", Toast.LENGTH_LONG);
            toast.show();
        }
        else {
            Toast toast = Toast.makeText(this, "Disini aja makan malamnya", Toast.LENGTH_LONG);
            toast.show();
        }





    }

}
