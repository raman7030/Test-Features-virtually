package l;

import android.os.Handler;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: l.ۡۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: DB1R */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC8809 implements Runnable {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Handler f26832;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public Callable f26833;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public InterfaceC13041 f26834;

    public RunnableC8809(Handler handler, Callable callable, InterfaceC13041 interfaceC13041) {
        this.f26833 = callable;
        this.f26834 = interfaceC13041;
        this.f26832 = handler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object objCall;
        try {
            objCall = ((CallableC7458) this.f26833).call();
        } catch (Exception unused) {
            objCall = null;
        }
        this.f26832.post(new RunnableC9515(this.f26834, objCall));
    }
}
