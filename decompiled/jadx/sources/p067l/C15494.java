package p067l;

/* JADX INFO: renamed from: l.ܰ۫ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 29H7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C15494 {
    /* JADX INFO: renamed from: ֫ */
    public static C24212 m35260(C12181 c12181) {
        return new C24212(c12181.m28107() | (c12181.m28107() << 32));
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m35261(C24212 c24212, C12181 c12181) {
        long jM53525 = c24212.m53525();
        c12181.m28113(jM53525 & 4294967295L);
        c12181.m28113((jM53525 >> 32) & 4294967295L);
    }
}
