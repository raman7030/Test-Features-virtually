package p067l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.۠ۖۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 5BM7 */
/* JADX INFO: loaded from: classes3.dex */
public class C9861 extends AbstractC7545 {

    /* JADX INFO: renamed from: ۙ */
    public HashMap f27346 = new HashMap();

    /* JADX INFO: renamed from: ֫ */
    public final C3155 m23131(String str, String str2) {
        HashMap map = this.f27346;
        C3155 c3155 = (C3155) map.get(str);
        if (c3155 != null) {
            return c3155;
        }
        C3155 c3156 = new C3155(str);
        c3156.m5400(str, str2);
        map.put(str, c3156);
        return c3156;
    }
}
