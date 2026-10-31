package l;

import android.os.Build;
import android.os.Handler;
import android.os.Message;

/* JADX INFO: renamed from: l.ᩳ᩻ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z8VY */
/* JADX INFO: loaded from: classes5.dex */
public final class C18385 implements InterfaceC1673, Handler.Callback {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Handler f57100;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17679 f57101;

    public C18385(C17679 c17679, InterfaceC10846 interfaceC10846) {
        this.f57101 = c17679;
        Handler handlerM11019 = C3603.m11019(this);
        this.f57100 = handlerM11019;
        interfaceC10846.mo9424(this, handlerM11019);
    }

    @Override // l.InterfaceC1673
    /* JADX INFO: renamed from: ֫ */
    public final void mo5676(long j) {
        if (Build.VERSION.SDK_INT < 30) {
            int i = (int) (j >> 32);
            int i2 = (int) j;
            Handler handler = this.f57100;
            handler.sendMessageAtFrontOfQueue(Message.obtain(handler, 0, i, i2));
            return;
        }
        m42813(j);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        int i = message.arg1;
        int i2 = message.arg2;
        String str = C3603.f11424;
        m42813(((((long) i) & 4294967295L) << 32) | (4294967295L & ((long) i2)));
        return true;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m42813(long j) {
        C17679 c17679 = this.f57101;
        if (this != c17679.f54122 || c17679.m37231() == null) {
            return;
        }
        if (j == C13132.FOREVER_NS) {
            C17679.m41407(c17679);
            return;
        }
        try {
            c17679.m41417(j);
        } catch (C18273 e) {
            c17679.m37215(e);
        }
    }
}
