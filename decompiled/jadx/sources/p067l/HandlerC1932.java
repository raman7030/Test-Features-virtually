package p067l;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: renamed from: l.᩹֫ */
/* JADX INFO: compiled from: U6BF */
/* JADX INFO: loaded from: classes.dex */
public final class HandlerC1932 extends Handler {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ AbstractC1057 f73070;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC1932(AbstractC1057 abstractC1057, Looper looper) {
        super(looper);
        this.f73070 = abstractC1057;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        InterfaceC0987 interfaceC0987;
        AbstractC1057 abstractC1057;
        HandlerC1932 handlerC1932;
        if (message.what == 1) {
            synchronized (this.f73070.f16736) {
                interfaceC0987 = (InterfaceC0987) this.f73070.f16737.get();
                abstractC1057 = this.f73070;
                handlerC1932 = abstractC1057.f16735;
            }
            if (interfaceC0987 == null || abstractC1057 != interfaceC0987.mo10975() || handlerC1932 == null) {
                return;
            }
            interfaceC0987.mo10976((C22636) message.obj);
            this.f73070.m14847(interfaceC0987, handlerC1932);
            interfaceC0987.mo10976(null);
        }
    }
}
