package minikogreticimiz.minikogreticimiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginSayfa extends AppCompatActivity {
    DB_sqlit db;
    EditText kullaniciadi,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_sayfa);
        db= new DB_sqlit(this);
        kullaniciadi = findViewById(R.id.editText1);
        password = findViewById(R.id.editText5);

    }
    public  void btnuye(View view){
        Intent intent = new Intent(LoginSayfa.this,Kayit.class);
        startActivity(intent);
    }

    /*@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.my_menu,menu);
        return true;
    } */

    public void login(View view){

        String Kullaniciadi=kullaniciadi.getText().toString();
        String Password=password.getText().toString();
        Boolean resultt=db.getRecord(Kullaniciadi,Password);

        if(resultt==true)
        {
            Toast.makeText(LoginSayfa.this,"Giriş Yapıldı",Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(LoginSayfa.this,Anasayfa.class);
            startActivity(intent);

        }
        else
        {
            Toast.makeText(LoginSayfa.this,"Giris Yapılmadı Bilgilerini Kontrol Et ",Toast.LENGTH_SHORT).show();
        }

    }
}
