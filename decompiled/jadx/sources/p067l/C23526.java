package p067l;

import android.graphics.Bitmap;

/* JADX INFO: renamed from: l.᩹ۨۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q6MT */
/* JADX INFO: loaded from: classes.dex */
public final class C23526 implements AutoCloseable {

    /* JADX INFO: renamed from: ۗ */
    public final int f74957;

    /* JADX INFO: renamed from: ۙ */
    public final C22856 f74958;

    /* JADX INFO: renamed from: ᩶ */
    public final C23369 f74959;

    /* JADX INFO: renamed from: ᩸ */
    public final Bitmap f74960;

    /* JADX INFO: renamed from: ᩹ */
    public boolean f74961;

    public C23526(Bitmap bitmap, C23369 c23369, int i) {
        this.f74960 = bitmap;
        this.f74959 = c23369;
        this.f74957 = i;
        C22856 c22856 = new C22856();
        c22856.f71972 = 1;
        this.f74958 = c22856;
    }

    public C23526(C23526 c23526) {
        this.f74960 = c23526.f74960;
        this.f74959 = c23526.f74959;
        this.f74957 = c23526.f74957;
        this.f74958 = c23526.f74958;
    }

    /* JADX INFO: renamed from: ᩺ۧ */
    public final C23526 m52304() {
        C23526 c23526;
        synchronized (this.f74958) {
            if (this.f74961) {
                throw new IllegalStateException("Bitmap handle is closed");
            }
            this.f74958.f71972++;
            c23526 = new C23526(this);
        }
        return c23526;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f74958) {
            if (this.f74961) {
                return;
            }
            this.f74961 = true;
            C22856 c22856 = this.f74958;
            int i = c22856.f71972 - 1;
            c22856.f71972 = i;
            if (i == 0) {
                try {
                    if (!this.f74960.isRecycled()) {
                        this.f74960.recycle();
                    }
                    this.f74959.close();
                } catch (Throwable th) {
                    this.f74959.close();
                    throw th;
                }
            }
        }
    }
}
