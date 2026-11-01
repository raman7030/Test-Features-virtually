package p067l;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;
import com.tencent.open.TDialog;

/* JADX INFO: renamed from: l.ۖܶۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes2.dex */
public final class C4845 extends WebViewClient {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ TDialog f11027;

    public C4845(TDialog tDialog) {
        this.f11027 = tDialog;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Uri uri;
        C11060.m25471("openSDK_LOG.TDialog", "Redirect URL: " + str);
        C15752 c15752M35817 = C15752.m35817();
        TDialog tDialog = this.f11027;
        if (str.startsWith(c15752M35817.m35818((Context) tDialog.f2138.get(), "auth://tauth.qq.com/"))) {
            tDialog.f2132.mo5758(C19797.m45007(str));
            if (tDialog.isShowing()) {
                tDialog.dismiss();
                return true;
            }
        } else if (str.startsWith("auth://cancel")) {
            tDialog.f2132.mo5756();
            if (tDialog.isShowing()) {
                tDialog.dismiss();
                return true;
            }
        } else if (str.startsWith("auth://close")) {
            if (tDialog.isShowing()) {
                tDialog.dismiss();
                return true;
            }
        } else if (str.startsWith("download://") || str.endsWith(".apk")) {
            try {
                if (str.startsWith("download://")) {
                    uri = Uri.parse(Uri.decode(str.substring(11)));
                } else {
                    uri = Uri.parse(Uri.decode(str));
                }
                Intent intent = new Intent("android.intent.action.VIEW", uri);
                intent.addFlags(268435456);
                if (tDialog.f2138 != null && tDialog.f2138.get() != null) {
                    ((Context) tDialog.f2138.get()).startActivity(intent);
                }
            } catch (Exception unused) {
            }
        } else if (!str.startsWith("auth://progress")) {
            return false;
        }
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        super.onReceivedError(webView, i, str, str2);
        TDialog tDialog = this.f11027;
        tDialog.f2132.mo5757(new C21139(i, str, str2));
        if (tDialog.f2138 != null && tDialog.f2138.get() != null) {
            Toast.makeText((Context) tDialog.f2138.get(), "网络连接异常或系统错误", 0).show();
        }
        tDialog.dismiss();
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        C11060.m25471("openSDK_LOG.TDialog", "Webview loading URL: " + str);
        super.onPageStarted(webView, str, bitmap);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        TDialog tDialog = this.f11027;
        if (tDialog.f2135 != null) {
            tDialog.f2135.setVisibility(0);
        }
    }
}
