package p067l;

/* JADX INFO: renamed from: l.ۛۖۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: QALX */
/* JADX INFO: loaded from: classes3.dex */
public class RunnableC7851 extends AbstractC3156 implements Runnable {

    /* JADX INFO: renamed from: ᩶ */
    public final String f20590;

    public RunnableC7851(C21302 c21302, String str) {
        super(c21302, str);
        this.f20590 = str;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004c  */
    /* JADX WARN: Code duplicated, block: B:21:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    public final void run() {
        AbstractC17043 abstractC17043M50699;
        String strM5409;
        String strM50693 = AbstractRunnableC22643.m50693(this.f20590);
        boolean zEquals = strM50693.equals("");
        C21302 c21302 = this.f71446;
        if (zEquals) {
            abstractC17043M50699 = c21302.m48165();
        } else {
            if (strM50693.contains("*")) {
                strM5409 = "550 MLSD does not support wildcards\r\n";
            } else {
                abstractC17043M50699 = AbstractRunnableC22643.m50699(c21302, strM50693);
                if (m50701(abstractC17043M50699)) {
                    strM5409 = "450 MLSD target violates chroot\r\n";
                }
            }
            if (strM5409 != null) {
                c21302.m48173(strM5409);
            }
        }
        if (abstractC17043M50699.mo25087()) {
            StringBuilder sb = new StringBuilder();
            strM5409 = m5409(abstractC17043M50699, sb);
            if (strM5409 == null) {
                strM5409 = m5411(sb.toString());
            }
        } else {
            strM5409 = "501 Not a directory\r\n";
        }
        if (strM5409 != null) {
            c21302.m48173(strM5409);
        }
    }

    @Override // p067l.AbstractC3156
    /* JADX INFO: renamed from: ۧ */
    public final String mo5410(AbstractC17043 abstractC17043) {
        StringBuilder sb = new StringBuilder();
        if (!abstractC17043.mo25094()) {
            return null;
        }
        String name = abstractC17043.getName();
        if (name.contains("*") || name.contains("/")) {
            return null;
        }
        String[] strArrM48175 = this.f71446.m48175();
        if (strArrM48175 != null) {
            for (String str : strArrM48175) {
                if (str.equalsIgnoreCase("size")) {
                    sb.append("Size=");
                    sb.append(abstractC17043.mo25101());
                    sb.append(';');
                } else if (str.equalsIgnoreCase("modify")) {
                    String strM11171 = AbstractC5208.m11171(abstractC17043.mo25091());
                    sb.append("Modify=");
                    sb.append(strM11171);
                    sb.append(';');
                } else if (str.equalsIgnoreCase("type")) {
                    if (abstractC17043.mo25093()) {
                        sb.append("Type=file;");
                    } else if (abstractC17043.mo25087()) {
                        sb.append("Type=dir;");
                    }
                } else if (str.equalsIgnoreCase("perm")) {
                    sb.append("Perm=");
                    if (abstractC17043.mo29997()) {
                        if (abstractC17043.mo25093()) {
                            sb.append('r');
                        } else if (abstractC17043.mo25087()) {
                            sb.append("el");
                        }
                    }
                    if (abstractC17043.mo29985()) {
                        if (abstractC17043.mo25093()) {
                            sb.append("adfw");
                        } else if (abstractC17043.mo25087()) {
                            sb.append("fpcm");
                        }
                    }
                    sb.append(';');
                }
            }
        }
        sb.append(' ');
        sb.append(name);
        sb.append("\r\n");
        return sb.toString();
    }
}
