package minikogreticimiz.minikogreticimiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class AylarSayfasi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aylar_sayfasi);
    }
  /*  public void btn_menudonn(View v){
        Intent intent = new Intent(AylarSayfasi.this,DerslerSayfasi.class);
        startActivity(intent);
    }*/
    public void btn_aylarilerle(View v){
        Intent intent = new Intent(AylarSayfasi.this,AylarikinciSayfa.class);
        startActivity(intent);
    }
    public void btn_mevsimler(View v){
        Intent intent = new Intent(AylarSayfasi.this,MevsimlerSayfasi.class);
        startActivity(intent);
    }
}
