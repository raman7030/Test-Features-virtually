package p067l;

/* JADX INFO: renamed from: l.ۧ᩺᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: C8CP */
/* JADX INFO: loaded from: classes4.dex */
public final class C13124 extends AbstractC4406 {

    /* JADX INFO: renamed from: ۧ */
    public static final AbstractC4406 f36873 = new C13124(0);

    @Override // p067l.AbstractC4406
    /* JADX INFO: renamed from: ֫ */
    public final int mo9165(byte[] bArr, int i, int i2) {
        int iRotateLeft;
        int iRotateLeft2;
        C8377.m19512(i, i2, bArr);
        int i3 = i + i2;
        if (i2 >= 16) {
            int i4 = i3 - 16;
            int iRotateLeft3 = 0;
            int i5 = 606290984;
            int iRotateLeft4 = 1640531535;
            int iRotateLeft5 = -2048144777;
            while (true) {
                iRotateLeft2 = Integer.rotateLeft((C8377.m19518(i, bArr) * (-2048144777)) + i5, 13) * (-1640531535);
                iRotateLeft5 = Integer.rotateLeft((C8377.m19518(i + 4, bArr) * (-2048144777)) + iRotateLeft5, 13) * (-1640531535);
                iRotateLeft3 = Integer.rotateLeft((C8377.m19518(i + 8, bArr) * (-2048144777)) + iRotateLeft3, 13) * (-1640531535);
                iRotateLeft4 = Integer.rotateLeft((C8377.m19518(i + 12, bArr) * (-2048144777)) + iRotateLeft4, 13) * (-1640531535);
                i += 16;
                if (i > i4) {
                    break;
                }
                i5 = iRotateLeft2;
            }
            iRotateLeft = Integer.rotateLeft(iRotateLeft4, 18) + Integer.rotateLeft(iRotateLeft3, 12) + Integer.rotateLeft(iRotateLeft5, 7) + Integer.rotateLeft(iRotateLeft2, 1);
        } else {
            iRotateLeft = 374761393;
        }
        int iRotateLeft6 = iRotateLeft + i2;
        while (i <= i3 - 4) {
            iRotateLeft6 = Integer.rotateLeft((C8377.m19518(i, bArr) * (-1028477379)) + iRotateLeft6, 17) * 668265263;
            i += 4;
        }
        while (i < i3) {
            iRotateLeft6 = Integer.rotateLeft(((bArr[i] & 255) * 374761393) + iRotateLeft6, 11) * (-1640531535);
            i++;
        }
        int i6 = ((iRotateLeft6 >>> 15) ^ iRotateLeft6) * (-2048144777);
        int i7 = (i6 ^ (i6 >>> 13)) * (-1028477379);
        return i7 ^ (i7 >>> 16);
    }
}
