package p067l;

/* JADX INFO: renamed from: l.᩶ܺܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: EBCE */
/* JADX INFO: loaded from: classes5.dex */
public final class C21637 extends AbstractC15405 {

    /* JADX INFO: renamed from: ᩶ */
    public static final C21637 f68193 = new C21637(new C14930("TYPE"), new C14930("Ljava/lang/Class;"));

    /* JADX INFO: renamed from: ᩸ */
    public final C14930 f68194;

    /* JADX INFO: renamed from: ᩹ */
    public final C14930 f68195;

    @Override // p067l.AbstractC15405
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo4596() {
        return false;
    }

    @Override // p067l.AbstractC15405
    /* JADX INFO: renamed from: ᩻ */
    public final String mo10336() {
        return "nat";
    }

    public C21637(C14930 c14930, C14930 c14931) {
        if (c14930 == null) {
            throw new NullPointerException("name == null");
        }
        if (c14931 == null) {
            throw new NullPointerException("descriptor == null");
        }
        this.f68195 = c14930;
        this.f68194 = c14931;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C21637)) {
            return false;
        }
        C21637 c21637 = (C21637) obj;
        return this.f68195.equals(c21637.f68195) && this.f68194.equals(c21637.f68194);
    }

    public final int hashCode() {
        return (this.f68195.hashCode() * 31) ^ this.f68194.hashCode();
    }

    @Override // p067l.AbstractC15405
    /* JADX INFO: renamed from: ۧ */
    public final int mo4595(AbstractC15405 abstractC15405) {
        C21637 c21637 = (C21637) abstractC15405;
        int iCompareTo = this.f68195.compareTo(c21637.f68195);
        return iCompareTo != 0 ? iCompareTo : this.f68194.compareTo(c21637.f68194);
    }

    public final String toString() {
        return "nat{" + mo4819() + '}';
    }

    public final C14930 getName() {
        return this.f68195;
    }

    /* JADX INFO: renamed from: ܺ */
    public final C14930 m48854() {
        return this.f68194;
    }

    @Override // p067l.InterfaceC2940
    /* JADX INFO: renamed from: ֫ */
    public final String mo4819() {
        return this.f68195.mo4819() + ':' + this.f68194.mo4819();
    }

    /* JADX INFO: renamed from: ᩴ */
    public final C9566 m48855() {
        return C9566.m22274(this.f68194.getString());
    }

    /* JADX INFO: renamed from: ۚ */
    public final boolean m48853() {
        return this.f68195.getString().equals("<init>");
    }

    /* JADX INFO: renamed from: ֡ */
    public final boolean m48852() {
        return this.f68195.getString().equals("<clinit>");
    }
}
