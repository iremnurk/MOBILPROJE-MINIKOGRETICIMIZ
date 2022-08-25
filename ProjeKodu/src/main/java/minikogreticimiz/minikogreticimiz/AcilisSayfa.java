package minikogreticimiz.minikogreticimiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class AcilisSayfa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acilis_sayfa);

        Thread thread=new Thread(){
         public  void run(){
             try {
                 sleep(3000);
                 Intent intent = new Intent(getApplicationContext(),LoginSayfa.class);
                 startActivity(intent);
                 finish();
             } catch (InterruptedException e) {
                 e.printStackTrace();
             }


         }

        };
        thread.start();

    }
}
