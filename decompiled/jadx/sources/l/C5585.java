package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۚ᩶ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: N17O */
/* JADX INFO: loaded from: classes2.dex */
public final class C5585 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f17294;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C19697 f17295;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f17296;

    public C5585(C19697 c19697, int i) {
        this.f17295 = c19697;
        this.f17296 = i;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private void m15865() throws IOException {
        if (this.f17294) {
            throw new IOException("Stream closed");
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m15866(byte[] bArr, int i, int i2) throws IOException {
        int iM45299;
        m15865();
        C19697 c19697 = this.f17295;
        int i3 = this.f17296;
        C13408 c13408 = new C13408(c19697, i3, i2, i, bArr);
        c19697.f63633.lock();
        try {
            if (!c19697.f63631.get()) {
                throw new IOException("Connection closed");
            }
            if (c19697.f63632.mo14298() && C10975.m27284()) {
                try {
                    iM45299 = ((Integer) C1802.f6208.submit(new CallableC13903(1, c13408)).get()).intValue();
                } catch (Throwable th) {
                    C22518.m50482(th);
                    throw null;
                }
            } else {
                iM45299 = C19697.m45299(c19697, i3, i2, i, bArr);
            }
            c19697.f63633.unlock();
            c19697.f63634 = 0L;
            return iM45299;
        } catch (Throwable th2) {
            try {
                C22518.m50482(th2);
                throw null;
            } catch (Throwable th3) {
                c19697.f63633.unlock();
                c19697.f63634 = 0L;
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m15871(byte[] bArr, int i, int i2) throws IOException {
        m15865();
        this.f17295.m45374(this.f17296, bArr, i, i2);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m15872() throws IOException {
        m15865();
        this.f17295.m45382(this.f17296);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m15867() {
        if (this.f17294) {
            return;
        }
        this.f17294 = true;
        this.f17295.m45352(this.f17296);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final long m15873() throws IOException {
        m15865();
        return this.f17295.m45386(this.f17296);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m15868(long j) throws IOException {
        m15865();
        this.f17295.m45353(this.f17296, j);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long m15869() throws IOException {
        m15865();
        return this.f17295.m45370(this.f17296);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m15870(long j) throws IOException {
        m15865();
        this.f17295.m45373(this.f17296, j);
    }
}
