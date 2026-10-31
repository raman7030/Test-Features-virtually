package l;

/* JADX INFO: renamed from: l.᩹ۖۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: U5DO */
/* JADX INFO: loaded from: classes.dex */
public class RunnableC21997 extends AbstractRunnableC21333 implements Runnable {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public String f70422;

    public RunnableC21997(C19922 c19922, String str) {
        super(c19922);
        this.f70422 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        String strM48358 = AbstractRunnableC21333.m48358(this.f70422);
        C19922 c19922 = this.f68752;
        AbstractC15440 abstractC15440M48364 = AbstractRunnableC21333.m48364(c19922, strM48358);
        if (m48366(abstractC15440M48364)) {
            str = "550 Invalid name or chroot violation\r\n";
        } else if (abstractC15440M48364.mo23113()) {
            str = "550 Can't DELE a directory\r\n";
        } else {
            str = !abstractC15440M48364.mo23552() ? "450 Error deleting file\r\n" : null;
        }
        if (str != null) {
            c19922.m45860(str);
            return;
        }
        c19922.m45860("250 File successfully deleted\r\n");
        int i = C14463.f44330;
        C14463.m34560(abstractC15440M48364.mo23554());
    }
}
