package l;

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
public final class C2606 extends WebViewClient {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TDialog f8233;

    public C2606(TDialog tDialog) {
        this.f8233 = tDialog;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Uri uri;
        C9145.m23520("openSDK_LOG.TDialog", "Redirect URL: " + str);
        C14082 c14082M33692 = C14082.m33692();
        TDialog tDialog = this.f8233;
        if (str.startsWith(c14082M33692.m33693((Context) tDialog.f904.get(), "auth://tauth.qq.com/"))) {
            tDialog.f898.mo3455(C18338.m42745(str));
            if (tDialog.isShowing()) {
                tDialog.dismiss();
                return true;
            }
        } else if (str.startsWith("auth://cancel")) {
            tDialog.f898.mo3453();
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
                if (tDialog.f904 != null && tDialog.f904.get() != null) {
                    ((Context) tDialog.f904.get()).startActivity(intent);
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
        TDialog tDialog = this.f8233;
        tDialog.f898.mo3454(new C19750(i, str, str2));
        if (tDialog.f904 != null && tDialog.f904.get() != null) {
            Toast.makeText((Context) tDialog.f904.get(), "网络连接异常或系统错误", 0).show();
        }
        tDialog.dismiss();
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        C9145.m23520("openSDK_LOG.TDialog", "Webview loading URL: " + str);
        super.onPageStarted(webView, str, bitmap);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        TDialog tDialog = this.f8233;
        if (tDialog.f901 != null) {
            tDialog.f901.setVisibility(0);
        }
    }
}
