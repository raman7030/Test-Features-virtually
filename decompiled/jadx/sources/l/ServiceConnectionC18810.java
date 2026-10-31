package l;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: renamed from: l.ᩴܳ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 0BLU */
/* JADX INFO: loaded from: classes4.dex */
public final class ServiceConnectionC18810 implements ServiceConnection {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0464 f59359;

    public ServiceConnectionC18810(C0464 c0464) {
        this.f59359 = c0464;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        InterfaceC5404 interfaceC5404;
        C0464 c0464 = this.f59359;
        int i = AbstractBinderC2582.f8172;
        if (iBinder == null) {
            interfaceC5404 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.heytap.openid.IOpenID");
            if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC5404)) {
                C15986 c15986 = new C15986();
                c15986.f49331 = iBinder;
                interfaceC5404 = c15986;
            } else {
                interfaceC5404 = (InterfaceC5404) iInterfaceQueryLocalInterface;
            }
        }
        c0464.f2028 = interfaceC5404;
        synchronized (this.f59359.f2032) {
            this.f59359.f2032.notify();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f59359.f2028 = null;
    }
}
