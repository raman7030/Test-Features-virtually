package p067l;

import com.alipay.sdk.p010m.p041p.C0184a;
import com.google.android.material.color.ColorResourcesTableCreator;
import com.umeng.analytics.pro.C0698cb;
import java.util.Arrays;
import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;

/* JADX INFO: renamed from: l.ۨۜۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: J9OT */
/* JADX INFO: loaded from: classes4.dex */
public final class C13327 extends AbstractC9303 {

    /* JADX INFO: renamed from: ۜ */
    public int f37427;

    /* JADX INFO: renamed from: ۡ */
    public int f37428;

    /* JADX INFO: renamed from: ۢ */
    public int f37429;

    /* JADX INFO: renamed from: ܳ */
    public int f37430;

    /* JADX INFO: renamed from: ܿ */
    public final byte[] f37431;

    /* JADX INFO: renamed from: ᩷ */
    public int f37432;

    /* JADX INFO: renamed from: ᩻ */
    public int f37433;

    public C13327(boolean z, int i, int i2, byte[] bArr) {
        super(0);
        this.f37433 = Integer.MAX_VALUE;
        this.f37431 = bArr;
        this.f37432 = i2 + i;
        this.f37429 = i;
        this.f37428 = i;
    }

    @Override // p067l.AbstractC9303
    /* JADX INFO: renamed from: ܶ */
    public final int mo21535() throws C4293 {
        if (mo21540()) {
            this.f37427 = 0;
            return 0;
        }
        int iMo21526 = mo21526();
        this.f37427 = iMo21526;
        if ((iMo21526 >>> 3) != 0) {
            return iMo21526;
        }
        throw C4293.m8707();
    }

    @Override // p067l.AbstractC9303
    /* JADX INFO: renamed from: ֫ */
    public final void mo21522(int i) throws C4293 {
        if (this.f37427 != i) {
            throw C4293.m8705();
        }
    }

    @Override // p067l.AbstractC9303
    /* JADX INFO: renamed from: ᩳ */
    public final boolean mo21541(int i) throws C4293 {
        int iMo21535;
        int i2 = i & 7;
        int i3 = 0;
        if (i2 == 0) {
            int i4 = this.f37432 - this.f37429;
            byte[] bArr = this.f37431;
            if (i4 >= 10) {
                while (i3 < 10) {
                    int i5 = this.f37429;
                    this.f37429 = i5 + 1;
                    if (bArr[i5] < 0) {
                        i3++;
                    }
                }
                throw C4293.m8706();
            }
            while (i3 < 10) {
                int i6 = this.f37429;
                if (i6 == this.f37432) {
                    throw C4293.m8710();
                }
                this.f37429 = i6 + 1;
                if (bArr[i6] < 0) {
                    i3++;
                }
            }
            throw C4293.m8706();
            return true;
        }
        if (i2 == 1) {
            m30453(8);
            return true;
        }
        if (i2 == 2) {
            m30453(mo21526());
            return true;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                return false;
            }
            if (i2 == 5) {
                m30453(4);
                return true;
            }
            throw C4293.m8708();
        }
        do {
            iMo21535 = mo21535();
            if (iMo21535 == 0) {
                break;
            }
        } while (mo21541(iMo21535));
        mo21522(((i >>> 3) << 3) | 4);
        return true;
    }

    @Override // p067l.AbstractC9303
    /* JADX INFO: renamed from: ᩻ */
    public final double mo21547() {
        return Double.longBitsToDouble(m30451());
    }

    @Override // p067l.AbstractC9303
    /* JADX INFO: renamed from: ۡ */
    public final float mo21530() {
        return Float.intBitsToFloat(m30454());
    }

    @Override // p067l.AbstractC9303
    /* JADX INFO: renamed from: ᩹ */
    public final long mo21546() {
        return m30450();
    }

    @Override // p067l.AbstractC9303
    /* JADX INFO: renamed from: ۖ */
    public final long mo21525() {
        return m30450();
    }

    @Override // p067l.AbstractC9303
    /* JADX INFO: renamed from: ܺ */
    public final int mo21536() {
        return mo21526();
    }

    @Override // p067l.AbstractC9303
    /* JADX INFO: renamed from: ۢ */
    public final long mo21531() {
        return m30451();
    }

    @Override // p067l.AbstractC9303
    /* JADX INFO: renamed from: ᩷ */
    public final int mo21544() {
        return m30454();
    }

    @Override // p067l.AbstractC9303
    /* JADX INFO: renamed from: ܿ */
    public final boolean mo21539() {
        return m30450() != 0;
    }

    @Override // p067l.AbstractC9303
    /* JADX INFO: renamed from: ֨ */
    public final String mo21519() throws C4293 {
        int iMo21526 = mo21526();
        if (iMo21526 > 0) {
            int i = this.f37432;
            int i2 = this.f37429;
            if (iMo21526 <= i - i2) {
                String str = new String(this.f37431, i2, iMo21526, C15671.f44807);
                this.f37429 += iMo21526;
                return str;
            }
        }
        if (iMo21526 == 0) {
            return "";
        }
        if (iMo21526 < 0) {
            throw C4293.m8711();
        }
        throw C4293.m8710();
    }

    @Override // p067l.AbstractC9303
    /* JADX INFO: renamed from: ۠ */
    public final String mo21529() throws C4293 {
        int iMo21526 = mo21526();
        if (iMo21526 > 0) {
            int i = this.f37432;
            int i2 = this.f37429;
            if (iMo21526 <= i - i2) {
                String strM31517 = C13840.m31517(i2, iMo21526, this.f37431);
                this.f37429 += iMo21526;
                return strM31517;
            }
        }
        if (iMo21526 == 0) {
            return "";
        }
        if (iMo21526 <= 0) {
            throw C4293.m8711();
        }
        throw C4293.m8710();
    }

    @Override // p067l.AbstractC9303
    /* JADX INFO: renamed from: ֫ */
    public final void mo21523(int i, InterfaceC11138 interfaceC11138, C19283 c19283) throws C4293 {
        m21521();
        this.f25290++;
        interfaceC11138.mergeFrom(this, c19283);
        mo21522((i << 3) | 4);
        this.f25290--;
    }

    @Override // p067l.AbstractC9303
    /* JADX INFO: renamed from: ֫ */
    public final void mo21524(InterfaceC11138 interfaceC11138, C19283 c19283) throws C4293 {
        int iMo21526 = mo21526();
        m21521();
        int iMo21538 = mo21538(iMo21526);
        this.f25290++;
        interfaceC11138.mergeFrom(this, c19283);
        mo21522(0);
        this.f25290--;
        if (mo21532() != 0) {
            throw C4293.m8710();
        }
        mo21533(iMo21538);
    }

    @Override // p067l.AbstractC9303
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC10467 mo21520(InterfaceC13820 interfaceC13820, C19283 c19283) throws C4293 {
        int iMo21526 = mo21526();
        m21521();
        int iMo21538 = mo21538(iMo21526);
        this.f25290++;
        InterfaceC10467 interfaceC10467 = (InterfaceC10467) interfaceC13820.parsePartialFrom(this, c19283);
        mo21522(0);
        this.f25290--;
        if (mo21532() != 0) {
            throw C4293.m8710();
        }
        mo21533(iMo21538);
        return interfaceC10467;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0031 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0033  */
    /* JADX WARN: Code duplicated, block: B:20:0x003d  */
    /* JADX WARN: Code duplicated, block: B:22:0x0042  */
    @Override // p067l.AbstractC9303
    /* JADX INFO: renamed from: ܳ */
    public final AbstractC7962 mo21534() throws C4293 {
        byte[] bArrCopyOfRange;
        int iMo21526 = mo21526();
        byte[] bArr = this.f37431;
        if (iMo21526 > 0) {
            int i = this.f37432;
            int i2 = this.f37429;
            if (iMo21526 <= i - i2) {
                AbstractC7962 abstractC7962M18416 = AbstractC7962.m18416(i2, iMo21526, bArr);
                this.f37429 += iMo21526;
                return abstractC7962M18416;
            }
        }
        if (iMo21526 == 0) {
            return AbstractC7962.f20935;
        }
        if (iMo21526 > 0) {
            int i3 = this.f37432;
            int i4 = this.f37429;
            if (iMo21526 <= i3 - i4) {
                int i5 = iMo21526 + i4;
                this.f37429 = i5;
                bArrCopyOfRange = Arrays.copyOfRange(bArr, i4, i5);
            } else {
                if (iMo21526 <= 0) {
                    throw C4293.m8710();
                }
                if (iMo21526 == 0) {
                    bArrCopyOfRange = C15671.f44805;
                } else {
                    throw C4293.m8711();
                }
            }
        } else {
            if (iMo21526 <= 0) {
                throw C4293.m8710();
            }
            if (iMo21526 == 0) {
                bArrCopyOfRange = C15671.f44805;
            } else {
                throw C4293.m8711();
            }
        }
        AbstractC7962 abstractC7962 = AbstractC7962.f20935;
        return new C13997(bArrCopyOfRange);
    }

    @Override // p067l.AbstractC9303
    /* JADX INFO: renamed from: ᩸ */
    public final int mo21545() {
        return mo21526();
    }

    @Override // p067l.AbstractC9303
    /* JADX INFO: renamed from: ۜ */
    public final int mo21528() {
        return mo21526();
    }

    @Override // p067l.AbstractC9303
    /* JADX INFO: renamed from: ᩴ */
    public final int mo21542() {
        return m30454();
    }

    @Override // p067l.AbstractC9303
    /* JADX INFO: renamed from: ᩵ */
    public final long mo21543() {
        return m30451();
    }

    @Override // p067l.AbstractC9303
    /* JADX INFO: renamed from: ֡ */
    public final int mo21518() {
        return AbstractC9303.m21517(mo21526());
    }

    @Override // p067l.AbstractC9303
    /* JADX INFO: renamed from: ۚ */
    public final long mo21527() {
        return AbstractC9303.m21514(m30450());
    }

    @Override // p067l.AbstractC9303
    /* JADX INFO: renamed from: ۘ */
    public final int mo21526() {
        int i;
        int i2 = this.f37429;
        int i3 = this.f37432;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.f37431;
            byte b = bArr[i2];
            if (b >= 0) {
                this.f37429 = i4;
                return b;
            }
            if (i3 - i4 >= 9) {
                int i5 = i2 + 2;
                int i6 = (bArr[i4] << 7) ^ b;
                if (i6 < 0) {
                    i = i6 ^ C0184a.f879g;
                } else {
                    int i7 = i2 + 3;
                    int i8 = (bArr[i5] << C0698cb.f2570l) ^ i6;
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
                this.f37429 = i5;
                return i;
            }
        }
        return (int) m30452();
    }

    /* JADX INFO: renamed from: ۗ */
    public final long m30450() {
        long j;
        long j2;
        long j3;
        long j4;
        int i = this.f37429;
        int i2 = this.f37432;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.f37431;
            byte b = bArr[i];
            if (b >= 0) {
                this.f37429 = i3;
                return b;
            }
            if (i2 - i3 >= 9) {
                int i4 = i + 2;
                int i5 = (bArr[i3] << 7) ^ b;
                if (i5 < 0) {
                    j = i5 ^ C0184a.f879g;
                } else {
                    int i6 = i + 3;
                    int i7 = (bArr[i4] << C0698cb.f2570l) ^ i5;
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
                this.f37429 = i4;
                return j;
            }
        }
        return m30452();
    }

    /* JADX INFO: renamed from: ᩶ */
    public final int m30454() throws C4293 {
        int i = this.f37429;
        if (this.f37432 - i < 4) {
            throw C4293.m8710();
        }
        this.f37429 = i + 4;
        byte[] bArr = this.f37431;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* JADX INFO: renamed from: ۙ */
    public final long m30451() throws C4293 {
        int i = this.f37429;
        if (this.f37432 - i < 8) {
            throw C4293.m8710();
        }
        this.f37429 = i + 8;
        byte[] bArr = this.f37431;
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    @Override // p067l.AbstractC9303
    /* JADX INFO: renamed from: ܽ */
    public final int mo21538(int i) {
        if (i < 0) {
            throw C4293.m8711();
        }
        int iMo21537 = i + mo21537();
        if (iMo21537 < 0) {
            throw C4293.m8704();
        }
        int i2 = this.f37433;
        if (iMo21537 > i2) {
            throw C4293.m8710();
        }
        this.f37433 = iMo21537;
        m30449();
        return i2;
    }

    /* JADX INFO: renamed from: ۫ */
    private void m30449() {
        int i = this.f37432 + this.f37430;
        this.f37432 = i;
        int i2 = i - this.f37428;
        int i3 = this.f37433;
        if (i2 > i3) {
            int i4 = i2 - i3;
            this.f37430 = i4;
            this.f37432 = i - i4;
            return;
        }
        this.f37430 = 0;
    }

    @Override // p067l.AbstractC9303
    /* JADX INFO: renamed from: ۧ */
    public final void mo21533(int i) {
        this.f37433 = i;
        m30449();
    }

    @Override // p067l.AbstractC9303
    /* JADX INFO: renamed from: ۧ */
    public final int mo21532() {
        int i = this.f37433;
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i - mo21537();
    }

    @Override // p067l.AbstractC9303
    /* JADX INFO: renamed from: ᩳ */
    public final boolean mo21540() {
        return this.f37429 == this.f37432;
    }

    @Override // p067l.AbstractC9303
    /* JADX INFO: renamed from: ܽ */
    public final int mo21537() {
        return this.f37429 - this.f37428;
    }

    /* JADX INFO: renamed from: ۬ */
    public final long m30452() throws C4293 {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            int i2 = this.f37429;
            if (i2 == this.f37432) {
                throw C4293.m8710();
            }
            this.f37429 = i2 + 1;
            byte b = this.f37431[i2];
            j |= ((long) (b & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID)) << i;
            if ((b & GCMSIVBlockCipher.MASK) == 0) {
                return j;
            }
        }
        throw C4293.m8706();
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m30453(int i) throws C4293 {
        if (i >= 0) {
            int i2 = this.f37432;
            int i3 = this.f37429;
            if (i <= i2 - i3) {
                this.f37429 = i3 + i;
                return;
            }
        }
        if (i < 0) {
            throw C4293.m8711();
        }
        throw C4293.m8710();
    }
}
