package l;

/* JADX INFO: renamed from: l.ۨۖۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: VALF */
/* JADX INFO: loaded from: classes4.dex */
public class RunnableC11414 extends AbstractRunnableC21333 implements Runnable {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public String f34117;

    public RunnableC11414(C19922 c19922, String str) {
        super(c19922);
        this.f34117 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        AbstractC15440 abstractC15440M48364;
        String strM48358 = AbstractRunnableC21333.m48358(this.f34117);
        boolean zEquals = strM48358.equals("");
        C19922 c19922 = this.f68752;
        if (zEquals) {
            abstractC15440M48364 = c19922.m45852();
            str = "/";
        } else {
            str = strM48358;
            abstractC15440M48364 = AbstractRunnableC21333.m48364(c19922, strM48358);
        }
        if (m48366(abstractC15440M48364)) {
            c19922.m45860("550 Invalid name or chroot violation\r\n");
            return;
        }
        if (abstractC15440M48364.mo23120()) {
            c19922.m45860("250- Listing " + str + "\r\n");
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            String[] strArrM45862 = c19922.m45862();
            if (strArrM45862 != null) {
                for (String str2 : strArrM45862) {
                    if (str2.equalsIgnoreCase("size")) {
                        sb2.append("Size=");
                        sb2.append(abstractC15440M48364.mo23127());
                        sb2.append(';');
                    } else if (str2.equalsIgnoreCase("modify")) {
                        String strM9120 = AbstractC2988.m9120(abstractC15440M48364.mo23117());
                        sb2.append("Modify=");
                        sb2.append(strM9120);
                        sb2.append(';');
                    } else if (str2.equalsIgnoreCase("type")) {
                        if (abstractC15440M48364.mo23119()) {
                            sb2.append("Type=file;");
                        } else if (abstractC15440M48364.mo23113()) {
                            sb2.append("Type=dir;");
                        }
                    } else if (str2.equalsIgnoreCase("perm")) {
                        sb2.append("Perm=");
                        if (abstractC15440M48364.mo27936()) {
                            if (abstractC15440M48364.mo23119()) {
                                sb2.append('r');
                            } else if (abstractC15440M48364.mo23113()) {
                                sb2.append("el");
                            }
                        }
                        if (abstractC15440M48364.mo27924()) {
                            if (abstractC15440M48364.mo23119()) {
                                sb2.append("adfw");
                            } else if (abstractC15440M48364.mo23113()) {
                                sb2.append("fpcm");
                            }
                        }
                        sb2.append(';');
                    }
                }
            }
            sb2.append(' ');
            sb2.append(abstractC15440M48364.getName());
            sb2.append("\r\n");
            sb.append(sb2.toString());
            sb.append("\r\n");
            c19922.m45860(sb.toString());
            c19922.m45860("250 End\r\n");
            return;
        }
        c19922.m45860("550 file does not exist\r\n");
    }
}
