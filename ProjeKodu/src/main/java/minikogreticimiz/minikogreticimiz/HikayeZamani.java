package minikogreticimiz.minikogreticimiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HikayeZamani extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hikaye_zamani);
    }
    public void btn_hikaye1(View v){
        Intent intent = new Intent(HikayeZamani.this,HikayeSayfasi.class);
        startActivity(intent);
    }
    public void btn_hikaye2(View v){
        Intent intent = new Intent(HikayeZamani.this,HikayeSayfasiiki.class);
        startActivity(intent);
    }
}
