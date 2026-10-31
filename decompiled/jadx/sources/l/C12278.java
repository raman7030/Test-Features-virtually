package l;

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
import com.tencent.connect.auth.a;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.۫۠ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes3.dex */
public final class C12278 extends WebViewClient {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ a f36581;

    public C12278(a aVar) {
        this.f36581 = aVar;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Uri uri;
        C9145.m23520("openSDK_LOG.AuthDialog", "-->Redirect URL: " + str);
        boolean zStartsWith = str.startsWith("auth://browser");
        a aVar = this.f36581;
        if (zStartsWith) {
            JSONObject jSONObjectM42745 = C18338.m42745(str);
            aVar.f872 = a.m905(aVar);
            if (!aVar.f872) {
                if (jSONObjectM42745.optString("fail_cb", null) != null) {
                    aVar.m917(jSONObjectM42745.optString("fail_cb"));
                    return true;
                }
                if (jSONObjectM42745.optInt("fall_to_wv") == 1) {
                    a.m904(aVar, aVar.f884.indexOf("?") > -1 ? com.alipay.sdk.m.w.a.p : "?");
                    a.m904(aVar, "browser_error=1");
                    if (aVar.f875 != null) {
                        aVar.f875.loadUrl(aVar.f884);
                        return true;
                    }
                } else {
                    String strOptString = jSONObjectM42745.optString("redir", null);
                    if (strOptString != null && aVar.f875 != null) {
                        aVar.f875.loadUrl(strOptString);
                        return true;
                    }
                }
            }
        } else {
            if (str.startsWith("auth://tauth.qq.com/")) {
                aVar.f885.mo3455(C18338.m42745(str));
                aVar.dismiss();
                return true;
            }
            if (str.startsWith("auth://cancel")) {
                aVar.f885.mo3453();
                aVar.dismiss();
                return true;
            }
            if (str.startsWith("auth://close")) {
                aVar.dismiss();
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
                    aVar.f886.startActivity(intent);
                    return true;
                } catch (Exception e) {
                    C9145.m23514("openSDK_LOG.AuthDialog", "-->start download activity exception, e: ", e);
                    return true;
                }
            }
            try {
                if (str.startsWith("auth://progress")) {
                    List<String> pathSegments = Uri.parse(str).getPathSegments();
                    if (!pathSegments.isEmpty()) {
                        int iIntValue = Integer.valueOf(pathSegments.get(0)).intValue();
                        if (iIntValue == 0) {
                            aVar.f876.setVisibility(8);
                            if (aVar.f875 != null) {
                                aVar.f875.setVisibility(0);
                                return true;
                            }
                        } else if (iIntValue == 1) {
                            aVar.f876.setVisibility(0);
                            return true;
                        }
                    }
                } else if (!str.startsWith("auth://onLoginSubmit")) {
                    if (!aVar.f878.mo24963(aVar.f875, str)) {
                        C9145.m23518("openSDK_LOG.AuthDialog", "-->Redirect URL: return false");
                        return false;
                    }
                } else {
                    List<String> pathSegments2 = Uri.parse(str).getPathSegments();
                    if (!pathSegments2.isEmpty()) {
                        aVar.f880 = pathSegments2.get(0);
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
        C9145.m23518("openSDK_LOG.AuthDialog", "-->onReceivedError, errorCode: " + i + " | description: " + str);
        a aVar = this.f36581;
        if (!C18338.m42739(aVar.f886)) {
            aVar.f885.mo3454(new C19750(9001, "当前网络不可用，请稍后重试！", str2));
            aVar.dismiss();
            return;
        }
        if (!aVar.f874.startsWith("https://imgcache.qq.com/ptlogin/static/qzsjump.html?")) {
            long jElapsedRealtime = SystemClock.elapsedRealtime() - aVar.f882;
            if (aVar.f868 >= 1 || jElapsedRealtime >= aVar.f881) {
                if (aVar.f875 != null) {
                    aVar.f875.loadUrl(a.m913(aVar));
                    return;
                }
                return;
            } else {
                a.m899(aVar);
                aVar.f870.postDelayed(new RunnableC12983(this), 500L);
                return;
            }
        }
        aVar.f885.mo3454(new C19750(i, str, str2));
        aVar.dismiss();
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        C9145.m23520("openSDK_LOG.AuthDialog", "-->onPageStarted, url: " + str);
        super.onPageStarted(webView, str, bitmap);
        a aVar = this.f36581;
        aVar.f876.setVisibility(0);
        aVar.f882 = SystemClock.elapsedRealtime();
        if (!TextUtils.isEmpty(aVar.f874)) {
            aVar.f870.removeCallbacks((Runnable) aVar.f879.remove(aVar.f874));
        }
        aVar.f874 = str;
        RunnableC11573 runnableC11573 = new RunnableC11573(aVar, aVar.f874);
        aVar.f879.put(str, runnableC11573);
        aVar.f870.postDelayed(runnableC11573, 120000L);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        C9145.m23520("openSDK_LOG.AuthDialog", "-->onPageFinished, url: " + str);
        a aVar = this.f36581;
        aVar.f876.setVisibility(8);
        if (aVar.f875 != null) {
            aVar.f875.setVisibility(0);
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        aVar.f870.removeCallbacks((Runnable) aVar.f879.remove(str));
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(8)
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        try {
            C9145.m23516("openSDK_LOG.AuthDialog", "-->onReceivedSslError " + sslError.getPrimaryError() + "请求不合法，请检查手机安全设置，如系统时间、代理等");
        } catch (Throwable unused) {
            C9145.m23516("openSDK_LOG.AuthDialog", "-->onReceivedSslError 请求不合法，请检查手机安全设置，如系统时间、代理等");
        }
        sslErrorHandler.cancel();
    }
}
