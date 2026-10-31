package l;

import java.io.IOException;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: l.᩶ۢ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: K9YL */
/* JADX INFO: loaded from: classes5.dex */
public final class C20095 extends AbstractC10134 implements InterfaceC16897, InterfaceC3492 {

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC2148 f65073 = C11321.m27962(C20095.class.getName());

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public String f65074;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public transient String f65075;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Set f65076;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f65077;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final C22211 f65078;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f65079;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public byte[] f65080;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public Hashtable f65081;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f65082;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public String f65083;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public String f65084;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public int f65085;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Set f65086;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public String f65087;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public String f65088;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public String f65089;

    public C20095() {
        throw null;
    }

    @Override // l.AbstractC10134
    /* JADX INFO: renamed from: ܶ */
    public final synchronized boolean mo25457() {
        boolean z;
        z = false;
        if (this.f65084 != null) {
            if ((this.f65086.size() > 0 || this.f65076.size() > 0) && mo25451() != null && mo25451().length > 0) {
                z = true;
            }
        }
        return z;
    }

    public C20095(String str, HashMap map, boolean z) {
        this(map, 0, 0, 0, z, null);
        try {
            this.f65080 = C15839.m37497(str);
            this.f65084 = str;
        } catch (IOException e) {
            throw new RuntimeException(C16014.m37866("Unexpected exception: ", e));
        }
    }

    public C20095(Map map, int i, int i2, int i3, boolean z, byte[] bArr) {
        HashMap mapM46320 = m46320(map);
        this.f65088 = (String) mapM46320.get(EnumC12250.Domain);
        this.f65089 = (String) mapM46320.get(EnumC12250.Protocol);
        this.f65087 = (String) mapM46320.get(EnumC12250.Application);
        this.f65083 = (String) mapM46320.get(EnumC12250.Instance);
        this.f65074 = (String) mapM46320.get(EnumC12250.Subtype);
        this.f65079 = i;
        this.f65085 = i2;
        this.f65077 = i3;
        this.f65080 = bArr;
        this.f65078 = new C22211(this);
        this.f65082 = z;
        this.f65086 = C20195.synchronizedSet(new LinkedHashSet());
        this.f65076 = C20195.synchronizedSet(new LinkedHashSet());
    }

    public C20095(AbstractC10134 abstractC10134) {
        this.f65086 = C20195.synchronizedSet(new LinkedHashSet());
        this.f65076 = C20195.synchronizedSet(new LinkedHashSet());
        if (abstractC10134 != null) {
            this.f65088 = abstractC10134.mo25459();
            this.f65089 = abstractC10134.mo25449();
            this.f65087 = abstractC10134.mo25447();
            this.f65083 = abstractC10134.getName();
            this.f65074 = abstractC10134.mo25445();
            this.f65079 = abstractC10134.mo25454();
            this.f65085 = abstractC10134.mo25453();
            this.f65077 = abstractC10134.mo25458();
            this.f65080 = abstractC10134.mo25451();
            this.f65082 = abstractC10134.mo25464();
            for (Inet6Address inet6Address : abstractC10134.mo25452()) {
                this.f65076.add(inet6Address);
            }
            for (Inet4Address inet4Address : abstractC10134.mo25460()) {
                this.f65086.add(inet4Address);
            }
        }
        this.f65078 = new C22211(this);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static HashMap m46320(Map map) {
        HashMap map2 = new HashMap(5);
        EnumC12250 enumC12250 = EnumC12250.Domain;
        String str = "local";
        String str2 = map.containsKey(enumC12250) ? (String) map.get(enumC12250) : "local";
        if (str2 != null && str2.length() != 0) {
            str = str2;
        }
        map2.put(enumC12250, m46321(str));
        EnumC12250 enumC12251 = EnumC12250.Protocol;
        String str3 = "tcp";
        String str4 = map.containsKey(enumC12251) ? (String) map.get(enumC12251) : "tcp";
        if (str4 != null && str4.length() != 0) {
            str3 = str4;
        }
        map2.put(enumC12251, m46321(str3));
        EnumC12250 enumC12252 = EnumC12250.Application;
        String str5 = "";
        String str6 = map.containsKey(enumC12252) ? (String) map.get(enumC12252) : "";
        if (str6 == null || str6.length() == 0) {
            str6 = "";
        }
        map2.put(enumC12252, m46321(str6));
        EnumC12250 enumC12253 = EnumC12250.Instance;
        String str7 = map.containsKey(enumC12253) ? (String) map.get(enumC12253) : "";
        if (str7 == null || str7.length() == 0) {
            str7 = "";
        }
        map2.put(enumC12253, m46321(str7));
        EnumC12250 enumC12254 = EnumC12250.Subtype;
        String str8 = map.containsKey(enumC12254) ? (String) map.get(enumC12254) : "";
        if (str8 != null && str8.length() != 0) {
            str5 = str8;
        }
        map2.put(enumC12254, m46321(str5));
        return map2;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static String m46321(String str) {
        if (str == null) {
            return "";
        }
        String strTrim = str.trim();
        if (strTrim.startsWith(".")) {
            strTrim = strTrim.substring(1);
        }
        if (strTrim.startsWith("_")) {
            strTrim = strTrim.substring(1);
        }
        return strTrim.endsWith(".") ? C15472.m36561(1, 0, strTrim) : strTrim;
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final boolean m46333() {
        C22211 c22211 = this.f65078;
        c22211.lock();
        try {
            c22211.m14269(EnumC7394.f22762);
            c22211.mo14275(null);
            return false;
        } finally {
            c22211.unlock();
        }
    }

    @Override // l.AbstractC10134
    /* JADX INFO: renamed from: ֨ */
    public final String mo25446() {
        String strMo25459 = mo25459();
        String strMo25449 = mo25449();
        String strMo25447 = mo25447();
        StringBuilder sb = new StringBuilder();
        sb.append(strMo25447.length() > 0 ? C4860.m14172("_", strMo25447, ".") : "");
        return C23202.m51498(sb, strMo25449.length() > 0 ? C4860.m14172("_", strMo25449, ".") : "", strMo25459, ".");
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String m46334() {
        String strMo25445 = mo25445();
        StringBuilder sb = new StringBuilder();
        sb.append(strMo25445.length() > 0 ? C4860.m14172("_", strMo25445, "._sub.") : "");
        sb.append(mo25446());
        return sb.toString();
    }

    @Override // l.AbstractC10134
    public final String getName() {
        String str = this.f65083;
        return str != null ? str : "";
    }

    @Override // l.AbstractC10134
    /* JADX INFO: renamed from: ۢ */
    public final String mo25455() {
        if (this.f65075 == null) {
            this.f65075 = mo25450().toLowerCase();
        }
        return this.f65075;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m46323(String str) {
        this.f65083 = str;
        this.f65075 = null;
    }

    @Override // l.AbstractC10134
    /* JADX INFO: renamed from: ۘ */
    public final String mo25450() {
        String strMo25459 = mo25459();
        String strMo25449 = mo25449();
        String strMo25447 = mo25447();
        String name = getName();
        StringBuilder sb = new StringBuilder();
        sb.append(name.length() > 0 ? name.concat(".") : "");
        sb.append(strMo25447.length() > 0 ? C4860.m14172("_", strMo25447, ".") : "");
        return C23202.m51498(sb, strMo25449.length() > 0 ? C4860.m14172("_", strMo25449, ".") : "", strMo25459, ".");
    }

    @Override // l.AbstractC10134
    /* JADX INFO: renamed from: ᩵ */
    public final String mo25462() {
        String str = this.f65084;
        return str != null ? str : "";
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m46335(String str) {
        this.f65084 = str;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m46324(Inet4Address inet4Address) {
        this.f65086.add(inet4Address);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m46325(Inet6Address inet6Address) {
        this.f65076.add(inet6Address);
    }

    @Override // l.AbstractC10134
    @Deprecated
    /* JADX INFO: renamed from: ᩳ */
    public final Inet4Address mo25461() {
        Inet4Address[] inet4AddressArrMo25460 = mo25460();
        if (inet4AddressArrMo25460.length > 0) {
            return inet4AddressArrMo25460[0];
        }
        return null;
    }

    @Override // l.AbstractC10134
    @Deprecated
    /* JADX INFO: renamed from: ܳ */
    public final Inet6Address mo25456() {
        Inet6Address[] inet6AddressArrMo25452 = mo25452();
        if (inet6AddressArrMo25452.length > 0) {
            return inet6AddressArrMo25452[0];
        }
        return null;
    }

    @Override // l.AbstractC10134
    /* JADX INFO: renamed from: ᩷ */
    public final InetAddress[] mo25463() {
        Set set = this.f65086;
        int size = set.size();
        Set set2 = this.f65076;
        ArrayList arrayList = new ArrayList(set2.size() + size);
        arrayList.addAll(set);
        arrayList.addAll(set2);
        return (InetAddress[]) arrayList.toArray(new InetAddress[arrayList.size()]);
    }

    @Override // l.AbstractC10134
    /* JADX INFO: renamed from: ܿ */
    public final Inet4Address[] mo25460() {
        Set set = this.f65086;
        return (Inet4Address[]) set.toArray(new Inet4Address[set.size()]);
    }

    @Override // l.AbstractC10134
    /* JADX INFO: renamed from: ۜ */
    public final Inet6Address[] mo25452() {
        Set set = this.f65076;
        return (Inet6Address[]) set.toArray(new Inet6Address[set.size()]);
    }

    @Override // l.AbstractC10134
    /* JADX INFO: renamed from: ۡ */
    public final int mo25454() {
        return this.f65079;
    }

    @Override // l.AbstractC10134
    /* JADX INFO: renamed from: ܺ */
    public final int mo25458() {
        return this.f65077;
    }

    @Override // l.AbstractC10134
    /* JADX INFO: renamed from: ۠ */
    public final int mo25453() {
        return this.f65085;
    }

    @Override // l.AbstractC10134
    /* JADX INFO: renamed from: ۚ */
    public final byte[] mo25451() {
        byte[] bArr = this.f65080;
        return (bArr == null || bArr.length <= 0) ? C15839.f48943 : bArr;
    }

    @Override // l.AbstractC10134
    /* JADX INFO: renamed from: ֫ */
    public final String mo25447() {
        String str = this.f65087;
        return str != null ? str : "";
    }

    @Override // l.AbstractC10134
    /* JADX INFO: renamed from: ܽ */
    public final String mo25459() {
        String str = this.f65088;
        return str != null ? str : "local";
    }

    @Override // l.AbstractC10134
    /* JADX INFO: renamed from: ۖ */
    public final String mo25449() {
        String str = this.f65089;
        return str != null ? str : "tcp";
    }

    @Override // l.AbstractC10134
    /* JADX INFO: renamed from: ֡ */
    public final String mo25445() {
        String str = this.f65074;
        return str != null ? str : "";
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final HashMap m46338() {
        HashMap map = new HashMap(5);
        map.put(EnumC12250.Domain, mo25459());
        map.put(EnumC12250.Protocol, mo25449());
        map.put(EnumC12250.Application, mo25447());
        map.put(EnumC12250.Instance, getName());
        map.put(EnumC12250.Subtype, mo25445());
        return map;
    }

    @Override // l.InterfaceC16897
    /* JADX INFO: renamed from: ֫ */
    public final void mo39758(C22833 c22833, long j, AbstractC13660 abstractC13660) {
        if (!(abstractC13660 instanceof AbstractC22542)) {
            f65073.mo7095(abstractC13660 == null ? "null" : abstractC13660.getClass().getSimpleName(), "DNSEntry is not of type 'DNSRecord' but of type {}");
            return;
        }
        AbstractC22542 abstractC22542 = (AbstractC22542) abstractC13660;
        boolean z = true;
        if (abstractC22542.mo32824(j)) {
            InterfaceC2148 interfaceC2148 = f65073;
            int i = C21506.f69166[abstractC22542.m32832().ordinal()];
            if (i == 1 || i == 2) {
                if (!abstractC22542.m32828().equalsIgnoreCase(mo25462())) {
                    return;
                }
                InetAddress inetAddress = ((AbstractC19721) abstractC22542).f63741;
                if (EnumC11628.TYPE_A.equals(abstractC22542.m32832())) {
                    Inet4Address inet4Address = (Inet4Address) inetAddress;
                    if (this.f65086.remove(inet4Address)) {
                        interfaceC2148.mo7100(inet4Address, "Removed expired IPv4: {}");
                    } else {
                        interfaceC2148.mo7100(inet4Address, "Expired IPv4 not in this service: {}");
                        return;
                    }
                } else {
                    Inet6Address inet6Address = (Inet6Address) inetAddress;
                    if (this.f65076.remove(inet6Address)) {
                        interfaceC2148.mo7100(inet6Address, "Removed expired IPv6: {}");
                    } else {
                        interfaceC2148.mo7100(inet6Address, "Expired IPv6 not in this service: {}");
                        return;
                    }
                }
            } else {
                interfaceC2148.mo7095(abstractC22542, "Unhandled expired record: {}");
                return;
            }
        } else {
            Set set = this.f65076;
            Set set2 = this.f65086;
            int i2 = C21506.f69166[abstractC22542.m32832().ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 == 4) {
                            if (!abstractC22542.m32828().equalsIgnoreCase(mo25450())) {
                                return;
                            }
                            this.f65080 = ((C21837) abstractC22542).m49214();
                            this.f65081 = null;
                        } else if (i2 != 5 || mo25445().length() != 0 || abstractC22542.m32831().length() == 0) {
                            return;
                        } else {
                            this.f65074 = abstractC22542.m32831();
                        }
                    } else {
                        if (!abstractC22542.m32828().equalsIgnoreCase(mo25450())) {
                            return;
                        }
                        C15485 c15485 = (C15485) abstractC22542;
                        String str = this.f65084;
                        if (str != null && str.equalsIgnoreCase(c15485.m36568())) {
                            z = false;
                        }
                        this.f65084 = c15485.m36568();
                        this.f65079 = c15485.m36569();
                        this.f65085 = c15485.m36567();
                        this.f65077 = c15485.m36566();
                        if (z) {
                            set2.clear();
                            set.clear();
                            Iterator it = c22833.m50945(this.f65084, EnumC11628.TYPE_A, EnumC5983.CLASS_IN).iterator();
                            while (it.hasNext()) {
                                mo39758(c22833, j, (AbstractC13660) it.next());
                            }
                            Iterator it2 = c22833.m50945(this.f65084, EnumC11628.TYPE_AAAA, EnumC5983.CLASS_IN).iterator();
                            while (it2.hasNext()) {
                                mo39758(c22833, j, (AbstractC13660) it2.next());
                            }
                            return;
                        }
                    }
                } else {
                    if (!abstractC22542.m32828().equalsIgnoreCase(mo25462())) {
                        return;
                    }
                    InetAddress inetAddress2 = ((AbstractC19721) abstractC22542).f63741;
                    if (!(inetAddress2 instanceof Inet6Address) || !set.add((Inet6Address) inetAddress2)) {
                        return;
                    }
                }
            } else {
                if (!abstractC22542.m32828().equalsIgnoreCase(mo25462())) {
                    return;
                }
                InetAddress inetAddress3 = ((AbstractC19721) abstractC22542).f63741;
                if (!(inetAddress3 instanceof Inet4Address) || !set2.add((Inet4Address) inetAddress3)) {
                    return;
                }
            }
        }
        C8806 c8806M14274 = this.f65078.m14274();
        if (c8806M14274 != null) {
            if (mo25457()) {
                c8806M14274.m22729(new C15154(c8806M14274, mo25446(), getName(), clone()));
            }
            synchronized (this) {
                notifyAll();
            }
            return;
        }
        f65073.mo7088("JmDNS not available.");
    }

    @Override // l.InterfaceC3492
    /* JADX INFO: renamed from: ֫ */
    public final void mo10674(AbstractC1729 abstractC1729) {
        this.f65078.mo10674(abstractC1729);
    }

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final void m46330() {
        this.f65078.m14276();
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final boolean m46341() {
        return this.f65078.m14273();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m46327(AbstractC20780 abstractC20780) {
        this.f65078.m14271(abstractC20780);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m46328(AbstractC20780 abstractC20780, EnumC7394 enumC7394) {
        this.f65078.m14272(abstractC20780, enumC7394);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m46336(AbstractC20780 abstractC20780, EnumC7394 enumC7394) {
        C22211 c22211 = this.f65078;
        c22211.lock();
        try {
            return c22211.f15482 == abstractC20780 && c22211.f15483 == enumC7394;
        } finally {
            c22211.unlock();
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m46339() {
        return this.f65078.f15483.m19915();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m46337() {
        return this.f65078.f15483.m19916();
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final boolean m46332() {
        return this.f65078.f15483.m19914();
    }

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public final boolean m46340() {
        return this.f65078.m14277();
    }

    public final int hashCode() {
        return mo25450().hashCode();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C20095) && mo25450().equals(((C20095) obj).mo25450());
    }

    @Override // l.AbstractC10134
    public final C20095 clone() {
        C20095 c20095 = new C20095(m46338(), this.f65079, this.f65085, this.f65077, this.f65082, this.f65080);
        c20095.f65084 = this.f65084;
        for (Inet6Address inet6Address : mo25452()) {
            c20095.f65076.add(inet6Address);
        }
        for (Inet4Address inet4Address : mo25460()) {
            c20095.f65086.add(inet4Address);
        }
        return c20095;
    }

    public final String toString() {
        Map map;
        StringBuilder sb = new StringBuilder("[ServiceInfoImpl@");
        sb.append(System.identityHashCode(this));
        sb.append(" name: '");
        if (getName().length() > 0) {
            sb.append(getName());
            sb.append('.');
        }
        sb.append(m46334());
        sb.append("' address: '");
        InetAddress[] inetAddressArrMo25463 = mo25463();
        if (inetAddressArrMo25463.length > 0) {
            for (InetAddress inetAddress : inetAddressArrMo25463) {
                sb.append(inetAddress);
                sb.append(':');
                sb.append(this.f65079);
                sb.append(' ');
            }
        } else {
            sb.append("(null):");
            sb.append(this.f65079);
        }
        sb.append("' status: '");
        sb.append(this.f65078.toString());
        sb.append(this.f65082 ? "' is persistent," : "',");
        if (mo25457()) {
            sb.append(" has data");
        } else {
            sb.append(" has NO data");
        }
        if (mo25451().length > 0) {
            synchronized (this) {
                if (this.f65081 == null && mo25451() != null) {
                    Hashtable hashtable = new Hashtable();
                    try {
                        C15839.m37496(hashtable, mo25451());
                    } catch (Exception e) {
                        f65073.mo7083("Malformed TXT Field ", (Throwable) e);
                    }
                    this.f65081 = hashtable;
                }
                map = this.f65081;
                if (map == null) {
                    map = Collections.EMPTY_MAP;
                }
            }
            if (map.isEmpty()) {
                sb.append(", empty");
            } else {
                for (Map.Entry entry : map.entrySet()) {
                    byte[] bArr = (byte[]) entry.getValue();
                    byte[] bArr2 = C15839.f48944;
                    String strM37495 = C15839.m37495(0, bArr.length, bArr);
                    sb.append("\n\t");
                    C20177.m46410(sb, (String) entry.getKey(), ": ", strM37495);
                }
            }
        }
        sb.append(']');
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList m46322(EnumC5983 enumC5983, int i, C7725 c7725) {
        ArrayList arrayList = new ArrayList();
        if (enumC5983 != EnumC5983.CLASS_ANY && enumC5983 != EnumC5983.CLASS_IN) {
            return arrayList;
        }
        if (mo25445().length() > 0) {
            arrayList.add(new C8431(m46334(), EnumC5983.CLASS_IN, false, i, mo25450()));
        }
        String strMo25446 = mo25446();
        EnumC5983 enumC5984 = EnumC5983.CLASS_IN;
        arrayList.add(new C8431(strMo25446, enumC5984, false, i, mo25450()));
        arrayList.add(new C15485(mo25450(), enumC5984, true, i, this.f65077, this.f65085, this.f65079, c7725.f23907));
        arrayList.add(new C21837(mo25450(), enumC5984, true, i, mo25451()));
        return arrayList;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m46329(byte[] bArr) {
        this.f65080 = bArr;
        this.f65081 = null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m46326(C8806 c8806) {
        this.f65078.mo14270(c8806);
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C8806 m46331() {
        return this.f65078.m14274();
    }

    @Override // l.AbstractC10134
    /* JADX INFO: renamed from: ᩹ */
    public final boolean mo25464() {
        return this.f65082;
    }

    @Override // l.AbstractC10134
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo25448(AbstractC10134 abstractC10134) {
        if (abstractC10134 instanceof C20095) {
            C20095 c20095 = (C20095) abstractC10134;
            Set set = c20095.f65076;
            Set set2 = c20095.f65086;
            Set set3 = this.f65086;
            if (set3.size() != set2.size()) {
                return false;
            }
            Set set4 = this.f65076;
            return set4.size() == set.size() && set3.equals(set2) && set4.equals(set);
        }
        InetAddress[] inetAddressArrMo25463 = mo25463();
        InetAddress[] inetAddressArrMo25464 = abstractC10134.mo25463();
        return inetAddressArrMo25463.length == inetAddressArrMo25464.length && new HashSet(Arrays.asList(inetAddressArrMo25463)).equals(new HashSet(Arrays.asList(inetAddressArrMo25464)));
    }
}
