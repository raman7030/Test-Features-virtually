package l;

import android.os.SystemClock;

/* JADX INFO: renamed from: l.ۡܺᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: K1X4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8988 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC9694 f27309;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public Exception f27310;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public Object f27311;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public volatile boolean f27312 = false;

    public C8988(InterfaceC9694 interfaceC9694) {
        this.f27309 = interfaceC9694;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object m23229() throws Exception {
        this.f27312 = true;
        this.f27310 = null;
        ServiceC16042.f49474.sendMessage(ServiceC16042.f49474.obtainMessage(0, this));
        while (this.f27312) {
            SystemClock.sleep(1L);
        }
        Exception exc = this.f27310;
        if (exc != null) {
            throw exc;
        }
        return this.f27311;
    }
}
