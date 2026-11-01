package p067l;

import com.tencent.p062mm.opensdk.modelmsg.WXMediaMessage;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: l.ܶۗۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: K608 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16581 {

    /* JADX INFO: renamed from: ֫ */
    public C7726 f48715;

    /* JADX INFO: renamed from: ۧ */
    public ArrayList f48716 = new ArrayList();

    public C16581(C7726 c7726) {
        this.f48715 = c7726;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m37581(C22618 c22618, EnumC9876 enumC9876) {
        Set setMo3620 = enumC9876.mo3620(c22618);
        if (setMo3620 != null) {
            if (setMo3620.size() > 1) {
                ArrayList arrayList = new ArrayList(setMo3620);
                C22618 c22618M50672 = ((C22618) arrayList.get(0)).m50672();
                for (int i = 1; i < arrayList.size(); i++) {
                    c22618M50672.m50674((C22618) arrayList.get(i));
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static String m37582(String str, String str2) {
        if (!str.equals(str2)) {
            EnumC5714 enumC5714M12710 = EnumC5714.m12710(str);
            EnumC5714 enumC5714M12711 = EnumC5714.m12710(str2);
            boolean z = enumC5714M12710.f14004;
            if (!z || enumC5714M12711.f14004) {
                if (!z && enumC5714M12711.f14004) {
                    return str2;
                }
                if (z) {
                    EnumC5714 enumC5714 = EnumC5714.INT;
                    if ((enumC5714M12710 == enumC5714 && enumC5714M12711 == EnumC5714.BOOLEAN) || (enumC5714M12711 == enumC5714 && enumC5714M12710 == EnumC5714.BOOLEAN)) {
                        return "I";
                    }
                    if (enumC5714M12710 != enumC5714M12711) {
                        throw new RuntimeException();
                    }
                    if (enumC5714M12710 == enumC5714) {
                        for (int i = 3; i >= 0; i--) {
                            String str3 = C23288.f73279[i];
                            if (str.equals(str3) || str2.equals(str3)) {
                                return str3;
                            }
                        }
                        return "I";
                    }
                    if (enumC5714M12710 == EnumC5714.OBJECT) {
                        int iM37573 = m37573(str);
                        int iM37574 = m37573(str2);
                        if (iM37573 == 0 || iM37574 == 0) {
                            if (!str.equals(str2) && ("L".endsWith(str) || (!"L".equals(str2) && str.compareTo(str2) <= 0))) {
                                return str2;
                            }
                        } else {
                            String strSubstring = str.substring(iM37573);
                            String strSubstring2 = str2.substring(iM37574);
                            if (iM37573 < iM37574) {
                                if (strSubstring2.charAt(0) != 'L') {
                                    iM37574--;
                                }
                                return m37574(iM37574, "L");
                            }
                            if (iM37573 > iM37574) {
                                if (strSubstring.charAt(0) != 'L') {
                                    iM37573--;
                                }
                                return m37574(iM37573, "L");
                            }
                            if (strSubstring.charAt(0) != 'L' || strSubstring2.charAt(0) != 'L') {
                                return m37574(iM37573 - 1, "L");
                            }
                            return m37574(iM37573, "L");
                        }
                    } else {
                        throw new RuntimeException();
                    }
                } else {
                    return EnumC5714.m12711(enumC5714M12710, enumC5714M12711).f14005;
                }
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m37574(int i, String str) {
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

    /* JADX INFO: renamed from: ֫ */
    public static int m37573(String str) {
        int i = 0;
        while (str.charAt(i) == '[') {
            i++;
        }
        return i;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m37579(AbstractC10348 abstractC10348, boolean z) {
        int i = C4512.f10119[abstractC10348.f28660.ordinal()];
        if (i == 1) {
            AbstractC20407 abstractC20407 = (AbstractC20407) abstractC10348;
            EnumC3642 enumC3642 = abstractC20407.f28658;
            switch (C4512.f10121[enumC3642.ordinal()]) {
                case 2:
                    C19065 c19065 = (C19065) abstractC20407;
                    m37577(c19065, c19065.f56875);
                    return;
                case 3:
                case 4:
                case 5:
                    C22419 c22419 = (C22419) abstractC20407;
                    String str = c22419.f70721;
                    if (str == null && enumC3642 == EnumC3642.EXCEPTION_REF) {
                        str = "Ljava/lang/Throwable;";
                    }
                    m37577(c22419, str);
                    return;
                case 6:
                    C11690 c11690 = (C11690) abstractC20407;
                    String str2 = c11690.f32597;
                    if (z) {
                        m37577(c11690, str2);
                        return;
                    } else {
                        m37583(c11690, str2);
                        return;
                    }
                case 7:
                    C13761 c13761 = (C13761) abstractC20407;
                    Object obj = c13761.f38899;
                    if (obj instanceof String) {
                        m37577(c13761, "Ljava/lang/String;");
                        return;
                    }
                    if (obj instanceof C24094) {
                        m37577(c13761, "Ljava/lang/Class;");
                        return;
                    }
                    if (!(obj instanceof Number)) {
                        if (obj instanceof Character) {
                            m37577(c13761, "C");
                            return;
                        } else {
                            m37577(c13761, "L");
                            return;
                        }
                    }
                    if ((obj instanceof Integer) || (obj instanceof Byte) || (obj instanceof Short)) {
                        int iIntValue = ((Number) obj).intValue();
                        if (iIntValue == 0) {
                            m37577(c13761, EnumC5714.ZIFL.f14005);
                            return;
                        } else if (iIntValue == 1) {
                            m37577(c13761, EnumC5714.ZIF.f14005);
                            return;
                        } else {
                            m37577(c13761, EnumC5714.IF.f14005);
                            return;
                        }
                    }
                    if (obj instanceof Long) {
                        m37577(c13761, "w");
                        return;
                    } else if (obj instanceof Float) {
                        m37577(c13761, "F");
                        return;
                    } else {
                        if (obj instanceof Double) {
                            m37577(c13761, "D");
                            return;
                        }
                        return;
                    }
                default:
                    return;
            }
        }
        if (i == 2) {
            AbstractC21078 abstractC21078 = (AbstractC21078) abstractC10348;
            AbstractC10348 abstractC10349 = abstractC21078.f66218;
            switch (C4512.f10121[abstractC21078.f28658.ordinal()]) {
                case 8:
                    C8396 c8396 = (C8396) abstractC21078;
                    String str3 = c8396.f22520;
                    if (str3.equals("B")) {
                        EnumC5714 enumC5714 = EnumC5714.ZI;
                        m37583(abstractC10349, enumC5714.f14005);
                        m37577(abstractC21078, enumC5714.f14005);
                    } else {
                        m37583(abstractC10349, c8396.f22521);
                        m37577(abstractC21078, str3);
                    }
                    break;
                case 9:
                    C15771 c15771 = (C15771) abstractC21078;
                    String str4 = c15771.f45664;
                    if (z) {
                        m37577(c15771, str4);
                    } else {
                        m37583(c15771, str4);
                    }
                    if (abstractC10349 != null) {
                        m37583(abstractC10349, c15771.f45665);
                    }
                    break;
                case 10:
                    C17723 c17723 = (C17723) abstractC21078;
                    m37577(c17723, c17723.f52945);
                    m37583(abstractC10349, "L");
                    break;
                case 11:
                    m37577((C17723) abstractC21078, "Z");
                    m37583(abstractC10349, "L");
                    break;
                case 12:
                    C17723 c17724 = (C17723) abstractC21078;
                    m37577(c17724, "[" + c17724.f52945);
                    m37583(abstractC10349, "I");
                    break;
                case 13:
                    m37577((C6325) abstractC21078, "I");
                    m37583(abstractC10349, "[?");
                    break;
                case 14:
                case 15:
                    C6325 c6325 = (C6325) abstractC21078;
                    String str5 = c6325.f16390;
                    m37577(c6325, str5);
                    m37583(abstractC10349, str5);
                    break;
            }
            if (abstractC10349 != null) {
                m37579(abstractC10349, true);
                return;
            }
            return;
        }
        if (i != 3) {
            if (i != 4) {
                return;
            }
            AbstractC7666 abstractC7666 = (AbstractC7666) abstractC10348;
            AbstractC10348[] abstractC10348Arr = abstractC7666.f20109;
            switch (C4512.f10121[abstractC7666.f28658.ordinal()]) {
                case 42:
                case 43:
                case 44:
                case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                case 46:
                case 47:
                case 48:
                    AbstractC15101 abstractC15101 = (AbstractC15101) abstractC7666;
                    String strM29531 = abstractC15101.mo8846().m29531();
                    m37577(abstractC7666, strM29531);
                    m37583(abstractC7666, strM29531);
                    String[] strArrM29530 = abstractC15101.mo8846().m29530();
                    if (strArrM29530.length != abstractC10348Arr.length) {
                        if (strArrM29530.length + 1 != abstractC10348Arr.length) {
                            throw new RuntimeException();
                        }
                        m37583(abstractC10348Arr[0], "L");
                        for (int i2 = 1; i2 < abstractC10348Arr.length; i2++) {
                            m37583(abstractC10348Arr[i2], strArrM29530[i2 - 1]);
                        }
                    } else {
                        for (int i3 = 0; i3 < abstractC10348Arr.length; i3++) {
                            m37583(abstractC10348Arr[i3], strArrM29530[i3]);
                        }
                    }
                    break;
                case 49:
                    C9737 c9737 = (C9737) abstractC7666;
                    String str6 = c9737.f26894;
                    for (AbstractC10348 abstractC103410 : abstractC10348Arr) {
                        m37583(abstractC103410, str6);
                    }
                    m37577(c9737, C21466.m48631("[", str6));
                    break;
                case 50:
                    C16382 c16382 = (C16382) abstractC7666;
                    for (AbstractC10348 abstractC103411 : abstractC10348Arr) {
                        m37583(abstractC103411, "I");
                    }
                    StringBuilder sb = new StringBuilder();
                    for (int i4 = 0; i4 < c16382.f48138; i4++) {
                        sb.append('[');
                    }
                    sb.append(c16382.f48139);
                    m37577(c16382, sb.toString());
                    break;
                case 51:
                    for (AbstractC10348 abstractC103412 : abstractC10348Arr) {
                        m37578(abstractC103412, abstractC7666);
                    }
                    break;
            }
            for (AbstractC10348 abstractC103413 : abstractC7666.f20109) {
                m37579(abstractC103413, true);
            }
            return;
        }
        AbstractC2971 abstractC2971 = (AbstractC2971) abstractC10348;
        AbstractC10348 abstractC103414 = abstractC2971.f5200;
        abstractC103414.getClass();
        AbstractC10348 abstractC103415 = abstractC2971.f5201;
        abstractC103415.getClass();
        switch (C4512.f10121[abstractC2971.f28658.ordinal()]) {
            case 16:
                m37583(abstractC103415, "I");
                String str7 = ((C14431) abstractC2971).f41239;
                m37583(abstractC103414, C21466.m48631("[", str7));
                if (z) {
                    m37577(abstractC2971, str7);
                    C22618 c22618M37576 = m37576(abstractC103414);
                    C22618 c22618M37577 = m37576(abstractC2971);
                    if (c22618M37576.f71378 == null) {
                        c22618M37576.f71378 = new HashSet(3);
                    }
                    c22618M37576.f71378.add(c22618M37577);
                    if (c22618M37577.f71370 == null) {
                        c22618M37577.f71370 = new HashSet(3);
                    }
                    c22618M37577.f71370.add(c22618M37576);
                } else {
                    m37583(abstractC2971, str7);
                    C22618 c22618M37578 = m37576(abstractC103414);
                    C22618 c22618M37579 = m37576(abstractC2971);
                    if (c22618M37578.f71371 == null) {
                        c22618M37578.f71371 = new HashSet(3);
                    }
                    c22618M37578.f71371.add(c22618M37579);
                    if (c22618M37579.f71370 == null) {
                        c22618M37579.f71370 = new HashSet(3);
                    }
                    c22618M37579.f71370.add(c22618M37578);
                }
                break;
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
                String str8 = ((C12420) abstractC2971).f34716;
                m37583(abstractC103414, str8);
                m37583(abstractC103415, str8);
                m37577(abstractC2971, "I");
                break;
            case 22:
            case 23:
                AbstractC10348 abstractC103416 = abstractC2971.f5201;
                EnumC5714 enumC5715 = EnumC5714.ZIL;
                m37583(abstractC103416, enumC5715.f14005);
                m37583(abstractC2971.f5200, enumC5715.f14005);
                AbstractC10348 abstractC103417 = abstractC2971.f5200;
                AbstractC10348 abstractC103418 = abstractC2971.f5201;
                C22618 c22618M375710 = m37576(abstractC103417);
                C22618 c22618M375711 = m37576(abstractC103418);
                if (c22618M375710.f71379 == null) {
                    c22618M375710.f71379 = new HashSet(3);
                }
                if (c22618M375711.f71379 == null) {
                    c22618M375711.f71379 = new HashSet(3);
                }
                c22618M375710.f71379.add(c22618M375711);
                c22618M375711.f71379.add(c22618M375710);
                m37577(abstractC2971, "Z");
                break;
            case 24:
            case 25:
            case 26:
            case 27:
                String str9 = ((C12420) abstractC2971).f34716;
                m37583(abstractC103414, str9);
                m37583(abstractC103415, str9);
                m37577(abstractC2971, "Z");
                break;
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
                String str10 = ((C12420) abstractC2971).f34716;
                m37583(abstractC103414, str10);
                m37583(abstractC103415, str10);
                m37577(abstractC2971, str10);
                break;
            case 36:
            case 37:
            case 38:
                String str11 = ((C12420) abstractC2971).f34716;
                m37583(abstractC103414, str11);
                m37583(abstractC103415, str11);
                if ("J".equals(str11) || "w".equals(str11)) {
                    m37577(abstractC2971, str11);
                } else {
                    m37577(abstractC2971, EnumC5714.ZI.f14005);
                }
                break;
            case 39:
            case 40:
            case 41:
                String str12 = ((C12420) abstractC2971).f34716;
                m37583(abstractC103414, str12);
                m37583(abstractC103415, "I");
                m37577(abstractC2971, str12);
                break;
            default:
                throw new UnsupportedOperationException();
        }
        m37579(abstractC103414, true);
        m37579(abstractC103415, true);
    }

    /* JADX INFO: renamed from: ֫ */
    private C22618 m37576(AbstractC10348 abstractC10348) {
        Object obj = abstractC10348.f28661;
        if (!(obj instanceof C22618)) {
            C22618 c22618 = new C22618(abstractC10348);
            this.f48716.add(c22618);
            abstractC10348.f28661 = c22618;
            return c22618;
        }
        return (C22618) obj;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m37578(AbstractC10348 abstractC10348, AbstractC10348 abstractC10349) {
        C22618 c22618M37576 = m37576(abstractC10348);
        C22618 c22618M37577 = m37576(abstractC10349);
        if (c22618M37576.f71374 == null) {
            c22618M37576.f71374 = new HashSet();
        }
        c22618M37576.f71374.add(c22618M37577);
        if (c22618M37577.f71375 == null) {
            c22618M37577.f71375 = new HashSet();
        }
        c22618M37577.f71375.add(c22618M37576);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m37577(AbstractC10348 abstractC10348, String str) {
        C22618 c22618M50672 = m37576(abstractC10348).m50672();
        c22618M50672.f71380 = str;
        c22618M50672.m50675(EnumC5714.m12710(str));
    }

    /* JADX INFO: renamed from: ֫ */
    private void m37580(AbstractC15711 abstractC15711) {
        if (abstractC15711.f8417 == EnumC9677.FILL_ARRAY_DATA) {
            m37578(abstractC15711.f45527, abstractC15711.f45528);
            return;
        }
        AbstractC10348 abstractC10348 = abstractC15711.f45528;
        AbstractC10348 abstractC10349 = abstractC15711.f45527;
        m37578(abstractC10348, abstractC10349);
        m37579(abstractC10348, true);
        m37579(abstractC10349, false);
    }

    /* JADX WARN: Code duplicated, block: B:164:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:234:0x02c2 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ֫ */
    public final ArrayList m37584() {
        HashSet hashSet;
        int iM37573;
        int iM37574;
        HashSet hashSet2;
        String str;
        Set set;
        ArrayList arrayList;
        C7726 c7726 = this.f48715;
        AbstractC3880 first = c7726.f20257.getFirst();
        while (true) {
            int i = 1;
            if (first == null) {
                HashSet hashSet3 = new HashSet();
                ArrayList arrayList2 = this.f48716;
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    C22618 c22618M50672 = ((C22618) it.next()).m50672();
                    if (c22618M50672.f71378 != null || c22618M50672.f71371 != null) {
                        hashSet3.add(c22618M50672);
                    }
                    m37581(c22618M50672, EnumC9876.f27395);
                    m37581(c22618M50672, EnumC9876.f27397);
                    m37581(c22618M50672, EnumC9876.f27400);
                }
                C7865 c7865 = new C7865();
                c7865.addAll(arrayList2);
                while (!c7865.isEmpty()) {
                    while (!c7865.isEmpty()) {
                        C22618 c22618M50673 = ((C22618) c7865.poll()).m50672();
                        EnumC5714 enumC5714 = c22618M50673.f71376;
                        switch (C4512.f10120[enumC5714.ordinal()]) {
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                            case 11:
                                c22618M50673.f71380 = enumC5714.f14005;
                                break;
                        }
                        String str2 = c22618M50673.f71380;
                        if (str2 == null && (set = c22618M50673.f71375) != null && set.size() > i) {
                            Iterator it2 = c22618M50673.f71375.iterator();
                            do {
                                if (!it2.hasNext()) {
                                    Iterator it3 = c22618M50673.f71375.iterator();
                                    String strM50673 = ((C22618) it3.next()).m50673();
                                    while (it3.hasNext()) {
                                        strM50673 = m37582(strM50673, ((C22618) it3.next()).m50673());
                                    }
                                    c22618M50673.f71380 = strM50673;
                                    str2 = strM50673;
                                }
                            } while (((C22618) it2.next()).m50673() != null);
                        }
                        Set set2 = c22618M50673.f71375;
                        if (set2 != null) {
                            Iterator it4 = set2.iterator();
                            while (it4.hasNext()) {
                                C22618 c22618M50674 = ((C22618) it4.next()).m50672();
                                if (c22618M50674.m50675(enumC5714)) {
                                    c7865.add(c22618M50674);
                                }
                                Set set3 = c22618M50673.f71373;
                                if (set3 != null) {
                                    if (c22618M50674.f71373 == null) {
                                        c22618M50674.f71373 = new HashSet();
                                    }
                                    if (c22618M50674.f71373.addAll(set3)) {
                                        c7865.add(c22618M50674);
                                    }
                                }
                            }
                        }
                        Set set4 = c22618M50673.f71374;
                        if (set4 != null) {
                            Iterator it5 = set4.iterator();
                            while (it5.hasNext()) {
                                C22618 c22618M50675 = ((C22618) it5.next()).m50672();
                                if (c22618M50675.m50675(enumC5714)) {
                                    c7865.add(c22618M50675);
                                }
                                if (str2 != null) {
                                    String str3 = c22618M50675.f71380;
                                    if (str3 == null) {
                                        c22618M50675.f71380 = str2;
                                        c7865.add(c22618M50675);
                                    } else {
                                        String strM37582 = m37582(str2, str3);
                                        if (!strM37582.equals(c22618M50675.f71380)) {
                                            c22618M50675.f71380 = strM37582;
                                            c7865.add(c22618M50675);
                                        }
                                    }
                                }
                            }
                        }
                        Set set5 = c22618M50673.f71379;
                        if (set5 != null) {
                            Iterator it6 = set5.iterator();
                            while (it6.hasNext()) {
                                C22618 c22618M50676 = ((C22618) it6.next()).m50672();
                                if (c22618M50676.m50675(enumC5714)) {
                                    c7865.add(c22618M50676);
                                }
                            }
                        }
                    }
                    Iterator it7 = hashSet3.iterator();
                    while (it7.hasNext()) {
                        C22618 c22618M50677 = ((C22618) it7.next()).m50672();
                        String str4 = c22618M50677.f71380;
                        if (str4 == null || str4.charAt(0) != '[') {
                            hashSet = hashSet3;
                        } else {
                            String strSubstring = str4.substring(i);
                            EnumC5714 enumC5714M12710 = EnumC5714.m12710(strSubstring);
                            Set set6 = c22618M50677.f71378;
                            if (set6 != null) {
                                Iterator it8 = set6.iterator();
                                while (it8.hasNext()) {
                                    C22618 c22618M50678 = ((C22618) it8.next()).m50672();
                                    if (c22618M50678.m50675(enumC5714M12710)) {
                                        c7865.add(c22618M50678);
                                    }
                                    C22618 c22618M50679 = c22618M50678.m50672();
                                    String strM37574 = c22618M50679.f71380;
                                    if (strM37574 == null) {
                                        c22618M50679.f71380 = strSubstring;
                                        c7865.add(c22618M50679);
                                        hashSet2 = hashSet3;
                                    } else {
                                        if (!strSubstring.equals(strM37574) && (iM37573 = m37573(strSubstring)) <= (iM37574 = m37573(strM37574))) {
                                            if (iM37574 > iM37573) {
                                                hashSet2 = hashSet3;
                                            } else {
                                                String strSubstring2 = strSubstring.substring(iM37573);
                                                String strSubstring3 = strM37574.substring(iM37574);
                                                EnumC5714 enumC5714M12711 = EnumC5714.m12710(strSubstring2);
                                                EnumC5714 enumC5714M12712 = EnumC5714.m12710(strSubstring3);
                                                boolean z = enumC5714M12711.f14004;
                                                hashSet2 = hashSet3;
                                                if (!z || enumC5714M12712.f14004) {
                                                    if (z || !enumC5714M12712.f14004) {
                                                        if (!z) {
                                                            strM37574 = m37574(iM37573, EnumC5714.m12711(enumC5714M12711, enumC5714M12712).f14005);
                                                        } else if (enumC5714M12711 != enumC5714M12712) {
                                                            if (iM37573 == 0) {
                                                                throw new RuntimeException();
                                                            }
                                                            strM37574 = m37574(iM37573 - 1, "L");
                                                        } else if (enumC5714M12711 == EnumC5714.INT) {
                                                            int i2 = 3;
                                                            while (true) {
                                                                if (i2 >= 0) {
                                                                    str = C23288.f73279[i2];
                                                                    if (!strSubstring.equals(str) && !strM37574.equals(str)) {
                                                                        i2--;
                                                                    }
                                                                } else {
                                                                    str = "I";
                                                                }
                                                            }
                                                            strM37574 = m37574(iM37573, str);
                                                        } else {
                                                            strM37574 = m37574(iM37573, "L");
                                                        }
                                                    }
                                                }
                                            }
                                            if (!strM37574.equals(c22618M50679.f71380)) {
                                                c22618M50679.f71380 = strM37574;
                                                c7865.add(c22618M50679);
                                            }
                                        } else {
                                            hashSet2 = hashSet3;
                                        }
                                        strM37574 = strSubstring;
                                        if (!strM37574.equals(c22618M50679.f71380)) {
                                            c22618M50679.f71380 = strM37574;
                                            c7865.add(c22618M50679);
                                        }
                                    }
                                    hashSet3 = hashSet2;
                                }
                            }
                            hashSet = hashSet3;
                            Set set7 = c22618M50677.f71371;
                            if (set7 != null) {
                                Iterator it9 = set7.iterator();
                                while (it9.hasNext()) {
                                    C22618 c22618M506710 = ((C22618) it9.next()).m50672();
                                    if (c22618M506710.m50675(enumC5714M12710)) {
                                        c7865.add(c22618M506710);
                                    }
                                    if (c22618M506710.f71373 == null) {
                                        c22618M506710.f71373 = new HashSet();
                                    }
                                    if (c22618M506710.f71373.add(strSubstring)) {
                                        c7865.add(c22618M506710);
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
            int i3 = C4512.f10119[first.f8412.ordinal()];
            if (i3 != 1) {
                if (i3 == 2) {
                    AbstractC24429 abstractC24429 = (AbstractC24429) first;
                    EnumC9677 enumC9677 = abstractC24429.f8417;
                    if (enumC9677 != EnumC9677.GOTO) {
                        AbstractC10348 abstractC10348 = abstractC24429.f77339;
                        switch (C4512.f10122[enumC9677.ordinal()]) {
                            case 1:
                            case 2:
                                m37583(abstractC10348, "I");
                                break;
                            case 3:
                                m37583(abstractC10348, "Z");
                                break;
                            case 4:
                            case 5:
                                m37583(abstractC10348, "L");
                                break;
                            case 6:
                                m37583(abstractC10348, "Ljava/lang/Throwable;");
                                break;
                            case 7:
                                m37583(abstractC10348, c7726.f20265);
                                break;
                        }
                        m37579(abstractC10348, true);
                    }
                } else if (i3 == 3) {
                    m37580((AbstractC15711) first);
                }
            } else if (first.f8417 == EnumC9677.LABEL && (arrayList = ((C15041) first).f42963) != null) {
                Iterator it10 = arrayList.iterator();
                while (it10.hasNext()) {
                    m37580((C23089) it10.next());
                }
            }
            first = first.m7669();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        Iterator it = this.f48716.iterator();
        while (it.hasNext()) {
            sb.append((C22618) it.next());
            sb.append("\n");
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۧ */
    private void m37583(AbstractC10348 abstractC10348, String str) {
        C22618 c22618M37576 = m37576(abstractC10348);
        if (c22618M37576.f71373 == null) {
            c22618M37576.f71373 = new HashSet();
        }
        c22618M37576.f71373.add(str);
        c22618M37576.m50675(EnumC5714.m12710(str));
    }
}
