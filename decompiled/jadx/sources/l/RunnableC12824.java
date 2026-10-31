package l;

/* JADX INFO: renamed from: l.۬ۖۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: PALD */
/* JADX INFO: loaded from: classes4.dex */
public class RunnableC12824 extends AbstractRunnableC21333 implements Runnable {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public String f38474;

    public RunnableC12824(C19922 c19922, String str) {
        super(c19922);
        this.f38474 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String strM48358 = AbstractRunnableC21333.m48358(this.f38474);
        C19922 c19922 = this.f68752;
        AbstractC15440 abstractC15440M48364 = AbstractRunnableC21333.m48364(c19922, strM48358);
        if (m48366(abstractC15440M48364)) {
            c19922.m45860("550 Invalid name or chroot violation\r\n");
            return;
        }
        if (abstractC15440M48364.mo23120()) {
            c19922.m45860("213 " + AbstractC2988.m9120(abstractC15440M48364.mo23117()) + "\r\n");
            return;
        }
        c19922.m45860("550 file does not exist\r\n");
    }
}
