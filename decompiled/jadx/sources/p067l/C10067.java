package p067l;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;
import java.util.HashSet;

/* JADX INFO: renamed from: l.۠ۢ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: B9V6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10067 implements InterfaceC5294 {

    /* JADX INFO: renamed from: ֫ */
    public static final InterfaceC4410 f27880 = C13128.m30023(C10067.class.getName());

    /* JADX INFO: renamed from: ֫ */
    public final InetAddress[] m23495() {
        InterfaceC4410 interfaceC4410 = f27880;
        HashSet hashSet = new HashSet();
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface networkInterfaceNextElement = networkInterfaces.nextElement();
                Enumeration<InetAddress> inetAddresses = networkInterfaceNextElement.getInetAddresses();
                while (inetAddresses.hasMoreElements()) {
                    InetAddress inetAddressNextElement = inetAddresses.nextElement();
                    interfaceC4410.mo9185("Found NetworkInterface/InetAddress: {} -- {}", networkInterfaceNextElement, inetAddressNextElement);
                    try {
                        if (networkInterfaceNextElement.isUp() && networkInterfaceNextElement.supportsMulticast() && !networkInterfaceNextElement.isLoopback()) {
                            hashSet.add(inetAddressNextElement);
                        }
                    } catch (Exception unused) {
                    }
                }
            }
        } catch (SocketException e) {
            interfaceC4410.mo9199("Error while fetching network interfaces addresses: " + e);
        }
        return (InetAddress[]) hashSet.toArray(new InetAddress[hashSet.size()]);
    }
}
