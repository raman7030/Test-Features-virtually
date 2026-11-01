package p067l;

/* JADX INFO: renamed from: l.ܳܽۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z9C7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16283 implements InterfaceC18295 {

    /* JADX INFO: renamed from: ֫ */
    public long f47866;

    public AbstractC16283(long j) {
        this.f47866 = j;
    }

    /* JADX INFO: renamed from: ֫ */
    public long m37078() {
        return this.f47866;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.f47866 == ((AbstractC16283) obj).f47866;
    }

    public int hashCode() {
        long j = this.f47866;
        return (int) (j ^ (j >>> 32));
    }
}
