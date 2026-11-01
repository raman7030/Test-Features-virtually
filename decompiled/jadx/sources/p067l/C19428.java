package p067l;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: l.ᩳۡۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: X8U2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19428 implements InterfaceC3669 {

    /* JADX INFO: renamed from: ֫ */
    public C18086 f59157;

    /* JADX INFO: renamed from: ۘ */
    public InterfaceC20790 f59159;

    /* JADX INFO: renamed from: ۜ */
    public C25079 f59160;

    /* JADX INFO: renamed from: ۢ */
    public int f59162;

    /* JADX INFO: renamed from: ܳ */
    public C8363 f59164;

    /* JADX INFO: renamed from: ܽ */
    public int f59166;

    /* JADX INFO: renamed from: ܿ */
    public InterfaceC23116 f59167;

    /* JADX INFO: renamed from: ᩳ */
    public long f59168;

    /* JADX INFO: renamed from: ᩻ */
    public int f59170;

    /* JADX INFO: renamed from: ۖ */
    public final byte[] f59158 = new byte[42];

    /* JADX INFO: renamed from: ۧ */
    public final C19203 f59163 = new C19203(new byte[32768], 0);

    /* JADX INFO: renamed from: ᩷ */
    public final boolean f59169 = false;

    /* JADX INFO: renamed from: ۡ */
    public final C7022 f59161 = new C7022();

    /* JADX INFO: renamed from: ܺ */
    public int f59165 = 0;

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
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo7079(InterfaceC10375 interfaceC10375) {
        C25079 c25079M41182 = new C18106().m41182(interfaceC10375, C18952.f56493);
        if (c25079M41182 != null) {
            c25079M41182.m55048();
        }
        C19203 c19203 = new C19203(4);
        ((C17750) interfaceC10375).mo24038(false, 0, 4, c19203.m43728());
        return c19203.m43725() == 1716281667;
    }

    @Override // p067l.InterfaceC3669
    /* JADX INFO: renamed from: ܳ */
    public final List mo7080() {
        return AbstractC16192.m36872of();
    }

    @Override // p067l.InterfaceC3669
    /* JADX INFO: renamed from: ֫ */
    public final void mo7078(InterfaceC23116 interfaceC23116) {
        this.f59167 = interfaceC23116;
        this.f59159 = interfaceC23116.mo5732(0, 1);
        interfaceC23116.mo5734();
    }

    @Override // p067l.InterfaceC3669
    /* JADX INFO: renamed from: ֫ */
    public final int mo7075(InterfaceC10375 interfaceC10375, C24812 c24812) throws C10998 {
        InterfaceC11402 c22131;
        long j;
        boolean zM12663;
        int i = this.f59165;
        C25079 c25079 = null;
        boolean z = true;
        if (i == 0) {
            interfaceC10375.mo24036();
            long jMo24039 = interfaceC10375.mo24039();
            C25079 c25079M41182 = new C18106().m41182(interfaceC10375, !this.f59169 ? null : C18952.f56493);
            if (c25079M41182 != null && c25079M41182.m55048() != 0) {
                c25079 = c25079M41182;
            }
            interfaceC10375.mo24040((int) (interfaceC10375.mo24039() - jMo24039));
            this.f59160 = c25079;
            this.f59165 = 1;
            return 0;
        }
        byte[] bArr = this.f59158;
        if (i == 1) {
            interfaceC10375.mo24031(0, bArr.length, bArr);
            interfaceC10375.mo24036();
            this.f59165 = 2;
            return 0;
        }
        if (i == 2) {
            C19203 c19203 = new C19203(4);
            interfaceC10375.readFully(c19203.m43728(), 0, 4);
            if (c19203.m43725() != 1716281667) {
                throw C10998.m25387("Failed to read FLAC stream marker.", (Throwable) null);
            }
            this.f59165 = 3;
            return 0;
        }
        if (i == 3) {
            C8363 c8363M19376 = this.f59164;
            boolean z2 = false;
            while (!z2) {
                interfaceC10375.mo24036();
                byte[] bArr2 = new byte[4];
                C17861 c17861 = new C17861(bArr2, 4);
                interfaceC10375.mo24031(0, 4, bArr2);
                boolean zM40567 = c17861.m40567();
                int iM40558 = c17861.m40558(7);
                int iM40559 = c17861.m40558(24) + 4;
                if (iM40558 == 0) {
                    byte[] bArr3 = new byte[38];
                    interfaceC10375.readFully(bArr3, 0, 38);
                    c8363M19376 = new C8363(bArr3, 4);
                } else {
                    if (c8363M19376 == null) {
                        throw new IllegalArgumentException();
                    }
                    if (iM40558 == 3) {
                        C19203 c19204 = new C19203(iM40559);
                        interfaceC10375.readFully(c19204.m43728(), 0, iM40559);
                        c8363M19376 = c8363M19376.m19377(C15068.m34474(c19204));
                    } else if (iM40558 == 4) {
                        C19203 c19205 = new C19203(iM40559);
                        interfaceC10375.readFully(c19205.m43728(), 0, iM40559);
                        c19205.m43724(4);
                        c8363M19376 = c8363M19376.m19379(Arrays.asList(C22801.m51003(c19205, false, false).f6558));
                    } else if (iM40558 == 6) {
                        C19203 c19206 = new C19203(iM40559);
                        interfaceC10375.readFully(c19206.m43728(), 0, iM40559);
                        c19206.m43724(4);
                        c8363M19376 = c8363M19376.m19376(AbstractC16192.m36873of((Object) C5346.m11598(c19206)));
                    } else {
                        interfaceC10375.mo24040(iM40559);
                    }
                }
                String str = C5792.f14228;
                this.f59164 = c8363M19376;
                z2 = zM40567;
            }
            this.f59164.getClass();
            this.f59162 = Math.max(this.f59164.f22399, 6);
            C10307 c10307M19378 = this.f59164.m19378(bArr, this.f59160);
            InterfaceC20790 interfaceC20790 = this.f59159;
            C3601 c3601M23918 = c10307M19378.m23918();
            c3601M23918.m6694("audio/flac");
            interfaceC20790.mo10503(c3601M23918.m6672());
            this.f59159.mo10501(this.f59164.m19375());
            this.f59165 = 4;
            return 0;
        }
        long j2 = 0;
        if (i == 4) {
            interfaceC10375.mo24036();
            C19203 c19207 = new C19203(2);
            interfaceC10375.mo24031(0, 2, c19207.m43728());
            int iM43710 = c19207.m43710();
            if ((iM43710 >> 2) != 16382) {
                interfaceC10375.mo24036();
                throw C10998.m25387("First frame does not start with sync code.", (Throwable) null);
            }
            interfaceC10375.mo24036();
            this.f59170 = iM43710;
            InterfaceC23116 interfaceC23116 = this.f59167;
            String str2 = C5792.f14228;
            long position = interfaceC10375.getPosition();
            long length = interfaceC10375.getLength();
            this.f59164.getClass();
            C8363 c8363 = this.f59164;
            C12387 c12387 = c8363.f22400;
            if (c12387 != null && c12387.f34613.length > 0) {
                c22131 = new C14398(c8363, position);
            } else if (length == -1 || c8363.f22404 <= 0) {
                c22131 = new C22131(c8363.m19375());
            } else {
                C18086 c18086 = new C18086(c8363, this.f59170, position, length);
                this.f59157 = c18086;
                c22131 = c18086.m55177();
            }
            interfaceC23116.mo5733(c22131);
            this.f59165 = 5;
            return 0;
        }
        if (i != 5) {
            throw new IllegalStateException();
        }
        this.f59159.getClass();
        this.f59164.getClass();
        C18086 c18087 = this.f59157;
        if (c18087 != null && c18087.m55179()) {
            return this.f59157.m55176(interfaceC10375, c24812);
        }
        if (this.f59168 == -1) {
            C8363 c8364 = this.f59164;
            interfaceC10375.mo24036();
            interfaceC10375.mo24030(1);
            byte[] bArr4 = new byte[1];
            interfaceC10375.mo24031(0, 1, bArr4);
            boolean z3 = (bArr4[0] & 1) == 1;
            interfaceC10375.mo24030(2);
            int i2 = z3 ? 7 : 6;
            C19203 c19208 = new C19203(i2);
            byte[] bArrM43728 = c19208.m43728();
            int i3 = 0;
            while (i3 < i2) {
                int iMo24035 = interfaceC10375.mo24035(i3, i2 - i3, bArrM43728);
                if (iMo24035 == -1) {
                    break;
                }
                i3 += iMo24035;
            }
            c19208.m43732(i3);
            interfaceC10375.mo24036();
            try {
                long jM43722 = c19208.m43722();
                if (!z3) {
                    jM43722 *= (long) c8364.f22407;
                }
                j2 = jM43722;
            } catch (NumberFormatException unused) {
                z = false;
            }
            if (!z) {
                throw C10998.m25387((String) null, (Throwable) null);
            }
            this.f59168 = j2;
        } else {
            C19203 c19209 = this.f59163;
            int iM43729 = c19209.m43729();
            if (iM43729 < 32768) {
                int i4 = interfaceC10375.read(c19209.m43728(), iM43729, 32768 - iM43729);
                z = i4 == -1;
                if (!z) {
                    c19209.m43732(iM43729 + i4);
                } else if (c19209.m43703() == 0) {
                    long j3 = this.f59168 * 1000000;
                    C8363 c8365 = this.f59164;
                    String str3 = C5792.f14228;
                    this.f59159.mo10502(j3 / ((long) c8365.f22408), 1, this.f59166, 0, null);
                    return -1;
                }
            } else {
                z = false;
            }
            int iM43731 = c19209.m43731();
            int i5 = this.f59166;
            int i6 = this.f59162;
            if (i5 < i6) {
                c19209.m43724(Math.min(i6 - i5, c19209.m43703()));
            }
            this.f59164.getClass();
            int iM43732 = c19209.m43731();
            while (true) {
                int iM437210 = c19209.m43729() - 16;
                C7022 c7022 = this.f59161;
                if (iM43732 > iM437210) {
                    if (z) {
                        while (true) {
                            if (iM43732 <= c19209.m43729() - this.f59162) {
                                c19209.m43730(iM43732);
                                try {
                                    zM12663 = C5681.m12663(c19209, this.f59164, this.f59170, c7022);
                                } catch (IndexOutOfBoundsException unused2) {
                                    zM12663 = false;
                                }
                                if (c19209.m43731() > c19209.m43729()) {
                                    zM12663 = false;
                                }
                                if (zM12663) {
                                    c19209.m43730(iM43732);
                                    j = c7022.f18293;
                                    break;
                                }
                                iM43732++;
                            } else {
                                c19209.m43730(c19209.m43729());
                            }
                        }
                    } else {
                        c19209.m43730(iM43732);
                    }
                    j = -1;
                    break;
                }
                c19209.m43730(iM43732);
                if (C5681.m12663(c19209, this.f59164, this.f59170, c7022)) {
                    c19209.m43730(iM43732);
                    j = c7022.f18293;
                    break;
                }
                iM43732++;
            }
            int iM43733 = c19209.m43731() - iM43731;
            c19209.m43730(iM43731);
            this.f59159.mo10500(iM43733, c19209);
            int i7 = this.f59166 + iM43733;
            this.f59166 = i7;
            if (j != -1) {
                long j4 = this.f59168 * 1000000;
                C8363 c8366 = this.f59164;
                String str4 = C5792.f14228;
                this.f59159.mo10502(j4 / ((long) c8366.f22408), 1, i7, 0, null);
                this.f59166 = 0;
                this.f59168 = j;
            }
            int length2 = c19209.m43728().length - c19209.m43729();
            if (c19209.m43703() < 16 && length2 < 16) {
                int iM43703 = c19209.m43703();
                System.arraycopy(c19209.m43728(), c19209.m43731(), c19209.m43728(), 0, iM43703);
                c19209.m43730(0);
                c19209.m43732(iM43703);
            }
        }
        return 0;
    }

    @Override // p067l.InterfaceC3669
    /* JADX INFO: renamed from: ֫ */
    public final void mo7077(long j, long j2) {
        if (j == 0) {
            this.f59165 = 0;
        } else {
            C18086 c18086 = this.f59157;
            if (c18086 != null) {
                c18086.m55178(j2);
            }
        }
        this.f59168 = j2 != 0 ? -1L : 0L;
        this.f59166 = 0;
        this.f59163.m43727(0);
    }
}
