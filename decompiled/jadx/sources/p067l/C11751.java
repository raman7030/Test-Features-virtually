package p067l;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebView;
import com.alipay.sdk.p010m.p055w.C0233a;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: l.ۢ᩹ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes3.dex */
public final class C11751 extends C19106 {
    @Override // p067l.C19106
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo26978(WebView webView, String str) {
        C11060.m25469("openSDK_LOG.SecureJsBridge", "-->canHandleUrl---url = ".concat(str));
        if (Uri.parse(str).getScheme().equals("jsbridge")) {
            ArrayList arrayList = new ArrayList(Arrays.asList(str.concat("/#").split("/")));
            if (arrayList.size() >= 7) {
                String str2 = (String) arrayList.get(2);
                String str3 = (String) arrayList.get(3);
                String str4 = (String) arrayList.get(4);
                String str5 = (String) arrayList.get(5);
                StringBuilder sbM12525 = C5633.m12525("-->canHandleUrl, objectName: ", str2, " | methodName: ", str3, " | snStr: ");
                sbM12525.append(str4);
                C11060.m25469("openSDK_LOG.SecureJsBridge", sbM12525.toString());
                if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
                    try {
                        C11080 c11080 = new C11080(webView, Long.parseLong(str4), str5);
                        List listSubList = arrayList.subList(6, arrayList.size() - 1);
                        C11060.m25471("openSDK_LOG.SecureJsBridge", "-->getResult, objectName: " + str2 + " | methodName: " + str3);
                        int size = listSubList.size();
                        for (int i = 0; i < size; i++) {
                            try {
                                listSubList.set(i, C5136.decode((String) listSubList.get(i), C0233a.f1077D));
                            } catch (UnsupportedEncodingException unused) {
                            }
                        }
                        C14232 c14232 = (C14232) this.f56998.get(str2);
                        if (c14232 != null) {
                            C11060.m25464("openSDK_LOG.SecureJsBridge", "-->handler != null");
                            c14232.m32703(str3, listSubList, c11080);
                        } else {
                            C11060.m25467("openSDK_LOG.SecureJsBridge", "-->handler == null objName: " + str2);
                            c11080.mo25527();
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
