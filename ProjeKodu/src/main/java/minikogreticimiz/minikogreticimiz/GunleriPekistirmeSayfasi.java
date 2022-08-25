package minikogreticimiz.minikogreticimiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.TextView;

public class GunleriPekistirmeSayfasi extends AppCompatActivity {
   TextView textView1,textView2,textView3,textView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gunleri_pekistirme_sayfasi);

        textView1 =(TextView)findViewById(R.id.textView16);
        textView2 =(TextView)findViewById(R.id.textView17);
        textView3 =(TextView)findViewById(R.id.textView18);
        textView4 =(TextView)findViewById(R.id.textView19);
    }
    public  void change (View view)
    {
        boolean checked =((Switch)view).isChecked();


        if(checked){
            textView1.setText("Pazartesi");
            textView2.setText("Salı");
            textView3.setText("Cuma");
            textView4.setText("Yedi Gün");

        }
        else{
            textView1.setText("");
            textView2.setText("");
            textView3.setText("");
            textView4.setText("");
        }

    }

}
