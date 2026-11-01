package p067l;

import java.util.HashSet;

/* JADX INFO: renamed from: l.ۘ᩷᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 7A22 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6359 extends C20441 {
    @Override // p067l.C20441
    /* JADX INFO: renamed from: ֫ */
    public final void mo10677(C10738 c10738, HashSet hashSet) {
        m46126(c10738, hashSet, (C21467) ((ConcurrentMapC12768) c10738.m24721()).get(m34943().toLowerCase()));
    }

    @Override // p067l.C20441
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo10678(C10738 c10738) {
        String lowerCase = m34943().toLowerCase();
        return c10738.m24709().f26820.equals(lowerCase) || ((ConcurrentMapC12768) c10738.m24721()).containsKey(lowerCase);
    }
}
