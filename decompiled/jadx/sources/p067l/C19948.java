package p067l;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: l.ᩴۗ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: TAYI */
/* JADX INFO: loaded from: classes4.dex */
public class C19948 {

    /* JADX INFO: renamed from: ۧ */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f60553 = AtomicIntegerFieldUpdater.newUpdater(C19948.class, "_handled");
    public volatile /* synthetic */ int _handled;

    /* JADX INFO: renamed from: ֫ */
    public final Throwable f60554;

    public C19948(Throwable th, boolean z) {
        this.f60554 = th;
        this._handled = z ? 1 : 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m45275() {
        return f60553.compareAndSet(this, 0, 1);
    }

    public final String toString() {
        return getClass().getSimpleName() + '[' + this.f60554 + ']';
    }
}
