package p067l;

/* JADX INFO: renamed from: l.ۢۘۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: W62A */
/* JADX INFO: loaded from: classes3.dex */
public class RunnableC11243 extends AbstractRunnableC22643 implements Runnable {

    /* JADX INFO: renamed from: ᩶ */
    public String f31270;

    public RunnableC11243(C21302 c21302, String str) {
        super(c21302);
        this.f31270 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        String strM50693 = AbstractRunnableC22643.m50693(this.f31270);
        int length = strM50693.length();
        C21302 c21302 = this.f71446;
        if (length < 1) {
            str = "550 Invalid argument\r\n";
        } else {
            AbstractC17043 abstractC17043M50699 = AbstractRunnableC22643.m50699(c21302, strM50693);
            if (m50701(abstractC17043M50699)) {
                str = "550 Invalid name or chroot violation\r\n";
            } else if (!abstractC17043M50699.mo25087()) {
                str = "550 Can't RMD a non-directory\r\n";
            } else if (AbstractRunnableC22643.m50700(abstractC17043M50699, c21302.m48178())) {
                str = "550 Won't RMD the root directory\r\n";
            } else {
                str = !abstractC17043M50699.mo25503() ? "550 Deletion error, possibly incomplete\r\n" : null;
            }
        }
        if (str != null) {
            c21302.m48173(str);
        } else {
            c21302.m48173("250 Removed directory\r\n");
        }
    }
}
