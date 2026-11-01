package p067l;

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
public final class C21467 extends AbstractC12000 implements InterfaceC18428, InterfaceC5688 {

    /* JADX INFO: renamed from: ᩳ֫ */
    public static InterfaceC4410 f67713 = C13128.m30023(C21467.class.getName());

    /* JADX INFO: renamed from: ֫֫ */
    public String f67714;

    /* JADX INFO: renamed from: ۗ */
    public transient String f67715;

    /* JADX INFO: renamed from: ۙ */
    public final Set f67716;

    /* JADX INFO: renamed from: ۛ */
    public int f67717;

    /* JADX INFO: renamed from: ۟ */
    public final C23478 f67718;

    /* JADX INFO: renamed from: ۤ */
    public int f67719;

    /* JADX INFO: renamed from: ۧ֫ */
    public byte[] f67720;

    /* JADX INFO: renamed from: ۨ */
    public Hashtable f67721;

    /* JADX INFO: renamed from: ۫ */
    public boolean f67722;

    /* JADX INFO: renamed from: ۬ */
    public String f67723;

    /* JADX INFO: renamed from: ܰ */
    public String f67724;

    /* JADX INFO: renamed from: ܽ֫ */
    public int f67725;

    /* JADX INFO: renamed from: ᩶ */
    public final Set f67726;

    /* JADX INFO: renamed from: ᩸ */
    public String f67727;

    /* JADX INFO: renamed from: ᩹ */
    public String f67728;

    /* JADX INFO: renamed from: ᩺ */
    public String f67729;

    public C21467() {
        throw null;
    }

    @Override // p067l.AbstractC12000
    /* JADX INFO: renamed from: ܶ */
    public final synchronized boolean mo27477() {
        boolean z;
        z = false;
        if (this.f67724 != null) {
            if ((this.f67726.size() > 0 || this.f67716.size() > 0) && mo27471() != null && mo27471().length > 0) {
                z = true;
            }
        }
        return z;
    }

    public C21467(String str, HashMap map, boolean z) {
        this(map, 0, 0, 0, z, null);
        try {
            this.f67720 = C17422.m39669(str);
            this.f67724 = str;
        } catch (IOException e) {
            throw new RuntimeException(C17588.m40052("Unexpected exception: ", e));
        }
    }

    public C21467(Map map, int i, int i2, int i3, boolean z, byte[] bArr) {
        HashMap mapM48636 = m48636(map);
        this.f67728 = (String) mapM48636.get(EnumC14011.Domain);
        this.f67729 = (String) mapM48636.get(EnumC14011.Protocol);
        this.f67727 = (String) mapM48636.get(EnumC14011.Application);
        this.f67723 = (String) mapM48636.get(EnumC14011.Instance);
        this.f67714 = (String) mapM48636.get(EnumC14011.Subtype);
        this.f67719 = i;
        this.f67725 = i2;
        this.f67717 = i3;
        this.f67720 = bArr;
        this.f67718 = new C23478(this);
        this.f67722 = z;
        this.f67726 = C21562.synchronizedSet(new LinkedHashSet());
        this.f67716 = C21562.synchronizedSet(new LinkedHashSet());
    }

    public C21467(AbstractC12000 abstractC12000) {
        this.f67726 = C21562.synchronizedSet(new LinkedHashSet());
        this.f67716 = C21562.synchronizedSet(new LinkedHashSet());
        if (abstractC12000 != null) {
            this.f67728 = abstractC12000.mo27479();
            this.f67729 = abstractC12000.mo27469();
            this.f67727 = abstractC12000.mo27467();
            this.f67723 = abstractC12000.getName();
            this.f67714 = abstractC12000.mo27465();
            this.f67719 = abstractC12000.mo27474();
            this.f67725 = abstractC12000.mo27473();
            this.f67717 = abstractC12000.mo27478();
            this.f67720 = abstractC12000.mo27471();
            this.f67722 = abstractC12000.mo27484();
            for (Inet6Address inet6Address : abstractC12000.mo27472()) {
                this.f67716.add(inet6Address);
            }
            for (Inet4Address inet4Address : abstractC12000.mo27480()) {
                this.f67726.add(inet4Address);
            }
        }
        this.f67718 = new C23478(this);
    }

    /* JADX INFO: renamed from: ֫ */
    public static HashMap m48636(Map map) {
        HashMap map2 = new HashMap(5);
        EnumC14011 enumC14011 = EnumC14011.Domain;
        String str = "local";
        String str2 = map.containsKey(enumC14011) ? (String) map.get(enumC14011) : "local";
        if (str2 != null && str2.length() != 0) {
            str = str2;
        }
        map2.put(enumC14011, m48637(str));
        EnumC14011 enumC14012 = EnumC14011.Protocol;
        String str3 = "tcp";
        String str4 = map.containsKey(enumC14012) ? (String) map.get(enumC14012) : "tcp";
        if (str4 != null && str4.length() != 0) {
            str3 = str4;
        }
        map2.put(enumC14012, m48637(str3));
        EnumC14011 enumC14013 = EnumC14011.Application;
        String str5 = "";
        String str6 = map.containsKey(enumC14013) ? (String) map.get(enumC14013) : "";
        if (str6 == null || str6.length() == 0) {
            str6 = "";
        }
        map2.put(enumC14013, m48637(str6));
        EnumC14011 enumC14014 = EnumC14011.Instance;
        String str7 = map.containsKey(enumC14014) ? (String) map.get(enumC14014) : "";
        if (str7 == null || str7.length() == 0) {
            str7 = "";
        }
        map2.put(enumC14014, m48637(str7));
        EnumC14011 enumC14015 = EnumC14011.Subtype;
        String str8 = map.containsKey(enumC14015) ? (String) map.get(enumC14015) : "";
        if (str8 != null && str8.length() != 0) {
            str5 = str8;
        }
        map2.put(enumC14015, m48637(str5));
        return map2;
    }

    /* JADX INFO: renamed from: ܽ */
    public static String m48637(String str) {
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
        return strTrim.endsWith(".") ? C17073.m38720(1, 0, strTrim) : strTrim;
    }

    /* JADX INFO: renamed from: ۟ */
    public final boolean m48649() {
        C23478 c23478 = this.f67718;
        c23478.lock();
        try {
            c23478.m16166(EnumC9396.f25674);
            c23478.mo16172(null);
            return false;
        } finally {
            c23478.unlock();
        }
    }

    @Override // p067l.AbstractC12000
    /* JADX INFO: renamed from: ֨ */
    public final String mo27466() {
        String strMo27479 = mo27479();
        String strMo27469 = mo27469();
        String strMo27467 = mo27467();
        StringBuilder sb = new StringBuilder();
        sb.append(strMo27467.length() > 0 ? C6988.m16053("_", strMo27467, ".") : "");
        return C24420.m53894(sb, strMo27469.length() > 0 ? C6988.m16053("_", strMo27469, ".") : "", strMo27479, ".");
    }

    /* JADX INFO: renamed from: ۤ */
    public final String m48650() {
        String strMo27465 = mo27465();
        StringBuilder sb = new StringBuilder();
        sb.append(strMo27465.length() > 0 ? C6988.m16053("_", strMo27465, "._sub.") : "");
        sb.append(mo27466());
        return sb.toString();
    }

    @Override // p067l.AbstractC12000
    public final String getName() {
        String str = this.f67723;
        return str != null ? str : "";
    }

    @Override // p067l.AbstractC12000
    /* JADX INFO: renamed from: ۢ */
    public final String mo27475() {
        if (this.f67715 == null) {
            this.f67715 = mo27470().toLowerCase();
        }
        return this.f67715;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m48639(String str) {
        this.f67723 = str;
        this.f67715 = null;
    }

    @Override // p067l.AbstractC12000
    /* JADX INFO: renamed from: ۘ */
    public final String mo27470() {
        String strMo27479 = mo27479();
        String strMo27469 = mo27469();
        String strMo27467 = mo27467();
        String name = getName();
        StringBuilder sb = new StringBuilder();
        sb.append(name.length() > 0 ? name.concat(".") : "");
        sb.append(strMo27467.length() > 0 ? C6988.m16053("_", strMo27467, ".") : "");
        return C24420.m53894(sb, strMo27469.length() > 0 ? C6988.m16053("_", strMo27469, ".") : "", strMo27479, ".");
    }

    @Override // p067l.AbstractC12000
    /* JADX INFO: renamed from: ᩵ */
    public final String mo27482() {
        String str = this.f67724;
        return str != null ? str : "";
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m48651(String str) {
        this.f67724 = str;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m48640(Inet4Address inet4Address) {
        this.f67726.add(inet4Address);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m48641(Inet6Address inet6Address) {
        this.f67716.add(inet6Address);
    }

    @Override // p067l.AbstractC12000
    @Deprecated
    /* JADX INFO: renamed from: ᩳ */
    public final Inet4Address mo27481() {
        Inet4Address[] inet4AddressArrMo27480 = mo27480();
        if (inet4AddressArrMo27480.length > 0) {
            return inet4AddressArrMo27480[0];
        }
        return null;
    }

    @Override // p067l.AbstractC12000
    @Deprecated
    /* JADX INFO: renamed from: ܳ */
    public final Inet6Address mo27476() {
        Inet6Address[] inet6AddressArrMo27472 = mo27472();
        if (inet6AddressArrMo27472.length > 0) {
            return inet6AddressArrMo27472[0];
        }
        return null;
    }

    @Override // p067l.AbstractC12000
    /* JADX INFO: renamed from: ᩷ */
    public final InetAddress[] mo27483() {
        Set set = this.f67726;
        int size = set.size();
        Set set2 = this.f67716;
        ArrayList arrayList = new ArrayList(set2.size() + size);
        arrayList.addAll(set);
        arrayList.addAll(set2);
        return (InetAddress[]) arrayList.toArray(new InetAddress[arrayList.size()]);
    }

    @Override // p067l.AbstractC12000
    /* JADX INFO: renamed from: ܿ */
    public final Inet4Address[] mo27480() {
        Set set = this.f67726;
        return (Inet4Address[]) set.toArray(new Inet4Address[set.size()]);
    }

    @Override // p067l.AbstractC12000
    /* JADX INFO: renamed from: ۜ */
    public final Inet6Address[] mo27472() {
        Set set = this.f67716;
        return (Inet6Address[]) set.toArray(new Inet6Address[set.size()]);
    }

    @Override // p067l.AbstractC12000
    /* JADX INFO: renamed from: ۡ */
    public final int mo27474() {
        return this.f67719;
    }

    @Override // p067l.AbstractC12000
    /* JADX INFO: renamed from: ܺ */
    public final int mo27478() {
        return this.f67717;
    }

    @Override // p067l.AbstractC12000
    /* JADX INFO: renamed from: ۠ */
    public final int mo27473() {
        return this.f67725;
    }

    @Override // p067l.AbstractC12000
    /* JADX INFO: renamed from: ۚ */
    public final byte[] mo27471() {
        byte[] bArr = this.f67720;
        return (bArr == null || bArr.length <= 0) ? C17422.f52081 : bArr;
    }

    @Override // p067l.AbstractC12000
    /* JADX INFO: renamed from: ֫ */
    public final String mo27467() {
        String str = this.f67727;
        return str != null ? str : "";
    }

    @Override // p067l.AbstractC12000
    /* JADX INFO: renamed from: ܽ */
    public final String mo27479() {
        String str = this.f67728;
        return str != null ? str : "local";
    }

    @Override // p067l.AbstractC12000
    /* JADX INFO: renamed from: ۖ */
    public final String mo27469() {
        String str = this.f67729;
        return str != null ? str : "tcp";
    }

    @Override // p067l.AbstractC12000
    /* JADX INFO: renamed from: ֡ */
    public final String mo27465() {
        String str = this.f67714;
        return str != null ? str : "";
    }

    /* JADX INFO: renamed from: ۫ */
    public final HashMap m48654() {
        HashMap map = new HashMap(5);
        map.put(EnumC14011.Domain, mo27479());
        map.put(EnumC14011.Protocol, mo27469());
        map.put(EnumC14011.Application, mo27467());
        map.put(EnumC14011.Instance, getName());
        map.put(EnumC14011.Subtype, mo27465());
        return map;
    }

    @Override // p067l.InterfaceC18428
    /* JADX INFO: renamed from: ֫ */
    public final void mo41999(C24069 c24069, long j, AbstractC15351 abstractC15351) {
        if (!(abstractC15351 instanceof AbstractC23793)) {
            f67713.mo9190(abstractC15351 == null ? "null" : abstractC15351.getClass().getSimpleName(), "DNSEntry is not of type 'DNSRecord' but of type {}");
            return;
        }
        AbstractC23793 abstractC23793 = (AbstractC23793) abstractC15351;
        boolean z = true;
        if (abstractC23793.mo34939(j)) {
            InterfaceC4410 interfaceC4410 = f67713;
            int i = C22808.f71863[abstractC23793.m34947().ordinal()];
            if (i == 1 || i == 2) {
                if (!abstractC23793.m34943().equalsIgnoreCase(mo27482())) {
                    return;
                }
                InetAddress inetAddress = ((AbstractC21112) abstractC23793).f66372;
                if (EnumC13420.TYPE_A.equals(abstractC23793.m34947())) {
                    Inet4Address inet4Address = (Inet4Address) inetAddress;
                    if (this.f67726.remove(inet4Address)) {
                        interfaceC4410.mo9195(inet4Address, "Removed expired IPv4: {}");
                    } else {
                        interfaceC4410.mo9195(inet4Address, "Expired IPv4 not in this service: {}");
                        return;
                    }
                } else {
                    Inet6Address inet6Address = (Inet6Address) inetAddress;
                    if (this.f67716.remove(inet6Address)) {
                        interfaceC4410.mo9195(inet6Address, "Removed expired IPv6: {}");
                    } else {
                        interfaceC4410.mo9195(inet6Address, "Expired IPv6 not in this service: {}");
                        return;
                    }
                }
            } else {
                interfaceC4410.mo9190(abstractC23793, "Unhandled expired record: {}");
                return;
            }
        } else {
            Set set = this.f67716;
            Set set2 = this.f67726;
            int i2 = C22808.f71863[abstractC23793.m34947().ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 == 4) {
                            if (!abstractC23793.m34943().equalsIgnoreCase(mo27470())) {
                                return;
                            }
                            this.f67720 = ((C23123) abstractC23793).m51565();
                            this.f67721 = null;
                        } else if (i2 != 5 || mo27465().length() != 0 || abstractC23793.m34946().length() == 0) {
                            return;
                        } else {
                            this.f67714 = abstractC23793.m34946();
                        }
                    } else {
                        if (!abstractC23793.m34943().equalsIgnoreCase(mo27470())) {
                            return;
                        }
                        C17086 c17086 = (C17086) abstractC23793;
                        String str = this.f67724;
                        if (str != null && str.equalsIgnoreCase(c17086.m38727())) {
                            z = false;
                        }
                        this.f67724 = c17086.m38727();
                        this.f67719 = c17086.m38728();
                        this.f67725 = c17086.m38726();
                        this.f67717 = c17086.m38725();
                        if (z) {
                            set2.clear();
                            set.clear();
                            Iterator it = c24069.m53335(this.f67724, EnumC13420.TYPE_A, EnumC8055.CLASS_IN).iterator();
                            while (it.hasNext()) {
                                mo41999(c24069, j, (AbstractC15351) it.next());
                            }
                            Iterator it2 = c24069.m53335(this.f67724, EnumC13420.TYPE_AAAA, EnumC8055.CLASS_IN).iterator();
                            while (it2.hasNext()) {
                                mo41999(c24069, j, (AbstractC15351) it2.next());
                            }
                            return;
                        }
                    }
                } else {
                    if (!abstractC23793.m34943().equalsIgnoreCase(mo27482())) {
                        return;
                    }
                    InetAddress inetAddress2 = ((AbstractC21112) abstractC23793).f66372;
                    if (!(inetAddress2 instanceof Inet6Address) || !set.add((Inet6Address) inetAddress2)) {
                        return;
                    }
                }
            } else {
                if (!abstractC23793.m34943().equalsIgnoreCase(mo27482())) {
                    return;
                }
                InetAddress inetAddress3 = ((AbstractC21112) abstractC23793).f66372;
                if (!(inetAddress3 instanceof Inet4Address) || !set2.add((Inet4Address) inetAddress3)) {
                    return;
                }
            }
        }
        C10738 c10738M16171 = this.f67718.m16171();
        if (c10738M16171 != null) {
            if (mo27477()) {
                c10738M16171.m24699(new C16771(c10738M16171, mo27466(), getName(), clone()));
            }
            synchronized (this) {
                notifyAll();
            }
            return;
        }
        f67713.mo9183("JmDNS not available.");
    }

    @Override // p067l.InterfaceC5688
    /* JADX INFO: renamed from: ֫ */
    public final void mo12669(AbstractC4012 abstractC4012) {
        this.f67718.mo12669(abstractC4012);
    }

    /* JADX INFO: renamed from: ֫֫ */
    public final void m48646() {
        this.f67718.m16173();
    }

    /* JADX INFO: renamed from: ᩶ */
    public final boolean m48657() {
        return this.f67718.m16170();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m48643(AbstractC22118 abstractC22118) {
        this.f67718.m16168(abstractC22118);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m48644(AbstractC22118 abstractC22118, EnumC9396 enumC9396) {
        this.f67718.m16169(abstractC22118, enumC9396);
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m48652(AbstractC22118 abstractC22118, EnumC9396 enumC9396) {
        C23478 c23478 = this.f67718;
        c23478.lock();
        try {
            return c23478.f18315 == abstractC22118 && c23478.f18316 == enumC9396;
        } finally {
            c23478.unlock();
        }
    }

    /* JADX INFO: renamed from: ܰ */
    public final boolean m48655() {
        return this.f67718.f18316.m21888();
    }

    /* JADX INFO: renamed from: ۨ */
    public final boolean m48653() {
        return this.f67718.f18316.m21889();
    }

    /* JADX INFO: renamed from: ۛ */
    public final boolean m48648() {
        return this.f67718.f18316.m21887();
    }

    /* JADX INFO: renamed from: ܽ֫ */
    public final boolean m48656() {
        return this.f67718.m16174();
    }

    public final int hashCode() {
        return mo27470().hashCode();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C21467) && mo27470().equals(((C21467) obj).mo27470());
    }

    @Override // p067l.AbstractC12000
    public final C21467 clone() {
        C21467 c21467 = new C21467(m48654(), this.f67719, this.f67725, this.f67717, this.f67722, this.f67720);
        c21467.f67724 = this.f67724;
        for (Inet6Address inet6Address : mo27472()) {
            c21467.f67716.add(inet6Address);
        }
        for (Inet4Address inet4Address : mo27480()) {
            c21467.f67726.add(inet4Address);
        }
        return c21467;
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
        sb.append(m48650());
        sb.append("' address: '");
        InetAddress[] inetAddressArrMo27483 = mo27483();
        if (inetAddressArrMo27483.length > 0) {
            for (InetAddress inetAddress : inetAddressArrMo27483) {
                sb.append(inetAddress);
                sb.append(':');
                sb.append(this.f67719);
                sb.append(' ');
            }
        } else {
            sb.append("(null):");
            sb.append(this.f67719);
        }
        sb.append("' status: '");
        sb.append(this.f67718.toString());
        sb.append(this.f67722 ? "' is persistent," : "',");
        if (mo27477()) {
            sb.append(" has data");
        } else {
            sb.append(" has NO data");
        }
        if (mo27471().length > 0) {
            synchronized (this) {
                if (this.f67721 == null && mo27471() != null) {
                    Hashtable hashtable = new Hashtable();
                    try {
                        C17422.m39668(hashtable, mo27471());
                    } catch (Exception e) {
                        f67713.mo9178("Malformed TXT Field ", (Throwable) e);
                    }
                    this.f67721 = hashtable;
                }
                map = this.f67721;
                if (map == null) {
                    map = Collections.EMPTY_MAP;
                }
            }
            if (map.isEmpty()) {
                sb.append(", empty");
            } else {
                for (Map.Entry entry : map.entrySet()) {
                    byte[] bArr = (byte[]) entry.getValue();
                    byte[] bArr2 = C17422.f52082;
                    String strM39667 = C17422.m39667(0, bArr.length, bArr);
                    sb.append("\n\t");
                    C21545.m48729(sb, (String) entry.getKey(), ": ", strM39667);
                }
            }
        }
        sb.append(']');
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫ */
    public final ArrayList m48638(EnumC8055 enumC8055, int i, C9711 c9711) {
        ArrayList arrayList = new ArrayList();
        if (enumC8055 != EnumC8055.CLASS_ANY && enumC8055 != EnumC8055.CLASS_IN) {
            return arrayList;
        }
        if (mo27465().length() > 0) {
            arrayList.add(new C10382(m48650(), EnumC8055.CLASS_IN, false, i, mo27470()));
        }
        String strMo27466 = mo27466();
        EnumC8055 enumC8056 = EnumC8055.CLASS_IN;
        arrayList.add(new C10382(strMo27466, enumC8056, false, i, mo27470()));
        arrayList.add(new C17086(mo27470(), enumC8056, true, i, this.f67717, this.f67725, this.f67719, c9711.f26820));
        arrayList.add(new C23123(mo27470(), enumC8056, true, i, mo27471()));
        return arrayList;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m48645(byte[] bArr) {
        this.f67720 = bArr;
        this.f67721 = null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m48642(C10738 c10738) {
        this.f67718.mo16167(c10738);
    }

    /* JADX INFO: renamed from: ۗ */
    public final C10738 m48647() {
        return this.f67718.m16171();
    }

    @Override // p067l.AbstractC12000
    /* JADX INFO: renamed from: ᩹ */
    public final boolean mo27484() {
        return this.f67722;
    }

    @Override // p067l.AbstractC12000
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo27468(AbstractC12000 abstractC12000) {
        if (abstractC12000 instanceof C21467) {
            C21467 c21467 = (C21467) abstractC12000;
            Set set = c21467.f67716;
            Set set2 = c21467.f67726;
            Set set3 = this.f67726;
            if (set3.size() != set2.size()) {
                return false;
            }
            Set set4 = this.f67716;
            return set4.size() == set.size() && set3.equals(set2) && set4.equals(set);
        }
        InetAddress[] inetAddressArrMo27483 = mo27483();
        InetAddress[] inetAddressArrMo27484 = abstractC12000.mo27483();
        return inetAddressArrMo27483.length == inetAddressArrMo27484.length && new HashSet(Arrays.asList(inetAddressArrMo27483)).equals(new HashSet(Arrays.asList(inetAddressArrMo27484)));
    }
}
