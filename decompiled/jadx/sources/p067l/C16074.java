package p067l;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.List;

/* JADX INFO: renamed from: l.ܳۡۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: J8O5 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16074 implements InterfaceC3669 {

    /* JADX INFO: renamed from: ֫ */
    public C18757 f47291;

    /* JADX INFO: renamed from: ۘ */
    public long f47293;

    /* JADX INFO: renamed from: ۜ */
    public boolean f47294;

    /* JADX INFO: renamed from: ۧ */
    public int f47297;

    /* JADX INFO: renamed from: ܺ */
    public int f47299;

    /* JADX INFO: renamed from: ܽ */
    public InterfaceC23116 f47300;

    /* JADX INFO: renamed from: ܿ */
    public long f47301;

    /* JADX INFO: renamed from: ᩴ */
    public int f47303;

    /* JADX INFO: renamed from: ᩵ */
    public C11382 f47304;

    /* JADX INFO: renamed from: ᩻ */
    public boolean f47306;

    /* JADX INFO: renamed from: ᩷ */
    public final C19203 f47305 = new C19203(4);

    /* JADX INFO: renamed from: ᩳ */
    public final C19203 f47302 = new C19203(9);

    /* JADX INFO: renamed from: ۖ */
    public final C19203 f47292 = new C19203(11);

    /* JADX INFO: renamed from: ۡ */
    public final C19203 f47295 = new C19203();

    /* JADX INFO: renamed from: ܳ */
    public final C24792 f47298 = new C24792();

    /* JADX INFO: renamed from: ۢ */
    public int f47296 = 1;

    @Override // p067l.InterfaceC3669
    /* JADX INFO: renamed from: ֫ */
    public final void mo7076() {
    }

    @Override // p067l.InterfaceC3669
    /* JADX INFO: renamed from: ܽ */
    public final InterfaceC3669 mo7081() {
        return this;
    }

    @Override // p067l.InterfaceC3669
    /* JADX INFO: renamed from: ܳ */
    public final List mo7080() {
        return AbstractC16192.m36872of();
    }

    @Override // p067l.InterfaceC3669
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo7079(InterfaceC10375 interfaceC10375) throws EOFException, InterruptedIOException {
        C19203 c19203 = this.f47305;
        C17750 c17750 = (C17750) interfaceC10375;
        c17750.mo24038(false, 0, 3, c19203.m43728());
        c19203.m43730(0);
        if (c19203.m43737() == 4607062) {
            c17750.mo24038(false, 0, 2, c19203.m43728());
            c19203.m43730(0);
            if ((c19203.m43710() & 250) == 0) {
                c17750.mo24038(false, 0, 4, c19203.m43728());
                c19203.m43730(0);
                int iM43739 = c19203.m43739();
                c17750.mo24036();
                c17750.mo24037(iM43739, false);
                c17750.mo24038(false, 0, 4, c19203.m43728());
                c19203.m43730(0);
                if (c19203.m43739() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p067l.InterfaceC3669
    /* JADX INFO: renamed from: ֫ */
    public final void mo7078(InterfaceC23116 interfaceC23116) {
        this.f47300 = interfaceC23116;
    }

    @Override // p067l.InterfaceC3669
    /* JADX INFO: renamed from: ֫ */
    public final void mo7077(long j, long j2) {
        if (j == 0) {
            this.f47296 = 1;
            this.f47306 = false;
        } else {
            this.f47296 = 3;
        }
        this.f47297 = 0;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:87:0x00dc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x0005 A[SYNTHETIC] */
    @Override // p067l.InterfaceC3669
    /* JADX INFO: renamed from: ֫ */
    public final int mo7075(InterfaceC10375 interfaceC10375, C24812 c24812) throws C8699 {
        long j;
        boolean zM42776;
        boolean z;
        long j2;
        C23877.m52958(this.f47300);
        while (true) {
            int i = this.f47296;
            if (i == 1) {
                C19203 c19203 = this.f47302;
                if (!interfaceC10375.mo24033(true, 0, 9, c19203.m43728())) {
                    return -1;
                }
                c19203.m43730(0);
                c19203.m43724(4);
                int iM43702 = c19203.m43702();
                boolean z2 = (iM43702 & 4) != 0;
                boolean z3 = (iM43702 & 1) != 0;
                if (z2 && this.f47291 == null) {
                    this.f47291 = new C18757(this.f47300.mo5732(8, 1));
                }
                if (z3 && this.f47304 == null) {
                    this.f47304 = new C11382(this.f47300.mo5732(9, 2));
                }
                this.f47300.mo5734();
                this.f47297 = c19203.m43739() - 5;
                this.f47296 = 2;
            } else if (i == 2) {
                interfaceC10375.mo24040(this.f47297);
                this.f47297 = 0;
                this.f47296 = 3;
            } else if (i == 3) {
                C19203 c19204 = this.f47292;
                if (!interfaceC10375.mo24033(true, 0, 11, c19204.m43728())) {
                    return -1;
                }
                c19204.m43730(0);
                this.f47303 = c19204.m43702();
                this.f47299 = c19204.m43737();
                this.f47293 = c19204.m43737();
                this.f47293 = (((long) (c19204.m43702() << 24)) | this.f47293) * 1000;
                c19204.m43724(3);
                this.f47296 = 4;
            } else {
                if (i != 4) {
                    throw new IllegalStateException();
                }
                boolean z4 = this.f47306;
                C24792 c24792 = this.f47298;
                if (z4) {
                    j = this.f47301 + this.f47293;
                } else {
                    j = c24792.m54469() == -9223372036854775807L ? 0L : this.f47293;
                }
                int i2 = this.f47303;
                if (i2 != 8 || this.f47291 == null) {
                    if (i2 != 9 || this.f47304 == null) {
                        if (i2 == 18 && !this.f47294) {
                            C19203 c19203M36586 = m36586(interfaceC10375);
                            c24792.getClass();
                            c24792.m54470(j, c19203M36586);
                            long jM54469 = c24792.m54469();
                            if (jM54469 != -9223372036854775807L) {
                                this.f47300.mo5733(new C19448(jM54469, c24792.m54471(), c24792.m54472()));
                                this.f47294 = true;
                            }
                        } else {
                            interfaceC10375.mo24040(this.f47299);
                            zM42776 = false;
                            z = false;
                        }
                        if (!this.f47306 && zM42776) {
                            this.f47306 = true;
                            if (c24792.m54469() == -9223372036854775807L) {
                                j2 = -this.f47293;
                            } else {
                                j2 = 0;
                            }
                            this.f47301 = j2;
                        }
                        this.f47297 = 4;
                        this.f47296 = 2;
                        if (z) {
                            return 0;
                        }
                    } else {
                        if (!this.f47294) {
                            this.f47300.mo5733(new C22131(-9223372036854775807L));
                            this.f47294 = true;
                        }
                        C11382 c11382 = this.f47304;
                        C19203 c19203M36587 = m36586(interfaceC10375);
                        if (c11382.m26335(c19203M36587) && c11382.m26334(j, c19203M36587)) {
                            zM42776 = true;
                        }
                    }
                    zM42776 = false;
                } else {
                    if (!this.f47294) {
                        this.f47300.mo5733(new C22131(-9223372036854775807L));
                        this.f47294 = true;
                    }
                    C18757 c18757 = this.f47291;
                    C19203 c19203M36588 = m36586(interfaceC10375);
                    c18757.m42777(c19203M36588);
                    zM42776 = c18757.m42776(j, c19203M36588);
                }
                z = true;
                if (!this.f47306) {
                    this.f47306 = true;
                    if (c24792.m54469() == -9223372036854775807L) {
                        j2 = -this.f47293;
                    } else {
                        j2 = 0;
                    }
                    this.f47301 = j2;
                }
                this.f47297 = 4;
                this.f47296 = 2;
                if (z) {
                    return 0;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    private C19203 m36586(InterfaceC10375 interfaceC10375) {
        int i = this.f47299;
        C19203 c19203 = this.f47295;
        if (i > c19203.m43718()) {
            c19203.m43708(0, new byte[Math.max(c19203.m43718() * 2, this.f47299)]);
        } else {
            c19203.m43730(0);
        }
        c19203.m43732(this.f47299);
        interfaceC10375.readFully(c19203.m43728(), 0, this.f47299);
        return c19203;
    }
}
