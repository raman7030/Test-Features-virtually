package p067l;

/* JADX INFO: renamed from: l.۬ۖۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: PALD */
/* JADX INFO: loaded from: classes4.dex */
public class RunnableC14556 extends AbstractRunnableC22643 implements Runnable {

    /* JADX INFO: renamed from: ᩶ */
    public String f41517;

    public RunnableC14556(C21302 c21302, String str) {
        super(c21302);
        this.f41517 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String strM50693 = AbstractRunnableC22643.m50693(this.f41517);
        C21302 c21302 = this.f71446;
        AbstractC17043 abstractC17043M50699 = AbstractRunnableC22643.m50699(c21302, strM50693);
        if (m50701(abstractC17043M50699)) {
            c21302.m48173("550 Invalid name or chroot violation\r\n");
            return;
        }
        if (abstractC17043M50699.mo25094()) {
            c21302.m48173("213 " + AbstractC5208.m11171(abstractC17043M50699.mo25091()) + "\r\n");
            return;
        }
        c21302.m48173("550 file does not exist\r\n");
    }
}
