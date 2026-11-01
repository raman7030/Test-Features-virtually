package p067l;

/* JADX INFO: renamed from: l.᩻ۘۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: NALB */
/* JADX INFO: loaded from: classes.dex */
public class RunnableC24653 extends AbstractRunnableC22643 implements Runnable {

    /* JADX INFO: renamed from: ᩶ */
    public String f78015;

    public RunnableC24653(C21302 c21302, String str) {
        super(c21302);
        this.f78015 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = "500 Invalid start and end position\r\n";
        String[] strArrSplit = AbstractRunnableC22643.m50693(this.f78015).split(" ");
        int length = strArrSplit.length;
        C21302 c21302 = this.f71446;
        if (length != 2) {
            str = "500 Malformed RANG command\r\n";
        } else if (c21302.m48171()) {
            try {
                long j = Long.parseLong(strArrSplit[0]);
                long j2 = Long.parseLong(strArrSplit[1]);
                if (j == 1 && j2 == 0) {
                    c21302.m48173("350 Resetting start and end positions\r\n");
                    c21302.f67133 = -1L;
                    c21302.f67128 = -1L;
                } else if (j <= j2) {
                    c21302.f67133 = j;
                    c21302.f67128 = j2;
                    StringBuilder sbM33191 = C14536.m33191("350 Restarting at ", ". End Byte range at ", j);
                    sbM33191.append(j2);
                    sbM33191.append(".\r\n");
                    c21302.m48173(sbM33191.toString());
                }
                str = null;
            } catch (NumberFormatException unused) {
            }
        } else {
            str = "551 Server is not in binary mode\r\n";
        }
        if (str != null) {
            c21302.m48173(str);
        }
    }
}
