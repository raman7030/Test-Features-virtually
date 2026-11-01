package p067l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۙ֫֡, reason: contains not printable characters */
/* JADX INFO: compiled from: A4E9 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6481 implements InterfaceC3579 {

    /* JADX INFO: renamed from: ۙ */
    public final C9574 f16739;

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ C13187 f16740;

    /* JADX INFO: renamed from: ᩸ */
    public long f16741 = 0;

    /* JADX INFO: renamed from: ᩹ */
    public boolean f16742;

    public AbstractC6481(C13187 c13187) {
        this.f16740 = c13187;
        this.f16739 = new C9574(c13187.f37053.mo6579());
    }

    @Override // p067l.InterfaceC3579
    /* JADX INFO: renamed from: ۢ */
    public final C16989 mo6579() {
        return this.f16739;
    }

    @Override // p067l.InterfaceC3579
    /* JADX INFO: renamed from: ۧ */
    public long mo6580(C14268 c14268, long j) throws IOException {
        try {
            long jMo6580 = this.f16740.f37053.mo6580(c14268, j);
            if (jMo6580 > 0) {
                this.f16741 += jMo6580;
            }
            return jMo6580;
        } catch (IOException e) {
            m14849(false, e);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m14849(boolean z, IOException iOException) {
        C13187 c13187 = this.f16740;
        int i = c13187.f37052;
        if (i == 6) {
            return;
        }
        if (i == 5) {
            C9574 c9574 = this.f16739;
            C16989 c16989M22311 = c9574.m22311();
            c9574.m22304();
            c16989M22311.mo22302();
            c16989M22311.mo22305();
            c13187.f37052 = 6;
            C17208 c17208 = c13187.f37050;
            if (c17208 != null) {
                c17208.m38974(!z, c13187, iOException);
                return;
            }
            return;
        }
        throw new IllegalStateException("state: " + c13187.f37052);
    }
}
