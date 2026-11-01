package p067l;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.RemoteException;

/* JADX INFO: renamed from: l.ܰܳ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 8BM6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C15549 {

    /* JADX INFO: renamed from: ֫ */
    public Context f44432 = null;

    /* JADX INFO: renamed from: ۧ */
    public InterfaceC13539 f44433;

    /* JADX INFO: renamed from: ܽ */
    public ServiceConnection f44434;

    /* JADX INFO: renamed from: ֫ */
    public final int m35351(Context context) {
        this.f44432 = context;
        this.f44434 = new ServiceConnectionC24267(this);
        Intent intent = new Intent();
        intent.setClassName("org.repackage.com.zui.deviceidservice", "org.repackage.com.zui.deviceidservice.DeviceidService");
        return this.f44432.bindService(intent, this.f44434, 1) ? 1 : -1;
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m35352() {
        if (this.f44432 == null) {
            throw new IllegalArgumentException("Context is null, must be new OpenDeviceId first");
        }
        try {
            InterfaceC13539 interfaceC13539 = this.f44433;
            if (interfaceC13539 != null) {
                return interfaceC13539.mo28167a();
            }
            return null;
        } catch (RemoteException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m35353() {
        try {
            InterfaceC13539 interfaceC13539 = this.f44433;
            if (interfaceC13539 != null) {
                return interfaceC13539.mo28168c();
            }
            return false;
        } catch (RemoteException unused) {
            return false;
        }
    }
}
