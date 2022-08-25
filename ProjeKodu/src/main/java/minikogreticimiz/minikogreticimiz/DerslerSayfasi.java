package minikogreticimiz.minikogreticimiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class DerslerSayfasi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dersler_sayfasi);
    }
    public void btn_alfabe(View v){
        Intent intent = new Intent(DerslerSayfasi.this,AlfabeSayfasi.class);
        startActivity(intent);
    }
    public void btn_rakamlar(View v){
        Intent intent = new Intent(DerslerSayfasi.this,RakamlarSayfasi.class);
        startActivity(intent);
    }
    public void btn_saatler(View v){
        Intent intent = new Intent(DerslerSayfasi.this,SaatlerSayfasi.class);
        startActivity(intent);
    }
    public void btn_gunler(View v){
        Intent intent = new Intent(DerslerSayfasi.this,GunlerSayfasi.class);
        startActivity(intent);
    }
    public void btn_aylar(View v){
        Intent intent = new Intent(DerslerSayfasi.this,AylarSayfasi.class);
        startActivity(intent);
    }
    public void btn_mat(View v){
        Intent intent = new Intent(DerslerSayfasi.this,MatematikSayfasi.class);
        startActivity(intent);
    }
    public void btn_hikaye(View v){
        Intent intent = new Intent(DerslerSayfasi.this,HikayeZamani.class);
        startActivity(intent);
    }
    public void btn_cizgifilm(View v){
        Intent intent = new Intent(DerslerSayfasi.this,EgiticiCizgifilm.class);
        startActivity(intent);
    }

}
