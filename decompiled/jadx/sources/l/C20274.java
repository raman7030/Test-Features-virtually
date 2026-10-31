package l;

/* JADX INFO: renamed from: l.᩶ܺܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: EBCE */
/* JADX INFO: loaded from: classes5.dex */
public final class C20274 extends AbstractC13717 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final C20274 f65518 = new C20274(new C13217("TYPE"), new C13217("Ljava/lang/Class;"));

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C13217 f65519;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C13217 f65520;

    @Override // l.AbstractC13717
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo2229() {
        return false;
    }

    @Override // l.AbstractC13717
    /* JADX INFO: renamed from: ᩻ */
    public final String mo8292() {
        return "nat";
    }

    public C20274(C13217 c13217, C13217 c13218) {
        if (c13217 == null) {
            throw new NullPointerException("name == null");
        }
        if (c13218 == null) {
            throw new NullPointerException("descriptor == null");
        }
        this.f65520 = c13217;
        this.f65519 = c13218;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C20274)) {
            return false;
        }
        C20274 c20274 = (C20274) obj;
        return this.f65520.equals(c20274.f65520) && this.f65519.equals(c20274.f65519);
    }

    public final int hashCode() {
        return (this.f65520.hashCode() * 31) ^ this.f65519.hashCode();
    }

    @Override // l.AbstractC13717
    /* JADX INFO: renamed from: ۧ */
    public final int mo2228(AbstractC13717 abstractC13717) {
        C20274 c20274 = (C20274) abstractC13717;
        int iCompareTo = this.f65520.compareTo(c20274.f65520);
        return iCompareTo != 0 ? iCompareTo : this.f65519.compareTo(c20274.f65519);
    }

    public final String toString() {
        return "nat{" + mo2463() + '}';
    }

    public final C13217 getName() {
        return this.f65520;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C13217 m46532() {
        return this.f65519;
    }

    @Override // l.InterfaceC0601
    /* JADX INFO: renamed from: ֫ */
    public final String mo2463() {
        return this.f65520.mo2463() + ':' + this.f65519.mo2463();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C7573 m46533() {
        return C7573.m20297(this.f65519.getString());
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m46531() {
        return this.f65520.getString().equals("<init>");
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final boolean m46530() {
        return this.f65520.getString().equals("<clinit>");
    }
}
