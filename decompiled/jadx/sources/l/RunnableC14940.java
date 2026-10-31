package l;

/* JADX INFO: renamed from: l.ܶۖۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: X5RH */
/* JADX INFO: loaded from: classes4.dex */
public class RunnableC14940 extends AbstractRunnableC21333 implements Runnable {
    public RunnableC14940(C19922 c19922, String str) {
        super(c19922);
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        C19922 c19922 = this.f68752;
        AbstractC15440 abstractC15440M36536 = c19922.m45852().m36536();
        if (abstractC15440M36536 == null) {
            str = "550 Current dir cannot find parent\r\n";
        } else if (m48366(abstractC15440M36536)) {
            str = "550 Invalid name or chroot violation\r\n";
        } else if (!abstractC15440M36536.mo23113()) {
            str = "550 Can't CWD to invalid directory\r\n";
        } else if (abstractC15440M36536.mo27936()) {
            c19922.m45855(abstractC15440M36536);
            str = null;
        } else {
            str = "550 That path is inaccessible\r\n";
        }
        if (str != null) {
            c19922.m45860(str);
        } else {
            c19922.m45860("200 CDUP successful\r\n");
        }
    }
}
