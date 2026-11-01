package p067l;

/* JADX INFO: renamed from: l.ۚܺܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: JBIA */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7555 extends AbstractC3531 {

    /* JADX INFO: renamed from: ᩸ */
    public final long f19825;

    @Override // p067l.AbstractC15405
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo4596() {
        return true;
    }

    public AbstractC7555(long j) {
        this.f19825 = j;
    }

    public final boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f19825 == ((AbstractC7555) obj).f19825;
    }

    public final int hashCode() {
        long j = this.f19825;
        return ((int) j) ^ ((int) (j >> 32));
    }

    @Override // p067l.AbstractC15405
    /* JADX INFO: renamed from: ۧ */
    public final int mo4595(AbstractC15405 abstractC15405) {
        long j = ((AbstractC7555) abstractC15405).f19825;
        long j2 = this.f19825;
        if (j2 < j) {
            return -1;
        }
        return j2 > j ? 1 : 0;
    }

    @Override // p067l.AbstractC3531
    /* JADX INFO: renamed from: ܺ */
    public final boolean mo4597() {
        long j = this.f19825;
        return ((long) ((int) j)) == j;
    }

    @Override // p067l.AbstractC3531
    /* JADX INFO: renamed from: ᩴ */
    public final int mo4598() {
        return (int) this.f19825;
    }

    @Override // p067l.AbstractC3531
    /* JADX INFO: renamed from: ֡ */
    public final long mo4594() {
        return this.f19825;
    }
}
