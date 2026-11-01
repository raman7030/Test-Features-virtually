package p067l;

/* JADX INFO: renamed from: l.۬᩸ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: D77D */
/* JADX INFO: loaded from: classes3.dex */
public final class C15091 {

    /* JADX INFO: renamed from: ֫ */
    public final C15581 f43077;

    /* JADX INFO: renamed from: ۧ */
    public final C15581 f43078;

    public C15091(C15581 c15581, C15581 c15582) {
        this.f43077 = c15581;
        this.f43078 = c15582;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C15091) {
            C15091 c15091 = (C15091) obj;
            if (this.f43077 == c15091.f43077 && this.f43078 == c15091.f43078) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f43078) + (System.identityHashCode(this.f43077) * 31);
    }
}
