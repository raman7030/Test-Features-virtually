package l;

import android.net.Uri;
import android.webkit.WebView;
import com.alipay.sdk.m.w.a;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: l.ܿ᩸ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes4.dex */
public class C17611 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public HashMap f53804 = new HashMap();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m41168(C12483 c12483, String str) {
        this.f53804.put(str, c12483);
    }

    /* JADX INFO: renamed from: ֫ */
    public boolean mo24963(WebView webView, String str) {
        C9145.m23520("openSDK_LOG.JsBridge", "-->canHandleUrl---url = " + str);
        if (str != null && Uri.parse(str).getScheme().equals("jsbridge")) {
            ArrayList arrayList = new ArrayList(Arrays.asList(str.concat("/#").split("/")));
            if (arrayList.size() >= 6) {
                String str2 = (String) arrayList.get(2);
                String str3 = (String) arrayList.get(3);
                List listSubList = arrayList.subList(4, arrayList.size() - 1);
                C13188 c13188 = new C13188(webView, 4L);
                C9145.m23520("openSDK_LOG.JsBridge", "getResult---objName = " + str2 + " methodName = " + str3);
                int size = listSubList.size();
                for (int i = 0; i < size; i++) {
                    try {
                        listSubList.set(i, C2912.decode((String) listSubList.get(i), a.D));
                    } catch (UnsupportedEncodingException unused) {
                    }
                }
                C12483 c12483 = (C12483) this.f53804.get(str2);
                if (c12483 != null) {
                    C9145.m23513("openSDK_LOG.JsBridge", "call----");
                    c12483.m30638(str3, listSubList, c13188);
                } else {
                    C9145.m23513("openSDK_LOG.JsBridge", "not call----objName NOT FIND");
                    c13188.mo23576();
                }
                return true;
            }
        }
        return false;
    }
}
