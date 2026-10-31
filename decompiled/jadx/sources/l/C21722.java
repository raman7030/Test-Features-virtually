package l;

/* JADX INFO: renamed from: l.᩸ܿ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: X44P */
/* JADX INFO: loaded from: classes.dex */
public final class C21722 extends C15817 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20311 f69684;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC20758 f69685;

    public C21722(C20311 c20311, InterfaceC20758 interfaceC20758) {
        this.f69684 = c20311;
        this.f69685 = interfaceC20758;
    }

    @Override // l.C15817, l.InterfaceC17935
    public final EnumC16523 preVisitDirectory(Object obj, InterfaceC15111 interfaceC15111) {
        InterfaceC20758 interfaceC20758 = (InterfaceC20758) obj;
        InterfaceC20758 fileName = interfaceC20758.getFileName();
        C20311 c20311 = this.f69684;
        if (C20311.m46553(c20311, fileName)) {
            c20311.f65581.put(new C10349(this.f69685.relativize(interfaceC20758).toString()), interfaceC20758);
            return EnumC16523.CONTINUE;
        }
        return EnumC16523.SKIP_SUBTREE;
    }
}
