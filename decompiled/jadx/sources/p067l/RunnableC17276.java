package p067l;

/* JADX INFO: renamed from: l.ܺۘۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q64Y */
/* JADX INFO: loaded from: classes4.dex */
public class RunnableC17276 extends AbstractRunnableC22643 implements Runnable {

    /* JADX INFO: renamed from: ᩶ */
    public String f51491;

    public RunnableC17276(C21302 c21302, String str) {
        super(c21302);
        this.f51491 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        String strM50693 = AbstractRunnableC22643.m50693(this.f51491);
        C21302 c21302 = this.f71446;
        AbstractC17043 abstractC17043M50699 = AbstractRunnableC22643.m50699(c21302, strM50693);
        if (m50701(abstractC17043M50699)) {
            str = "550 Invalid name or chroot violation\r\n";
        } else {
            AbstractC17043 abstractC17043M48170 = c21302.m48170();
            if (abstractC17043M48170 == null) {
                str = "550 Rename error, maybe RNFR not sent\r\n";
            } else {
                str = !abstractC17043M48170.mo25502(abstractC17043M50699) ? "550 Error during rename operation\r\n" : null;
            }
        }
        if (str != null) {
            c21302.m48173(str);
        } else {
            c21302.m48173("250 rename successful\r\n");
        }
        c21302.m48157((AbstractC17043) null);
    }
}
