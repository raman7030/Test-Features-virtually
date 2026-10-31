package l;

/* JADX INFO: renamed from: l.ۨۢ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: L7IT */
/* JADX INFO: loaded from: classes4.dex */
public final class C11611 implements InterfaceC5966 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public long f34623;

    @Override // l.InterfaceC5966
    public final void add(long j) {
        this.f34623 += j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InterfaceC5966) && this.f34623 == ((InterfaceC5966) obj).get();
    }

    @Override // l.InterfaceC5966
    public final long get() {
        return this.f34623;
    }

    public final int hashCode() {
        return C11003.hash(Long.valueOf(this.f34623));
    }

    @Override // l.InterfaceC5966
    /* JADX INFO: renamed from: ֫ */
    public final void mo16706() {
        this.f34623++;
    }

    public final String toString() {
        return Long.toString(this.f34623);
    }
}
