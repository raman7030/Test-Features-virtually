package l;

/* JADX INFO: renamed from: l.ۚܺܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: JBIA */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5457 extends AbstractC1223 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final long f16984;

    @Override // l.AbstractC13717
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo2229() {
        return true;
    }

    public AbstractC5457(long j) {
        this.f16984 = j;
    }

    public final boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f16984 == ((AbstractC5457) obj).f16984;
    }

    public final int hashCode() {
        long j = this.f16984;
        return ((int) j) ^ ((int) (j >> 32));
    }

    @Override // l.AbstractC13717
    /* JADX INFO: renamed from: ۧ */
    public final int mo2228(AbstractC13717 abstractC13717) {
        long j = ((AbstractC5457) abstractC13717).f16984;
        long j2 = this.f16984;
        if (j2 < j) {
            return -1;
        }
        return j2 > j ? 1 : 0;
    }

    @Override // l.AbstractC1223
    /* JADX INFO: renamed from: ܺ */
    public final boolean mo2230() {
        long j = this.f16984;
        return ((long) ((int) j)) == j;
    }

    @Override // l.AbstractC1223
    /* JADX INFO: renamed from: ᩴ */
    public final int mo2231() {
        return (int) this.f16984;
    }

    @Override // l.AbstractC1223
    /* JADX INFO: renamed from: ֡ */
    public final long mo2227() {
        return this.f16984;
    }
}
