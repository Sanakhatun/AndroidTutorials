package com.mobicule.sana.webviewexample;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by sana on 8/5/18.
 */

public class WebClientExample extends WebViewClient{
    private Activity activity = null;

    public WebClientExample(Activity activity) {
        this.activity = activity;
    }


    @Override
    public boolean shouldOverrideUrlLoading(WebView webView, String url) {
        if(url.indexOf("google.com") > -1 ) return false;
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        activity.startActivity(intent);
        return true;
    }

}
