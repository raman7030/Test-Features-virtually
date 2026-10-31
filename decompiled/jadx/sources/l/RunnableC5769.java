package l;

/* JADX INFO: renamed from: l.ۛۖۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: QALX */
/* JADX INFO: loaded from: classes3.dex */
public class RunnableC5769 extends AbstractC0829 implements Runnable {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f17743;

    public RunnableC5769(C19922 c19922, String str) {
        super(c19922, str);
        this.f17743 = str;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004c  */
    /* JADX WARN: Code duplicated, block: B:21:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    public final void run() {
        AbstractC15440 abstractC15440M48364;
        String strM3095;
        String strM48358 = AbstractRunnableC21333.m48358(this.f17743);
        boolean zEquals = strM48358.equals("");
        C19922 c19922 = this.f68752;
        if (zEquals) {
            abstractC15440M48364 = c19922.m45852();
        } else {
            if (strM48358.contains("*")) {
                strM3095 = "550 MLSD does not support wildcards\r\n";
            } else {
                abstractC15440M48364 = AbstractRunnableC21333.m48364(c19922, strM48358);
                if (m48366(abstractC15440M48364)) {
                    strM3095 = "450 MLSD target violates chroot\r\n";
                }
            }
            if (strM3095 != null) {
                c19922.m45860(strM3095);
            }
        }
        if (abstractC15440M48364.mo23113()) {
            StringBuilder sb = new StringBuilder();
            strM3095 = m3095(abstractC15440M48364, sb);
            if (strM3095 == null) {
                strM3095 = m3097(sb.toString());
            }
        } else {
            strM3095 = "501 Not a directory\r\n";
        }
        if (strM3095 != null) {
            c19922.m45860(strM3095);
        }
    }

    @Override // l.AbstractC0829
    /* JADX INFO: renamed from: ۧ */
    public final String mo3096(AbstractC15440 abstractC15440) {
        StringBuilder sb = new StringBuilder();
        if (!abstractC15440.mo23120()) {
            return null;
        }
        String name = abstractC15440.getName();
        if (name.contains("*") || name.contains("/")) {
            return null;
        }
        String[] strArrM45862 = this.f68752.m45862();
        if (strArrM45862 != null) {
            for (String str : strArrM45862) {
                if (str.equalsIgnoreCase("size")) {
                    sb.append("Size=");
                    sb.append(abstractC15440.mo23127());
                    sb.append(';');
                } else if (str.equalsIgnoreCase("modify")) {
                    String strM9120 = AbstractC2988.m9120(abstractC15440.mo23117());
                    sb.append("Modify=");
                    sb.append(strM9120);
                    sb.append(';');
                } else if (str.equalsIgnoreCase("type")) {
                    if (abstractC15440.mo23119()) {
                        sb.append("Type=file;");
                    } else if (abstractC15440.mo23113()) {
                        sb.append("Type=dir;");
                    }
                } else if (str.equalsIgnoreCase("perm")) {
                    sb.append("Perm=");
                    if (abstractC15440.mo27936()) {
                        if (abstractC15440.mo23119()) {
                            sb.append('r');
                        } else if (abstractC15440.mo23113()) {
                            sb.append("el");
                        }
                    }
                    if (abstractC15440.mo27924()) {
                        if (abstractC15440.mo23119()) {
                            sb.append("adfw");
                        } else if (abstractC15440.mo23113()) {
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
