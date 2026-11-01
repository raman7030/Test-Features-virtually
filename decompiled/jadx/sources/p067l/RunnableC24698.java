package p067l;

import android.app.PendingIntent;
import android.content.pm.PackageInstaller;

/* JADX INFO: renamed from: l.᩻ۚܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: LAQJ */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC24698 implements Runnable {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ Object f78180;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f78181;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f78182;

    public /* synthetic */ RunnableC24698(int i, Object obj, Object obj2) {
        this.f78181 = i;
        this.f78182 = obj;
        this.f78180 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f78181) {
            case 0:
                ((PackageInstaller.Session) this.f78182).commit(((PendingIntent) this.f78180).getIntentSender());
                break;
            case 1:
                ((C12902) this.f78182).m29574((String) this.f78180);
                break;
            default:
                C23194.m51667((C23194) this.f78182, (String) this.f78180);
                break;
        }
    }
}
