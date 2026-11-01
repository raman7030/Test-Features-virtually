package p067l;

/* JADX INFO: renamed from: l.ܺ۬֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 542M */
/* JADX INFO: loaded from: classes5.dex */
public final class C17523 extends C15854 {

    /* JADX INFO: renamed from: ֫ */
    public boolean f52379;

    /* JADX INFO: renamed from: ۧ */
    public C6953 f52380;

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ C16852 f52381;

    /* JADX INFO: renamed from: ܿ */
    public final /* synthetic */ C3626 f52382;

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ C7650 f52383;

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3785(C4968 c4968) {
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3826(C19049 c19049) {
    }

    public C17523(C16852 c16852, C4036 c4036, C7650 c7650, C3626 c3626) {
        this.f52381 = c16852;
        this.f52383 = c7650;
        this.f52382 = c3626;
        this.f52380 = ((C10545) c4036.f8849).f29205;
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3801(C10471 c10471) {
        if (C16852.m38238(this.f52381, (AbstractC7783) c10471.f28960)) {
            C6953 c6953 = this.f52380;
            try {
                C6953 c6953M15933 = c6953.m15933(c10471.f28960);
                this.f52380 = c6953M15933;
                if (c6953M15933.m15935(EnumC21706.EXPORTS)) {
                    super.mo3801(c10471);
                }
            } finally {
                this.f52380 = c6953;
            }
        }
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3805(C11281 c11281) {
        if (C16852.m38238(this.f52381, c11281.f31438) || c11281.f31438.f20407.f20405 == EnumC3600.f7343) {
            C6953 c6953 = this.f52380;
            try {
                C6953 c6953M15933 = c6953.m15933(c11281.f31438);
                this.f52380 = c6953M15933;
                if (c6953M15933.m15935(EnumC21706.EXPORTS)) {
                    mo12739(c11281.f31435);
                    mo12739(c11281.f31437);
                }
            } finally {
                this.f52380 = c6953;
            }
        }
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3617(C7650 c7650) {
        if (c7650 == this.f52383 && C16852.m38238(this.f52381, c7650.f20027)) {
            C6953 c6953 = this.f52380;
            try {
                C6953 c6953M15933 = c6953.m15933(c7650.f20027);
                this.f52380 = c6953M15933;
                if (c6953M15933.m15935(EnumC21706.EXPORTS)) {
                    mo12739(c7650.f20022);
                    m35992(c7650.f20026);
                    try {
                        this.f52379 = true;
                        mo12739(c7650.f20025);
                        m35992(c7650.f20024);
                        this.f52379 = false;
                        m35992(c7650.f20020);
                    } catch (Throwable th) {
                        this.f52379 = false;
                        throw th;
                    }
                }
                this.f52380 = c6953;
            } catch (Throwable th2) {
                this.f52380 = c6953;
                throw th2;
            }
        }
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3824(C17985 c17985) {
        mo12739(c17985.f53722);
        boolean z = this.f52379;
        try {
            this.f52379 = false;
            m35992(c17985.f53721);
        } finally {
            this.f52379 = z;
        }
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3798(C9661 c9661) {
        AbstractC7783 abstractC7783M21438 = C9268.m21438(c9661);
        if (abstractC7783M21438.f20405 != EnumC3600.f7354 || abstractC7783M21438.f20406.m14777(EnumC11353.TYPEVAR)) {
            return;
        }
        C16852.m38232(this.f52381, c9661, abstractC7783M21438, this.f52382.f7517, this.f52379);
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3794(C8320 c8320) {
        AbstractC7783 abstractC7783M21438 = C9268.m21438(c8320);
        AbstractC7783 abstractC7783M21439 = C9268.m21438(c8320.f22261);
        if (abstractC7783M21438.f20405 != EnumC3600.f7354 || abstractC7783M21439.f20405 != EnumC3600.f7351) {
            mo12739(c8320.f22261);
            return;
        }
        C16852.m38232(this.f52381, c8320, abstractC7783M21438, this.f52382.f7517, this.f52379);
    }
}
