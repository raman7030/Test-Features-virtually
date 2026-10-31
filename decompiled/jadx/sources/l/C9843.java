package l;

import java.util.HashSet;

/* JADX INFO: renamed from: l.ۢ᩷᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 7A22 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9843 extends C19015 {
    @Override // l.C19015
    /* JADX INFO: renamed from: ֫ */
    public final void mo8617(C8806 c8806, HashSet hashSet) {
        AbstractC19721 abstractC19721M20684 = c8806.m22739().m20684(m32832(), true, C13038.f39042);
        if (abstractC19721M20684 != null) {
            hashSet.add(abstractC19721M20684);
        }
    }

    @Override // l.C19015
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo8618(C8806 c8806) {
        String lowerCase = m32828().toLowerCase();
        return c8806.m22739().f23907.equals(lowerCase) || ((ConcurrentMapC10942) c8806.m22751()).containsKey(lowerCase);
    }
}
