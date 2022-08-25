package minikogreticimiz.minikogreticimiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class RakamlarSayfasi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rakamlar_sayfasi);
    }
    public void btn_geri(View v){
        Intent intent = new Intent(RakamlarSayfasi.this,DerslerSayfasi.class);
        startActivity(intent);
    }
    public void btn_test(View v){
        Intent intent = new Intent(RakamlarSayfasi.this,Rakamsayfa_Iki.class);
        startActivity(intent);
    }
}
