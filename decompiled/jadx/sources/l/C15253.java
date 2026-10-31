package l;

/* JADX INFO: renamed from: l.ܶ۬ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 06UY */
/* JADX INFO: loaded from: classes4.dex */
public final class C15253 implements AutoCloseable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f46828;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21605 f46829;

    public C15253(C21605 c21605) {
        this.f46829 = c21605;
    }

    public final void flush() {
        synchronized (this.f46829.f69370.f4153) {
            if (this.f46828) {
                throw new IllegalStateException("Recovery append batch is closed");
            }
            ((C15959) this.f46829.f69371).flush();
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f46829.f69370.f4153) {
            if (this.f46828) {
                return;
            }
            this.f46828 = true;
            C21605 c21605 = this.f46829;
            int i = c21605.f69381 - 1;
            c21605.f69381 = i;
            if (i == 0) {
                try {
                    ((C15959) this.f46829.f69371).m37735();
                    if (this.f46829.f69380 != null) {
                        this.f46829.f69380.close();
                    }
                    this.f46829.f69380 = null;
                } catch (Throwable th) {
                    if (this.f46829.f69380 != null) {
                        this.f46829.f69380.close();
                    }
                    this.f46829.f69380 = null;
                    throw th;
                }
            } else {
                ((C15959) this.f46829.f69371).flush();
            }
        }
    }
}
