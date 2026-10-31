package l;

/* JADX INFO: renamed from: l.ۤۖۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 156M */
/* JADX INFO: loaded from: classes3.dex */
public class RunnableC10003 extends AbstractRunnableC21333 implements Runnable {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public String f30128;

    public RunnableC10003(C19922 c19922, String str) {
        super(c19922);
        this.f30128 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        String strM48358 = AbstractRunnableC21333.m48358(this.f30128);
        int length = strM48358.length();
        C19922 c19922 = this.f68752;
        if (length < 1) {
            str = "550 Invalid name\r\n";
        } else {
            AbstractC15440 abstractC15440M48364 = AbstractRunnableC21333.m48364(c19922, strM48358);
            if (m48366(abstractC15440M48364)) {
                str = "550 Invalid name or chroot violation\r\n";
            } else if (abstractC15440M48364.mo23120()) {
                str = "550 Already exists\r\n";
            } else {
                str = !abstractC15440M48364.mo23546() ? "550 Error making directory (permissions?)\r\n" : null;
            }
        }
        if (str != null) {
            c19922.m45860(str);
        } else {
            c19922.m45860("250 Directory created\r\n");
        }
    }
}
