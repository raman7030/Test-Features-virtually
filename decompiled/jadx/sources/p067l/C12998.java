package p067l;

/* JADX INFO: renamed from: l.ۧᩴۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 88N4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12998 implements Comparable {

    /* JADX INFO: renamed from: ᩸ */
    public final byte[] f36572;

    /* JADX INFO: renamed from: ᩹ */
    public final long f36573;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.f36573, ((C12998) obj).f36573);
    }

    public C12998(long j, byte[] bArr) {
        this.f36573 = j;
        this.f36572 = bArr;
    }
}
