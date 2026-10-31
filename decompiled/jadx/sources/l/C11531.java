package l;

import com.alipay.sdk.m.p.a;
import com.google.android.material.color.ColorResourcesTableCreator;
import com.umeng.analytics.pro.cb;
import java.util.Arrays;
import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;

/* JADX INFO: renamed from: l.ۨۜۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: J9OT */
/* JADX INFO: loaded from: classes4.dex */
public final class C11531 extends AbstractC7297 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f34430;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f34431;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f34432;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f34433;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final byte[] f34434;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f34435;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f34436;

    public C11531(boolean z, int i, int i2, byte[] bArr) {
        super(0);
        this.f34436 = Integer.MAX_VALUE;
        this.f34434 = bArr;
        this.f34435 = i2 + i;
        this.f34432 = i;
        this.f34431 = i;
    }

    @Override // l.AbstractC7297
    /* JADX INFO: renamed from: ܶ */
    public final int mo19567() throws C2025 {
        if (mo19572()) {
            this.f34430 = 0;
            return 0;
        }
        int iMo19558 = mo19558();
        this.f34430 = iMo19558;
        if ((iMo19558 >>> 3) != 0) {
            return iMo19558;
        }
        throw C2025.m6581();
    }

    @Override // l.AbstractC7297
    /* JADX INFO: renamed from: ֫ */
    public final void mo19554(int i) throws C2025 {
        if (this.f34430 != i) {
            throw C2025.m6579();
        }
    }

    @Override // l.AbstractC7297
    /* JADX INFO: renamed from: ᩳ */
    public final boolean mo19573(int i) throws C2025 {
        int iMo19567;
        int i2 = i & 7;
        int i3 = 0;
        if (i2 == 0) {
            int i4 = this.f34435 - this.f34432;
            byte[] bArr = this.f34434;
            if (i4 >= 10) {
                while (i3 < 10) {
                    int i5 = this.f34432;
                    this.f34432 = i5 + 1;
                    if (bArr[i5] < 0) {
                        i3++;
                    }
                }
                throw C2025.m6580();
            }
            while (i3 < 10) {
                int i6 = this.f34432;
                if (i6 == this.f34435) {
                    throw C2025.m6584();
                }
                this.f34432 = i6 + 1;
                if (bArr[i6] < 0) {
                    i3++;
                }
            }
            throw C2025.m6580();
            return true;
        }
        if (i2 == 1) {
            m28407(8);
            return true;
        }
        if (i2 == 2) {
            m28407(mo19558());
            return true;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                return false;
            }
            if (i2 == 5) {
                m28407(4);
                return true;
            }
            throw C2025.m6582();
        }
        do {
            iMo19567 = mo19567();
            if (iMo19567 == 0) {
                break;
            }
        } while (mo19573(iMo19567));
        mo19554(((i >>> 3) << 3) | 4);
        return true;
    }

    @Override // l.AbstractC7297
    /* JADX INFO: renamed from: ᩻ */
    public final double mo19579() {
        return Double.longBitsToDouble(m28405());
    }

    @Override // l.AbstractC7297
    /* JADX INFO: renamed from: ۡ */
    public final float mo19562() {
        return Float.intBitsToFloat(m28408());
    }

    @Override // l.AbstractC7297
    /* JADX INFO: renamed from: ᩹ */
    public final long mo19578() {
        return m28404();
    }

    @Override // l.AbstractC7297
    /* JADX INFO: renamed from: ۖ */
    public final long mo19557() {
        return m28404();
    }

    @Override // l.AbstractC7297
    /* JADX INFO: renamed from: ܺ */
    public final int mo19568() {
        return mo19558();
    }

    @Override // l.AbstractC7297
    /* JADX INFO: renamed from: ۢ */
    public final long mo19563() {
        return m28405();
    }

    @Override // l.AbstractC7297
    /* JADX INFO: renamed from: ᩷ */
    public final int mo19576() {
        return m28408();
    }

    @Override // l.AbstractC7297
    /* JADX INFO: renamed from: ܿ */
    public final boolean mo19571() {
        return m28404() != 0;
    }

    @Override // l.AbstractC7297
    /* JADX INFO: renamed from: ֨ */
    public final String mo19551() throws C2025 {
        int iMo19558 = mo19558();
        if (iMo19558 > 0) {
            int i = this.f34435;
            int i2 = this.f34432;
            if (iMo19558 <= i - i2) {
                String str = new String(this.f34434, i2, iMo19558, C13997.f41724);
                this.f34432 += iMo19558;
                return str;
            }
        }
        if (iMo19558 == 0) {
            return "";
        }
        if (iMo19558 < 0) {
            throw C2025.m6585();
        }
        throw C2025.m6584();
    }

    @Override // l.AbstractC7297
    /* JADX INFO: renamed from: ۠ */
    public final String mo19561() throws C2025 {
        int iMo19558 = mo19558();
        if (iMo19558 > 0) {
            int i = this.f34435;
            int i2 = this.f34432;
            if (iMo19558 <= i - i2) {
                String strM29455 = C12071.m29455(i2, iMo19558, this.f34434);
                this.f34432 += iMo19558;
                return strM29455;
            }
        }
        if (iMo19558 == 0) {
            return "";
        }
        if (iMo19558 <= 0) {
            throw C2025.m6585();
        }
        throw C2025.m6584();
    }

    @Override // l.AbstractC7297
    /* JADX INFO: renamed from: ֫ */
    public final void mo19555(int i, InterfaceC9228 interfaceC9228, C17798 c17798) throws C2025 {
        m19553();
        this.f22399++;
        interfaceC9228.mergeFrom(this, c17798);
        mo19554((i << 3) | 4);
        this.f22399--;
    }

    @Override // l.AbstractC7297
    /* JADX INFO: renamed from: ֫ */
    public final void mo19556(InterfaceC9228 interfaceC9228, C17798 c17798) throws C2025 {
        int iMo19558 = mo19558();
        m19553();
        int iMo19570 = mo19570(iMo19558);
        this.f22399++;
        interfaceC9228.mergeFrom(this, c17798);
        mo19554(0);
        this.f22399--;
        if (mo19564() != 0) {
            throw C2025.m6584();
        }
        mo19565(iMo19570);
    }

    @Override // l.AbstractC7297
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC8522 mo19552(InterfaceC12050 interfaceC12050, C17798 c17798) throws C2025 {
        int iMo19558 = mo19558();
        m19553();
        int iMo19570 = mo19570(iMo19558);
        this.f22399++;
        InterfaceC8522 interfaceC8522 = (InterfaceC8522) interfaceC12050.parsePartialFrom(this, c17798);
        mo19554(0);
        this.f22399--;
        if (mo19564() != 0) {
            throw C2025.m6584();
        }
        mo19565(iMo19570);
        return interfaceC8522;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0031 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0033  */
    /* JADX WARN: Code duplicated, block: B:20:0x003d  */
    /* JADX WARN: Code duplicated, block: B:22:0x0042  */
    @Override // l.AbstractC7297
    /* JADX INFO: renamed from: ܳ */
    public final AbstractC5886 mo19566() throws C2025 {
        byte[] bArrCopyOfRange;
        int iMo19558 = mo19558();
        byte[] bArr = this.f34434;
        if (iMo19558 > 0) {
            int i = this.f34435;
            int i2 = this.f34432;
            if (iMo19558 <= i - i2) {
                AbstractC5886 abstractC5886M16490 = AbstractC5886.m16490(i2, iMo19558, bArr);
                this.f34432 += iMo19558;
                return abstractC5886M16490;
            }
        }
        if (iMo19558 == 0) {
            return AbstractC5886.f18080;
        }
        if (iMo19558 > 0) {
            int i3 = this.f34435;
            int i4 = this.f34432;
            if (iMo19558 <= i3 - i4) {
                int i5 = iMo19558 + i4;
                this.f34432 = i5;
                bArrCopyOfRange = Arrays.copyOfRange(bArr, i4, i5);
            } else {
                if (iMo19558 <= 0) {
                    throw C2025.m6584();
                }
                if (iMo19558 == 0) {
                    bArrCopyOfRange = C13997.f41722;
                } else {
                    throw C2025.m6585();
                }
            }
        } else {
            if (iMo19558 <= 0) {
                throw C2025.m6584();
            }
            if (iMo19558 == 0) {
                bArrCopyOfRange = C13997.f41722;
            } else {
                throw C2025.m6585();
            }
        }
        AbstractC5886 abstractC5886 = AbstractC5886.f18080;
        return new C12236(bArrCopyOfRange);
    }

    @Override // l.AbstractC7297
    /* JADX INFO: renamed from: ᩸ */
    public final int mo19577() {
        return mo19558();
    }

    @Override // l.AbstractC7297
    /* JADX INFO: renamed from: ۜ */
    public final int mo19560() {
        return mo19558();
    }

    @Override // l.AbstractC7297
    /* JADX INFO: renamed from: ᩴ */
    public final int mo19574() {
        return m28408();
    }

    @Override // l.AbstractC7297
    /* JADX INFO: renamed from: ᩵ */
    public final long mo19575() {
        return m28405();
    }

    @Override // l.AbstractC7297
    /* JADX INFO: renamed from: ֡ */
    public final int mo19550() {
        return AbstractC7297.m19549(mo19558());
    }

    @Override // l.AbstractC7297
    /* JADX INFO: renamed from: ۚ */
    public final long mo19559() {
        return AbstractC7297.m19546(m28404());
    }

    @Override // l.AbstractC7297
    /* JADX INFO: renamed from: ۘ */
    public final int mo19558() {
        int i;
        int i2 = this.f34432;
        int i3 = this.f34435;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.f34434;
            byte b = bArr[i2];
            if (b >= 0) {
                this.f34432 = i4;
                return b;
            }
            if (i3 - i4 >= 9) {
                int i5 = i2 + 2;
                int i6 = (bArr[i4] << 7) ^ b;
                if (i6 < 0) {
                    i = i6 ^ a.g;
                } else {
                    int i7 = i2 + 3;
                    int i8 = (bArr[i5] << cb.f77931l) ^ i6;
                    if (i8 >= 0) {
                        i = i8 ^ 16256;
                    } else {
                        int i9 = i2 + 4;
                        int i10 = i8 ^ (bArr[i7] << 21);
                        if (i10 < 0) {
                            i = (-2080896) ^ i10;
                        } else {
                            i7 = i2 + 5;
                            byte b2 = bArr[i9];
                            int i11 = (i10 ^ (b2 << ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB)) ^ 266354560;
                            if (b2 < 0) {
                                i9 = i2 + 6;
                                if (bArr[i7] < 0) {
                                    i7 = i2 + 7;
                                    if (bArr[i9] < 0) {
                                        i9 = i2 + 8;
                                        if (bArr[i7] < 0) {
                                            i7 = i2 + 9;
                                            if (bArr[i9] < 0) {
                                                int i12 = i2 + 10;
                                                if (bArr[i7] >= 0) {
                                                    i5 = i12;
                                                    i = i11;
                                                }
                                            }
                                        }
                                    }
                                }
                                i = i11;
                            }
                            i = i11;
                        }
                        i5 = i9;
                    }
                    i5 = i7;
                }
                this.f34432 = i5;
                return i;
            }
        }
        return (int) m28406();
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final long m28404() {
        long j;
        long j2;
        long j3;
        long j4;
        int i = this.f34432;
        int i2 = this.f34435;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.f34434;
            byte b = bArr[i];
            if (b >= 0) {
                this.f34432 = i3;
                return b;
            }
            if (i2 - i3 >= 9) {
                int i4 = i + 2;
                int i5 = (bArr[i3] << 7) ^ b;
                if (i5 < 0) {
                    j = i5 ^ a.g;
                } else {
                    int i6 = i + 3;
                    int i7 = (bArr[i4] << cb.f77931l) ^ i5;
                    if (i7 >= 0) {
                        j = i7 ^ 16256;
                        i4 = i6;
                    } else {
                        int i8 = i + 4;
                        int i9 = i7 ^ (bArr[i6] << 21);
                        if (i9 < 0) {
                            j4 = (-2080896) ^ i9;
                        } else {
                            long j5 = i9;
                            i4 = i + 5;
                            long j6 = j5 ^ (((long) bArr[i8]) << 28);
                            if (j6 >= 0) {
                                j3 = 266354560;
                            } else {
                                i8 = i + 6;
                                long j7 = j6 ^ (((long) bArr[i4]) << 35);
                                if (j7 < 0) {
                                    j2 = -34093383808L;
                                } else {
                                    i4 = i + 7;
                                    j6 = j7 ^ (((long) bArr[i8]) << 42);
                                    if (j6 >= 0) {
                                        j3 = 4363953127296L;
                                    } else {
                                        i8 = i + 8;
                                        j7 = j6 ^ (((long) bArr[i4]) << 49);
                                        if (j7 < 0) {
                                            j2 = -558586000294016L;
                                        } else {
                                            i4 = i + 9;
                                            long j8 = (j7 ^ (((long) bArr[i8]) << 56)) ^ 71499008037633920L;
                                            if (j8 < 0) {
                                                int i10 = i + 10;
                                                if (bArr[i4] >= 0) {
                                                    i4 = i10;
                                                }
                                            }
                                            j = j8;
                                        }
                                    }
                                }
                                j4 = j2 ^ j7;
                            }
                            j = j3 ^ j6;
                        }
                        i4 = i8;
                        j = j4;
                    }
                }
                this.f34432 = i4;
                return j;
            }
        }
        return m28406();
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int m28408() throws C2025 {
        int i = this.f34432;
        if (this.f34435 - i < 4) {
            throw C2025.m6584();
        }
        this.f34432 = i + 4;
        byte[] bArr = this.f34434;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m28405() throws C2025 {
        int i = this.f34432;
        if (this.f34435 - i < 8) {
            throw C2025.m6584();
        }
        this.f34432 = i + 8;
        byte[] bArr = this.f34434;
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    @Override // l.AbstractC7297
    /* JADX INFO: renamed from: ܽ */
    public final int mo19570(int i) {
        if (i < 0) {
            throw C2025.m6585();
        }
        int iMo19569 = i + mo19569();
        if (iMo19569 < 0) {
            throw C2025.m6578();
        }
        int i2 = this.f34436;
        if (iMo19569 > i2) {
            throw C2025.m6584();
        }
        this.f34436 = iMo19569;
        m28403();
        return i2;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    private void m28403() {
        int i = this.f34435 + this.f34433;
        this.f34435 = i;
        int i2 = i - this.f34431;
        int i3 = this.f34436;
        if (i2 > i3) {
            int i4 = i2 - i3;
            this.f34433 = i4;
            this.f34435 = i - i4;
            return;
        }
        this.f34433 = 0;
    }

    @Override // l.AbstractC7297
    /* JADX INFO: renamed from: ۧ */
    public final void mo19565(int i) {
        this.f34436 = i;
        m28403();
    }

    @Override // l.AbstractC7297
    /* JADX INFO: renamed from: ۧ */
    public final int mo19564() {
        int i = this.f34436;
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i - mo19569();
    }

    @Override // l.AbstractC7297
    /* JADX INFO: renamed from: ᩳ */
    public final boolean mo19572() {
        return this.f34432 == this.f34435;
    }

    @Override // l.AbstractC7297
    /* JADX INFO: renamed from: ܽ */
    public final int mo19569() {
        return this.f34432 - this.f34431;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final long m28406() throws C2025 {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            int i2 = this.f34432;
            if (i2 == this.f34435) {
                throw C2025.m6584();
            }
            this.f34432 = i2 + 1;
            byte b = this.f34434[i2];
            j |= ((long) (b & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID)) << i;
            if ((b & GCMSIVBlockCipher.MASK) == 0) {
                return j;
            }
        }
        throw C2025.m6580();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m28407(int i) throws C2025 {
        if (i >= 0) {
            int i2 = this.f34435;
            int i3 = this.f34432;
            if (i <= i2 - i3) {
                this.f34432 = i3 + i;
                return;
            }
        }
        if (i < 0) {
            throw C2025.m6585();
        }
        throw C2025.m6584();
    }
}
