package l;

import java.net.InetAddress;

/* JADX INFO: renamed from: l.ܽۘۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: C55Y */
/* JADX INFO: loaded from: classes4.dex */
public class RunnableC16392 extends AbstractRunnableC21333 implements Runnable {
    public RunnableC16392(C19922 c19922, String str) {
        super(c19922);
    }

    @Override // java.lang.Runnable
    public final void run() {
        C19922 c19922 = this.f68752;
        int iM45849 = c19922.m45849();
        if (iM45849 == 0) {
            c19922.m45860("502 Couldn't open a port\r\n");
            return;
        }
        InetAddress inetAddressM45859 = c19922.m45859();
        if (inetAddressM45859 == null) {
            c19922.m45860("502 Couldn't open a port\r\n");
            return;
        }
        if (iM45849 < 1) {
            c19922.m45860("502 Couldn't open a port\r\n");
            return;
        }
        String hostAddress = inetAddressM45859.getHostAddress();
        if (hostAddress != null) {
            hostAddress = hostAddress.replace('.', ',');
        }
        StringBuilder sbM9834 = C3200.m9834("227 Entering Passive Mode (", hostAddress, ",");
        sbM9834.append(iM45849 / 256);
        sbM9834.append(",");
        sbM9834.append(iM45849 % 256);
        sbM9834.append(").\r\n");
        c19922.m45860(sbM9834.toString());
    }
}
