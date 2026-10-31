package l;

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
public final class C9234 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Context f27952;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C20177 f27953;

    public C9234(Context context, C20177 c20177) {
        this.f27952 = context.getApplicationContext();
        this.f27953 = c20177;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C18406 m23676() {
        C18406 c18406;
        C18406 c18406M23673;
        C18406 c18407;
        this.f27953.getClass();
        Inet4Address inet4AddressM31302 = C12865.m31302();
        if (inet4AddressM31302 == null || inet4AddressM31302.isAnyLocalAddress() || inet4AddressM31302.isLoopbackAddress() || inet4AddressM31302.isMulticastAddress() || inet4AddressM31302.isLinkLocalAddress()) {
            return new C18406(null, null, null, Collections.EMPTY_LIST);
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f27952.getSystemService("connectivity");
        if (connectivityManager == null) {
            c18406 = new C18406(inet4AddressM31302, null, Collections.EMPTY_LIST);
        } else if (Build.VERSION.SDK_INT < 23 || (c18406M23673 = m23673(connectivityManager, connectivityManager.getActiveNetwork(), inet4AddressM31302)) == null) {
            Network[] allNetworks = connectivityManager.getAllNetworks();
            if (allNetworks != null) {
                int length = allNetworks.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        C18406 c18406M23674 = m23673(connectivityManager, allNetworks[i], inet4AddressM31302);
                        if (c18406M23674 != null) {
                            c18406 = c18406M23674;
                            break;
                        }
                        i++;
                    } else {
                        c18406 = new C18406(inet4AddressM31302, null, Collections.EMPTY_LIST);
                        break;
                    }
                }
            } else {
                c18406 = new C18406(inet4AddressM31302, null, Collections.EMPTY_LIST);
                break;
            }
        } else {
            c18406 = c18406M23673;
        }
        InetAddress inetAddress = c18406.f57144;
        List list = c18406.f57146;
        if (inetAddress != null && !list.isEmpty()) {
            return c18406;
        }
        try {
            c18407 = m23674(inet4AddressM31302);
        } catch (RuntimeException unused) {
            c18407 = new C18406(inet4AddressM31302, null, Collections.EMPTY_LIST);
        }
        if (inetAddress == null) {
            inetAddress = c18407.f57144;
        }
        if (list.isEmpty()) {
            list = c18407.f57146;
        }
        return new C18406(inet4AddressM31302, (inetAddress == null || list.isEmpty() || m23675(list, inetAddress)) ? inetAddress : null, list);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C18406 m23673(ConnectivityManager connectivityManager, Network network, Inet4Address inet4Address) {
        LinkProperties linkProperties;
        InetAddress gateway;
        if (network != null && (linkProperties = connectivityManager.getLinkProperties(network)) != null) {
            ArrayList arrayList = new ArrayList();
            for (LinkAddress linkAddress : linkProperties.getLinkAddresses()) {
                InetAddress address = linkAddress.getAddress();
                if (address instanceof Inet4Address) {
                    C3589 c3589 = new C3589(address, linkAddress.getPrefixLength());
                    if (c3589.m10985(inet4Address)) {
                        arrayList.add(c3589);
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
                    if (next.isDefaultRoute() && C19112.m44046(next.getGateway())) {
                        gateway = next.getGateway();
                        break;
                    }
                }
                return new C18406(inet4Address, (gateway == null || m23675(arrayList, gateway)) ? gateway : null, arrayList);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C18406 m23674(Inet4Address inet4Address) {
        List listSingletonList;
        WifiManager wifiManager = (WifiManager) this.f27952.getSystemService("wifi");
        if (wifiManager == null) {
            return new C18406(inet4Address, null, Collections.EMPTY_LIST);
        }
        DhcpInfo dhcpInfo = wifiManager.getDhcpInfo();
        if (dhcpInfo == null) {
            return new C18406(inet4Address, null, Collections.EMPTY_LIST);
        }
        if (!inet4Address.equals(C19112.m44048(dhcpInfo.ipAddress))) {
            return new C18406(inet4Address, null, Collections.EMPTY_LIST);
        }
        int iM44054 = C19112.m44054(dhcpInfo.netmask);
        if (iM44054 < 0) {
            listSingletonList = Collections.EMPTY_LIST;
        } else {
            listSingletonList = Collections.singletonList(new C3589(inet4Address, iM44054));
        }
        InetAddress inetAddressM44049 = C19112.m44049(dhcpInfo.gateway);
        if (!C19112.m44046(inetAddressM44049)) {
            inetAddressM44049 = null;
        }
        if (inetAddressM44049 != null && !listSingletonList.isEmpty() && !m23675(listSingletonList, inetAddressM44049)) {
            return new C18406(inet4Address, null, Collections.EMPTY_LIST);
        }
        return new C18406(inet4Address, inetAddressM44049, listSingletonList);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m23675(List list, InetAddress inetAddress) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((C3589) it.next()).m10985(inetAddress)) {
                return true;
            }
        }
        return false;
    }
}
