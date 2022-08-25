package minikogreticimiz.minikogreticimiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MevsimlerdorduncuSayfa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mevsimlerdorduncu_sayfa);
    }
    public void btn(View v){
        Intent intent = new Intent(MevsimlerdorduncuSayfa.this,MevsimSiir.class);
        startActivity(intent);
    }
}
