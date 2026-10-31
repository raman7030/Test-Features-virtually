package l;

import com.alipay.sdk.m.c0.d;
import com.alipay.sdk.m.n.a;
import com.alipay.sdk.m.n.b;
import com.alipay.sdk.m.n.c;
import com.alipay.sdk.m.t.e;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.ܽۧ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 04FP */
/* JADX INFO: loaded from: classes4.dex */
public final class C16590 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final Map f50986;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final C7150[] f50987;

    static {
        C7150 c7150 = new C7150(C7150.f21942, "");
        C11816 c11816 = C7150.f21946;
        C7150 c7151 = new C7150(c11816, "GET");
        C7150 c7152 = new C7150(c11816, "POST");
        C11816 c11817 = C7150.f21941;
        C7150 c7153 = new C7150(c11817, "/");
        C7150 c7154 = new C7150(c11817, "/index.html");
        C11816 c11818 = C7150.f21945;
        C7150 c7155 = new C7150(c11818, a.s);
        C7150 c7156 = new C7150(c11818, b.a);
        C11816 c11819 = C7150.f21943;
        C7150[] c7150Arr = {c7150, c7151, c7152, c7153, c7154, c7155, c7156, new C7150(c11819, "200"), new C7150(c11819, "204"), new C7150(c11819, "206"), new C7150(c11819, "304"), new C7150(c11819, "400"), new C7150(c11819, "404"), new C7150(c11819, "500"), new C7150("accept-charset", ""), new C7150("accept-encoding", "gzip, deflate"), new C7150("accept-language", ""), new C7150("accept-ranges", ""), new C7150("accept", ""), new C7150("access-control-allow-origin", ""), new C7150("age", ""), new C7150("allow", ""), new C7150("authorization", ""), new C7150("cache-control", ""), new C7150("content-disposition", ""), new C7150("content-encoding", ""), new C7150("content-language", ""), new C7150("content-length", ""), new C7150("content-location", ""), new C7150("content-range", ""), new C7150(e.f, ""), new C7150("cookie", ""), new C7150("date", ""), new C7150("etag", ""), new C7150("expect", ""), new C7150("expires", ""), new C7150("from", ""), new C7150(c.f, ""), new C7150("if-match", ""), new C7150("if-modified-since", ""), new C7150("if-none-match", ""), new C7150("if-range", ""), new C7150("if-unmodified-since", ""), new C7150("last-modified", ""), new C7150("link", ""), new C7150("location", ""), new C7150("max-forwards", ""), new C7150("proxy-authenticate", ""), new C7150("proxy-authorization", ""), new C7150("range", ""), new C7150("referer", ""), new C7150(d.x, ""), new C7150("retry-after", ""), new C7150("server", ""), new C7150("set-cookie", ""), new C7150("strict-transport-security", ""), new C7150("transfer-encoding", ""), new C7150("user-agent", ""), new C7150("vary", ""), new C7150("via", ""), new C7150("www-authenticate", "")};
        f50987 = c7150Arr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(c7150Arr.length);
        for (int i = 0; i < c7150Arr.length; i++) {
            if (!linkedHashMap.containsKey(c7150Arr[i].f21948)) {
                linkedHashMap.put(c7150Arr[i].f21948, Integer.valueOf(i));
            }
        }
        f50986 = C20195.unmodifiableMap(linkedHashMap);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m39087(C11816 c11816) throws IOException {
        int iMo2336 = c11816.mo2336();
        for (int i = 0; i < iMo2336; i++) {
            byte bMo2325 = c11816.mo2325(i);
            if (bMo2325 >= 65 && bMo2325 <= 90) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + c11816.mo2335());
            }
        }
    }
}
