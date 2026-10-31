package l;

/* JADX INFO: renamed from: l.۟ۨ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 88DU */
/* JADX INFO: loaded from: classes4.dex */
public final class C7455 extends AbstractC11689 {
    @Override // l.AbstractC22977
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int mo19982() {
        int iRotateLeft;
        byte[] bArr;
        if (this.f34848 >= 16) {
            iRotateLeft = Integer.rotateLeft(this.f34846, 18) + Integer.rotateLeft(this.f34847, 12) + Integer.rotateLeft(this.f34844, 7) + Integer.rotateLeft(this.f34845, 1);
        } else {
            iRotateLeft = 374761393;
        }
        int iRotateLeft2 = (int) (((long) iRotateLeft) + this.f34848);
        int i = 0;
        while (true) {
            int i2 = this.f34849 - 4;
            bArr = this.f34850;
            if (i > i2) {
                break;
            }
            iRotateLeft2 = Integer.rotateLeft((C6322.m17578(i, bArr) * (-1028477379)) + iRotateLeft2, 17) * 668265263;
            i += 4;
        }
        while (i < this.f34849) {
            iRotateLeft2 = Integer.rotateLeft(((bArr[i] & 255) * 374761393) + iRotateLeft2, 11) * (-1640531535);
            i++;
        }
        int i3 = ((iRotateLeft2 >>> 15) ^ iRotateLeft2) * (-2048144777);
        int i4 = (i3 ^ (i3 >>> 13)) * (-1028477379);
        return i4 ^ (i4 >>> 16);
    }

    @Override // l.AbstractC22977
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo19983(int i, byte[] bArr) {
        int i2;
        C6322.m17572(0, i, bArr);
        this.f34848 += (long) i;
        int i3 = this.f34849;
        int i4 = i3 + i;
        byte[] bArr2 = this.f34850;
        if (i4 < 16) {
            System.arraycopy(bArr, 0, bArr2, i3, i);
            this.f34849 += i;
            return;
        }
        if (i3 > 0) {
            System.arraycopy(bArr, 0, bArr2, i3, 16 - i3);
            int iM17578 = (C6322.m17578(0, bArr2) * (-2048144777)) + this.f34845;
            this.f34845 = iM17578;
            this.f34845 = Integer.rotateLeft(iM17578, 13) * (-1640531535);
            int iM17579 = (C6322.m17578(4, bArr2) * (-2048144777)) + this.f34844;
            this.f34844 = iM17579;
            this.f34844 = Integer.rotateLeft(iM17579, 13) * (-1640531535);
            int iM175710 = (C6322.m17578(8, bArr2) * (-2048144777)) + this.f34847;
            this.f34847 = iM175710;
            this.f34847 = Integer.rotateLeft(iM175710, 13) * (-1640531535);
            int iM175711 = (C6322.m17578(12, bArr2) * (-2048144777)) + this.f34846;
            this.f34846 = iM175711;
            this.f34846 = Integer.rotateLeft(iM175711, 13) * (-1640531535);
            i2 = 16 - this.f34849;
            this.f34849 = 0;
        } else {
            i2 = 0;
        }
        int i5 = i - 16;
        int iRotateLeft = this.f34845;
        int iRotateLeft2 = this.f34844;
        int iRotateLeft3 = this.f34847;
        int iRotateLeft4 = this.f34846;
        while (i2 <= i5) {
            iRotateLeft = Integer.rotateLeft((C6322.m17578(i2, bArr) * (-2048144777)) + iRotateLeft, 13) * (-1640531535);
            iRotateLeft2 = Integer.rotateLeft((C6322.m17578(i2 + 4, bArr) * (-2048144777)) + iRotateLeft2, 13) * (-1640531535);
            iRotateLeft3 = Integer.rotateLeft((C6322.m17578(i2 + 8, bArr) * (-2048144777)) + iRotateLeft3, 13) * (-1640531535);
            iRotateLeft4 = Integer.rotateLeft((C6322.m17578(i2 + 12, bArr) * (-2048144777)) + iRotateLeft4, 13) * (-1640531535);
            i2 += 16;
        }
        this.f34845 = iRotateLeft;
        this.f34844 = iRotateLeft2;
        this.f34847 = iRotateLeft3;
        this.f34846 = iRotateLeft4;
        if (i2 < i) {
            int i6 = i - i2;
            System.arraycopy(bArr, i2, bArr2, 0, i6);
            this.f34849 = i6;
        }
    }
}
