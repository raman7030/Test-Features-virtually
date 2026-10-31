package l;

import java.io.IOException;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.UnknownHostException;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.۟᩷᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: C9Z7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7725 implements InterfaceC3492 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static InterfaceC2148 f23905 = C11321.m27962(C7725.class.getName());

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14074 f23906;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public String f23907;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public InetAddress f23908;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public NetworkInterface f23909;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final synchronized void m20696() {
        this.f23907 = ((C5278) C19390.m44664()).m15205(this.f23907, EnumC0338.HOST);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C7725 m20681(InetAddress inetAddress, C8806 c8806) {
        InetAddress localHost;
        String strSubstring;
        InterfaceC2148 interfaceC2148 = f23905;
        if (inetAddress == null) {
            try {
                String property = System.getProperty("net.mdns.interface");
                if (property != null) {
                    localHost = InetAddress.getByName(property);
                } else {
                    localHost = InetAddress.getLocalHost();
                    if (localHost.isLoopbackAddress()) {
                        InetAddress[] inetAddressArrM21527 = ((C8100) C4489.m13237()).m21527();
                        if (inetAddressArrM21527.length > 0) {
                            localHost = inetAddressArrM21527[0];
                        }
                    }
                }
                if (localHost.isLoopbackAddress()) {
                    interfaceC2148.mo7104("Could not find any address beside the loopback.");
                }
            } catch (IOException e) {
                interfaceC2148.mo7083("Could not initialize the host network interface on " + inetAddress + "because of an error: " + e.getMessage(), (Throwable) e);
                InetAddress byName = null;
                try {
                    byName = InetAddress.getByName(null);
                } catch (UnknownHostException unused) {
                }
                localHost = byName;
                strSubstring = "computer";
            }
        } else {
            localHost = inetAddress;
        }
        strSubstring = "".length() == 0 ? localHost.getHostName() : "";
        if (strSubstring.contains("in-addr.arpa") || strSubstring.equals(localHost.getHostAddress())) {
            strSubstring = localHost.getHostAddress();
        }
        int iIndexOf = strSubstring.indexOf(".local");
        if (iIndexOf > 0) {
            strSubstring = strSubstring.substring(0, iIndexOf);
        }
        return new C7725(localHost, C16014.m37867(strSubstring.replaceAll("[:%\\.]", "-"), ".local."), c8806);
    }

    public C7725(InetAddress inetAddress, String str, C8806 c8806) {
        C14074 c14074 = new C14074();
        c14074.mo14270(c8806);
        this.f23906 = c14074;
        this.f23908 = inetAddress;
        this.f23907 = str;
        if (inetAddress != null) {
            try {
                this.f23909 = NetworkInterface.getByInetAddress(inetAddress);
            } catch (Exception e) {
                f23905.mo7083("LocalHostInfo() exception ", (Throwable) e);
            }
        }
    }

    public final String toString() {
        StringBuilder sbM32307 = C13325.m32307(1024, "local host info[");
        String str = this.f23907;
        if (str == null) {
            str = "no name";
        }
        sbM32307.append(str);
        sbM32307.append(", ");
        NetworkInterface networkInterface = this.f23909;
        sbM32307.append(networkInterface != null ? networkInterface.getDisplayName() : "???");
        sbM32307.append(":");
        InetAddress inetAddress = this.f23908;
        sbM32307.append(inetAddress != null ? inetAddress.getHostAddress() : "no address");
        sbM32307.append(", ");
        sbM32307.append(this.f23906);
        sbM32307.append("]");
        return sbM32307.toString();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m20692() {
        return this.f23907;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m20688(AbstractC19721 abstractC19721) {
        AbstractC19721 abstractC19721M20684 = m20684(abstractC19721.m32832(), abstractC19721.m32833(), C13038.f39042);
        return abstractC19721M20684 != null && abstractC19721M20684.m32832() == abstractC19721.m32832() && abstractC19721M20684.m32828().equalsIgnoreCase(abstractC19721.m32828()) && !abstractC19721M20684.mo2720(abstractC19721);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC19721 m20684(EnumC11628 enumC11628, boolean z, int i) {
        int i2 = C23247.f74685[enumC11628.ordinal()];
        InetAddress inetAddress = this.f23908;
        if (i2 == 1) {
            if (!(inetAddress instanceof Inet4Address)) {
                return null;
            }
            return new C5609(this.f23907, EnumC11628.TYPE_A, EnumC5983.CLASS_IN, z, i, this.f23908);
        }
        if ((i2 != 2 && i2 != 3) || !(inetAddress instanceof Inet6Address)) {
            return null;
        }
        return new C1375(this.f23907, EnumC11628.TYPE_AAAA, EnumC5983.CLASS_IN, z, i, this.f23908);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C8431 m20683(EnumC11628 enumC11628, int i) {
        int i2 = C23247.f74685[enumC11628.ordinal()];
        InetAddress inetAddress = this.f23908;
        if (i2 == 1) {
            if (!(inetAddress instanceof Inet4Address)) {
                return null;
            }
            return new C8431(inetAddress.getHostAddress() + ".in-addr.arpa.", EnumC5983.CLASS_IN, false, i, this.f23907);
        }
        if ((i2 != 2 && i2 != 3) || !(inetAddress instanceof Inet6Address)) {
            return null;
        }
        return new C8431(inetAddress.getHostAddress() + ".ip6.arpa.", EnumC5983.CLASS_IN, false, i, this.f23907);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList m20682(EnumC5983 enumC5983, boolean z, int i) {
        C5609 c5609;
        ArrayList arrayList = new ArrayList();
        InetAddress inetAddress = this.f23908;
        C1375 c1375 = null;
        if (inetAddress instanceof Inet4Address) {
            c5609 = new C5609(this.f23907, EnumC11628.TYPE_A, EnumC5983.CLASS_IN, z, i, this.f23908);
        } else {
            c5609 = null;
        }
        if (c5609 != null && c5609.m32825(enumC5983)) {
            arrayList.add(c5609);
        }
        if (inetAddress instanceof Inet6Address) {
            c1375 = new C1375(this.f23907, EnumC11628.TYPE_AAAA, EnumC5983.CLASS_IN, z, i, this.f23908);
        }
        if (c1375 != null && c1375.m32825(enumC5983)) {
            arrayList.add(c1375);
        }
        return arrayList;
    }

    @Override // l.InterfaceC3492
    /* JADX INFO: renamed from: ֫ */
    public final void mo10674(AbstractC1729 abstractC1729) {
        this.f23906.mo10674(abstractC1729);
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final boolean m20691() {
        C14074 c14074 = this.f23906;
        c14074.lock();
        try {
            c14074.m14269(EnumC7394.f22762);
            c14074.mo14275(null);
            return false;
        } finally {
            c14074.unlock();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m20685(AbstractC20780 abstractC20780) {
        this.f23906.m14271(abstractC20780);
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final void m20690() {
        this.f23906.m14276();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m20686(AbstractC20780 abstractC20780, EnumC7394 enumC7394) {
        this.f23906.m14272(abstractC20780, enumC7394);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m20693(AbstractC20780 abstractC20780, EnumC7394 enumC7394) {
        C14074 c14074 = this.f23906;
        c14074.lock();
        try {
            return c14074.f15482 == abstractC20780 && c14074.f15483 == enumC7394;
        } finally {
            c14074.unlock();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m20687() {
        return this.f23906.m14273();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m20699() {
        return this.f23906.f15483.m19915();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m20698() {
        return this.f23906.f15483.m19914();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m20694() {
        return this.f23906.f15483.m19918();
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean m20697() {
        return this.f23906.f15483.m19919();
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean m20689() {
        return this.f23906.f15483.m19912();
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m20700() {
        return this.f23906.f15483.m19913();
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean m20695() {
        if (this.f23908 == null) {
            return true;
        }
        return this.f23906.m14277();
    }
}
