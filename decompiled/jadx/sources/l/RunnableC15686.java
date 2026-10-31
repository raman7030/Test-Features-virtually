package l;

/* JADX INFO: renamed from: l.ܺۘۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q64Y */
/* JADX INFO: loaded from: classes4.dex */
public class RunnableC15686 extends AbstractRunnableC21333 implements Runnable {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public String f48353;

    public RunnableC15686(C19922 c19922, String str) {
        super(c19922);
        this.f48353 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        String strM48358 = AbstractRunnableC21333.m48358(this.f48353);
        C19922 c19922 = this.f68752;
        AbstractC15440 abstractC15440M48364 = AbstractRunnableC21333.m48364(c19922, strM48358);
        if (m48366(abstractC15440M48364)) {
            str = "550 Invalid name or chroot violation\r\n";
        } else {
            AbstractC15440 abstractC15440M45857 = c19922.m45857();
            if (abstractC15440M45857 == null) {
                str = "550 Rename error, maybe RNFR not sent\r\n";
            } else {
                str = !abstractC15440M45857.mo23551(abstractC15440M48364) ? "550 Error during rename operation\r\n" : null;
            }
        }
        if (str != null) {
            c19922.m45860(str);
        } else {
            c19922.m45860("250 rename successful\r\n");
        }
        c19922.m45844((AbstractC15440) null);
    }
}
