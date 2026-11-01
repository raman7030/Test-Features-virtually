package p067l;

import android.os.Handler;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: l.ۡۤ */
/* JADX INFO: compiled from: DB1R */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC1279 implements Runnable {

    /* JADX INFO: renamed from: ᩶ */
    public Handler f29757;

    /* JADX INFO: renamed from: ᩸ */
    public Callable f29758;

    /* JADX INFO: renamed from: ᩹ */
    public InterfaceC1489 f29759;

    public RunnableC1279(Handler handler, Callable callable, InterfaceC1489 interfaceC1489) {
        this.f29758 = callable;
        this.f29759 = interfaceC1489;
        this.f29757 = handler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object objCall;
        try {
            objCall = ((CallableC1212) this.f29758).call();
        } catch (Exception unused) {
            objCall = null;
        }
        this.f29757.post(new RunnableC1314(this.f29759, objCall));
    }
}
