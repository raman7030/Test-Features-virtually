package p067l;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.ܰ֫ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: H9D4 */
/* JADX INFO: loaded from: classes3.dex */
public class C15201 {

    /* JADX INFO: renamed from: ᩸ */
    public final AtomicInteger f43384 = new AtomicInteger(1);

    /* JADX INFO: renamed from: ֫ */
    public final C15201 m34633() {
        if (this.f43384.getAndIncrement() > 0) {
            return this;
        }
        return null;
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m34634() {
        return this.f43384.decrementAndGet() <= 0;
    }
}
