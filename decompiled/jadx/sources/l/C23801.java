package l;

/* JADX INFO: renamed from: l.᩻ܺܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: ZBCT */
/* JADX INFO: loaded from: classes.dex */
public final class C23801 extends AbstractC13717 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f77017;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C18863 f77018;

    @Override // l.AbstractC13717
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo2229() {
        return false;
    }

    @Override // l.AbstractC13717
    /* JADX INFO: renamed from: ᩻ */
    public final String mo8292() {
        return "CallSiteRef";
    }

    public C23801(C18863 c18863, int i) {
        this.f77018 = c18863;
        this.f77017 = i;
    }

    @Override // l.AbstractC13717
    /* JADX INFO: renamed from: ۧ */
    public final int mo2228(AbstractC13717 abstractC13717) {
        C23801 c23801 = (C23801) abstractC13717;
        int iCompareTo = this.f77018.compareTo(c23801.f77018);
        return iCompareTo != 0 ? iCompareTo : Integer.compare(this.f77017, c23801.f77017);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C23095 m52480() {
        return this.f77018.m43564();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C7573 m52479() {
        return this.f77018.m43570();
    }

    public final String toString() {
        return this.f77018.m43563().toString();
    }

    @Override // l.InterfaceC0601
    /* JADX INFO: renamed from: ֫ */
    public final String mo2463() {
        return this.f77018.m43563().mo2463();
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C14628 m52478() {
        return this.f77018.m43563();
    }
}
