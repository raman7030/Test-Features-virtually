package p067l;

import android.os.SystemClock;

/* JADX INFO: renamed from: l.ۡܺᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: K1X4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10911 {

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC11582 f30243;

    /* JADX INFO: renamed from: ۧ */
    public Exception f30244;

    /* JADX INFO: renamed from: ܽ */
    public Object f30245;

    /* JADX INFO: renamed from: ᩳ */
    public volatile boolean f30246 = false;

    public C10911(InterfaceC11582 interfaceC11582) {
        this.f30243 = interfaceC11582;
    }

    /* JADX INFO: renamed from: ֫ */
    public final Object m25173() throws Exception {
        this.f30246 = true;
        this.f30244 = null;
        ServiceC17615.f52638.sendMessage(ServiceC17615.f52638.obtainMessage(0, this));
        while (this.f30246) {
            SystemClock.sleep(1L);
        }
        Exception exc = this.f30244;
        if (exc != null) {
            throw exc;
        }
        return this.f30245;
    }
}
