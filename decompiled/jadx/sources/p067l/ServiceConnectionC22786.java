package p067l;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: renamed from: l.᩸ۡᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: N1X5 */
/* JADX INFO: loaded from: classes4.dex */
public final class ServiceConnectionC22786 implements ServiceConnection {
    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        final InterfaceC7558 c20970;
        int i = AbstractBinderC2863.f4947;
        if (iBinder == null) {
            c20970 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("bin.mt.dstr.ipc.IJavaHookProbeAidlInterface");
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof InterfaceC7558)) {
                c20970 = (InterfaceC7558) iInterfaceQueryLocalInterface;
            } else {
                c20970 = new C20970(iBinder);
            }
        }
        C4081.f8987.submit(new Runnable() { // from class: l.ܶۡᩳ
            @Override // java.lang.Runnable
            public final void run() {
                ServiceConnectionC22786 serviceConnectionC22786 = this.f49372;
                InterfaceC7558 interfaceC7558 = c20970;
                try {
                    C6692.f17344 = Boolean.valueOf(interfaceC7558.mo17476());
                } catch (Exception unused) {
                    C6692.f17344 = Boolean.FALSE;
                }
                try {
                    interfaceC7558.exit();
                } catch (Exception unused2) {
                }
                try {
                    C7050.m16232().unbindService(serviceConnectionC22786);
                } catch (Exception unused3) {
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (C6692.f17344 == null) {
            C6692.f17344 = Boolean.FALSE;
        }
    }
}
