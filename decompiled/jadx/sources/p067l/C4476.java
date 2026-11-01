package p067l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۖ֫۠, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4476 extends AbstractC6363 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C23663 f10053;

    @Override // p067l.InterfaceC22556
    /* JADX INFO: renamed from: ֫ */
    public final /* bridge */ /* synthetic */ Object mo4507(Object obj, AbstractC6462 abstractC6462) {
        return null;
    }

    @Override // p067l.AbstractC10206, p067l.InterfaceC22556
    /* JADX INFO: renamed from: ֫ */
    public final Object mo4508(C7251 c7251, Object obj) {
        c7251.f18916.mo5291(this, (C4036) obj);
        return null;
    }

    @Override // p067l.AbstractC10206, p067l.InterfaceC22556
    /* JADX INFO: renamed from: ֫ */
    public final Object mo9477(C12497 c12497, Object obj) {
        C4036 c4036 = (C4036) obj;
        m9478(c12497.f35030, c4036);
        c12497.f35031.mo5291(this, c4036);
        m9478(c12497.f35032, c4036);
        return null;
    }

    @Override // p067l.AbstractC10206, p067l.InterfaceC22556
    /* JADX INFO: renamed from: ֫ */
    public final Object mo4511(C21215 c21215, Object obj) {
        c21215.f66703.mo5291(this, (C4036) obj);
        return null;
    }

    @Override // p067l.AbstractC10206, p067l.InterfaceC22556
    /* JADX INFO: renamed from: ֫ */
    public final Object mo4512(C21333 c21333, Object obj) {
        C4036 c4036 = (C4036) obj;
        m9478(c21333.mo14802(), c4036);
        C23663 c23663 = this.f10053;
        if (!c23663.m52669(c4036, (AbstractC6462) c21333, true)) {
            C7829 c7829 = new C7829(c23663, c4036, null, c21333.f16705);
            AbstractC7257 abstractC7257 = c4036.f8850;
            abstractC7257.getClass();
            c23663.m52656((AbstractC7783) c7829, (InterfaceC5323) abstractC7257, (AbstractC7783) c4036.f8855.f20027, (AbstractC6462) c21333, c21333.f16705.f20408, true);
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m9478(C4848 c4848, C4036 c4036) {
        Iterator it = c4848.iterator();
        while (it.hasNext()) {
            m23807(c4036, (AbstractC6462) it.next());
        }
    }

    public C4476(C23663 c23663) {
        this.f10053 = c23663;
    }
}
