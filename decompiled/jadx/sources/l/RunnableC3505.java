package l;

import android.app.NotificationManager;
import com.google.android.material.search.SearchView;

/* JADX INFO: renamed from: l.ۗ᩸ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: N1TT */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC3505 implements Runnable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f11126;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f11127;

    public /* synthetic */ RunnableC3505(int i, Object obj) {
        this.f11126 = i;
        this.f11127 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11126) {
            case 0:
                ((ViewOnLayoutChangeListenerC7738) this.f11127).f23945.m29324();
                break;
            case 1:
                C3175.f9985.remove((String) this.f11127);
                break;
            case 2:
                ServiceC1618 serviceC1618 = (ServiceC1618) this.f11127;
                ((NotificationManager) serviceC1618.getSystemService("notification")).notify(1007, serviceC1618.m5487());
                break;
            default:
                ((SearchView) this.f11127).show();
                break;
        }
    }
}
