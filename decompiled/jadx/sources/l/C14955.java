package l;

import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: l.ܶۗۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: K608 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14955 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C5637 f45603;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public ArrayList f45604 = new ArrayList();

    public C14955(C5637 c5637) {
        this.f45603 = c5637;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m35429(C21307 c21307, EnumC7900 enumC7900) {
        Set setMo1218 = enumC7900.mo1218(c21307);
        if (setMo1218 != null) {
            if (setMo1218.size() > 1) {
                ArrayList arrayList = new ArrayList(setMo1218);
                C21307 c21307M48337 = ((C21307) arrayList.get(0)).m48337();
                for (int i = 1; i < arrayList.size(); i++) {
                    c21307M48337.m48339((C21307) arrayList.get(i));
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m35430(String str, String str2) {
        if (!str.equals(str2)) {
            EnumC3520 enumC3520M10714 = EnumC3520.m10714(str);
            EnumC3520 enumC3520M10715 = EnumC3520.m10714(str2);
            boolean z = enumC3520M10714.f11198;
            if (!z || enumC3520M10715.f11198) {
                if (!z && enumC3520M10715.f11198) {
                    return str2;
                }
                if (z) {
                    EnumC3520 enumC3520 = EnumC3520.INT;
                    if ((enumC3520M10714 == enumC3520 && enumC3520M10715 == EnumC3520.BOOLEAN) || (enumC3520M10715 == enumC3520 && enumC3520M10714 == EnumC3520.BOOLEAN)) {
                        return "I";
                    }
                    if (enumC3520M10714 != enumC3520M10715) {
                        throw new RuntimeException();
                    }
                    if (enumC3520M10714 == enumC3520) {
                        for (int i = 3; i >= 0; i--) {
                            String str3 = C22012.f70566[i];
                            if (str.equals(str3) || str2.equals(str3)) {
                                return str3;
                            }
                        }
                        return "I";
                    }
                    if (enumC3520M10714 == EnumC3520.OBJECT) {
                        int iM35421 = m35421(str);
                        int iM35422 = m35421(str2);
                        if (iM35421 == 0 || iM35422 == 0) {
                            if (!str.equals(str2) && ("L".endsWith(str) || (!"L".equals(str2) && str.compareTo(str2) <= 0))) {
                                return str2;
                            }
                        } else {
                            String strSubstring = str.substring(iM35421);
                            String strSubstring2 = str2.substring(iM35422);
                            if (iM35421 < iM35422) {
                                if (strSubstring2.charAt(0) != 'L') {
                                    iM35422--;
                                }
                                return m35422(iM35422, "L");
                            }
                            if (iM35421 > iM35422) {
                                if (strSubstring.charAt(0) != 'L') {
                                    iM35421--;
                                }
                                return m35422(iM35421, "L");
                            }
                            if (strSubstring.charAt(0) != 'L' || strSubstring2.charAt(0) != 'L') {
                                return m35422(iM35421 - 1, "L");
                            }
                            return m35422(iM35421, "L");
                        }
                    } else {
                        throw new RuntimeException();
                    }
                } else {
                    return EnumC3520.m10715(enumC3520M10714, enumC3520M10715).f11199;
                }
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m35422(int i, String str) {
        if (i == 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append('[');
        }
        sb.append(str);
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m35421(String str) {
        int i = 0;
        while (str.charAt(i) == '[') {
            i++;
        }
        return i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m35427(AbstractC8396 abstractC8396, boolean z) {
        int i = C2256.f7331[abstractC8396.f25747.ordinal()];
        if (i == 1) {
            AbstractC18980 abstractC18980 = (AbstractC18980) abstractC8396;
            EnumC1340 enumC1340 = abstractC18980.f25745;
            switch (C2256.f7333[enumC1340.ordinal()]) {
                case 2:
                    C17568 c17568 = (C17568) abstractC18980;
                    m35425(c17568, c17568.f53685);
                    return;
                case 3:
                case 4:
                case 5:
                    C21097 c21097 = (C21097) abstractC18980;
                    String str = c21097.f68039;
                    if (str == null && enumC1340 == EnumC1340.EXCEPTION_REF) {
                        str = "Ljava/lang/Throwable;";
                    }
                    m35425(c21097, str);
                    return;
                case 6:
                    C9808 c9808 = (C9808) abstractC18980;
                    String str2 = c9808.f29646;
                    if (z) {
                        m35425(c9808, str2);
                        return;
                    } else {
                        m35431(c9808, str2);
                        return;
                    }
                case 7:
                    C11987 c11987 = (C11987) abstractC18980;
                    Object obj = c11987.f35889;
                    if (obj instanceof String) {
                        m35425(c11987, "Ljava/lang/String;");
                        return;
                    }
                    if (obj instanceof C22860) {
                        m35425(c11987, "Ljava/lang/Class;");
                        return;
                    }
                    if (!(obj instanceof Number)) {
                        if (obj instanceof Character) {
                            m35425(c11987, "C");
                            return;
                        } else {
                            m35425(c11987, "L");
                            return;
                        }
                    }
                    if ((obj instanceof Integer) || (obj instanceof Byte) || (obj instanceof Short)) {
                        int iIntValue = ((Number) obj).intValue();
                        if (iIntValue == 0) {
                            m35425(c11987, EnumC3520.ZIFL.f11199);
                            return;
                        } else if (iIntValue == 1) {
                            m35425(c11987, EnumC3520.ZIF.f11199);
                            return;
                        } else {
                            m35425(c11987, EnumC3520.IF.f11199);
                            return;
                        }
                    }
                    if (obj instanceof Long) {
                        m35425(c11987, "w");
                        return;
                    } else if (obj instanceof Float) {
                        m35425(c11987, "F");
                        return;
                    } else {
                        if (obj instanceof Double) {
                            m35425(c11987, "D");
                            return;
                        }
                        return;
                    }
                default:
                    return;
            }
        }
        if (i == 2) {
            AbstractC19686 abstractC19686 = (AbstractC19686) abstractC8396;
            AbstractC8396 abstractC8397 = abstractC19686.f63597;
            switch (C2256.f7333[abstractC19686.f25745.ordinal()]) {
                case 8:
                    C6342 c6342 = (C6342) abstractC19686;
                    String str3 = c6342.f19648;
                    if (str3.equals("B")) {
                        EnumC3520 enumC3520 = EnumC3520.ZI;
                        m35431(abstractC8397, enumC3520.f11199);
                        m35425(abstractC19686, enumC3520.f11199);
                    } else {
                        m35431(abstractC8397, c6342.f19649);
                        m35425(abstractC19686, str3);
                    }
                    break;
                case 9:
                    C14102 c14102 = (C14102) abstractC19686;
                    String str4 = c14102.f42578;
                    if (z) {
                        m35425(c14102, str4);
                    } else {
                        m35431(c14102, str4);
                    }
                    if (abstractC8397 != null) {
                        m35431(abstractC8397, c14102.f42579);
                    }
                    break;
                case 10:
                    C16156 c16156 = (C16156) abstractC19686;
                    m35425(c16156, c16156.f49779);
                    m35431(abstractC8397, "L");
                    break;
                case 11:
                    m35425((C16156) abstractC19686, "Z");
                    m35431(abstractC8397, "L");
                    break;
                case 12:
                    C16156 c16157 = (C16156) abstractC19686;
                    m35425(c16157, "[" + c16157.f49779);
                    m35431(abstractC8397, "I");
                    break;
                case 13:
                    m35425((C4163) abstractC19686, "I");
                    m35431(abstractC8397, "[?");
                    break;
                case 14:
                case 15:
                    C4163 c4163 = (C4163) abstractC19686;
                    String str5 = c4163.f13577;
                    m35425(c4163, str5);
                    m35431(abstractC8397, str5);
                    break;
            }
            if (abstractC8397 != null) {
                m35427(abstractC8397, true);
                return;
            }
            return;
        }
        if (i != 3) {
            if (i != 4) {
                return;
            }
            AbstractC5574 abstractC5574 = (AbstractC5574) abstractC8396;
            AbstractC8396[] abstractC8396Arr = abstractC5574.f17269;
            switch (C2256.f7333[abstractC5574.f25745.ordinal()]) {
                case 42:
                case 43:
                case 44:
                case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                case 46:
                case 47:
                case 48:
                    AbstractC13397 abstractC13397 = (AbstractC13397) abstractC5574;
                    String strM27469 = abstractC13397.mo6720().m27469();
                    m35425(abstractC5574, strM27469);
                    m35431(abstractC5574, strM27469);
                    String[] strArrM27468 = abstractC13397.mo6720().m27468();
                    if (strArrM27468.length != abstractC8396Arr.length) {
                        if (strArrM27468.length + 1 != abstractC8396Arr.length) {
                            throw new RuntimeException();
                        }
                        m35431(abstractC8396Arr[0], "L");
                        for (int i2 = 1; i2 < abstractC8396Arr.length; i2++) {
                            m35431(abstractC8396Arr[i2], strArrM27468[i2 - 1]);
                        }
                    } else {
                        for (int i3 = 0; i3 < abstractC8396Arr.length; i3++) {
                            m35431(abstractC8396Arr[i3], strArrM27468[i3]);
                        }
                    }
                    break;
                case 49:
                    C7753 c7753 = (C7753) abstractC5574;
                    String str6 = c7753.f23980;
                    for (AbstractC8396 abstractC8398 : abstractC8396Arr) {
                        m35431(abstractC8398, str6);
                    }
                    m35425(c7753, C20094.m46315("[", str6));
                    break;
                case 50:
                    C14745 c14745 = (C14745) abstractC5574;
                    for (AbstractC8396 abstractC8399 : abstractC8396Arr) {
                        m35431(abstractC8399, "I");
                    }
                    StringBuilder sb = new StringBuilder();
                    for (int i4 = 0; i4 < c14745.f45025; i4++) {
                        sb.append('[');
                    }
                    sb.append(c14745.f45026);
                    m35425(c14745, sb.toString());
                    break;
                case 51:
                    for (AbstractC8396 abstractC83910 : abstractC8396Arr) {
                        m35426(abstractC83910, abstractC5574);
                    }
                    break;
            }
            for (AbstractC8396 abstractC83911 : abstractC5574.f17269) {
                m35427(abstractC83911, true);
            }
            return;
        }
        AbstractC0634 abstractC0634 = (AbstractC0634) abstractC8396;
        AbstractC8396 abstractC83912 = abstractC0634.f2428;
        abstractC83912.getClass();
        AbstractC8396 abstractC83913 = abstractC0634.f2429;
        abstractC83913.getClass();
        switch (C2256.f7333[abstractC0634.f25745.ordinal()]) {
            case 16:
                m35431(abstractC83913, "I");
                String str7 = ((C12692) abstractC0634).f38211;
                m35431(abstractC83912, C20094.m46315("[", str7));
                if (z) {
                    m35425(abstractC0634, str7);
                    C21307 c21307M35424 = m35424(abstractC83912);
                    C21307 c21307M35425 = m35424(abstractC0634);
                    if (c21307M35424.f68687 == null) {
                        c21307M35424.f68687 = new HashSet(3);
                    }
                    c21307M35424.f68687.add(c21307M35425);
                    if (c21307M35425.f68679 == null) {
                        c21307M35425.f68679 = new HashSet(3);
                    }
                    c21307M35425.f68679.add(c21307M35424);
                } else {
                    m35431(abstractC0634, str7);
                    C21307 c21307M35426 = m35424(abstractC83912);
                    C21307 c21307M35427 = m35424(abstractC0634);
                    if (c21307M35426.f68680 == null) {
                        c21307M35426.f68680 = new HashSet(3);
                    }
                    c21307M35426.f68680.add(c21307M35427);
                    if (c21307M35427.f68679 == null) {
                        c21307M35427.f68679 = new HashSet(3);
                    }
                    c21307M35427.f68679.add(c21307M35426);
                }
                break;
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
                String str8 = ((C10576) abstractC0634).f31750;
                m35431(abstractC83912, str8);
                m35431(abstractC83913, str8);
                m35425(abstractC0634, "I");
                break;
            case 22:
            case 23:
                AbstractC8396 abstractC83914 = abstractC0634.f2429;
                EnumC3520 enumC3521 = EnumC3520.ZIL;
                m35431(abstractC83914, enumC3521.f11199);
                m35431(abstractC0634.f2428, enumC3521.f11199);
                AbstractC8396 abstractC83915 = abstractC0634.f2428;
                AbstractC8396 abstractC83916 = abstractC0634.f2429;
                C21307 c21307M35428 = m35424(abstractC83915);
                C21307 c21307M35429 = m35424(abstractC83916);
                if (c21307M35428.f68688 == null) {
                    c21307M35428.f68688 = new HashSet(3);
                }
                if (c21307M35429.f68688 == null) {
                    c21307M35429.f68688 = new HashSet(3);
                }
                c21307M35428.f68688.add(c21307M35429);
                c21307M35429.f68688.add(c21307M35428);
                m35425(abstractC0634, "Z");
                break;
            case 24:
            case 25:
            case 26:
            case 27:
                String str9 = ((C10576) abstractC0634).f31750;
                m35431(abstractC83912, str9);
                m35431(abstractC83913, str9);
                m35425(abstractC0634, "Z");
                break;
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
                String str10 = ((C10576) abstractC0634).f31750;
                m35431(abstractC83912, str10);
                m35431(abstractC83913, str10);
                m35425(abstractC0634, str10);
                break;
            case 36:
            case 37:
            case 38:
                String str11 = ((C10576) abstractC0634).f31750;
                m35431(abstractC83912, str11);
                m35431(abstractC83913, str11);
                if ("J".equals(str11) || "w".equals(str11)) {
                    m35425(abstractC0634, str11);
                } else {
                    m35425(abstractC0634, EnumC3520.ZI.f11199);
                }
                break;
            case 39:
            case 40:
            case 41:
                String str12 = ((C10576) abstractC0634).f31750;
                m35431(abstractC83912, str12);
                m35431(abstractC83913, "I");
                m35425(abstractC0634, str12);
                break;
            default:
                throw new UnsupportedOperationException();
        }
        m35427(abstractC83912, true);
        m35427(abstractC83913, true);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C21307 m35424(AbstractC8396 abstractC8396) {
        Object obj = abstractC8396.f25748;
        if (!(obj instanceof C21307)) {
            C21307 c21307 = new C21307(abstractC8396);
            this.f45604.add(c21307);
            abstractC8396.f25748 = c21307;
            return c21307;
        }
        return (C21307) obj;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m35426(AbstractC8396 abstractC8396, AbstractC8396 abstractC8397) {
        C21307 c21307M35424 = m35424(abstractC8396);
        C21307 c21307M35425 = m35424(abstractC8397);
        if (c21307M35424.f68683 == null) {
            c21307M35424.f68683 = new HashSet();
        }
        c21307M35424.f68683.add(c21307M35425);
        if (c21307M35425.f68684 == null) {
            c21307M35425.f68684 = new HashSet();
        }
        c21307M35425.f68684.add(c21307M35424);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m35425(AbstractC8396 abstractC8396, String str) {
        C21307 c21307M48337 = m35424(abstractC8396).m48337();
        c21307M48337.f68689 = str;
        c21307M48337.m48340(EnumC3520.m10714(str));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m35428(AbstractC14039 abstractC14039) {
        if (abstractC14039.f5638 == EnumC7690.FILL_ARRAY_DATA) {
            m35426(abstractC14039.f42444, abstractC14039.f42445);
            return;
        }
        AbstractC8396 abstractC8396 = abstractC14039.f42445;
        AbstractC8396 abstractC8397 = abstractC14039.f42444;
        m35426(abstractC8396, abstractC8397);
        m35427(abstractC8396, true);
        m35427(abstractC8397, false);
    }

    /* JADX WARN: Code duplicated, block: B:164:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:234:0x02c2 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList m35432() {
        HashSet hashSet;
        int iM35421;
        int iM35422;
        HashSet hashSet2;
        String str;
        Set set;
        ArrayList arrayList;
        C5637 c5637 = this.f45603;
        AbstractC1591 first = c5637.f17411.getFirst();
        while (true) {
            int i = 1;
            if (first == null) {
                HashSet hashSet3 = new HashSet();
                ArrayList arrayList2 = this.f45604;
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    C21307 c21307M48337 = ((C21307) it.next()).m48337();
                    if (c21307M48337.f68687 != null || c21307M48337.f68680 != null) {
                        hashSet3.add(c21307M48337);
                    }
                    m35429(c21307M48337, EnumC7900.f24479);
                    m35429(c21307M48337, EnumC7900.f24481);
                    m35429(c21307M48337, EnumC7900.f24484);
                }
                C5784 c5784 = new C5784();
                c5784.addAll(arrayList2);
                while (!c5784.isEmpty()) {
                    while (!c5784.isEmpty()) {
                        C21307 c21307M48338 = ((C21307) c5784.poll()).m48337();
                        EnumC3520 enumC3520 = c21307M48338.f68685;
                        switch (C2256.f7332[enumC3520.ordinal()]) {
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                            case 11:
                                c21307M48338.f68689 = enumC3520.f11199;
                                break;
                        }
                        String str2 = c21307M48338.f68689;
                        if (str2 == null && (set = c21307M48338.f68684) != null && set.size() > i) {
                            Iterator it2 = c21307M48338.f68684.iterator();
                            do {
                                if (!it2.hasNext()) {
                                    Iterator it3 = c21307M48338.f68684.iterator();
                                    String strM48338 = ((C21307) it3.next()).m48338();
                                    while (it3.hasNext()) {
                                        strM48338 = m35430(strM48338, ((C21307) it3.next()).m48338());
                                    }
                                    c21307M48338.f68689 = strM48338;
                                    str2 = strM48338;
                                }
                            } while (((C21307) it2.next()).m48338() != null);
                        }
                        Set set2 = c21307M48338.f68684;
                        if (set2 != null) {
                            Iterator it4 = set2.iterator();
                            while (it4.hasNext()) {
                                C21307 c21307M48339 = ((C21307) it4.next()).m48337();
                                if (c21307M48339.m48340(enumC3520)) {
                                    c5784.add(c21307M48339);
                                }
                                Set set3 = c21307M48338.f68682;
                                if (set3 != null) {
                                    if (c21307M48339.f68682 == null) {
                                        c21307M48339.f68682 = new HashSet();
                                    }
                                    if (c21307M48339.f68682.addAll(set3)) {
                                        c5784.add(c21307M48339);
                                    }
                                }
                            }
                        }
                        Set set4 = c21307M48338.f68683;
                        if (set4 != null) {
                            Iterator it5 = set4.iterator();
                            while (it5.hasNext()) {
                                C21307 c21307M483310 = ((C21307) it5.next()).m48337();
                                if (c21307M483310.m48340(enumC3520)) {
                                    c5784.add(c21307M483310);
                                }
                                if (str2 != null) {
                                    String str3 = c21307M483310.f68689;
                                    if (str3 == null) {
                                        c21307M483310.f68689 = str2;
                                        c5784.add(c21307M483310);
                                    } else {
                                        String strM35430 = m35430(str2, str3);
                                        if (!strM35430.equals(c21307M483310.f68689)) {
                                            c21307M483310.f68689 = strM35430;
                                            c5784.add(c21307M483310);
                                        }
                                    }
                                }
                            }
                        }
                        Set set5 = c21307M48338.f68688;
                        if (set5 != null) {
                            Iterator it6 = set5.iterator();
                            while (it6.hasNext()) {
                                C21307 c21307M483311 = ((C21307) it6.next()).m48337();
                                if (c21307M483311.m48340(enumC3520)) {
                                    c5784.add(c21307M483311);
                                }
                            }
                        }
                    }
                    Iterator it7 = hashSet3.iterator();
                    while (it7.hasNext()) {
                        C21307 c21307M483312 = ((C21307) it7.next()).m48337();
                        String str4 = c21307M483312.f68689;
                        if (str4 == null || str4.charAt(0) != '[') {
                            hashSet = hashSet3;
                        } else {
                            String strSubstring = str4.substring(i);
                            EnumC3520 enumC3520M10714 = EnumC3520.m10714(strSubstring);
                            Set set6 = c21307M483312.f68687;
                            if (set6 != null) {
                                Iterator it8 = set6.iterator();
                                while (it8.hasNext()) {
                                    C21307 c21307M483313 = ((C21307) it8.next()).m48337();
                                    if (c21307M483313.m48340(enumC3520M10714)) {
                                        c5784.add(c21307M483313);
                                    }
                                    C21307 c21307M483314 = c21307M483313.m48337();
                                    String strM35422 = c21307M483314.f68689;
                                    if (strM35422 == null) {
                                        c21307M483314.f68689 = strSubstring;
                                        c5784.add(c21307M483314);
                                        hashSet2 = hashSet3;
                                    } else {
                                        if (!strSubstring.equals(strM35422) && (iM35421 = m35421(strSubstring)) <= (iM35422 = m35421(strM35422))) {
                                            if (iM35422 > iM35421) {
                                                hashSet2 = hashSet3;
                                            } else {
                                                String strSubstring2 = strSubstring.substring(iM35421);
                                                String strSubstring3 = strM35422.substring(iM35422);
                                                EnumC3520 enumC3520M10715 = EnumC3520.m10714(strSubstring2);
                                                EnumC3520 enumC3520M10716 = EnumC3520.m10714(strSubstring3);
                                                boolean z = enumC3520M10715.f11198;
                                                hashSet2 = hashSet3;
                                                if (!z || enumC3520M10716.f11198) {
                                                    if (z || !enumC3520M10716.f11198) {
                                                        if (!z) {
                                                            strM35422 = m35422(iM35421, EnumC3520.m10715(enumC3520M10715, enumC3520M10716).f11199);
                                                        } else if (enumC3520M10715 != enumC3520M10716) {
                                                            if (iM35421 == 0) {
                                                                throw new RuntimeException();
                                                            }
                                                            strM35422 = m35422(iM35421 - 1, "L");
                                                        } else if (enumC3520M10715 == EnumC3520.INT) {
                                                            int i2 = 3;
                                                            while (true) {
                                                                if (i2 >= 0) {
                                                                    str = C22012.f70566[i2];
                                                                    if (!strSubstring.equals(str) && !strM35422.equals(str)) {
                                                                        i2--;
                                                                    }
                                                                } else {
                                                                    str = "I";
                                                                }
                                                            }
                                                            strM35422 = m35422(iM35421, str);
                                                        } else {
                                                            strM35422 = m35422(iM35421, "L");
                                                        }
                                                    }
                                                }
                                            }
                                            if (!strM35422.equals(c21307M483314.f68689)) {
                                                c21307M483314.f68689 = strM35422;
                                                c5784.add(c21307M483314);
                                            }
                                        } else {
                                            hashSet2 = hashSet3;
                                        }
                                        strM35422 = strSubstring;
                                        if (!strM35422.equals(c21307M483314.f68689)) {
                                            c21307M483314.f68689 = strM35422;
                                            c5784.add(c21307M483314);
                                        }
                                    }
                                    hashSet3 = hashSet2;
                                }
                            }
                            hashSet = hashSet3;
                            Set set7 = c21307M483312.f68680;
                            if (set7 != null) {
                                Iterator it9 = set7.iterator();
                                while (it9.hasNext()) {
                                    C21307 c21307M483315 = ((C21307) it9.next()).m48337();
                                    if (c21307M483315.m48340(enumC3520M10714)) {
                                        c5784.add(c21307M483315);
                                    }
                                    if (c21307M483315.f68682 == null) {
                                        c21307M483315.f68682 = new HashSet();
                                    }
                                    if (c21307M483315.f68682.add(strSubstring)) {
                                        c5784.add(c21307M483315);
                                    }
                                }
                            }
                        }
                        i = 1;
                        hashSet3 = hashSet;
                    }
                }
                return arrayList2;
            }
            int i3 = C2256.f7331[first.f5633.ordinal()];
            if (i3 != 1) {
                if (i3 == 2) {
                    AbstractC23212 abstractC23212 = (AbstractC23212) first;
                    EnumC7690 enumC7690 = abstractC23212.f5638;
                    if (enumC7690 != EnumC7690.GOTO) {
                        AbstractC8396 abstractC8396 = abstractC23212.f74596;
                        switch (C2256.f7334[enumC7690.ordinal()]) {
                            case 1:
                            case 2:
                                m35431(abstractC8396, "I");
                                break;
                            case 3:
                                m35431(abstractC8396, "Z");
                                break;
                            case 4:
                            case 5:
                                m35431(abstractC8396, "L");
                                break;
                            case 6:
                                m35431(abstractC8396, "Ljava/lang/Throwable;");
                                break;
                            case 7:
                                m35431(abstractC8396, c5637.f17419);
                                break;
                        }
                        m35427(abstractC8396, true);
                    }
                } else if (i3 == 3) {
                    m35428((AbstractC14039) first);
                }
            } else if (first.f5638 == EnumC7690.LABEL && (arrayList = ((C13334) first).f39897) != null) {
                Iterator it10 = arrayList.iterator();
                while (it10.hasNext()) {
                    m35428((C21802) it10.next());
                }
            }
            first = first.m5439();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        Iterator it = this.f45604.iterator();
        while (it.hasNext()) {
            sb.append((C21307) it.next());
            sb.append("\n");
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m35431(AbstractC8396 abstractC8396, String str) {
        C21307 c21307M35424 = m35424(abstractC8396);
        if (c21307M35424.f68682 == null) {
            c21307M35424.f68682 = new HashSet();
        }
        c21307M35424.f68682.add(str);
        c21307M35424.m48340(EnumC3520.m10714(str));
    }
}
