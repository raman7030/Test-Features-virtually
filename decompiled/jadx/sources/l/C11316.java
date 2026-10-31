package l;

/* JADX INFO: renamed from: l.ۧ᩺᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: C8CP */
/* JADX INFO: loaded from: classes4.dex */
public final class C11316 extends AbstractC2143 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final AbstractC2143 f33874 = new C11316(0);

    @Override // l.AbstractC2143
    /* JADX INFO: renamed from: ֫ */
    public final int mo7070(byte[] bArr, int i, int i2) {
        int iRotateLeft;
        int iRotateLeft2;
        C6322.m17572(i, i2, bArr);
        int i3 = i + i2;
        if (i2 >= 16) {
            int i4 = i3 - 16;
            int iRotateLeft3 = 0;
            int i5 = 606290984;
            int iRotateLeft4 = 1640531535;
            int iRotateLeft5 = -2048144777;
            while (true) {
                iRotateLeft2 = Integer.rotateLeft((C6322.m17578(i, bArr) * (-2048144777)) + i5, 13) * (-1640531535);
                iRotateLeft5 = Integer.rotateLeft((C6322.m17578(i + 4, bArr) * (-2048144777)) + iRotateLeft5, 13) * (-1640531535);
                iRotateLeft3 = Integer.rotateLeft((C6322.m17578(i + 8, bArr) * (-2048144777)) + iRotateLeft3, 13) * (-1640531535);
                iRotateLeft4 = Integer.rotateLeft((C6322.m17578(i + 12, bArr) * (-2048144777)) + iRotateLeft4, 13) * (-1640531535);
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
            iRotateLeft6 = Integer.rotateLeft((C6322.m17578(i, bArr) * (-1028477379)) + iRotateLeft6, 17) * 668265263;
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
