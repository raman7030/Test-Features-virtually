package p067l;

/* JADX INFO: renamed from: l.᩸ۖۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: H5N1 */
/* JADX INFO: loaded from: classes5.dex */
public class RunnableC22604 extends AbstractRunnableC22643 implements Runnable {

    /* JADX INFO: renamed from: ᩶ */
    public String f71347;

    public RunnableC22604(C21302 c21302, String str) {
        super(c21302);
        this.f71347 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String strM50693 = AbstractRunnableC22643.m50693(this.f71347);
        C21302 c21302 = this.f71446;
        AbstractC17043 abstractC17043M50699 = AbstractRunnableC22643.m50699(c21302, strM50693);
        if (m50701(abstractC17043M50699)) {
            c21302.m48173("550 Invalid name or chroot violation\r\n");
            return;
        }
        if (!abstractC17043M50699.mo25087()) {
            c21302.m48173("550 Can't CWD to invalid directory\r\n");
        } else if (abstractC17043M50699.mo29997()) {
            c21302.m48168(abstractC17043M50699);
            c21302.m48173("250 CWD successful\r\n");
        } else {
            c21302.m48173("550 That path is inaccessible\r\n");
        }
    }
}
