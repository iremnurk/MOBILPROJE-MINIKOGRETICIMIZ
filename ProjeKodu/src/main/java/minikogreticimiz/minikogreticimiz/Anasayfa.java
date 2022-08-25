package minikogreticimiz.minikogreticimiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Anasayfa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.anasayfa);
    }
    public void btnd(View v){
        Intent intent = new Intent(Anasayfa.this,DerslerSayfasi.class);
        startActivity(intent);
    }
}

