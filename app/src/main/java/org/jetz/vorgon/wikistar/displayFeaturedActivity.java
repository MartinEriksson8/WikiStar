package org.jetz.vorgon.wikistar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class displayFeaturedActivity extends AppCompatActivity {

    private WebView featured_wiki;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_featured);

        featured_wiki = (WebView) findViewById(R.id.webview_wiki);
        featured_wiki.setWebViewClient(new WebViewClient());
        featured_wiki.loadUrl("https://en.wikipedia.org/wiki/Special:RandomInCategory/Featured_articles");
    }
}
