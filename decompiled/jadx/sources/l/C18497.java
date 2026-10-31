package l;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: l.ᩴۗ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: TAYI */
/* JADX INFO: loaded from: classes4.dex */
public class C18497 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f57331 = AtomicIntegerFieldUpdater.newUpdater(C18497.class, "_handled");
    public volatile /* synthetic */ int _handled;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Throwable f57332;

    public C18497(Throwable th, boolean z) {
        this.f57332 = th;
        this._handled = z ? 1 : 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m42997() {
        return f57331.compareAndSet(this, 0, 1);
    }

    public final String toString() {
        return getClass().getSimpleName() + '[' + this.f57332 + ']';
    }
}
