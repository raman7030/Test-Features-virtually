package l;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.۟᩷ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: A797 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7714 implements InterfaceC8795 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final String[] f23826 = new String[0];

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final String f23827;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC17261 f23834;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f23837;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final HashMap f23839 = new HashMap();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final HashMap f23828 = new HashMap();

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final HashSet f23832 = new HashSet();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final HashSet f23842 = new HashSet();

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final HashSet f23833 = new HashSet();

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final HashMap f23841 = new HashMap();

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final HashMap f23830 = new HashMap();

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final HashSet f23840 = new HashSet();

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final HashSet f23843 = new HashSet();

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final HashSet f23836 = new HashSet();

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final HashSet f23835 = new HashSet();

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final HashSet f23831 = new HashSet();

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final HashSet f23829 = new HashSet();

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f23838 = new ArrayDeque();

    public C7714(String str, C20790 c20790) {
        this.f23827 = str;
        this.f23834 = c20790;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m20664(String str, C6303 c6303) {
        this.f23839.put(str, c6303);
        String str2 = c6303.f19486;
        if (str2 != null) {
            this.f23833.add(str2);
        }
        for (String str3 : c6303.f19487) {
            this.f23842.add(str3);
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private C6303 m20659(String str) {
        C16555 c16555Mo40556;
        HashMap map = this.f23828;
        C6303 c6303 = (C6303) map.get(str);
        if (c6303 != null) {
            return c6303;
        }
        C6303 c6304 = (C6303) this.f23839.get(str);
        if (!this.f23837 && (c6304 == null || !c6304.f19482)) {
            HashSet hashSet = this.f23832;
            if (c6304 != null || !hashSet.contains(str)) {
                try {
                    c16555Mo40556 = this.f23834.mo40556(str, this.f23827);
                    if (c16555Mo40556.f50865 == EnumC17967.FOUND) {
                        C6303 c6303M17345 = C6303.m17345(c16555Mo40556.f50864);
                        map.put(str, c6303M17345);
                        String str2 = c6303M17345.f19486;
                        if (str2 != null) {
                            this.f23833.add(str2);
                        }
                        for (String str3 : c6303M17345.f19487) {
                            this.f23842.add(str3);
                        }
                        return c6303M17345;
                    }
                } catch (RuntimeException unused) {
                    c16555Mo40556 = C16555.f50863;
                }
                if (c16555Mo40556.f50865 == EnumC17967.UNAVAILABLE) {
                    this.f23837 = true;
                } else if (c6304 != null) {
                    c6304.f19482 = true;
                } else {
                    hashSet.add(str);
                }
            }
        }
        return c6304;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private boolean m20661(String str) {
        C6303 c6303 = (C6303) this.f23839.get(str);
        return c6303 != null && m20659(str) == c6303;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private EnumC9501 m20631(String str, String str2, String str3, C14063 c14063, boolean z) {
        C23236 c23236 = c14063.f42487;
        if (str3.equals(str2)) {
            return EnumC9501.CONTRACT;
        }
        HashSet hashSet = new HashSet();
        while (str != null && hashSet.add(str)) {
            if (str.equals(str2)) {
                if (z && c23236.f74664 && m20660(str2, str3)) {
                    return EnumC9501.CONTRACT;
                }
                return EnumC9501.NONE;
            }
            C6303 c6303M20659 = m20659(str);
            if (c6303M20659 == null) {
                return EnumC9501.NONE;
            }
            if (str.equals(str3) && c23236.f74664) {
                return EnumC9501.CONTRACT;
            }
            if (c6303M20659.m17352() && (c6303M20659.m17351() || c6303M20659.m17357() || (!c6303M20659.m17355() && m20656(str, str2)))) {
                C23236 c23236M51560 = C23236.m51560(str, c6303M20659.m17354(), true);
                HashSet hashSet2 = c14063.f42489;
                String str4 = c23236.f74662;
                if (str4 != null) {
                    if (str4.equals(str)) {
                        return EnumC9501.POSSIBLE;
                    }
                    if (m20653(str, c23236M51560, hashSet2)) {
                        return EnumC9501.NONE;
                    }
                } else if (m20653(str, c23236M51560, hashSet2)) {
                    return EnumC9501.CONTRACT;
                }
                if (!c6303M20659.m17355() && m20656(str, str2)) {
                    return EnumC9501.NONE;
                }
            }
            str = c6303M20659.f19486;
        }
        return EnumC9501.NONE;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private C14063 m20646(String str) {
        HashMap map = this.f23841;
        C14063 c14063 = (C14063) map.get(str);
        if (c14063 != null) {
            return c14063;
        }
        C6303 c6303M20659 = m20659(str);
        boolean z = c6303M20659 != null && c6303M20659.m17350();
        C23236 c23236M20663 = z ? C23236.f74660 : m20663(str);
        HashSet hashSet = new HashSet();
        if (!z) {
            m20635(str, c23236M20663, hashSet);
        }
        C14063 c14064 = new C14063(z, c23236M20663, hashSet);
        map.put(str, c14064);
        return c14064;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private C23236 m20663(String str) {
        C6303 c6303M20659;
        C6303 c6303M206510 = m20659(str);
        if (c6303M206510 == null) {
            return C23236.f74660;
        }
        if (c6303M206510.m17352()) {
            return C23236.m51560(str, c6303M206510.m17354(), !c6303M206510.m17353());
        }
        if (c6303M206510.m17353()) {
            if (!c6303M206510.m17356() && (c6303M20659 = m20659("Ljava/lang/Object;")) != null && c6303M20659.m17352() && c6303M20659.m17351()) {
                return C23236.m51560("Ljava/lang/Object;", c6303M20659.m17354(), true);
            }
            return m20655(str);
        }
        String str2 = c6303M206510.f19486;
        HashSet hashSet = this.f23836;
        hashSet.clear();
        while (str2 != null && hashSet.add(str2)) {
            C6303 c6303M206511 = m20659(str2);
            if (c6303M206511 == null) {
                break;
            }
            if (c6303M206511.m17352() && m20636(str, str2, c6303M206511)) {
                C23236 c23236M51560 = C23236.m51560(str2, c6303M206511.m17354(), true);
                hashSet.clear();
                return c23236M51560;
            }
            str2 = c6303M206511.f19486;
        }
        hashSet.clear();
        return m20655(str);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private C23236 m20655(String str) {
        HashSet<String> hashSet = new HashSet();
        boolean zM20651 = m20651(str, hashSet, new HashSet());
        if (hashSet.isEmpty()) {
            return zM20651 ? C23236.f74659 : C23236.f74660;
        }
        ArrayList<String> arrayList = new ArrayList();
        for (String str2 : hashSet) {
            Iterator it = hashSet.iterator();
            while (true) {
                if (it.hasNext()) {
                    String str3 = (String) it.next();
                    if (!str2.equals(str3)) {
                        HashSet hashSet2 = this.f23843;
                        hashSet2.clear();
                        boolean zM20649 = m20649(str3, str2, hashSet2);
                        hashSet2.clear();
                        if (zM20649) {
                            break;
                        }
                    }
                } else {
                    arrayList.add(str2);
                    break;
                }
            }
        }
        int i = 0;
        String str4 = null;
        for (String str5 : arrayList) {
            C6303 c6303M20659 = m20659(str5);
            if (c6303M20659 != null && c6303M20659.m17354()) {
                i++;
                str4 = str5;
            }
        }
        return new C23236((String[]) arrayList.toArray(new String[arrayList.size()]), i == 1 ? str4 : null, false, false);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private boolean m20651(String str, HashSet hashSet, HashSet hashSet2) {
        C6303 c6303M20659 = m20659(str);
        int i = 0;
        if (!hashSet2.add(str) || c6303M20659 == null) {
            return false;
        }
        boolean zM17356 = c6303M20659.m17356();
        if (c6303M20659.m17353()) {
            if (c6303M20659.m17352()) {
                hashSet.add(str);
            }
            String[] strArr = c6303M20659.f19487;
            int length = strArr.length;
            while (i < length) {
                zM17356 |= m20651(strArr[i], hashSet, hashSet2);
                i++;
            }
            return zM17356;
        }
        String[] strArr2 = c6303M20659.f19487;
        int length2 = strArr2.length;
        while (i < length2) {
            zM17356 |= m20651(strArr2[i], hashSet, hashSet2);
            i++;
        }
        String str2 = c6303M20659.f19486;
        return str2 != null ? m20651(str2, hashSet, hashSet2) | zM17356 : zM17356;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m20635(String str, C23236 c23236, HashSet hashSet) {
        C6303 c6303M20659;
        ArrayDeque arrayDeque = this.f23838;
        arrayDeque.clear();
        for (String str2 : c23236.f74663) {
            if (hashSet.add(str2)) {
                arrayDeque.addLast(str2);
            }
        }
        if (c23236.f74661) {
            String[] strArr = c23236.f74663;
            if (strArr.length == 1 && (c6303M20659 = m20659(strArr[0])) != null && c6303M20659.m17351()) {
                HashSet hashSet2 = this.f23831;
                hashSet2.clear();
                m20633(str, hashSet);
                hashSet2.clear();
            }
        }
        while (!arrayDeque.isEmpty()) {
            String str3 = (String) arrayDeque.removeFirst();
            C6303 c6303M206510 = m20659(str3);
            if (c6303M206510 != null) {
                HashSet hashSet3 = this.f23835;
                hashSet3.clear();
                String str4 = c6303M206510.f19486;
                if (str4 != null) {
                    m20632(str4, str3, hashSet);
                }
                if (c6303M206510.m17351()) {
                    for (String str5 : c6303M206510.f19487) {
                        m20632(str5, str3, hashSet);
                    }
                }
                hashSet3.clear();
            }
        }
        arrayDeque.clear();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m20633(String str, HashSet hashSet) {
        C6303 c6303M20659;
        if (this.f23831.add(str) && (c6303M20659 = m20659(str)) != null) {
            int i = 0;
            if (c6303M20659.m17353()) {
                if (c6303M20659.m17352() && hashSet.add(str)) {
                    this.f23838.addLast(str);
                }
                String[] strArr = c6303M20659.f19487;
                int length = strArr.length;
                while (i < length) {
                    m20633(strArr[i], hashSet);
                    i++;
                }
                return;
            }
            String[] strArr2 = c6303M20659.f19487;
            int length2 = strArr2.length;
            while (i < length2) {
                m20633(strArr2[i], hashSet);
                i++;
            }
            String str2 = c6303M20659.f19486;
            if (str2 != null) {
                m20633(str2, hashSet);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m20632(String str, String str2, HashSet hashSet) {
        C6303 c6303M20659;
        if (this.f23835.add(str) && (c6303M20659 = m20659(str)) != null) {
            if (c6303M20659.m17352() && m20636(str2, str, c6303M20659) && hashSet.add(str)) {
                this.f23838.addLast(str);
            }
            String str3 = c6303M20659.f19486;
            if (str3 != null) {
                m20632(str3, str2, hashSet);
            }
            for (String str4 : c6303M20659.f19487) {
                m20632(str4, str2, hashSet);
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private boolean m20653(String str, C23236 c23236, HashSet hashSet) {
        HashSet hashSet2 = this.f23829;
        hashSet2.clear();
        m20635(str, c23236, hashSet2);
        boolean zM20641 = m20641(hashSet2, hashSet);
        hashSet2.clear();
        return zM20641;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private boolean m20652(String str, C23236 c23236, String str2, C23236 c23237) {
        if (!c23236.f74664 && !c23237.f74664) {
            return false;
        }
        if (str.equals(str2)) {
            return true;
        }
        if (c23236.f74664 && m20660(str2, str) && m20644(c23237, str)) {
            return true;
        }
        return c23237.f74664 && m20660(str, str2) && m20644(c23236, str2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m20644(C23236 c23236, String str) {
        if (c23236.f74664) {
            return true;
        }
        C6303 c6303M20659 = m20659(str);
        if (c6303M20659 != null) {
            String[] strArr = c23236.f74663;
            if (strArr.length != 0) {
                for (String str2 : strArr) {
                    C6303 c6303M206510 = m20659(str2);
                    if (c6303M206510 != null) {
                        if (c6303M206510.m17351()) {
                            return true;
                        }
                        if (!c6303M20659.m17353() && c23236.f74661 && c6303M206510.m17357()) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m20641(HashSet hashSet, HashSet hashSet2) {
        HashSet hashSet3 = hashSet.size() <= hashSet2.size() ? hashSet : hashSet2;
        if (hashSet3 == hashSet) {
            hashSet = hashSet2;
        }
        Iterator it = hashSet3.iterator();
        while (it.hasNext()) {
            if (hashSet.contains((String) it.next())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m20638(String str, C23236 c23236, String str2, C23236 c23237) {
        if (m20661(str2) && c23237.f74663.length == 0 && m20662(str, str2) && m20640(str2, c23237, c23236)) {
            return true;
        }
        return m20661(str) && c23236.f74663.length == 0 && m20662(str2, str) && m20640(str, c23236, c23237);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0089  */
    /* JADX WARN: Code duplicated, block: B:41:0x008f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0092  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c2  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m20637(String str, C23236 c23236, String str2, C14063 c14063, boolean z) {
        C11948 c11948;
        boolean z2 = m20661(str2) && c14063.f42487.f74663.length == 0;
        boolean z3 = m20661(str) && c23236.f74663.length == 0;
        if (z2 || z3) {
            if (c14063.f42488 == null) {
                HashSet hashSet = new HashSet();
                m20634(str2, hashSet, new HashSet());
                c14063.f42488 = new C11948(m20630(str2), hashSet);
            }
            C11948 c11949 = c14063.f42488;
            String str3 = c11949.f35711;
            HashSet hashSet2 = c11949.f35710;
            if (str3 != null || !hashSet2.isEmpty()) {
                if (!z) {
                    if (str.equals(str2)) {
                        c11948 = c11949;
                    } else {
                        HashSet hashSet3 = new HashSet();
                        m20634(str, hashSet3, new HashSet());
                        c11948 = new C11948(m20630(str), hashSet3);
                    }
                    if (z2) {
                    }
                    if (z3) {
                        if (m20639(str, c23236, c11948, str2, c14063.f42487, c11949)) {
                            return true;
                        }
                    }
                } else {
                    HashSet hashSet4 = this.f23832;
                    if (str3 == null || hashSet4.contains(str3)) {
                        Iterator it = hashSet2.iterator();
                        while (it.hasNext()) {
                            if (!hashSet4.contains((String) it.next())) {
                            }
                        }
                        if (str3 != null || !hashSet2.isEmpty()) {
                            if (str.equals(str2)) {
                                c11948 = c11949;
                            } else {
                                HashSet hashSet5 = new HashSet();
                                m20634(str, hashSet5, new HashSet());
                                c11948 = new C11948(m20630(str), hashSet5);
                            }
                            if (z2 || !m20639(str2, c14063.f42487, c11949, str, c23236, c11948)) {
                                if (z3) {
                                    if (m20639(str, c23236, c11948, str2, c14063.f42487, c11949)) {
                                    }
                                }
                            }
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m20639(String str, C23236 c23236, C11948 c11948, String str2, C23236 c23237, C11948 c11949) {
        C6303 c6303;
        boolean zEquals;
        if (c23236.f74663.length != 0 || !m20661(str2) || (c6303 = (C6303) this.f23839.get(str)) == null) {
            return false;
        }
        HashSet hashSet = c11948.f35710;
        String str3 = c11948.f35711;
        HashSet hashSet2 = c11948.f35710;
        boolean z = !hashSet.isEmpty() && hashSet2.equals(c11949.f35710);
        if (c6303.m17353()) {
            return z && m20643(c23237);
        }
        if (str3 == null) {
            zEquals = c11949.f35711 == null;
        } else {
            zEquals = str3.equals(c11949.f35711);
        }
        if (zEquals && hashSet2.equals(c11949.f35710)) {
            if (z && m20643(c23237)) {
                return true;
            }
            if (str3 != null && m20654(c23237, str3)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m20634(String str, HashSet hashSet, HashSet hashSet2) {
        String str2;
        if (hashSet2.add(str)) {
            C6303 c6303M20659 = m20659(str);
            if (c6303M20659 == null) {
                if (m20647(str)) {
                    hashSet.add(str);
                    return;
                }
                return;
            }
            for (String str3 : c6303M20659.f19487) {
                m20634(str3, hashSet, hashSet2);
            }
            if (c6303M20659.m17353() || (str2 = c6303M20659.f19486) == null) {
                return;
            }
            m20634(str2, hashSet, hashSet2);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m20640(String str, C23236 c23236, C23236 c23237) {
        if (c23236.f74663.length != 0) {
            return false;
        }
        HashSet hashSet = this.f23831;
        hashSet.clear();
        boolean zM20650 = m20650(str, hashSet);
        hashSet.clear();
        if (zM20650 && m20643(c23237)) {
            return true;
        }
        String strM20630 = m20630(str);
        return strM20630 != null && m20654(c23237, strM20630);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private boolean m20650(String str, HashSet hashSet) {
        String str2;
        if (!hashSet.add(str)) {
            return false;
        }
        C6303 c6303M20659 = m20659(str);
        if (c6303M20659 == null) {
            return m20647(str);
        }
        for (String str3 : c6303M20659.f19487) {
            if (m20650(str3, hashSet)) {
                return true;
            }
        }
        return (c6303M20659.m17353() || (str2 = c6303M20659.f19486) == null || !m20650(str2, hashSet)) ? false : true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private String m20630(String str) {
        HashSet hashSet = this.f23836;
        hashSet.clear();
        while (str != null && hashSet.add(str)) {
            C6303 c6303M20659 = m20659(str);
            if (c6303M20659 == null) {
                if (!m20657(str)) {
                    str = null;
                }
                hashSet.clear();
                return str;
            }
            if (c6303M20659.m17353()) {
                hashSet.clear();
                return null;
            }
            str = c6303M20659.f19486;
        }
        hashSet.clear();
        return null;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private boolean m20654(C23236 c23236, String str) {
        String str2;
        C6303 c6303M20659;
        String[] strArr = c23236.f74663;
        return strArr.length == 0 || (c23236.f74661 && strArr.length == 1 && (c6303M20659 = m20659((str2 = strArr[0]))) != null && (c6303M20659.m17351() || c6303M20659.m17357() || (!c6303M20659.m17355() && m20656(str2, str))));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m20643(C23236 c23236) {
        String[] strArr = c23236.f74663;
        if (strArr.length == 0) {
            return true;
        }
        for (String str : strArr) {
            C6303 c6303M20659 = m20659(str);
            if (c6303M20659 != null && c6303M20659.m17351()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private boolean m20648(String str, String str2) {
        boolean zEquals = str.equals(str2);
        HashSet hashSet = new HashSet();
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.addLast(str);
        while (true) {
            if (arrayDeque.isEmpty()) {
                return false;
            }
            String str3 = (String) arrayDeque.removeFirst();
            if (hashSet.add(str3)) {
                C6303 c6303M20659 = m20659(str3);
                if (c6303M20659 == null) {
                    if (m20647(str3) && (zEquals || str3.equals(str2))) {
                        return true;
                    }
                } else {
                    for (String str4 : c6303M20659.f19487) {
                        arrayDeque.addLast(str4);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private boolean m20658(String str, String str2) {
        boolean zEquals = str.equals(str2);
        HashSet hashSet = new HashSet();
        while (str != null && hashSet.add(str)) {
            C6303 c6303M20659 = m20659(str);
            if (c6303M20659 == null) {
                return m20657(str) && (zEquals || str.equals(str2));
            }
            str = c6303M20659.f19486;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private boolean m20647(String str) {
        return m20659(str) == null && this.f23842.contains(str);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private boolean m20657(String str) {
        return m20659(str) == null && this.f23833.contains(str);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m20636(String str, String str2, C6303 c6303) {
        C6303 c6303M20659 = m20659(str);
        if (c6303.m17351() || c6303.m17357()) {
            return true;
        }
        return c6303M20659 != null && c6303M20659.m17355() == c6303.m17355() && m20656(str, str2);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static boolean m20656(String str, String str2) {
        int iLastIndexOf = str.lastIndexOf(47);
        return iLastIndexOf == str2.lastIndexOf(47) && str.regionMatches(0, str2, 0, iLastIndexOf + 1);
    }

    @Override // l.InterfaceC8795
    /* JADX INFO: renamed from: ֫ */
    public final EnumC9501 mo14250(String str, String str2, String str3, String str4) {
        String str5;
        C23236 c23236M20655;
        C23236 c23236M20656;
        if (!this.f23827.equals(str4)) {
            return EnumC9501.NONE;
        }
        C14063 c14063M20646 = m20646(str3);
        C23236 c23236 = c14063M20646.f42487;
        if (c14063M20646.f42483) {
            return EnumC9501.NONE;
        }
        C6303 c6303M20659 = m20659(str);
        C6303 c6303M206510 = m20659(str2);
        if (c6303M20659 == null) {
            return EnumC9501.NONE;
        }
        boolean zM20647 = m20647(str2);
        boolean zM20657 = m20657(str2);
        if (c6303M206510 == null || !c6303M206510.m17353()) {
            if (zM20647) {
                if (str.equals(str2) || !m20660(str, str2)) {
                    return EnumC9501.NONE;
                }
                return (str3.equals(str2) || (c23236.f74663.length == 0 && m20648(str3, str2))) ? EnumC9501.CONTRACT : EnumC9501.NONE;
            }
            if (c6303M206510 == null && !zM20657) {
                return EnumC9501.NONE;
            }
            if (c6303M20659.m17353() || str.equals(str2) || !m20660(str, str2) || (str5 = c6303M20659.f19486) == null) {
                return EnumC9501.NONE;
            }
            if (zM20657) {
                if (c23236.f74663.length == 0 && m20658(str3, str2)) {
                    return EnumC9501.CONTRACT;
                }
                return m20631(str5, str2, str3, c14063M20646, false);
            }
            C23236 c23236M20663 = m20663(str2);
            if (c23236M20663.f74663.length == 0) {
                if (c23236M20663.f74664) {
                    if (!m20652(str2, c23236M20663, str3, c23236)) {
                        return EnumC9501.NONE;
                    }
                    return m20631(str5, str2, str3, c14063M20646, true);
                }
                String strM20630 = m20630(str2);
                if (strM20630 == null) {
                    return EnumC9501.NONE;
                }
                if (c23236.f74663.length == 0 && (m20658(str2, str3) || m20638(str2, c23236M20663, str3, c23236) || m20637(str2, c23236M20663, str3, c14063M20646, false))) {
                    return EnumC9501.CONTRACT;
                }
                return m20631(str5, strM20630, str3, c14063M20646, false);
            }
            C23236 c23236M20664 = m20663(str2);
            HashSet hashSet = new HashSet();
            m20635(str2, c23236M20664, hashSet);
            if (hashSet.isEmpty()) {
                c23236M20655 = C23236.f74660;
            } else {
                HashSet hashSet2 = new HashSet();
                String str6 = str5;
                while (true) {
                    if (str6 != null && hashSet2.add(str6)) {
                        C6303 c6303M206511 = m20659(str6);
                        if (c6303M206511 != null) {
                            if (c6303M206511.m17352()) {
                                C23236 c23236M51560 = C23236.m51560(str6, c6303M206511.m17354(), true);
                                if (m20653(str6, c23236M51560, hashSet)) {
                                    c23236M20655 = c23236M51560;
                                }
                            }
                            str6 = c6303M206511.f19486;
                        }
                    }
                    c23236M20655 = m20655(str5);
                    if (!m20653(str5, c23236M20655, hashSet)) {
                        c23236M20655 = C23236.f74660;
                    }
                }
            }
            C23236 c23237 = c23236M20655;
            str2 = str5;
            c23236M20656 = c23237;
        } else {
            if (str.equals(str2) || !m20660(str, str2)) {
                return EnumC9501.NONE;
            }
            c23236M20656 = m20655(str2);
            if (c23236M20656.f74664 && str3.equals(str2)) {
                return EnumC9501.CONTRACT;
            }
            if (c23236M20656.f74663.length == 0 && c23236.f74663.length == 0 && (m20652(str2, c23236M20656, str3, c23236) || m20648(str2, str3) || m20638(str2, c23236M20656, str3, c23236) || m20637(str2, c23236M20656, str3, c14063M20646, false))) {
                return EnumC9501.CONTRACT;
            }
        }
        String str7 = c23236.f74662;
        if (str7 == null) {
            return m20653(str2, c23236M20656, c14063M20646.f42489) ? EnumC9501.CONTRACT : EnumC9501.NONE;
        }
        if (!str7.equals(c23236M20656.f74662)) {
            return EnumC9501.NONE;
        }
        return EnumC9501.EXACT;
    }

    @Override // l.InterfaceC8795
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo14251(String str, String str2) {
        if (!this.f23827.equals(str2)) {
            return false;
        }
        C14063 c14063M20646 = m20646(str);
        if (!c14063M20646.f42483) {
            return c14063M20646.f42487.f74662 != null;
        }
        C6303 c6303M20659 = m20659(str);
        return c6303M20659 != null && c6303M20659.m17354();
    }

    @Override // l.InterfaceC8795
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo14252(String str, String str2, String str3) {
        if (!this.f23827.equals(str3)) {
            return false;
        }
        C14063 c14063M20646 = m20646(str2);
        HashMap map = c14063M20646.f42484;
        C23236 c23236 = c14063M20646.f42487;
        if (c14063M20646.f42483) {
            return false;
        }
        String str4 = c23236.f74662;
        String str5 = c23236.f74662;
        if (str4 == null) {
            return false;
        }
        C6303 c6303M20659 = m20659(str);
        if (c6303M20659 != null && c6303M20659.m17350()) {
            return false;
        }
        Boolean bool = (Boolean) map.get(str);
        if (bool != null) {
            return bool.booleanValue();
        }
        C23236 c23236M20663 = m20663(str);
        boolean z = (c23236M20663.f74664 || c23236.f74664) ? false : true;
        boolean zEquals = str5.equals(c23236M20663.f74662);
        if (!zEquals) {
            zEquals = m20652(str, c23236M20663, str2, c23236);
        }
        if (!zEquals && m20647(str)) {
            zEquals = !m20662(str2, str) ? false : m20643(m20663(str2));
        }
        if (!zEquals && m20657(str)) {
            zEquals = !m20662(str2, str) ? false : m20654(m20663(str2), str);
        }
        if (!zEquals && z) {
            zEquals = m20638(str, c23236M20663, str2, c23236);
        }
        if (!zEquals && z && m20662(str2, str)) {
            zEquals = m20653(str, c23236M20663, c14063M20646.f42489);
        }
        if (!zEquals) {
            if (c14063M20646.f42486 == null) {
                HashSet hashSet = new HashSet();
                HashSet hashSet2 = new HashSet();
                HashSet hashSet3 = new HashSet();
                HashSet hashSet4 = new HashSet();
                ArrayDeque arrayDeque = new ArrayDeque();
                for (Map.Entry entry : this.f23839.entrySet()) {
                    if (m20661((String) entry.getKey()) && !((C6303) entry.getValue()).m17353()) {
                        String str6 = (String) entry.getKey();
                        C23236 c23236M20664 = m20663(str6);
                        if (str5.equals(c23236M20664.f74662)) {
                            hashSet2.clear();
                            m20635(str6, c23236M20664, hashSet2);
                            hashSet4.clear();
                            arrayDeque.clear();
                            arrayDeque.addLast(str6);
                            while (!arrayDeque.isEmpty()) {
                                String str7 = (String) arrayDeque.removeFirst();
                                if (hashSet4.add(str7)) {
                                    C6303 c6303M206510 = m20659(str7);
                                    if (c6303M206510 == null) {
                                        if ((m20647(str7) && m20643(c23236M20664)) || (m20657(str7) && m20654(c23236M20664, str7))) {
                                            hashSet.add(str7);
                                        }
                                    } else {
                                        hashSet3.clear();
                                        C23236 c23236M20665 = m20663(str7);
                                        m20635(str7, c23236M20665, hashSet3);
                                        if (m20641(hashSet2, hashSet3) || m20640(str7, c23236M20665, c23236M20664)) {
                                            hashSet.add(str7);
                                        }
                                        String str8 = c6303M206510.f19486;
                                        if (str8 != null) {
                                            arrayDeque.addLast(str8);
                                        }
                                        for (String str9 : c6303M206510.f19487) {
                                            arrayDeque.addLast(str9);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                c14063M20646.f42486 = hashSet;
            }
            zEquals = c14063M20646.f42486.contains(str);
        }
        map.put(str, Boolean.valueOf(zEquals));
        return zEquals;
    }

    /* JADX WARN: Code duplicated, block: B:64:0x00d0 A[PHI: r2
      0x00d0: PHI (r2v8 boolean) = (r2v7 boolean), (r2v9 boolean) binds: [B:52:0x00a9, B:60:0x00ba] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.InterfaceC8795
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo14253(String str, String str2, String str3) {
        C23236 c23236M20663;
        boolean zM20654;
        boolean zM20637;
        boolean z = false;
        if (this.f23827.equals(str3)) {
            C14063 c14063M20646 = m20646(str2);
            HashSet hashSet = c14063M20646.f42489;
            HashMap map = c14063M20646.f42485;
            C23236 c23236 = c14063M20646.f42487;
            C6303 c6303M20659 = m20659(str);
            if (!c14063M20646.f42483 && (c6303M20659 == null || !c6303M20659.m17350())) {
                Boolean bool = (Boolean) map.get(str);
                if (bool != null) {
                    return bool.booleanValue();
                }
                C23236 c23236M20664 = m20663(str);
                boolean zM20652 = m20652(str, c23236M20664, str2, c23236);
                if (zM20652 || !m20647(str)) {
                    if (zM20652 || !m20657(str)) {
                        if (zM20652 || !hashSet.isEmpty()) {
                            if (!zM20652) {
                                zM20652 = m20653(str, c23236M20664, hashSet);
                            }
                        } else if (!m20647(str2)) {
                            if (m20657(str2)) {
                                if (!m20662(str, str2) ? false : m20654(m20663(str), str2)) {
                                    zM20652 = true;
                                }
                            }
                        } else if (m20662(str, str2)) {
                            c23236M20663 = m20663(str);
                            zM20654 = m20643(c23236M20663);
                            zM20652 = zM20654;
                        }
                    } else if (m20662(str2, str)) {
                        zM20654 = m20654(m20663(str2), str);
                        zM20652 = zM20654;
                    }
                    zM20652 = false;
                } else if (m20662(str2, str)) {
                    c23236M20663 = m20663(str2);
                    zM20654 = m20643(c23236M20663);
                    zM20652 = zM20654;
                } else {
                    zM20652 = false;
                }
                if (zM20652) {
                    zM20637 = zM20652;
                } else {
                    if (!c23236M20664.f74664 && !c23236.f74664) {
                        z = true;
                    }
                    if (z) {
                        zM20652 = m20638(str, c23236M20664, str2, c23236);
                    }
                    if (zM20652) {
                        zM20637 = zM20652;
                    } else if (z) {
                        zM20637 = m20637(str, c23236M20664, str2, c14063M20646, false);
                    } else {
                        zM20637 = m20637(str, c23236M20664, str2, c14063M20646, true);
                    }
                }
                map.put(str, Boolean.valueOf(zM20637));
                return zM20637;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private boolean m20660(String str, String str2) {
        HashSet hashSet = this.f23840;
        hashSet.clear();
        boolean zM20649 = m20649(str, str2, hashSet);
        hashSet.clear();
        return zM20649;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private boolean m20649(String str, String str2, HashSet hashSet) {
        C6303 c6303M20659;
        if (str.equals(str2)) {
            return true;
        }
        if (!hashSet.add(str) || (c6303M20659 = m20659(str)) == null) {
            return false;
        }
        String str3 = c6303M20659.f19486;
        if (str3 != null && (str3.equals(str2) || m20649(c6303M20659.f19486, str2, hashSet))) {
            return true;
        }
        for (String str4 : c6303M20659.f19487) {
            if (str4.equals(str2) || m20649(str4, str2, hashSet)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private boolean m20662(String str, String str2) {
        HashMap map = this.f23830;
        HashMap map2 = (HashMap) map.get(str);
        Boolean bool = map2 == null ? null : (Boolean) map2.get(str2);
        if (bool != null) {
            return bool.booleanValue();
        }
        HashSet hashSet = this.f23840;
        hashSet.clear();
        boolean zM20649 = m20649(str, str2, hashSet);
        hashSet.clear();
        HashMap map3 = (HashMap) map.get(str);
        if (map3 == null) {
            map3 = new HashMap();
            map.put(str, map3);
        }
        map3.put(str2, Boolean.valueOf(zM20649));
        return zM20649;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m20642(InterfaceC18444 interfaceC18444) {
        int iMo3567 = interfaceC18444.mo3567();
        if (EnumC15657.ABSTRACT.m36866(iMo3567)) {
            return false;
        }
        return interfaceC18444.mo3570() != null || EnumC15657.NATIVE.m36866(iMo3567);
    }
}
