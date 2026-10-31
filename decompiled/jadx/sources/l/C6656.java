package l;

/* JADX INFO: renamed from: l.ۜۡۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: C5XG */
/* JADX INFO: loaded from: classes3.dex */
public final class C6656 implements InterfaceC16724 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19357 f20672;

    public C6656(C19357 c19357) {
        this.f20672 = c19357;
    }

    @Override // l.InterfaceC16724
    public final Object apply(Object obj) {
        InterfaceC0098 interfaceC0098 = (InterfaceC0098) obj;
        C19357 c19357 = this.f20672;
        C23589 c23589M34448 = c19357.f68957.m34448(interfaceC0098.getType());
        C7382 c7382M33032 = null;
        if (!c19357.f62662) {
            C13731 c13731 = (C13731) c19357.f68948;
            String name = interfaceC0098.getName();
            if (name == null) {
                c13731.getClass();
            } else {
                c7382M33032 = c13731.m33032(name);
            }
        }
        return new C22199(c23589M34448, c7382M33032, ((C9125) c19357.f68945).m23499(interfaceC0098.getAnnotations()));
    }
}
