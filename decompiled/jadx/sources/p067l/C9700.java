package p067l;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.۟᩷ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: A797 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9700 implements InterfaceC10727 {

    /* JADX INFO: renamed from: ۚ */
    public static final String[] f26740 = new String[0];

    /* JADX INFO: renamed from: ֡ */
    public final String f26741;

    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC18773 f26748;

    /* JADX INFO: renamed from: ܽ */
    public boolean f26751;

    /* JADX INFO: renamed from: ᩳ */
    public final HashMap f26753 = new HashMap();

    /* JADX INFO: renamed from: ֫ */
    public final HashMap f26742 = new HashMap();

    /* JADX INFO: renamed from: ۡ */
    public final HashSet f26746 = new HashSet();

    /* JADX INFO: renamed from: ᩷ */
    public final HashSet f26756 = new HashSet();

    /* JADX INFO: renamed from: ۢ */
    public final HashSet f26747 = new HashSet();

    /* JADX INFO: renamed from: ᩵ */
    public final HashMap f26755 = new HashMap();

    /* JADX INFO: renamed from: ۘ */
    public final HashMap f26744 = new HashMap();

    /* JADX INFO: renamed from: ᩴ */
    public final HashSet f26754 = new HashSet();

    /* JADX INFO: renamed from: ᩻ */
    public final HashSet f26757 = new HashSet();

    /* JADX INFO: renamed from: ܺ */
    public final HashSet f26750 = new HashSet();

    /* JADX INFO: renamed from: ܳ */
    public final HashSet f26749 = new HashSet();

    /* JADX INFO: renamed from: ۜ */
    public final HashSet f26745 = new HashSet();

    /* JADX INFO: renamed from: ۖ */
    public final HashSet f26743 = new HashSet();

    /* JADX INFO: renamed from: ܿ */
    public final ArrayDeque f26752 = new ArrayDeque();

    public C9700(String str, C22127 c22127) {
        this.f26741 = str;
        this.f26748 = c22127;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m22644(String str, C8359 c8359) {
        this.f26753.put(str, c8359);
        String str2 = c8359.f22357;
        if (str2 != null) {
            this.f26747.add(str2);
        }
        for (String str3 : c8359.f22358) {
            this.f26756.add(str3);
        }
    }

    /* JADX INFO: renamed from: ܿ */
    private C8359 m22639(String str) {
        C18102 c18102Mo42805;
        HashMap map = this.f26742;
        C8359 c8359 = (C8359) map.get(str);
        if (c8359 != null) {
            return c8359;
        }
        C8359 c83510 = (C8359) this.f26753.get(str);
        if (!this.f26751 && (c83510 == null || !c83510.f22353)) {
            HashSet hashSet = this.f26746;
            if (c83510 != null || !hashSet.contains(str)) {
                try {
                    c18102Mo42805 = this.f26748.mo42805(str, this.f26741);
                    if (c18102Mo42805.f54043 == EnumC19444.FOUND) {
                        C8359 c8359M19285 = C8359.m19285(c18102Mo42805.f54042);
                        map.put(str, c8359M19285);
                        String str2 = c8359M19285.f22357;
                        if (str2 != null) {
                            this.f26747.add(str2);
                        }
                        for (String str3 : c8359M19285.f22358) {
                            this.f26756.add(str3);
                        }
                        return c8359M19285;
                    }
                } catch (RuntimeException unused) {
                    c18102Mo42805 = C18102.f54041;
                }
                if (c18102Mo42805.f54043 == EnumC19444.UNAVAILABLE) {
                    this.f26751 = true;
                } else if (c83510 != null) {
                    c83510.f22353 = true;
                } else {
                    hashSet.add(str);
                }
            }
        }
        return c83510;
    }

    /* JADX INFO: renamed from: ᩳ */
    private boolean m22641(String str) {
        C8359 c8359 = (C8359) this.f26753.get(str);
        return c8359 != null && m22639(str) == c8359;
    }

    /* JADX INFO: renamed from: ֫ */
    private EnumC11398 m22611(String str, String str2, String str3, C15734 c15734, boolean z) {
        C24452 c24452 = c15734.f45573;
        if (str3.equals(str2)) {
            return EnumC11398.CONTRACT;
        }
        HashSet hashSet = new HashSet();
        while (str != null && hashSet.add(str)) {
            if (str.equals(str2)) {
                if (z && c24452.f77407 && m22640(str2, str3)) {
                    return EnumC11398.CONTRACT;
                }
                return EnumC11398.NONE;
            }
            C8359 c8359M22639 = m22639(str);
            if (c8359M22639 == null) {
                return EnumC11398.NONE;
            }
            if (str.equals(str3) && c24452.f77407) {
                return EnumC11398.CONTRACT;
            }
            if (c8359M22639.m19292() && (c8359M22639.m19291() || c8359M22639.m19297() || (!c8359M22639.m19295() && m22636(str, str2)))) {
                C24452 c24452M53957 = C24452.m53957(str, c8359M22639.m19294(), true);
                HashSet hashSet2 = c15734.f45575;
                String str4 = c24452.f77405;
                if (str4 != null) {
                    if (str4.equals(str)) {
                        return EnumC11398.POSSIBLE;
                    }
                    if (m22633(str, c24452M53957, hashSet2)) {
                        return EnumC11398.NONE;
                    }
                } else if (m22633(str, c24452M53957, hashSet2)) {
                    return EnumC11398.CONTRACT;
                }
                if (!c8359M22639.m19295() && m22636(str, str2)) {
                    return EnumC11398.NONE;
                }
            }
            str = c8359M22639.f22357;
        }
        return EnumC11398.NONE;
    }

    /* JADX INFO: renamed from: ۜ */
    private C15734 m22626(String str) {
        HashMap map = this.f26755;
        C15734 c15734 = (C15734) map.get(str);
        if (c15734 != null) {
            return c15734;
        }
        C8359 c8359M22639 = m22639(str);
        boolean z = c8359M22639 != null && c8359M22639.m19290();
        C24452 c24452M22643 = z ? C24452.f77403 : m22643(str);
        HashSet hashSet = new HashSet();
        if (!z) {
            m22615(str, c24452M22643, hashSet);
        }
        C15734 c15735 = new C15734(z, c24452M22643, hashSet);
        map.put(str, c15735);
        return c15735;
    }

    /* JADX INFO: renamed from: ᩻ */
    private C24452 m22643(String str) {
        C8359 c8359M22639;
        C8359 c8359M226310 = m22639(str);
        if (c8359M226310 == null) {
            return C24452.f77403;
        }
        if (c8359M226310.m19292()) {
            return C24452.m53957(str, c8359M226310.m19294(), !c8359M226310.m19293());
        }
        if (c8359M226310.m19293()) {
            if (!c8359M226310.m19296() && (c8359M22639 = m22639("Ljava/lang/Object;")) != null && c8359M22639.m19292() && c8359M22639.m19291()) {
                return C24452.m53957("Ljava/lang/Object;", c8359M22639.m19294(), true);
            }
            return m22635(str);
        }
        String str2 = c8359M226310.f22357;
        HashSet hashSet = this.f26750;
        hashSet.clear();
        while (str2 != null && hashSet.add(str2)) {
            C8359 c8359M226311 = m22639(str2);
            if (c8359M226311 == null) {
                break;
            }
            if (c8359M226311.m19292() && m22616(str, str2, c8359M226311)) {
                C24452 c24452M53957 = C24452.m53957(str2, c8359M226311.m19294(), true);
                hashSet.clear();
                return c24452M53957;
            }
            str2 = c8359M226311.f22357;
        }
        hashSet.clear();
        return m22635(str);
    }

    /* JADX INFO: renamed from: ܳ */
    private C24452 m22635(String str) {
        HashSet<String> hashSet = new HashSet();
        boolean zM22631 = m22631(str, hashSet, new HashSet());
        if (hashSet.isEmpty()) {
            return zM22631 ? C24452.f77402 : C24452.f77403;
        }
        ArrayList<String> arrayList = new ArrayList();
        for (String str2 : hashSet) {
            Iterator it = hashSet.iterator();
            while (true) {
                if (it.hasNext()) {
                    String str3 = (String) it.next();
                    if (!str2.equals(str3)) {
                        HashSet hashSet2 = this.f26757;
                        hashSet2.clear();
                        boolean zM22629 = m22629(str3, str2, hashSet2);
                        hashSet2.clear();
                        if (zM22629) {
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
            C8359 c8359M22639 = m22639(str5);
            if (c8359M22639 != null && c8359M22639.m19294()) {
                i++;
                str4 = str5;
            }
        }
        return new C24452((String[]) arrayList.toArray(new String[arrayList.size()]), i == 1 ? str4 : null, false, false);
    }

    /* JADX INFO: renamed from: ۧ */
    private boolean m22631(String str, HashSet hashSet, HashSet hashSet2) {
        C8359 c8359M22639 = m22639(str);
        int i = 0;
        if (!hashSet2.add(str) || c8359M22639 == null) {
            return false;
        }
        boolean zM19296 = c8359M22639.m19296();
        if (c8359M22639.m19293()) {
            if (c8359M22639.m19292()) {
                hashSet.add(str);
            }
            String[] strArr = c8359M22639.f22358;
            int length = strArr.length;
            while (i < length) {
                zM19296 |= m22631(strArr[i], hashSet, hashSet2);
                i++;
            }
            return zM19296;
        }
        String[] strArr2 = c8359M22639.f22358;
        int length2 = strArr2.length;
        while (i < length2) {
            zM19296 |= m22631(strArr2[i], hashSet, hashSet2);
            i++;
        }
        String str2 = c8359M22639.f22357;
        return str2 != null ? m22631(str2, hashSet, hashSet2) | zM19296 : zM19296;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m22615(String str, C24452 c24452, HashSet hashSet) {
        C8359 c8359M22639;
        ArrayDeque arrayDeque = this.f26752;
        arrayDeque.clear();
        for (String str2 : c24452.f77406) {
            if (hashSet.add(str2)) {
                arrayDeque.addLast(str2);
            }
        }
        if (c24452.f77404) {
            String[] strArr = c24452.f77406;
            if (strArr.length == 1 && (c8359M22639 = m22639(strArr[0])) != null && c8359M22639.m19291()) {
                HashSet hashSet2 = this.f26745;
                hashSet2.clear();
                m22613(str, hashSet);
                hashSet2.clear();
            }
        }
        while (!arrayDeque.isEmpty()) {
            String str3 = (String) arrayDeque.removeFirst();
            C8359 c8359M226310 = m22639(str3);
            if (c8359M226310 != null) {
                HashSet hashSet3 = this.f26749;
                hashSet3.clear();
                String str4 = c8359M226310.f22357;
                if (str4 != null) {
                    m22612(str4, str3, hashSet);
                }
                if (c8359M226310.m19291()) {
                    for (String str5 : c8359M226310.f22358) {
                        m22612(str5, str3, hashSet);
                    }
                }
                hashSet3.clear();
            }
        }
        arrayDeque.clear();
    }

    /* JADX INFO: renamed from: ֫ */
    private void m22613(String str, HashSet hashSet) {
        C8359 c8359M22639;
        if (this.f26745.add(str) && (c8359M22639 = m22639(str)) != null) {
            int i = 0;
            if (c8359M22639.m19293()) {
                if (c8359M22639.m19292() && hashSet.add(str)) {
                    this.f26752.addLast(str);
                }
                String[] strArr = c8359M22639.f22358;
                int length = strArr.length;
                while (i < length) {
                    m22613(strArr[i], hashSet);
                    i++;
                }
                return;
            }
            String[] strArr2 = c8359M22639.f22358;
            int length2 = strArr2.length;
            while (i < length2) {
                m22613(strArr2[i], hashSet);
                i++;
            }
            String str2 = c8359M22639.f22357;
            if (str2 != null) {
                m22613(str2, hashSet);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m22612(String str, String str2, HashSet hashSet) {
        C8359 c8359M22639;
        if (this.f26749.add(str) && (c8359M22639 = m22639(str)) != null) {
            if (c8359M22639.m19292() && m22616(str2, str, c8359M22639) && hashSet.add(str)) {
                this.f26752.addLast(str);
            }
            String str3 = c8359M22639.f22357;
            if (str3 != null) {
                m22612(str3, str2, hashSet);
            }
            for (String str4 : c8359M22639.f22358) {
                m22612(str4, str2, hashSet);
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    private boolean m22633(String str, C24452 c24452, HashSet hashSet) {
        HashSet hashSet2 = this.f26743;
        hashSet2.clear();
        m22615(str, c24452, hashSet2);
        boolean zM22621 = m22621(hashSet2, hashSet);
        hashSet2.clear();
        return zM22621;
    }

    /* JADX INFO: renamed from: ۧ */
    private boolean m22632(String str, C24452 c24452, String str2, C24452 c24453) {
        if (!c24452.f77407 && !c24453.f77407) {
            return false;
        }
        if (str.equals(str2)) {
            return true;
        }
        if (c24452.f77407 && m22640(str2, str) && m22624(c24453, str)) {
            return true;
        }
        return c24453.f77407 && m22640(str, str2) && m22624(c24452, str2);
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m22624(C24452 c24452, String str) {
        if (c24452.f77407) {
            return true;
        }
        C8359 c8359M22639 = m22639(str);
        if (c8359M22639 != null) {
            String[] strArr = c24452.f77406;
            if (strArr.length != 0) {
                for (String str2 : strArr) {
                    C8359 c8359M226310 = m22639(str2);
                    if (c8359M226310 != null) {
                        if (c8359M226310.m19291()) {
                            return true;
                        }
                        if (!c8359M22639.m19293() && c24452.f77404 && c8359M226310.m19297()) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m22621(HashSet hashSet, HashSet hashSet2) {
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

    /* JADX INFO: renamed from: ֫ */
    private boolean m22618(String str, C24452 c24452, String str2, C24452 c24453) {
        if (m22641(str2) && c24453.f77406.length == 0 && m22642(str, str2) && m22620(str2, c24453, c24452)) {
            return true;
        }
        return m22641(str) && c24452.f77406.length == 0 && m22642(str2, str) && m22620(str, c24452, c24453);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0089  */
    /* JADX WARN: Code duplicated, block: B:41:0x008f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0092  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c2  */
    /* JADX INFO: renamed from: ֫ */
    private boolean m22617(String str, C24452 c24452, String str2, C15734 c15734, boolean z) {
        C13724 c13724;
        boolean z2 = m22641(str2) && c15734.f45573.f77406.length == 0;
        boolean z3 = m22641(str) && c24452.f77406.length == 0;
        if (z2 || z3) {
            if (c15734.f45574 == null) {
                HashSet hashSet = new HashSet();
                m22614(str2, hashSet, new HashSet());
                c15734.f45574 = new C13724(m22610(str2), hashSet);
            }
            C13724 c13725 = c15734.f45574;
            String str3 = c13725.f38722;
            HashSet hashSet2 = c13725.f38721;
            if (str3 != null || !hashSet2.isEmpty()) {
                if (!z) {
                    if (str.equals(str2)) {
                        c13724 = c13725;
                    } else {
                        HashSet hashSet3 = new HashSet();
                        m22614(str, hashSet3, new HashSet());
                        c13724 = new C13724(m22610(str), hashSet3);
                    }
                    if (z2) {
                    }
                    if (z3) {
                        if (m22619(str, c24452, c13724, str2, c15734.f45573, c13725)) {
                            return true;
                        }
                    }
                } else {
                    HashSet hashSet4 = this.f26746;
                    if (str3 == null || hashSet4.contains(str3)) {
                        Iterator it = hashSet2.iterator();
                        while (it.hasNext()) {
                            if (!hashSet4.contains((String) it.next())) {
                            }
                        }
                        if (str3 != null || !hashSet2.isEmpty()) {
                            if (str.equals(str2)) {
                                c13724 = c13725;
                            } else {
                                HashSet hashSet5 = new HashSet();
                                m22614(str, hashSet5, new HashSet());
                                c13724 = new C13724(m22610(str), hashSet5);
                            }
                            if (z2 || !m22619(str2, c15734.f45573, c13725, str, c24452, c13724)) {
                                if (z3) {
                                    if (m22619(str, c24452, c13724, str2, c15734.f45573, c13725)) {
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

    /* JADX INFO: renamed from: ֫ */
    private boolean m22619(String str, C24452 c24452, C13724 c13724, String str2, C24452 c24453, C13724 c13725) {
        C8359 c8359;
        boolean zEquals;
        if (c24452.f77406.length != 0 || !m22641(str2) || (c8359 = (C8359) this.f26753.get(str)) == null) {
            return false;
        }
        HashSet hashSet = c13724.f38721;
        String str3 = c13724.f38722;
        HashSet hashSet2 = c13724.f38721;
        boolean z = !hashSet.isEmpty() && hashSet2.equals(c13725.f38721);
        if (c8359.m19293()) {
            return z && m22623(c24453);
        }
        if (str3 == null) {
            zEquals = c13725.f38722 == null;
        } else {
            zEquals = str3.equals(c13725.f38722);
        }
        if (zEquals && hashSet2.equals(c13725.f38721)) {
            if (z && m22623(c24453)) {
                return true;
            }
            if (str3 != null && m22634(c24453, str3)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m22614(String str, HashSet hashSet, HashSet hashSet2) {
        String str2;
        if (hashSet2.add(str)) {
            C8359 c8359M22639 = m22639(str);
            if (c8359M22639 == null) {
                if (m22627(str)) {
                    hashSet.add(str);
                    return;
                }
                return;
            }
            for (String str3 : c8359M22639.f22358) {
                m22614(str3, hashSet, hashSet2);
            }
            if (c8359M22639.m19293() || (str2 = c8359M22639.f22357) == null) {
                return;
            }
            m22614(str2, hashSet, hashSet2);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m22620(String str, C24452 c24452, C24452 c24453) {
        if (c24452.f77406.length != 0) {
            return false;
        }
        HashSet hashSet = this.f26745;
        hashSet.clear();
        boolean zM22630 = m22630(str, hashSet);
        hashSet.clear();
        if (zM22630 && m22623(c24453)) {
            return true;
        }
        String strM22610 = m22610(str);
        return strM22610 != null && m22634(c24453, strM22610);
    }

    /* JADX INFO: renamed from: ۧ */
    private boolean m22630(String str, HashSet hashSet) {
        String str2;
        if (!hashSet.add(str)) {
            return false;
        }
        C8359 c8359M22639 = m22639(str);
        if (c8359M22639 == null) {
            return m22627(str);
        }
        for (String str3 : c8359M22639.f22358) {
            if (m22630(str3, hashSet)) {
                return true;
            }
        }
        return (c8359M22639.m19293() || (str2 = c8359M22639.f22357) == null || !m22630(str2, hashSet)) ? false : true;
    }

    /* JADX INFO: renamed from: ֫ */
    private String m22610(String str) {
        HashSet hashSet = this.f26750;
        hashSet.clear();
        while (str != null && hashSet.add(str)) {
            C8359 c8359M22639 = m22639(str);
            if (c8359M22639 == null) {
                if (!m22637(str)) {
                    str = null;
                }
                hashSet.clear();
                return str;
            }
            if (c8359M22639.m19293()) {
                hashSet.clear();
                return null;
            }
            str = c8359M22639.f22357;
        }
        hashSet.clear();
        return null;
    }

    /* JADX INFO: renamed from: ۧ */
    private boolean m22634(C24452 c24452, String str) {
        String str2;
        C8359 c8359M22639;
        String[] strArr = c24452.f77406;
        return strArr.length == 0 || (c24452.f77404 && strArr.length == 1 && (c8359M22639 = m22639((str2 = strArr[0]))) != null && (c8359M22639.m19291() || c8359M22639.m19297() || (!c8359M22639.m19295() && m22636(str2, str))));
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m22623(C24452 c24452) {
        String[] strArr = c24452.f77406;
        if (strArr.length == 0) {
            return true;
        }
        for (String str : strArr) {
            C8359 c8359M22639 = m22639(str);
            if (c8359M22639 != null && c8359M22639.m19291()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧ */
    private boolean m22628(String str, String str2) {
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
                C8359 c8359M22639 = m22639(str3);
                if (c8359M22639 == null) {
                    if (m22627(str3) && (zEquals || str3.equals(str2))) {
                        return true;
                    }
                } else {
                    for (String str4 : c8359M22639.f22358) {
                        arrayDeque.addLast(str4);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ܽ */
    private boolean m22638(String str, String str2) {
        boolean zEquals = str.equals(str2);
        HashSet hashSet = new HashSet();
        while (str != null && hashSet.add(str)) {
            C8359 c8359M22639 = m22639(str);
            if (c8359M22639 == null) {
                return m22637(str) && (zEquals || str.equals(str2));
            }
            str = c8359M22639.f22357;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧ */
    private boolean m22627(String str) {
        return m22639(str) == null && this.f26756.contains(str);
    }

    /* JADX INFO: renamed from: ܽ */
    private boolean m22637(String str) {
        return m22639(str) == null && this.f26747.contains(str);
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m22616(String str, String str2, C8359 c8359) {
        C8359 c8359M22639 = m22639(str);
        if (c8359.m19291() || c8359.m19297()) {
            return true;
        }
        return c8359M22639 != null && c8359M22639.m19295() == c8359.m19295() && m22636(str, str2);
    }

    /* JADX INFO: renamed from: ܳ */
    public static boolean m22636(String str, String str2) {
        int iLastIndexOf = str.lastIndexOf(47);
        return iLastIndexOf == str2.lastIndexOf(47) && str.regionMatches(0, str2, 0, iLastIndexOf + 1);
    }

    @Override // p067l.InterfaceC10727
    /* JADX INFO: renamed from: ֫ */
    public final EnumC11398 mo16147(String str, String str2, String str3, String str4) {
        String str5;
        C24452 c24452M22635;
        C24452 c24452M22636;
        if (!this.f26741.equals(str4)) {
            return EnumC11398.NONE;
        }
        C15734 c15734M22626 = m22626(str3);
        C24452 c24452 = c15734M22626.f45573;
        if (c15734M22626.f45569) {
            return EnumC11398.NONE;
        }
        C8359 c8359M22639 = m22639(str);
        C8359 c8359M226310 = m22639(str2);
        if (c8359M22639 == null) {
            return EnumC11398.NONE;
        }
        boolean zM22627 = m22627(str2);
        boolean zM22637 = m22637(str2);
        if (c8359M226310 == null || !c8359M226310.m19293()) {
            if (zM22627) {
                if (str.equals(str2) || !m22640(str, str2)) {
                    return EnumC11398.NONE;
                }
                return (str3.equals(str2) || (c24452.f77406.length == 0 && m22628(str3, str2))) ? EnumC11398.CONTRACT : EnumC11398.NONE;
            }
            if (c8359M226310 == null && !zM22637) {
                return EnumC11398.NONE;
            }
            if (c8359M22639.m19293() || str.equals(str2) || !m22640(str, str2) || (str5 = c8359M22639.f22357) == null) {
                return EnumC11398.NONE;
            }
            if (zM22637) {
                if (c24452.f77406.length == 0 && m22638(str3, str2)) {
                    return EnumC11398.CONTRACT;
                }
                return m22611(str5, str2, str3, c15734M22626, false);
            }
            C24452 c24452M22643 = m22643(str2);
            if (c24452M22643.f77406.length == 0) {
                if (c24452M22643.f77407) {
                    if (!m22632(str2, c24452M22643, str3, c24452)) {
                        return EnumC11398.NONE;
                    }
                    return m22611(str5, str2, str3, c15734M22626, true);
                }
                String strM22610 = m22610(str2);
                if (strM22610 == null) {
                    return EnumC11398.NONE;
                }
                if (c24452.f77406.length == 0 && (m22638(str2, str3) || m22618(str2, c24452M22643, str3, c24452) || m22617(str2, c24452M22643, str3, c15734M22626, false))) {
                    return EnumC11398.CONTRACT;
                }
                return m22611(str5, strM22610, str3, c15734M22626, false);
            }
            C24452 c24452M22644 = m22643(str2);
            HashSet hashSet = new HashSet();
            m22615(str2, c24452M22644, hashSet);
            if (hashSet.isEmpty()) {
                c24452M22635 = C24452.f77403;
            } else {
                HashSet hashSet2 = new HashSet();
                String str6 = str5;
                while (true) {
                    if (str6 != null && hashSet2.add(str6)) {
                        C8359 c8359M226311 = m22639(str6);
                        if (c8359M226311 != null) {
                            if (c8359M226311.m19292()) {
                                C24452 c24452M53957 = C24452.m53957(str6, c8359M226311.m19294(), true);
                                if (m22633(str6, c24452M53957, hashSet)) {
                                    c24452M22635 = c24452M53957;
                                }
                            }
                            str6 = c8359M226311.f22357;
                        }
                    }
                    c24452M22635 = m22635(str5);
                    if (!m22633(str5, c24452M22635, hashSet)) {
                        c24452M22635 = C24452.f77403;
                    }
                }
            }
            C24452 c24453 = c24452M22635;
            str2 = str5;
            c24452M22636 = c24453;
        } else {
            if (str.equals(str2) || !m22640(str, str2)) {
                return EnumC11398.NONE;
            }
            c24452M22636 = m22635(str2);
            if (c24452M22636.f77407 && str3.equals(str2)) {
                return EnumC11398.CONTRACT;
            }
            if (c24452M22636.f77406.length == 0 && c24452.f77406.length == 0 && (m22632(str2, c24452M22636, str3, c24452) || m22628(str2, str3) || m22618(str2, c24452M22636, str3, c24452) || m22617(str2, c24452M22636, str3, c15734M22626, false))) {
                return EnumC11398.CONTRACT;
            }
        }
        String str7 = c24452.f77405;
        if (str7 == null) {
            return m22633(str2, c24452M22636, c15734M22626.f45575) ? EnumC11398.CONTRACT : EnumC11398.NONE;
        }
        if (!str7.equals(c24452M22636.f77405)) {
            return EnumC11398.NONE;
        }
        return EnumC11398.EXACT;
    }

    @Override // p067l.InterfaceC10727
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo16148(String str, String str2) {
        if (!this.f26741.equals(str2)) {
            return false;
        }
        C15734 c15734M22626 = m22626(str);
        if (!c15734M22626.f45569) {
            return c15734M22626.f45573.f77405 != null;
        }
        C8359 c8359M22639 = m22639(str);
        return c8359M22639 != null && c8359M22639.m19294();
    }

    @Override // p067l.InterfaceC10727
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo16149(String str, String str2, String str3) {
        if (!this.f26741.equals(str3)) {
            return false;
        }
        C15734 c15734M22626 = m22626(str2);
        HashMap map = c15734M22626.f45570;
        C24452 c24452 = c15734M22626.f45573;
        if (c15734M22626.f45569) {
            return false;
        }
        String str4 = c24452.f77405;
        String str5 = c24452.f77405;
        if (str4 == null) {
            return false;
        }
        C8359 c8359M22639 = m22639(str);
        if (c8359M22639 != null && c8359M22639.m19290()) {
            return false;
        }
        Boolean bool = (Boolean) map.get(str);
        if (bool != null) {
            return bool.booleanValue();
        }
        C24452 c24452M22643 = m22643(str);
        boolean z = (c24452M22643.f77407 || c24452.f77407) ? false : true;
        boolean zEquals = str5.equals(c24452M22643.f77405);
        if (!zEquals) {
            zEquals = m22632(str, c24452M22643, str2, c24452);
        }
        if (!zEquals && m22627(str)) {
            zEquals = !m22642(str2, str) ? false : m22623(m22643(str2));
        }
        if (!zEquals && m22637(str)) {
            zEquals = !m22642(str2, str) ? false : m22634(m22643(str2), str);
        }
        if (!zEquals && z) {
            zEquals = m22618(str, c24452M22643, str2, c24452);
        }
        if (!zEquals && z && m22642(str2, str)) {
            zEquals = m22633(str, c24452M22643, c15734M22626.f45575);
        }
        if (!zEquals) {
            if (c15734M22626.f45572 == null) {
                HashSet hashSet = new HashSet();
                HashSet hashSet2 = new HashSet();
                HashSet hashSet3 = new HashSet();
                HashSet hashSet4 = new HashSet();
                ArrayDeque arrayDeque = new ArrayDeque();
                for (Map.Entry entry : this.f26753.entrySet()) {
                    if (m22641((String) entry.getKey()) && !((C8359) entry.getValue()).m19293()) {
                        String str6 = (String) entry.getKey();
                        C24452 c24452M22644 = m22643(str6);
                        if (str5.equals(c24452M22644.f77405)) {
                            hashSet2.clear();
                            m22615(str6, c24452M22644, hashSet2);
                            hashSet4.clear();
                            arrayDeque.clear();
                            arrayDeque.addLast(str6);
                            while (!arrayDeque.isEmpty()) {
                                String str7 = (String) arrayDeque.removeFirst();
                                if (hashSet4.add(str7)) {
                                    C8359 c8359M226310 = m22639(str7);
                                    if (c8359M226310 == null) {
                                        if ((m22627(str7) && m22623(c24452M22644)) || (m22637(str7) && m22634(c24452M22644, str7))) {
                                            hashSet.add(str7);
                                        }
                                    } else {
                                        hashSet3.clear();
                                        C24452 c24452M22645 = m22643(str7);
                                        m22615(str7, c24452M22645, hashSet3);
                                        if (m22621(hashSet2, hashSet3) || m22620(str7, c24452M22645, c24452M22644)) {
                                            hashSet.add(str7);
                                        }
                                        String str8 = c8359M226310.f22357;
                                        if (str8 != null) {
                                            arrayDeque.addLast(str8);
                                        }
                                        for (String str9 : c8359M226310.f22358) {
                                            arrayDeque.addLast(str9);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                c15734M22626.f45572 = hashSet;
            }
            zEquals = c15734M22626.f45572.contains(str);
        }
        map.put(str, Boolean.valueOf(zEquals));
        return zEquals;
    }

    /* JADX WARN: Code duplicated, block: B:64:0x00d0 A[PHI: r2
      0x00d0: PHI (r2v8 boolean) = (r2v7 boolean), (r2v9 boolean) binds: [B:52:0x00a9, B:60:0x00ba] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p067l.InterfaceC10727
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo16150(String str, String str2, String str3) {
        C24452 c24452M22643;
        boolean zM22634;
        boolean zM22617;
        boolean z = false;
        if (this.f26741.equals(str3)) {
            C15734 c15734M22626 = m22626(str2);
            HashSet hashSet = c15734M22626.f45575;
            HashMap map = c15734M22626.f45571;
            C24452 c24452 = c15734M22626.f45573;
            C8359 c8359M22639 = m22639(str);
            if (!c15734M22626.f45569 && (c8359M22639 == null || !c8359M22639.m19290())) {
                Boolean bool = (Boolean) map.get(str);
                if (bool != null) {
                    return bool.booleanValue();
                }
                C24452 c24452M22644 = m22643(str);
                boolean zM22632 = m22632(str, c24452M22644, str2, c24452);
                if (zM22632 || !m22627(str)) {
                    if (zM22632 || !m22637(str)) {
                        if (zM22632 || !hashSet.isEmpty()) {
                            if (!zM22632) {
                                zM22632 = m22633(str, c24452M22644, hashSet);
                            }
                        } else if (!m22627(str2)) {
                            if (m22637(str2)) {
                                if (!m22642(str, str2) ? false : m22634(m22643(str), str2)) {
                                    zM22632 = true;
                                }
                            }
                        } else if (m22642(str, str2)) {
                            c24452M22643 = m22643(str);
                            zM22634 = m22623(c24452M22643);
                            zM22632 = zM22634;
                        }
                    } else if (m22642(str2, str)) {
                        zM22634 = m22634(m22643(str2), str);
                        zM22632 = zM22634;
                    }
                    zM22632 = false;
                } else if (m22642(str2, str)) {
                    c24452M22643 = m22643(str2);
                    zM22634 = m22623(c24452M22643);
                    zM22632 = zM22634;
                } else {
                    zM22632 = false;
                }
                if (zM22632) {
                    zM22617 = zM22632;
                } else {
                    if (!c24452M22644.f77407 && !c24452.f77407) {
                        z = true;
                    }
                    if (z) {
                        zM22632 = m22618(str, c24452M22644, str2, c24452);
                    }
                    if (zM22632) {
                        zM22617 = zM22632;
                    } else if (z) {
                        zM22617 = m22617(str, c24452M22644, str2, c15734M22626, false);
                    } else {
                        zM22617 = m22617(str, c24452M22644, str2, c15734M22626, true);
                    }
                }
                map.put(str, Boolean.valueOf(zM22617));
                return zM22617;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ܿ */
    private boolean m22640(String str, String str2) {
        HashSet hashSet = this.f26754;
        hashSet.clear();
        boolean zM22629 = m22629(str, str2, hashSet);
        hashSet.clear();
        return zM22629;
    }

    /* JADX INFO: renamed from: ۧ */
    private boolean m22629(String str, String str2, HashSet hashSet) {
        C8359 c8359M22639;
        if (str.equals(str2)) {
            return true;
        }
        if (!hashSet.add(str) || (c8359M22639 = m22639(str)) == null) {
            return false;
        }
        String str3 = c8359M22639.f22357;
        if (str3 != null && (str3.equals(str2) || m22629(c8359M22639.f22357, str2, hashSet))) {
            return true;
        }
        for (String str4 : c8359M22639.f22358) {
            if (str4.equals(str2) || m22629(str4, str2, hashSet)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩳ */
    private boolean m22642(String str, String str2) {
        HashMap map = this.f26744;
        HashMap map2 = (HashMap) map.get(str);
        Boolean bool = map2 == null ? null : (Boolean) map2.get(str2);
        if (bool != null) {
            return bool.booleanValue();
        }
        HashSet hashSet = this.f26754;
        hashSet.clear();
        boolean zM22629 = m22629(str, str2, hashSet);
        hashSet.clear();
        HashMap map3 = (HashMap) map.get(str);
        if (map3 == null) {
            map3 = new HashMap();
            map.put(str, map3);
        }
        map3.put(str2, Boolean.valueOf(zM22629));
        return zM22629;
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m22622(InterfaceC19897 interfaceC19897) {
        int iMo5854 = interfaceC19897.mo5854();
        if (EnumC17248.ABSTRACT.m39032(iMo5854)) {
            return false;
        }
        return interfaceC19897.mo5857() != null || EnumC17248.NATIVE.m39032(iMo5854);
    }
}
