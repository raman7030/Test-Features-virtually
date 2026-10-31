package l;

import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;

/* JADX INFO: renamed from: l.֨᩷᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: C9Z9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1375 extends AbstractC19721 {
    @Override // l.AbstractC22542
    /* JADX INFO: renamed from: ֫ */
    public final void mo2717(C17603 c17603) {
        InetAddress inetAddress = this.f63741;
        if (inetAddress != null) {
            byte[] address = inetAddress.getAddress();
            if (inetAddress instanceof Inet4Address) {
                byte[] bArr = new byte[16];
                for (int i = 0; i < 16; i++) {
                    if (i < 11) {
                        bArr[i] = address[i - 12];
                    } else {
                        bArr[i] = 0;
                    }
                }
                address = bArr;
            }
            c17603.m41142(address.length, address);
        }
    }

    @Override // l.AbstractC19721, l.AbstractC22542
    /* JADX INFO: renamed from: ֫ */
    public final C20095 mo2715(boolean z) {
        C20095 c20095Mo2715 = super.mo2715(z);
        c20095Mo2715.m46325((Inet6Address) this.f63741);
        return c20095Mo2715;
    }
}
