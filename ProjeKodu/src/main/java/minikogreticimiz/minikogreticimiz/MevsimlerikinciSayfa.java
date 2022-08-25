package minikogreticimiz.minikogreticimiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MevsimlerikinciSayfa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mevsimlerikinci_sayfa);
    }
    public void btn(View v){
        Intent intent = new Intent(MevsimlerikinciSayfa.this,MevsimlerucuncuSayfa.class);
        startActivity(intent);
    }
}
