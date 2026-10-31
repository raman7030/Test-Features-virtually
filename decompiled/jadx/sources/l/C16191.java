package l;

import java.net.InetAddress;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܺ᩷᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 7A22 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16191 extends C19015 {
    @Override // l.C19015
    /* JADX INFO: renamed from: ֫ */
    public final void mo8617(C8806 c8806, HashSet hashSet) {
        Iterator it = ((ConcurrentMapC10942) c8806.m22751()).values().iterator();
        while (it.hasNext()) {
            m43858(c8806, hashSet, (C20095) ((AbstractC10134) it.next()));
        }
        if (m32826()) {
            Iterator it2 = c8806.m22737().values().iterator();
            while (it2.hasNext()) {
                hashSet.add(new C8431("_services._dns-sd._udp.local.", EnumC5983.CLASS_IN, false, C13038.f39042, ((C9512) it2.next()).m24372()));
            }
            return;
        }
        EnumC12250 enumC12250 = EnumC12250.Domain;
        HashMap map = this.f40739;
        if (((String) map.get(enumC12250)).endsWith("in-addr.arpa") || ((String) map.get(enumC12250)).endsWith("ip6.arpa")) {
            String str = (String) C20195.unmodifiableMap(map).get(EnumC12250.Instance);
            if (str == null || str.length() <= 0) {
                return;
            }
            InetAddress inetAddress = c8806.m22739().f23908;
            if (str.equalsIgnoreCase(inetAddress != null ? inetAddress.getHostAddress() : "")) {
                if (((String) map.get(enumC12250)).endsWith("in-addr.arpa")) {
                    hashSet.add(c8806.m22739().m20683(EnumC11628.TYPE_A, C13038.f39042));
                }
                if (((String) map.get(enumC12250)).endsWith("ip6.arpa")) {
                    hashSet.add(c8806.m22739().m20683(EnumC11628.TYPE_AAAA, C13038.f39042));
                    return;
                }
                return;
            }
            return;
        }
        m32834();
    }
}
