package l;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: l.᩷ܽܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: P70I */
/* JADX INFO: loaded from: classes4.dex */
public final class C21000 implements AutoCloseable {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final long f67803;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f67804;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C9047 f67805;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C6888 f67806;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final long f67807;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AtomicBoolean f67808 = new AtomicBoolean(true);

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C12100 f67809;

    public C21000(long j, long j2, long j3, C9047 c9047, C12100 c12100, C6888 c6888) {
        this.f67803 = j;
        this.f67807 = j2;
        this.f67804 = j3;
        this.f67805 = c9047;
        this.f67809 = c12100;
        this.f67806 = c6888;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.f67808.compareAndSet(true, false)) {
            this.f67806.m18657();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C9711 m47818(C23556 c23556) throws Throwable {
        AtomicBoolean atomicBoolean = this.f67808;
        if (atomicBoolean.get()) {
            InterfaceC17066 interfaceC17066M38504 = C16360.m38504(c23556);
            if (interfaceC17066M38504.mo1526()) {
                throw new C23821();
            }
            C9711 c9711 = null;
            try {
                C9711 c9712 = new C9711(this.f67803, this.f67807, this.f67804, this.f67805, this.f67809);
                try {
                    c9712.m24679();
                    if (atomicBoolean.get()) {
                        if (interfaceC17066M38504.mo1526()) {
                            throw new C23821();
                        }
                        return c9712;
                    }
                    throw new IllegalStateException("HexRange VersionHandle is not active");
                } catch (IOException | Error | RuntimeException e) {
                    e = e;
                    c9711 = c9712;
                    if (c9711 != null) {
                        try {
                            c9711.close();
                        } catch (IOException e2) {
                            e.addSuppressed(e2);
                        }
                    }
                    throw e;
                }
            } catch (IOException e3) {
                e = e3;
            } catch (Error e4) {
                e = e4;
            } catch (RuntimeException e5) {
                e = e5;
            }
        } else {
            throw new IllegalStateException("HexRange VersionHandle is not active");
        }
    }
}
