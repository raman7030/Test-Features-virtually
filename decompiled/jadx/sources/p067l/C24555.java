package p067l;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.List;

/* JADX INFO: renamed from: l.᩻֡ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: K8IZ */
/* JADX INFO: loaded from: classes.dex */
public final class C24555 implements InterfaceC3669 {

    /* JADX INFO: renamed from: ֫ */
    public int f77748;

    /* JADX INFO: renamed from: ۜ */
    public final C19203 f77749;

    /* JADX INFO: renamed from: ۡ */
    public final C17861 f77750;

    /* JADX INFO: renamed from: ۢ */
    public final C19203 f77751;

    /* JADX INFO: renamed from: ۧ */
    public InterfaceC23116 f77752;

    /* JADX INFO: renamed from: ܳ */
    public boolean f77753;

    /* JADX INFO: renamed from: ܺ */
    public boolean f77754;

    /* JADX INFO: renamed from: ܽ */
    public long f77755;

    /* JADX INFO: renamed from: ܿ */
    public final int f77756;

    /* JADX INFO: renamed from: ᩳ */
    public long f77757;

    /* JADX INFO: renamed from: ᩷ */
    public final C8462 f77758;

    /* JADX INFO: renamed from: ᩻ */
    public boolean f77759;

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

    public C24555(int i) {
        this.f77756 = (i & 2) != 0 ? i | 1 : i;
        this.f77758 = new C8462(null, 0, "audio/mp4a-latm", true);
        this.f77749 = new C19203(2048);
        this.f77748 = -1;
        this.f77755 = -1L;
        C19203 c19203 = new C19203(10);
        this.f77751 = c19203;
        byte[] bArrM43728 = c19203.m43728();
        this.f77750 = new C17861(bArrM43728, bArrM43728.length);
    }

    @Override // p067l.InterfaceC3669
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo7079(InterfaceC10375 interfaceC10375) throws EOFException, InterruptedIOException {
        int iM54157 = m54157(interfaceC10375);
        int i = 0;
        int i2 = 0;
        int i3 = iM54157;
        do {
            C19203 c19203 = this.f77751;
            C17750 c17750 = (C17750) interfaceC10375;
            c17750.mo24038(false, 0, 2, c19203.m43728());
            c19203.m43730(0);
            if ((c19203.m43710() & 65526) == 65520) {
                i++;
                if (i >= 4 && i2 > 188) {
                    return true;
                }
                c17750.mo24038(false, 0, 4, c19203.m43728());
                C17861 c17861 = this.f77750;
                c17861.m40569(14);
                int iM40558 = c17861.m40558(13);
                if (iM40558 > 6) {
                    c17750.mo24037(iM40558 - 6, false);
                    i2 += iM40558;
                } else {
                    i3++;
                    c17750.mo24036();
                }
            } else {
                i3++;
                c17750.mo24036();
            }
            c17750.mo24037(i3, false);
            i = 0;
            i2 = 0;
        } while (i3 - iM54157 < 8192);
        return false;
    }

    @Override // p067l.InterfaceC3669
    /* JADX INFO: renamed from: ֫ */
    public final void mo7078(InterfaceC23116 interfaceC23116) {
        this.f77752 = interfaceC23116;
        this.f77758.mo3398(interfaceC23116, new C20672(0, 1));
        interfaceC23116.mo5734();
    }

    @Override // p067l.InterfaceC3669
    /* JADX INFO: renamed from: ֫ */
    public final void mo7077(long j, long j2) {
        this.f77754 = false;
        this.f77758.mo3395();
        this.f77757 = j2;
    }

    /* JADX WARN: Code duplicated, block: B:61:0x00df  */
    @Override // p067l.InterfaceC3669
    /* JADX INFO: renamed from: ֫ */
    public final int mo7075(InterfaceC10375 interfaceC10375, C24812 c24812) throws C10998 {
        int i;
        boolean z;
        C8462 c8462;
        C23877.m52958(this.f77752);
        long length = interfaceC10375.getLength();
        int i2 = this.f77756;
        int i3 = i2 & 2;
        if (i3 != 0 || ((i2 & 1) != 0 && length != -1)) {
            C17861 c17861 = this.f77750;
            C19203 c19203 = this.f77751;
            if (!this.f77753) {
                this.f77748 = -1;
                interfaceC10375.mo24036();
                long j = 0;
                if (interfaceC10375.getPosition() == 0) {
                    m54157(interfaceC10375);
                }
                int i4 = 0;
                for (int i5 = 0; interfaceC10375.mo24038(true, i5, 2, c19203.m43728()); i5 = 0) {
                    try {
                        c19203.m43730(i5);
                        if (!((c19203.m43710() & 65526) == 65520)) {
                            i4 = 0;
                            break;
                        }
                        if (!interfaceC10375.mo24038(true, i5, 4, c19203.m43728())) {
                            break;
                        }
                        c17861.m40569(14);
                        int iM40558 = c17861.m40558(13);
                        if (iM40558 <= 6) {
                            this.f77753 = true;
                            throw C10998.m25387("Malformed ADTS stream", (Throwable) null);
                        }
                        j += (long) iM40558;
                        i4++;
                        if (i4 == 1000 || !interfaceC10375.mo24037(iM40558 - 6, true)) {
                            break;
                            break;
                        }
                    } catch (EOFException unused) {
                    }
                }
                interfaceC10375.mo24036();
                if (i4 > 0) {
                    this.f77748 = (int) (j / ((long) i4));
                } else {
                    this.f77748 = -1;
                }
                this.f77753 = true;
            }
        }
        C19203 c19204 = this.f77749;
        int i6 = interfaceC10375.read(c19204.m43728(), 0, 2048);
        boolean z2 = i6 == -1;
        boolean z3 = this.f77759;
        C8462 c8463 = this.f77758;
        if (z3) {
            i = -1;
            c8463 = c8463;
            z = true;
        } else {
            boolean z4 = (i2 & 1) != 0 && this.f77748 > 0;
            if (z4 && c8463.m19690() == -9223372036854775807L && !z2) {
                i = -1;
                c8463 = c8463;
                z = true;
            } else {
                if (z4 && c8463.m19690() != -9223372036854775807L) {
                    this.f77752.mo5733(new C11046((int) ((((long) this.f77748) * 8000000) / c8463.m19690()), this.f77748, length, this.f77755, i3 != 0));
                    i = -1;
                } else {
                    i = -1;
                    this.f77752.mo5733(new C22131(-9223372036854775807L));
                }
                z = true;
                this.f77759 = true;
            }
        }
        if (z2) {
            return i;
        }
        c19204.m43730(0);
        c19204.m43732(i6);
        if (this.f77754) {
            c8462 = c8463;
        } else {
            c8462 = c8463;
            c8462.mo3396(4, this.f77757);
            this.f77754 = z;
        }
        c8462.mo3397(c19204);
        return 0;
    }

    /* JADX INFO: renamed from: ۧ */
    private int m54157(InterfaceC10375 interfaceC10375) {
        int i = 0;
        while (true) {
            C19203 c19203 = this.f77751;
            interfaceC10375.mo24031(0, 10, c19203.m43728());
            c19203.m43730(0);
            if (c19203.m43737() != 4801587) {
                break;
            }
            c19203.m43724(3);
            int iM43713 = c19203.m43713();
            i += iM43713 + 10;
            interfaceC10375.mo24030(iM43713);
        }
        interfaceC10375.mo24036();
        interfaceC10375.mo24030(i);
        if (this.f77755 == -1) {
            this.f77755 = i;
        }
        return i;
    }
}
