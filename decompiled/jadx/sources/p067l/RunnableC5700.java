package p067l;

import android.app.NotificationManager;
import com.google.android.material.search.SearchView;

/* JADX INFO: renamed from: l.ۗ᩸ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: N1TT */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC5700 implements Runnable {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f13931;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f13932;

    public /* synthetic */ RunnableC5700(int i, Object obj) {
        this.f13931 = i;
        this.f13932 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f13931) {
            case 0:
                ((ViewOnLayoutChangeListenerC9723) this.f13932).f26858.m31379();
                break;
            case 1:
                C5386.f12787.remove((String) this.f13932);
                break;
            case 2:
                ServiceC3906 serviceC3906 = (ServiceC3906) this.f13932;
                ((NotificationManager) serviceC3906.getSystemService("notification")).notify(1007, serviceC3906.m7717());
                break;
            default:
                ((SearchView) this.f13932).show();
                break;
        }
    }
}
