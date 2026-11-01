package p067l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ܿۧ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: U4FJ */
/* JADX INFO: loaded from: classes5.dex */
public final class C18806 extends AbstractC15608 {

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ C16123 f56177;

    /* JADX INFO: renamed from: ᩶ */
    public boolean f56178;

    /* JADX INFO: renamed from: ᩹ */
    public long f56179;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18806(C16123 c16123, InterfaceC3579 interfaceC3579) {
        super(interfaceC3579);
        this.f56177 = c16123;
        this.f56178 = false;
        this.f56179 = 0L;
    }

    @Override // p067l.AbstractC15608, p067l.InterfaceC3579
    /* JADX INFO: renamed from: ۧ */
    public final long mo6580(C14268 c14268, long j) throws IOException {
        try {
            long jMo6580 = m35484().mo6580(c14268, 8192L);
            if (jMo6580 > 0) {
                this.f56179 += jMo6580;
            }
            return jMo6580;
        } catch (IOException e) {
            if (!this.f56178) {
                this.f56178 = true;
                C16123 c16123 = this.f56177;
                c16123.f47456.m38974(false, (InterfaceC20563) c16123, e);
            }
            throw e;
        }
    }

    @Override // p067l.AbstractC15608, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        super.close();
        if (this.f56178) {
            return;
        }
        this.f56178 = true;
        C16123 c16123 = this.f56177;
        c16123.f47456.m38974(false, (InterfaceC20563) c16123, (IOException) null);
    }
}
