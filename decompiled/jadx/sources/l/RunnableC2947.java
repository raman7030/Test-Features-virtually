package l;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: renamed from: l.ۗۖۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: N585 */
/* JADX INFO: loaded from: classes3.dex */
public class RunnableC2947 extends AbstractC0829 implements Runnable {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f9348;

    public RunnableC2947(C19922 c19922, String str) {
        super(c19922, str);
        this.f9348 = str;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0060  */
    /* JADX WARN: Code duplicated, block: B:29:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    public final void run() {
        AbstractC15440 abstractC15440M48364;
        String strM3097;
        String strMo3096;
        String strM48358 = AbstractRunnableC21333.m48358(this.f9348);
        while (strM48358.startsWith("-")) {
            strM48358 = AbstractRunnableC21333.m48358(strM48358);
        }
        boolean zEquals = strM48358.equals("");
        C19922 c19922 = this.f68752;
        if (zEquals) {
            abstractC15440M48364 = c19922.m45852();
        } else {
            if (strM48358.contains("*")) {
                strM3097 = "550 LIST does not support wildcards\r\n";
            } else {
                abstractC15440M48364 = AbstractRunnableC21333.m48364(c19922, strM48358);
                if (m48366(abstractC15440M48364)) {
                    strM3097 = "450 Listing target violates chroot\r\n";
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
        SimpleDateFormat simpleDateFormat;
        StringBuilder sb = new StringBuilder();
        if (!abstractC15440.mo23120()) {
            return null;
        }
        String name = abstractC15440.getName();
        if (name.contains("*") || name.contains("/")) {
            return null;
        }
        if (abstractC15440.mo23113()) {
            sb.append("drwxr-xr-x 1 owner group");
        } else {
            sb.append("-rw-r--r-- 1 owner group");
        }
        String string = Long.toString(abstractC15440.mo23127());
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
        if (System.currentTimeMillis() - abstractC15440.mo23117() < 15552000000L) {
            simpleDateFormat = new SimpleDateFormat(" MMM dd HH:mm ", Locale.US);
        } else {
            simpleDateFormat = new SimpleDateFormat(" MMM dd  yyyy ", Locale.US);
        }
        sb.append(simpleDateFormat.format(new Date(abstractC15440.mo23117())));
        sb.append(name);
        sb.append("\r\n");
        return sb.toString();
    }
}
