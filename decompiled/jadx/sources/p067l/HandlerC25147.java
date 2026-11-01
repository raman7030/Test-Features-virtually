package p067l;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: renamed from: l.᩻᩸ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: X58A */
/* JADX INFO: loaded from: classes.dex */
public final class HandlerC25147 extends Handler {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ AbstractFragmentC5031 f80479;

    public HandlerC25147(AbstractFragmentC5031 abstractFragmentC5031) {
        this.f80479 = abstractFragmentC5031;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message.what != 1) {
            return;
        }
        this.f80479.m10706();
    }
}
