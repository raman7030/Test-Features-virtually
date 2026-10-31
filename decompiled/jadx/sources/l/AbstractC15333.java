package l;

/* JADX INFO: renamed from: l.ܶܺܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: SBFV */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC15333 extends AbstractC6162 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C12512 f46992;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C20274 f46993;

    @Override // l.AbstractC13717
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo2229() {
        return false;
    }

    public AbstractC15333(C12512 c12512, C20274 c20274) {
        if (c12512 == null) {
            throw new NullPointerException("definingClass == null");
        }
        if (c20274 == null) {
            throw new NullPointerException("nat == null");
        }
        this.f46992 = c12512;
        this.f46993 = c20274;
    }

    public final boolean equals(Object obj) {
        if (obj != null && getClass() == obj.getClass()) {
            AbstractC15333 abstractC15333 = (AbstractC15333) obj;
            if (this.f46992.equals(abstractC15333.f46992) && this.f46993.equals(abstractC15333.f46993)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f46992.hashCode() * 31) ^ this.f46993.hashCode();
    }

    @Override // l.AbstractC13717
    /* JADX INFO: renamed from: ۧ */
    public int mo2228(AbstractC13717 abstractC13717) {
        AbstractC15333 abstractC15333 = (AbstractC15333) abstractC13717;
        int iCompareTo = this.f46992.compareTo((AbstractC13717) abstractC15333.f46992);
        return iCompareTo != 0 ? iCompareTo : this.f46993.getName().compareTo(abstractC15333.f46993.getName());
    }

    public final String toString() {
        return mo8292() + '{' + mo2463() + '}';
    }

    @Override // l.InterfaceC0601
    /* JADX INFO: renamed from: ֫ */
    public final String mo2463() {
        return this.f46992.mo2463() + '.' + this.f46993.mo2463();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C12512 m36363() {
        return this.f46992;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C20274 m36364() {
        return this.f46993;
    }
}
