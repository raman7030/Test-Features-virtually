package l;

/* JADX INFO: renamed from: l.ܿۘۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: I65P */
/* JADX INFO: loaded from: classes5.dex */
public class RunnableC17098 extends AbstractRunnableC21333 implements Runnable {
    public RunnableC17098(C19922 c19922, String str) {
        super(c19922);
    }

    @Override // java.lang.Runnable
    public final void run() {
        C19922 c19922 = this.f68752;
        try {
            String strMo23544 = c19922.m45852().mo23544();
            AbstractC15440 abstractC15440M45865 = c19922.m45865();
            if (abstractC15440M45865 != null) {
                strMo23544 = strMo23544.substring(abstractC15440M45865.mo23544().length());
            }
            if (strMo23544.length() == 0) {
                strMo23544 = "/";
            }
            c19922.m45860("257 \"" + strMo23544 + "\"\r\n");
        } catch (Exception unused) {
            c19922.m45853();
        }
    }
}
