package p067l;

/* JADX INFO: renamed from: l.᩶ۢۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 54F8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC21454 {

    /* JADX INFO: renamed from: ۧ */
    public boolean f67662 = false;

    /* JADX INFO: renamed from: ܽ */
    public C9383 f67663 = null;

    /* JADX INFO: renamed from: ֫ */
    public AbstractC21178 f67661 = null;

    /* JADX INFO: renamed from: ֫ */
    public void mo11615(C9383 c9383, AbstractC21178 abstractC21178) {
        this.f67663 = c9383;
        this.f67661 = abstractC21178;
        if (abstractC21178.f66553 > 0) {
            this.f67662 = true;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m48591() {
        return this.f67662;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m48590(boolean z) {
        this.f67662 = z;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m48589(C10054 c10054) throws C14392 {
        if (this.f67662) {
            this.f67661.f66547 = -1;
        }
        this.f67663.m21845(c10054);
        if (this.f67662) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j = this.f67661.f66553;
            while (this.f67661.m47800() && this.f67661.f66547 == -1) {
                try {
                    Thread.sleep(10L);
                } catch (Exception unused) {
                }
                if (j > 0 && System.currentTimeMillis() - jCurrentTimeMillis > j) {
                    this.f67661.f66547 = 0;
                    throw new C14392("channel request: timeout");
                }
            }
            if (this.f67661.f66547 == 0) {
                throw new C14392("failed to send channel request");
            }
        }
    }
}
