package p067l;

/* JADX INFO: renamed from: l.ۗ᩺֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 8459 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5732 extends C15854 {

    /* JADX INFO: renamed from: ֫ */
    public boolean f14040;

    /* JADX INFO: renamed from: ۧ */
    public AbstractC7783 f14041;

    @Override // p067l.C15854
    /* JADX INFO: renamed from: ۧ */
    public final void mo12739(AbstractC7257 abstractC7257) {
        if (abstractC7257 == null || this.f14041 == null) {
            return;
        }
        abstractC7257.mo3382(this);
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3806(C11674 c11674) {
        if (C9268.m21438(c11674.f32571) == this.f14041) {
            this.f14040 = true;
        } else {
            super.mo3806(c11674);
        }
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3795(C8598 c8598) {
        if (C9268.m21438(c8598.f23105) != this.f14041) {
            mo12739(c8598.f23105);
        } else {
            this.f14040 = true;
        }
    }
}
