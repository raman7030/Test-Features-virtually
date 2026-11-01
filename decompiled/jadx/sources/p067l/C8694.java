package p067l;

/* JADX INFO: renamed from: l.ۜۡۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: C5XG */
/* JADX INFO: loaded from: classes3.dex */
public final class C8694 implements InterfaceC18263 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C20765 f23548;

    public C8694(C20765 c20765) {
        this.f23548 = c20765;
    }

    @Override // p067l.InterfaceC18263
    public final Object apply(Object obj) {
        InterfaceC2461 interfaceC2461 = (InterfaceC2461) obj;
        C20765 c20765 = this.f23548;
        C24787 c24787M36581 = c20765.f71655.m36581(interfaceC2461.getType());
        C9384 c9384M35146 = null;
        if (!c20765.f65275) {
            C15418 c15418 = (C15418) c20765.f71646;
            String name = interfaceC2461.getName();
            if (name == null) {
                c15418.getClass();
            } else {
                c9384M35146 = c15418.m35146(name);
            }
        }
        return new C23466(c24787M36581, c9384M35146, ((C11041) c20765.f71643).m25450(interfaceC2461.getAnnotations()));
    }
}
