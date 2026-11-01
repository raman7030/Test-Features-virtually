package p067l;

import java.util.HashSet;

/* JADX INFO: renamed from: l.ۖ᩷᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 7A22 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5018 extends C20441 {
    @Override // p067l.C20441
    /* JADX INFO: renamed from: ֫ */
    public final void mo10677(C10738 c10738, HashSet hashSet) {
        String lowerCase = m34943().toLowerCase();
        if (c10738.m24709().f26820.equalsIgnoreCase(lowerCase)) {
            hashSet.addAll(c10738.m24709().m22662(m34945(), m34948(), C14760.f42088));
        } else if (c10738.m24707().containsKey(lowerCase)) {
            new C17757(m34943(), EnumC13420.TYPE_PTR, m34945(), m34948()).mo10677(c10738, hashSet);
        } else {
            m46126(c10738, hashSet, (C21467) ((ConcurrentMapC12768) c10738.m24721()).get(lowerCase));
        }
    }

    @Override // p067l.C20441
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo10678(C10738 c10738) {
        String lowerCase = m34943().toLowerCase();
        return c10738.m24709().f26820.equals(lowerCase) || ((ConcurrentMapC12768) c10738.m24721()).containsKey(lowerCase);
    }
}
