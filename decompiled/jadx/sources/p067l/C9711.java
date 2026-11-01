package p067l;

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
public final class C9711 implements InterfaceC5688 {

    /* JADX INFO: renamed from: ۗ */
    public static InterfaceC4410 f26818 = C13128.m30023(C9711.class.getName());

    /* JADX INFO: renamed from: ۙ */
    public final C15745 f26819;

    /* JADX INFO: renamed from: ᩶ */
    public String f26820;

    /* JADX INFO: renamed from: ᩸ */
    public InetAddress f26821;

    /* JADX INFO: renamed from: ᩹ */
    public NetworkInterface f26822;

    /* JADX INFO: renamed from: ܽ */
    public final synchronized void m22676() {
        this.f26820 = ((C7385) C20797.m46958()).m17108(this.f26820, EnumC2690.HOST);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C9711 m22661(InetAddress inetAddress, C10738 c10738) {
        InetAddress localHost;
        String strSubstring;
        InterfaceC4410 interfaceC4410 = f26818;
        if (inetAddress == null) {
            try {
                String property = System.getProperty("net.mdns.interface");
                if (property != null) {
                    localHost = InetAddress.getByName(property);
                } else {
                    localHost = InetAddress.getLocalHost();
                    if (localHost.isLoopbackAddress()) {
                        InetAddress[] inetAddressArrM23495 = ((C10067) C6635.m15119()).m23495();
                        if (inetAddressArrM23495.length > 0) {
                            localHost = inetAddressArrM23495[0];
                        }
                    }
                }
                if (localHost.isLoopbackAddress()) {
                    interfaceC4410.mo9199("Could not find any address beside the loopback.");
                }
            } catch (IOException e) {
                interfaceC4410.mo9178("Could not initialize the host network interface on " + inetAddress + "because of an error: " + e.getMessage(), (Throwable) e);
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
        return new C9711(localHost, C17588.m40053(strSubstring.replaceAll("[:%\\.]", "-"), ".local."), c10738);
    }

    public C9711(InetAddress inetAddress, String str, C10738 c10738) {
        C15745 c15745 = new C15745();
        c15745.mo16167(c10738);
        this.f26819 = c15745;
        this.f26821 = inetAddress;
        this.f26820 = str;
        if (inetAddress != null) {
            try {
                this.f26822 = NetworkInterface.getByInetAddress(inetAddress);
            } catch (Exception e) {
                f26818.mo9178("LocalHostInfo() exception ", (Throwable) e);
            }
        }
    }

    public final String toString() {
        StringBuilder sbM34407 = C15033.m34407(1024, "local host info[");
        String str = this.f26820;
        if (str == null) {
            str = "no name";
        }
        sbM34407.append(str);
        sbM34407.append(", ");
        NetworkInterface networkInterface = this.f26822;
        sbM34407.append(networkInterface != null ? networkInterface.getDisplayName() : "???");
        sbM34407.append(":");
        InetAddress inetAddress = this.f26821;
        sbM34407.append(inetAddress != null ? inetAddress.getHostAddress() : "no address");
        sbM34407.append(", ");
        sbM34407.append(this.f26819);
        sbM34407.append("]");
        return sbM34407.toString();
    }

    /* JADX INFO: renamed from: ۧ */
    public final String m22672() {
        return this.f26820;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m22668(AbstractC21112 abstractC21112) {
        AbstractC21112 abstractC21112M22664 = m22664(abstractC21112.m34947(), abstractC21112.m34948(), C14760.f42088);
        return abstractC21112M22664 != null && abstractC21112M22664.m34947() == abstractC21112.m34947() && abstractC21112M22664.m34943().equalsIgnoreCase(abstractC21112.m34943()) && !abstractC21112M22664.mo5059(abstractC21112);
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC21112 m22664(EnumC13420 enumC13420, boolean z, int i) {
        int i2 = C24463.f77428[enumC13420.ordinal()];
        InetAddress inetAddress = this.f26821;
        if (i2 == 1) {
            if (!(inetAddress instanceof Inet4Address)) {
                return null;
            }
            return new C7700(this.f26820, EnumC13420.TYPE_A, EnumC8055.CLASS_IN, z, i, this.f26821);
        }
        if ((i2 != 2 && i2 != 3) || !(inetAddress instanceof Inet6Address)) {
            return null;
        }
        return new C3676(this.f26820, EnumC13420.TYPE_AAAA, EnumC8055.CLASS_IN, z, i, this.f26821);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C10382 m22663(EnumC13420 enumC13420, int i) {
        int i2 = C24463.f77428[enumC13420.ordinal()];
        InetAddress inetAddress = this.f26821;
        if (i2 == 1) {
            if (!(inetAddress instanceof Inet4Address)) {
                return null;
            }
            return new C10382(inetAddress.getHostAddress() + ".in-addr.arpa.", EnumC8055.CLASS_IN, false, i, this.f26820);
        }
        if ((i2 != 2 && i2 != 3) || !(inetAddress instanceof Inet6Address)) {
            return null;
        }
        return new C10382(inetAddress.getHostAddress() + ".ip6.arpa.", EnumC8055.CLASS_IN, false, i, this.f26820);
    }

    /* JADX INFO: renamed from: ֫ */
    public final ArrayList m22662(EnumC8055 enumC8055, boolean z, int i) {
        C7700 c7700;
        ArrayList arrayList = new ArrayList();
        InetAddress inetAddress = this.f26821;
        C3676 c3676 = null;
        if (inetAddress instanceof Inet4Address) {
            c7700 = new C7700(this.f26820, EnumC13420.TYPE_A, EnumC8055.CLASS_IN, z, i, this.f26821);
        } else {
            c7700 = null;
        }
        if (c7700 != null && c7700.m34940(enumC8055)) {
            arrayList.add(c7700);
        }
        if (inetAddress instanceof Inet6Address) {
            c3676 = new C3676(this.f26820, EnumC13420.TYPE_AAAA, EnumC8055.CLASS_IN, z, i, this.f26821);
        }
        if (c3676 != null && c3676.m34940(enumC8055)) {
            arrayList.add(c3676);
        }
        return arrayList;
    }

    @Override // p067l.InterfaceC5688
    /* JADX INFO: renamed from: ֫ */
    public final void mo12669(AbstractC4012 abstractC4012) {
        this.f26819.mo12669(abstractC4012);
    }

    /* JADX INFO: renamed from: ۢ */
    public final boolean m22671() {
        C15745 c15745 = this.f26819;
        c15745.lock();
        try {
            c15745.m16166(EnumC9396.f25674);
            c15745.mo16172(null);
            return false;
        } finally {
            c15745.unlock();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m22665(AbstractC22118 abstractC22118) {
        this.f26819.m16168(abstractC22118);
    }

    /* JADX INFO: renamed from: ۡ */
    public final void m22670() {
        this.f26819.m16173();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m22666(AbstractC22118 abstractC22118, EnumC9396 enumC9396) {
        this.f26819.m16169(abstractC22118, enumC9396);
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m22673(AbstractC22118 abstractC22118, EnumC9396 enumC9396) {
        C15745 c15745 = this.f26819;
        c15745.lock();
        try {
            return c15745.f18315 == abstractC22118 && c15745.f18316 == enumC9396;
        } finally {
            c15745.unlock();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m22667() {
        return this.f26819.m16170();
    }

    /* JADX INFO: renamed from: ᩷ */
    public final boolean m22679() {
        return this.f26819.f18316.m21888();
    }

    /* JADX INFO: renamed from: ᩳ */
    public final boolean m22678() {
        return this.f26819.f18316.m21887();
    }

    /* JADX INFO: renamed from: ܳ */
    public final boolean m22674() {
        return this.f26819.f18316.m21891();
    }

    /* JADX INFO: renamed from: ܿ */
    public final boolean m22677() {
        return this.f26819.f18316.m21892();
    }

    /* JADX INFO: renamed from: ۜ */
    public final boolean m22669() {
        return this.f26819.f18316.m21885();
    }

    /* JADX INFO: renamed from: ᩻ */
    public final boolean m22680() {
        return this.f26819.f18316.m21886();
    }

    /* JADX INFO: renamed from: ܺ */
    public final boolean m22675() {
        if (this.f26821 == null) {
            return true;
        }
        return this.f26819.m16174();
    }
}
