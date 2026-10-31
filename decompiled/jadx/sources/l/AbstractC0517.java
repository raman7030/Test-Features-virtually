package l;

/* JADX INFO: renamed from: l.֡ܺܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3B8Q */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0517 extends AbstractC1223 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f2169;

    @Override // l.AbstractC13717
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean mo2229() {
        return false;
    }

    @Override // l.AbstractC1223
    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean mo2230() {
        return true;
    }

    public AbstractC0517(int i) {
        this.f2169 = i;
    }

    public final boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f2169 == ((AbstractC0517) obj).f2169;
    }

    public final int hashCode() {
        return this.f2169;
    }

    @Override // l.AbstractC13717
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int mo2228(AbstractC13717 abstractC13717) {
        int i = ((AbstractC0517) abstractC13717).f2169;
        int i2 = this.f2169;
        if (i2 < i) {
            return -1;
        }
        return i2 > i ? 1 : 0;
    }

    @Override // l.AbstractC1223
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int mo2231() {
        return this.f2169;
    }

    @Override // l.AbstractC1223
    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final long mo2227() {
        return this.f2169;
    }
}
