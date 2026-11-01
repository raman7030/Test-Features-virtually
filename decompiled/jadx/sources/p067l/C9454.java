package p067l;

/* JADX INFO: renamed from: l.۟ۨ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 88DU */
/* JADX INFO: loaded from: classes4.dex */
public final class C9454 extends AbstractC13478 {
    @Override // p067l.AbstractC24206
    /* JADX INFO: renamed from: ֫ */
    public final int mo21957() {
        int iRotateLeft;
        byte[] bArr;
        if (this.f37847 >= 16) {
            iRotateLeft = Integer.rotateLeft(this.f37845, 18) + Integer.rotateLeft(this.f37846, 12) + Integer.rotateLeft(this.f37843, 7) + Integer.rotateLeft(this.f37844, 1);
        } else {
            iRotateLeft = 374761393;
        }
        int iRotateLeft2 = (int) (((long) iRotateLeft) + this.f37847);
        int i = 0;
        while (true) {
            int i2 = this.f37848 - 4;
            bArr = this.f37849;
            if (i > i2) {
                break;
            }
            iRotateLeft2 = Integer.rotateLeft((C8377.m19518(i, bArr) * (-1028477379)) + iRotateLeft2, 17) * 668265263;
            i += 4;
        }
        while (i < this.f37848) {
            iRotateLeft2 = Integer.rotateLeft(((bArr[i] & 255) * 374761393) + iRotateLeft2, 11) * (-1640531535);
            i++;
        }
        int i3 = ((iRotateLeft2 >>> 15) ^ iRotateLeft2) * (-2048144777);
        int i4 = (i3 ^ (i3 >>> 13)) * (-1028477379);
        return i4 ^ (i4 >>> 16);
    }

    @Override // p067l.AbstractC24206
    /* JADX INFO: renamed from: ֫ */
    public final void mo21958(int i, byte[] bArr) {
        int i2;
        C8377.m19512(0, i, bArr);
        this.f37847 += (long) i;
        int i3 = this.f37848;
        int i4 = i3 + i;
        byte[] bArr2 = this.f37849;
        if (i4 < 16) {
            System.arraycopy(bArr, 0, bArr2, i3, i);
            this.f37848 += i;
            return;
        }
        if (i3 > 0) {
            System.arraycopy(bArr, 0, bArr2, i3, 16 - i3);
            int iM19518 = (C8377.m19518(0, bArr2) * (-2048144777)) + this.f37844;
            this.f37844 = iM19518;
            this.f37844 = Integer.rotateLeft(iM19518, 13) * (-1640531535);
            int iM19519 = (C8377.m19518(4, bArr2) * (-2048144777)) + this.f37843;
            this.f37843 = iM19519;
            this.f37843 = Integer.rotateLeft(iM19519, 13) * (-1640531535);
            int iM195110 = (C8377.m19518(8, bArr2) * (-2048144777)) + this.f37846;
            this.f37846 = iM195110;
            this.f37846 = Integer.rotateLeft(iM195110, 13) * (-1640531535);
            int iM195111 = (C8377.m19518(12, bArr2) * (-2048144777)) + this.f37845;
            this.f37845 = iM195111;
            this.f37845 = Integer.rotateLeft(iM195111, 13) * (-1640531535);
            i2 = 16 - this.f37848;
            this.f37848 = 0;
        } else {
            i2 = 0;
        }
        int i5 = i - 16;
        int iRotateLeft = this.f37844;
        int iRotateLeft2 = this.f37843;
        int iRotateLeft3 = this.f37846;
        int iRotateLeft4 = this.f37845;
        while (i2 <= i5) {
            iRotateLeft = Integer.rotateLeft((C8377.m19518(i2, bArr) * (-2048144777)) + iRotateLeft, 13) * (-1640531535);
            iRotateLeft2 = Integer.rotateLeft((C8377.m19518(i2 + 4, bArr) * (-2048144777)) + iRotateLeft2, 13) * (-1640531535);
            iRotateLeft3 = Integer.rotateLeft((C8377.m19518(i2 + 8, bArr) * (-2048144777)) + iRotateLeft3, 13) * (-1640531535);
            iRotateLeft4 = Integer.rotateLeft((C8377.m19518(i2 + 12, bArr) * (-2048144777)) + iRotateLeft4, 13) * (-1640531535);
            i2 += 16;
        }
        this.f37844 = iRotateLeft;
        this.f37843 = iRotateLeft2;
        this.f37846 = iRotateLeft3;
        this.f37845 = iRotateLeft4;
        if (i2 < i) {
            int i6 = i - i2;
            System.arraycopy(bArr, i2, bArr2, 0, i6);
            this.f37848 = i6;
        }
    }
}
