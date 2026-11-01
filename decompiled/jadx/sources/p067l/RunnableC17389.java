package p067l;

import android.app.Activity;
import com.tencent.connect.auth.DialogC0602a;
import com.tencent.open.TDialog;
import com.tencent.open.web.security.JniInterface;

/* JADX INFO: renamed from: l.ܺ۠ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC17389 implements Runnable {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ Activity f51901;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ RunnableC4650 f51902;

    public RunnableC17389(RunnableC4650 runnableC4650, Activity activity) {
        this.f51902 = runnableC4650;
        this.f51901 = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        RunnableC4650 runnableC4650 = this.f51902;
        InterfaceC6386 interfaceC6386 = runnableC4650.f10453;
        C10014 c10014 = runnableC4650.f10451;
        boolean z = JniInterface.f2141;
        Activity activity = this.f51901;
        if (z) {
            DialogC0602a dialogC0602a = new DialogC0602a(activity, runnableC4650.f10452, interfaceC6386, c10014.f79699);
            if (activity.isFinishing()) {
                return;
            }
            dialogC0602a.show();
            return;
        }
        C11060.m25470("openSDK_LOG.AuthAgent", "OpenUi, secure so load failed, goto download QQ.");
        TDialog tDialog = new TDialog(activity, c10014.m54855(), interfaceC6386, c10014.f79699);
        if (activity.isFinishing()) {
            return;
        }
        tDialog.show();
    }
}
