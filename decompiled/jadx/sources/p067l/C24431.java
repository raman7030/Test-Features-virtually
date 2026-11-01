package p067l;

/* JADX INFO: renamed from: l.᩺᩶ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: P4QI */
/* JADX INFO: loaded from: classes.dex */
public final class C24431 {

    /* JADX INFO: renamed from: ֫ */
    public final byte[] f77343;

    /* JADX INFO: renamed from: ۧ */
    public final int f77344;

    public C24431(byte[] bArr, int i) {
        this.f77343 = bArr;
        this.f77344 = i;
    }

    public final String toString() {
        byte[] bArr = this.f77343;
        int i = this.f77344;
        byte b = bArr[i];
        StringBuilder sb = new StringBuilder(b * 2);
        for (int i2 = 0; i2 < b; i2++) {
            int i3 = i2 * 2;
            byte b2 = bArr[i3 + i + 1];
            if (b2 == 0) {
                sb.append('[');
            } else if (b2 == 1) {
                sb.append('.');
            } else if (b2 == 2) {
                sb.append('*');
            } else if (b2 == 3) {
                sb.append((int) bArr[i3 + i + 2]);
                sb.append(';');
            } else {
                throw new AssertionError();
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m53903(C24431 c24431, C19738 c19738) {
        if (c24431 == null) {
            c19738.m44868(0);
            return;
        }
        byte[] bArr = c24431.f77343;
        int i = c24431.f77344;
        c19738.m44872(i, (bArr[i] * 2) + 1, bArr);
    }
}
