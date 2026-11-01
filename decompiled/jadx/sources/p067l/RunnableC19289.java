package p067l;

import java.net.InetAddress;
import java.net.UnknownHostException;

/* JADX INFO: renamed from: l.ᩳۘۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: T596 */
/* JADX INFO: loaded from: classes5.dex */
public class RunnableC19289 extends AbstractRunnableC22643 implements Runnable {

    /* JADX INFO: renamed from: ᩶ */
    public String f57628;

    public RunnableC19289(C21302 c21302, String str) {
        super(c21302);
        this.f57628 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String strM16053;
        String strM50693 = AbstractRunnableC22643.m50693(this.f57628);
        boolean zContains = strM50693.contains("|");
        C21302 c21302 = this.f71446;
        if (zContains && strM50693.contains("::")) {
            strM16053 = "550 No IPv6 support, reconfigure your client\r\n";
        } else {
            String[] strArrSplit = strM50693.split(",");
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
                            InetAddress inetAddress = c21302.m48163().getInetAddress();
                            if (inetAddress != null && !byAddress.equals(inetAddress)) {
                                strM16053 = "550 PORT host must match control connection\r\n";
                                break;
                            }
                            int i3 = (iArr[4] * 256) + iArr[5];
                            if (i3 == 0) {
                                strM16053 = "550 Invalid PORT argument: port 0\r\n";
                                break;
                            } else {
                                c21302.m48156(byAddress, i3);
                                strM16053 = null;
                                break;
                            }
                        } catch (UnknownHostException unused) {
                            strM16053 = "550 Unknown host\r\n";
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
                    strM16053 = C6988.m16053("550 Invalid PORT argument: ", str, "\r\n");
                    break;
                }
            }
            strM16053 = "550 Malformed PORT argument\r\n";
        }
        if (strM16053 == null) {
            c21302.m48173("200 PORT OK\r\n");
        } else {
            c21302.m48173(strM16053);
        }
    }
}
