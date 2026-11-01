package p067l;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: renamed from: l.ܿۛ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 08RN */
/* JADX INFO: loaded from: classes4.dex */
public final class HandlerC18671 extends Handler {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C4590 f55741;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC18671(C4590 c4590, Looper looper) {
        super(looper);
        this.f55741 = c4590;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        byte[] bArr = (byte[]) message.obj;
        if (bArr == null) {
            return;
        }
        for (C12637 c12637 : this.f55741.f10311) {
            if (c12637.m29065(bArr)) {
                c12637.m29063(message.what);
                return;
            }
        }
    }
}
