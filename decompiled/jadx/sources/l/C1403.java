package l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.֨᩹ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 64HS */
/* JADX INFO: loaded from: classes2.dex */
public class C1403 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public HashMap f5053 = new HashMap();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public HashMap f5054 = new HashMap();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C13334 mo4896(C13334 c13334) {
        HashMap map = this.f5053;
        C13334 c13335 = (C13334) map.get(c13334);
        if (c13335 != null) {
            return c13335;
        }
        C13334 c13336 = new C13334();
        map.put(c13334, c13336);
        return c13336;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C18274 m4897(C18274 c18274) {
        HashMap map = this.f5054;
        C18274 c18275 = (C18274) map.get(c18274);
        if (c18275 != null) {
            return c18275;
        }
        C18274 c18276 = (C18274) c18274.clone();
        map.put(c18274, c18276);
        return c18276;
    }
}
