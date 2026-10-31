package l;

import bin.mt.json.JSONObject;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* JADX INFO: renamed from: l.֫֫ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: N75Z */
/* JADX INFO: loaded from: classes2.dex */
public final class C1511 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final Set f5363;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final Set f5364;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final Set f5365;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final Set f5366;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final Set f5367;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final Set f5368;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final Set f5369;

    static {
        Object[] objArr = {"function_symbol", "executable_symbol", "requested_address"};
        HashSet hashSet = new HashSet(3);
        for (int i = 0; i < 3; i++) {
            Object obj = objArr[i];
            C11003.requireNonNull(obj);
            if (!hashSet.add(obj)) {
                throw new IllegalArgumentException(C5368.m15337(obj, "duplicate element: "));
            }
        }
        f5365 = C20195.unmodifiableSet(hashSet);
        Object[] objArr2 = {"function_symbol", "executable_symbol", "executable_mapping"};
        HashSet hashSet2 = new HashSet(3);
        for (int i2 = 0; i2 < 3; i2++) {
            Object obj2 = objArr2[i2];
            C11003.requireNonNull(obj2);
            if (!hashSet2.add(obj2)) {
                throw new IllegalArgumentException(C5368.m15337(obj2, "duplicate element: "));
            }
        }
        f5363 = C20195.unmodifiableSet(hashSet2);
        Object[] objArr3 = {"fallthrough", "conditional_jump", "jump", "indirect_jump", "return", "trap", "invalid", "budget_boundary"};
        HashSet hashSet3 = new HashSet(8);
        for (int i3 = 0; i3 < 8; i3++) {
            Object obj3 = objArr3[i3];
            C11003.requireNonNull(obj3);
            if (!hashSet3.add(obj3)) {
                throw new IllegalArgumentException(C5368.m15337(obj3, "duplicate element: "));
            }
        }
        f5369 = C20195.unmodifiableSet(hashSet3);
        Object[] objArr4 = {"fallthrough", "branch_true", "branch_false", "jump"};
        HashSet hashSet4 = new HashSet(4);
        for (int i4 = 0; i4 < 4; i4++) {
            Object obj4 = objArr4[i4];
            C11003.requireNonNull(obj4);
            if (!hashSet4.add(obj4)) {
                throw new IllegalArgumentException(C5368.m15337(obj4, "duplicate element: "));
            }
        }
        f5364 = C20195.unmodifiableSet(hashSet4);
        Object[] objArr5 = {"outside_function_boundary", "other_function_symbol"};
        HashSet hashSet5 = new HashSet(2);
        for (int i5 = 0; i5 < 2; i5++) {
            Object obj5 = objArr5[i5];
            C11003.requireNonNull(obj5);
            if (!hashSet5.add(obj5)) {
                throw new IllegalArgumentException(C5368.m15337(obj5, "duplicate element: "));
            }
        }
        f5366 = C20195.unmodifiableSet(hashSet5);
        Object[] objArr6 = {"target_not_executable", "unaligned_or_overlapping_target", "instruction_mode_transition", "max_blocks_reached", "max_analysis_bytes_reached", "max_instructions_reached", "invalid_instruction"};
        HashSet hashSet6 = new HashSet(7);
        for (int i6 = 0; i6 < 7; i6++) {
            Object obj6 = objArr6[i6];
            C11003.requireNonNull(obj6);
            if (!hashSet6.add(obj6)) {
                throw new IllegalArgumentException(C5368.m15337(obj6, "duplicate element: "));
            }
        }
        f5367 = C20195.unmodifiableSet(hashSet6);
        Object[] objArr7 = {"target_not_executable", "unaligned_or_overlapping_target", "instruction_mode_transition"};
        HashSet hashSet7 = new HashSet(3);
        for (int i7 = 0; i7 < 3; i7++) {
            Object obj7 = objArr7[i7];
            C11003.requireNonNull(obj7);
            if (!hashSet7.add(obj7)) {
                throw new IllegalArgumentException(C5368.m15337(obj7, "duplicate element: "));
            }
        }
        f5368 = C20195.unmodifiableSet(hashSet7);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:352:0x0672  */
    /* JADX WARN: Code duplicated, block: B:375:0x069e  */
    /* JADX WARN: Code duplicated, block: B:376:0x06a0  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONObject m5196(C22241 c22241, C7333 c7333, C19329 c19329) throws C3059 {
        HashSet hashSet;
        HashSet hashSet2;
        char c;
        String str = c7333.f22530;
        long j = c7333.f22534;
        C11567 c11567M28457 = C11567.m28457(str);
        String strM44218 = C19151.m44218(c11567M28457, c19329);
        long j2 = c19329.f60768;
        boolean zEquals = "virtual".equals(c19329.f60775);
        if (zEquals && "thumb".equals(strM44218)) {
            j2 &= -2;
        }
        String strM28459 = c11567M28457.m28459();
        int iM28458 = c11567M28457.m28458(strM44218);
        try {
            String str2 = c7333.f22530;
            int i = c19329.f60769;
            int i2 = c19329.f60778;
            int i3 = c19329.f60771;
            c22241.getClass();
            C17057 c17057M37910 = C16036.m37910(str2, j2, zEquals, strM28459, iM28458, i, i2, i3);
            C16351 c16351 = c17057M37910.f52266;
            C4043 c4043 = c17057M37910.f52259;
            if (c4043 == null || !strM28459.equals(c17057M37910.f52260) || iM28458 != c17057M37910.f52262) {
                throw C12095.m29491();
            }
            C12095.m29507(c4043);
            if (!c4043.f12820) {
                throw C3059.m9363("NATIVE_ADDRESS_NOT_MAPPED", "Native address is not mapped in the ELF file.");
            }
            if (!c4043.f12821 || !c4043.f12824) {
                throw C3059.m9363("NATIVE_ADDRESS_NOT_EXECUTABLE", "Native address is not in loaded executable file-backed bytes.");
            }
            if (j >= 0) {
                long j3 = c4043.f12818;
                if (j3 > 0) {
                    long j4 = c4043.f12827;
                    if (j4 < j3) {
                        long j5 = c4043.f12817;
                        if (j5 >= j4) {
                            if (m5195(j5 - j4, j3) <= j) {
                                if (c4043.f12825 != zEquals || c4043.f12823 != j2) {
                                    throw C12095.m29491();
                                }
                                long j6 = c4043.f12822;
                                if (j6 < 0 || (zEquals && j6 != j2)) {
                                    throw C12095.m29491();
                                }
                                if (c16351 != null) {
                                    long j7 = c16351.f50321;
                                    long j8 = c16351.f50328;
                                    String str3 = c16351.f50327;
                                    String str4 = c16351.f50325;
                                    long j9 = c16351.f50322;
                                    String str5 = c16351.f50323;
                                    String str6 = c16351.f50324;
                                    if (j8 >= 0) {
                                        long j10 = c16351.f50326;
                                        if (j10 >= 0 && j10 < j && j7 > 0 && j8 < j7 && j6 >= j8 && j6 < j7 && f5365.contains(str6) && f5363.contains(str5) && j9 >= 0 && str4.length() <= 4096) {
                                            boolean zEquals2 = "requested_address".equals(str6);
                                            if ((!zEquals2) != (j9 > 0) || ((!zEquals2 && str3.isEmpty()) || (zEquals2 && (!str3.isEmpty() || !str4.isEmpty() || j9 != 0 || !"executable_mapping".equals(str5))))) {
                                                throw C12095.m29491();
                                            }
                                            long jM5195 = m5195(j8, j9);
                                            if (!zEquals2 && jM5195 != j7) {
                                                throw C12095.m29491();
                                            }
                                            if ("function_symbol".equals(str6) != "function_symbol".equals(str5) || "executable_symbol".equals(str6) != "executable_symbol".equals(str5)) {
                                                throw C12095.m29491();
                                            }
                                            C13919 c13919 = c17057M37910.f52258;
                                            List list = c17057M37910.f52261;
                                            List list2 = c17057M37910.f52263;
                                            List list3 = c17057M37910.f52265;
                                            List list4 = c17057M37910.f52264;
                                            if (c13919 != null) {
                                                int i4 = c13919.f41488;
                                                int i5 = c13919.f41495;
                                                int i6 = c13919.f41490;
                                                if (i6 >= 0 && i6 <= c19329.f60769 && i5 >= 0 && i5 <= c19329.f60771 && i4 == list4.size() && c13919.f41493 == list2.size() && c13919.f41491 == list.size() && c13919.f41489 == list3.size() && i4 <= c19329.f60778) {
                                                    HashSet hashSet3 = new HashSet();
                                                    HashSet hashSet4 = new HashSet();
                                                    Iterator it = list4.iterator();
                                                    List list5 = list4;
                                                    long j11 = -1;
                                                    int i7 = 0;
                                                    long j12 = 0;
                                                    while (it.hasNext()) {
                                                        Iterator it2 = it;
                                                        C7570 c7570 = (C7570) it.next();
                                                        List list6 = list2;
                                                        List list7 = list3;
                                                        long j13 = c7570.f23381;
                                                        int i8 = i6;
                                                        long j14 = j12;
                                                        long j15 = c7570.f23382;
                                                        int i9 = c7570.f23378;
                                                        List list8 = list;
                                                        HashSet hashSet5 = hashSet4;
                                                        long j16 = c7570.f23380;
                                                        if (j13 >= j8 && j13 < j7 && j15 >= 0 && j16 > 0 && i9 > 0) {
                                                            long j17 = j8;
                                                            if (f5369.contains(c7570.f23379) && hashSet3.add(Long.valueOf(j13))) {
                                                                long jM5196 = m5195(j13, j16);
                                                                long jM5197 = m5195(j15, j16);
                                                                if (jM5196 > j7 || jM5197 > j || (j11 >= 0 && j13 < j11)) {
                                                                    throw C12095.m29491();
                                                                }
                                                                String[] strArrSplit = c7570.f23377.split("\\n", -1);
                                                                if (strArrSplit.length != i9) {
                                                                    throw C12095.m29491();
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
                                                                                if (j20 >= j13 && j20 < jM5196 && ((i10 != 0 || j20 == j13) && (j18 < 0 || j20 > j18))) {
                                                                                    HashSet hashSet6 = hashSet5;
                                                                                    if (hashSet6.add(Long.valueOf(j20))) {
                                                                                        i10++;
                                                                                        j18 = j20;
                                                                                        hashSet5 = hashSet6;
                                                                                        j = j19;
                                                                                        strArrSplit = strArr;
                                                                                    }
                                                                                }
                                                                                throw C12095.m29491();
                                                                            } catch (RuntimeException unused) {
                                                                                throw C12095.m29491();
                                                                            }
                                                                        }
                                                                    }
                                                                    throw C12095.m29491();
                                                                }
                                                                long j21 = j;
                                                                HashSet hashSet7 = hashSet5;
                                                                long jM5198 = m5195(j14, j16);
                                                                if (i7 < 0 || i9 < 0 || Integer.MAX_VALUE - i7 < i9) {
                                                                    throw C12095.m29491();
                                                                }
                                                                i7 += i9;
                                                                j12 = jM5198;
                                                                j11 = jM5196;
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
                                                        throw C12095.m29491();
                                                    }
                                                    long j22 = j8;
                                                    List list9 = list;
                                                    HashSet hashSet8 = hashSet4;
                                                    List list10 = list2;
                                                    List<C17763> list11 = list3;
                                                    if (j12 != i6 || i7 != i5) {
                                                        throw C12095.m29491();
                                                    }
                                                    HashSet hashSet9 = new HashSet();
                                                    Iterator it3 = list10.iterator();
                                                    String str8 = null;
                                                    while (true) {
                                                        boolean zHasNext = it3.hasNext();
                                                        Set set = f5364;
                                                        String str9 = WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR;
                                                        if (zHasNext) {
                                                            C1535 c1535 = (C1535) it3.next();
                                                            long j23 = c1535.f5417;
                                                            String str10 = c1535.f5418;
                                                            long j24 = c1535.f5419;
                                                            if (!hashSet3.contains(Long.valueOf(j23)) || !hashSet3.contains(Long.valueOf(j24)) || !set.contains(str10)) {
                                                                break;
                                                            }
                                                            String str11 = j23 + WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR + str10 + WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR + j24;
                                                            StringBuilder sb = new StringBuilder();
                                                            sb.append(m5197(j23));
                                                            if ("fallthrough".equals(str10)) {
                                                                c = '0';
                                                            } else if ("branch_true".equals(str10)) {
                                                                c = '1';
                                                            } else {
                                                                c = "branch_false".equals(str10) ? '2' : '3';
                                                            }
                                                            sb.append(c);
                                                            sb.append(m5197(j24));
                                                            String string = sb.toString();
                                                            if (!hashSet9.add(str11) || (str8 != null && str8.compareTo(string) > 0)) {
                                                                throw C12095.m29491();
                                                            }
                                                            str8 = string;
                                                        } else {
                                                            HashSet hashSet10 = new HashSet();
                                                            Iterator it4 = list9.iterator();
                                                            String str12 = null;
                                                            while (it4.hasNext()) {
                                                                C10708 c10708 = (C10708) it4.next();
                                                                long j25 = c10708.f32286;
                                                                String str13 = c10708.f32284;
                                                                long j26 = c10708.f32287;
                                                                String str14 = c10708.f32285;
                                                                if (hashSet8.contains(Long.valueOf(j25)) && set.contains(str13) && f5366.contains(str14) && j26 >= 0) {
                                                                    int size = list5.size();
                                                                    Iterator it5 = it4;
                                                                    int i11 = 0;
                                                                    while (i11 < size) {
                                                                        HashSet hashSet11 = hashSet3;
                                                                        int iM19938 = C7416.m19938(size, i11, 2, i11);
                                                                        int i12 = size;
                                                                        List list12 = list5;
                                                                        HashSet hashSet12 = hashSet8;
                                                                        Set set2 = set;
                                                                        String str15 = str9;
                                                                        if (((C7570) list12.get(iM19938)).f23381 <= j26) {
                                                                            i11 = iM19938 + 1;
                                                                        } else {
                                                                            i12 = iM19938;
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
                                                                        C7570 c7571 = (C7570) list13.get(i11 - 1);
                                                                        if (j26 < m5195(c7571.f23381, c7571.f23380)) {
                                                                        }
                                                                    }
                                                                    if ("outside_function_boundary".equals(str14) && j26 >= j22 && j26 < j7) {
                                                                        throw C12095.m29491();
                                                                    }
                                                                    String str17 = j25 + str16 + str13 + str16 + j26 + str16 + str14;
                                                                    String str18 = m5197(j25) + str14 + m5197(j26);
                                                                    if (!hashSet10.add(str17) || (str12 != null && str12.compareTo(str18) > 0)) {
                                                                        throw C12095.m29491();
                                                                    }
                                                                    str12 = str18;
                                                                    str9 = str16;
                                                                    it4 = it5;
                                                                    set = set3;
                                                                    hashSet8 = hashSet14;
                                                                    list5 = list13;
                                                                    hashSet3 = hashSet13;
                                                                }
                                                                throw C12095.m29491();
                                                            }
                                                            HashSet hashSet15 = hashSet3;
                                                            Set set4 = set;
                                                            String str19 = str9;
                                                            HashSet hashSet16 = hashSet8;
                                                            HashSet hashSet17 = new HashSet();
                                                            String str20 = null;
                                                            for (C17763 c17763 : list11) {
                                                                String str21 = c17763.f54333;
                                                                long j27 = c17763.f54336;
                                                                long j28 = c17763.f54337;
                                                                String str22 = c17763.f54335;
                                                                boolean z = c17763.f54334;
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
                                                                        throw C12095.m29491();
                                                                    }
                                                                    hashSet = hashSet16;
                                                                    if (zContains && z && j27 >= 0 && f5367.contains(str22) && hashSet.contains(Long.valueOf(j28))) {
                                                                        hashSet2 = hashSet15;
                                                                        if (hashSet2.contains(Long.valueOf(j27))) {
                                                                        }
                                                                    }
                                                                    throw C12095.m29491();
                                                                }
                                                                if (z || !"invalid_instruction".equals(str22) || j28 != j22) {
                                                                    throw C12095.m29491();
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
                                                                sb3.append(m5197(j28));
                                                                sb3.append(str22);
                                                                if (!z) {
                                                                    j27 = -1;
                                                                }
                                                                sb3.append(m5197(j27));
                                                                String string3 = sb3.toString();
                                                                if (!hashSet17.add(string2) || (str20 != null && str20.compareTo(string3) > 0)) {
                                                                    throw C12095.m29491();
                                                                }
                                                                str20 = string3;
                                                                hashSet15 = hashSet2;
                                                                set4 = set5;
                                                            }
                                                            String str23 = c13919.f41492;
                                                            String strM29490 = C12095.m29490(str23);
                                                            Iterator it6 = list11.iterator();
                                                            boolean zEquals5 = false;
                                                            boolean zIsEmpty = false;
                                                            boolean zEquals6 = false;
                                                            boolean zEquals7 = false;
                                                            boolean zEquals8 = false;
                                                            boolean zContains2 = false;
                                                            while (it6.hasNext()) {
                                                                String str24 = ((C17763) it6.next()).f54335;
                                                                zEquals5 |= "max_analysis_bytes_reached".equals(str24);
                                                                zIsEmpty |= "max_blocks_reached".equals(str24);
                                                                zEquals6 |= "max_instructions_reached".equals(str24);
                                                                zEquals7 |= "invalid_instruction".equals(str24);
                                                                zEquals8 |= "indirect_target".equals(str24);
                                                                zContains2 |= f5368.contains(str24);
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
                                                            if (strM29490 != null && zIsEmpty && c13919.f41494 == zEquals9) {
                                                                return C12095.m29484(c19329, strM44218, j6, c4043, strM28459, c11567M28457.f34508, c11567M28457.m28460(strM44218), c11567M28457.m28461(strM44218), c17057M37910);
                                                            }
                                                            throw C12095.m29491();
                                                        }
                                                    }
                                                    throw C12095.m29491();
                                                }
                                            }
                                            throw C12095.m29491();
                                        }
                                    }
                                }
                                throw C12095.m29491();
                            }
                            throw C12095.m29491();
                        }
                    }
                }
            }
            throw C12095.m29491();
        } catch (RuntimeException unused2) {
            throw C3059.m9368("NATIVE_ANALYZER_FAILED", "Native ELF function CFG analysis failed.");
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m5197(long j) {
        return String.format("%016x", Long.valueOf(j));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m5195(long j, long j2) throws C3059 {
        if (j < 0 || j2 < 0 || C13132.FOREVER_NS - j < j2) {
            throw C12095.m29491();
        }
        return j + j2;
    }
}
