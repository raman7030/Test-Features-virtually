package p067l;

/* JADX INFO: renamed from: l.ᩴܰܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: C5GL */
/* JADX INFO: loaded from: classes4.dex */
public final class C20238 {

    /* JADX INFO: renamed from: ֫ */
    public C19644 f62564;

    /* JADX INFO: renamed from: ۧ */
    public Object f62565;

    /* JADX INFO: renamed from: ֫ */
    public final synchronized boolean m45719() {
        return this.f62565 != null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized boolean m45720(Object obj, C19644 c19644) {
        return this.f62565 == obj && this.f62564 == c19644;
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized boolean m45721(C19644 c19644) {
        return this.f62565 != null && this.f62564 == c19644;
    }

    /* JADX INFO: renamed from: ۧ */
    public final synchronized void m45722(Object obj, C19644 c19644) {
        if (m45720(obj, c19644)) {
            this.f62565 = null;
            this.f62564 = null;
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final synchronized boolean m45723(Object obj, C19644 c19644) {
        if (this.f62565 != null) {
            return false;
        }
        this.f62565 = obj;
        this.f62564 = c19644;
        return true;
    }
}
