package p067l;

/* JADX INFO: renamed from: l.ܳۙܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 28VT */
/* JADX INFO: loaded from: classes4.dex */
public final class C15959 implements InterfaceC22192 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ Runnable f46212;

    public C15959(Runnable runnable) {
        this.f46212 = runnable;
    }

    @Override // p067l.InterfaceC22192
    public final void onSuccess() {
        C23691.f75409 = false;
        this.f46212.run();
    }

    @Override // p067l.InterfaceC22192
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo27608(Exception exc) {
        C23691.f75409 = false;
        return false;
    }

    @Override // p067l.InterfaceC22192
    public final void onCanceled() {
        C23691.f75409 = false;
    }
}
