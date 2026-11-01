package p067l;

import android.app.NotificationManager;

/* JADX INFO: renamed from: l.ۖ۫᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6Y9 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC4782 implements Runnable {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f10849;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f10850;

    public /* synthetic */ RunnableC4782(int i, Object obj) {
        this.f10849 = i;
        this.f10850 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10849) {
            case 0:
                DialogInterfaceC2564 dialogInterfaceC2564 = ((DialogInterfaceC2564[]) this.f10850)[0];
                if (dialogInterfaceC2564 != null) {
                    dialogInterfaceC2564.dismiss();
                }
                break;
            case 1:
                ((InterfaceC14067) this.f10850).mo29262();
                break;
            case 2:
                C19100.m43393((C19100) this.f10850);
                break;
            case 3:
                ServiceC9901 serviceC9901 = (ServiceC9901) this.f10850;
                ((NotificationManager) serviceC9901.getSystemService("notification")).notify(1004, serviceC9901.m23187());
                break;
            default:
                ViewOnLayoutChangeListenerC9723.m22713((ViewOnLayoutChangeListenerC9723) this.f10850);
                break;
        }
    }
}
