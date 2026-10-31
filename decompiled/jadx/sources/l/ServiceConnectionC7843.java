package l;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: renamed from: l.۠֨ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 19AV */
/* JADX INFO: loaded from: classes3.dex */
public final class ServiceConnectionC7843 implements ServiceConnection {
    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        InterfaceC7262 c22784;
        C19926.m45878("Shizuku service connected");
        int i = AbstractBinderC13611.f40610;
        if (iBinder == null) {
            c22784 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("bin.mt.shell.IShizukuCommand");
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof InterfaceC7262)) {
                c22784 = (InterfaceC7262) iInterfaceQueryLocalInterface;
            } else {
                c22784 = new C22784(iBinder);
            }
        }
        C14898 c14898 = new C14898(c22784);
        C19839.m45619(c14898);
        for (C19839 c19839 : C19839.m45623()) {
            C19839.m45620(c19839, c14898);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        C19926.m45878("Shizuku service disconnected");
        C19839.m45632();
    }
}
