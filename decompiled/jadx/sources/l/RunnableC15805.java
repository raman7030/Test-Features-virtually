package l;

import android.app.Activity;
import com.tencent.connect.auth.a;
import com.tencent.open.TDialog;
import com.tencent.open.web.security.JniInterface;

/* JADX INFO: renamed from: l.ܺ۠ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC15805 implements Runnable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Activity f48763;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ RunnableC2401 f48764;

    public RunnableC15805(RunnableC2401 runnableC2401, Activity activity) {
        this.f48764 = runnableC2401;
        this.f48763 = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        RunnableC2401 runnableC2401 = this.f48764;
        InterfaceC4227 interfaceC4227 = runnableC2401.f7661;
        C8045 c8045 = runnableC2401.f7659;
        boolean z = JniInterface.f907;
        Activity activity = this.f48763;
        if (z) {
            a aVar = new a(activity, runnableC2401.f7660, interfaceC4227, c8045.f76946);
            if (activity.isFinishing()) {
                return;
            }
            aVar.show();
            return;
        }
        C9145.m23519("openSDK_LOG.AuthAgent", "OpenUi, secure so load failed, goto download QQ.");
        TDialog tDialog = new TDialog(activity, c8045.m52446(), interfaceC4227, c8045.f76946);
        if (activity.isFinishing()) {
            return;
        }
        tDialog.show();
    }
}
