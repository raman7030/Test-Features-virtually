package p067l;

/* JADX INFO: renamed from: l.ᩴۤ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 6428 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC20130 extends C15854 {

    /* JADX INFO: renamed from: ֫ */
    public C20271 f62320;

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public void mo3799(C9800 c9800) {
    }

    /* JADX INFO: renamed from: ᩳ */
    public abstract void mo17118();

    /* JADX INFO: renamed from: ֫ */
    public final void m45570(C6048 c6048) {
        this.f62320.m45777(c6048);
        mo17118();
    }

    /* JADX INFO: renamed from: ֫ */
    private EnumC5377 m45568(AbstractC7257 abstractC7257, C20271 c20271, EnumC4707 enumC4707) {
        this.f62320 = c20271;
        boolean z = false;
        for (C4848 c4848M45783 = this.f62320.m45783(); c4848M45783.m10293(); c4848M45783 = c4848M45783.f11035) {
            C6048 c6048 = (C6048) c4848M45783.f11034;
            if (c6048.f15194.m16617(enumC4707.f10647) && enumC4707.mo9981(c6048.f15194) == abstractC7257) {
                c6048.mo13630();
                z = true;
            } else {
                this.f62320.m45777(c6048);
            }
        }
        return EnumC5377.m11758(z);
    }

    /* JADX INFO: renamed from: ܽ */
    public final EnumC5377 m45573(AbstractC7257 abstractC7257) {
        return m45568(abstractC7257, new C20271(), EnumC4707.f10644);
    }

    /* JADX INFO: renamed from: ֫ */
    public final EnumC5377 m45569(AbstractC7257 abstractC7257, C20271 c20271) {
        return m45568(abstractC7257, c20271, EnumC4707.f10645);
    }

    /* JADX INFO: renamed from: ۧ */
    public final EnumC5377 m45572(AbstractC7257 abstractC7257, C20271 c20271) {
        return m45568(abstractC7257, c20271, EnumC4707.f10643);
    }

    @Override // p067l.C15854
    /* JADX INFO: renamed from: ۧ */
    public void mo12739(AbstractC7257 abstractC7257) {
        if (abstractC7257 != null) {
            AbstractC6462 abstractC6462 = abstractC7257.f18925;
            if (abstractC6462 == null || abstractC6462 != AbstractC6462.f16701) {
                abstractC7257.mo3382(this);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m45571(AbstractC7257 abstractC7257, C18537 c18537) {
        if (abstractC7257.m16617(EnumC19998.f60779)) {
            c18537.f55352 = -1;
            C4575 c4575M42202 = c18537.m42202(null);
            c4575M42202.f10247 = abstractC7257;
            mo12739(c4575M42202);
            return;
        }
        c18537.f55352 = -1;
        C6309 c6309M42149 = c18537.m42149((AbstractC12224) null);
        c6309M42149.f16360 = abstractC7257;
        mo12739(c6309M42149);
    }
}
