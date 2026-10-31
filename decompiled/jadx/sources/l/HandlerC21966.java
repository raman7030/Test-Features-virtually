package l;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: renamed from: l.᩹֫, reason: contains not printable characters */
/* JADX INFO: compiled from: U6BF */
/* JADX INFO: loaded from: classes.dex */
public final class HandlerC21966 extends Handler {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC4327 f70359;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC21966(AbstractC4327 abstractC4327, Looper looper) {
        super(looper);
        this.f70359 = abstractC4327;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        InterfaceC2916 interfaceC2916;
        AbstractC4327 abstractC4327;
        HandlerC21966 handlerC21966;
        if (message.what == 1) {
            synchronized (this.f70359.f13922) {
                interfaceC2916 = (InterfaceC2916) this.f70359.f13923.get();
                abstractC4327 = this.f70359;
                handlerC21966 = abstractC4327.f13921;
            }
            if (interfaceC2916 == null || abstractC4327 != interfaceC2916.mo8907() || handlerC21966 == null) {
                return;
            }
            interfaceC2916.mo8908((C21326) message.obj);
            this.f70359.m12983(interfaceC2916, handlerC21966);
            interfaceC2916.mo8908(null);
        }
    }
}
