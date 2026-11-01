package p067l;

import java.util.HashSet;

/* JADX INFO: renamed from: l.ۢ᩷᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 7A22 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11724 extends C20441 {
    @Override // p067l.C20441
    /* JADX INFO: renamed from: ֫ */
    public final void mo10677(C10738 c10738, HashSet hashSet) {
        AbstractC21112 abstractC21112M22664 = c10738.m24709().m22664(m34947(), true, C14760.f42088);
        if (abstractC21112M22664 != null) {
            hashSet.add(abstractC21112M22664);
        }
    }

    @Override // p067l.C20441
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo10678(C10738 c10738) {
        String lowerCase = m34943().toLowerCase();
        return c10738.m24709().f26820.equals(lowerCase) || ((ConcurrentMapC12768) c10738.m24721()).containsKey(lowerCase);
    }
}
