package l;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.᩷ۜ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: K6PM */
/* JADX INFO: loaded from: classes4.dex */
public final class C20718 extends WeakReference {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Throwable f66710;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f66711;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C20718 f66712;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final long f66713;

    public C20718(AbstractFutureC8723 abstractFutureC8723, Throwable th, C20718 c20718, ReferenceQueue referenceQueue) {
        super(abstractFutureC8723, referenceQueue);
        this.f66710 = th;
        this.f66712 = c20718;
        this.f66713 = Thread.currentThread().getId();
        this.f66711 = System.identityHashCode(abstractFutureC8723);
    }
}
