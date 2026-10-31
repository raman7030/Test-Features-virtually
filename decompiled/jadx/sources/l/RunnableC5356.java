package l;

import android.app.Application;
import android.content.Intent;

/* JADX INFO: renamed from: l.ۚ۫ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: G7AW */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC5356 implements Runnable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f16697;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16697) {
            case 0:
                int i = ServiceC1618.f5686;
                Application applicationM14335 = C4925.m14335();
                C0881.m3232(applicationM14335, new Intent(applicationM14335, (Class<?>) ServiceC1618.class));
                break;
            default:
                C9068.m23395();
                break;
        }
    }
}
