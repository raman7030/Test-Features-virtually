package p067l;

/* JADX INFO: renamed from: l.ۘۘۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 469D */
/* JADX INFO: loaded from: classes3.dex */
public class C5878 extends AbstractRunnableC22643 {

    /* JADX INFO: renamed from: ᩶ */
    public String f14453;

    public C5878(C21302 c21302, String str) {
        super(c21302);
        this.f14453 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        String strM50693 = AbstractRunnableC22643.m50693(this.f14453);
        C21302 c21302 = this.f71446;
        AbstractC17043 abstractC17043M48165 = c21302.m48165();
        long jMo25101 = 0;
        if (strM50693.contains(AbstractC17043.f50420)) {
            str = "550 No directory traversal allowed in SIZE param\r\n";
        } else {
            AbstractC17043 abstractC17043M38684 = abstractC17043M48165.m38684(strM50693);
            if (m50701(abstractC17043M38684)) {
                str = "550 SIZE target violates chroot\r\n";
            } else if (!abstractC17043M38684.mo25094()) {
                str = "550 Cannot get the SIZE of nonexistent object\r\n";
            } else if (abstractC17043M38684.mo25093()) {
                jMo25101 = abstractC17043M38684.mo25101();
                str = null;
            } else {
                str = "550 Cannot get the size of a non-file\r\n";
            }
        }
        if (str != null) {
            c21302.m48173(str);
            return;
        }
        c21302.m48173("213 " + jMo25101 + "\r\n");
    }
}
