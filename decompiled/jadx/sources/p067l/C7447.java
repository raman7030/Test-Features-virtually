package p067l;

import java.util.WeakHashMap;

/* JADX INFO: renamed from: l.ۚ۫֨, reason: contains not printable characters */
/* JADX INFO: compiled from: W7SR */
/* JADX INFO: loaded from: classes2.dex */
public final class C7447 {

    /* JADX INFO: renamed from: ֫ */
    public WeakHashMap f19502 = new WeakHashMap();

    /* JADX INFO: renamed from: ֫ */
    public final C2752 m17196(AbstractC7783 abstractC7783, EnumC18298 enumC18298) {
        C4848<C2752> c4848 = (C4848) this.f19502.get(abstractC7783);
        if (c4848 == null) {
            return null;
        }
        for (C2752 c2752 : c4848) {
            if (c2752.f4636.f77961.mo6101().f23844 == enumC18298) {
                return c2752;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m17197(AbstractC7257 abstractC7257, C24626 c24626) {
        AbstractC7783 abstractC7783 = c24626.f77961.mo6101().f23847;
        WeakHashMap weakHashMap = this.f19502;
        C4848 c4848M10283 = (C4848) weakHashMap.get(abstractC7783);
        if (c4848M10283 == null) {
            c4848M10283 = C4848.m10283();
        }
        C2752 c2752 = new C2752();
        c2752.f4637 = abstractC7257;
        c2752.f4636 = c24626;
        weakHashMap.put(abstractC7783, c4848M10283.m10290(c2752));
    }
}
