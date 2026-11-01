package p067l;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: renamed from: l.ۗۖۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: N585 */
/* JADX INFO: loaded from: classes3.dex */
public class RunnableC5169 extends AbstractC3156 implements Runnable {

    /* JADX INFO: renamed from: ᩶ */
    public final String f12148;

    public RunnableC5169(C21302 c21302, String str) {
        super(c21302, str);
        this.f12148 = str;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0060  */
    /* JADX WARN: Code duplicated, block: B:29:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    public final void run() {
        AbstractC17043 abstractC17043M50699;
        String strM5411;
        String strMo5410;
        String strM50693 = AbstractRunnableC22643.m50693(this.f12148);
        while (strM50693.startsWith("-")) {
            strM50693 = AbstractRunnableC22643.m50693(strM50693);
        }
        boolean zEquals = strM50693.equals("");
        C21302 c21302 = this.f71446;
        if (zEquals) {
            abstractC17043M50699 = c21302.m48165();
        } else {
            if (strM50693.contains("*")) {
                strM5411 = "550 LIST does not support wildcards\r\n";
            } else {
                abstractC17043M50699 = AbstractRunnableC22643.m50699(c21302, strM50693);
                if (m50701(abstractC17043M50699)) {
                    strM5411 = "450 Listing target violates chroot\r\n";
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
        SimpleDateFormat simpleDateFormat;
        StringBuilder sb = new StringBuilder();
        if (!abstractC17043.mo25094()) {
            return null;
        }
        String name = abstractC17043.getName();
        if (name.contains("*") || name.contains("/")) {
            return null;
        }
        if (abstractC17043.mo25087()) {
            sb.append("drwxr-xr-x 1 owner group");
        } else {
            sb.append("-rw-r--r-- 1 owner group");
        }
        String string = Long.toString(abstractC17043.mo25101());
        int length = 13 - string.length();
        while (true) {
            int i = length - 1;
            if (length <= 0) {
                break;
            }
            sb.append(' ');
            length = i;
        }
        sb.append(string);
        if (System.currentTimeMillis() - abstractC17043.mo25091() < 15552000000L) {
            simpleDateFormat = new SimpleDateFormat(" MMM dd HH:mm ", Locale.US);
        } else {
            simpleDateFormat = new SimpleDateFormat(" MMM dd  yyyy ", Locale.US);
        }
        sb.append(simpleDateFormat.format(new Date(abstractC17043.mo25091())));
        sb.append(name);
        sb.append("\r\n");
        return sb.toString();
    }
}
