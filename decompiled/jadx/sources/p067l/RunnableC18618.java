package p067l;

/* JADX INFO: renamed from: l.ܿۘۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: I65P */
/* JADX INFO: loaded from: classes5.dex */
public class RunnableC18618 extends AbstractRunnableC22643 implements Runnable {
    public RunnableC18618(C21302 c21302, String str) {
        super(c21302);
    }

    @Override // java.lang.Runnable
    public final void run() {
        C21302 c21302 = this.f71446;
        try {
            String strMo25495 = c21302.m48165().mo25495();
            AbstractC17043 abstractC17043M48178 = c21302.m48178();
            if (abstractC17043M48178 != null) {
                strMo25495 = strMo25495.substring(abstractC17043M48178.mo25495().length());
            }
            if (strMo25495.length() == 0) {
                strMo25495 = "/";
            }
            c21302.m48173("257 \"" + strMo25495 + "\"\r\n");
        } catch (Exception unused) {
            c21302.m48166();
        }
    }
}
