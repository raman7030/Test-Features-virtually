package p067l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.֨᩹ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 64HS */
/* JADX INFO: loaded from: classes2.dex */
public class C3702 {

    /* JADX INFO: renamed from: ֫ */
    public HashMap f7824 = new HashMap();

    /* JADX INFO: renamed from: ۧ */
    public HashMap f7825 = new HashMap();

    /* JADX INFO: renamed from: ֫ */
    public C15041 mo7135(C15041 c15041) {
        HashMap map = this.f7824;
        C15041 c15042 = (C15041) map.get(c15041);
        if (c15042 != null) {
            return c15042;
        }
        C15041 c15043 = new C15041();
        map.put(c15041, c15043);
        return c15043;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C19736 m7136(C19736 c19736) {
        HashMap map = this.f7825;
        C19736 c19737 = (C19736) map.get(c19736);
        if (c19737 != null) {
            return c19737;
        }
        C19736 c19738 = (C19736) c19736.clone();
        map.put(c19736, c19738);
        return c19738;
    }
}
