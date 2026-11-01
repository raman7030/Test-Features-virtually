package p067l;

import org.bouncycastle.util.encoders.UTF8;

/* JADX INFO: renamed from: l.ۚ֡᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: E9ZE */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7128 {

    /* JADX INFO: renamed from: ۧ */
    public static final byte[] f18612 = {78, 84, 76, 77, 83, 83, UTF8.S_P4A, 0};

    /* JADX INFO: renamed from: ܽ */
    public static final byte[] f18613 = {6, 1, 0, 0, 0, 0, 0, 15};

    /* JADX INFO: renamed from: ֫ */
    public int f18614;

    /* JADX INFO: renamed from: ֫ */
    public final int m16400() {
        return this.f18614;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m16401(int i) {
        return (i & this.f18614) != 0;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m16402() {
        this.f18614 = 8388608 | this.f18614;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m16403(int i) {
        this.f18614 = i;
    }

    /* JADX INFO: renamed from: ۧ */
    public static int m16399(int i, byte[] bArr) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* JADX INFO: renamed from: ֫ */
    public static byte[] m16398(int i, byte[] bArr) {
        int i2 = (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, m16399(i + 4, bArr), bArr2, 0, i2);
        return bArr2;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m16397(int i, int i2, byte[] bArr) {
        bArr[i] = (byte) (i2 & 255);
        bArr[i + 1] = (byte) ((i2 >> 8) & 255);
        bArr[i + 2] = (byte) ((i2 >> 16) & 255);
        bArr[i + 3] = (byte) ((i2 >> 24) & 255);
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m16396(int i, byte[] bArr, byte[] bArr2) {
        int length = bArr2 != null ? bArr2.length : 0;
        if (length != 0) {
            byte b = (byte) (length & 255);
            bArr[i] = b;
            byte b2 = (byte) ((length >> 8) & 255);
            bArr[i + 1] = b2;
            bArr[i + 2] = b;
            bArr[i + 3] = b2;
        }
        return i + 4;
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m16395(int i, int i2, byte[] bArr, byte[] bArr2) {
        m16397(i2, i, bArr);
        if (bArr2 == null || bArr2.length <= 0) {
            return 0;
        }
        System.arraycopy(bArr2, 0, bArr, i, bArr2.length);
        return bArr2.length;
    }
}
