package p067l;

import bin.p000mt.json.JSONObject;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* JADX INFO: renamed from: l.֫֫ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: N75Z */
/* JADX INFO: loaded from: classes2.dex */
public final class C3804 {

    /* JADX INFO: renamed from: ֫ */
    public static final Set f8144;

    /* JADX INFO: renamed from: ۧ */
    public static final Set f8145;

    /* JADX INFO: renamed from: ܳ */
    public static final Set f8146;

    /* JADX INFO: renamed from: ܽ */
    public static final Set f8147;

    /* JADX INFO: renamed from: ܿ */
    public static final Set f8148;

    /* JADX INFO: renamed from: ᩳ */
    public static final Set f8149;

    /* JADX INFO: renamed from: ᩻ */
    public static final Set f8150;

    static {
        Object[] objArr = {"function_symbol", "executable_symbol", "requested_address"};
        HashSet hashSet = new HashSet(3);
        for (int i = 0; i < 3; i++) {
            Object obj = objArr[i];
            C12826.requireNonNull(obj);
            if (!hashSet.add(obj)) {
                throw new IllegalArgumentException(C7470.m17246(obj, "duplicate element: "));
            }
        }
        f8146 = C21562.unmodifiableSet(hashSet);
        Object[] objArr2 = {"function_symbol", "executable_symbol", "executable_mapping"};
        HashSet hashSet2 = new HashSet(3);
        for (int i2 = 0; i2 < 3; i2++) {
            Object obj2 = objArr2[i2];
            C12826.requireNonNull(obj2);
            if (!hashSet2.add(obj2)) {
                throw new IllegalArgumentException(C7470.m17246(obj2, "duplicate element: "));
            }
        }
        f8144 = C21562.unmodifiableSet(hashSet2);
        Object[] objArr3 = {"fallthrough", "conditional_jump", "jump", "indirect_jump", "return", "trap", "invalid", "budget_boundary"};
        HashSet hashSet3 = new HashSet(8);
        for (int i3 = 0; i3 < 8; i3++) {
            Object obj3 = objArr3[i3];
            C12826.requireNonNull(obj3);
            if (!hashSet3.add(obj3)) {
                throw new IllegalArgumentException(C7470.m17246(obj3, "duplicate element: "));
            }
        }
        f8150 = C21562.unmodifiableSet(hashSet3);
        Object[] objArr4 = {"fallthrough", "branch_true", "branch_false", "jump"};
        HashSet hashSet4 = new HashSet(4);
        for (int i4 = 0; i4 < 4; i4++) {
            Object obj4 = objArr4[i4];
            C12826.requireNonNull(obj4);
            if (!hashSet4.add(obj4)) {
                throw new IllegalArgumentException(C7470.m17246(obj4, "duplicate element: "));
            }
        }
        f8145 = C21562.unmodifiableSet(hashSet4);
        Object[] objArr5 = {"outside_function_boundary", "other_function_symbol"};
        HashSet hashSet5 = new HashSet(2);
        for (int i5 = 0; i5 < 2; i5++) {
            Object obj5 = objArr5[i5];
            C12826.requireNonNull(obj5);
            if (!hashSet5.add(obj5)) {
                throw new IllegalArgumentException(C7470.m17246(obj5, "duplicate element: "));
            }
        }
        f8147 = C21562.unmodifiableSet(hashSet5);
        Object[] objArr6 = {"target_not_executable", "unaligned_or_overlapping_target", "instruction_mode_transition", "max_blocks_reached", "max_analysis_bytes_reached", "max_instructions_reached", "invalid_instruction"};
        HashSet hashSet6 = new HashSet(7);
        for (int i6 = 0; i6 < 7; i6++) {
            Object obj6 = objArr6[i6];
            C12826.requireNonNull(obj6);
            if (!hashSet6.add(obj6)) {
                throw new IllegalArgumentException(C7470.m17246(obj6, "duplicate element: "));
            }
        }
        f8148 = C21562.unmodifiableSet(hashSet6);
        Object[] objArr7 = {"target_not_executable", "unaligned_or_overlapping_target", "instruction_mode_transition"};
        HashSet hashSet7 = new HashSet(3);
        for (int i7 = 0; i7 < 3; i7++) {
            Object obj7 = objArr7[i7];
            C12826.requireNonNull(obj7);
            if (!hashSet7.add(obj7)) {
                throw new IllegalArgumentException(C7470.m17246(obj7, "duplicate element: "));
            }
        }
        f8149 = C21562.unmodifiableSet(hashSet7);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:352:0x0672  */
    /* JADX WARN: Code duplicated, block: B:375:0x069e  */
    /* JADX WARN: Code duplicated, block: B:376:0x06a0  */
    /* JADX INFO: renamed from: ֫ */
    public static JSONObject m7422(C23506 c23506, C9338 c9338, C20739 c20739) throws C5276 {
        HashSet hashSet;
        HashSet hashSet2;
        char c;
        String str = c9338.f25443;
        long j = c9338.f25447;
        C13362 c13362M30503 = C13362.m30503(str);
        String strM46512 = C20569.m46512(c13362M30503, c20739);
        long j2 = c20739.f64000;
        boolean zEquals = "virtual".equals(c20739.f64007);
        if (zEquals && "thumb".equals(strM46512)) {
            j2 &= -2;
        }
        String strM30505 = c13362M30503.m30505();
        int iM30504 = c13362M30503.m30504(strM46512);
        try {
            String str2 = c9338.f25443;
            int i = c20739.f64001;
            int i2 = c20739.f64010;
            int i3 = c20739.f64003;
            c23506.getClass();
            C18579 c18579M40097 = C17609.m40097(str2, j2, zEquals, strM30505, iM30504, i, i2, i3);
            C17908 c17908 = c18579M40097.f55448;
            C6211 c6211 = c18579M40097.f55441;
            if (c6211 == null || !strM30505.equals(c18579M40097.f55442) || iM30504 != c18579M40097.f55444) {
                throw C13863.m31554();
            }
            C13863.m31570(c6211);
            if (!c6211.f15635) {
                throw C5276.m11405("NATIVE_ADDRESS_NOT_MAPPED", "Native address is not mapped in the ELF file.");
            }
            if (!c6211.f15636 || !c6211.f15639) {
                throw C5276.m11405("NATIVE_ADDRESS_NOT_EXECUTABLE", "Native address is not in loaded executable file-backed bytes.");
            }
            if (j >= 0) {
                long j3 = c6211.f15633;
                if (j3 > 0) {
                    long j4 = c6211.f15642;
                    if (j4 < j3) {
                        long j5 = c6211.f15632;
                        if (j5 >= j4) {
                            if (m7421(j5 - j4, j3) <= j) {
                                if (c6211.f15640 != zEquals || c6211.f15638 != j2) {
                                    throw C13863.m31554();
                                }
                                long j6 = c6211.f15637;
                                if (j6 < 0 || (zEquals && j6 != j2)) {
                                    throw C13863.m31554();
                                }
                                if (c17908 != null) {
                                    long j7 = c17908.f53494;
                                    long j8 = c17908.f53501;
                                    String str3 = c17908.f53500;
                                    String str4 = c17908.f53498;
                                    long j9 = c17908.f53495;
                                    String str5 = c17908.f53496;
                                    String str6 = c17908.f53497;
                                    if (j8 >= 0) {
                                        long j10 = c17908.f53499;
                                        if (j10 >= 0 && j10 < j && j7 > 0 && j8 < j7 && j6 >= j8 && j6 < j7 && f8146.contains(str6) && f8144.contains(str5) && j9 >= 0 && str4.length() <= 4096) {
                                            boolean zEquals2 = "requested_address".equals(str6);
                                            if ((!zEquals2) != (j9 > 0) || ((!zEquals2 && str3.isEmpty()) || (zEquals2 && (!str3.isEmpty() || !str4.isEmpty() || j9 != 0 || !"executable_mapping".equals(str5))))) {
                                                throw C13863.m31554();
                                            }
                                            long jM7421 = m7421(j8, j9);
                                            if (!zEquals2 && jM7421 != j7) {
                                                throw C13863.m31554();
                                            }
                                            if ("function_symbol".equals(str6) != "function_symbol".equals(str5) || "executable_symbol".equals(str6) != "executable_symbol".equals(str5)) {
                                                throw C13863.m31554();
                                            }
                                            C15597 c15597 = c18579M40097.f55440;
                                            List list = c18579M40097.f55443;
                                            List list2 = c18579M40097.f55445;
                                            List list3 = c18579M40097.f55447;
                                            List list4 = c18579M40097.f55446;
                                            if (c15597 != null) {
                                                int i4 = c15597.f44569;
                                                int i5 = c15597.f44576;
                                                int i6 = c15597.f44571;
                                                if (i6 >= 0 && i6 <= c20739.f64001 && i5 >= 0 && i5 <= c20739.f64003 && i4 == list4.size() && c15597.f44574 == list2.size() && c15597.f44572 == list.size() && c15597.f44570 == list3.size() && i4 <= c20739.f64010) {
                                                    HashSet hashSet3 = new HashSet();
                                                    HashSet hashSet4 = new HashSet();
                                                    Iterator it = list4.iterator();
                                                    List list5 = list4;
                                                    long j11 = -1;
                                                    int i7 = 0;
                                                    long j12 = 0;
                                                    while (it.hasNext()) {
                                                        Iterator it2 = it;
                                                        C9563 c9563 = (C9563) it.next();
                                                        List list6 = list2;
                                                        List list7 = list3;
                                                        long j13 = c9563.f26293;
                                                        int i8 = i6;
                                                        long j14 = j12;
                                                        long j15 = c9563.f26294;
                                                        int i9 = c9563.f26290;
                                                        List list8 = list;
                                                        HashSet hashSet5 = hashSet4;
                                                        long j16 = c9563.f26292;
                                                        if (j13 >= j8 && j13 < j7 && j15 >= 0 && j16 > 0 && i9 > 0) {
                                                            long j17 = j8;
                                                            if (f8150.contains(c9563.f26291) && hashSet3.add(Long.valueOf(j13))) {
                                                                long jM7422 = m7421(j13, j16);
                                                                long jM7423 = m7421(j15, j16);
                                                                if (jM7422 > j7 || jM7423 > j || (j11 >= 0 && j13 < j11)) {
                                                                    throw C13863.m31554();
                                                                }
                                                                String[] strArrSplit = c9563.f26289.split("\\n", -1);
                                                                if (strArrSplit.length != i9) {
                                                                    throw C13863.m31554();
                                                                }
                                                                int i10 = 0;
                                                                long j18 = -1;
                                                                while (i10 < strArrSplit.length) {
                                                                    String str7 = strArrSplit[i10];
                                                                    long j19 = j;
                                                                    int iIndexOf = str7.indexOf(": ");
                                                                    if (iIndexOf > 2 && str7.indexOf(13) < 0 && str7.indexOf(10) < 0 && str7.startsWith("0x")) {
                                                                        String[] strArr = strArrSplit;
                                                                        if (str7.substring(0, iIndexOf).equals(str7.substring(0, iIndexOf).toLowerCase()) && iIndexOf + 2 < str7.length()) {
                                                                            try {
                                                                                long j20 = Long.parseLong(str7.substring(2, iIndexOf), 16);
                                                                                if (j20 >= j13 && j20 < jM7422 && ((i10 != 0 || j20 == j13) && (j18 < 0 || j20 > j18))) {
                                                                                    HashSet hashSet6 = hashSet5;
                                                                                    if (hashSet6.add(Long.valueOf(j20))) {
                                                                                        i10++;
                                                                                        j18 = j20;
                                                                                        hashSet5 = hashSet6;
                                                                                        j = j19;
                                                                                        strArrSplit = strArr;
                                                                                    }
                                                                                }
                                                                                throw C13863.m31554();
                                                                            } catch (RuntimeException unused) {
                                                                                throw C13863.m31554();
                                                                            }
                                                                        }
                                                                    }
                                                                    throw C13863.m31554();
                                                                }
                                                                long j21 = j;
                                                                HashSet hashSet7 = hashSet5;
                                                                long jM7424 = m7421(j14, j16);
                                                                if (i7 < 0 || i9 < 0 || Integer.MAX_VALUE - i7 < i9) {
                                                                    throw C13863.m31554();
                                                                }
                                                                i7 += i9;
                                                                j12 = jM7424;
                                                                j11 = jM7422;
                                                                hashSet4 = hashSet7;
                                                                list2 = list6;
                                                                it = it2;
                                                                list3 = list7;
                                                                i6 = i8;
                                                                list = list8;
                                                                j8 = j17;
                                                                j = j21;
                                                            }
                                                        }
                                                        throw C13863.m31554();
                                                    }
                                                    long j22 = j8;
                                                    List list9 = list;
                                                    HashSet hashSet8 = hashSet4;
                                                    List list10 = list2;
                                                    List<C19250> list11 = list3;
                                                    if (j12 != i6 || i7 != i5) {
                                                        throw C13863.m31554();
                                                    }
                                                    HashSet hashSet9 = new HashSet();
                                                    Iterator it3 = list10.iterator();
                                                    String str8 = null;
                                                    while (true) {
                                                        boolean zHasNext = it3.hasNext();
                                                        Set set = f8145;
                                                        String str9 = WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR;
                                                        if (zHasNext) {
                                                            C3827 c3827 = (C3827) it3.next();
                                                            long j23 = c3827.f8199;
                                                            String str10 = c3827.f8200;
                                                            long j24 = c3827.f8201;
                                                            if (!hashSet3.contains(Long.valueOf(j23)) || !hashSet3.contains(Long.valueOf(j24)) || !set.contains(str10)) {
                                                                break;
                                                            }
                                                            String str11 = j23 + WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR + str10 + WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR + j24;
                                                            StringBuilder sb = new StringBuilder();
                                                            sb.append(m7423(j23));
                                                            if ("fallthrough".equals(str10)) {
                                                                c = '0';
                                                            } else if ("branch_true".equals(str10)) {
                                                                c = '1';
                                                            } else {
                                                                c = "branch_false".equals(str10) ? '2' : '3';
                                                            }
                                                            sb.append(c);
                                                            sb.append(m7423(j24));
                                                            String string = sb.toString();
                                                            if (!hashSet9.add(str11) || (str8 != null && str8.compareTo(string) > 0)) {
                                                                throw C13863.m31554();
                                                            }
                                                            str8 = string;
                                                        } else {
                                                            HashSet hashSet10 = new HashSet();
                                                            Iterator it4 = list9.iterator();
                                                            String str12 = null;
                                                            while (it4.hasNext()) {
                                                                C12545 c12545 = (C12545) it4.next();
                                                                long j25 = c12545.f35261;
                                                                String str13 = c12545.f35259;
                                                                long j26 = c12545.f35262;
                                                                String str14 = c12545.f35260;
                                                                if (hashSet8.contains(Long.valueOf(j25)) && set.contains(str13) && f8147.contains(str14) && j26 >= 0) {
                                                                    int size = list5.size();
                                                                    Iterator it5 = it4;
                                                                    int i11 = 0;
                                                                    while (i11 < size) {
                                                                        HashSet hashSet11 = hashSet3;
                                                                        int iM21912 = C9417.m21912(size, i11, 2, i11);
                                                                        int i12 = size;
                                                                        List list12 = list5;
                                                                        HashSet hashSet12 = hashSet8;
                                                                        Set set2 = set;
                                                                        String str15 = str9;
                                                                        if (((C9563) list12.get(iM21912)).f26293 <= j26) {
                                                                            i11 = iM21912 + 1;
                                                                        } else {
                                                                            i12 = iM21912;
                                                                        }
                                                                        set = set2;
                                                                        hashSet3 = hashSet11;
                                                                        str9 = str15;
                                                                        hashSet8 = hashSet12;
                                                                        list5 = list12;
                                                                        size = i12;
                                                                    }
                                                                    HashSet hashSet13 = hashSet3;
                                                                    String str16 = str9;
                                                                    HashSet hashSet14 = hashSet8;
                                                                    List list13 = list5;
                                                                    Set set3 = set;
                                                                    if (i11 != 0) {
                                                                        C9563 c9564 = (C9563) list13.get(i11 - 1);
                                                                        if (j26 < m7421(c9564.f26293, c9564.f26292)) {
                                                                        }
                                                                    }
                                                                    if ("outside_function_boundary".equals(str14) && j26 >= j22 && j26 < j7) {
                                                                        throw C13863.m31554();
                                                                    }
                                                                    String str17 = j25 + str16 + str13 + str16 + j26 + str16 + str14;
                                                                    String str18 = m7423(j25) + str14 + m7423(j26);
                                                                    if (!hashSet10.add(str17) || (str12 != null && str12.compareTo(str18) > 0)) {
                                                                        throw C13863.m31554();
                                                                    }
                                                                    str12 = str18;
                                                                    str9 = str16;
                                                                    it4 = it5;
                                                                    set = set3;
                                                                    hashSet8 = hashSet14;
                                                                    list5 = list13;
                                                                    hashSet3 = hashSet13;
                                                                }
                                                                throw C13863.m31554();
                                                            }
                                                            HashSet hashSet15 = hashSet3;
                                                            Set set4 = set;
                                                            String str19 = str9;
                                                            HashSet hashSet16 = hashSet8;
                                                            HashSet hashSet17 = new HashSet();
                                                            String str20 = null;
                                                            for (C19250 c19250 : list11) {
                                                                String str21 = c19250.f57527;
                                                                long j27 = c19250.f57530;
                                                                long j28 = c19250.f57531;
                                                                String str22 = c19250.f57529;
                                                                boolean z = c19250.f57528;
                                                                boolean zEquals3 = "decode".equals(str21);
                                                                boolean zEquals4 = "indirect_jump".equals(str21);
                                                                Set set5 = set4;
                                                                boolean zContains = set5.contains(str21);
                                                                if (!zEquals3) {
                                                                    if (zEquals4) {
                                                                        if (!z && "indirect_target".equals(str22)) {
                                                                            hashSet = hashSet16;
                                                                            if (hashSet.contains(Long.valueOf(j28))) {
                                                                                hashSet2 = hashSet15;
                                                                            }
                                                                        }
                                                                        throw C13863.m31554();
                                                                    }
                                                                    hashSet = hashSet16;
                                                                    if (zContains && z && j27 >= 0 && f8148.contains(str22) && hashSet.contains(Long.valueOf(j28))) {
                                                                        hashSet2 = hashSet15;
                                                                        if (hashSet2.contains(Long.valueOf(j27))) {
                                                                        }
                                                                    }
                                                                    throw C13863.m31554();
                                                                }
                                                                if (z || !"invalid_instruction".equals(str22) || j28 != j22) {
                                                                    throw C13863.m31554();
                                                                }
                                                                hashSet2 = hashSet15;
                                                                hashSet = hashSet16;
                                                                StringBuilder sb2 = new StringBuilder();
                                                                sb2.append(j28);
                                                                sb2.append(str19);
                                                                sb2.append(str21);
                                                                sb2.append(str19);
                                                                hashSet16 = hashSet;
                                                                sb2.append(z ? j27 : -1L);
                                                                sb2.append(str19);
                                                                sb2.append(str22);
                                                                String string2 = sb2.toString();
                                                                StringBuilder sb3 = new StringBuilder();
                                                                sb3.append(m7423(j28));
                                                                sb3.append(str22);
                                                                if (!z) {
                                                                    j27 = -1;
                                                                }
                                                                sb3.append(m7423(j27));
                                                                String string3 = sb3.toString();
                                                                if (!hashSet17.add(string2) || (str20 != null && str20.compareTo(string3) > 0)) {
                                                                    throw C13863.m31554();
                                                                }
                                                                str20 = string3;
                                                                hashSet15 = hashSet2;
                                                                set4 = set5;
                                                            }
                                                            String str23 = c15597.f44573;
                                                            String strM31553 = C13863.m31553(str23);
                                                            Iterator it6 = list11.iterator();
                                                            boolean zEquals5 = false;
                                                            boolean zIsEmpty = false;
                                                            boolean zEquals6 = false;
                                                            boolean zEquals7 = false;
                                                            boolean zEquals8 = false;
                                                            boolean zContains2 = false;
                                                            while (it6.hasNext()) {
                                                                String str24 = ((C19250) it6.next()).f57529;
                                                                zEquals5 |= "max_analysis_bytes_reached".equals(str24);
                                                                zIsEmpty |= "max_blocks_reached".equals(str24);
                                                                zEquals6 |= "max_instructions_reached".equals(str24);
                                                                zEquals7 |= "invalid_instruction".equals(str24);
                                                                zEquals8 |= "indirect_target".equals(str24);
                                                                zContains2 |= f8149.contains(str24);
                                                            }
                                                            boolean z2 = zEquals5 || zIsEmpty || zEquals6;
                                                            str23.getClass();
                                                            switch (str23) {
                                                                case "invalid_control_flow_target":
                                                                    if (!z2 && !zEquals7 && !zEquals8 && zContains2) {
                                                                        zIsEmpty = true;
                                                                        break;
                                                                    } else {
                                                                        zIsEmpty = false;
                                                                        break;
                                                                    }
                                                                    break;
                                                                case "max_blocks_reached":
                                                                    break;
                                                                case "complete":
                                                                    zIsEmpty = list11.isEmpty();
                                                                    break;
                                                                case "unresolved_indirect_flow":
                                                                    if (!z2 && !zEquals7 && zEquals8) {
                                                                        zIsEmpty = true;
                                                                        break;
                                                                    } else {
                                                                        zIsEmpty = false;
                                                                        break;
                                                                    }
                                                                    break;
                                                                case "invalid_instruction":
                                                                    if (z2 || !zEquals7) {
                                                                        zIsEmpty = false;
                                                                        break;
                                                                    } else {
                                                                        zIsEmpty = true;
                                                                        break;
                                                                    }
                                                                    break;
                                                                case "max_instructions_reached":
                                                                    if (zEquals6 && !zIsEmpty && !zEquals5) {
                                                                        zIsEmpty = true;
                                                                        break;
                                                                    } else {
                                                                        zIsEmpty = false;
                                                                        break;
                                                                    }
                                                                    break;
                                                                case "max_analysis_bytes_reached":
                                                                    if (zEquals5 && !zIsEmpty && !zEquals6) {
                                                                        zIsEmpty = true;
                                                                        break;
                                                                    } else {
                                                                        zIsEmpty = false;
                                                                        break;
                                                                    }
                                                                    break;
                                                                default:
                                                                    zIsEmpty = false;
                                                                    break;
                                                            }
                                                            boolean zEquals9 = "complete".equals(str23);
                                                            if (strM31553 != null && zIsEmpty && c15597.f44575 == zEquals9) {
                                                                return C13863.m31547(c20739, strM46512, j6, c6211, strM30505, c13362M30503.f37507, c13362M30503.m30506(strM46512), c13362M30503.m30507(strM46512), c18579M40097);
                                                            }
                                                            throw C13863.m31554();
                                                        }
                                                    }
                                                    throw C13863.m31554();
                                                }
                                            }
                                            throw C13863.m31554();
                                        }
                                    }
                                }
                                throw C13863.m31554();
                            }
                            throw C13863.m31554();
                        }
                    }
                }
            }
            throw C13863.m31554();
        } catch (RuntimeException unused2) {
            throw C5276.m11410("NATIVE_ANALYZER_FAILED", "Native ELF function CFG analysis failed.");
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m7423(long j) {
        return String.format("%016x", Long.valueOf(j));
    }

    /* JADX INFO: renamed from: ֫ */
    public static long m7421(long j, long j2) throws C5276 {
        if (j < 0 || j2 < 0 || C14849.FOREVER_NS - j < j2) {
            throw C13863.m31554();
        }
        return j + j2;
    }
}
