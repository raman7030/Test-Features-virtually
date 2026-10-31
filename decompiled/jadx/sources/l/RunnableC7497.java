package l;

/* JADX INFO: renamed from: l.۟۬᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6Y9 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC7497 implements Runnable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3264 f23087;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogInterfaceC0206 f23088;

    public /* synthetic */ RunnableC7497(C3264 c3264, DialogInterfaceC0206 dialogInterfaceC0206) {
        this.f23087 = c3264;
        this.f23088 = dialogInterfaceC0206;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f23087.m10006()) {
            return;
        }
        this.f23088.dismiss();
    }
}
