package l;

import java.util.HashSet;

/* JADX INFO: renamed from: l.ۖ᩷᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 7A22 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2787 extends C19015 {
    @Override // l.C19015
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo8617(C8806 c8806, HashSet hashSet) {
        String lowerCase = m32828().toLowerCase();
        if (c8806.m22739().f23907.equalsIgnoreCase(lowerCase)) {
            hashSet.addAll(c8806.m22739().m20682(m32830(), m32833(), C13038.f39042));
        } else if (c8806.m22737().containsKey(lowerCase)) {
            new C16191(m32828(), EnumC11628.TYPE_PTR, m32830(), m32833()).mo8617(c8806, hashSet);
        } else {
            m43858(c8806, hashSet, (C20095) ((ConcurrentMapC10942) c8806.m22751()).get(lowerCase));
        }
    }

    @Override // l.C19015
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo8618(C8806 c8806) {
        String lowerCase = m32828().toLowerCase();
        return c8806.m22739().f23907.equals(lowerCase) || ((ConcurrentMapC10942) c8806.m22751()).containsKey(lowerCase);
    }
}
