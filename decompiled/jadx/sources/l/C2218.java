package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۖ֫۠, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2218 extends AbstractC4203 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22406 f7265;

    @Override // l.InterfaceC21242
    /* JADX INFO: renamed from: ֫ */
    public final /* bridge */ /* synthetic */ Object mo2140(Object obj, AbstractC4308 abstractC4308) {
        return null;
    }

    @Override // l.AbstractC8247, l.InterfaceC21242
    /* JADX INFO: renamed from: ֫ */
    public final Object mo2141(C5138 c5138, Object obj) {
        c5138.f16077.mo2962(this, (C1755) obj);
        return null;
    }

    @Override // l.AbstractC8247, l.InterfaceC21242
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo7394(C10658 c10658, Object obj) {
        C1755 c1755 = (C1755) obj;
        m7395(c10658.f32059, c1755);
        c10658.f32060.mo2962(this, c1755);
        m7395(c10658.f32061, c1755);
        return null;
    }

    @Override // l.AbstractC8247, l.InterfaceC21242
    /* JADX INFO: renamed from: ֫ */
    public final Object mo2144(C19831 c19831, Object obj) {
        c19831.f64066.mo2962(this, (C1755) obj);
        return null;
    }

    @Override // l.AbstractC8247, l.InterfaceC21242
    /* JADX INFO: renamed from: ֫ */
    public final Object mo2145(C19955 c19955, Object obj) {
        C1755 c1755 = (C1755) obj;
        m7395(c19955.mo12938(), c1755);
        C22406 c22406 = this.f7265;
        if (!c22406.m50329(c1755, (AbstractC4308) c19955, true)) {
            C5746 c5746 = new C5746(c22406, c1755, null, c19955.f13890);
            AbstractC5144 abstractC5144 = c1755.f6074;
            abstractC5144.getClass();
            c22406.m50316((AbstractC5698) c5746, (InterfaceC3109) abstractC5144, (AbstractC5698) c1755.f6079.f17186, (AbstractC4308) c19955, c19955.f13890.f17562, true);
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m7395(C2609 c2609, C1755 c1755) {
        Iterator it = c2609.iterator();
        while (it.hasNext()) {
            m21837(c1755, (AbstractC4308) it.next());
        }
    }

    public C2218(C22406 c22406) {
        this.f7265 = c22406;
    }
}
