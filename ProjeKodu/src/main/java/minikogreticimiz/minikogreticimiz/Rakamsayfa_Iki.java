package minikogreticimiz.minikogreticimiz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

public class Rakamsayfa_Iki extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rakamsayfa_iki);

        WebView webview = (WebView) findViewById(R.id.webview1);
        webview.getSettings().setJavaScriptEnabled(true);
        webview.loadUrl("https://www.testlericoz.com/testcoz.php?id=78");
    }
}
