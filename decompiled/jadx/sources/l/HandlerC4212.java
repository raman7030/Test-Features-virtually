package l;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: renamed from: l.ۘ᩸ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: I5JQ */
/* JADX INFO: loaded from: classes2.dex */
public final class HandlerC4212 extends Handler {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC21851 f13682;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC4212(AbstractC21851 abstractC21851, Looper looper) {
        super(looper);
        this.f13682 = abstractC21851;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message.what != 1) {
            return;
        }
        this.f13682.m49237();
    }
}
