package l;

/* JADX INFO: renamed from: l.ۘۘۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 469D */
/* JADX INFO: loaded from: classes3.dex */
public class C3693 extends AbstractRunnableC21333 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public String f11651;

    public C3693(C19922 c19922, String str) {
        super(c19922);
        this.f11651 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        String strM48358 = AbstractRunnableC21333.m48358(this.f11651);
        C19922 c19922 = this.f68752;
        AbstractC15440 abstractC15440M45852 = c19922.m45852();
        long jMo23127 = 0;
        if (strM48358.contains(AbstractC15440.f47291)) {
            str = "550 No directory traversal allowed in SIZE param\r\n";
        } else {
            AbstractC15440 abstractC15440M36526 = abstractC15440M45852.m36526(strM48358);
            if (m48366(abstractC15440M36526)) {
                str = "550 SIZE target violates chroot\r\n";
            } else if (!abstractC15440M36526.mo23120()) {
                str = "550 Cannot get the SIZE of nonexistent object\r\n";
            } else if (abstractC15440M36526.mo23119()) {
                jMo23127 = abstractC15440M36526.mo23127();
                str = null;
            } else {
                str = "550 Cannot get the size of a non-file\r\n";
            }
        }
        if (str != null) {
            c19922.m45860(str);
            return;
        }
        c19922.m45860("213 " + jMo23127 + "\r\n");
    }
}
