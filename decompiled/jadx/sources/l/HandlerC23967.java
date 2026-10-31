package l;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: renamed from: l.᩻᩸ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: X58A */
/* JADX INFO: loaded from: classes.dex */
public final class HandlerC23967 extends Handler {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractFragmentC2801 f77727;

    public HandlerC23967(AbstractFragmentC2801 abstractFragmentC2801) {
        this.f77727 = abstractFragmentC2801;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message.what != 1) {
            return;
        }
        this.f77727.m8646();
    }
}
