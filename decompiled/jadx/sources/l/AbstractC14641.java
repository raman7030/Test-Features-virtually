package l;

/* JADX INFO: renamed from: l.ܳܽۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z9C7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC14641 implements InterfaceC16758 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public long f44759;

    public AbstractC14641(long j) {
        this.f44759 = j;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public long m34931() {
        return this.f44759;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.f44759 == ((AbstractC14641) obj).f44759;
    }

    public int hashCode() {
        long j = this.f44759;
        return (int) (j ^ (j >>> 32));
    }
}
