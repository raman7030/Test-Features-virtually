package p067l;

/* JADX INFO: renamed from: l.۫ۚ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: M3ZI */
/* JADX INFO: loaded from: classes4.dex */
public class C13962 extends C15854 {

    /* JADX INFO: renamed from: ֫ */
    public AbstractC7257 f39426 = null;

    /* JADX INFO: renamed from: ۧ */
    public final AbstractC7783 f39427;

    @Override // p067l.C15854
    /* JADX INFO: renamed from: ۧ */
    public final void mo12739(AbstractC7257 abstractC7257) {
        if (abstractC7257 == null || this.f39426 != null) {
            return;
        }
        abstractC7257.mo3382(this);
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3780(C3626 c3626) {
        if (c3626.f7517 == this.f39427) {
            this.f39426 = c3626;
        } else {
            m35992(c3626.f7509);
        }
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3788(C5777 c5777) {
        if (c5777.f14182 == this.f39427) {
            this.f39426 = c5777;
        }
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3799(C9800 c9800) {
        if (c9800.f27116 == this.f39427) {
            this.f39426 = c9800;
        } else {
            super.mo3799(c9800);
        }
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3617(C7650 c7650) {
        if (c7650.f20027 == this.f39427) {
            this.f39426 = c7650;
        } else {
            super.mo3617(c7650);
        }
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3801(C10471 c10471) {
        if (c10471.f28960 == this.f39427) {
            this.f39426 = c10471;
        } else {
            super.mo3801(c10471);
        }
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3805(C11281 c11281) {
        if (c11281.f31438 == this.f39427) {
            this.f39426 = c11281;
        } else {
            super.mo3805(c11281);
        }
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3816(C15973 c15973) {
        AbstractC6462 abstractC6462 = c15973.f18925;
        if (abstractC6462 == null || abstractC6462.f16705 != this.f39427) {
            super.mo3816(c15973);
        } else {
            this.f39426 = c15973;
        }
    }

    public C13962(AbstractC7783 abstractC7783) {
        this.f39427 = abstractC7783;
    }
}
