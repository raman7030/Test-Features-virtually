package l;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebView;
import com.alipay.sdk.m.w.a;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: l.ۢ᩹ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes3.dex */
public final class C9872 extends C17611 {
    @Override // l.C17611
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo24963(WebView webView, String str) {
        C9145.m23518("openSDK_LOG.SecureJsBridge", "-->canHandleUrl---url = ".concat(str));
        if (Uri.parse(str).getScheme().equals("jsbridge")) {
            ArrayList arrayList = new ArrayList(Arrays.asList(str.concat("/#").split("/")));
            if (arrayList.size() >= 7) {
                String str2 = (String) arrayList.get(2);
                String str3 = (String) arrayList.get(3);
                String str4 = (String) arrayList.get(4);
                String str5 = (String) arrayList.get(5);
                StringBuilder sbM10501 = C3435.m10501("-->canHandleUrl, objectName: ", str2, " | methodName: ", str3, " | snStr: ");
                sbM10501.append(str4);
                C9145.m23518("openSDK_LOG.SecureJsBridge", sbM10501.toString());
                if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
                    try {
                        C9166 c9166 = new C9166(webView, Long.parseLong(str4), str5);
                        List listSubList = arrayList.subList(6, arrayList.size() - 1);
                        C9145.m23520("openSDK_LOG.SecureJsBridge", "-->getResult, objectName: " + str2 + " | methodName: " + str3);
                        int size = listSubList.size();
                        for (int i = 0; i < size; i++) {
                            try {
                                listSubList.set(i, C2912.decode((String) listSubList.get(i), a.D));
                            } catch (UnsupportedEncodingException unused) {
                            }
                        }
                        C12483 c12483 = (C12483) this.f53804.get(str2);
                        if (c12483 != null) {
                            C9145.m23513("openSDK_LOG.SecureJsBridge", "-->handler != null");
                            c12483.m30638(str3, listSubList, c9166);
                        } else {
                            C9145.m23516("openSDK_LOG.SecureJsBridge", "-->handler == null objName: " + str2);
                            c9166.mo23576();
                        }
                        return true;
                    } catch (Exception unused2) {
                    }
                }
            }
        }
        return false;
    }
}
