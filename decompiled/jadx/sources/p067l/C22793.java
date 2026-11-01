package p067l;

/* JADX INFO: renamed from: l.᩸ۢ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: Q9M2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C22793 implements InterfaceC18749 {

    /* JADX INFO: renamed from: ᩸ */
    public final InterfaceC10052 f71827;

    /* JADX INFO: renamed from: ᩹ */
    public final InterfaceC18749 f71828;

    public C22793(InterfaceC10052 interfaceC10052, InterfaceC18749 interfaceC18749) {
        C13045.m29867(interfaceC10052, "defaultLifecycleObserver");
        this.f71827 = interfaceC10052;
        this.f71828 = interfaceC18749;
    }

    @Override // p067l.InterfaceC18749
    /* JADX INFO: renamed from: ֫ */
    public final void mo4562(InterfaceC24784 interfaceC24784, EnumC24133 enumC24133) {
        int i = C16756.f49379[enumC24133.ordinal()];
        InterfaceC10052 interfaceC10052 = this.f71827;
        switch (i) {
            case 1:
                interfaceC10052.mo8221(interfaceC24784);
                break;
            case 2:
                interfaceC10052.mo8223(interfaceC24784);
                break;
            case 3:
                interfaceC10052.mo8222(interfaceC24784);
                break;
            case 4:
                interfaceC10052.mo8224(interfaceC24784);
                break;
            case 5:
                interfaceC10052.mo8226(interfaceC24784);
                break;
            case 6:
                interfaceC10052.mo8225(interfaceC24784);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        InterfaceC18749 interfaceC18749 = this.f71828;
        if (interfaceC18749 != null) {
            interfaceC18749.mo4562(interfaceC24784, enumC24133);
        }
    }
}
