package p067l;

/* JADX INFO: renamed from: l.ܺۜܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: QBCX */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC17358 extends AbstractC4619 {

    /* JADX INFO: renamed from: ᩸ */
    public int f51756 = -1;

    /* JADX INFO: renamed from: ᩻ */
    public final boolean m39360() {
        return this.f51756 >= 0;
    }

    /* JADX INFO: renamed from: ܿ */
    public final int m39358() {
        int i = this.f51756;
        if (i >= 0) {
            return i;
        }
        throw new RuntimeException("index not yet set");
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m39357(int i) {
        if (this.f51756 != -1) {
            throw new RuntimeException("index already set");
        }
        this.f51756 = i;
    }

    /* JADX INFO: renamed from: ᩷ */
    public final String m39359() {
        return "[" + Integer.toHexString(this.f51756) + ']';
    }
}
