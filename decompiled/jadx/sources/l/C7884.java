package l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.۠ۖۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 5BM7 */
/* JADX INFO: loaded from: classes3.dex */
public class C7884 extends AbstractC5447 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public HashMap f24430 = new HashMap();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C0828 m21166(String str, String str2) {
        HashMap map = this.f24430;
        C0828 c0828 = (C0828) map.get(str);
        if (c0828 != null) {
            return c0828;
        }
        C0828 c0829 = new C0828(str);
        c0829.m3086(str, str2);
        map.put(str, c0829);
        return c0829;
    }
}
