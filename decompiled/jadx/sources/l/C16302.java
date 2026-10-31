package l;

import org.bouncycastle.asn1.ASN1RelativeOID;

/* JADX INFO: renamed from: l.ܽ֨֫, reason: contains not printable characters */
/* JADX INFO: compiled from: O8HF */
/* JADX INFO: loaded from: classes4.dex */
public final class C16302 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f50143;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f50144;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f50145;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public byte[] f50146;

    public C16302() {
        this.f50146 = C3603.f11423;
    }

    public C16302(byte[] bArr, int i) {
        this.f50146 = bArr;
        this.f50144 = i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m38342(C17714 c17714) {
        m38350(c17714.m41483(), c17714.m41482());
        m38354(c17714.m41485() * 8);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m38350(int i, byte[] bArr) {
        this.f50146 = bArr;
        this.f50145 = 0;
        this.f50143 = 0;
        this.f50144 = i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m38339() {
        return ((this.f50144 - this.f50145) * 8) - this.f50143;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m38353() {
        return (this.f50145 * 8) + this.f50143;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m38348() {
        C22632.m50634(this.f50143 == 0);
        return this.f50145;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m38354(int i) {
        int i2 = i / 8;
        this.f50145 = i2;
        this.f50143 = i - (i2 * 8);
        m38338();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m38346() {
        int i = this.f50143 + 1;
        this.f50143 = i;
        if (i == 8) {
            this.f50143 = 0;
            this.f50145++;
        }
        m38338();
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m38351(int i) {
        int i2 = i / 8;
        int i3 = this.f50145 + i2;
        this.f50145 = i3;
        int i4 = (i - (i2 * 8)) + this.f50143;
        this.f50143 = i4;
        if (i4 > 7) {
            this.f50145 = i3 + 1;
            this.f50143 = i4 - 8;
        }
        m38338();
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean m38352() {
        boolean z = (this.f50146[this.f50145] & (128 >> this.f50143)) != 0;
        m38346();
        return z;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m38343(int i) {
        int i2;
        if (i == 0) {
            return 0;
        }
        this.f50143 += i;
        int i3 = 0;
        while (true) {
            i2 = this.f50143;
            if (i2 <= 8) {
                break;
            }
            int i4 = i2 - 8;
            this.f50143 = i4;
            byte[] bArr = this.f50146;
            int i5 = this.f50145;
            this.f50145 = i5 + 1;
            i3 |= (bArr[i5] & 255) << i4;
        }
        byte[] bArr2 = this.f50146;
        int i6 = this.f50145;
        int i7 = ((-1) >>> (32 - i)) & (i3 | ((bArr2[i6] & 255) >> (8 - i2)));
        if (i2 == 8) {
            this.f50143 = 0;
            this.f50145 = i6 + 1;
        }
        m38338();
        return i7;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long m38349(int i) {
        if (i <= 32) {
            int iM38343 = m38343(i);
            String str = C3603.f11424;
            return 4294967295L & ((long) iM38343);
        }
        int iM38344 = m38343(i - 32);
        int iM38345 = m38343(32);
        String str2 = C3603.f11424;
        return (4294967295L & ((long) iM38345)) | ((((long) iM38344) & 4294967295L) << 32);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m38341(int i, byte[] bArr) {
        int i2 = i >> 3;
        for (int i3 = 0; i3 < i2; i3++) {
            byte[] bArr2 = this.f50146;
            int i4 = this.f50145;
            int i5 = i4 + 1;
            this.f50145 = i5;
            byte b = bArr2[i4];
            int i6 = this.f50143;
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
        int i8 = this.f50143;
        if (i8 + i7 > 8) {
            byte[] bArr3 = this.f50146;
            int i9 = this.f50145;
            this.f50145 = i9 + 1;
            bArr[i2] = (byte) (b3 | ((bArr3[i9] & 255) << i8));
            this.f50143 = i8 - 8;
        }
        int i10 = this.f50143 + i7;
        this.f50143 = i10;
        byte[] bArr4 = this.f50146;
        int i11 = this.f50145;
        bArr[i2] = (byte) (((byte) (((255 & bArr4[i11]) >> (8 - i10)) << (8 - i7))) | bArr[i2]);
        if (i10 == 8) {
            this.f50143 = 0;
            this.f50145 = i11 + 1;
        }
        m38338();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m38344() {
        if (this.f50143 == 0) {
            return;
        }
        this.f50143 = 0;
        this.f50145++;
        m38338();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m38345(int i, byte[] bArr) {
        C22632.m50634(this.f50143 == 0);
        System.arraycopy(this.f50146, this.f50145, bArr, 0, i);
        this.f50145 += i;
        m38338();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m38347(int i) {
        C22632.m50634(this.f50143 == 0);
        this.f50145 += i;
        m38338();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m38340(int i) {
        int i2 = i & ASN1RelativeOID.MAX_IDENTIFIER_LENGTH;
        int iMin = Math.min(8 - this.f50143, 14);
        int i3 = this.f50143;
        int i4 = (8 - i3) - iMin;
        byte[] bArr = this.f50146;
        int i5 = this.f50145;
        byte b = (byte) (((65280 >> i3) | ((1 << i4) - 1)) & bArr[i5]);
        bArr[i5] = b;
        int i6 = 14 - iMin;
        bArr[i5] = (byte) (b | ((i2 >>> i6) << i4));
        int i7 = i5 + 1;
        while (i6 > 8) {
            this.f50146[i7] = (byte) (i2 >>> (i6 - 8));
            i6 -= 8;
            i7++;
        }
        int i8 = 8 - i6;
        byte[] bArr2 = this.f50146;
        byte b2 = (byte) (bArr2[i7] & ((1 << i8) - 1));
        bArr2[i7] = b2;
        bArr2[i7] = (byte) (((i2 & ((1 << i6) - 1)) << i8) | b2);
        m38351(14);
        m38338();
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private void m38338() {
        int i;
        int i2 = this.f50145;
        C22632.m50634(i2 >= 0 && (i2 < (i = this.f50144) || (i2 == i && this.f50143 == 0)));
    }
}
