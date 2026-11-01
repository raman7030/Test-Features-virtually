package p067l;

/* JADX INFO: renamed from: l.᩹ۖۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: U5DO */
/* JADX INFO: loaded from: classes.dex */
public class RunnableC23274 extends AbstractRunnableC22643 implements Runnable {

    /* JADX INFO: renamed from: ᩶ */
    public String f73136;

    public RunnableC23274(C21302 c21302, String str) {
        super(c21302);
        this.f73136 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        String strM50693 = AbstractRunnableC22643.m50693(this.f73136);
        C21302 c21302 = this.f71446;
        AbstractC17043 abstractC17043M50699 = AbstractRunnableC22643.m50699(c21302, strM50693);
        if (m50701(abstractC17043M50699)) {
            str = "550 Invalid name or chroot violation\r\n";
        } else if (abstractC17043M50699.mo25087()) {
            str = "550 Can't DELE a directory\r\n";
        } else {
            str = !abstractC17043M50699.mo25503() ? "450 Error deleting file\r\n" : null;
        }
        if (str != null) {
            c21302.m48173(str);
            return;
        }
        c21302.m48173("250 File successfully deleted\r\n");
        int i = C16114.f47424;
        C16114.m36694(abstractC17043M50699.mo25505());
    }
}
