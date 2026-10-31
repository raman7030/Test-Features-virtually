package l;

/* JADX INFO: renamed from: l.ܺ᩸ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y9AZ */
/* JADX INFO: loaded from: classes5.dex */
public class C16204 implements InterfaceC8085 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Runnable f49900;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogInterfaceC0206 f49901;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC3346 f49902;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9856 f49903;

    @Override // l.InterfaceC8085
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ void mo6024(InterfaceC23586 interfaceC23586) {
    }

    @Override // l.InterfaceC8085
    /* JADX INFO: renamed from: ܳ */
    public final /* synthetic */ void mo6026(InterfaceC23586 interfaceC23586) {
    }

    @Override // l.InterfaceC8085
    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ void mo6027(InterfaceC23586 interfaceC23586) {
    }

    @Override // l.InterfaceC8085
    /* JADX INFO: renamed from: ܿ */
    public final /* synthetic */ void mo6028(InterfaceC23586 interfaceC23586) {
    }

    @Override // l.InterfaceC8085
    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ void mo6029(InterfaceC23586 interfaceC23586) {
    }

    public C16204(DialogInterfaceC0206 dialogInterfaceC0206, AbstractActivityC3346 abstractActivityC3346, C9856 c9856, Runnable runnable) {
        this.f49901 = dialogInterfaceC0206;
        this.f49902 = abstractActivityC3346;
        this.f49903 = c9856;
        this.f49900 = runnable;
    }

    @Override // l.InterfaceC8085
    /* JADX INFO: renamed from: ۧ */
    public final void mo6025(InterfaceC23586 interfaceC23586) {
        DialogInterfaceC0206 dialogInterfaceC0206 = this.f49901;
        boolean zM1442 = dialogInterfaceC0206.m1442();
        AbstractActivityC3346 abstractActivityC3346 = this.f49902;
        if (!zM1442) {
            abstractActivityC3346.getLifecycle().mo19834(this);
            return;
        }
        C9856 c9856 = this.f49903;
        if (c9856.m24925()) {
            if (!c9856.f29822) {
                c9856.f29822 = true;
                dialogInterfaceC0206.dismiss();
                ServiceC23281.m51598();
                C2094.m6881();
                this.f49900.run();
                return;
            }
            abstractActivityC3346.getLifecycle().mo19834(this);
        }
    }
}
