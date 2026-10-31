package l;

import android.app.NotificationManager;

/* JADX INFO: renamed from: l.ۖ۫᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6Y9 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC2539 implements Runnable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f8059;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f8060;

    public /* synthetic */ RunnableC2539(int i, Object obj) {
        this.f8059 = i;
        this.f8060 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8059) {
            case 0:
                DialogInterfaceC0206 dialogInterfaceC0206 = ((DialogInterfaceC0206[]) this.f8060)[0];
                if (dialogInterfaceC0206 != null) {
                    dialogInterfaceC0206.dismiss();
                }
                break;
            case 1:
                ((InterfaceC12309) this.f8060).mo27217();
                break;
            case 2:
                C17604.m41147((C17604) this.f8060);
                break;
            case 3:
                ServiceC7926 serviceC7926 = (ServiceC7926) this.f8060;
                ((NotificationManager) serviceC7926.getSystemService("notification")).notify(1004, serviceC7926.m21221());
                break;
            default:
                ViewOnLayoutChangeListenerC7738.m20733((ViewOnLayoutChangeListenerC7738) this.f8060);
                break;
        }
    }
}
