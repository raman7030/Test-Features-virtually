package p067l;

import java.net.Inet4Address;
import java.net.InetAddress;

/* JADX INFO: renamed from: l.ۚ᩷᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: C9Z9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7700 extends AbstractC21112 {
    @Override // p067l.AbstractC23793
    /* JADX INFO: renamed from: ֫ */
    public final void mo5056(C19099 c19099) {
        InetAddress inetAddress = this.f66372;
        if (inetAddress != null) {
            byte[] address = inetAddress.getAddress();
            if (!(inetAddress instanceof Inet4Address)) {
                byte[] bArr = new byte[4];
                System.arraycopy(address, 12, bArr, 0, 4);
                address = bArr;
            }
            c19099.m43388(address.length, address);
        }
    }

    @Override // p067l.AbstractC21112, p067l.AbstractC23793
    /* JADX INFO: renamed from: ֫ */
    public final C21467 mo5054(boolean z) {
        C21467 c21467Mo5054 = super.mo5054(z);
        c21467Mo5054.m48640((Inet4Address) this.f66372);
        return c21467Mo5054;
    }
}
