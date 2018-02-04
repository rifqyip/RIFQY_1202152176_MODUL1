package com.example.android.rifqy_1202152176_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_Text_Makanan = "com.example.android.rifqy_1202152176_modul1.extra.MESSAGE";
    public static final String EXTRA_Text_Porsi = "com.example.android.rifqy_1202152176_modul1.extra.MESSAGE2";


    private EditText mMakananEditText;
    private EditText mPorsiEditText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mMakananEditText = (EditText) findViewById(R.id.text_menu);
        mPorsiEditText = (EditText) findViewById(R.id.text_porsi);

    }



    public void launchEatbus(View view) {
        Intent intent = new Intent(this, SecondActivity.class);

        String message = mMakananEditText.getText().toString();
        intent.putExtra(EXTRA_Text_Makanan, message);

        String message2 = mPorsiEditText.getText().toString();
        intent.putExtra(EXTRA_Text_Porsi, message2);

        intent.putExtra("harga", "50000");
        intent.putExtra("tempat", "Eatbus");

        if ((message.equals("Nasi Uduk")) || (message.equals("Nasi Goreng")) ) {
            startActivity(intent);

        } else {
            Toast toast = Toast.makeText(this, "Menu Tidak Tersedia", Toast.LENGTH_LONG);
            toast.show();}


    }

    public void launchAbnormal(View view) {
        Intent intent = new Intent(this, SecondActivity.class);

        String message = mMakananEditText.getText().toString();
        intent.putExtra(EXTRA_Text_Makanan, message);

        String message2 = mPorsiEditText.getText().toString();
        intent.putExtra(EXTRA_Text_Porsi, message2);

        intent.putExtra("harga", "50000");
        intent.putExtra("tempat", "Eatbus");

        if ((message.equals("Nasi Uduk")) || (message.equals("Nasi Goreng")) ) {
            startActivity(intent);

        } else {
            Toast toast = Toast.makeText(this, "Menu Tidak Tersedia", Toast.LENGTH_LONG);
            toast.show();}
    }
}
