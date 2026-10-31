package l;

/* JADX INFO: renamed from: l.ᩴۘۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 97UZ */
/* JADX INFO: loaded from: classes4.dex */
public final class C18505 implements Cloneable {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public byte[] f57349;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public byte[] f57351;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public byte[] f57352;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f57348 = 255;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public long f57350 = 0;

    public final Object clone() {
        C18505 c18505 = (C18505) super.clone();
        byte[] bArr = c18505.f57352;
        if (bArr != null) {
            int length = bArr.length;
            byte[] bArr2 = new byte[length];
            System.arraycopy(bArr, 0, bArr2, 0, length);
            c18505.f57352 = bArr2;
        }
        byte[] bArr3 = c18505.f57349;
        if (bArr3 != null) {
            int length2 = bArr3.length;
            byte[] bArr4 = new byte[length2];
            System.arraycopy(bArr3, 0, bArr4, 0, length2);
            c18505.f57349 = bArr4;
        }
        byte[] bArr5 = c18505.f57351;
        if (bArr5 != null) {
            int length3 = bArr5.length;
            byte[] bArr6 = new byte[length3];
            System.arraycopy(bArr5, 0, bArr6, 0, length3);
            c18505.f57351 = bArr6;
        }
        return c18505;
    }
}
