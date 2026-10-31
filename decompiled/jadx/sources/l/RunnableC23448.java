package l;

/* JADX INFO: renamed from: l.᩻ۘۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: NALB */
/* JADX INFO: loaded from: classes.dex */
public class RunnableC23448 extends AbstractRunnableC21333 implements Runnable {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public String f75268;

    public RunnableC23448(C19922 c19922, String str) {
        super(c19922);
        this.f75268 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = "500 Invalid start and end position\r\n";
        String[] strArrSplit = AbstractRunnableC21333.m48358(this.f75268).split(" ");
        int length = strArrSplit.length;
        C19922 c19922 = this.f68752;
        if (length != 2) {
            str = "500 Malformed RANG command\r\n";
        } else if (c19922.m45858()) {
            try {
                long j = Long.parseLong(strArrSplit[0]);
                long j2 = Long.parseLong(strArrSplit[1]);
                if (j == 1 && j2 == 0) {
                    c19922.m45860("350 Resetting start and end positions\r\n");
                    c19922.f64496 = -1L;
                    c19922.f64491 = -1L;
                } else if (j <= j2) {
                    c19922.f64496 = j;
                    c19922.f64491 = j2;
                    StringBuilder sbM31106 = C12803.m31106("350 Restarting at ", ". End Byte range at ", j);
                    sbM31106.append(j2);
                    sbM31106.append(".\r\n");
                    c19922.m45860(sbM31106.toString());
                }
                str = null;
            } catch (NumberFormatException unused) {
            }
        } else {
            str = "551 Server is not in binary mode\r\n";
        }
        if (str != null) {
            c19922.m45860(str);
        }
    }
}
