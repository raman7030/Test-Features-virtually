package l;

/* JADX INFO: renamed from: l.ۗܰۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 44G0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3273 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final int[] f10307 = new int[256];

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int[] f10308 = new int[3];

    static {
        for (int i = 0; i < 256; i++) {
            int i2 = i;
            for (int i3 = 0; i3 < 8; i3++) {
                int i4 = i2 & 1;
                i2 >>>= 1;
                if (i4 == 1) {
                    i2 ^= -306674912;
                }
            }
            f10307[i] = i2;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m10079(byte[] bArr) {
        int[] iArr = this.f10308;
        iArr[0] = 305419896;
        iArr[1] = 591751049;
        iArr[2] = 878082192;
        for (byte b : bArr) {
            m10078(b);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m10078(byte b) {
        int[] iArr = this.f10308;
        int i = iArr[0];
        int i2 = i >>> 8;
        int i3 = (b ^ i) & 255;
        int[] iArr2 = f10307;
        int i4 = iArr2[i3] ^ i2;
        iArr[0] = i4;
        int i5 = iArr[1] + (i4 & 255);
        iArr[1] = i5;
        int i6 = (i5 * 134775813) + 1;
        iArr[1] = i6;
        int i7 = iArr[2];
        iArr[2] = iArr2[(i7 ^ ((byte) (i6 >> 24))) & 255] ^ (i7 >>> 8);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte m10077() {
        int i = this.f10308[2] | 2;
        return (byte) ((i * (i ^ 1)) >>> 8);
    }
}
