package l;

/* JADX INFO: renamed from: l.۟ۡܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: GBCR */
/* JADX INFO: loaded from: classes4.dex */
public final class C7368 extends AbstractC13717 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C5978 f22635;

    @Override // l.AbstractC13717
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo2229() {
        return false;
    }

    @Override // l.AbstractC13717
    /* JADX INFO: renamed from: ᩻ */
    public final String mo8292() {
        return "annotation";
    }

    public C7368(C5978 c5978) {
        c5978.m43732();
        this.f22635 = c5978;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C7368)) {
            return false;
        }
        return this.f22635.equals(((C7368) obj).f22635);
    }

    public final int hashCode() {
        return this.f22635.hashCode();
    }

    @Override // l.AbstractC13717
    /* JADX INFO: renamed from: ۧ */
    public final int mo2228(AbstractC13717 abstractC13717) {
        return this.f22635.compareTo(((C7368) abstractC13717).f22635);
    }

    public final String toString() {
        return this.f22635.mo2463();
    }

    @Override // l.InterfaceC0601
    /* JADX INFO: renamed from: ֫ */
    public final String mo2463() {
        return this.f22635.mo2463();
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C5978 m19811() {
        return this.f22635;
    }
}
