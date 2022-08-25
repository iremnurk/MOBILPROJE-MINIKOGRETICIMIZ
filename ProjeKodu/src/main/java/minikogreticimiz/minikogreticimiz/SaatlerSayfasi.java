package minikogreticimiz.minikogreticimiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SaatlerSayfasi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.saatler_sayfasi);
    }
    public void btn_saatilerle(View v){
        Intent intent = new Intent(SaatlerSayfasi.this,SaatlerikinciSayfa.class);
        startActivity(intent);
    }
}
