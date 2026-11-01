package p067l;

import java.io.IOException;
import java.io.OutputStream;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: l.ۢܽܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: P70I */
/* JADX INFO: loaded from: classes3.dex */
public final class C11598 implements AutoCloseable {

    /* JADX INFO: renamed from: ۗ */
    public final long f32344;

    /* JADX INFO: renamed from: ۙ */
    public final long f32345;

    /* JADX INFO: renamed from: ۤ */
    public final C10967 f32346;

    /* JADX INFO: renamed from: ۫ */
    public final C8915 f32347;

    /* JADX INFO: renamed from: ۬ */
    public final C2919 f32348;

    /* JADX INFO: renamed from: ᩶ */
    public final long f32349;

    /* JADX INFO: renamed from: ᩸ */
    public final AtomicBoolean f32350 = new AtomicBoolean();

    /* JADX INFO: renamed from: ᩹ */
    public final C13868 f32351;

    public C11598(long j, long j2, long j3, C10967 c10967, C13868 c13868) {
        this.f32344 = j;
        this.f32349 = j2;
        this.f32345 = j3;
        this.f32346 = c10967;
        this.f32351 = c13868;
        this.f32347 = new C8915(C21026.m47417(c10967));
        this.f32348 = new C2919(c10967);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m26691(OutputStream outputStream, int i) throws IOException {
        m26693();
        this.f32348.m4764(outputStream, i);
        m26693();
    }

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC20315[] m26692() throws Throwable {
        m26693();
        InterfaceC20315[] interfaceC20315ArrM47417 = C21026.m47417(this.f32346);
        try {
            m26693();
            return interfaceC20315ArrM47417;
        } catch (IOException | Error | RuntimeException e) {
            try {
                C17631.m40151(interfaceC20315ArrM47417);
            } catch (IOException e2) {
                e.addSuppressed(e2);
            }
            throw e;
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.f32350.compareAndSet(false, true)) {
            this.f32347.m20606();
        }
    }

    public final int length() {
        if (!this.f32350.get()) {
            return this.f32348.m4762();
        }
        throw new IllegalStateException("HexRange is closed");
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m26693() {
        if (!this.f32350.get()) {
            for (InterfaceC20315 interfaceC20315 : this.f32347.f24160) {
                if (!interfaceC20315.mo12119()) {
                    throw new C7614();
                }
            }
            return;
        }
        throw new IllegalStateException("HexRange is closed");
    }

    /* JADX INFO: renamed from: ᩳ */
    public final C22327 m26694() {
        AtomicBoolean atomicBoolean = this.f32350;
        if (!atomicBoolean.get()) {
            C8915 c8915 = this.f32347;
            c8915.m20607();
            if (atomicBoolean.get()) {
                c8915.m20606();
                throw new IllegalStateException("HexRange is closed");
            }
            return new C22327(this.f32344, this.f32349, this.f32345, this.f32346, this.f32351, this.f32347);
        }
        throw new IllegalStateException("HexRange is closed");
    }
}
