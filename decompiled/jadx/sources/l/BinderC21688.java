package l;

/* JADX INFO: renamed from: l.᩸ܺᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 57CG */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC21688 extends AbstractBinderC0520 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ServiceC22393 f69566;

    public BinderC21688(ServiceC22393 serviceC22393) {
        this.f69566 = serviceC22393;
        attachInterface(this, "bin.mt.dstr.ipc.IJavaHookProbeAidlInterface");
    }

    @Override // l.InterfaceC5460
    /* JADX INFO: renamed from: ۡ */
    public final boolean mo15565() {
        ServiceC22393 serviceC22393 = this.f69566;
        serviceC22393.f72549 = null;
        try {
            C15336.m36369();
            return true;
        } catch (Throwable th) {
            serviceC22393.f72549 = th;
            return false;
        }
    }

    @Override // l.InterfaceC5460
    public final void exit() {
        this.f69566.stopSelf();
        System.exit(0);
    }
}
