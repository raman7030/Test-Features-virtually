package l;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.List;

/* JADX INFO: renamed from: l.ܳۡۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: J8O5 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14421 implements InterfaceC1368 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C17244 f44197;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public long f44199;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f44200;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f44203;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f44205;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public InterfaceC21830 f44206;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public long f44207;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f44209;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public C9484 f44210;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f44212;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C17714 f44211 = new C17714(4);

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C17714 f44208 = new C17714(9);

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C17714 f44198 = new C17714(11);

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C17714 f44201 = new C17714();

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C23594 f44204 = new C23594();

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f44202 = 1;

    @Override // l.InterfaceC1368
    /* JADX INFO: renamed from: ֫ */
    public final void mo4838() {
    }

    @Override // l.InterfaceC1368
    /* JADX INFO: renamed from: ܽ */
    public final InterfaceC1368 mo4843() {
        return this;
    }

    @Override // l.InterfaceC1368
    /* JADX INFO: renamed from: ܳ */
    public final List mo4842() {
        return AbstractC14545.of();
    }

    @Override // l.InterfaceC1368
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo4841(InterfaceC8424 interfaceC8424) throws EOFException, InterruptedIOException {
        C17714 c17714 = this.f44211;
        C16184 c16184 = (C16184) interfaceC8424;
        c16184.mo22068(false, 0, 3, c17714.m41482());
        c17714.m41484(0);
        if (c17714.m41491() == 4607062) {
            c16184.mo22068(false, 0, 2, c17714.m41482());
            c17714.m41484(0);
            if ((c17714.m41464() & 250) == 0) {
                c16184.mo22068(false, 0, 4, c17714.m41482());
                c17714.m41484(0);
                int iM41493 = c17714.m41493();
                c16184.mo22066();
                c16184.mo22067(iM41493, false);
                c16184.mo22068(false, 0, 4, c17714.m41482());
                c17714.m41484(0);
                if (c17714.m41493() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // l.InterfaceC1368
    /* JADX INFO: renamed from: ֫ */
    public final void mo4840(InterfaceC21830 interfaceC21830) {
        this.f44206 = interfaceC21830;
    }

    @Override // l.InterfaceC1368
    /* JADX INFO: renamed from: ֫ */
    public final void mo4839(long j, long j2) {
        if (j == 0) {
            this.f44202 = 1;
            this.f44212 = false;
        } else {
            this.f44202 = 3;
        }
        this.f44203 = 0;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:87:0x00dc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x0005 A[SYNTHETIC] */
    @Override // l.InterfaceC1368
    /* JADX INFO: renamed from: ֫ */
    public final int mo4837(InterfaceC8424 interfaceC8424, C23615 c23615) throws C6661 {
        long j;
        boolean zM40527;
        boolean z;
        long j2;
        C22632.m50632(this.f44206);
        while (true) {
            int i = this.f44202;
            if (i == 1) {
                C17714 c17714 = this.f44208;
                if (!interfaceC8424.mo22063(true, 0, 9, c17714.m41482())) {
                    return -1;
                }
                c17714.m41484(0);
                c17714.m41478(4);
                int iM41456 = c17714.m41456();
                boolean z2 = (iM41456 & 4) != 0;
                boolean z3 = (iM41456 & 1) != 0;
                if (z2 && this.f44197 == null) {
                    this.f44197 = new C17244(this.f44206.mo3429(8, 1));
                }
                if (z3 && this.f44210 == null) {
                    this.f44210 = new C9484(this.f44206.mo3429(9, 2));
                }
                this.f44206.mo3431();
                this.f44203 = c17714.m41493() - 5;
                this.f44202 = 2;
            } else if (i == 2) {
                interfaceC8424.mo22070(this.f44203);
                this.f44203 = 0;
                this.f44202 = 3;
            } else if (i == 3) {
                C17714 c17715 = this.f44198;
                if (!interfaceC8424.mo22063(true, 0, 11, c17715.m41482())) {
                    return -1;
                }
                c17715.m41484(0);
                this.f44209 = c17715.m41456();
                this.f44205 = c17715.m41491();
                this.f44199 = c17715.m41491();
                this.f44199 = (((long) (c17715.m41456() << 24)) | this.f44199) * 1000;
                c17715.m41478(3);
                this.f44202 = 4;
            } else {
                if (i != 4) {
                    throw new IllegalStateException();
                }
                boolean z4 = this.f44212;
                C23594 c23594 = this.f44204;
                if (z4) {
                    j = this.f44207 + this.f44199;
                } else {
                    j = c23594.m52066() == -9223372036854775807L ? 0L : this.f44199;
                }
                int i2 = this.f44209;
                if (i2 != 8 || this.f44197 == null) {
                    if (i2 != 9 || this.f44210 == null) {
                        if (i2 == 18 && !this.f44200) {
                            C17714 c17714M34453 = m34453(interfaceC8424);
                            c23594.getClass();
                            c23594.m52067(j, c17714M34453);
                            long jM52066 = c23594.m52066();
                            if (jM52066 != -9223372036854775807L) {
                                this.f44206.mo3430(new C17971(jM52066, c23594.m52068(), c23594.m52069()));
                                this.f44200 = true;
                            }
                        } else {
                            interfaceC8424.mo22070(this.f44205);
                            zM40527 = false;
                            z = false;
                        }
                        if (!this.f44212 && zM40527) {
                            this.f44212 = true;
                            if (c23594.m52066() == -9223372036854775807L) {
                                j2 = -this.f44199;
                            } else {
                                j2 = 0;
                            }
                            this.f44207 = j2;
                        }
                        this.f44203 = 4;
                        this.f44202 = 2;
                        if (z) {
                            return 0;
                        }
                    } else {
                        if (!this.f44200) {
                            this.f44206.mo3430(new C20794(-9223372036854775807L));
                            this.f44200 = true;
                        }
                        C9484 c9484 = this.f44210;
                        C17714 c17714M34454 = m34453(interfaceC8424);
                        if (c9484.m24325(c17714M34454) && c9484.m24324(j, c17714M34454)) {
                            zM40527 = true;
                        }
                    }
                    zM40527 = false;
                } else {
                    if (!this.f44200) {
                        this.f44206.mo3430(new C20794(-9223372036854775807L));
                        this.f44200 = true;
                    }
                    C17244 c17244 = this.f44197;
                    C17714 c17714M34455 = m34453(interfaceC8424);
                    c17244.m40528(c17714M34455);
                    zM40527 = c17244.m40527(j, c17714M34455);
                }
                z = true;
                if (!this.f44212) {
                    this.f44212 = true;
                    if (c23594.m52066() == -9223372036854775807L) {
                        j2 = -this.f44199;
                    } else {
                        j2 = 0;
                    }
                    this.f44207 = j2;
                }
                this.f44203 = 4;
                this.f44202 = 2;
                if (z) {
                    return 0;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private C17714 m34453(InterfaceC8424 interfaceC8424) {
        int i = this.f44205;
        C17714 c17714 = this.f44201;
        if (i > c17714.m41472()) {
            c17714.m41462(0, new byte[Math.max(c17714.m41472() * 2, this.f44205)]);
        } else {
            c17714.m41484(0);
        }
        c17714.m41486(this.f44205);
        interfaceC8424.readFully(c17714.m41482(), 0, this.f44205);
        return c17714;
    }
}
