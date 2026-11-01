package p067l;

import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* JADX INFO: renamed from: l.ܶۘۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: VA9Z */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16607 {

    /* JADX INFO: renamed from: ֫ */
    public long f48775;

    /* JADX INFO: renamed from: ۖ */
    public InterfaceC20790 f48776;

    /* JADX INFO: renamed from: ۜ */
    public int f48777;

    /* JADX INFO: renamed from: ۡ */
    public int f48778;

    /* JADX INFO: renamed from: ۧ */
    public InterfaceC23116 f48780;

    /* JADX INFO: renamed from: ܳ */
    public InterfaceC2525 f48781;

    /* JADX INFO: renamed from: ܺ */
    public long f48782;

    /* JADX INFO: renamed from: ܽ */
    public boolean f48783;

    /* JADX INFO: renamed from: ᩳ */
    public long f48785;

    /* JADX INFO: renamed from: ᩷ */
    public boolean f48786;

    /* JADX INFO: renamed from: ᩻ */
    public long f48787;

    /* JADX INFO: renamed from: ܿ */
    public final C19961 f48784 = new C19961();

    /* JADX INFO: renamed from: ۢ */
    public C3196 f48779 = new C3196();

    /* JADX INFO: renamed from: ֫ */
    public abstract long mo9592(C19203 c19203);

    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    /* JADX INFO: renamed from: ֫ */
    public abstract boolean mo9594(C19203 c19203, long j, C3196 c3196);

    /* JADX INFO: renamed from: ֫ */
    public final void m37631(InterfaceC23116 interfaceC23116, InterfaceC20790 interfaceC20790) {
        this.f48780 = interfaceC23116;
        this.f48776 = interfaceC20790;
        mo9593(true);
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo9593(boolean z) {
        if (z) {
            this.f48779 = new C3196();
            this.f48787 = 0L;
            this.f48778 = 0;
        } else {
            this.f48778 = 1;
        }
        this.f48782 = -1L;
        this.f48775 = 0L;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m37630(long j, long j2) {
        this.f48784.m45298();
        if (j == 0) {
            mo9593(!this.f48786);
            return;
        }
        if (this.f48778 != 0) {
            long jM37632 = m37632(j2);
            this.f48782 = jM37632;
            InterfaceC2525 interfaceC2525 = this.f48781;
            String str = C5792.f14228;
            interfaceC2525.mo3693(jM37632);
            this.f48778 = 2;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m37628(InterfaceC10375 interfaceC10375, C24812 c24812) {
        C23877.m52958(this.f48776);
        String str = C5792.f14228;
        int i = this.f48778;
        C19961 c19961 = this.f48784;
        if (i == 0) {
            while (c19961.m45296(interfaceC10375)) {
                this.f48785 = interfaceC10375.getPosition() - this.f48787;
                if (mo9594(c19961.m45297(), this.f48787, this.f48779)) {
                    this.f48787 = interfaceC10375.getPosition();
                } else {
                    C10307 c10307 = this.f48779.f6200;
                    this.f48777 = c10307.f28538;
                    if (!this.f48783) {
                        this.f48776.mo10503(c10307);
                        this.f48783 = true;
                    }
                    C17277 c17277 = this.f48779.f6201;
                    if (c17277 != null) {
                        this.f48781 = c17277;
                    } else if (interfaceC10375.getLength() == -1) {
                        this.f48781 = new C9902();
                    } else {
                        C20632 c20632M45295 = c19961.m45295();
                        this.f48781 = new C10573(this, this.f48787, interfaceC10375.getLength(), c20632M45295.f63745 + c20632M45295.f63742, c20632M45295.f63743, (c20632M45295.f63748 & 4) != 0);
                    }
                    this.f48778 = 2;
                    c19961.m45299();
                    return 0;
                }
            }
            this.f48778 = 3;
            return -1;
        }
        if (i == 1) {
            interfaceC10375.mo24040((int) this.f48787);
            this.f48778 = 2;
            return 0;
        }
        if (i != 2) {
            if (i == 3) {
                return -1;
            }
            throw new IllegalStateException();
        }
        long jMo3691 = this.f48781.mo3691(interfaceC10375);
        if (jMo3691 >= 0) {
            c24812.f79276 = jMo3691;
            return 1;
        }
        if (jMo3691 < -1) {
            mo37633(-(jMo3691 + 2));
        }
        if (!this.f48786) {
            InterfaceC11402 interfaceC11402Mo3692 = this.f48781.mo3692();
            C23877.m52958(interfaceC11402Mo3692);
            this.f48780.mo5733(interfaceC11402Mo3692);
            this.f48776.mo10501(interfaceC11402Mo3692.mo8953());
            this.f48786 = true;
        }
        if (this.f48785 > 0 || c19961.m45296(interfaceC10375)) {
            this.f48785 = 0L;
            C19203 c19203M45297 = c19961.m45297();
            long jMo9592 = mo9592(c19203M45297);
            if (jMo9592 >= 0) {
                long j = this.f48775;
                if (j + jMo9592 >= this.f48782) {
                    long jM37629 = m37629(j);
                    this.f48776.mo10500(c19203M45297.m43729(), c19203M45297);
                    this.f48776.mo10502(jM37629, 1, c19203M45297.m43729(), 0, null);
                    this.f48782 = -1L;
                }
            }
            this.f48775 += jMo9592;
            return 0;
        }
        this.f48778 = 3;
        return -1;
    }

    /* JADX INFO: renamed from: ֫ */
    public final long m37629(long j) {
        return (j * 1000000) / ((long) this.f48777);
    }

    /* JADX INFO: renamed from: ۧ */
    public final long m37632(long j) {
        return (((long) this.f48777) * j) / 1000000;
    }

    /* JADX INFO: renamed from: ܽ */
    public void mo37633(long j) {
        this.f48775 = j;
    }
}
