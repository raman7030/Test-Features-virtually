package l;

/* JADX INFO: renamed from: l.ۡۘۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 6652 */
/* JADX INFO: loaded from: classes3.dex */
public class RunnableC8632 extends AbstractRunnableC21333 implements Runnable {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public String f26355;

    public RunnableC8632(C19922 c19922, String str) {
        super(c19922);
        this.f26355 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        String strM48358 = AbstractRunnableC21333.m48358(this.f26355);
        C19922 c19922 = this.f68752;
        AbstractC15440 abstractC15440M48364 = AbstractRunnableC21333.m48364(c19922, strM48358);
        if (m48366(abstractC15440M48364)) {
            str = "550 Invalid name or chroot violation\r\n";
        } else {
            str = !abstractC15440M48364.mo23120() ? "450 Cannot rename nonexistent file\r\n" : null;
        }
        if (str != null) {
            c19922.m45860(str);
            c19922.m45844((AbstractC15440) null);
        } else {
            c19922.m45860("350 Filename noted, now send RNTO\r\n");
            c19922.m45844(abstractC15440M48364);
        }
    }
}
