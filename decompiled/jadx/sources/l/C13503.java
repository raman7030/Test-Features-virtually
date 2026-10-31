package l;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.ܰ֫ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: H9D4 */
/* JADX INFO: loaded from: classes3.dex */
public class C13503 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f40314 = new AtomicInteger(1);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C13503 m32531() {
        if (this.f40314.getAndIncrement() > 0) {
            return this;
        }
        return null;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m32532() {
        return this.f40314.decrementAndGet() <= 0;
    }
}
