package p067l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۚ᩶ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: N17O */
/* JADX INFO: loaded from: classes2.dex */
public final class C7677 {

    /* JADX INFO: renamed from: ֫ */
    public boolean f20134;

    /* JADX INFO: renamed from: ۧ */
    public final C21089 f20135;

    /* JADX INFO: renamed from: ܽ */
    public final int f20136;

    public C7677(C21089 c21089, int i) {
        this.f20135 = c21089;
        this.f20136 = i;
    }

    /* JADX INFO: renamed from: ܿ */
    private void m17780() throws IOException {
        if (this.f20134) {
            throw new IOException("Stream closed");
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m17781(byte[] bArr, int i, int i2) throws IOException {
        int iM47596;
        m17780();
        C21089 c21089 = this.f20135;
        int i3 = this.f20136;
        C15112 c15112 = new C15112(c21089, i3, i2, i, bArr);
        c21089.f66254.lock();
        try {
            if (!c21089.f66252.get()) {
                throw new IOException("Connection closed");
            }
            if (c21089.f66253.mo16195() && C12799.m29346()) {
                try {
                    iM47596 = ((Integer) C4081.f8987.submit(new CallableC15582(1, c15112)).get()).intValue();
                } catch (Throwable th) {
                    C23770.m52824(th);
                    throw null;
                }
            } else {
                iM47596 = C21089.m47596(c21089, i3, i2, i, bArr);
            }
            c21089.f66254.unlock();
            c21089.f66255 = 0L;
            return iM47596;
        } catch (Throwable th2) {
            try {
                C23770.m52824(th2);
                throw null;
            } catch (Throwable th3) {
                c21089.f66254.unlock();
                c21089.f66255 = 0L;
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m17786(byte[] bArr, int i, int i2) throws IOException {
        m17780();
        this.f20135.m47671(this.f20136, bArr, i, i2);
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m17787() throws IOException {
        m17780();
        this.f20135.m47679(this.f20136);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m17782() {
        if (this.f20134) {
            return;
        }
        this.f20134 = true;
        this.f20135.m47649(this.f20136);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final long m17788() throws IOException {
        m17780();
        return this.f20135.m47683(this.f20136);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m17783(long j) throws IOException {
        m17780();
        this.f20135.m47650(this.f20136, j);
    }

    /* JADX INFO: renamed from: ۧ */
    public final long m17784() throws IOException {
        m17780();
        return this.f20135.m47667(this.f20136);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m17785(long j) throws IOException {
        m17780();
        this.f20135.m47670(this.f20136, j);
    }
}
