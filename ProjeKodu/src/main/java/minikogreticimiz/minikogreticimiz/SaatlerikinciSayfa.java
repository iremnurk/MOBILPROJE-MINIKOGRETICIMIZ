package minikogreticimiz.minikogreticimiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SaatlerikinciSayfa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.saatlerikinci_sayfa);
    }
    public void btn_saatornk(View v){
        Intent intent = new Intent(SaatlerikinciSayfa.this,Saatlerornek.class);
        startActivity(intent);
    }
}
