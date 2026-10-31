package l;

import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ܿᩳᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: L19N */
/* JADX INFO: loaded from: classes4.dex */
public final class C17517 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Supplier f53494;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public volatile Object f53495;

    public C17517(Supplier supplier) {
        this.f53494 = supplier;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object m40934() {
        Object obj = this.f53495;
        if (obj != null) {
            return obj;
        }
        synchronized (this) {
            if (this.f53495 == null) {
                obj = this.f53494.get();
                this.f53495 = obj;
            }
        }
        return obj;
    }
}
