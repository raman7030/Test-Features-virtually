package l;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: renamed from: l.ܿۛ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 08RN */
/* JADX INFO: loaded from: classes4.dex */
public final class HandlerC17154 extends Handler {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2338 f52558;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC17154(C2338 c2338, Looper looper) {
        super(looper);
        this.f52558 = c2338;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        byte[] bArr = (byte[]) message.obj;
        if (bArr == null) {
            return;
        }
        for (C10805 c10805 : this.f52558.f7520) {
            if (c10805.m27020(bArr)) {
                c10805.m27018(message.what);
                return;
            }
        }
    }
}
