package p067l;

import java.net.InetAddress;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܺ᩷᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 7A22 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17757 extends C20441 {
    @Override // p067l.C20441
    /* JADX INFO: renamed from: ֫ */
    public final void mo10677(C10738 c10738, HashSet hashSet) {
        Iterator it = ((ConcurrentMapC12768) c10738.m24721()).values().iterator();
        while (it.hasNext()) {
            m46126(c10738, hashSet, (C21467) ((AbstractC12000) it.next()));
        }
        if (m34941()) {
            Iterator it2 = c10738.m24707().values().iterator();
            while (it2.hasNext()) {
                hashSet.add(new C10382("_services._dns-sd._udp.local.", EnumC8055.CLASS_IN, false, C14760.f42088, ((C11409) it2.next()).m26382()));
            }
            return;
        }
        EnumC14011 enumC14011 = EnumC14011.Domain;
        HashMap map = this.f43820;
        if (((String) map.get(enumC14011)).endsWith("in-addr.arpa") || ((String) map.get(enumC14011)).endsWith("ip6.arpa")) {
            String str = (String) C21562.unmodifiableMap(map).get(EnumC14011.Instance);
            if (str == null || str.length() <= 0) {
                return;
            }
            InetAddress inetAddress = c10738.m24709().f26821;
            if (str.equalsIgnoreCase(inetAddress != null ? inetAddress.getHostAddress() : "")) {
                if (((String) map.get(enumC14011)).endsWith("in-addr.arpa")) {
                    hashSet.add(c10738.m24709().m22663(EnumC13420.TYPE_A, C14760.f42088));
                }
                if (((String) map.get(enumC14011)).endsWith("ip6.arpa")) {
                    hashSet.add(c10738.m24709().m22663(EnumC13420.TYPE_AAAA, C14760.f42088));
                    return;
                }
                return;
            }
            return;
        }
        m34949();
    }
}
