package minikogreticimiz.minikogreticimiz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MatematikSayfasiuc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.matematik_sayfasiuc);

        WebView webview = (WebView) findViewById(R.id.webview);
        webview.getSettings().setJavaScriptEnabled(true);
        webview.loadUrl("https://www.testlericoz.com/testcoz.php?id=10079");  //
        webview.setWebViewClient(new WebViewClient());  //UYGULAMA İÇERESİNDE SAYFA GEÇİŞLERİ CHROMELA DEĞİL
    }
}
