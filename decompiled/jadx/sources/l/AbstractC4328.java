package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۙ֫֡, reason: contains not printable characters */
/* JADX INFO: compiled from: A4E9 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4328 implements InterfaceC1274 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7582 f13925;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11384 f13926;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f13927 = 0;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f13928;

    public AbstractC4328(C11384 c11384) {
        this.f13926 = c11384;
        this.f13925 = new C7582(c11384.f34055.mo4333());
    }

    @Override // l.InterfaceC1274
    /* JADX INFO: renamed from: ۢ */
    public final C15384 mo4333() {
        return this.f13925;
    }

    @Override // l.InterfaceC1274
    /* JADX INFO: renamed from: ۧ */
    public long mo4334(C12521 c12521, long j) throws IOException {
        try {
            long jMo4334 = this.f13926.f34055.mo4334(c12521, j);
            if (jMo4334 > 0) {
                this.f13927 += jMo4334;
            }
            return jMo4334;
        } catch (IOException e) {
            m12985(false, e);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m12985(boolean z, IOException iOException) {
        C11384 c11384 = this.f13926;
        int i = c11384.f34054;
        if (i == 6) {
            return;
        }
        if (i == 5) {
            C7582 c7582 = this.f13925;
            C15384 c15384M20334 = c7582.m20334();
            c7582.m20327();
            c15384M20334.mo20325();
            c15384M20334.mo20328();
            c11384.f34054 = 6;
            C15615 c15615 = c11384.f34052;
            if (c15615 != null) {
                c15615.m36808(!z, c11384, iOException);
                return;
            }
            return;
        }
        throw new IllegalStateException("state: " + c11384.f34054);
    }
}
