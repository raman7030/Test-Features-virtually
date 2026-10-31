package l;

/* JADX INFO: renamed from: l.ܰۖۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: N569 */
/* JADX INFO: loaded from: classes4.dex */
public class RunnableC13529 extends AbstractC0829 implements Runnable {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f40349;

    public RunnableC13529(C19922 c19922, String str) {
        super(c19922, str);
        this.f40349 = str;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0065  */
    /* JADX WARN: Code duplicated, block: B:30:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    public final void run() {
        AbstractC15440 abstractC15440M48364;
        String strM3097;
        String strMo3096;
        String strM48358 = AbstractRunnableC21333.m48358(this.f40349);
        if (strM48358.startsWith("-")) {
            strM48358 = "";
        }
        boolean zEquals = strM48358.equals("");
        C19922 c19922 = this.f68752;
        if (zEquals) {
            abstractC15440M48364 = c19922.m45852();
        } else {
            if (strM48358.contains("*")) {
                strM3097 = "550 NLST does not support wildcards\r\n";
            } else {
                abstractC15440M48364 = AbstractRunnableC21333.m48364(c19922, strM48358);
                if (m48366(abstractC15440M48364)) {
                    strM3097 = "450 Listing target violates chroot\r\n";
                } else if (abstractC15440M48364.mo23119()) {
                    strM3097 = "550 NLST for regular files is unsupported\r\n";
                }
            }
            if (strM3097 != null) {
                c19922.m45860(strM3097);
            }
        }
        if (abstractC15440M48364.mo23113()) {
            StringBuilder sb = new StringBuilder();
            strM3097 = m3095(abstractC15440M48364, sb);
            if (strM3097 == null) {
                strMo3096 = sb.toString();
            }
        } else {
            strMo3096 = mo3096(abstractC15440M48364);
            strM3097 = strMo3096 == null ? "450 Couldn't list that file\r\n" : m3097(strMo3096);
        }
        if (strM3097 != null) {
            c19922.m45860(strM3097);
        }
    }

    @Override // l.AbstractC0829
    /* JADX INFO: renamed from: ۧ */
    public final String mo3096(AbstractC15440 abstractC15440) {
        if (!abstractC15440.mo23120()) {
            return null;
        }
        String name = abstractC15440.getName();
        if (name.contains("*") || name.contains("/")) {
            return null;
        }
        return name.concat("\r\n");
    }
}
