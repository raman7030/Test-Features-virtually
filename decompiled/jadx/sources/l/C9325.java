package l;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: l.ۢۗ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: TAYI */
/* JADX INFO: loaded from: classes3.dex */
public final class C9325 extends C18497 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f28287 = AtomicIntegerFieldUpdater.newUpdater(C9325.class, "_resumed");
    public volatile /* synthetic */ int _resumed;

    public C9325(C6502 c6502, Throwable th, boolean z) {
        if (th == null) {
            th = new CancellationException("Continuation " + c6502 + " was cancelled normally");
        }
        super(th, z);
        this._resumed = 0;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m24003() {
        return f28287.compareAndSet(this, 0, 1);
    }
}
