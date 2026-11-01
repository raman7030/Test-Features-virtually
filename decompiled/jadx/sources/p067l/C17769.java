package p067l;

/* JADX INFO: renamed from: l.ܺ᩸ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y9AZ */
/* JADX INFO: loaded from: classes5.dex */
public class C17769 implements InterfaceC10052 {

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ Runnable f53066;

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ DialogInterfaceC2564 f53067;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ AbstractActivityC5549 f53068;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C11736 f53069;

    @Override // p067l.InterfaceC10052
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ void mo8221(InterfaceC24784 interfaceC24784) {
    }

    @Override // p067l.InterfaceC10052
    /* JADX INFO: renamed from: ܳ */
    public final /* synthetic */ void mo8223(InterfaceC24784 interfaceC24784) {
    }

    @Override // p067l.InterfaceC10052
    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ void mo8224(InterfaceC24784 interfaceC24784) {
    }

    @Override // p067l.InterfaceC10052
    /* JADX INFO: renamed from: ܿ */
    public final /* synthetic */ void mo8225(InterfaceC24784 interfaceC24784) {
    }

    @Override // p067l.InterfaceC10052
    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ void mo8226(InterfaceC24784 interfaceC24784) {
    }

    public C17769(DialogInterfaceC2564 dialogInterfaceC2564, AbstractActivityC5549 abstractActivityC5549, C11736 c11736, Runnable runnable) {
        this.f53067 = dialogInterfaceC2564;
        this.f53068 = abstractActivityC5549;
        this.f53069 = c11736;
        this.f53066 = runnable;
    }

    @Override // p067l.InterfaceC10052
    /* JADX INFO: renamed from: ۧ */
    public final void mo8222(InterfaceC24784 interfaceC24784) {
        DialogInterfaceC2564 dialogInterfaceC2564 = this.f53067;
        boolean zM3855 = dialogInterfaceC2564.m3855();
        AbstractActivityC5549 abstractActivityC5549 = this.f53068;
        if (!zM3855) {
            abstractActivityC5549.getLifecycle().mo21807(this);
            return;
        }
        C11736 c11736 = this.f53069;
        if (c11736.m26940()) {
            if (!c11736.f32775) {
                c11736.f32775 = true;
                dialogInterfaceC2564.dismiss();
                ServiceC24495.m53994();
                C4359.m9007();
                this.f53066.run();
                return;
            }
            abstractActivityC5549.getLifecycle().mo21807(this);
        }
    }
}
