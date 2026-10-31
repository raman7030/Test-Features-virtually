package l;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: l.۬ۘۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 67UI */
/* JADX INFO: loaded from: classes3.dex */
public final class C12865 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final int[] f38635 = {1, 2, 3, 4, 5, 6, 7};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final int[] f38634 = {1, 2, 3};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m31298() {
        Inet4Address inet4AddressM31302 = m31302();
        if (inet4AddressM31302 != null) {
            return inet4AddressM31302.getHostAddress();
        }
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            for (NetworkInterface networkInterface : networkInterfaces != null ? Collections.list(networkInterfaces) : Collections.EMPTY_LIST) {
                String name = networkInterface.getName();
                boolean zIsUp = networkInterface.isUp();
                byte[] hardwareAddress = networkInterface.getHardwareAddress();
                Locale locale = Locale.ROOT;
                C19926.m45880("NetworkInterface Name: " + name + ", IsUp: " + zIsUp + ", HasHardwareAddress: " + (hardwareAddress != null && hardwareAddress.length > 0));
                for (InetAddress inetAddress : Collections.list(networkInterface.getInetAddresses())) {
                    if (inetAddress instanceof Inet4Address) {
                        Locale locale2 = Locale.ROOT;
                        C19926.m45880(">> NetworkInterface IPv4: " + inetAddress.getHostAddress() + ", IsLoopback: " + inetAddress.isLoopbackAddress() + ", IsLinkLocal: " + inetAddress.isLinkLocalAddress());
                    }
                }
            }
            return null;
        } catch (SocketException e) {
            C19926.m45879("NetworkInterface", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Inet4Address m31299(int i, int i2, List list) {
        Iterator it = list.iterator();
        while (true) {
            InetAddress inetAddress = null;
            if (!it.hasNext()) {
                return null;
            }
            NetworkInterface networkInterface = (NetworkInterface) it.next();
            int i3 = 0;
            try {
                String name = networkInterface.getName();
                String lowerCase = name != null ? name.toLowerCase(Locale.ROOT) : "";
                String displayName = networkInterface.getDisplayName();
                String lowerCase2 = displayName != null ? displayName.toLowerCase(Locale.ROOT) : "";
                if (!m31301(networkInterface, lowerCase)) {
                    if (lowerCase.equals("wlan") || lowerCase.equals("wlan0") || lowerCase.startsWith("wifi") || lowerCase.startsWith("mlan")) {
                        i3 = 1;
                    } else if (lowerCase.startsWith("eth") || lowerCase.startsWith("en") || lowerCase.startsWith("lan")) {
                        i3 = 2;
                    } else if (m31300(lowerCase)) {
                        i3 = 3;
                    } else if (lowerCase.startsWith("rndis") || lowerCase.startsWith("usb") || lowerCase.startsWith("ncm") || lowerCase.startsWith("ecm") || lowerCase.contains("tether") || lowerCase2.startsWith("rndis") || lowerCase2.contains("usb") || lowerCase2.contains("tether")) {
                        i3 = 4;
                    } else if (lowerCase.startsWith("bt-pan") || lowerCase.startsWith("bnep") || lowerCase.contains("bluetooth") || lowerCase2.contains("bluetooth")) {
                        i3 = 5;
                    } else if (lowerCase.startsWith("p2p") || lowerCase.startsWith("wlan-direct")) {
                        i3 = 6;
                    } else {
                        byte[] hardwareAddress = networkInterface.getHardwareAddress();
                        if (!networkInterface.isVirtual() && hardwareAddress != null && hardwareAddress.length > 0) {
                            i3 = 7;
                        }
                    }
                }
            } catch (SocketException unused) {
            }
            if (i3 == i) {
                for (InetAddress inetAddress2 : Collections.list(networkInterface.getInetAddresses())) {
                    if ((inetAddress2 instanceof Inet4Address) && !inetAddress2.isAnyLocalAddress() && !inetAddress2.isLoopbackAddress() && !inetAddress2.isMulticastAddress()) {
                        if (i2 == 1) {
                            if (!inetAddress2.isLinkLocalAddress() && inetAddress2.isSiteLocalAddress()) {
                                inetAddress = inetAddress2;
                                break;
                            }
                        } else if (i2 == 2) {
                            if (!inetAddress2.isLinkLocalAddress() && !inetAddress2.isSiteLocalAddress()) {
                                inetAddress = inetAddress2;
                                break;
                            }
                        } else if (i2 == 3 && inetAddress2.isLinkLocalAddress()) {
                            inetAddress = inetAddress2;
                            break;
                        }
                    }
                }
                if (inetAddress != null) {
                    return (Inet4Address) inetAddress;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m31301(NetworkInterface networkInterface, String str) {
        return str.isEmpty() || !networkInterface.isUp() || networkInterface.isLoopback() || networkInterface.isVirtual() || str.equals("lo") || str.contains("rmnet") || str.equals("br") || str.matches("br\\d+") || str.startsWith("br-") || str.startsWith("br_") || str.startsWith("ccmni") || str.startsWith("pdp") || str.startsWith("wwan") || str.startsWith("ppp") || str.startsWith("dummy") || str.startsWith("ifb") || str.startsWith("veth") || str.startsWith("virbr") || str.startsWith("docker") || str.startsWith("vbox") || str.startsWith("vmnet") || str.startsWith("sit") || str.startsWith("ip6tnl") || str.startsWith("gre") || str.startsWith("gretap") || str.startsWith("vti") || str.startsWith("clat") || str.startsWith("v4-") || str.startsWith("tun") || str.startsWith("tap") || str.startsWith("utun") || str.startsWith("vpn") || str.startsWith("wg") || str.startsWith("ipsec") || str.startsWith("l2tp") || str.startsWith("tailscale") || str.startsWith("zt");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m31300(String str) {
        String lowerCase = str.toLowerCase(Locale.ROOT);
        return lowerCase.equals("ap") || lowerCase.matches("ap\\d+") || lowerCase.startsWith("ap_") || lowerCase.startsWith("softap") || lowerCase.contains("hotspot") || lowerCase.matches("wlan[1-9]\\d*") || lowerCase.startsWith("swlan") || lowerCase.startsWith("sap");
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static Inet4Address m31302() {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            List list = networkInterfaces != null ? Collections.list(networkInterfaces) : Collections.EMPTY_LIST;
            int[] iArr = f38634;
            for (int i = 0; i < 3; i++) {
                int i2 = iArr[i];
                int[] iArr2 = f38635;
                for (int i3 = 0; i3 < 7; i3++) {
                    Inet4Address inet4AddressM31299 = m31299(iArr2[i3], i2, list);
                    if (inet4AddressM31299 != null) {
                        return inet4AddressM31299;
                    }
                }
            }
            return null;
        } catch (SocketException unused) {
            return null;
        }
    }
}
