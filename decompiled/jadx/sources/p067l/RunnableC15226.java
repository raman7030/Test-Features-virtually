package p067l;

/* JADX INFO: renamed from: l.ܰۖۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: N569 */
/* JADX INFO: loaded from: classes4.dex */
public class RunnableC15226 extends AbstractC3156 implements Runnable {

    /* JADX INFO: renamed from: ᩶ */
    public final String f43419;

    public RunnableC15226(C21302 c21302, String str) {
        super(c21302, str);
        this.f43419 = str;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0065  */
    /* JADX WARN: Code duplicated, block: B:30:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    public final void run() {
        AbstractC17043 abstractC17043M50699;
        String strM5411;
        String strMo5410;
        String strM50693 = AbstractRunnableC22643.m50693(this.f43419);
        if (strM50693.startsWith("-")) {
            strM50693 = "";
        }
        boolean zEquals = strM50693.equals("");
        C21302 c21302 = this.f71446;
        if (zEquals) {
            abstractC17043M50699 = c21302.m48165();
        } else {
            if (strM50693.contains("*")) {
                strM5411 = "550 NLST does not support wildcards\r\n";
            } else {
                abstractC17043M50699 = AbstractRunnableC22643.m50699(c21302, strM50693);
                if (m50701(abstractC17043M50699)) {
                    strM5411 = "450 Listing target violates chroot\r\n";
                } else if (abstractC17043M50699.mo25093()) {
                    strM5411 = "550 NLST for regular files is unsupported\r\n";
                }
            }
            if (strM5411 != null) {
                c21302.m48173(strM5411);
            }
        }
        if (abstractC17043M50699.mo25087()) {
            StringBuilder sb = new StringBuilder();
            strM5411 = m5409(abstractC17043M50699, sb);
            if (strM5411 == null) {
                strMo5410 = sb.toString();
            }
        } else {
            strMo5410 = mo5410(abstractC17043M50699);
            strM5411 = strMo5410 == null ? "450 Couldn't list that file\r\n" : m5411(strMo5410);
        }
        if (strM5411 != null) {
            c21302.m48173(strM5411);
        }
    }

    @Override // p067l.AbstractC3156
    /* JADX INFO: renamed from: ۧ */
    public final String mo5410(AbstractC17043 abstractC17043) {
        if (!abstractC17043.mo25094()) {
            return null;
        }
        String name = abstractC17043.getName();
        if (name.contains("*") || name.contains("/")) {
            return null;
        }
        return name.concat("\r\n");
    }
}
