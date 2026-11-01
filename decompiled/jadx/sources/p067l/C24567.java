package p067l;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: renamed from: l.᩻֨֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 78OY */
/* JADX INFO: loaded from: classes.dex */
public final class C24567 implements InterfaceC19993 {

    /* JADX INFO: renamed from: ֫ */
    public Message f77782;

    public /* synthetic */ C24567(int i) {
        this();
    }

    public C24567() {
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m54165(Message message) {
        this.f77782 = message;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m54166(Handler handler) {
        Message message = this.f77782;
        message.getClass();
        boolean zSendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue(message);
        this.f77782 = null;
        C8474.m19699(this);
        return zSendMessageAtFrontOfQueue;
    }

    @Override // p067l.InterfaceC19993
    /* JADX INFO: renamed from: ֫ */
    public final void mo45367() {
        Message message = this.f77782;
        message.getClass();
        message.sendToTarget();
        this.f77782 = null;
        C8474.m19699(this);
    }
}
