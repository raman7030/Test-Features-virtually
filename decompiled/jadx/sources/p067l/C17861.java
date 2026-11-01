package p067l;

import org.bouncycastle.asn1.ASN1RelativeOID;

/* JADX INFO: renamed from: l.ܽ֨֫, reason: contains not printable characters */
/* JADX INFO: compiled from: O8HF */
/* JADX INFO: loaded from: classes4.dex */
public final class C17861 {

    /* JADX INFO: renamed from: ֫ */
    public int f53310;

    /* JADX INFO: renamed from: ۧ */
    public int f53311;

    /* JADX INFO: renamed from: ܽ */
    public int f53312;

    /* JADX INFO: renamed from: ᩳ */
    public byte[] f53313;

    public C17861() {
        this.f53313 = C5792.f14227;
    }

    public C17861(byte[] bArr, int i) {
        this.f53313 = bArr;
        this.f53311 = i;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m40557(C19203 c19203) {
        m40565(c19203.m43729(), c19203.m43728());
        m40569(c19203.m43731() * 8);
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m40565(int i, byte[] bArr) {
        this.f53313 = bArr;
        this.f53312 = 0;
        this.f53310 = 0;
        this.f53311 = i;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m40554() {
        return ((this.f53311 - this.f53312) * 8) - this.f53310;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m40568() {
        return (this.f53312 * 8) + this.f53310;
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m40563() {
        C23877.m52960(this.f53310 == 0);
        return this.f53312;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m40569(int i) {
        int i2 = i / 8;
        this.f53312 = i2;
        this.f53310 = i - (i2 * 8);
        m40553();
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m40561() {
        int i = this.f53310 + 1;
        this.f53310 = i;
        if (i == 8) {
            this.f53310 = 0;
            this.f53312++;
        }
        m40553();
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m40566(int i) {
        int i2 = i / 8;
        int i3 = this.f53312 + i2;
        this.f53312 = i3;
        int i4 = (i - (i2 * 8)) + this.f53310;
        this.f53310 = i4;
        if (i4 > 7) {
            this.f53312 = i3 + 1;
            this.f53310 = i4 - 8;
        }
        m40553();
    }

    /* JADX INFO: renamed from: ܿ */
    public final boolean m40567() {
        boolean z = (this.f53313[this.f53312] & (128 >> this.f53310)) != 0;
        m40561();
        return z;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m40558(int i) {
        int i2;
        if (i == 0) {
            return 0;
        }
        this.f53310 += i;
        int i3 = 0;
        while (true) {
            i2 = this.f53310;
            if (i2 <= 8) {
                break;
            }
            int i4 = i2 - 8;
            this.f53310 = i4;
            byte[] bArr = this.f53313;
            int i5 = this.f53312;
            this.f53312 = i5 + 1;
            i3 |= (bArr[i5] & 255) << i4;
        }
        byte[] bArr2 = this.f53313;
        int i6 = this.f53312;
        int i7 = ((-1) >>> (32 - i)) & (i3 | ((bArr2[i6] & 255) >> (8 - i2)));
        if (i2 == 8) {
            this.f53310 = 0;
            this.f53312 = i6 + 1;
        }
        m40553();
        return i7;
    }

    /* JADX INFO: renamed from: ܽ */
    public final long m40564(int i) {
        if (i <= 32) {
            int iM40558 = m40558(i);
            String str = C5792.f14228;
            return 4294967295L & ((long) iM40558);
        }
        int iM40559 = m40558(i - 32);
        int iM405510 = m40558(32);
        String str2 = C5792.f14228;
        return (4294967295L & ((long) iM405510)) | ((((long) iM40559) & 4294967295L) << 32);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m40556(int i, byte[] bArr) {
        int i2 = i >> 3;
        for (int i3 = 0; i3 < i2; i3++) {
            byte[] bArr2 = this.f53313;
            int i4 = this.f53312;
            int i5 = i4 + 1;
            this.f53312 = i5;
            byte b = bArr2[i4];
            int i6 = this.f53310;
            byte b2 = (byte) (b << i6);
            bArr[i3] = b2;
            bArr[i3] = (byte) (((255 & bArr2[i5]) >> (8 - i6)) | b2);
        }
        int i7 = i & 7;
        if (i7 == 0) {
            return;
        }
        byte b3 = (byte) (bArr[i2] & (255 >> i7));
        bArr[i2] = b3;
        int i8 = this.f53310;
        if (i8 + i7 > 8) {
            byte[] bArr3 = this.f53313;
            int i9 = this.f53312;
            this.f53312 = i9 + 1;
            bArr[i2] = (byte) (b3 | ((bArr3[i9] & 255) << i8));
            this.f53310 = i8 - 8;
        }
        int i10 = this.f53310 + i7;
        this.f53310 = i10;
        byte[] bArr4 = this.f53313;
        int i11 = this.f53312;
        bArr[i2] = (byte) (((byte) (((255 & bArr4[i11]) >> (8 - i10)) << (8 - i7))) | bArr[i2]);
        if (i10 == 8) {
            this.f53310 = 0;
            this.f53312 = i11 + 1;
        }
        m40553();
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m40559() {
        if (this.f53310 == 0) {
            return;
        }
        this.f53310 = 0;
        this.f53312++;
        m40553();
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m40560(int i, byte[] bArr) {
        C23877.m52960(this.f53310 == 0);
        System.arraycopy(this.f53313, this.f53312, bArr, 0, i);
        this.f53312 += i;
        m40553();
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m40562(int i) {
        C23877.m52960(this.f53310 == 0);
        this.f53312 += i;
        m40553();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m40555(int i) {
        int i2 = i & ASN1RelativeOID.MAX_IDENTIFIER_LENGTH;
        int iMin = Math.min(8 - this.f53310, 14);
        int i3 = this.f53310;
        int i4 = (8 - i3) - iMin;
        byte[] bArr = this.f53313;
        int i5 = this.f53312;
        byte b = (byte) (((65280 >> i3) | ((1 << i4) - 1)) & bArr[i5]);
        bArr[i5] = b;
        int i6 = 14 - iMin;
        bArr[i5] = (byte) (b | ((i2 >>> i6) << i4));
        int i7 = i5 + 1;
        while (i6 > 8) {
            this.f53313[i7] = (byte) (i2 >>> (i6 - 8));
            i6 -= 8;
            i7++;
        }
        int i8 = 8 - i6;
        byte[] bArr2 = this.f53313;
        byte b2 = (byte) (bArr2[i7] & ((1 << i8) - 1));
        bArr2[i7] = b2;
        bArr2[i7] = (byte) (((i2 & ((1 << i6) - 1)) << i8) | b2);
        m40566(14);
        m40553();
    }

    /* JADX INFO: renamed from: ᩻ */
    private void m40553() {
        int i;
        int i2 = this.f53312;
        C23877.m52960(i2 >= 0 && (i2 < (i = this.f53311) || (i2 == i && this.f53310 == 0)));
    }
}
