package p067l;

import java.net.InetAddress;

/* JADX INFO: renamed from: l.᩹ܺ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: C650 */
/* JADX INFO: loaded from: classes.dex */
public final class C23636 {

    /* JADX INFO: renamed from: ֫ */
    public final C6872 f75251;

    public C23636(C6872 c6872) {
        this.f75251 = c6872;
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m52582(String str) {
        if (!InetAddress.getByName(str).isSiteLocalAddress()) {
            return str;
        }
        InetAddress inetAddressM17452 = this.f75251.m17452();
        return !inetAddressM17452.isSiteLocalAddress() ? inetAddressM17452.getHostAddress() : str;
    }
}
