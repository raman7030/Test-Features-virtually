package l;

import android.graphics.Bitmap;

/* JADX INFO: renamed from: l.᩹ۨۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q6MT */
/* JADX INFO: loaded from: classes.dex */
public final class C22262 implements AutoCloseable {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final int f72233;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21557 f72234;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C22097 f72235;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Bitmap f72236;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f72237;

    public C22262(Bitmap bitmap, C22097 c22097, int i) {
        this.f72236 = bitmap;
        this.f72235 = c22097;
        this.f72233 = i;
        C21557 c21557 = new C21557();
        c21557.f69270 = 1;
        this.f72234 = c21557;
    }

    public C22262(C22262 c22262) {
        this.f72236 = c22262.f72236;
        this.f72235 = c22262.f72235;
        this.f72233 = c22262.f72233;
        this.f72234 = c22262.f72234;
    }

    /* JADX INFO: renamed from: ᩺ۧ, reason: not valid java name and contains not printable characters */
    public final C22262 m49976() {
        C22262 c22262;
        synchronized (this.f72234) {
            if (this.f72237) {
                throw new IllegalStateException("Bitmap handle is closed");
            }
            this.f72234.f69270++;
            c22262 = new C22262(this);
        }
        return c22262;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f72234) {
            if (this.f72237) {
                return;
            }
            this.f72237 = true;
            C21557 c21557 = this.f72234;
            int i = c21557.f69270 - 1;
            c21557.f69270 = i;
            if (i == 0) {
                try {
                    if (!this.f72236.isRecycled()) {
                        this.f72236.recycle();
                    }
                    this.f72235.close();
                } catch (Throwable th) {
                    this.f72235.close();
                    throw th;
                }
            }
        }
    }
}
