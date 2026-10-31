package l;

/* JADX INFO: renamed from: l.ۤۖۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6X9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10000 implements AutoCloseable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C12116 f30126;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5766 f30127;

    public C10000(C5766 c5766, C12116 c12116) {
        this.f30127 = c5766;
        this.f30126 = c12116;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        C5766 c5766 = this.f30127;
        c5766.f17735.lock();
        try {
            if (this.f30126 != null) {
                c5766.f17733.remove(this.f30126);
                this.f30126 = null;
                c5766.f17734.signalAll();
            }
        } finally {
            c5766.f17735.unlock();
        }
    }
}
