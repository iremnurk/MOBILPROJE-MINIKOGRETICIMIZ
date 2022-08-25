package minikogreticimiz.minikogreticimiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class GunlerSayfasi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gunler_sayfasi);
    }
    public void btn_dersedon(View v){
        Intent intent = new Intent(GunlerSayfasi.this,DerslerSayfasi.class);
        startActivity(intent);
    }
    public void btn_gunilerle(View v){
        Intent intent = new Intent(GunlerSayfasi.this,GunleriPekistirmeSayfasi.class);
        startActivity(intent);
    }
}
