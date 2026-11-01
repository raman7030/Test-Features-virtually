package p067l;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩺᩸ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: N1TT */
/* JADX INFO: loaded from: classes.dex */
public final class ServiceConnectionC24475 implements ServiceConnection {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ ViewOnLayoutChangeListenerC9723 f77478;

    public ServiceConnectionC24475(ViewOnLayoutChangeListenerC9723 viewOnLayoutChangeListenerC9723) {
        this.f77478 = viewOnLayoutChangeListenerC9723;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        this.f77478.runOnUiThread(new Runnable() { // from class: l.ۨ᩸ۢ
            @Override // java.lang.Runnable
            public final void run() {
                ViewOnLayoutChangeListenerC9723 viewOnLayoutChangeListenerC9723 = this.f38850.f77478;
                viewOnLayoutChangeListenerC9723.f26858 = (BinderC13767) iBinder;
                Iterator it = viewOnLayoutChangeListenerC9723.f26854.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                viewOnLayoutChangeListenerC9723.f26854.clear();
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        ViewOnLayoutChangeListenerC9723 viewOnLayoutChangeListenerC9723 = this.f77478;
        if (viewOnLayoutChangeListenerC9723.isFinishing()) {
            return;
        }
        viewOnLayoutChangeListenerC9723.finish();
    }
}
