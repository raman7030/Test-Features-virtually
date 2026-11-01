package p067l;

/* JADX INFO: renamed from: l.ۨۢ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: L7IT */
/* JADX INFO: loaded from: classes4.dex */
public final class C13403 implements InterfaceC8038 {

    /* JADX INFO: renamed from: ֫ */
    public long f37620;

    @Override // p067l.InterfaceC8038
    public final void add(long j) {
        this.f37620 += j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InterfaceC8038) && this.f37620 == ((InterfaceC8038) obj).get();
    }

    @Override // p067l.InterfaceC8038
    public final long get() {
        return this.f37620;
    }

    public final int hashCode() {
        return C12826.hash(Long.valueOf(this.f37620));
    }

    @Override // p067l.InterfaceC8038
    /* JADX INFO: renamed from: ֫ */
    public final void mo18632() {
        this.f37620++;
    }

    public final String toString() {
        return Long.toString(this.f37620);
    }
}
