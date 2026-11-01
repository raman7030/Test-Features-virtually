package p067l;

/* JADX INFO: renamed from: l.ܶۖۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: X5RH */
/* JADX INFO: loaded from: classes4.dex */
public class RunnableC16567 extends AbstractRunnableC22643 implements Runnable {
    public RunnableC16567(C21302 c21302, String str) {
        super(c21302);
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        C21302 c21302 = this.f71446;
        AbstractC17043 abstractC17043M38694 = c21302.m48165().m38694();
        if (abstractC17043M38694 == null) {
            str = "550 Current dir cannot find parent\r\n";
        } else if (m50701(abstractC17043M38694)) {
            str = "550 Invalid name or chroot violation\r\n";
        } else if (!abstractC17043M38694.mo25087()) {
            str = "550 Can't CWD to invalid directory\r\n";
        } else if (abstractC17043M38694.mo29997()) {
            c21302.m48168(abstractC17043M38694);
            str = null;
        } else {
            str = "550 That path is inaccessible\r\n";
        }
        if (str != null) {
            c21302.m48173(str);
        } else {
            c21302.m48173("200 CDUP successful\r\n");
        }
    }
}
