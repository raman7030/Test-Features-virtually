package p067l;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* JADX INFO: renamed from: l.᩺ܳ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 8BM6 */
/* JADX INFO: loaded from: classes.dex */
public final class ServiceConnectionC24267 implements ServiceConnection {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C15549 f76897;

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f76897.f44433 = AbstractBinderC8174.m18957(iBinder);
    }

    public ServiceConnectionC24267(C15549 c15549) {
        this.f76897 = c15549;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f76897.f44433 = null;
    }
}
