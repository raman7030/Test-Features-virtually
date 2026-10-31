package l;

import java.net.InetAddress;
import java.net.UnknownHostException;

/* JADX INFO: renamed from: l.ᩳۘۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: T596 */
/* JADX INFO: loaded from: classes5.dex */
public class RunnableC17804 extends AbstractRunnableC21333 implements Runnable {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public String f54432;

    public RunnableC17804(C19922 c19922, String str) {
        super(c19922);
        this.f54432 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String strM14172;
        String strM48358 = AbstractRunnableC21333.m48358(this.f54432);
        boolean zContains = strM48358.contains("|");
        C19922 c19922 = this.f68752;
        if (zContains && strM48358.contains("::")) {
            strM14172 = "550 No IPv6 support, reconfigure your client\r\n";
        } else {
            String[] strArrSplit = strM48358.split(",");
            if (strArrSplit.length == 6) {
                int[] iArr = new int[6];
                int i = 0;
                while (true) {
                    if (i >= strArrSplit.length) {
                        byte[] bArr = new byte[4];
                        for (int i2 = 0; i2 < 4; i2++) {
                            bArr[i2] = (byte) iArr[i2];
                        }
                        try {
                            InetAddress byAddress = InetAddress.getByAddress(bArr);
                            InetAddress inetAddress = c19922.m45850().getInetAddress();
                            if (inetAddress != null && !byAddress.equals(inetAddress)) {
                                strM14172 = "550 PORT host must match control connection\r\n";
                                break;
                            }
                            int i3 = (iArr[4] * 256) + iArr[5];
                            if (i3 == 0) {
                                strM14172 = "550 Invalid PORT argument: port 0\r\n";
                                break;
                            } else {
                                c19922.m45843(byAddress, i3);
                                strM14172 = null;
                                break;
                            }
                        } catch (UnknownHostException unused) {
                            strM14172 = "550 Unknown host\r\n";
                            break;
                        }
                    }
                    String str = strArrSplit[i];
                    if (str.matches("[0-9]+") && str.length() <= 3) {
                        int i4 = Integer.parseInt(str);
                        iArr[i] = i4;
                        if (i4 <= 255) {
                            i++;
                        }
                    }
                    strM14172 = C4860.m14172("550 Invalid PORT argument: ", str, "\r\n");
                    break;
                }
            }
            strM14172 = "550 Malformed PORT argument\r\n";
        }
        if (strM14172 == null) {
            c19922.m45860("200 PORT OK\r\n");
        } else {
            c19922.m45860(strM14172);
        }
    }
}
