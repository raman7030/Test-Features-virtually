package p067l;

import android.content.res.AssetManager;
import android.webkit.WebResourceResponse;
import com.alipay.sdk.p010m.p055w.C0233a;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۗܿܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 46LH */
/* JADX INFO: loaded from: classes2.dex */
public final class C5582 {

    /* JADX INFO: renamed from: ֫ */
    public final AssetManager f13486;

    public C5582(AssetManager assetManager) {
        this.f13486 = assetManager;
    }

    /* JADX INFO: renamed from: ֫ */
    public final WebResourceResponse m12351(String str) {
        String strSubstring = str.startsWith("/_mt_markdown_vendor_/") ? str.substring(22) : "";
        if (!strSubstring.equals("katex.min.css") && !strSubstring.equals("katex.min.js")) {
            return C4912.m10429(404, "Not Found");
        }
        try {
            return new WebResourceResponse(strSubstring.endsWith(".js") ? "application/javascript" : "text/css", C0233a.f1077D, 200, "OK", C17520.m39894(), this.f13486.open("markdown-preview/".concat(strSubstring)));
        } catch (IOException unused) {
            return C4912.m10429(404, "Not Found");
        }
    }
}
