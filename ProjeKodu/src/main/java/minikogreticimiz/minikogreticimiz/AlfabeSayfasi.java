package minikogreticimiz.minikogreticimiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class AlfabeSayfasi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.alfabe_sayfasi);
    }
    public void btn_alfabevideo(View v){
        Intent intent=new Intent(AlfabeSayfasi.this,AlfabeVideoSayfasi.class);
        startActivity(intent);
    }

}
