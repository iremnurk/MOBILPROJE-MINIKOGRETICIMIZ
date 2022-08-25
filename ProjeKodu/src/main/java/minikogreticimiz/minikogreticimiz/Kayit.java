package minikogreticimiz.minikogreticimiz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Kayit extends AppCompatActivity {
    DB_sqlit db= new DB_sqlit(this);
    EditText name,email,kullaniciadi,password;     //adınız email kadı sifre   //name,email,surname,password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kayit);
        name = findViewById(R.id.editText1);
        email = findViewById(R.id.editText2);  // surname = findViewById(R.id.editText2);
        kullaniciadi = findViewById(R.id.editText3);    //email = findViewById(R.id.editText3);
        password = findViewById(R.id.editText4);  //password = findViewById(R.id.editText4);
    }
    /*@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.my_menu,menu);
        return true;
    }*/

    public void adddata(View view){
        String Name=name.getText().toString();

        String Email=email.getText().toString();
        String KullaniciAdi=kullaniciadi.getText().toString();
        String Password=password.getText().toString();
        Boolean result=db.insertdata(Name,Email,KullaniciAdi,Password);


        if(result==true)
        {
            Toast.makeText(Kayit.this,"Insertion completed",Toast.LENGTH_SHORT).show();
            name.setText("");
            email.setText("");
            kullaniciadi.setText("");
            password.setText("");
        }
        else
        {
            Toast.makeText(Kayit.this,"Insertion not completed",Toast.LENGTH_SHORT).show();
        }

    }
}
