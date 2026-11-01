package p067l;

import com.alipay.sdk.p010m.p041p.C0184a;
import com.google.android.material.color.ColorResourcesTableCreator;
import com.umeng.analytics.pro.C0698cb;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;

/* JADX INFO: renamed from: l.᩺ۜۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: J9OT */
/* JADX INFO: loaded from: classes.dex */
public final class C24055 extends AbstractC9303 {

    /* JADX INFO: renamed from: ۜ */
    public int f76406;

    /* JADX INFO: renamed from: ۡ */
    public int f76407;

    /* JADX INFO: renamed from: ۢ */
    public int f76408;

    /* JADX INFO: renamed from: ܳ */
    public int f76409;

    /* JADX INFO: renamed from: ܺ */
    public int f76410;

    /* JADX INFO: renamed from: ܿ */
    public final byte[] f76411;

    /* JADX INFO: renamed from: ᩷ */
    public final InputStream f76412;

    /* JADX INFO: renamed from: ᩻ */
    public int f76413;

    public C24055(InputStream inputStream) {
        super(0);
        this.f76406 = Integer.MAX_VALUE;
        C15671.m35602(inputStream, "input");
        this.f76412 = inputStream;
        this.f76411 = new byte[4096];
        this.f76409 = 0;
        this.f76407 = 0;
        this.f76410 = 0;
    }

    @Override // p067l.AbstractC9303
    /* JADX INFO: renamed from: ܶ */
    public final int mo21535() throws C4293 {
        if (mo21540()) {
            this.f76408 = 0;
            return 0;
        }
        int iMo21526 = mo21526();
        this.f76408 = iMo21526;
        if ((iMo21526 >>> 3) != 0) {
            return iMo21526;
        }
        throw C4293.m8707();
    }

    @Override // p067l.AbstractC9303
    /* JADX INFO: renamed from: ֫ */
    public final void mo21522(int i) throws C4293 {
        if (this.f76408 != i) {
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
            int i4 = this.f76409 - this.f76407;
            byte[] bArr = this.f76411;
            if (i4 >= 10) {
                while (i3 < 10) {
                    int i5 = this.f76407;
                    this.f76407 = i5 + 1;
                    if (bArr[i5] < 0) {
                        i3++;
                    }
                }
                throw C4293.m8706();
            }
            while (i3 < 10) {
                if (this.f76407 == this.f76409) {
                    m53319(1);
                }
                int i6 = this.f76407;
                this.f76407 = i6 + 1;
                if (bArr[i6] < 0) {
                    i3++;
                }
            }
            throw C4293.m8706();
            return true;
        }
        if (i2 == 1) {
            m53326(8);
            return true;
        }
        if (i2 == 2) {
            m53326(mo21526());
            return true;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                return false;
            }
            if (i2 == 5) {
                m53326(4);
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
        return Double.longBitsToDouble(m53324());
    }

    @Override // p067l.AbstractC9303
    /* JADX INFO: renamed from: ۡ */
    public final float mo21530() {
        return Float.intBitsToFloat(m53327());
    }

    @Override // p067l.AbstractC9303
    /* JADX INFO: renamed from: ᩹ */
    public final long mo21546() {
        return m53323();
    }

    @Override // p067l.AbstractC9303
    /* JADX INFO: renamed from: ۖ */
    public final long mo21525() {
        return m53323();
    }

    @Override // p067l.AbstractC9303
    /* JADX INFO: renamed from: ܺ */
    public final int mo21536() {
        return mo21526();
    }

    @Override // p067l.AbstractC9303
    /* JADX INFO: renamed from: ۢ */
    public final long mo21531() {
        return m53324();
    }

    @Override // p067l.AbstractC9303
    /* JADX INFO: renamed from: ᩷ */
    public final int mo21544() {
        return m53327();
    }

    @Override // p067l.AbstractC9303
    /* JADX INFO: renamed from: ܿ */
    public final boolean mo21539() {
        return m53323() != 0;
    }

    @Override // p067l.AbstractC9303
    /* JADX INFO: renamed from: ֨ */
    public final String mo21519() throws C4293 {
        int iMo21526 = mo21526();
        byte[] bArr = this.f76411;
        if (iMo21526 > 0) {
            int i = this.f76409;
            int i2 = this.f76407;
            if (iMo21526 <= i - i2) {
                String str = new String(bArr, i2, iMo21526, C15671.f44807);
                this.f76407 += iMo21526;
                return str;
            }
        }
        if (iMo21526 == 0) {
            return "";
        }
        if (iMo21526 < 0) {
            throw C4293.m8711();
        }
        if (iMo21526 <= this.f76409) {
            m53319(iMo21526);
            String str2 = new String(bArr, this.f76407, iMo21526, C15671.f44807);
            this.f76407 += iMo21526;
            return str2;
        }
        return new String(m53322(iMo21526), C15671.f44807);
    }

    @Override // p067l.AbstractC9303
    /* JADX INFO: renamed from: ۠ */
    public final String mo21529() throws IOException {
        int iMo21526 = mo21526();
        int i = this.f76407;
        int i2 = this.f76409;
        int i3 = i2 - i;
        byte[] bArrM53322 = this.f76411;
        if (iMo21526 <= i3 && iMo21526 > 0) {
            this.f76407 = i + iMo21526;
        } else {
            if (iMo21526 == 0) {
                return "";
            }
            if (iMo21526 < 0) {
                throw C4293.m8711();
            }
            i = 0;
            if (iMo21526 <= i2) {
                m53319(iMo21526);
                this.f76407 = iMo21526;
            } else {
                bArrM53322 = m53322(iMo21526);
            }
        }
        return C13840.m31517(i, iMo21526, bArrM53322);
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
    public final AbstractC7962 mo21534() throws IOException {
        int iMo21526 = mo21526();
        int i = this.f76409;
        int i2 = this.f76407;
        int i3 = i - i2;
        byte[] bArr = this.f76411;
        if (iMo21526 <= i3 && iMo21526 > 0) {
            AbstractC7962 abstractC7962M18416 = AbstractC7962.m18416(i2, iMo21526, bArr);
            this.f76407 += iMo21526;
            return abstractC7962M18416;
        }
        if (iMo21526 == 0) {
            return AbstractC7962.f20935;
        }
        if (iMo21526 < 0) {
            throw C4293.m8711();
        }
        byte[] bArrM53317 = m53317(iMo21526);
        if (bArrM53317 != null) {
            return AbstractC7962.m18416(0, bArrM53317.length, bArrM53317);
        }
        int i4 = this.f76407;
        int i5 = this.f76409;
        int length = i5 - i4;
        this.f76410 += i5;
        this.f76407 = 0;
        this.f76409 = 0;
        ArrayList<byte[]> arrayListM53321 = m53321(iMo21526 - length);
        byte[] bArr2 = new byte[iMo21526];
        System.arraycopy(bArr, i4, bArr2, 0, length);
        for (byte[] bArr3 : arrayListM53321) {
            System.arraycopy(bArr3, 0, bArr2, length, bArr3.length);
            length += bArr3.length;
        }
        AbstractC7962 abstractC7962 = AbstractC7962.f20935;
        return new C13997(bArr2);
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
        return m53327();
    }

    @Override // p067l.AbstractC9303
    /* JADX INFO: renamed from: ᩵ */
    public final long mo21543() {
        return m53324();
    }

    @Override // p067l.AbstractC9303
    /* JADX INFO: renamed from: ֡ */
    public final int mo21518() {
        return AbstractC9303.m21517(mo21526());
    }

    @Override // p067l.AbstractC9303
    /* JADX INFO: renamed from: ۚ */
    public final long mo21527() {
        return AbstractC9303.m21514(m53323());
    }

    @Override // p067l.AbstractC9303
    /* JADX INFO: renamed from: ۘ */
    public final int mo21526() {
        int i;
        int i2 = this.f76407;
        int i3 = this.f76409;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.f76411;
            byte b = bArr[i2];
            if (b >= 0) {
                this.f76407 = i4;
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
                this.f76407 = i5;
                return i;
            }
        }
        return (int) m53325();
    }

    /* JADX INFO: renamed from: ۗ */
    public final long m53323() {
        long j;
        long j2;
        long j3;
        long j4;
        int i = this.f76407;
        int i2 = this.f76409;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.f76411;
            byte b = bArr[i];
            if (b >= 0) {
                this.f76407 = i3;
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
                this.f76407 = i4;
                return j;
            }
        }
        return m53325();
    }

    /* JADX INFO: renamed from: ᩶ */
    public final int m53327() throws C4293 {
        int i = this.f76407;
        if (this.f76409 - i < 4) {
            m53319(4);
            i = this.f76407;
        }
        this.f76407 = i + 4;
        byte[] bArr = this.f76411;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* JADX INFO: renamed from: ۙ */
    public final long m53324() throws C4293 {
        int i = this.f76407;
        if (this.f76409 - i < 8) {
            m53319(8);
            i = this.f76407;
        }
        this.f76407 = i + 8;
        byte[] bArr = this.f76411;
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    @Override // p067l.AbstractC9303
    /* JADX INFO: renamed from: ܽ */
    public final int mo21538(int i) throws C4293 {
        if (i < 0) {
            throw C4293.m8711();
        }
        int i2 = this.f76410 + this.f76407 + i;
        int i3 = this.f76406;
        if (i2 > i3) {
            throw C4293.m8710();
        }
        this.f76406 = i2;
        m53320();
        return i3;
    }

    /* JADX INFO: renamed from: ۫ */
    private void m53320() {
        int i = this.f76409 + this.f76413;
        this.f76409 = i;
        int i2 = this.f76410 + i;
        int i3 = this.f76406;
        if (i2 > i3) {
            int i4 = i2 - i3;
            this.f76413 = i4;
            this.f76409 = i - i4;
            return;
        }
        this.f76413 = 0;
    }

    @Override // p067l.AbstractC9303
    /* JADX INFO: renamed from: ۧ */
    public final void mo21533(int i) {
        this.f76406 = i;
        m53320();
    }

    @Override // p067l.AbstractC9303
    /* JADX INFO: renamed from: ۧ */
    public final int mo21532() {
        int i = this.f76406;
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i - (this.f76410 + this.f76407);
    }

    @Override // p067l.AbstractC9303
    /* JADX INFO: renamed from: ᩳ */
    public final boolean mo21540() {
        return this.f76407 == this.f76409 && !m53318(1);
    }

    @Override // p067l.AbstractC9303
    /* JADX INFO: renamed from: ܽ */
    public final int mo21537() {
        return this.f76410 + this.f76407;
    }

    /* JADX INFO: renamed from: ۢ */
    private void m53319(int i) throws C4293 {
        if (m53318(i)) {
            return;
        }
        if (i > (this.f25292 - this.f76410) - this.f76407) {
            throw new C4293("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        throw C4293.m8710();
    }

    /* JADX INFO: renamed from: ۡ */
    private boolean m53318(int i) throws IOException {
        int i2 = this.f76407;
        int i3 = i2 + i;
        int i4 = this.f76409;
        if (i3 <= i4) {
            throw new IllegalStateException(C19768.m44906(i, "refillBuffer() called when ", " bytes were already available in buffer"));
        }
        int i5 = this.f76410;
        int i6 = this.f25292;
        if (i <= (i6 - i5) - i2 && i5 + i2 + i <= this.f76406) {
            byte[] bArr = this.f76411;
            if (i2 > 0) {
                if (i4 > i2) {
                    System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                }
                this.f76410 += i2;
                this.f76409 -= i2;
                this.f76407 = 0;
            }
            int i7 = this.f76409;
            int iMin = Math.min(bArr.length - i7, (i6 - this.f76410) - i7);
            InputStream inputStream = this.f76412;
            int i8 = inputStream.read(bArr, i7, iMin);
            if (i8 == 0 || i8 < -1 || i8 > bArr.length) {
                throw new IllegalStateException(inputStream.getClass() + "#read(byte[]) returned invalid result: " + i8 + "\nThe InputStream implementation is buggy.");
            }
            if (i8 > 0) {
                this.f76409 += i8;
                m53320();
                if (this.f76409 >= i) {
                    return true;
                }
                return m53318(i);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۬ */
    public final long m53325() throws C4293 {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            if (this.f76407 == this.f76409) {
                m53319(1);
            }
            int i2 = this.f76407;
            this.f76407 = i2 + 1;
            byte b = this.f76411[i2];
            j |= ((long) (b & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID)) << i;
            if ((b & GCMSIVBlockCipher.MASK) == 0) {
                return j;
            }
        }
        throw C4293.m8706();
    }

    /* JADX INFO: renamed from: ᩻ */
    private byte[] m53322(int i) throws IOException {
        byte[] bArrM53317 = m53317(i);
        if (bArrM53317 != null) {
            return bArrM53317;
        }
        int i2 = this.f76407;
        int i3 = this.f76409;
        int length = i3 - i2;
        this.f76410 += i3;
        this.f76407 = 0;
        this.f76409 = 0;
        ArrayList<byte[]> arrayListM53321 = m53321(i - length);
        byte[] bArr = new byte[i];
        System.arraycopy(this.f76411, i2, bArr, 0, length);
        for (byte[] bArr2 : arrayListM53321) {
            System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
            length += bArr2.length;
        }
        return bArr;
    }

    /* JADX INFO: renamed from: ۜ */
    private byte[] m53317(int i) throws IOException {
        if (i == 0) {
            return C15671.f44805;
        }
        if (i < 0) {
            throw C4293.m8711();
        }
        int i2 = this.f76410;
        int i3 = this.f76407;
        int i4 = i2 + i3 + i;
        if (i4 - this.f25292 > 0) {
            throw new C4293("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        int i5 = this.f76406;
        if (i4 > i5) {
            m53326((i5 - i2) - i3);
            throw C4293.m8710();
        }
        int i6 = this.f76409 - i3;
        int i7 = i - i6;
        InputStream inputStream = this.f76412;
        if (i7 >= 4096 && i7 > inputStream.available()) {
            return null;
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.f76411, this.f76407, bArr, 0, i6);
        this.f76410 += this.f76409;
        this.f76407 = 0;
        this.f76409 = 0;
        while (i6 < i) {
            int i8 = inputStream.read(bArr, i6, i - i6);
            if (i8 == -1) {
                throw C4293.m8710();
            }
            this.f76410 += i8;
            i6 += i8;
        }
        return bArr;
    }

    /* JADX INFO: renamed from: ᩷ */
    private ArrayList m53321(int i) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int iMin = Math.min(i, 4096);
            byte[] bArr = new byte[iMin];
            int i2 = 0;
            while (i2 < iMin) {
                int i3 = this.f76412.read(bArr, i2, iMin - i2);
                if (i3 == -1) {
                    throw C4293.m8710();
                }
                this.f76410 += i3;
                i2 += i3;
            }
            i -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m53326(int i) throws C4293 {
        int i2 = this.f76409;
        int i3 = this.f76407;
        if (i <= i2 - i3 && i >= 0) {
            this.f76407 = i3 + i;
            return;
        }
        InputStream inputStream = this.f76412;
        if (i < 0) {
            throw C4293.m8711();
        }
        int i4 = this.f76410;
        int i5 = i4 + i3;
        int i6 = i5 + i;
        int i7 = this.f76406;
        if (i6 > i7) {
            m53326((i7 - i4) - i3);
            throw C4293.m8710();
        }
        this.f76410 = i5;
        int i8 = i2 - i3;
        this.f76409 = 0;
        this.f76407 = 0;
        while (i8 < i) {
            long j = i - i8;
            try {
                long jSkip = inputStream.skip(j);
                if (jSkip < 0 || jSkip > j) {
                    throw new IllegalStateException(inputStream.getClass() + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                }
                if (jSkip == 0) {
                    break;
                } else {
                    i8 += (int) jSkip;
                }
            } finally {
                this.f76410 += i8;
                m53320();
            }
        }
        if (i8 >= i) {
            return;
        }
        int i9 = this.f76409;
        int i10 = i9 - this.f76407;
        this.f76407 = i9;
        m53319(1);
        while (true) {
            int i11 = i - i10;
            int i12 = this.f76409;
            if (i11 > i12) {
                i10 += i12;
                this.f76407 = i12;
                m53319(1);
            } else {
                this.f76407 = i11;
                return;
            }
        }
    }
}
