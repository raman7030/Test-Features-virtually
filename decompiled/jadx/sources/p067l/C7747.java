package p067l;

/* JADX INFO: renamed from: l.ۚ᩺ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 81Q9 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7747 {

    /* JADX INFO: renamed from: ֫ */
    public static final byte[] f20313 = new byte[0];

    /* JADX INFO: renamed from: ֫ */
    public static byte[] m17896(int i, int i2, byte[] bArr) {
        if (i <= bArr.length) {
            return bArr;
        }
        byte[] bArr2 = new byte[(int) Math.max(Math.min(((long) bArr.length) + ((long) (bArr.length >> 1)), 2147483639L), i)];
        System.arraycopy(bArr, 0, bArr2, 0, i2);
        return bArr2;
    }
}
