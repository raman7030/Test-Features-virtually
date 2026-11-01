package p067l;

/* JADX INFO: renamed from: l.ۤۖۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6X9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11872 implements AutoCloseable {

    /* JADX INFO: renamed from: ᩸ */
    public C13883 f33086;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C7848 f33087;

    public C11872(C7848 c7848, C13883 c13883) {
        this.f33087 = c7848;
        this.f33086 = c13883;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        C7848 c7848 = this.f33087;
        c7848.f20583.lock();
        try {
            if (this.f33086 != null) {
                c7848.f20581.remove(this.f33086);
                this.f33086 = null;
                c7848.f20582.signalAll();
            }
        } finally {
            c7848.f20583.unlock();
        }
    }
}
