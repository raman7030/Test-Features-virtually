package p067l;

import java.io.Closeable;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.֡۬ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: OA5R */
/* JADX INFO: loaded from: classes2.dex */
public final class C2777 extends AbstractC4643 implements InterfaceC21234, Closeable {

    /* JADX INFO: renamed from: ۗ */
    public final C11627 f4685;

    /* JADX INFO: renamed from: ۙ */
    public final OutputStream f4686;

    /* JADX INFO: renamed from: ۬ */
    public final C16989 f4687;

    /* JADX INFO: renamed from: ᩶ */
    public final long f4688;

    /* JADX INFO: renamed from: ᩸ */
    public boolean f4689;

    /* JADX INFO: renamed from: ᩹ */
    public final C15545 f4690;

    public C2777(long j, C15545 c15545) {
        C11627 c11627 = new C11627(8192L);
        this.f4685 = c11627;
        InterfaceC12257 interfaceC12257M54977 = C25037.m54977(c11627.m26742());
        this.f4687 = interfaceC12257M54977.mo10980();
        this.f4688 = j;
        this.f4690 = c15545;
        this.f4686 = new C20884(this, j, interfaceC12257M54977);
    }

    /* JADX INFO: renamed from: ܳܽ */
    public final OutputStream m4355() {
        return this.f4686;
    }

    /* JADX INFO: renamed from: ۢ */
    public final C16989 m4354() {
        return this.f4687;
    }

    @Override // p067l.AbstractC4643
    /* JADX INFO: renamed from: ֫ */
    public final long mo4352() {
        return this.f4688;
    }

    public final boolean isClosed() {
        return this.f4689;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f4689) {
            return;
        }
        this.f4689 = true;
        try {
            this.f4685.m26743().close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // p067l.AbstractC4643
    /* JADX INFO: renamed from: ܽ */
    public final C15545 mo4356() {
        return this.f4690;
    }

    @Override // p067l.AbstractC4643
    /* JADX INFO: renamed from: ֫ */
    public final void mo4353(InterfaceC12257 interfaceC12257) {
        C25037.m54976(this.f4685.m26743()).mo14207(interfaceC12257);
    }
}
