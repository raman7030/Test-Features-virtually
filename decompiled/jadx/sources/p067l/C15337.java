package p067l;

import com.alipay.sdk.p010m.p041p.C0184a;
import com.google.android.material.color.ColorResourcesTableCreator;
import com.umeng.analytics.pro.C0698cb;
import java.nio.ByteBuffer;
import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;

/* JADX INFO: renamed from: l.ܰۜۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: J9OT */
/* JADX INFO: loaded from: classes4.dex */
public final class C15337 extends AbstractC9303 {

    /* JADX INFO: renamed from: ۜ */
    public int f43784;

    /* JADX INFO: renamed from: ۡ */
    public long f43785;

    /* JADX INFO: renamed from: ۢ */
    public long f43786;

    /* JADX INFO: renamed from: ܳ */
    public final ByteBuffer f43787;

    /* JADX INFO: renamed from: ܺ */
    public long f43788;

    /* JADX INFO: renamed from: ܿ */
    public final long f43789;

    /* JADX INFO: renamed from: ᩷ */
    public int f43790;

    /* JADX INFO: renamed from: ᩻ */
    public int f43791;

    public C15337(ByteBuffer byteBuffer, boolean z) {
        super(0);
        this.f43784 = Integer.MAX_VALUE;
        this.f43787 = byteBuffer;
        long jM50550 = C22558.m50550(byteBuffer);
        this.f43789 = jM50550;
        this.f43786 = ((long) byteBuffer.limit()) + jM50550;
        long jPosition = jM50550 + ((long) byteBuffer.position());
        this.f43785 = jPosition;
        this.f43788 = jPosition;
    }

    @Override // p067l.AbstractC9303
    /* JADX INFO: renamed from: ܶ */
    public final int mo21535() throws C4293 {
        if (mo21540()) {
            this.f43790 = 0;
            return 0;
        }
        int iMo21526 = mo21526();
        this.f43790 = iMo21526;
        if ((iMo21526 >>> 3) != 0) {
            return iMo21526;
        }
        throw C4293.m8707();
    }

    @Override // p067l.AbstractC9303
    /* JADX INFO: renamed from: ֫ */
    public final void mo21522(int i) throws C4293 {
        if (this.f43790 != i) {
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
            if (((int) (this.f43786 - this.f43785)) >= 10) {
                while (i3 < 10) {
                    long j = this.f43785;
                    this.f43785 = j + 1;
                    if (C22558.m50547(j) < 0) {
                        i3++;
                    }
                }
                throw C4293.m8706();
            }
            while (i3 < 10) {
                long j2 = this.f43785;
                if (j2 == this.f43786) {
                    throw C4293.m8710();
                }
                this.f43785 = j2 + 1;
                if (C22558.m50547(j2) < 0) {
                    i3++;
                }
            }
            throw C4293.m8706();
            return true;
        }
        if (i2 == 1) {
            m34913(8);
            return true;
        }
        if (i2 == 2) {
            m34913(mo21526());
            return true;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                return false;
            }
            if (i2 == 5) {
                m34913(4);
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
        return Double.longBitsToDouble(m34911());
    }

    @Override // p067l.AbstractC9303
    /* JADX INFO: renamed from: ۡ */
    public final float mo21530() {
        return Float.intBitsToFloat(m34914());
    }

    @Override // p067l.AbstractC9303
    /* JADX INFO: renamed from: ᩹ */
    public final long mo21546() {
        return m34910();
    }

    @Override // p067l.AbstractC9303
    /* JADX INFO: renamed from: ۖ */
    public final long mo21525() {
        return m34910();
    }

    @Override // p067l.AbstractC9303
    /* JADX INFO: renamed from: ܺ */
    public final int mo21536() {
        return mo21526();
    }

    @Override // p067l.AbstractC9303
    /* JADX INFO: renamed from: ۢ */
    public final long mo21531() {
        return m34911();
    }

    @Override // p067l.AbstractC9303
    /* JADX INFO: renamed from: ᩷ */
    public final int mo21544() {
        return m34914();
    }

    @Override // p067l.AbstractC9303
    /* JADX INFO: renamed from: ܿ */
    public final boolean mo21539() {
        return m34910() != 0;
    }

    @Override // p067l.AbstractC9303
    /* JADX INFO: renamed from: ֨ */
    public final String mo21519() throws C4293 {
        int iMo21526 = mo21526();
        if (iMo21526 > 0) {
            long j = this.f43786;
            long j2 = this.f43785;
            if (iMo21526 <= ((int) (j - j2))) {
                byte[] bArr = new byte[iMo21526];
                long j3 = iMo21526;
                C22558.m50556(j2, bArr, 0L, j3);
                String str = new String(bArr, C15671.f44807);
                this.f43785 += j3;
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
            long j = this.f43786;
            long j2 = this.f43785;
            if (iMo21526 <= ((int) (j - j2))) {
                String strM31513 = C13840.m31513(this.f43787, (int) (j2 - this.f43789), iMo21526);
                this.f43785 += (long) iMo21526;
                return strM31513;
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

    @Override // p067l.AbstractC9303
    /* JADX INFO: renamed from: ܳ */
    public final AbstractC7962 mo21534() throws C4293 {
        int iMo21526 = mo21526();
        if (iMo21526 > 0) {
            long j = this.f43786;
            long j2 = this.f43785;
            if (iMo21526 <= ((int) (j - j2))) {
                byte[] bArr = new byte[iMo21526];
                long j3 = iMo21526;
                C22558.m50556(j2, bArr, 0L, j3);
                this.f43785 += j3;
                AbstractC7962 abstractC7962 = AbstractC7962.f20935;
                return new C13997(bArr);
            }
        }
        if (iMo21526 == 0) {
            return AbstractC7962.f20935;
        }
        if (iMo21526 < 0) {
            throw C4293.m8711();
        }
        throw C4293.m8710();
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
        return m34914();
    }

    @Override // p067l.AbstractC9303
    /* JADX INFO: renamed from: ᩵ */
    public final long mo21543() {
        return m34911();
    }

    @Override // p067l.AbstractC9303
    /* JADX INFO: renamed from: ֡ */
    public final int mo21518() {
        return AbstractC9303.m21517(mo21526());
    }

    @Override // p067l.AbstractC9303
    /* JADX INFO: renamed from: ۚ */
    public final long mo21527() {
        return AbstractC9303.m21514(m34910());
    }

    @Override // p067l.AbstractC9303
    /* JADX INFO: renamed from: ۘ */
    public final int mo21526() {
        int i;
        long j = this.f43785;
        if (this.f43786 != j) {
            long j2 = 1 + j;
            byte bM50547 = C22558.m50547(j);
            if (bM50547 >= 0) {
                this.f43785 = j2;
                return bM50547;
            }
            if (this.f43786 - j2 >= 9) {
                long j3 = 2 + j;
                int iM50547 = (C22558.m50547(j2) << 7) ^ bM50547;
                if (iM50547 < 0) {
                    i = iM50547 ^ C0184a.f879g;
                } else {
                    long j4 = 3 + j;
                    int iM50548 = iM50547 ^ (C22558.m50547(j3) << C0698cb.f2570l);
                    if (iM50548 >= 0) {
                        i = iM50548 ^ 16256;
                    } else {
                        j3 = 4 + j;
                        int iM50549 = iM50548 ^ (C22558.m50547(j4) << 21);
                        if (iM50549 < 0) {
                            i = (-2080896) ^ iM50549;
                        } else {
                            j4 = 5 + j;
                            byte bM50548 = C22558.m50547(j3);
                            int i2 = (iM50549 ^ (bM50548 << ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB)) ^ 266354560;
                            if (bM50548 < 0) {
                                j3 = 6 + j;
                                if (C22558.m50547(j4) < 0) {
                                    j4 = 7 + j;
                                    if (C22558.m50547(j3) < 0) {
                                        j3 = 8 + j;
                                        if (C22558.m50547(j4) < 0) {
                                            j4 = j + 9;
                                            if (C22558.m50547(j3) < 0) {
                                                long j5 = j + 10;
                                                if (C22558.m50547(j4) >= 0) {
                                                    j3 = j5;
                                                }
                                            }
                                        }
                                    }
                                }
                                i = i2;
                            }
                            i = i2;
                        }
                    }
                    j3 = j4;
                }
                this.f43785 = j3;
                return i;
            }
        }
        return (int) m34912();
    }

    /* JADX INFO: renamed from: ۗ */
    public final long m34910() {
        long j;
        long j2;
        long j3;
        long j4;
        int i;
        long j5 = this.f43785;
        if (this.f43786 != j5) {
            long j6 = 1 + j5;
            byte bM50547 = C22558.m50547(j5);
            if (bM50547 >= 0) {
                this.f43785 = j6;
                return bM50547;
            }
            if (this.f43786 - j6 >= 9) {
                long j7 = 2 + j5;
                int iM50547 = (C22558.m50547(j6) << 7) ^ bM50547;
                if (iM50547 >= 0) {
                    j = 3 + j5;
                    int iM50548 = iM50547 ^ (C22558.m50547(j7) << C0698cb.f2570l);
                    if (iM50548 >= 0) {
                        j2 = iM50548 ^ 16256;
                    } else {
                        j7 = 4 + j5;
                        int iM50549 = iM50548 ^ (C22558.m50547(j) << 21);
                        if (iM50549 < 0) {
                            i = (-2080896) ^ iM50549;
                        } else {
                            long j8 = 5 + j5;
                            long jM50547 = ((long) iM50549) ^ (((long) C22558.m50547(j7)) << 28);
                            if (jM50547 >= 0) {
                                j4 = 266354560;
                            } else {
                                long j9 = 6 + j5;
                                long jM50548 = jM50547 ^ (((long) C22558.m50547(j8)) << 35);
                                if (jM50548 < 0) {
                                    j3 = -34093383808L;
                                } else {
                                    j8 = 7 + j5;
                                    jM50547 = jM50548 ^ (((long) C22558.m50547(j9)) << 42);
                                    if (jM50547 >= 0) {
                                        j4 = 4363953127296L;
                                    } else {
                                        j9 = 8 + j5;
                                        jM50548 = jM50547 ^ (((long) C22558.m50547(j8)) << 49);
                                        if (jM50548 < 0) {
                                            j3 = -558586000294016L;
                                        } else {
                                            long j10 = j5 + 9;
                                            long jM50549 = (jM50548 ^ (((long) C22558.m50547(j9)) << 56)) ^ 71499008037633920L;
                                            if (jM50549 < 0) {
                                                long j11 = j5 + 10;
                                                if (C22558.m50547(j10) >= 0) {
                                                    j2 = jM50549;
                                                    j = j11;
                                                }
                                            } else {
                                                j2 = jM50549;
                                                j = j10;
                                            }
                                        }
                                    }
                                }
                                j2 = j3 ^ jM50548;
                                j = j9;
                            }
                            j2 = j4 ^ jM50547;
                            j = j8;
                        }
                    }
                    this.f43785 = j;
                    return j2;
                }
                i = iM50547 ^ C0184a.f879g;
                j2 = i;
                j = j7;
                this.f43785 = j;
                return j2;
            }
        }
        return m34912();
    }

    /* JADX INFO: renamed from: ᩶ */
    public final int m34914() throws C4293 {
        long j = this.f43785;
        if (this.f43786 - j < 4) {
            throw C4293.m8710();
        }
        this.f43785 = 4 + j;
        return ((C22558.m50547(j + 3) & 255) << 24) | (C22558.m50547(j) & 255) | ((C22558.m50547(1 + j) & 255) << 8) | ((C22558.m50547(2 + j) & 255) << 16);
    }

    /* JADX INFO: renamed from: ۙ */
    public final long m34911() throws C4293 {
        long j = this.f43785;
        if (this.f43786 - j < 8) {
            throw C4293.m8710();
        }
        this.f43785 = 8 + j;
        return ((((long) C22558.m50547(j + 7)) & 255) << 56) | (((long) C22558.m50547(j)) & 255) | ((((long) C22558.m50547(1 + j)) & 255) << 8) | ((((long) C22558.m50547(2 + j)) & 255) << 16) | ((((long) C22558.m50547(3 + j)) & 255) << 24) | ((((long) C22558.m50547(4 + j)) & 255) << 32) | ((((long) C22558.m50547(5 + j)) & 255) << 40) | ((((long) C22558.m50547(6 + j)) & 255) << 48);
    }

    @Override // p067l.AbstractC9303
    /* JADX INFO: renamed from: ܽ */
    public final int mo21538(int i) throws C4293 {
        if (i < 0) {
            throw C4293.m8711();
        }
        int iMo21537 = i + mo21537();
        int i2 = this.f43784;
        if (iMo21537 > i2) {
            throw C4293.m8710();
        }
        this.f43784 = iMo21537;
        m34909();
        return i2;
    }

    @Override // p067l.AbstractC9303
    /* JADX INFO: renamed from: ۧ */
    public final void mo21533(int i) {
        this.f43784 = i;
        m34909();
    }

    @Override // p067l.AbstractC9303
    /* JADX INFO: renamed from: ۧ */
    public final int mo21532() {
        int i = this.f43784;
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i - mo21537();
    }

    @Override // p067l.AbstractC9303
    /* JADX INFO: renamed from: ᩳ */
    public final boolean mo21540() {
        return this.f43785 == this.f43786;
    }

    @Override // p067l.AbstractC9303
    /* JADX INFO: renamed from: ܽ */
    public final int mo21537() {
        return (int) (this.f43785 - this.f43788);
    }

    /* JADX INFO: renamed from: ۬ */
    public final long m34912() throws C4293 {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            long j2 = this.f43785;
            if (j2 == this.f43786) {
                throw C4293.m8710();
            }
            this.f43785 = 1 + j2;
            byte bM50547 = C22558.m50547(j2);
            j |= ((long) (bM50547 & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID)) << i;
            if ((bM50547 & GCMSIVBlockCipher.MASK) == 0) {
                return j;
            }
        }
        throw C4293.m8706();
    }

    /* JADX INFO: renamed from: ۫ */
    private void m34909() {
        long j = this.f43786 + ((long) this.f43791);
        this.f43786 = j;
        int i = (int) (j - this.f43788);
        int i2 = this.f43784;
        if (i > i2) {
            int i3 = i - i2;
            this.f43791 = i3;
            this.f43786 = j - ((long) i3);
            return;
        }
        this.f43791 = 0;
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m34913(int i) throws C4293 {
        if (i >= 0) {
            long j = this.f43786;
            long j2 = this.f43785;
            if (i <= ((int) (j - j2))) {
                this.f43785 = j2 + ((long) i);
                return;
            }
        }
        if (i < 0) {
            throw C4293.m8711();
        }
        throw C4293.m8710();
    }
}
