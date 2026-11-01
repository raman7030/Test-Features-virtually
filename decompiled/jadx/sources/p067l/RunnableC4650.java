package p067l;

import android.app.Activity;
import com.tencent.open.web.security.JniInterface;

/* JADX INFO: renamed from: l.ۖ۠ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC4650 implements Runnable {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ C10014 f10451;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ String f10452;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ InterfaceC6386 f10453;

    public RunnableC4650(C10014 c10014, String str, InterfaceC6386 interfaceC6386) {
        this.f10451 = c10014;
        this.f10452 = str;
        this.f10453 = interfaceC6386;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        Activity activity;
        C9718.m22696(C10014.f27717, C10014.f27716);
        JniInterface.m2042();
        C10014 c10014 = this.f10451;
        if (c10014.f27718 == null || (activity = (Activity) c10014.f27718.get()) == null) {
            return;
        }
        activity.runOnUiThread(new RunnableC17389(this, activity));
    }
}
