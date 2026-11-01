package p067l;

import java.io.Serializable;

/* JADX INFO: renamed from: l.ۖ۠᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: LAXL */
/* JADX INFO: loaded from: classes2.dex */
public final class C4663 implements Serializable {

    /* JADX INFO: renamed from: ᩸ */
    public final Throwable f10482;

    public C4663(Throwable th) {
        C13045.m29867(th, "exception");
        this.f10482 = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C4663) {
            return C13045.m29864(this.f10482, ((C4663) obj).f10482);
        }
        return false;
    }

    public final int hashCode() {
        return this.f10482.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f10482 + ')';
    }
}
