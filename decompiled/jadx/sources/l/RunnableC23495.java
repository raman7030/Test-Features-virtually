package l;

import android.app.PendingIntent;
import android.content.pm.PackageInstaller;

/* JADX INFO: renamed from: l.᩻ۚܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: LAQJ */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC23495 implements Runnable {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f75433;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f75434;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f75435;

    public /* synthetic */ RunnableC23495(int i, Object obj, Object obj2) {
        this.f75434 = i;
        this.f75435 = obj;
        this.f75433 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f75434) {
            case 0:
                ((PackageInstaller.Session) this.f75435).commit(((PendingIntent) this.f75433).getIntentSender());
                break;
            case 1:
                ((C11083) this.f75435).m27512((String) this.f75433);
                break;
            default:
                C21912.m49314((C21912) this.f75435, (String) this.f75433);
                break;
        }
    }
}
