package p067l;

import bin.p000mt.json.JSON;
import bin.p000mt.json.JSONArray;
import com.google.android.material.color.ColorResourcesTableCreator;
import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.simpleframework.xml.core.AnnotationHandler;
import org.simpleframework.xml.strategy.Name;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.۟ۧۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 26KG */
/* JADX INFO: loaded from: classes3.dex */
public final class C9424 {

    /* JADX INFO: renamed from: ۧ */
    public static final HashSet f25727 = new HashSet(Arrays.asList("array", "bool", ColorResourcesTableCreator.RESOURCE_TYPE_NAME_COLOR, "dimen", ClassTransform.FLOAT, "fraction", "id", "integer", "plurals", "string", "style"));

    /* JADX INFO: renamed from: ֫ */
    public static final HashSet f25726 = new HashSet(Arrays.asList(MotionUtils.EASING_TYPE_PATH, Name.REFER, "dynamic-reference", AnnotationHandler.ATTRIBUTE, "dynamic-attribute", "complex"));

    /* JADX WARN: Code duplicated, block: B:103:0x0223 A[Catch: ۗۛ᩻ -> 0x02f3, TRY_LEAVE, TryCatch #7 {ۗۛ᩻ -> 0x02f3, blocks: (B:89:0x01e3, B:91:0x01ed, B:93:0x0201, B:101:0x0219, B:103:0x0223, B:111:0x025b, B:125:0x0294), top: B:203:0x01e3 }] */
    /* JADX WARN: Code duplicated, block: B:107:0x024b A[Catch: ۗۛ᩻ -> 0x0210, TryCatch #9 {ۗۛ᩻ -> 0x0210, blocks: (B:95:0x020b, B:105:0x0245, B:107:0x024b, B:108:0x0251, B:109:0x0252, B:110:0x025a, B:113:0x0266, B:115:0x026a, B:116:0x0272, B:118:0x0278), top: B:207:0x020b }] */
    /* JADX WARN: Code duplicated, block: B:109:0x0252 A[Catch: ۗۛ᩻ -> 0x0210, TryCatch #9 {ۗۛ᩻ -> 0x0210, blocks: (B:95:0x020b, B:105:0x0245, B:107:0x024b, B:108:0x0251, B:109:0x0252, B:110:0x025a, B:113:0x0266, B:115:0x026a, B:116:0x0272, B:118:0x0278), top: B:207:0x020b }] */
    /* JADX WARN: Code duplicated, block: B:111:0x025b A[Catch: ۗۛ᩻ -> 0x02f3, TRY_ENTER, TRY_LEAVE, TryCatch #7 {ۗۛ᩻ -> 0x02f3, blocks: (B:89:0x01e3, B:91:0x01ed, B:93:0x0201, B:101:0x0219, B:103:0x0223, B:111:0x025b, B:125:0x0294), top: B:203:0x01e3 }] */
    /* JADX WARN: Code duplicated, block: B:113:0x0266 A[Catch: ۗۛ᩻ -> 0x0210, TRY_ENTER, TryCatch #9 {ۗۛ᩻ -> 0x0210, blocks: (B:95:0x020b, B:105:0x0245, B:107:0x024b, B:108:0x0251, B:109:0x0252, B:110:0x025a, B:113:0x0266, B:115:0x026a, B:116:0x0272, B:118:0x0278), top: B:207:0x020b }] */
    /* JADX WARN: Code duplicated, block: B:115:0x026a A[Catch: ۗۛ᩻ -> 0x0210, TryCatch #9 {ۗۛ᩻ -> 0x0210, blocks: (B:95:0x020b, B:105:0x0245, B:107:0x024b, B:108:0x0251, B:109:0x0252, B:110:0x025a, B:113:0x0266, B:115:0x026a, B:116:0x0272, B:118:0x0278), top: B:207:0x020b }] */
    /* JADX WARN: Code duplicated, block: B:118:0x0278 A[Catch: ۗۛ᩻ -> 0x0210, TRY_LEAVE, TryCatch #9 {ۗۛ᩻ -> 0x0210, blocks: (B:95:0x020b, B:105:0x0245, B:107:0x024b, B:108:0x0251, B:109:0x0252, B:110:0x025a, B:113:0x0266, B:115:0x026a, B:116:0x0272, B:118:0x0278), top: B:207:0x020b }] */
    /* JADX WARN: Code duplicated, block: B:121:0x0285 A[EDGE_INSN: B:121:0x0285->B:122:0x0286 BREAK  A[LOOP:3: B:116:0x0272->B:237:?]] */
    /* JADX WARN: Code duplicated, block: B:123:0x0289  */
    /* JADX WARN: Code duplicated, block: B:168:0x0384  */
    /* JADX WARN: Code duplicated, block: B:171:0x0395  */
    /* JADX WARN: Code duplicated, block: B:174:0x0399  */
    /* JADX WARN: Code duplicated, block: B:207:0x020b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:224:0x030d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:225:0x0302 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:226:0x02f7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:227:0x0245 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:235:0x0285 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x01db A[Catch: ۗۛ᩻ -> 0x0330, TRY_LEAVE, TryCatch #10 {ۗۛ᩻ -> 0x0330, blocks: (B:85:0x01d5, B:87:0x01db), top: B:208:0x01d5 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x01ed A[Catch: ۗۛ᩻ -> 0x02f3, TryCatch #7 {ۗۛ᩻ -> 0x02f3, blocks: (B:89:0x01e3, B:91:0x01ed, B:93:0x0201, B:101:0x0219, B:103:0x0223, B:111:0x025b, B:125:0x0294), top: B:203:0x01e3 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x0201 A[Catch: ۗۛ᩻ -> 0x02f3, TRY_LEAVE, TryCatch #7 {ۗۛ᩻ -> 0x02f3, blocks: (B:89:0x01e3, B:91:0x01ed, B:93:0x0201, B:101:0x0219, B:103:0x0223, B:111:0x025b, B:125:0x0294), top: B:203:0x01e3 }] */
    /* JADX WARN: Code duplicated, block: B:99:0x0213  */
    /* JADX WARN: Instruction removed from duplicated block: B:103:0x0223, please report this as an issue */
    /* JADX INFO: renamed from: ֫ */
    public static C24176 m21927(C10962 c10962, C17154 c17154) throws C5276 {
        String str;
        int i;
        boolean z;
        int i2;
        String str2;
        ArrayList arrayList;
        C15458 c15458M18752;
        int i3;
        int i4;
        int i5;
        String str3;
        int i6;
        HashSet hashSet;
        String str4;
        String strM25239;
        String str5;
        ArrayList arrayList2;
        int i7;
        C10450 c10450;
        ArrayList arrayList3;
        String str6;
        C20635 c20635M35575;
        String strM10471;
        String strM10472;
        ArrayList arrayList4;
        C22999 c22999M21926;
        String str7;
        InterfaceC22528 interfaceC22528;
        InterfaceC3080 interfaceC3080;
        InterfaceC22528 interfaceC22528Mo4717;
        Iterator it;
        ArrayList arrayList5 = c17154.f51087;
        String str8 = "variant";
        String str9 = "resource";
        InterfaceC11799 interfaceC11799M52618 = c10962.m25282().m52618();
        HashMap map = new HashMap();
        ArrayList<C13448> arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        int i8 = 0;
        while (i8 < arrayList5.size()) {
            C3744 c3744 = (C3744) arrayList5.get(i8);
            String strM252310 = c3744.f7933;
            String str10 = c3744.f7931;
            ArrayList arrayList9 = c3744.f7934;
            try {
                String str11 = "INVALID_ARGUMENT";
                try {
                    if (arrayList9.isEmpty()) {
                        throw m21931("INVALID_ARGUMENT", "Each add requires at least one value.");
                    }
                    int i9 = str9.equals(str10) ? c3744.f7932 : (int) (Long.parseLong(strM252310.substring(2), 16) >>> 24);
                    C8083 c8083 = (C8083) map.get(Integer.valueOf(i9));
                    if (c8083 == null) {
                        c8083 = new C8083(m21925(i9, interfaceC11799M52618));
                        map.put(Integer.valueOf(i9), c8083);
                    }
                    C8083 c8084 = c8083;
                    int i10 = c8084.f21311;
                    ArrayList arrayList10 = arrayList5;
                    String str12 = "RESOURCE_BATCH_CONFLICT";
                    String str13 = str9;
                    if (str9.equals(str10)) {
                        try {
                            C20635 c20635M35576 = C15654.m35575(((C10450) arrayList9.get(0)).f28915);
                            String strM21923 = m21923(c20635M35576, (String) null);
                            String strM21922 = m21922(c20635M35576);
                            int i11 = 0;
                            while (i11 < strM21922.length()) {
                                char cCharAt = strM21922.charAt(i11);
                                ArrayList arrayList11 = arrayList7;
                                if (cCharAt != '_' && ((cCharAt < 'a' || cCharAt > 'z') && ((cCharAt < 'A' || cCharAt > 'Z') && (i11 <= 0 || ((cCharAt < '0' || cCharAt > '9') && cCharAt != '.'))))) {
                                    throw m21931("INVALID_VALUE_XML", "New resource names must start with a letter or underscore and contain only letters, digits, underscores, or dots.");
                                }
                                i11++;
                                arrayList7 = arrayList11;
                            }
                            arrayList = arrayList7;
                            c15458M18752 = c8084.m18753(strM21923);
                            HashMap map2 = c15458M18752.f44158;
                            HashSet hashSet2 = c15458M18752.f44155;
                            Integer num = (Integer) map2.get(strM21922);
                            if (num != null) {
                                if (hashSet2.contains(num)) {
                                    throw m21931("RESOURCE_BATCH_CONFLICT", "Multiple adds create the same resource type/name. Combine its variants into one resource add.");
                                }
                                try {
                                    strM252310 = C10962.m25239((i10 << 24) | (c15458M18752.f44154 << 16) | num.intValue());
                                    throw m21931("RESOURCE_ALREADY_EXISTS", "Resource type/name already exists; read or edit the existing resource.");
                                } catch (C5276 e) {
                                    e = e;
                                    i4 = 0;
                                    z = true;
                                    i2 = i4;
                                    if (i2 >= 0) {
                                        str2 = null;
                                    } else {
                                        str2 = null;
                                    }
                                    if (!z) {
                                        strM252310 = null;
                                    }
                                    m21929(e, i8, i2, strM252310, str2);
                                    throw e;
                                }
                            }
                            i3 = c15458M18752.f44157;
                            if (i3 > 65535) {
                                throw m21931("RESOURCE_ID_EXHAUSTED", "No unused entry ID remains in this resource type.");
                            }
                            c15458M18752.f44157 = i3 + 1;
                            hashSet2.add(Integer.valueOf(i3));
                            c15458M18752.f44158.put(strM21922, Integer.valueOf(i3));
                            c15458M18752.f44152.put(Integer.valueOf(i3), strM21922);
                            i5 = 0;
                            str = strM252310;
                            str3 = strM21922;
                            z = false;
                            try {
                                hashSet = c15458M18752.f44160;
                                str4 = c15458M18752.f44156;
                                i6 = i5;
                                try {
                                    int i12 = (c15458M18752.f44154 << 16) | (i10 << 24) | i3;
                                    strM25239 = C10962.m25239(i12);
                                    try {
                                        arrayList2 = new ArrayList();
                                        i7 = i12;
                                        arrayList8.add(new C11989(i8, strM25239, arrayList2));
                                        i2 = 0;
                                        str = strM25239;
                                        while (i2 < arrayList9.size()) {
                                            try {
                                                c10450 = (C10450) arrayList9.get(i2);
                                                arrayList9 = arrayList9;
                                                try {
                                                    arrayList3 = arrayList8;
                                                    if (arrayList6.size() < 200) {
                                                        throw m21931(str11, "A request supports at most 200 resource values.");
                                                    }
                                                    String str14 = c10450.f28915;
                                                    str6 = c10450.f28916;
                                                    c20635M35575 = C15654.m35575(str14);
                                                    if (str3.equals(m21922(c20635M35575))) {
                                                        throw m21931("INVALID_VALUE_XML", "All values must keep the target resource name.");
                                                    }
                                                    strM10471 = C4927.m10471(str4);
                                                    if (str8.equals(str10)) {
                                                        try {
                                                            strM10472 = C4927.m10471(str4);
                                                        } catch (C5276 e2) {
                                                            e = e2;
                                                            strM252310 = str;
                                                            if (i2 >= 0) {
                                                                str2 = null;
                                                            } else {
                                                                str2 = null;
                                                            }
                                                            if (!z) {
                                                                strM252310 = null;
                                                            }
                                                            m21929(e, i8, i2, strM252310, str2);
                                                            throw e;
                                                        }
                                                    } else {
                                                        strM10472 = null;
                                                    }
                                                    arrayList4 = arrayList6;
                                                    if (strM10471.equals(m21923(c20635M35575, strM10472))) {
                                                        throw m21931("INVALID_VALUE_XML", "valueXml type does not match the target resource type.");
                                                    }
                                                    c22999M21926 = m21926(str6, c8084.f21313);
                                                    str7 = i3 + "\n" + str6;
                                                    if (!c15458M18752.f44159.add(str7)) {
                                                        if (hashSet.contains(str7)) {
                                                            throw m21931(str12, "Multiple values in this request add the same resource variant. Remove duplicate values.");
                                                        }
                                                        throw m21931("RESOURCE_VARIANT_ALREADY_EXISTS", "Resource variant already exists; use mt_apk_resource_edit to change it.");
                                                    }
                                                    hashSet.add(str7);
                                                    InterfaceC6434 interfaceC6434 = c8084.f21313;
                                                    if (str8.equals(str10)) {
                                                        interfaceC3080 = c15458M18752.f44153;
                                                        if (interfaceC3080 != null) {
                                                            interfaceC22528Mo4717 = null;
                                                            break;
                                                        }
                                                        it = interfaceC3080.mo5205().iterator();
                                                        do {
                                                            if (it.hasNext()) {
                                                                interfaceC22528Mo4717 = null;
                                                                break;
                                                            }
                                                            interfaceC22528Mo4717 = ((InterfaceC9116) it.next()).mo4717(i3);
                                                        } while (interfaceC22528Mo4717 == null);
                                                        interfaceC22528 = interfaceC22528Mo4717;
                                                    } else {
                                                        interfaceC22528 = null;
                                                    }
                                                    int i13 = i7;
                                                    C6268 c6268M14224 = C6268.m14224(i13, str6, str4, str3, m21930(interfaceC6434, c15458M18752, i3, str3, c22999M21926, interfaceC22528));
                                                    ArrayList arrayList12 = arrayList;
                                                    arrayList12.add(c6268M14224);
                                                    str5 = str;
                                                    String str15 = str4;
                                                    HashSet hashSet3 = hashSet;
                                                    C8083 c8085 = c8084;
                                                    String str16 = str12;
                                                    String str17 = str3;
                                                    String str18 = str11;
                                                    String str19 = str8;
                                                    String str20 = str10;
                                                    try {
                                                        arrayList4.add(new C13448(i8, i2, i13, c15458M18752.f44156, str17, c10450, arrayList2, z));
                                                        i2++;
                                                        str11 = str18;
                                                        arrayList6 = arrayList4;
                                                        str = str5;
                                                        str10 = str20;
                                                        str4 = str15;
                                                        hashSet = hashSet3;
                                                        c8084 = c8085;
                                                        str12 = str16;
                                                        str3 = str17;
                                                        arrayList9 = arrayList9;
                                                        arrayList = arrayList12;
                                                        str8 = str19;
                                                        i7 = i13;
                                                        arrayList8 = arrayList3;
                                                    } catch (C5276 e3) {
                                                        e = e3;
                                                    }
                                                } catch (C5276 e4) {
                                                    e = e4;
                                                    str5 = str;
                                                }
                                            } catch (C5276 e5) {
                                                e = e5;
                                                arrayList9 = arrayList9;
                                            }
                                            strM252310 = str5;
                                        }
                                        i8++;
                                        arrayList5 = arrayList10;
                                        arrayList7 = arrayList;
                                        str9 = str13;
                                        interfaceC11799M52618 = interfaceC11799M52618;
                                        map = map;
                                        str8 = str8;
                                    } catch (C5276 e6) {
                                        e = e6;
                                        str5 = strM25239;
                                        arrayList9 = arrayList9;
                                        i2 = i6;
                                    }
                                } catch (C5276 e7) {
                                    e = e7;
                                    arrayList9 = arrayList9;
                                    strM252310 = str;
                                    i2 = i6;
                                }
                            } catch (C5276 e8) {
                                e = e8;
                                i6 = i5;
                            }
                        } catch (C5276 e9) {
                            e = e9;
                            i = 0;
                            str = strM252310;
                            arrayList9 = arrayList9;
                            z = false;
                            i2 = i;
                            strM252310 = str;
                            if (i2 >= 0) {
                                str2 = null;
                            } else {
                                str2 = null;
                            }
                            if (!z) {
                                strM252310 = null;
                            }
                            m21929(e, i8, i2, strM252310, str2);
                            throw e;
                        }
                    } else {
                        arrayList = arrayList7;
                        int i14 = (int) Long.parseLong(strM252310.substring(2), 16);
                        c15458M18752 = c8084.m18752((i14 >>> 16) & 255);
                        i3 = i14 & 65535;
                        String str21 = c15458M18752 == null ? null : (String) c15458M18752.f44152.get(Integer.valueOf(i3));
                        if (str21 == null) {
                            throw m21931("RESOURCE_NOT_FOUND", "Resource not found.");
                        }
                        str = strM252310;
                        try {
                            if (c15458M18752.f44155.contains(Integer.valueOf(i3))) {
                                throw m21931("RESOURCE_NOT_FOUND", "Variant targets must exist before this request. Put all variants of a new resource in its resource add.");
                            }
                            try {
                                m21928(c15458M18752.f44156);
                                i5 = -1;
                                str3 = str21;
                                z = true;
                                hashSet = c15458M18752.f44160;
                                str4 = c15458M18752.f44156;
                                i6 = i5;
                                int i15 = (c15458M18752.f44154 << 16) | (i10 << 24) | i3;
                                strM25239 = C10962.m25239(i15);
                                arrayList2 = new ArrayList();
                                i7 = i15;
                                arrayList8.add(new C11989(i8, strM25239, arrayList2));
                                i2 = 0;
                                str = strM25239;
                                while (i2 < arrayList9.size()) {
                                    c10450 = (C10450) arrayList9.get(i2);
                                    arrayList9 = arrayList9;
                                    arrayList3 = arrayList8;
                                    if (arrayList6.size() < 200) {
                                        throw m21931(str11, "A request supports at most 200 resource values.");
                                    }
                                    String str110 = c10450.f28915;
                                    str6 = c10450.f28916;
                                    c20635M35575 = C15654.m35575(str110);
                                    if (str3.equals(m21922(c20635M35575))) {
                                        throw m21931("INVALID_VALUE_XML", "All values must keep the target resource name.");
                                    }
                                    strM10471 = C4927.m10471(str4);
                                    if (str8.equals(str10)) {
                                        strM10472 = C4927.m10471(str4);
                                    } else {
                                        strM10472 = null;
                                    }
                                    arrayList4 = arrayList6;
                                    if (strM10471.equals(m21923(c20635M35575, strM10472))) {
                                        throw m21931("INVALID_VALUE_XML", "valueXml type does not match the target resource type.");
                                    }
                                    c22999M21926 = m21926(str6, c8084.f21313);
                                    str7 = i3 + "\n" + str6;
                                    if (!c15458M18752.f44159.add(str7)) {
                                        if (hashSet.contains(str7)) {
                                            throw m21931(str12, "Multiple values in this request add the same resource variant. Remove duplicate values.");
                                        }
                                        throw m21931("RESOURCE_VARIANT_ALREADY_EXISTS", "Resource variant already exists; use mt_apk_resource_edit to change it.");
                                    }
                                    hashSet.add(str7);
                                    InterfaceC6434 interfaceC6435 = c8084.f21313;
                                    if (str8.equals(str10)) {
                                        interfaceC3080 = c15458M18752.f44153;
                                        if (interfaceC3080 != null) {
                                            interfaceC22528Mo4717 = null;
                                            break;
                                        }
                                        it = interfaceC3080.mo5205().iterator();
                                        do {
                                            if (it.hasNext()) {
                                                interfaceC22528Mo4717 = null;
                                                break;
                                            }
                                            interfaceC22528Mo4717 = ((InterfaceC9116) it.next()).mo4717(i3);
                                        } while (interfaceC22528Mo4717 == null);
                                        interfaceC22528 = interfaceC22528Mo4717;
                                    } else {
                                        interfaceC22528 = null;
                                    }
                                    int i16 = i7;
                                    C6268 c6268M14225 = C6268.m14224(i16, str6, str4, str3, m21930(interfaceC6435, c15458M18752, i3, str3, c22999M21926, interfaceC22528));
                                    ArrayList arrayList13 = arrayList;
                                    arrayList13.add(c6268M14225);
                                    str5 = str;
                                    String str111 = str4;
                                    HashSet hashSet4 = hashSet;
                                    C8083 c8086 = c8084;
                                    String str112 = str12;
                                    String str113 = str3;
                                    String str114 = str11;
                                    String str115 = str8;
                                    String str22 = str10;
                                    arrayList4.add(new C13448(i8, i2, i16, c15458M18752.f44156, str113, c10450, arrayList2, z));
                                    i2++;
                                    str11 = str114;
                                    arrayList6 = arrayList4;
                                    str = str5;
                                    str10 = str22;
                                    str4 = str111;
                                    hashSet = hashSet4;
                                    c8084 = c8086;
                                    str12 = str112;
                                    str3 = str113;
                                    arrayList9 = arrayList9;
                                    arrayList = arrayList13;
                                    str8 = str115;
                                    i7 = i16;
                                    arrayList8 = arrayList3;
                                    strM252310 = str5;
                                }
                                i8++;
                                arrayList5 = arrayList10;
                                arrayList7 = arrayList;
                                str9 = str13;
                                interfaceC11799M52618 = interfaceC11799M52618;
                                map = map;
                                str8 = str8;
                            } catch (C5276 e10) {
                                e = e10;
                                i4 = -1;
                                strM252310 = str;
                                z = true;
                                i2 = i4;
                            }
                        } catch (C5276 e11) {
                            e = e11;
                            arrayList9 = arrayList9;
                            i = -1;
                            z = false;
                            i2 = i;
                            strM252310 = str;
                            if (i2 >= 0) {
                                str2 = null;
                            } else {
                                str2 = null;
                            }
                            if (!z) {
                                strM252310 = null;
                            }
                            m21929(e, i8, i2, strM252310, str2);
                            throw e;
                        }
                    }
                    if (i2 >= 0 || i2 >= arrayList9.size()) {
                        str2 = null;
                    } else {
                        str2 = ((C10450) arrayList9.get(i2)).f28916;
                    }
                    if (!z) {
                        strM252310 = null;
                    }
                    m21929(e, i8, i2, strM252310, str2);
                    throw e;
                } catch (C5276 e12) {
                    e = e12;
                    i = -1;
                    z = false;
                    i2 = i;
                    strM252310 = str;
                    if (i2 >= 0) {
                        str2 = null;
                    } else {
                        str2 = null;
                    }
                    if (!z) {
                        strM252310 = null;
                    }
                    m21929(e, i8, i2, strM252310, str2);
                    throw e;
                }
            } catch (C5276 e13) {
                e = e13;
                str = strM252310;
            }
        }
        ArrayList arrayList14 = arrayList8;
        C23662 c23662M25279 = c10962.m25279(arrayList7);
        ArrayList arrayList15 = new ArrayList();
        for (C13448 c13448 : arrayList6) {
            try {
                int i17 = c13448.f37760;
                C10450 c10451 = c13448.f37761;
                String str23 = c10451.f28916;
                C6268 c6268M14226 = C6268.m14224(c13448.f37760, str23, c13448.f37757, c13448.f37756, C15654.m35568(c23662M25279, i17, str23, c10451.f28915));
                arrayList15.add(c6268M14226);
                c13448.f37759.add(new C13330(str23, c6268M14226.f15858));
            } catch (C5276 e14) {
                m21929(e14, c13448.f37754, c13448.f37755, c13448.f37758 ? C10962.m25239(c13448.f37760) : null, c13448.f37761.f28916);
                throw e14;
            }
        }
        return new C24176(arrayList15, arrayList14);
    }

    /* JADX INFO: renamed from: ֫ */
    public static InterfaceC6434 m21925(int i, InterfaceC11799 interfaceC11799) throws C5276 {
        InterfaceC6434 interfaceC6434 = null;
        for (InterfaceC6434 interfaceC6435 : interfaceC11799.mo23906()) {
            if (interfaceC6435.mo14722() == i) {
                if (interfaceC6434 != null) {
                    throw m21931("RESOURCE_TARGET_AMBIGUOUS", "Duplicate package IDs prevent adding resources safely.");
                }
                interfaceC6434 = interfaceC6435;
            }
        }
        if (interfaceC6434 != null) {
            return interfaceC6434;
        }
        JSONArray jSONArrayArray = JSON.array();
        HashSet hashSet = new HashSet();
        for (InterfaceC6434 interfaceC6436 : interfaceC11799.mo23906()) {
            if (hashSet.add(Integer.valueOf(interfaceC6436.mo14722()))) {
                jSONArrayArray.add("0x" + C10962.m25239(interfaceC6436.mo14722()).substring(8));
            }
        }
        C5276 c5276M21931 = m21931("RESOURCE_PACKAGE_NOT_FOUND", "Resource package not found; creating packages is not supported.");
        c5276M21931.f12412.put("availablePackageIds", jSONArrayArray);
        throw c5276M21931;
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m21922(C20635 c20635) throws C5276 {
        C19964 c19964M46637 = c20635.m46637("name");
        if (c19964M46637 == null || c19964M46637.m45304().isEmpty() || c19964M46637.m45304().indexOf(0) >= 0) {
            throw m21931("INVALID_VALUE_XML", "valueXml requires a non-empty resource name without NUL.");
        }
        return c19964M46637.m45304();
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m21923(C20635 c20635, String str) throws C5276 {
        String strM46644 = c20635.m46644();
        C19964 c19964M46637 = c20635.m46637("type");
        String strM45304 = c19964M46637 == null ? null : c19964M46637.m45304();
        Object obj = ("string-array".equals(strM46644) || "integer-array".equals(strM46644)) ? "array" : strM46644;
        boolean zContains = f25726.contains(strM46644);
        if (!zContains && !f25727.contains(obj)) {
            throw m21931("UNSUPPORTED_VALUE_XML", C21466.m48631("Unsupported valueXml root: ", strM46644));
        }
        if (str != null) {
            if (strM45304 != null && !strM45304.equals(str)) {
                throw m21931("INVALID_VALUE_XML", "valueXml type attribute does not match the target resource type.");
            }
            m21928(str);
            return str;
        }
        if (zContains) {
            if (strM45304 == null) {
                throw m21931("INVALID_VALUE_XML", "This valueXml root requires a type attribute when creating a resource.");
            }
            if (strM45304.isEmpty()) {
                throw m21931("INVALID_VALUE_XML", "Resource type must not be empty.");
            }
            for (int i = 0; i < strM45304.length(); i++) {
                char cCharAt = strM45304.charAt(i);
                if (cCharAt != '_' && ((cCharAt < 'a' || cCharAt > 'z') && (i <= 0 || i >= strM45304.length() - 1 || cCharAt < '0' || cCharAt > '9'))) {
                    throw m21931("INVALID_VALUE_XML", "Resource type must contain lowercase ASCII letters, digits, or underscores, start with a letter or underscore, and not end in a digit.");
                }
            }
        } else {
            if (strM45304 != null && !strM45304.equals(obj)) {
                throw m21931("INVALID_VALUE_XML", "valueXml type attribute conflicts with its root element.");
            }
            strM45304 = obj;
        }
        m21928(strM45304);
        return strM45304;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m21928(String str) throws C5276 {
        if ("attr".equals(str) || "^attr-private".equals(str)) {
            throw m21931("UNSUPPORTED_VALUE_XML", "Adding attr definitions or their variants is not supported.");
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C22999 m21926(String str, InterfaceC6434 interfaceC6434) throws C5276 {
        String strM51374 = "default";
        try {
            C22999 c22999M51348 = C22999.m51348("default".equals(str) ? "" : str, interfaceC6434.mo14712());
            if (!c22999M51348.m51374().isEmpty()) {
                strM51374 = c22999M51348.m51374();
            }
            if (strM51374.equals(str)) {
                return c22999M51348;
            }
            throw new IllegalArgumentException("Use canonical variant: ".concat(strM51374));
        } catch (Exception e) {
            throw m21931("INVALID_RESOURCE_VARIANT", e.getMessage() == null ? "Invalid resource variant." : e.getMessage());
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static byte[] m21930(InterfaceC6434 interfaceC6434, C15458 c15458, int i, String str, C22999 c22999, InterfaceC22528 interfaceC22528) {
        C10278 c10278M25225 = C10949.m25224().m25225(interfaceC6434.mo14722(), interfaceC6434.getPackageName());
        c10278M25225.m23892(interfaceC6434.mo14712());
        C21678 c21678M23895 = c10278M25225.m23895(c15458.f44154, c15458.f44156);
        c21678M23895.m48934(i, str, false);
        C20337 c20337M10438 = c21678M23895.m48931(c22999).m10438(i);
        c20337M10438.m45914();
        if (interfaceC22528 != null) {
            c20337M10438.m45915(interfaceC22528.mo31467());
            c20337M10438.m45916(interfaceC22528.mo31473());
        }
        return C25003.m54912(c20337M10438);
    }

    /* JADX INFO: renamed from: ۧ */
    public static C5276 m21931(String str, String str2) {
        return C5276.m11403(null, str, str2, "warning");
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m21929(C5276 c5276, int i, int i2, String str, String str2) {
        c5276.f12412.put("failedAddIndex", i).put("failedValueIndex", i2 < 0 ? JSON.NULL : JSON.value(i2)).put("locator", str == null ? JSON.NULL : JSON.value("resource:".concat(str))).put("variant", str2 == null ? JSON.NULL : JSON.value(str2));
    }
}
