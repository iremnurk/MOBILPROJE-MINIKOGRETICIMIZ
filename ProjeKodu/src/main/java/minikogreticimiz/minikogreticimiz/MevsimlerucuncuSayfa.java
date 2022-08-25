package minikogreticimiz.minikogreticimiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MevsimlerucuncuSayfa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mevsimlerucuncu_sayfa);
    }
    public void btn(View v){
        Intent intent = new Intent(MevsimlerucuncuSayfa.this,MevsimlerdorduncuSayfa.class);
        startActivity(intent);
    }

}
