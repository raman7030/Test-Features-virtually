package p067l;

/* JADX INFO: renamed from: l.ۨۖۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: VALF */
/* JADX INFO: loaded from: classes4.dex */
public class RunnableC13216 extends AbstractRunnableC22643 implements Runnable {

    /* JADX INFO: renamed from: ᩶ */
    public String f37113;

    public RunnableC13216(C21302 c21302, String str) {
        super(c21302);
        this.f37113 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        AbstractC17043 abstractC17043M50699;
        String strM50693 = AbstractRunnableC22643.m50693(this.f37113);
        boolean zEquals = strM50693.equals("");
        C21302 c21302 = this.f71446;
        if (zEquals) {
            abstractC17043M50699 = c21302.m48165();
            str = "/";
        } else {
            str = strM50693;
            abstractC17043M50699 = AbstractRunnableC22643.m50699(c21302, strM50693);
        }
        if (m50701(abstractC17043M50699)) {
            c21302.m48173("550 Invalid name or chroot violation\r\n");
            return;
        }
        if (abstractC17043M50699.mo25094()) {
            c21302.m48173("250- Listing " + str + "\r\n");
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            String[] strArrM48175 = c21302.m48175();
            if (strArrM48175 != null) {
                for (String str2 : strArrM48175) {
                    if (str2.equalsIgnoreCase("size")) {
                        sb2.append("Size=");
                        sb2.append(abstractC17043M50699.mo25101());
                        sb2.append(';');
                    } else if (str2.equalsIgnoreCase("modify")) {
                        String strM11171 = AbstractC5208.m11171(abstractC17043M50699.mo25091());
                        sb2.append("Modify=");
                        sb2.append(strM11171);
                        sb2.append(';');
                    } else if (str2.equalsIgnoreCase("type")) {
                        if (abstractC17043M50699.mo25093()) {
                            sb2.append("Type=file;");
                        } else if (abstractC17043M50699.mo25087()) {
                            sb2.append("Type=dir;");
                        }
                    } else if (str2.equalsIgnoreCase("perm")) {
                        sb2.append("Perm=");
                        if (abstractC17043M50699.mo29997()) {
                            if (abstractC17043M50699.mo25093()) {
                                sb2.append('r');
                            } else if (abstractC17043M50699.mo25087()) {
                                sb2.append("el");
                            }
                        }
                        if (abstractC17043M50699.mo29985()) {
                            if (abstractC17043M50699.mo25093()) {
                                sb2.append("adfw");
                            } else if (abstractC17043M50699.mo25087()) {
                                sb2.append("fpcm");
                            }
                        }
                        sb2.append(';');
                    }
                }
            }
            sb2.append(' ');
            sb2.append(abstractC17043M50699.getName());
            sb2.append("\r\n");
            sb.append(sb2.toString());
            sb.append("\r\n");
            c21302.m48173(sb.toString());
            c21302.m48173("250 End\r\n");
            return;
        }
        c21302.m48173("550 file does not exist\r\n");
    }
}
