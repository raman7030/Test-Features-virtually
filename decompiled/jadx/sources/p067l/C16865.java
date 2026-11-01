package p067l;

/* JADX INFO: renamed from: l.ܶ۬ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 06UY */
/* JADX INFO: loaded from: classes4.dex */
public final class C16865 implements AutoCloseable {

    /* JADX INFO: renamed from: ᩸ */
    public boolean f49952;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C22902 f49953;

    public C16865(C22902 c22902) {
        this.f49953 = c22902;
    }

    public final void flush() {
        synchronized (this.f49953.f72073.f6922) {
            if (this.f49952) {
                throw new IllegalStateException("Recovery append batch is closed");
            }
            ((C17536) this.f49953.f72074).flush();
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f49953.f72073.f6922) {
            if (this.f49952) {
                return;
            }
            this.f49952 = true;
            C22902 c22902 = this.f49953;
            int i = c22902.f72084 - 1;
            c22902.f72084 = i;
            if (i == 0) {
                try {
                    ((C17536) this.f49953.f72074).m39910();
                    if (this.f49953.f72083 != null) {
                        this.f49953.f72083.close();
                    }
                    this.f49953.f72083 = null;
                } catch (Throwable th) {
                    if (this.f49953.f72083 != null) {
                        this.f49953.f72083.close();
                    }
                    this.f49953.f72083 = null;
                    throw th;
                }
            } else {
                ((C17536) this.f49953.f72074).flush();
            }
        }
    }
}
