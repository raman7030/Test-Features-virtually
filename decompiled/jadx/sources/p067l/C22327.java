package p067l;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: l.᩷ܽܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: P70I */
/* JADX INFO: loaded from: classes4.dex */
public final class C22327 implements AutoCloseable {

    /* JADX INFO: renamed from: ۗ */
    public final long f70488;

    /* JADX INFO: renamed from: ۙ */
    public final long f70489;

    /* JADX INFO: renamed from: ۫ */
    public final C10967 f70490;

    /* JADX INFO: renamed from: ۬ */
    public final C8915 f70491;

    /* JADX INFO: renamed from: ᩶ */
    public final long f70492;

    /* JADX INFO: renamed from: ᩸ */
    public final AtomicBoolean f70493 = new AtomicBoolean(true);

    /* JADX INFO: renamed from: ᩹ */
    public final C13868 f70494;

    public C22327(long j, long j2, long j3, C10967 c10967, C13868 c13868, C8915 c8915) {
        this.f70488 = j;
        this.f70492 = j2;
        this.f70489 = j3;
        this.f70490 = c10967;
        this.f70494 = c13868;
        this.f70491 = c8915;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.f70493.compareAndSet(true, false)) {
            this.f70491.m20606();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C11598 m50148(C24756 c24756) throws Throwable {
        AtomicBoolean atomicBoolean = this.f70493;
        if (atomicBoolean.get()) {
            InterfaceC18588 interfaceC18588M40721 = C17917.m40721(c24756);
            if (interfaceC18588M40721.mo3924()) {
                throw new C25008();
            }
            C11598 c11598 = null;
            try {
                C11598 c11599 = new C11598(this.f70488, this.f70492, this.f70489, this.f70490, this.f70494);
                try {
                    c11599.m26693();
                    if (atomicBoolean.get()) {
                        if (interfaceC18588M40721.mo3924()) {
                            throw new C25008();
                        }
                        return c11599;
                    }
                    throw new IllegalStateException("HexRange VersionHandle is not active");
                } catch (IOException | Error | RuntimeException e) {
                    e = e;
                    c11598 = c11599;
                    if (c11598 != null) {
                        try {
                            c11598.close();
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
