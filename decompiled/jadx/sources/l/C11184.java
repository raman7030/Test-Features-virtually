package l;

/* JADX INFO: renamed from: l.ۧᩴۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 88N4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11184 implements Comparable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final byte[] f33572;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final long f33573;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.f33573, ((C11184) obj).f33573);
    }

    public C11184(long j, byte[] bArr) {
        this.f33573 = j;
        this.f33572 = bArr;
    }
}
