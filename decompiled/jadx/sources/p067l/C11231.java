package p067l;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: l.ۢۗ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: TAYI */
/* JADX INFO: loaded from: classes3.dex */
public final class C11231 extends C19948 {

    /* JADX INFO: renamed from: ܽ */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f31237 = AtomicIntegerFieldUpdater.newUpdater(C11231.class, "_resumed");
    public volatile /* synthetic */ int _resumed;

    public C11231(C8548 c8548, Throwable th, boolean z) {
        if (th == null) {
            th = new CancellationException("Continuation " + c8548 + " was cancelled normally");
        }
        super(th, z);
        this._resumed = 0;
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m26012() {
        return f31237.compareAndSet(this, 0, 1);
    }
}
