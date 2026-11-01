package p067l;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: renamed from: l.ܶۚۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z1XI */
/* JADX INFO: loaded from: classes4.dex */
public final class HandlerC16645 extends Handler {

    /* JADX INFO: renamed from: ֫ */
    public final Handler f48912;

    public HandlerC16645(Handler handler) {
        this.f48912 = handler;
    }

    @Override // android.os.Handler
    public final void dispatchMessage(Message message) {
        try {
            super.dispatchMessage(message);
        } catch (Throwable unused) {
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        this.f48912.handleMessage(message);
    }
}
