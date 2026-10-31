package l;

import android.app.Activity;
import com.tencent.open.web.security.JniInterface;

/* JADX INFO: renamed from: l.ۖ۠ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC2401 implements Runnable {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8045 f7659;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f7660;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC4227 f7661;

    public RunnableC2401(C8045 c8045, String str, InterfaceC4227 interfaceC4227) {
        this.f7659 = c8045;
        this.f7660 = str;
        this.f7661 = interfaceC4227;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        Activity activity;
        C7733.m20716(C8045.f24803, C8045.f24802);
        JniInterface.m925();
        C8045 c8045 = this.f7659;
        if (c8045.f24804 == null || (activity = (Activity) c8045.f24804.get()) == null) {
            return;
        }
        activity.runOnUiThread(new RunnableC15805(this, activity));
    }
}
