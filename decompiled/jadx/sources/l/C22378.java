package l;

import java.net.InetAddress;

/* JADX INFO: renamed from: l.᩹ܺ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: C650 */
/* JADX INFO: loaded from: classes.dex */
public final class C22378 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C4739 f72525;

    public C22378(C4739 c4739) {
        this.f72525 = c4739;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m50242(String str) {
        if (!InetAddress.getByName(str).isSiteLocalAddress()) {
            return str;
        }
        InetAddress inetAddressM15541 = this.f72525.m15541();
        return !inetAddressM15541.isSiteLocalAddress() ? inetAddressM15541.getHostAddress() : str;
    }
}
