package p067l;

import android.annotation.TargetApi;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.SystemClock;
import android.text.TextUtils;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.alipay.sdk.p010m.p055w.C0233a;
import com.tencent.connect.auth.DialogC0602a;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.۫۠ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes3.dex */
public final class C14037 extends WebViewClient {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ DialogC0602a f39597;

    public C14037(DialogC0602a dialogC0602a) {
        this.f39597 = dialogC0602a;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Uri uri;
        C11060.m25471("openSDK_LOG.AuthDialog", "-->Redirect URL: " + str);
        boolean zStartsWith = str.startsWith("auth://browser");
        DialogC0602a dialogC0602a = this.f39597;
        if (zStartsWith) {
            JSONObject jSONObjectM45007 = C19797.m45007(str);
            dialogC0602a.f2069 = DialogC0602a.m1991(dialogC0602a);
            if (!dialogC0602a.f2069) {
                if (jSONObjectM45007.optString("fail_cb", null) != null) {
                    dialogC0602a.m2003(jSONObjectM45007.optString("fail_cb"));
                    return true;
                }
                if (jSONObjectM45007.optInt("fall_to_wv") == 1) {
                    DialogC0602a.m1990(dialogC0602a, dialogC0602a.f2081.indexOf("?") > -1 ? C0233a.f1084p : "?");
                    DialogC0602a.m1990(dialogC0602a, "browser_error=1");
                    if (dialogC0602a.f2072 != null) {
                        dialogC0602a.f2072.loadUrl(dialogC0602a.f2081);
                        return true;
                    }
                } else {
                    String strOptString = jSONObjectM45007.optString("redir", null);
                    if (strOptString != null && dialogC0602a.f2072 != null) {
                        dialogC0602a.f2072.loadUrl(strOptString);
                        return true;
                    }
                }
            }
        } else {
            if (str.startsWith("auth://tauth.qq.com/")) {
                dialogC0602a.f2082.mo5758(C19797.m45007(str));
                dialogC0602a.dismiss();
                return true;
            }
            if (str.startsWith("auth://cancel")) {
                dialogC0602a.f2082.mo5756();
                dialogC0602a.dismiss();
                return true;
            }
            if (str.startsWith("auth://close")) {
                dialogC0602a.dismiss();
                return true;
            }
            if (str.startsWith("download://") || str.endsWith(".apk")) {
                try {
                    if (str.startsWith("download://")) {
                        uri = Uri.parse(Uri.decode(str.substring(11)));
                    } else {
                        uri = Uri.parse(Uri.decode(str));
                    }
                    Intent intent = new Intent("android.intent.action.VIEW", uri);
                    intent.addFlags(268435456);
                    dialogC0602a.f2083.startActivity(intent);
                    return true;
                } catch (Exception e) {
                    C11060.m25465("openSDK_LOG.AuthDialog", "-->start download activity exception, e: ", e);
                    return true;
                }
            }
            try {
                if (str.startsWith("auth://progress")) {
                    List<String> pathSegments = Uri.parse(str).getPathSegments();
                    if (!pathSegments.isEmpty()) {
                        int iIntValue = Integer.valueOf(pathSegments.get(0)).intValue();
                        if (iIntValue == 0) {
                            dialogC0602a.f2073.setVisibility(8);
                            if (dialogC0602a.f2072 != null) {
                                dialogC0602a.f2072.setVisibility(0);
                                return true;
                            }
                        } else if (iIntValue == 1) {
                            dialogC0602a.f2073.setVisibility(0);
                            return true;
                        }
                    }
                } else if (!str.startsWith("auth://onLoginSubmit")) {
                    if (!dialogC0602a.f2075.mo26978(dialogC0602a.f2072, str)) {
                        C11060.m25469("openSDK_LOG.AuthDialog", "-->Redirect URL: return false");
                        return false;
                    }
                } else {
                    List<String> pathSegments2 = Uri.parse(str).getPathSegments();
                    if (!pathSegments2.isEmpty()) {
                        dialogC0602a.f2077 = pathSegments2.get(0);
                        return true;
                    }
                }
            } catch (Exception unused) {
            }
        }
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        super.onReceivedError(webView, i, str, str2);
        C11060.m25469("openSDK_LOG.AuthDialog", "-->onReceivedError, errorCode: " + i + " | description: " + str);
        DialogC0602a dialogC0602a = this.f39597;
        if (!C19797.m45001(dialogC0602a.f2083)) {
            dialogC0602a.f2082.mo5757(new C21139(9001, "当前网络不可用，请稍后重试！", str2));
            dialogC0602a.dismiss();
            return;
        }
        if (!dialogC0602a.f2071.startsWith("https://imgcache.qq.com/ptlogin/static/qzsjump.html?")) {
            long jElapsedRealtime = SystemClock.elapsedRealtime() - dialogC0602a.f2079;
            if (dialogC0602a.f2065 >= 1 || jElapsedRealtime >= dialogC0602a.f2078) {
                if (dialogC0602a.f2072 != null) {
                    dialogC0602a.f2072.loadUrl(DialogC0602a.m1999(dialogC0602a));
                    return;
                }
                return;
            } else {
                DialogC0602a.m1985(dialogC0602a);
                dialogC0602a.f2067.postDelayed(new RunnableC14707(this), 500L);
                return;
            }
        }
        dialogC0602a.f2082.mo5757(new C21139(i, str, str2));
        dialogC0602a.dismiss();
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        C11060.m25471("openSDK_LOG.AuthDialog", "-->onPageStarted, url: " + str);
        super.onPageStarted(webView, str, bitmap);
        DialogC0602a dialogC0602a = this.f39597;
        dialogC0602a.f2073.setVisibility(0);
        dialogC0602a.f2079 = SystemClock.elapsedRealtime();
        if (!TextUtils.isEmpty(dialogC0602a.f2071)) {
            dialogC0602a.f2067.removeCallbacks((Runnable) dialogC0602a.f2076.remove(dialogC0602a.f2071));
        }
        dialogC0602a.f2071 = str;
        RunnableC13367 runnableC13367 = new RunnableC13367(dialogC0602a, dialogC0602a.f2071);
        dialogC0602a.f2076.put(str, runnableC13367);
        dialogC0602a.f2067.postDelayed(runnableC13367, 120000L);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        C11060.m25471("openSDK_LOG.AuthDialog", "-->onPageFinished, url: " + str);
        DialogC0602a dialogC0602a = this.f39597;
        dialogC0602a.f2073.setVisibility(8);
        if (dialogC0602a.f2072 != null) {
            dialogC0602a.f2072.setVisibility(0);
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        dialogC0602a.f2067.removeCallbacks((Runnable) dialogC0602a.f2076.remove(str));
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(8)
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        try {
            C11060.m25467("openSDK_LOG.AuthDialog", "-->onReceivedSslError " + sslError.getPrimaryError() + "请求不合法，请检查手机安全设置，如系统时间、代理等");
        } catch (Throwable unused) {
            C11060.m25467("openSDK_LOG.AuthDialog", "-->onReceivedSslError 请求不合法，请检查手机安全设置，如系统时间、代理等");
        }
        sslErrorHandler.cancel();
    }
}
