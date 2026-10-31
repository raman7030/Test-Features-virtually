package l;

import android.os.Looper;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: l.ۗ᩺ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: P6N0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3544 implements AutoCloseable {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final List f11252;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f11253;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f11254;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final File f11255;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final Executor f11256;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final synchronized void m10763() {
        if (this.f11254) {
            throw new IllegalStateException("Image export already closed");
        }
        this.f11253 = true;
    }

    public C3544(ArrayList arrayList, File file, Executor executor) {
        this.f11252 = C20195.unmodifiableList(new ArrayList(arrayList));
        this.f11255 = file;
        this.f11256 = executor;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final List m10762() {
        return this.f11252;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            if (this.f11254) {
                return;
            }
            this.f11254 = true;
            if (!this.f11253 && this.f11255 != null) {
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    this.f11256.execute(new RunnableC22511(3, this));
                } else {
                    C13421.m32440(this.f11255);
                }
            }
        }
    }
}
