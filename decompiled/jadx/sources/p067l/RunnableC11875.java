package p067l;

/* JADX INFO: renamed from: l.ۤۖۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 156M */
/* JADX INFO: loaded from: classes3.dex */
public class RunnableC11875 extends AbstractRunnableC22643 implements Runnable {

    /* JADX INFO: renamed from: ᩶ */
    public String f33088;

    public RunnableC11875(C21302 c21302, String str) {
        super(c21302);
        this.f33088 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        String strM50693 = AbstractRunnableC22643.m50693(this.f33088);
        int length = strM50693.length();
        C21302 c21302 = this.f71446;
        if (length < 1) {
            str = "550 Invalid name\r\n";
        } else {
            AbstractC17043 abstractC17043M50699 = AbstractRunnableC22643.m50699(c21302, strM50693);
            if (m50701(abstractC17043M50699)) {
                str = "550 Invalid name or chroot violation\r\n";
            } else if (abstractC17043M50699.mo25094()) {
                str = "550 Already exists\r\n";
            } else {
                str = !abstractC17043M50699.mo25497() ? "550 Error making directory (permissions?)\r\n" : null;
            }
        }
        if (str != null) {
            c21302.m48173(str);
        } else {
            c21302.m48173("250 Directory created\r\n");
        }
    }
}
