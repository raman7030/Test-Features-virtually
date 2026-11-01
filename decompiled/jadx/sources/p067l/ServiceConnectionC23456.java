package p067l;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: renamed from: l.᩹ۡᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: N1X5 */
/* JADX INFO: loaded from: classes.dex */
public final class ServiceConnectionC23456 implements ServiceConnection {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C6692 f74704;

    public ServiceConnectionC23456(C6692 c6692) {
        this.f74704 = c6692;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        InterfaceC20299 c4876;
        int i = AbstractBinderC6217.f15677;
        if (iBinder == null) {
            c4876 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("bin.mt.dstr.ipc.IDecryptorAidlInterface");
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof InterfaceC20299)) {
                c4876 = (InterfaceC20299) iInterfaceQueryLocalInterface;
            } else {
                c4876 = new C4876(iBinder);
            }
        }
        this.f74704.f17347 = c4876;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f74704.f17347 = null;
    }
}
