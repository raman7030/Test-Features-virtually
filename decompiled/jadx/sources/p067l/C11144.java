package p067l;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.DhcpInfo;
import android.net.LinkAddress;
import android.net.LinkProperties;
import android.net.Network;
import android.net.RouteInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۢ֡ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: T7B2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11144 {

    /* JADX INFO: renamed from: ֫ */
    public final Context f30898;

    /* JADX INFO: renamed from: ۧ */
    public final C21545 f30899;

    public C11144(Context context, C21545 c21545) {
        this.f30898 = context.getApplicationContext();
        this.f30899 = c21545;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C19861 m25675() {
        C19861 c19861;
        C19861 c19861M25672;
        C19861 c19862;
        this.f30899.getClass();
        Inet4Address inet4AddressM33388 = C14595.m33388();
        if (inet4AddressM33388 == null || inet4AddressM33388.isAnyLocalAddress() || inet4AddressM33388.isLoopbackAddress() || inet4AddressM33388.isMulticastAddress() || inet4AddressM33388.isLinkLocalAddress()) {
            return new C19861(null, null, null, Collections.EMPTY_LIST);
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f30898.getSystemService("connectivity");
        if (connectivityManager == null) {
            c19861 = new C19861(inet4AddressM33388, null, Collections.EMPTY_LIST);
        } else if (Build.VERSION.SDK_INT < 23 || (c19861M25672 = m25672(connectivityManager, connectivityManager.getActiveNetwork(), inet4AddressM33388)) == null) {
            Network[] allNetworks = connectivityManager.getAllNetworks();
            if (allNetworks != null) {
                int length = allNetworks.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        C19861 c19861M25673 = m25672(connectivityManager, allNetworks[i], inet4AddressM33388);
                        if (c19861M25673 != null) {
                            c19861 = c19861M25673;
                            break;
                        }
                        i++;
                    } else {
                        c19861 = new C19861(inet4AddressM33388, null, Collections.EMPTY_LIST);
                        break;
                    }
                }
            } else {
                c19861 = new C19861(inet4AddressM33388, null, Collections.EMPTY_LIST);
                break;
            }
        } else {
            c19861 = c19861M25672;
        }
        InetAddress inetAddress = c19861.f60363;
        List list = c19861.f60365;
        if (inetAddress != null && !list.isEmpty()) {
            return c19861;
        }
        try {
            c19862 = m25673(inet4AddressM33388);
        } catch (RuntimeException unused) {
            c19862 = new C19861(inet4AddressM33388, null, Collections.EMPTY_LIST);
        }
        if (inetAddress == null) {
            inetAddress = c19862.f60363;
        }
        if (list.isEmpty()) {
            list = c19862.f60365;
        }
        return new C19861(inet4AddressM33388, (inetAddress == null || list.isEmpty() || m25674(list, inetAddress)) ? inetAddress : null, list);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C19861 m25672(ConnectivityManager connectivityManager, Network network, Inet4Address inet4Address) {
        LinkProperties linkProperties;
        InetAddress gateway;
        if (network != null && (linkProperties = connectivityManager.getLinkProperties(network)) != null) {
            ArrayList arrayList = new ArrayList();
            for (LinkAddress linkAddress : linkProperties.getLinkAddresses()) {
                InetAddress address = linkAddress.getAddress();
                if (address instanceof Inet4Address) {
                    C5779 c5779 = new C5779(address, linkAddress.getPrefixLength());
                    if (c5779.m12961(inet4Address)) {
                        arrayList.add(c5779);
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                Iterator<RouteInfo> it = linkProperties.getRoutes().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        gateway = null;
                        break;
                    }
                    RouteInfo next = it.next();
                    if (next.isDefaultRoute() && C20532.m46340(next.getGateway())) {
                        gateway = next.getGateway();
                        break;
                    }
                }
                return new C19861(inet4Address, (gateway == null || m25674(arrayList, gateway)) ? gateway : null, arrayList);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    private C19861 m25673(Inet4Address inet4Address) {
        List listSingletonList;
        WifiManager wifiManager = (WifiManager) this.f30898.getSystemService("wifi");
        if (wifiManager == null) {
            return new C19861(inet4Address, null, Collections.EMPTY_LIST);
        }
        DhcpInfo dhcpInfo = wifiManager.getDhcpInfo();
        if (dhcpInfo == null) {
            return new C19861(inet4Address, null, Collections.EMPTY_LIST);
        }
        if (!inet4Address.equals(C20532.m46342(dhcpInfo.ipAddress))) {
            return new C19861(inet4Address, null, Collections.EMPTY_LIST);
        }
        int iM46348 = C20532.m46348(dhcpInfo.netmask);
        if (iM46348 < 0) {
            listSingletonList = Collections.EMPTY_LIST;
        } else {
            listSingletonList = Collections.singletonList(new C5779(inet4Address, iM46348));
        }
        InetAddress inetAddressM46343 = C20532.m46343(dhcpInfo.gateway);
        if (!C20532.m46340(inetAddressM46343)) {
            inetAddressM46343 = null;
        }
        if (inetAddressM46343 != null && !listSingletonList.isEmpty() && !m25674(listSingletonList, inetAddressM46343)) {
            return new C19861(inet4Address, null, Collections.EMPTY_LIST);
        }
        return new C19861(inet4Address, inetAddressM46343, listSingletonList);
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m25674(List list, InetAddress inetAddress) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((C5779) it.next()).m12961(inetAddress)) {
                return true;
            }
        }
        return false;
    }
}
