package l;

/* JADX INFO: renamed from: l.֡ۘۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: C52M */
/* JADX INFO: loaded from: classes2.dex */
public class RunnableC0164 extends AbstractRunnableC21333 implements Runnable {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f1377;

    public RunnableC0164(C19922 c19922, String str) {
        super(c19922);
        this.f1377 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        String strM48358 = AbstractRunnableC21333.m48358(this.f1377);
        boolean zEquals = strM48358.equals("I");
        C19922 c19922 = this.f68752;
        if (zEquals || strM48358.equals("L 8")) {
            c19922.m45856(true);
            str = "200 Binary type set\r\n";
        } else if (strM48358.equals("A") || strM48358.equals("A N")) {
            c19922.m45856(false);
            str = "200 ASCII type set\r\n";
        } else {
            str = "503 Malformed TYPE command\r\n";
        }
        c19922.m45860(str);
    }
}
