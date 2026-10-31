package l;

/* JADX INFO: renamed from: l.ۚۘۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: V4YV */
/* JADX INFO: loaded from: classes3.dex */
public class RunnableC5104 extends AbstractRunnableC21333 implements Runnable {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f16007;

    public RunnableC5104(C19922 c19922, String str) {
        super(c19922);
        this.f16007 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String strM48358 = AbstractRunnableC21333.m48358(this.f16007);
        C19922 c19922 = this.f68752;
        c19922.m45860("331 Send password\r\n");
        c19922.m45854(strM48358);
    }
}
