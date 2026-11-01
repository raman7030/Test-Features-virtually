package p067l;

import android.os.Looper;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: l.ۗ᩺ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: P6N0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5737 implements AutoCloseable {

    /* JADX INFO: renamed from: ۗ */
    public final List f14058;

    /* JADX INFO: renamed from: ۙ */
    public boolean f14059;

    /* JADX INFO: renamed from: ᩶ */
    public boolean f14060;

    /* JADX INFO: renamed from: ᩸ */
    public final File f14061;

    /* JADX INFO: renamed from: ᩹ */
    public final Executor f14062;

    /* JADX INFO: renamed from: ܽ */
    public final synchronized void m12744() {
        if (this.f14060) {
            throw new IllegalStateException("Image export already closed");
        }
        this.f14059 = true;
    }

    public C5737(ArrayList arrayList, File file, Executor executor) {
        this.f14058 = C21562.unmodifiableList(new ArrayList(arrayList));
        this.f14061 = file;
        this.f14062 = executor;
    }

    /* JADX INFO: renamed from: ֫ */
    public final List m12743() {
        return this.f14058;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            if (this.f14060) {
                return;
            }
            this.f14060 = true;
            if (!this.f14059 && this.f14061 != null) {
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    this.f14062.execute(new RunnableC23763(3, this));
                } else {
                    C15124.m34542(this.f14061);
                }
            }
        }
    }
}
