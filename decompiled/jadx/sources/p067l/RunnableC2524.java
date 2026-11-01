package p067l;

/* JADX INFO: renamed from: l.֡ۘۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: C52M */
/* JADX INFO: loaded from: classes2.dex */
public class RunnableC2524 extends AbstractRunnableC22643 implements Runnable {

    /* JADX INFO: renamed from: ᩶ */
    public final String f4151;

    public RunnableC2524(C21302 c21302, String str) {
        super(c21302);
        this.f4151 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        String strM50693 = AbstractRunnableC22643.m50693(this.f4151);
        boolean zEquals = strM50693.equals("I");
        C21302 c21302 = this.f71446;
        if (zEquals || strM50693.equals("L 8")) {
            c21302.m48169(true);
            str = "200 Binary type set\r\n";
        } else if (strM50693.equals("A") || strM50693.equals("A N")) {
            c21302.m48169(false);
            str = "200 ASCII type set\r\n";
        } else {
            str = "503 Malformed TYPE command\r\n";
        }
        c21302.m48173(str);
    }
}
