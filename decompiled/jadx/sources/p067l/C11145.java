package p067l;

import java.util.concurrent.atomic.AtomicInteger;
import org.bouncycastle.crypto.generators.Poly1305KeyGenerator;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: renamed from: l.ۢ֡ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: X8NN */
/* JADX INFO: loaded from: classes3.dex */
public final class C11145 implements InterfaceC17178 {

    /* JADX INFO: renamed from: ֫ */
    public int f30901;

    /* JADX INFO: renamed from: ۘ */
    public int f30903;

    /* JADX INFO: renamed from: ۜ */
    public final String f30904;

    /* JADX INFO: renamed from: ۡ */
    public long f30905;

    /* JADX INFO: renamed from: ۢ */
    public final int f30906;

    /* JADX INFO: renamed from: ܳ */
    public int f30908;

    /* JADX INFO: renamed from: ܺ */
    public int f30909;

    /* JADX INFO: renamed from: ܿ */
    public String f30911;

    /* JADX INFO: renamed from: ᩳ */
    public C10307 f30912;

    /* JADX INFO: renamed from: ᩷ */
    public InterfaceC20790 f30915;

    /* JADX INFO: renamed from: ᩻ */
    public final C19203 f30916;

    /* JADX INFO: renamed from: ۖ */
    public int f30902 = 0;

    /* JADX INFO: renamed from: ᩴ */
    public long f30913 = -9223372036854775807L;

    /* JADX INFO: renamed from: ᩵ */
    public final AtomicInteger f30914 = new AtomicInteger();

    /* JADX INFO: renamed from: ܽ */
    public int f30910 = -1;

    /* JADX INFO: renamed from: ֡ */
    public int f30900 = -1;

    /* JADX INFO: renamed from: ۧ */
    public final String f30907 = "video/mp2t";

    @Override // p067l.InterfaceC17178
    /* JADX INFO: renamed from: ֫ */
    public final void mo3399(boolean z) {
    }

    public C11145(String str, int i, int i2) {
        this.f30916 = new C19203(new byte[i2]);
        this.f30904 = str;
        this.f30906 = i;
    }

    @Override // p067l.InterfaceC17178
    /* JADX INFO: renamed from: ֫ */
    public final void mo3395() {
        this.f30902 = 0;
        this.f30901 = 0;
        this.f30903 = 0;
        this.f30913 = -9223372036854775807L;
        this.f30914.set(0);
    }

    @Override // p067l.InterfaceC17178
    /* JADX INFO: renamed from: ֫ */
    public final void mo3398(InterfaceC23116 interfaceC23116, C20672 c20672) {
        c20672.m46737();
        this.f30911 = c20672.m46738();
        this.f30915 = interfaceC23116.mo5732(c20672.m46739(), 1);
    }

    @Override // p067l.InterfaceC17178
    /* JADX INFO: renamed from: ֫ */
    public final void mo3396(int i, long j) {
        this.f30913 = j;
    }

    /* JADX WARN: Code duplicated, block: B:61:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:64:0x01b2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:65:0x01b4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:66:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:67:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:68:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:70:0x01cf  */
    @Override // p067l.InterfaceC17178
    /* JADX INFO: renamed from: ֫ */
    public final void mo3397(C19203 c19203) throws C10998 {
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
        C23877.m52958(this.f30915);
        while (c19203.m43703() > 0) {
            int i7 = this.f30902;
            C19203 c19204 = this.f30916;
            switch (i7) {
                case 0:
                    while (c19203.m43703() > 0) {
                        int i8 = this.f30903 << 8;
                        this.f30903 = i8;
                        int iM43702 = i8 | c19203.m43702();
                        this.f30903 = iM43702;
                        if (iM43702 == 2147385345 || iM43702 == -25230976 || iM43702 == 536864768 || iM43702 == -14745368) {
                            i = 1;
                        } else if (iM43702 == 1683496997 || iM43702 == 622876772) {
                            i = 2;
                        } else if (iM43702 == 1078008818 || iM43702 == -233094848) {
                            i = 3;
                        } else {
                            i = (iM43702 == 1908687592 || iM43702 == -398277519) ? 4 : 0;
                        }
                        this.f30908 = i;
                        if (i != 0) {
                            byte[] bArrM43728 = c19204.m43728();
                            int i9 = this.f30903;
                            bArrM43728[0] = (byte) ((i9 >> 24) & 255);
                            bArrM43728[1] = (byte) ((i9 >> 16) & 255);
                            bArrM43728[2] = (byte) ((i9 >> 8) & 255);
                            bArrM43728[3] = (byte) (i9 & 255);
                            this.f30901 = 4;
                            this.f30903 = 0;
                            int i10 = this.f30908;
                            if (i10 != 3 && i10 != 4) {
                                if (i10 == 1) {
                                    this.f30902 = 1;
                                } else {
                                    this.f30902 = 2;
                                }
                            }
                            this.f30902 = 4;
                        }
                        break;
                    }
                    break;
                case 1:
                    if (m25677(c19203, c19204.m43728(), 18)) {
                        byte[] bArrM43729 = c19204.m43728();
                        if (this.f30912 == null) {
                            c = 7;
                            C10307 c10307M17815 = C7693.m17815(this.f30906, this.f30911, this.f30904, this.f30907, bArrM43729);
                            this.f30912 = c10307M17815;
                            this.f30915.mo10503(c10307M17815);
                        } else {
                            c = 7;
                        }
                        byte b5 = bArrM43729[0];
                        if (b5 != -2) {
                            if (b5 == -1) {
                                i6 = ((3 & bArrM43729[c]) << 12) | ((bArrM43729[6] & 255) << 4);
                                b4 = bArrM43729[9];
                            } else if (b5 == 31) {
                                i6 = ((bArrM43729[c] & 255) << 4) | ((bArrM43729[6] & 3) << 12);
                                b4 = bArrM43729[8];
                            } else {
                                c2 = 5;
                                i2 = ((bArrM43729[5] & 3) << 12) | ((bArrM43729[6] & 255) << 4);
                                b = bArrM43729[c];
                            }
                            c3 = 5;
                            i3 = (i6 | ((b4 & 60) >> 2)) + 1;
                            z = true;
                            if (z) {
                                i3 = (i3 * 16) / 14;
                            }
                            this.f30909 = i3;
                            if (b5 != -2) {
                                if (b5 != -1) {
                                    i4 = (bArrM43729[4] & 7) << 4;
                                    b3 = bArrM43729[c];
                                } else if (b5 != 31) {
                                    i4 = (bArrM43729[c3] & 7) << 4;
                                    b3 = bArrM43729[6];
                                } else {
                                    i4 = (bArrM43729[4] & 1) << 6;
                                    b2 = bArrM43729[c3];
                                }
                                i5 = b3 & 60;
                                this.f30905 = C15129.m34548(C5792.m12989(this.f30912.f28538, (((i5 >> 2) | i4) + 1) * 32));
                                c19204.m43730(0);
                                this.f30915.mo10500(18, c19204);
                                this.f30902 = 6;
                            } else {
                                i4 = (bArrM43729[c3] & 1) << 6;
                                b2 = bArrM43729[4];
                            }
                            i5 = b2 & Poly1305KeyGenerator.R_MASK_LOW_2;
                            this.f30905 = C15129.m34548(C5792.m12989(this.f30912.f28538, (((i5 >> 2) | i4) + 1) * 32));
                            c19204.m43730(0);
                            this.f30915.mo10500(18, c19204);
                            this.f30902 = 6;
                        } else {
                            int i11 = ((3 & bArrM43729[4]) << 12) | ((bArrM43729[c] & 255) << 4);
                            b = bArrM43729[6];
                            i2 = i11;
                            c2 = 5;
                        }
                        i3 = (i2 | ((b & 240) >> 4)) + 1;
                        c3 = c2;
                        z = false;
                        if (z) {
                            i3 = (i3 * 16) / 14;
                        }
                        this.f30909 = i3;
                        if (b5 != -2) {
                            if (b5 != -1) {
                                i4 = (bArrM43729[4] & 7) << 4;
                                b3 = bArrM43729[c];
                            } else if (b5 != 31) {
                                i4 = (bArrM43729[c3] & 7) << 4;
                                b3 = bArrM43729[6];
                            } else {
                                i4 = (bArrM43729[4] & 1) << 6;
                                b2 = bArrM43729[c3];
                            }
                            i5 = b3 & 60;
                            this.f30905 = C15129.m34548(C5792.m12989(this.f30912.f28538, (((i5 >> 2) | i4) + 1) * 32));
                            c19204.m43730(0);
                            this.f30915.mo10500(18, c19204);
                            this.f30902 = 6;
                        } else {
                            i4 = (bArrM43729[c3] & 1) << 6;
                            b2 = bArrM43729[4];
                        }
                        i5 = b2 & Poly1305KeyGenerator.R_MASK_LOW_2;
                        this.f30905 = C15129.m34548(C5792.m12989(this.f30912.f28538, (((i5 >> 2) | i4) + 1) * 32));
                        c19204.m43730(0);
                        this.f30915.mo10500(18, c19204);
                        this.f30902 = 6;
                        break;
                    }
                    break;
                case 2:
                    if (m25677(c19203, c19204.m43728(), 7)) {
                        this.f30910 = C7693.m17818(c19204.m43728());
                        this.f30902 = 3;
                    }
                    break;
                case 3:
                    if (m25677(c19203, c19204.m43728(), this.f30910)) {
                        C2998 c2998M17817 = C7693.m17817(c19204.m43728());
                        m25676(c2998M17817);
                        this.f30909 = c2998M17817.f5335;
                        long j = c2998M17817.f5334;
                        if (j == -9223372036854775807L) {
                            j = 0;
                        }
                        this.f30905 = j;
                        c19204.m43730(0);
                        this.f30915.mo10500(this.f30910, c19204);
                        this.f30902 = 6;
                    }
                    break;
                case 4:
                    if (m25677(c19203, c19204.m43728(), 6)) {
                        int iM17819 = C7693.m17819(c19204.m43728());
                        this.f30900 = iM17819;
                        int i12 = this.f30901;
                        if (i12 > iM17819) {
                            int i13 = i12 - iM17819;
                            this.f30901 = i12 - i13;
                            c19203.m43730(c19203.m43731() - i13);
                        }
                        this.f30902 = 5;
                    }
                    break;
                case 5:
                    if (m25677(c19203, c19204.m43728(), this.f30900)) {
                        C2998 c2998M17814 = C7693.m17814(c19204.m43728(), this.f30914);
                        if (this.f30908 == 3) {
                            m25676(c2998M17814);
                        }
                        this.f30909 = c2998M17814.f5335;
                        long j2 = c2998M17814.f5334;
                        if (j2 == -9223372036854775807L) {
                            j2 = 0;
                        }
                        this.f30905 = j2;
                        c19204.m43730(0);
                        this.f30915.mo10500(this.f30900, c19204);
                        this.f30902 = 6;
                    }
                    break;
                case 6:
                    int iMin = Math.min(c19203.m43703(), this.f30909 - this.f30901);
                    this.f30915.mo10500(iMin, c19203);
                    int i14 = this.f30901 + iMin;
                    this.f30901 = i14;
                    if (i14 == this.f30909) {
                        C23877.m52960(this.f30913 != -9223372036854775807L);
                        this.f30915.mo10502(this.f30913, this.f30908 == 4 ? 0 : 1, this.f30909, 0, null);
                        this.f30913 += this.f30905;
                        this.f30902 = 0;
                    }
                    break;
                default:
                    throw new IllegalStateException();
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m25677(C19203 c19203, byte[] bArr, int i) {
        int iMin = Math.min(c19203.m43703(), i - this.f30901);
        c19203.m43707(this.f30901, iMin, bArr);
        int i2 = this.f30901 + iMin;
        this.f30901 = i2;
        return i2 == i;
    }

    @RequiresNonNull({"output"})
    /* JADX INFO: renamed from: ֫ */
    private void m25676(C2998 c2998) {
        int i = c2998.f5336;
        String str = c2998.f5337;
        int i2 = c2998.f5333;
        if (i == -2147483647 || i2 == -1) {
            return;
        }
        C10307 c10307 = this.f30912;
        if (c10307 != null && i2 == c10307.f28539 && i == c10307.f28538 && str.equals(c10307.f28528)) {
            return;
        }
        C10307 c10308 = this.f30912;
        C3601 c3601 = c10308 == null ? new C3601() : c10308.m23918();
        c3601.m6701(this.f30911);
        c3601.m6694(this.f30907);
        c3601.m6697(str);
        c3601.m6704(i2);
        c3601.m6688(i);
        c3601.m6703(this.f30904);
        c3601.m6686(this.f30906);
        C10307 c10307M6672 = c3601.m6672();
        this.f30912 = c10307M6672;
        this.f30915.mo10503(c10307M6672);
    }
}
