package l;

import java.util.concurrent.atomic.AtomicInteger;
import org.bouncycastle.crypto.generators.Poly1305KeyGenerator;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: renamed from: l.ۢ֡ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: X8NN */
/* JADX INFO: loaded from: classes3.dex */
public final class C9235 implements InterfaceC15583 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f27955;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f27957;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final String f27958;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public long f27959;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final int f27960;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f27962;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f27963;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String f27965;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C8353 f27966;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public InterfaceC19383 f27969;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C17714 f27970;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f27956 = 0;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public long f27967 = -9223372036854775807L;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f27968 = new AtomicInteger();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f27964 = -1;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f27954 = -1;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f27961 = "video/mp2t";

    @Override // l.InterfaceC15583
    /* JADX INFO: renamed from: ֫ */
    public final void mo1004(boolean z) {
    }

    public C9235(String str, int i, int i2) {
        this.f27970 = new C17714(new byte[i2]);
        this.f27958 = str;
        this.f27960 = i;
    }

    @Override // l.InterfaceC15583
    /* JADX INFO: renamed from: ֫ */
    public final void mo1000() {
        this.f27956 = 0;
        this.f27955 = 0;
        this.f27957 = 0;
        this.f27967 = -9223372036854775807L;
        this.f27968.set(0);
    }

    @Override // l.InterfaceC15583
    /* JADX INFO: renamed from: ֫ */
    public final void mo1003(InterfaceC21830 interfaceC21830, C19259 c19259) {
        c19259.m44443();
        this.f27965 = c19259.m44444();
        this.f27969 = interfaceC21830.mo3429(c19259.m44445(), 1);
    }

    @Override // l.InterfaceC15583
    /* JADX INFO: renamed from: ֫ */
    public final void mo1001(int i, long j) {
        this.f27967 = j;
    }

    /* JADX WARN: Code duplicated, block: B:61:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:64:0x01b2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:65:0x01b4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:66:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:67:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:68:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:70:0x01cf  */
    @Override // l.InterfaceC15583
    /* JADX INFO: renamed from: ֫ */
    public final void mo1002(C17714 c17714) throws C9080 {
        int i;
        char c;
        byte b;
        int i2;
        char c2;
        char c3;
        boolean z;
        int i3;
        int i4;
        byte b2;
        int i5;
        byte b3;
        int i6;
        byte b4;
        C22632.m50632(this.f27969);
        while (c17714.m41457() > 0) {
            int i7 = this.f27956;
            C17714 c17715 = this.f27970;
            switch (i7) {
                case 0:
                    while (c17714.m41457() > 0) {
                        int i8 = this.f27957 << 8;
                        this.f27957 = i8;
                        int iM41456 = i8 | c17714.m41456();
                        this.f27957 = iM41456;
                        if (iM41456 == 2147385345 || iM41456 == -25230976 || iM41456 == 536864768 || iM41456 == -14745368) {
                            i = 1;
                        } else if (iM41456 == 1683496997 || iM41456 == 622876772) {
                            i = 2;
                        } else if (iM41456 == 1078008818 || iM41456 == -233094848) {
                            i = 3;
                        } else {
                            i = (iM41456 == 1908687592 || iM41456 == -398277519) ? 4 : 0;
                        }
                        this.f27962 = i;
                        if (i != 0) {
                            byte[] bArrM41482 = c17715.m41482();
                            int i9 = this.f27957;
                            bArrM41482[0] = (byte) ((i9 >> 24) & 255);
                            bArrM41482[1] = (byte) ((i9 >> 16) & 255);
                            bArrM41482[2] = (byte) ((i9 >> 8) & 255);
                            bArrM41482[3] = (byte) (i9 & 255);
                            this.f27955 = 4;
                            this.f27957 = 0;
                            int i10 = this.f27962;
                            if (i10 != 3 && i10 != 4) {
                                if (i10 == 1) {
                                    this.f27956 = 1;
                                } else {
                                    this.f27956 = 2;
                                }
                            }
                            this.f27956 = 4;
                        }
                        break;
                    }
                    break;
                case 1:
                    if (m23678(c17714, c17715.m41482(), 18)) {
                        byte[] bArrM41483 = c17715.m41482();
                        if (this.f27966 == null) {
                            c = 7;
                            C8353 c8353M15894 = C5602.m15894(this.f27960, this.f27965, this.f27958, this.f27961, bArrM41483);
                            this.f27966 = c8353M15894;
                            this.f27969.mo8456(c8353M15894);
                        } else {
                            c = 7;
                        }
                        byte b5 = bArrM41483[0];
                        if (b5 != -2) {
                            if (b5 == -1) {
                                i6 = ((3 & bArrM41483[c]) << 12) | ((bArrM41483[6] & 255) << 4);
                                b4 = bArrM41483[9];
                            } else if (b5 == 31) {
                                i6 = ((bArrM41483[c] & 255) << 4) | ((bArrM41483[6] & 3) << 12);
                                b4 = bArrM41483[8];
                            } else {
                                c2 = 5;
                                i2 = ((bArrM41483[5] & 3) << 12) | ((bArrM41483[6] & 255) << 4);
                                b = bArrM41483[c];
                            }
                            c3 = 5;
                            i3 = (i6 | ((b4 & 60) >> 2)) + 1;
                            z = true;
                            if (z) {
                                i3 = (i3 * 16) / 14;
                            }
                            this.f27963 = i3;
                            if (b5 != -2) {
                                if (b5 != -1) {
                                    i4 = (bArrM41483[4] & 7) << 4;
                                    b3 = bArrM41483[c];
                                } else if (b5 != 31) {
                                    i4 = (bArrM41483[c3] & 7) << 4;
                                    b3 = bArrM41483[6];
                                } else {
                                    i4 = (bArrM41483[4] & 1) << 6;
                                    b2 = bArrM41483[c3];
                                }
                                i5 = b3 & 60;
                                this.f27959 = C13426.m32446(C3603.m11013(this.f27966.f25624, (((i5 >> 2) | i4) + 1) * 32));
                                c17715.m41484(0);
                                this.f27969.mo8453(18, c17715);
                                this.f27956 = 6;
                            } else {
                                i4 = (bArrM41483[c3] & 1) << 6;
                                b2 = bArrM41483[4];
                            }
                            i5 = b2 & Poly1305KeyGenerator.R_MASK_LOW_2;
                            this.f27959 = C13426.m32446(C3603.m11013(this.f27966.f25624, (((i5 >> 2) | i4) + 1) * 32));
                            c17715.m41484(0);
                            this.f27969.mo8453(18, c17715);
                            this.f27956 = 6;
                        } else {
                            int i11 = ((3 & bArrM41483[4]) << 12) | ((bArrM41483[c] & 255) << 4);
                            b = bArrM41483[6];
                            i2 = i11;
                            c2 = 5;
                        }
                        i3 = (i2 | ((b & 240) >> 4)) + 1;
                        c3 = c2;
                        z = false;
                        if (z) {
                            i3 = (i3 * 16) / 14;
                        }
                        this.f27963 = i3;
                        if (b5 != -2) {
                            if (b5 != -1) {
                                i4 = (bArrM41483[4] & 7) << 4;
                                b3 = bArrM41483[c];
                            } else if (b5 != 31) {
                                i4 = (bArrM41483[c3] & 7) << 4;
                                b3 = bArrM41483[6];
                            } else {
                                i4 = (bArrM41483[4] & 1) << 6;
                                b2 = bArrM41483[c3];
                            }
                            i5 = b3 & 60;
                            this.f27959 = C13426.m32446(C3603.m11013(this.f27966.f25624, (((i5 >> 2) | i4) + 1) * 32));
                            c17715.m41484(0);
                            this.f27969.mo8453(18, c17715);
                            this.f27956 = 6;
                        } else {
                            i4 = (bArrM41483[c3] & 1) << 6;
                            b2 = bArrM41483[4];
                        }
                        i5 = b2 & Poly1305KeyGenerator.R_MASK_LOW_2;
                        this.f27959 = C13426.m32446(C3603.m11013(this.f27966.f25624, (((i5 >> 2) | i4) + 1) * 32));
                        c17715.m41484(0);
                        this.f27969.mo8453(18, c17715);
                        this.f27956 = 6;
                        break;
                    }
                    break;
                case 2:
                    if (m23678(c17714, c17715.m41482(), 7)) {
                        this.f27964 = C5602.m15897(c17715.m41482());
                        this.f27956 = 3;
                    }
                    break;
                case 3:
                    if (m23678(c17714, c17715.m41482(), this.f27964)) {
                        C0662 c0662M15896 = C5602.m15896(c17715.m41482());
                        m23677(c0662M15896);
                        this.f27963 = c0662M15896.f2562;
                        long j = c0662M15896.f2561;
                        if (j == -9223372036854775807L) {
                            j = 0;
                        }
                        this.f27959 = j;
                        c17715.m41484(0);
                        this.f27969.mo8453(this.f27964, c17715);
                        this.f27956 = 6;
                    }
                    break;
                case 4:
                    if (m23678(c17714, c17715.m41482(), 6)) {
                        int iM15898 = C5602.m15898(c17715.m41482());
                        this.f27954 = iM15898;
                        int i12 = this.f27955;
                        if (i12 > iM15898) {
                            int i13 = i12 - iM15898;
                            this.f27955 = i12 - i13;
                            c17714.m41484(c17714.m41485() - i13);
                        }
                        this.f27956 = 5;
                    }
                    break;
                case 5:
                    if (m23678(c17714, c17715.m41482(), this.f27954)) {
                        C0662 c0662M15893 = C5602.m15893(c17715.m41482(), this.f27968);
                        if (this.f27962 == 3) {
                            m23677(c0662M15893);
                        }
                        this.f27963 = c0662M15893.f2562;
                        long j2 = c0662M15893.f2561;
                        if (j2 == -9223372036854775807L) {
                            j2 = 0;
                        }
                        this.f27959 = j2;
                        c17715.m41484(0);
                        this.f27969.mo8453(this.f27954, c17715);
                        this.f27956 = 6;
                    }
                    break;
                case 6:
                    int iMin = Math.min(c17714.m41457(), this.f27963 - this.f27955);
                    this.f27969.mo8453(iMin, c17714);
                    int i14 = this.f27955 + iMin;
                    this.f27955 = i14;
                    if (i14 == this.f27963) {
                        C22632.m50634(this.f27967 != -9223372036854775807L);
                        this.f27969.mo8455(this.f27967, this.f27962 == 4 ? 0 : 1, this.f27963, 0, null);
                        this.f27967 += this.f27959;
                        this.f27956 = 0;
                    }
                    break;
                default:
                    throw new IllegalStateException();
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m23678(C17714 c17714, byte[] bArr, int i) {
        int iMin = Math.min(c17714.m41457(), i - this.f27955);
        c17714.m41461(this.f27955, iMin, bArr);
        int i2 = this.f27955 + iMin;
        this.f27955 = i2;
        return i2 == i;
    }

    @RequiresNonNull({"output"})
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m23677(C0662 c0662) {
        int i = c0662.f2563;
        String str = c0662.f2564;
        int i2 = c0662.f2560;
        if (i == -2147483647 || i2 == -1) {
            return;
        }
        C8353 c8353 = this.f27966;
        if (c8353 != null && i2 == c8353.f25625 && i == c8353.f25624 && str.equals(c8353.f25614)) {
            return;
        }
        C8353 c8354 = this.f27966;
        C1297 c1297 = c8354 == null ? new C1297() : c8354.m21948();
        c1297.m4469(this.f27965);
        c1297.m4462(this.f27961);
        c1297.m4465(str);
        c1297.m4472(i2);
        c1297.m4456(i);
        c1297.m4471(this.f27958);
        c1297.m4454(this.f27960);
        C8353 c8353M4440 = c1297.m4440();
        this.f27966 = c8353M4440;
        this.f27969.mo8456(c8353M4440);
    }
}
