package l;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* JADX INFO: renamed from: l.᩺ܳ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 8BM6 */
/* JADX INFO: loaded from: classes.dex */
public final class ServiceConnectionC23042 implements ServiceConnection {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13869 f74155;

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f74155.f41352 = AbstractBinderC6109.m17026(iBinder);
    }

    public ServiceConnectionC23042(C13869 c13869) {
        this.f74155 = c13869;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f74155.f41352 = null;
    }
}
