package p067l;

/* JADX INFO: renamed from: l.ۚۘۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: V4YV */
/* JADX INFO: loaded from: classes3.dex */
public class RunnableC7219 extends AbstractRunnableC22643 implements Runnable {

    /* JADX INFO: renamed from: ᩶ */
    public final String f18841;

    public RunnableC7219(C21302 c21302, String str) {
        super(c21302);
        this.f18841 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String strM50693 = AbstractRunnableC22643.m50693(this.f18841);
        C21302 c21302 = this.f71446;
        c21302.m48173("331 Send password\r\n");
        c21302.m48167(strM50693);
    }
}
