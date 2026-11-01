package p067l;

/* JADX INFO: renamed from: l.ۧۘۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: J57T */
/* JADX INFO: loaded from: classes4.dex */
public class RunnableC12584 extends AbstractRunnableC22643 implements Runnable {

    /* JADX INFO: renamed from: ᩶ */
    public String f35352;

    public RunnableC12584(C21302 c21302, String str) {
        super(c21302);
        this.f35352 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String strM50693 = AbstractRunnableC22643.m50693(this.f35352);
        C21302 c21302 = this.f71446;
        String strM48177 = c21302.m48177();
        if (strM48177 == null) {
            c21302.m48173("503 Must send USER first\r\n");
            return;
        }
        if (strM48177.equals("anonymous") && C16606.m37620()) {
            c21302.m48173("230 Guest login ok, read only access.\r\n");
            return;
        }
        if (C16606.m37621(strM48177, strM50693)) {
            c21302.m48173("230 Access granted\r\n");
            c21302.m48158(true);
        } else {
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException unused) {
            }
            c21302.m48173("530 Login incorrect.\r\n");
            c21302.m48158(false);
        }
    }
}
