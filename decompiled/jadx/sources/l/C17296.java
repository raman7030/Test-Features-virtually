package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ܿۧ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: U4FJ */
/* JADX INFO: loaded from: classes5.dex */
public final class C17296 extends AbstractC13931 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14473 f52996;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f52997;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public long f52998;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17296(C14473 c14473, InterfaceC1274 interfaceC1274) {
        super(interfaceC1274);
        this.f52996 = c14473;
        this.f52997 = false;
        this.f52998 = 0L;
    }

    @Override // l.AbstractC13931, l.InterfaceC1274
    /* JADX INFO: renamed from: ۧ */
    public final long mo4334(C12521 c12521, long j) throws IOException {
        try {
            long jMo4334 = m33365().mo4334(c12521, 8192L);
            if (jMo4334 > 0) {
                this.f52998 += jMo4334;
            }
            return jMo4334;
        } catch (IOException e) {
            if (!this.f52997) {
                this.f52997 = true;
                C14473 c14473 = this.f52996;
                c14473.f44355.m36808(false, (InterfaceC19145) c14473, e);
            }
            throw e;
        }
    }

    @Override // l.AbstractC13931, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        super.close();
        if (this.f52997) {
            return;
        }
        this.f52997 = true;
        C14473 c14473 = this.f52996;
        c14473.f44355.m36808(false, (InterfaceC19145) c14473, (IOException) null);
    }
}
