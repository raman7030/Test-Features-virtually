package p067l;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: renamed from: l.ᩴܳ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 0BLU */
/* JADX INFO: loaded from: classes4.dex */
public final class ServiceConnectionC20245 implements ServiceConnection {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C2809 f62586;

    public ServiceConnectionC20245(C2809 c2809) {
        this.f62586 = c2809;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        InterfaceC7504 interfaceC7504;
        C2809 c2809 = this.f62586;
        int i = AbstractBinderC4822.f10964;
        if (iBinder == null) {
            interfaceC7504 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.heytap.openid.IOpenID");
            if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC7504)) {
                C17561 c17561 = new C17561();
                c17561.f52494 = iBinder;
                interfaceC7504 = c17561;
            } else {
                interfaceC7504 = (InterfaceC7504) iInterfaceQueryLocalInterface;
            }
        }
        c2809.f4803 = interfaceC7504;
        synchronized (this.f62586.f4807) {
            this.f62586.f4807.notify();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f62586.f4803 = null;
    }
}
