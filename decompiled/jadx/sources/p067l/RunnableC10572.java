package p067l;

/* JADX INFO: renamed from: l.ۡۘۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 6652 */
/* JADX INFO: loaded from: classes3.dex */
public class RunnableC10572 extends AbstractRunnableC22643 implements Runnable {

    /* JADX INFO: renamed from: ᩶ */
    public String f29273;

    public RunnableC10572(C21302 c21302, String str) {
        super(c21302);
        this.f29273 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        String strM50693 = AbstractRunnableC22643.m50693(this.f29273);
        C21302 c21302 = this.f71446;
        AbstractC17043 abstractC17043M50699 = AbstractRunnableC22643.m50699(c21302, strM50693);
        if (m50701(abstractC17043M50699)) {
            str = "550 Invalid name or chroot violation\r\n";
        } else {
            str = !abstractC17043M50699.mo25094() ? "450 Cannot rename nonexistent file\r\n" : null;
        }
        if (str != null) {
            c21302.m48173(str);
            c21302.m48157((AbstractC17043) null);
        } else {
            c21302.m48173("350 Filename noted, now send RNTO\r\n");
            c21302.m48157(abstractC17043M50699);
        }
    }
}
