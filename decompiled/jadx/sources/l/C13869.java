package l;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.RemoteException;

/* JADX INFO: renamed from: l.ܰܳ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 8BM6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C13869 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public Context f41351 = null;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public InterfaceC11754 f41352;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public ServiceConnection f41353;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m33232(Context context) {
        this.f41351 = context;
        this.f41353 = new ServiceConnectionC23042(this);
        Intent intent = new Intent();
        intent.setClassName("org.repackage.com.zui.deviceidservice", "org.repackage.com.zui.deviceidservice.DeviceidService");
        return this.f41351.bindService(intent, this.f41353, 1) ? 1 : -1;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m33233() {
        if (this.f41351 == null) {
            throw new IllegalArgumentException("Context is null, must be new OpenDeviceId first");
        }
        try {
            InterfaceC11754 interfaceC11754 = this.f41352;
            if (interfaceC11754 != null) {
                return interfaceC11754.a();
            }
            return null;
        } catch (RemoteException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m33234() {
        try {
            InterfaceC11754 interfaceC11754 = this.f41352;
            if (interfaceC11754 != null) {
                return interfaceC11754.c();
            }
            return false;
        } catch (RemoteException unused) {
            return false;
        }
    }
}
