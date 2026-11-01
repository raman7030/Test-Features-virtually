package p067l;

/* JADX INFO: renamed from: l.ۛ᩺ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 365A */
/* JADX INFO: loaded from: classes2.dex */
public final class C8424 {
    /* JADX INFO: renamed from: ֫ */
    public static int m19607(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* JADX INFO: renamed from: ֫ */
    public static long[] m19608(long[]... jArr) {
        long length = 0;
        for (long[] jArr2 : jArr) {
            length += (long) jArr2.length;
        }
        int i = (int) length;
        C6194.m14025(length, "the total number of elements (%s) in the arrays must fit in an int", length == ((long) i));
        long[] jArr3 = new long[i];
        int length2 = 0;
        for (long[] jArr4 : jArr) {
            System.arraycopy(jArr4, 0, jArr3, length2, jArr4.length);
            length2 += jArr4.length;
        }
        return jArr3;
    }
}
