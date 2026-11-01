package p067l;

/* JADX INFO: renamed from: l.ۜۘۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: NANA */
/* JADX INFO: loaded from: classes3.dex */
public class RunnableC8560 extends AbstractRunnableC22643 implements Runnable {

    /* JADX INFO: renamed from: ᩶ */
    public String f22988;

    public RunnableC8560(C21302 c21302, String str) {
        super(c21302);
        this.f22988 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C21302 c21302 = this.f71446;
        try {
            long j = Long.parseLong(AbstractRunnableC22643.m50693(this.f22988));
            if (j < 0) {
                c21302.m48173("550 Restart position must be non-negative\r\n");
                return;
            }
            if (c21302.m48171()) {
                c21302.f67133 = j;
                c21302.f67128 = -1L;
                c21302.m48173("350 Restart position accepted (" + j + ")\r\n");
                return;
            }
            c21302.m48173("550 Restart position not accepted in ASCII mode\r\n");
        } catch (NumberFormatException unused) {
            c21302.m48173("550 No valid restart position\r\n");
        }
    }
}
