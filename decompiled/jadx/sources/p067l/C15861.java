package p067l;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.ܳ֨ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: LAQJ */
/* JADX INFO: loaded from: classes3.dex */
public final class C15861 {

    /* JADX INFO: renamed from: ۧ */
    public boolean f45941;

    /* JADX INFO: renamed from: ܽ */
    public C20689 f45942;

    /* JADX INFO: renamed from: ܿ */
    public final C16207 f45943;

    /* JADX INFO: renamed from: ֫ */
    public final AtomicReference f45940 = new AtomicReference();

    /* JADX INFO: renamed from: ᩳ */
    public final ArrayBlockingQueue f45944 = new ArrayBlockingQueue(20);

    public C15861(C16207 c16207, C20689 c20689) {
        this.f45943 = c16207;
        this.f45942 = c20689;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m35998() throws Exception {
        AtomicReference atomicReference = this.f45940;
        if (atomicReference.get() != null) {
            throw ((Exception) atomicReference.get());
        }
    }
}
