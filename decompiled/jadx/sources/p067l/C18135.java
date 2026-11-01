package p067l;

import com.alipay.sdk.p010m.p016c0.C0094d;
import com.alipay.sdk.p010m.p037n.C0170a;
import com.alipay.sdk.p010m.p037n.C0171b;
import com.alipay.sdk.p010m.p037n.C0172c;
import com.alipay.sdk.p010m.p049t.AbstractC0213e;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.ܽۧ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 04FP */
/* JADX INFO: loaded from: classes4.dex */
public final class C18135 {

    /* JADX INFO: renamed from: ֫ */
    public static final Map f54163;

    /* JADX INFO: renamed from: ۧ */
    public static final C9163[] f54164;

    static {
        C9163 c9163 = new C9163(C9163.f24821, "");
        C13598 c13598 = C9163.f24825;
        C9163 c9164 = new C9163(c13598, "GET");
        C9163 c9165 = new C9163(c13598, "POST");
        C13598 c13599 = C9163.f24820;
        C9163 c9166 = new C9163(c13599, "/");
        C9163 c9167 = new C9163(c13599, "/index.html");
        C13598 c135910 = C9163.f24824;
        C9163 c9168 = new C9163(c135910, C0170a.f680s);
        C9163 c9169 = new C9163(c135910, C0171b.f688a);
        C13598 c135911 = C9163.f24822;
        C9163[] c9163Arr = {c9163, c9164, c9165, c9166, c9167, c9168, c9169, new C9163(c135911, "200"), new C9163(c135911, "204"), new C9163(c135911, "206"), new C9163(c135911, "304"), new C9163(c135911, "400"), new C9163(c135911, "404"), new C9163(c135911, "500"), new C9163("accept-charset", ""), new C9163("accept-encoding", "gzip, deflate"), new C9163("accept-language", ""), new C9163("accept-ranges", ""), new C9163("accept", ""), new C9163("access-control-allow-origin", ""), new C9163("age", ""), new C9163("allow", ""), new C9163("authorization", ""), new C9163("cache-control", ""), new C9163("content-disposition", ""), new C9163("content-encoding", ""), new C9163("content-language", ""), new C9163("content-length", ""), new C9163("content-location", ""), new C9163("content-range", ""), new C9163(AbstractC0213e.f982f, ""), new C9163("cookie", ""), new C9163("date", ""), new C9163("etag", ""), new C9163("expect", ""), new C9163("expires", ""), new C9163("from", ""), new C9163(C0172c.f710f, ""), new C9163("if-match", ""), new C9163("if-modified-since", ""), new C9163("if-none-match", ""), new C9163("if-range", ""), new C9163("if-unmodified-since", ""), new C9163("last-modified", ""), new C9163("link", ""), new C9163("location", ""), new C9163("max-forwards", ""), new C9163("proxy-authenticate", ""), new C9163("proxy-authorization", ""), new C9163("range", ""), new C9163("referer", ""), new C9163(C0094d.f387x, ""), new C9163("retry-after", ""), new C9163("server", ""), new C9163("set-cookie", ""), new C9163("strict-transport-security", ""), new C9163("transfer-encoding", ""), new C9163("user-agent", ""), new C9163("vary", ""), new C9163("via", ""), new C9163("www-authenticate", "")};
        f54164 = c9163Arr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(c9163Arr.length);
        for (int i = 0; i < c9163Arr.length; i++) {
            if (!linkedHashMap.containsKey(c9163Arr[i].f24827)) {
                linkedHashMap.put(c9163Arr[i].f24827, Integer.valueOf(i));
            }
        }
        f54163 = C21562.unmodifiableMap(linkedHashMap);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m41313(C13598 c13598) throws IOException {
        int iMo4707 = c13598.mo4707();
        for (int i = 0; i < iMo4707; i++) {
            byte bMo4696 = c13598.mo4696(i);
            if (bMo4696 >= 65 && bMo4696 <= 90) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + c13598.mo4706());
            }
        }
    }
}
