package p067l;

import android.os.Build;
import android.os.Handler;
import android.os.Message;

/* JADX INFO: renamed from: l.ᩳ᩻ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z8VY */
/* JADX INFO: loaded from: classes5.dex */
public final class C19842 implements InterfaceC3958, Handler.Callback {

    /* JADX INFO: renamed from: ᩸ */
    public final Handler f60320;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C19171 f60321;

    public C19842(C19171 c19171, InterfaceC12676 interfaceC12676) {
        this.f60321 = c19171;
        Handler handlerM12995 = C5792.m12995(this);
        this.f60320 = handlerM12995;
        interfaceC12676.mo11467(this, handlerM12995);
    }

    @Override // p067l.InterfaceC3958
    /* JADX INFO: renamed from: ֫ */
    public final void mo7906(long j) {
        if (Build.VERSION.SDK_INT < 30) {
            int i = (int) (j >> 32);
            int i2 = (int) j;
            Handler handler = this.f60320;
            handler.sendMessageAtFrontOfQueue(Message.obtain(handler, 0, i, i2));
            return;
        }
        m45085(j);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        int i = message.arg1;
        int i2 = message.arg2;
        String str = C5792.f14228;
        m45085(((((long) i) & 4294967295L) << 32) | (4294967295L & ((long) i2)));
        return true;
    }

    /* JADX INFO: renamed from: ۧ */
    private void m45085(long j) {
        C19171 c19171 = this.f60321;
        if (this != c19171.f57315 || c19171.m39401() == null) {
            return;
        }
        if (j == C14849.FOREVER_NS) {
            C19171.m43653(c19171);
            return;
        }
        try {
            c19171.m43663(j);
        } catch (C19735 e) {
            c19171.m39385(e);
        }
    }
}
