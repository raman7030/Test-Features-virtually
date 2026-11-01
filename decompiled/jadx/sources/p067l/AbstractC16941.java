package p067l;

/* JADX INFO: renamed from: l.ܶܺܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: SBFV */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC16941 extends AbstractC8225 {

    /* JADX INFO: renamed from: ᩸ */
    public final C14260 f50118;

    /* JADX INFO: renamed from: ᩹ */
    public final C21637 f50119;

    @Override // p067l.AbstractC15405
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo4596() {
        return false;
    }

    public AbstractC16941(C14260 c14260, C21637 c21637) {
        if (c14260 == null) {
            throw new NullPointerException("definingClass == null");
        }
        if (c21637 == null) {
            throw new NullPointerException("nat == null");
        }
        this.f50118 = c14260;
        this.f50119 = c21637;
    }

    public final boolean equals(Object obj) {
        if (obj != null && getClass() == obj.getClass()) {
            AbstractC16941 abstractC16941 = (AbstractC16941) obj;
            if (this.f50118.equals(abstractC16941.f50118) && this.f50119.equals(abstractC16941.f50119)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f50118.hashCode() * 31) ^ this.f50119.hashCode();
    }

    @Override // p067l.AbstractC15405
    /* JADX INFO: renamed from: ۧ */
    public int mo4595(AbstractC15405 abstractC15405) {
        AbstractC16941 abstractC16941 = (AbstractC16941) abstractC15405;
        int iCompareTo = this.f50118.compareTo((AbstractC15405) abstractC16941.f50118);
        return iCompareTo != 0 ? iCompareTo : this.f50119.getName().compareTo(abstractC16941.f50119.getName());
    }

    public final String toString() {
        return mo10336() + '{' + mo4819() + '}';
    }

    @Override // p067l.InterfaceC2940
    /* JADX INFO: renamed from: ֫ */
    public final String mo4819() {
        return this.f50118.mo4819() + '.' + this.f50119.mo4819();
    }

    /* JADX INFO: renamed from: ܳ */
    public final C14260 m38521() {
        return this.f50118;
    }

    /* JADX INFO: renamed from: ܺ */
    public final C21637 m38522() {
        return this.f50119;
    }
}
