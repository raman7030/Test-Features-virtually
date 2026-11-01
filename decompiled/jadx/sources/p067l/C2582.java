package p067l;

import java.io.Closeable;
import java.util.Arrays;

/* JADX INFO: renamed from: l.֡ۛۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 2AQI */
/* JADX INFO: loaded from: classes2.dex */
public final class C2582 implements Closeable {

    /* JADX INFO: renamed from: ᩶ */
    public volatile int f4264;

    /* JADX INFO: renamed from: ᩸ */
    public Object[] f4265;

    /* JADX INFO: renamed from: ᩹ */
    public boolean f4266;

    /* JADX INFO: renamed from: ֫ */
    public final synchronized boolean m3890(Object obj) {
        if (this.f4266) {
            return false;
        }
        if (this.f4264 < this.f4265.length) {
            synchronized (this) {
                int i = this.f4264;
                Object[] objArr = this.f4265;
                if (i < objArr.length) {
                    int i2 = this.f4264;
                    this.f4264 = i2 + 1;
                    objArr[i2] = obj;
                }
            }
            return true;
        }
        return false;
    }

    public C2582() {
        this((int) (C19110.f57020 * 1.5f));
    }

    public C2582(int i) {
        this.f4265 = new Object[i];
    }

    /* JADX INFO: renamed from: ᩳ */
    public final Object m3892() {
        if (this.f4264 > 0) {
            synchronized (this) {
                if (this.f4264 > 0) {
                    int i = this.f4264 - 1;
                    this.f4264 = i;
                    Object[] objArr = this.f4265;
                    Object obj = objArr[i];
                    objArr[i] = null;
                    return obj;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m3889() {
        return !this.f4266 && this.f4264 < this.f4265.length;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m3891() {
        synchronized (this) {
            Arrays.fill(this.f4265, (Object) null);
            this.f4264 = 0;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f4266 = true;
    }
}
