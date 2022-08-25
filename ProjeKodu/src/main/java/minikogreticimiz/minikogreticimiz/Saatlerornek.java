package minikogreticimiz.minikogreticimiz;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Saatlerornek extends AppCompatActivity {
    Button btnSorubir , btnSoruiki , btnSoruuc;
    final Context context = this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.saatlerornek);
        btnSorubir = (Button) findViewById(R.id.btnsorubir);
        btnSoruiki =(Button)findViewById(R.id.btnsoruiki);

        btnSorubir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);

                // alert dialog başlığını tanımlıyoruz.
                alertDialogBuilder.setTitle("Cevabı İyi Düşün :)");

                // alert dialog özelliklerini oluşturuyoruz.
                alertDialogBuilder
                        .setMessage("Berra Nur Saat Kaçta Uyandı?")
                        .setCancelable(false)
                        //.setIcon(R.mipmap.ic_launcher_round)
                        // Evet butonuna tıklanınca yapılacak işlemleri buraya yazıyoruz.
                        .setPositiveButton("Saat 7", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(getApplicationContext(),"Tebrikler Doğru Cevapladın",Toast.LENGTH_LONG).show();
                            }
                        })
                        // İptal butonuna tıklanınca yapılacak işlemleri buraya yazıyoruz.
                        .setNegativeButton("Saat 7.30", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(getApplicationContext(),"Yanlis cevap, Cevap Saat 7 olacaktı",Toast.LENGTH_LONG).show();
                            }
                        });

                // alert dialog nesnesini oluşturuyoruz
                AlertDialog alertDialog = alertDialogBuilder.create();

                // alerti gösteriyoruz
                alertDialog.show();
            }
        });



        btnSoruiki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog.Builder ad = new AlertDialog.Builder(context);

                // alert dialog başlığını tanımlıyoruz.
                ad.setTitle("Cevabı İyi Düşün :)");

                // alert dialog özelliklerini oluşturuyoruz.
                ad
                        .setMessage("Berra Nur Saat Kaçta Kahvaltı Yaptı?")
                        .setCancelable(false)
                        //.setIcon(R.mipmap.ic_launcher_round)
                        // Evet butonuna tıklanınca yapılacak işlemleri buraya yazıyoruz.
                        .setPositiveButton("Saat 9", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(getApplicationContext(),"Yanlış cevap :(, Cevap 7.30 olacaktı",Toast.LENGTH_LONG).show();
                            }
                        })
                        // İptal butonuna tıklanınca yapılacak işlemleri buraya yazıyoruz.
                        .setNegativeButton("Saat 7.30", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(getApplicationContext(),"Tebrikler Doğru Cevapladın",Toast.LENGTH_LONG).show();
                            }
                        });

                // alert dialog nesnesini oluşturuyoruz
                AlertDialog alertDialog = ad.create();

                // alerti gösteriyoruz
                alertDialog.show();
            }

        });

    }
    public void btn_menudon(View v){
        Intent intent = new Intent(Saatlerornek.this,DerslerSayfasi.class);
        startActivity(intent);
    }

    }

