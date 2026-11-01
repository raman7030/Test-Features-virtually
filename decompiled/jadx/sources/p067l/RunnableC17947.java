package p067l;

import java.net.InetAddress;

/* JADX INFO: renamed from: l.ܽۘۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: C55Y */
/* JADX INFO: loaded from: classes4.dex */
public class RunnableC17947 extends AbstractRunnableC22643 implements Runnable {
    public RunnableC17947(C21302 c21302, String str) {
        super(c21302);
    }

    @Override // java.lang.Runnable
    public final void run() {
        C21302 c21302 = this.f71446;
        int iM48162 = c21302.m48162();
        if (iM48162 == 0) {
            c21302.m48173("502 Couldn't open a port\r\n");
            return;
        }
        InetAddress inetAddressM48172 = c21302.m48172();
        if (inetAddressM48172 == null) {
            c21302.m48173("502 Couldn't open a port\r\n");
            return;
        }
        if (iM48162 < 1) {
            c21302.m48173("502 Couldn't open a port\r\n");
            return;
        }
        String hostAddress = inetAddressM48172.getHostAddress();
        if (hostAddress != null) {
            hostAddress = hostAddress.replace('.', ',');
        }
        StringBuilder sbM11879 = C5410.m11879("227 Entering Passive Mode (", hostAddress, ",");
        sbM11879.append(iM48162 / 256);
        sbM11879.append(",");
        sbM11879.append(iM48162 % 256);
        sbM11879.append(").\r\n");
        c21302.m48173(sbM11879.toString());
    }
}
