package l;

/* JADX INFO: renamed from: l.ۜۘۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: NANA */
/* JADX INFO: loaded from: classes3.dex */
public class RunnableC6515 extends AbstractRunnableC21333 implements Runnable {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public String f20110;

    public RunnableC6515(C19922 c19922, String str) {
        super(c19922);
        this.f20110 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C19922 c19922 = this.f68752;
        try {
            long j = Long.parseLong(AbstractRunnableC21333.m48358(this.f20110));
            if (j < 0) {
                c19922.m45860("550 Restart position must be non-negative\r\n");
                return;
            }
            if (c19922.m45858()) {
                c19922.f64496 = j;
                c19922.f64491 = -1L;
                c19922.m45860("350 Restart position accepted (" + j + ")\r\n");
                return;
            }
            c19922.m45860("550 Restart position not accepted in ASCII mode\r\n");
        } catch (NumberFormatException unused) {
            c19922.m45860("550 No valid restart position\r\n");
        }
    }
}
