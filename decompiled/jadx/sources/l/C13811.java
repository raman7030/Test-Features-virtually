package l;

/* JADX INFO: renamed from: l.ܰ۫ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 29H7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C13811 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C22984 m33143(C10325 c10325) {
        return new C22984(c10325.m26082() | (c10325.m26082() << 32));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m33144(C22984 c22984, C10325 c10325) {
        long jM51132 = c22984.m51132();
        c10325.m26088(jM51132 & 4294967295L);
        c10325.m26088((jM51132 >> 32) & 4294967295L);
    }
}
