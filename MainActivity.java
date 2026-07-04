package com.nexusvault.v3;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.webkit.WebSettings;
import com.getcapacitor.BridgeActivity;

public class MainActivity extends BridgeActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_STABLE | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION);
        try {
            WebView webView = getBridge().getWebView();
            webView.clearCache(true);
            webView.clearHistory();
            webView.clearFormData();
            WebStorage.getInstance().deleteAllData();
            try { deleteDatabase("webview.db"); } catch (Exception e) {}
            try { deleteDatabase("webviewCache.db"); } catch (Exception e) {}
            try { deleteDir(getCacheDir()); } catch (Exception e) {}
            webView.getSettings().setCacheMode(WebSettings.LOAD_NO_CACHE);
            webView.loadUrl("https://ajian920.github.io/nexusvault/?t=" + System.currentTimeMillis());
        } catch (Exception e) { e.printStackTrace(); }
    }
    private boolean deleteDir(java.io.File dir) {
        if (dir != null && dir.isDirectory()) {
            for (String child : dir.list()) { if (!deleteDir(new java.io.File(dir, child))) return false; }
            return dir.delete();
        } else if (dir != null && dir.isFile()) { return dir.delete(); }
        return false;
    }
}