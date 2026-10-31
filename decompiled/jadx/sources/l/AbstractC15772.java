package l;

/* JADX INFO: renamed from: l.ܺۜܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: QBCX */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC15772 extends AbstractC2368 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f48617 = -1;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m37190() {
        return this.f48617 >= 0;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int m37188() {
        int i = this.f48617;
        if (i >= 0) {
            return i;
        }
        throw new RuntimeException("index not yet set");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m37187(int i) {
        if (this.f48617 != -1) {
            throw new RuntimeException("index already set");
        }
        this.f48617 = i;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m37189() {
        return "[" + Integer.toHexString(this.f48617) + ']';
    }
}
