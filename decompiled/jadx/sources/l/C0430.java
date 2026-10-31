package l;

import java.io.Closeable;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.֡۬ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: OA5R */
/* JADX INFO: loaded from: classes2.dex */
public final class C0430 extends AbstractC2393 implements InterfaceC19851, Closeable {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C9742 f1909;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final OutputStream f1910;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C15384 f1911;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final long f1912;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f1913;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C13864 f1914;

    public C0430(long j, C13864 c13864) {
        C9742 c9742 = new C9742(8192L);
        this.f1909 = c9742;
        InterfaceC10405 interfaceC10405M52568 = C23852.m52568(c9742.m24728());
        this.f1911 = interfaceC10405M52568.mo8912();
        this.f1912 = j;
        this.f1914 = c13864;
        this.f1910 = new C19482(this, j, interfaceC10405M52568);
    }

    /* JADX INFO: renamed from: ܳܽ, reason: not valid java name and contains not printable characters */
    public final OutputStream m1979() {
        return this.f1910;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C15384 m1978() {
        return this.f1911;
    }

    @Override // l.AbstractC2393
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long mo1976() {
        return this.f1912;
    }

    public final boolean isClosed() {
        return this.f1913;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f1913) {
            return;
        }
        this.f1913 = true;
        try {
            this.f1909.m24729().close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // l.AbstractC2393
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C13864 mo1980() {
        return this.f1914;
    }

    @Override // l.AbstractC2393
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo1977(InterfaceC10405 interfaceC10405) {
        C23852.m52567(this.f1909.m24729()).mo12302(interfaceC10405);
    }
}
