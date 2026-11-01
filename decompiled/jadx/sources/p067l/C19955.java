package p067l;

/* JADX INFO: renamed from: l.ᩴۘۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 97UZ */
/* JADX INFO: loaded from: classes4.dex */
public final class C19955 implements Cloneable {

    /* JADX INFO: renamed from: ۙ */
    public byte[] f60571;

    /* JADX INFO: renamed from: ᩸ */
    public byte[] f60573;

    /* JADX INFO: renamed from: ᩹ */
    public byte[] f60574;

    /* JADX INFO: renamed from: ۗ */
    public int f60570 = 255;

    /* JADX INFO: renamed from: ᩶ */
    public long f60572 = 0;

    public final Object clone() {
        C19955 c19955 = (C19955) super.clone();
        byte[] bArr = c19955.f60574;
        if (bArr != null) {
            int length = bArr.length;
            byte[] bArr2 = new byte[length];
            System.arraycopy(bArr, 0, bArr2, 0, length);
            c19955.f60574 = bArr2;
        }
        byte[] bArr3 = c19955.f60571;
        if (bArr3 != null) {
            int length2 = bArr3.length;
            byte[] bArr4 = new byte[length2];
            System.arraycopy(bArr3, 0, bArr4, 0, length2);
            c19955.f60571 = bArr4;
        }
        byte[] bArr5 = c19955.f60573;
        if (bArr5 != null) {
            int length3 = bArr5.length;
            byte[] bArr6 = new byte[length3];
            System.arraycopy(bArr5, 0, bArr6, 0, length3);
            c19955.f60573 = bArr6;
        }
        return c19955;
    }
}
