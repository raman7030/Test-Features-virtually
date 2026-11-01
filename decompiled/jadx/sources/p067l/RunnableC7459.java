package p067l;

import android.app.Application;
import android.content.Intent;

/* JADX INFO: renamed from: l.ۚ۫ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: G7AW */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC7459 implements Runnable {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f19535;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f19535) {
            case 0:
                int i = ServiceC3906.f8466;
                Application applicationM16232 = C7050.m16232();
                C0886.m5546(applicationM16232, new Intent(applicationM16232, (Class<?>) ServiceC3906.class));
                break;
            default:
                C10987.m25341();
                break;
        }
    }
}
