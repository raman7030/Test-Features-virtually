package p067l;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.᩷ۜ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: K6PM */
/* JADX INFO: loaded from: classes4.dex */
public final class C22059 extends WeakReference {

    /* JADX INFO: renamed from: ֫ */
    public final Throwable f69391;

    /* JADX INFO: renamed from: ۧ */
    public final int f69392;

    /* JADX INFO: renamed from: ܽ */
    public C22059 f69393;

    /* JADX INFO: renamed from: ᩳ */
    public final long f69394;

    public C22059(AbstractFutureC10659 abstractFutureC10659, Throwable th, C22059 c22059, ReferenceQueue referenceQueue) {
        super(abstractFutureC10659, referenceQueue);
        this.f69391 = th;
        this.f69393 = c22059;
        this.f69394 = Thread.currentThread().getId();
        this.f69392 = System.identityHashCode(abstractFutureC10659);
    }
}
