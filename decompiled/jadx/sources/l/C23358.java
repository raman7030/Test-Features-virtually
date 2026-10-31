package l;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: renamed from: l.᩻֨֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 78OY */
/* JADX INFO: loaded from: classes.dex */
public final class C23358 implements InterfaceC18545 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public Message f75036;

    public /* synthetic */ C23358(int i) {
        this();
    }

    public C23358() {
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m51767(Message message) {
        this.f75036 = message;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m51768(Handler handler) {
        Message message = this.f75036;
        message.getClass();
        boolean zSendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue(message);
        this.f75036 = null;
        C6425.m17752(this);
        return zSendMessageAtFrontOfQueue;
    }

    @Override // l.InterfaceC18545
    /* JADX INFO: renamed from: ֫ */
    public final void mo43089() {
        Message message = this.f75036;
        message.getClass();
        message.sendToTarget();
        this.f75036 = null;
        C6425.m17752(this);
    }
}
