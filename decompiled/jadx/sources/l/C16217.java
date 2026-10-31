package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ܺ᩹֨, reason: contains not printable characters */
/* JADX INFO: compiled from: T57T */
/* JADX INFO: loaded from: classes5.dex */
public final class C16217 extends C14190 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C1755 f49917;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public AbstractC5144 f49918;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C18837 f49919 = new C18837();

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4224 f49920;

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1372(C2735 c2735) {
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1215(C5557 c5557) {
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1388(C8526 c8526) {
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1217(C14169 c14169) {
    }

    @Override // l.C14190
    /* JADX INFO: renamed from: ۧ */
    public final void mo10758(AbstractC5144 abstractC5144) {
        if (abstractC5144 != null) {
            for (AbstractC9163 abstractC9163 : this.f49920.f13707) {
                if (abstractC9163.f27734.f13704.contains(abstractC9163.f27732) && abstractC5144.m14709(abstractC9163.f27733) && abstractC9163.mo19028(abstractC5144)) {
                    Iterator it = abstractC9163.mo19029(abstractC5144).iterator();
                    while (it.hasNext()) {
                        this.f49919.m43511(new C9869(this.f49920, this.f49918, abstractC5144, (AbstractC5144) it.next(), abstractC9163, this.f49917));
                    }
                    break;
                }
            }
        }
        super.mo10758(abstractC5144);
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1421(C20374 c20374) {
        mo10758(c20374.f65771);
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1389(C8672 c8672) {
        mo10758(c8672.f26445);
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1397(C11907 c11907) {
        mo10758(c11907.f35588);
        m33860(c11907.f35586);
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1378(C4851 c4851) {
        mo10758(c4851.f15326);
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1426(C22637 c22637) {
        mo10758(c22637.f73103);
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1396(C10789 c10789) {
        mo10758(c10789.f32445);
        m33860(c10789.f32449);
        mo10758(c10789.f32448);
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1368(C1470 c1470) {
        mo10758(c1470.f5225);
    }

    public C16217(C4224 c4224, AbstractC5144 abstractC5144, C1755 c1755) {
        this.f49920 = c4224;
        this.f49918 = abstractC5144;
        c4224.f13708.getClass();
        this.f49917 = C9310.m23919(c1755);
    }
}
