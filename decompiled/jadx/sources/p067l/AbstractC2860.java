package p067l;

/* JADX INFO: renamed from: l.֡ܺܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3B8Q */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2860 extends AbstractC3531 {

    /* JADX INFO: renamed from: ᩸ */
    public final int f4942;

    @Override // p067l.AbstractC15405
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo4596() {
        return false;
    }

    @Override // p067l.AbstractC3531
    /* JADX INFO: renamed from: ܺ */
    public final boolean mo4597() {
        return true;
    }

    public AbstractC2860(int i) {
        this.f4942 = i;
    }

    public final boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f4942 == ((AbstractC2860) obj).f4942;
    }

    public final int hashCode() {
        return this.f4942;
    }

    @Override // p067l.AbstractC15405
    /* JADX INFO: renamed from: ۧ */
    public final int mo4595(AbstractC15405 abstractC15405) {
        int i = ((AbstractC2860) abstractC15405).f4942;
        int i2 = this.f4942;
        if (i2 < i) {
            return -1;
        }
        return i2 > i ? 1 : 0;
    }

    @Override // p067l.AbstractC3531
    /* JADX INFO: renamed from: ᩴ */
    public final int mo4598() {
        return this.f4942;
    }

    @Override // p067l.AbstractC3531
    /* JADX INFO: renamed from: ֡ */
    public final long mo4594() {
        return this.f4942;
    }
}
