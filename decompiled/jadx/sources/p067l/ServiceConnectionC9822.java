package p067l;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: renamed from: l.۠֨ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 19AV */
/* JADX INFO: loaded from: classes3.dex */
public final class ServiceConnectionC9822 implements ServiceConnection {
    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        InterfaceC9270 c24022;
        C21306.m48191("Shizuku service connected");
        int i = AbstractBinderC15304.f43687;
        if (iBinder == null) {
            c24022 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("bin.mt.shell.IShizukuCommand");
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof InterfaceC9270)) {
                c24022 = (InterfaceC9270) iInterfaceQueryLocalInterface;
            } else {
                c24022 = new C24022(iBinder);
            }
        }
        C16527 c16527 = new C16527(c24022);
        C21223.m47930(c16527);
        for (C21223 c21223 : C21223.m47934()) {
            C21223.m47931(c21223, c16527);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        C21306.m48191("Shizuku service disconnected");
        C21223.m47943();
    }
}
