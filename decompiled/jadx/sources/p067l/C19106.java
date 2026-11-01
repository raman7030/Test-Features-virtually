package p067l;

import android.net.Uri;
import android.webkit.WebView;
import com.alipay.sdk.p010m.p055w.C0233a;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: l.ܿ᩸ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes4.dex */
public class C19106 {

    /* JADX INFO: renamed from: ֫ */
    public HashMap f56998 = new HashMap();

    /* JADX INFO: renamed from: ֫ */
    public final void m43414(C14232 c14232, String str) {
        this.f56998.put(str, c14232);
    }

    /* JADX INFO: renamed from: ֫ */
    public boolean mo26978(WebView webView, String str) {
        C11060.m25471("openSDK_LOG.JsBridge", "-->canHandleUrl---url = " + str);
        if (str != null && Uri.parse(str).getScheme().equals("jsbridge")) {
            ArrayList arrayList = new ArrayList(Arrays.asList(str.concat("/#").split("/")));
            if (arrayList.size() >= 6) {
                String str2 = (String) arrayList.get(2);
                String str3 = (String) arrayList.get(3);
                List listSubList = arrayList.subList(4, arrayList.size() - 1);
                C14902 c14902 = new C14902(webView, 4L);
                C11060.m25471("openSDK_LOG.JsBridge", "getResult---objName = " + str2 + " methodName = " + str3);
                int size = listSubList.size();
                for (int i = 0; i < size; i++) {
                    try {
                        listSubList.set(i, C5136.decode((String) listSubList.get(i), C0233a.f1077D));
                    } catch (UnsupportedEncodingException unused) {
                    }
                }
                C14232 c14232 = (C14232) this.f56998.get(str2);
                if (c14232 != null) {
                    C11060.m25464("openSDK_LOG.JsBridge", "call----");
                    c14232.m32703(str3, listSubList, c14902);
                } else {
                    C11060.m25464("openSDK_LOG.JsBridge", "not call----objName NOT FIND");
                    c14902.mo25527();
                }
                return true;
            }
        }
        return false;
    }
}
