package l;

/* JADX INFO: renamed from: l.᩶ۢۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 54F8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC20082 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f65022 = false;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C7381 f65023 = null;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public AbstractC19791 f65021 = null;

    /* JADX INFO: renamed from: ֫ */
    public void mo9572(C7381 c7381, AbstractC19791 abstractC19791) {
        this.f65023 = c7381;
        this.f65021 = abstractC19791;
        if (abstractC19791.f63916 > 0) {
            this.f65022 = true;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m46275() {
        return this.f65022;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m46274(boolean z) {
        this.f65022 = z;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m46273(C8087 c8087) throws C12651 {
        if (this.f65022) {
            this.f65021.f63910 = -1;
        }
        this.f65023.m19872(c8087);
        if (this.f65022) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j = this.f65021.f63916;
            while (this.f65021.m45489() && this.f65021.f63910 == -1) {
                try {
                    Thread.sleep(10L);
                } catch (Exception unused) {
                }
                if (j > 0 && System.currentTimeMillis() - jCurrentTimeMillis > j) {
                    this.f65021.f63910 = 0;
                    throw new C12651("channel request: timeout");
                }
            }
            if (this.f65021.f63910 == 0) {
                throw new C12651("failed to send channel request");
            }
        }
    }
}
