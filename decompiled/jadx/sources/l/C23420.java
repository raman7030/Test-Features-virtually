package l;

/* JADX INFO: renamed from: l.᩻ۗ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: F416 */
/* JADX INFO: loaded from: classes.dex */
public class C23420 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC3953 f75215;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final EnumC22756 f75216;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C15406 f75217;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9310 f75218;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 f75219;

    /* JADX INFO: renamed from: ֫ */
    public boolean mo6717(AbstractC5144 abstractC5144) {
        return false;
    }

    public C23420(C9310 c9310, C15406 c15406, AbstractC4308 abstractC4308) {
        this(c9310, c15406, abstractC4308, c9310.f28214.f46781, EnumC22756.f73483);
    }

    public C23420(C9310 c9310, C15406 c15406, AbstractC4308 abstractC4308, InterfaceC3953 interfaceC3953) {
        this(c9310, c15406, abstractC4308, interfaceC3953, EnumC22756.f73483);
    }

    public C23420(C9310 c9310, C15406 c15406, AbstractC4308 abstractC4308, InterfaceC3953 interfaceC3953, EnumC22756 enumC22756) {
        this.f75218 = c9310;
        this.f75217 = c15406;
        this.f75219 = abstractC4308;
        this.f75215 = interfaceC3953;
        this.f75216 = enumC22756;
    }

    /* JADX INFO: renamed from: ֫ */
    public AbstractC4308 mo13581(InterfaceC3109 interfaceC3109, AbstractC4308 abstractC4308) {
        return this.f75218.f28214.m36106(interfaceC3109, abstractC4308, this.f75219, this.f75215);
    }

    /* JADX INFO: renamed from: ֫ */
    public C23420 mo38523(AbstractC4308 abstractC4308) {
        return new C23420(this.f75218, this.f75217, abstractC4308, this.f75215, this.f75216);
    }

    /* JADX INFO: renamed from: ֫ */
    public C23420 mo38522(InterfaceC3953 interfaceC3953) {
        return new C23420(this.f75218, this.f75217, this.f75219, interfaceC3953, this.f75216);
    }

    /* JADX INFO: renamed from: ֫ */
    public C23420 mo38524(AbstractC4308 abstractC4308, InterfaceC3953 interfaceC3953, EnumC22756 enumC22756) {
        return new C23420(this.f75218, this.f75217, abstractC4308, interfaceC3953, enumC22756);
    }

    /* JADX INFO: renamed from: ֫ */
    public C23420 mo38525(EnumC22756 enumC22756) {
        return new C23420(this.f75218, this.f75217, this.f75219, this.f75215, enumC22756);
    }

    public final String toString() {
        AbstractC4308 abstractC4308 = this.f75219;
        return abstractC4308 != null ? abstractC4308.toString() : "";
    }
}
