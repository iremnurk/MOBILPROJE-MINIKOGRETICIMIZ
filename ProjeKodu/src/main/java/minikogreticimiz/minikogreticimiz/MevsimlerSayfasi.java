package minikogreticimiz.minikogreticimiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MevsimlerSayfasi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mevsimler_sayfasi);

    }
    public void btn(View v){
        Intent intent = new Intent(MevsimlerSayfasi.this,MevsimlerikinciSayfa.class);
        startActivity(intent);
    }


}
