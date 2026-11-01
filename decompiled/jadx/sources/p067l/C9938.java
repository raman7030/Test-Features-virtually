package p067l;

import android.graphics.Bitmap;

/* JADX INFO: renamed from: l.۠ۚۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: B75R */
/* JADX INFO: loaded from: classes3.dex */
public final class C9938 implements AutoCloseable {

    /* JADX INFO: renamed from: ᩸ */
    public Bitmap f27520;

    /* JADX INFO: renamed from: ֫ */
    public final void m23236(Bitmap bitmap) {
        if (this.f27520 != null) {
            throw new IllegalStateException("MPEG-TS preview bitmap is already owned");
        }
        this.f27520 = bitmap;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m23237() {
        return this.f27520 != null;
    }

    public final Bitmap take() {
        Bitmap bitmap = this.f27520;
        C12826.requireNonNull(bitmap);
        this.f27520 = null;
        return bitmap;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        Bitmap bitmap = this.f27520;
        this.f27520 = null;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        bitmap.recycle();
    }
}
