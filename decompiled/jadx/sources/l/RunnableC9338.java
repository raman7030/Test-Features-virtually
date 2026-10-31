package l;

/* JADX INFO: renamed from: l.ۢۘۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: W62A */
/* JADX INFO: loaded from: classes3.dex */
public class RunnableC9338 extends AbstractRunnableC21333 implements Runnable {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public String f28320;

    public RunnableC9338(C19922 c19922, String str) {
        super(c19922);
        this.f28320 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        String strM48358 = AbstractRunnableC21333.m48358(this.f28320);
        int length = strM48358.length();
        C19922 c19922 = this.f68752;
        if (length < 1) {
            str = "550 Invalid argument\r\n";
        } else {
            AbstractC15440 abstractC15440M48364 = AbstractRunnableC21333.m48364(c19922, strM48358);
            if (m48366(abstractC15440M48364)) {
                str = "550 Invalid name or chroot violation\r\n";
            } else if (!abstractC15440M48364.mo23113()) {
                str = "550 Can't RMD a non-directory\r\n";
            } else if (AbstractRunnableC21333.m48365(abstractC15440M48364, c19922.m45865())) {
                str = "550 Won't RMD the root directory\r\n";
            } else {
                str = !abstractC15440M48364.mo23552() ? "550 Deletion error, possibly incomplete\r\n" : null;
            }
        }
        if (str != null) {
            c19922.m45860(str);
        } else {
            c19922.m45860("250 Removed directory\r\n");
        }
    }
}
