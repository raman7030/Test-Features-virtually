package p067l;

import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ܿᩳᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: L19N */
/* JADX INFO: loaded from: classes4.dex */
public final class C19017 {

    /* JADX INFO: renamed from: ֫ */
    public final Supplier f56683;

    /* JADX INFO: renamed from: ۧ */
    public volatile Object f56684;

    public C19017(Supplier supplier) {
        this.f56683 = supplier;
    }

    /* JADX INFO: renamed from: ֫ */
    public final Object m43193() {
        Object obj = this.f56684;
        if (obj != null) {
            return obj;
        }
        synchronized (this) {
            if (this.f56684 == null) {
                obj = this.f56683.get();
                this.f56684 = obj;
            }
        }
        return obj;
    }
}
