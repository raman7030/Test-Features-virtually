package p067l;

/* JADX INFO: renamed from: l.᩸ܺᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 57CG */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC22981 extends AbstractBinderC2863 {

    /* JADX INFO: renamed from: ܳ */
    public final /* synthetic */ ServiceC23651 f72271;

    public BinderC22981(ServiceC23651 serviceC23651) {
        this.f72271 = serviceC23651;
        attachInterface(this, "bin.mt.dstr.ipc.IJavaHookProbeAidlInterface");
    }

    @Override // p067l.InterfaceC7558
    /* JADX INFO: renamed from: ۡ */
    public final boolean mo17476() {
        ServiceC23651 serviceC23651 = this.f72271;
        serviceC23651.f75275 = null;
        try {
            C16944.m38527();
            return true;
        } catch (Throwable th) {
            serviceC23651.f75275 = th;
            return false;
        }
    }

    @Override // p067l.InterfaceC7558
    public final void exit() {
        this.f72271.stopSelf();
        System.exit(0);
    }
}
