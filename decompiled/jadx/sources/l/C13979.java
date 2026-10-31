package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import com.alipay.sdk.m.u0.b;
import com.google.android.material.color.ColorResourcesTableCreator;
import com.google.android.material.motion.MotionUtils;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import org.simpleframework.xml.core.AnnotationHandler;
import org.simpleframework.xml.strategy.Name;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.ܰᩳۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: S776 */
/* JADX INFO: loaded from: classes3.dex */
public final class C13979 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final HashSet f41691 = new HashSet(Arrays.asList("string", MotionUtils.EASING_TYPE_PATH, "bool", ColorResourcesTableCreator.RESOURCE_TYPE_NAME_COLOR, "dimen", ClassTransform.FLOAT, "fraction", "id", "integer", Name.REFER, "dynamic-reference", AnnotationHandler.ATTRIBUTE, "dynamic-attribute", "string-array", "integer-array", "array", "plurals", "style", "complex"));

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C16096 m33438(C14587 c14587) {
        return new C16096(new C12534(c14587.m34846(), c14587.m34848()).m30775());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C20331 m33439(C14587 c14587, InterfaceC21211 interfaceC21211, int i) {
        String strM52500 = C23816.m52500(C23816.m52503(interfaceC21211));
        try {
            if (m33454(interfaceC21211)) {
                return C20331.m46644(strM52500, "UNSUPPORTED_VALUE_XML");
            }
            m33459(interfaceC21211);
            m33457(interfaceC21211);
            String strM33435 = m33435(c14587, interfaceC21211, m33438(c14587));
            int iCodePointCount = strM33435.codePointCount(0, strM33435.length());
            if (iCodePointCount > i) {
                return C20331.m46641(iCodePointCount, strM52500);
            }
            return C20331.m46642(iCodePointCount, strM52500, strM33435);
        } catch (C6219 unused) {
            return C20331.m46644(strM52500, "UNSUPPORTED_STYLED_TEXT_XML");
        } catch (C11864 unused2) {
            return C20331.m46644(strM52500, "UNSUPPORTED_VALUE_XML");
        } catch (C23152 unused3) {
            return C20331.m46643(strM52500);
        } catch (Exception unused4) {
            return C20331.m46644(strM52500, "VALUE_XML_UNAVAILABLE");
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C15390 m33437(C9042 c9042, ArrayList arrayList) throws C3059 {
        C22405 c22405M23337 = c9042.m23337();
        C16096 c16096M50281 = c22405M23337.m50281();
        C20289[] c20289Arr = new C20289[arrayList.size()];
        String[] strArr = new String[arrayList.size()];
        String[] strArr2 = new String[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            C4808 c4808 = (C4808) arrayList.get(i);
            C20289 c20289M50280 = c22405M23337.m50280((int) Long.parseLong(c4808.f15216.substring(2), 16), c4808.f15217);
            if (c20289M50280 == null) {
                C3059 c3059M9363 = C3059.m9363("RESOURCE_VARIANT_NOT_FOUND", "Resource variant not found.");
                m33441(c3059M9363, c4808, (String) null, c16096M50281);
                throw c3059M9363;
            }
            c20289Arr[i] = c20289M50280;
            InterfaceC21211 interfaceC21211 = c20289M50280.f65537;
            strArr[i] = interfaceC21211 == null ? "missing" : C23816.m52500(C23816.m52503(interfaceC21211));
            String strM52500 = C23816.m52500(C23816.m52503(c20289M50280.f65539));
            strArr2[i] = strM52500;
            if (!strM52500.equals(c4808.f15214)) {
                C3059 c3059M9365 = C3059.m9365("STALE_TARGET_VERSION", "targetVersion does not match current resource value. Re-read the resource and retry.", "warning", (JSONArray) null, JSON.object().add("currentTargetVersion", strM52500));
                m33441(c3059M9365, c4808, strM52500, c16096M50281);
                throw c3059M9365;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        HashMap map = new HashMap();
        int i2 = 0;
        while (i2 < arrayList.size()) {
            C4808 c4809 = (C4808) arrayList.get(i2);
            try {
                C22405 c22405 = c22405M23337;
                try {
                    C3397 c3397M33436 = m33436(c22405M23337, c20289Arr[i2], c4809, strArr[i2], strArr2[i2], c16096M50281, map);
                    arrayList2.add(c3397M33436);
                    C20289 c20289 = c20289Arr[i2];
                    map.put(C9042.m23325(c20289.f65541, c20289.f65540), c3397M33436.f10754);
                    i2++;
                    c22405M23337 = c22405;
                } catch (C3059 e) {
                    e = e;
                    m33441(e, c4809, strArr2[i2], c16096M50281);
                    throw e;
                }
            } catch (C3059 e2) {
                e = e2;
            }
        }
        return new C15390(c16096M50281, arrayList2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m33448(C22405 c22405, int i, String str, String str2) {
        C20289 c20289M50280 = c22405.m50280(i, str);
        if (c20289M50280 == null) {
            throw new IllegalStateException("Missing planned resource target");
        }
        return m33436(c22405, c20289M50280, new C4808(0, C9042.m23294(i), str, "missing", str2), "missing", "missing", c22405.m50281(), new HashMap()).f10754;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C21742 m33440(InterfaceC21211 interfaceC21211) {
        C20317 c20317M21925 = C9028.m23280().m23281(interfaceC21211.mo29407().mo12858(), interfaceC21211.mo29407().getPackageName()).m21925(interfaceC21211.getType().mo2870(), interfaceC21211.getType().getTypeName());
        c20317M21925.m46611(interfaceC21211.mo47883(), interfaceC21211.mo29406(), false);
        C2678 c2678M46608 = c20317M21925.m46608(interfaceC21211.mo29410().mo18743());
        c2678M46608.m8397(interfaceC21211.mo29410().mo2345());
        c2678M46608.m8395(interfaceC21211.mo29410().mo2349());
        c2678M46608.m8392(interfaceC21211.mo47883());
        return new C21742(c2678M46608);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m33441(C3059 c3059, C4808 c4808, String str, C16096 c16096) {
        c3059.f9609.put("failedEditIndex", c4808.f15215).put("resourceId", c4808.f15216).put("variant", c4808.f15217).put("currentTargetVersion", str == null ? JSON.NULL : JSON.value(str)).put("resourceNamePolicy", c16096 == null ? JSON.NULL : c16096.m37986());
    }

    /* JADX WARN: Code duplicated, block: B:126:0x0272  */
    /* JADX WARN: Code duplicated, block: B:30:0x00dc  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m33435(C14587 c14587, InterfaceC21211 interfaceC21211, C16096 c16096) {
        String str;
        int i;
        String strM33450;
        InterfaceC21211 interfaceC21211Mo2346;
        String string;
        String strM39548;
        boolean z = c16096.f49590;
        C10453 c10453 = new C10453();
        if (interfaceC21211.mo29412() && "style".equals(C2692.m8425(interfaceC21211.getType().getTypeName()))) {
            c10453.mo1294("style");
            c10453.mo1291("name", interfaceC21211.mo29406());
            if (interfaceC21211.getParent() != 0) {
                c10453.mo1291("parent", "@".concat(m33433(interfaceC21211.mo29407().mo12858(), interfaceC21211.getParent(), c14587, c16096)));
            }
            C17515 c17515M34848 = c14587.m34848();
            for (InterfaceC1454 interfaceC1454 : interfaceC21211.values()) {
                C16809 c16809M40933 = c17515M34848.m40933(interfaceC1454.mo5006());
                if (c16809M40933 != null) {
                    if (((C18683) c16809M40933.m39546()).contains(interfaceC1454.mo5004())) {
                        c10453.mo1294("item");
                        int iMo12858 = interfaceC21211.mo29407().mo12858();
                        int i2 = c16809M40933.f51604;
                        int i3 = (i2 >>> 24) & 255;
                        if (!z || i3 == 1) {
                            StringBuilder sbM15339 = C5368.m15339(c14587.m34844(iMo12858, i3));
                            sbM15339.append(c16809M40933.f51605);
                            string = sbM15339.toString();
                        } else {
                            string = m33450(i2);
                        }
                        c10453.mo1291("name", string);
                        if (interfaceC1454.mo5007()) {
                            int i4 = c16809M40933.f51608;
                            if ((65536 & i4) != 0) {
                                strM39548 = c16809M40933.m39545(interfaceC1454.getValue());
                            } else if ((i4 & WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT) != 0) {
                                strM39548 = c16809M40933.m39548(interfaceC1454.getValue());
                            } else {
                                strM39548 = null;
                            }
                        } else {
                            strM39548 = null;
                        }
                        if (strM39548 == null) {
                            m33451(c10453, interfaceC1454, c14587, c16096);
                        } else {
                            c10453.text(strM39548.toString());
                        }
                        c10453.mo1290("item");
                    }
                }
                m33442(c10453, interfaceC1454, c14587, c16096);
            }
            c10453.mo1290("style");
        } else if (interfaceC21211.mo29412() && m33454(interfaceC21211) && interfaceC21211.mo29409() != 0 && interfaceC21211.getValue().mo5006() == 16777216 && interfaceC21211.getValue().mo5007()) {
            c10453.mo1294("attr");
            c10453.mo1291("name", interfaceC21211.mo29406());
            int value = interfaceC21211.getValue().getValue();
            if (value != 65535) {
                ArrayList arrayList = new ArrayList();
                if ((value & 1) != 0) {
                    arrayList.add(Name.REFER);
                }
                if ((value & 2) != 0) {
                    arrayList.add("string");
                }
                if ((value & 4) != 0) {
                    arrayList.add("integer");
                }
                if ((value & 8) != 0) {
                    arrayList.add(ClassTransform.BOOLEAN);
                }
                if ((value & 16) != 0) {
                    arrayList.add(ColorResourcesTableCreator.RESOURCE_TYPE_NAME_COLOR);
                }
                if ((value & 32) != 0) {
                    arrayList.add(ClassTransform.FLOAT);
                }
                if ((value & 64) != 0) {
                    arrayList.add("dimension");
                }
                if ((value & 128) != 0) {
                    arrayList.add("fraction");
                }
                if ((65536 & value) != 0) {
                    str = "enum";
                    arrayList.add("enum");
                } else {
                    str = null;
                }
                if ((131072 & value) != 0) {
                    arrayList.add("flags");
                    str = "flag";
                }
                StringBuilder sb = new StringBuilder();
                Iterator it = arrayList.iterator();
                if (it.hasNext()) {
                    while (true) {
                        sb.append((CharSequence) it.next());
                        if (!it.hasNext()) {
                            break;
                        }
                        sb.append((CharSequence) "|");
                    }
                }
                c10453.mo1291("format", sb.toString());
            } else {
                str = null;
            }
            InterfaceC0748 type = interfaceC21211.mo29407().getType("id");
            InterfaceC7099 interfaceC7099Mo2877 = (type == null || type.mo2871() == 0) ? null : type.mo2877(0);
            int iMo12859 = interfaceC21211.mo29407().mo12858() << 24;
            int i5 = 16;
            if (type != null) {
                iMo12859 |= type.mo2870() << 16;
            }
            int i6 = 1;
            while (i6 < interfaceC21211.mo29409()) {
                InterfaceC1454 value2 = interfaceC21211.getValue(i6);
                if (str == null) {
                    m33442(c10453, value2, c14587, c16096);
                } else {
                    if (value2.mo5004() != i5) {
                        i = 65535;
                        if (value2.mo5004() != 17) {
                            m33442(c10453, value2, c14587, c16096);
                        }
                    } else {
                        i = 65535;
                    }
                    c10453.mo1294(str);
                    int iMo5006 = value2.mo5006();
                    int i7 = (iMo5006 >>> 24) & 255;
                    if ((!z || i7 == 1) && interfaceC7099Mo2877 != null && ((-65536) & iMo5006) == iMo12859 && (interfaceC21211Mo2346 = interfaceC7099Mo2877.mo2346(iMo5006 & i)) != null) {
                        String strMo29406 = interfaceC21211Mo2346.mo29406();
                        strM33450 = m33460(strMo29406) ? m33450(iMo5006) : strMo29406;
                    } else {
                        strM33450 = m33450(iMo5006);
                    }
                    c10453.mo1291("name", strM33450);
                    c10453.mo1291(b.d, C9650.m24585(c14587, value2).toString());
                    c10453.mo1290(str);
                }
                i6++;
                i5 = 16;
            }
            c10453.mo1290("attr");
        } else {
            C9650.m24591(c10453, interfaceC21211, new C13274(c14587.m34846(), c16096), new C18116());
        }
        return c10453.f31385.toString();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m33454(InterfaceC21211 interfaceC21211) {
        String strM8425 = C2692.m8425(interfaceC21211.getType().getTypeName());
        return "attr".equals(strM8425) || "^attr-private".equals(strM8425);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m33442(InterfaceC13965 interfaceC13965, InterfaceC1454 interfaceC1454, C14587 c14587, C16096 c16096) {
        C10453 c10453 = (C10453) interfaceC13965;
        c10453.mo1294(m33434(interfaceC1454));
        if (interfaceC1454.mo5006() != -1) {
            c10453.mo1291("id", m33450(interfaceC1454.mo5006()));
        }
        m33451(interfaceC13965, interfaceC1454, c14587, c16096);
        c10453.mo1290(m33434(interfaceC1454));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m33451(InterfaceC13965 interfaceC13965, InterfaceC1454 interfaceC1454, C14587 c14587, C16096 c16096) {
        int iMo5004 = interfaceC1454.mo5004();
        if (iMo5004 == 0) {
            ((C10453) interfaceC13965).text(interfaceC1454.getValue() == 1 ? "@empty" : "@null");
            return;
        }
        if (iMo5004 != 1) {
            if (iMo5004 != 2) {
                if (iMo5004 == 3) {
                    InterfaceC3571 interfaceC3571Mo5008 = interfaceC1454.mo5008();
                    if (interfaceC3571Mo5008 == null) {
                        ((C10453) interfaceC13965).text("");
                        return;
                    } else {
                        C9650.m24590(interfaceC13965, interfaceC3571Mo5008.getValue(), interfaceC3571Mo5008.mo10888());
                        return;
                    }
                }
                if (iMo5004 != 7) {
                    if (iMo5004 != 8) {
                        ((C10453) interfaceC13965).text(C9650.m24585(c14587, interfaceC1454).toString());
                        return;
                    }
                }
            }
            ((C10453) interfaceC13965).text(interfaceC1454.getValue() == 0 ? "?null" : "?".concat(m33433(interfaceC1454.mo1510().mo12858(), interfaceC1454.getValue(), c14587, c16096)));
            return;
        }
        ((C10453) interfaceC13965).text(interfaceC1454.getValue() != 0 ? "@".concat(m33433(interfaceC1454.mo1510().mo12858(), interfaceC1454.getValue(), c14587, c16096)) : "@null");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m33434(InterfaceC1454 interfaceC1454) throws IOException {
        int iMo5004 = interfaceC1454.mo5004();
        switch (iMo5004) {
            case 0:
            case 1:
                return Name.REFER;
            case 2:
                return AnnotationHandler.ATTRIBUTE;
            case 3:
                return "string";
            case 4:
                return ClassTransform.FLOAT;
            case 5:
                return "dimen";
            case 6:
                return "fraction";
            case 7:
                return "dynamic-reference";
            case 8:
                return "dynamic-attribute";
            default:
                switch (iMo5004) {
                    case 16:
                    case 17:
                        return "integer";
                    case 18:
                        return "bool";
                    default:
                        switch (iMo5004) {
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                                return ColorResourcesTableCreator.RESOURCE_TYPE_NAME_COLOR;
                            default:
                                throw new IOException("Unsupported value type: ".concat(C12534.m30763(interfaceC1454.mo5004())));
                        }
                }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m33433(int i, int i2, C14587 c14587, C16096 c16096) {
        int i3 = (i2 >>> 24) & 255;
        if (c16096.f49590 && i3 != 1) {
            return m33450(i2);
        }
        String strMo32239 = c14587.mo32239(i, i2);
        return m33460(strMo32239) ? m33450(i2) : strMo32239;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static boolean m33460(String str) {
        return str != null && str.length() == 8 && C9896.m24990(str);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m33450(int i) {
        return String.format(Locale.ROOT, "%08X", Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m33457(InterfaceC21211 interfaceC21211) throws C6219 {
        C21916[] c21916ArrMo10322;
        boolean zM19210;
        for (InterfaceC1454 interfaceC1454 : interfaceC21211.values()) {
            if (interfaceC1454.mo5004() == 3 && interfaceC1454.mo5008() != null) {
                InterfaceC3571 interfaceC3571Mo5008 = interfaceC1454.mo5008();
                if (interfaceC3571Mo5008.mo10323() && (c21916ArrMo10322 = interfaceC3571Mo5008.mo10322()) != null) {
                    int length = interfaceC3571Mo5008.getValue().length();
                    for (C21916 c21916 : c21916ArrMo10322) {
                        if (c21916.m49327(length)) {
                            String str = c21916.f70169;
                            int iIndexOf = str.indexOf(59);
                            if (iIndexOf < 0) {
                                zM19210 = C7184.m19210(str);
                            } else if (C7184.m19210(str.substring(0, iIndexOf))) {
                                while (true) {
                                    if (iIndexOf >= 0) {
                                        int i = iIndexOf + 1;
                                        if (i < str.length()) {
                                            int iIndexOf2 = str.indexOf(61, i);
                                            if (iIndexOf2 >= 0) {
                                                String strSubstring = str.substring(i, iIndexOf2);
                                                if (strSubstring.indexOf(59) < 0 && strSubstring.indexOf(61) < 0 && C7184.m19210(strSubstring)) {
                                                    iIndexOf = str.indexOf(59, iIndexOf2 + 1);
                                                }
                                            }
                                            zM19210 = false;
                                        }
                                    }
                                    zM19210 = true;
                                }
                            } else {
                                zM19210 = false;
                            }
                            if (zM19210) {
                            }
                        }
                        throw new C6219();
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static void m33459(InterfaceC21211 interfaceC21211) throws C11864 {
        if (interfaceC21211.mo29412()) {
            for (InterfaceC1454 interfaceC1454 : interfaceC21211.values()) {
                if (interfaceC1454.mo5004() == 0 && interfaceC1454.getValue() == 1) {
                    throw new C11864();
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m33443(C19220 c19220) throws C3059 {
        if (c19220.m44346()) {
            return;
        }
        Iterator itM44337 = C19220.m44337(c19220);
        while (itM44337.hasNext()) {
            m33452((C19220) itM44337.next());
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m33452(C19220 c19220) throws C3059 {
        if (!C7184.m19210(c19220.m44350())) {
            throw C3059.m9361(null, "UNSUPPORTED_STYLED_TEXT_XML", "Unsupported styled text tag name: " + c19220.m44350(), "warning");
        }
        for (C18514 c18514 : c19220.m44351()) {
            String strM43025 = c18514.m43025();
            String strM43026 = c18514.m43026();
            if (!C7184.m19210(strM43025) || strM43025.indexOf(61) >= 0 || strM43025.indexOf(59) >= 0) {
                throw C3059.m9361(null, "UNSUPPORTED_STYLED_TEXT_XML", "Unsupported styled text attribute name: ".concat(strM43025), "warning");
            }
            if (strM43026.indexOf(59) >= 0) {
                throw C3059.m9361(null, "UNSUPPORTED_STYLED_TEXT_XML", "Unsupported styled text attribute value.", "warning");
            }
        }
        Iterator itM44337 = C19220.m44337(c19220);
        while (itM44337.hasNext()) {
            m33452((C19220) itM44337.next());
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m33444(C19220 c19220, String str, boolean z, boolean z2) throws C3059 {
        if (z2) {
            return;
        }
        if (c19220.m44346()) {
            try {
                if ("@empty".equals(c19220.m44347().m3219()) && (!z || !Name.REFER.equals(c19220.m44350()))) {
                    throw m33456("@empty is supported only by root <reference>.");
                }
            } catch (C1580 e) {
                throw m33456(e.getMessage() == null ? "Invalid valueXml" : e.getMessage());
            }
        }
        boolean zM33447 = m33447(c19220, str, z);
        Iterator itM44337 = C19220.m44337(c19220);
        while (itM44337.hasNext()) {
            m33444((C19220) itM44337.next(), c19220.m44350(), false, zM33447);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static C19220 m33455(String str) throws C3059 {
        if (str.trim().isEmpty()) {
            throw m33456("valueXml must contain one XML element.");
        }
        String upperCase = str.toUpperCase(Locale.ROOT);
        if (str.contains("<?") || upperCase.contains("<!DOCTYPE")) {
            throw m33456("valueXml must not contain processing instructions or DTD.");
        }
        try {
            int i = C5108.f16016;
            C7184 c7184 = new C7184();
            c7184.m19219(new StringReader(str));
            C5108 c5108M14654 = C5108.m14654(c7184, true);
            if (c5108M14654.size() != 1) {
                throw m33456("valueXml must contain exactly one root element.");
            }
            return (C19220) c5108M14654.get(0);
        } catch (C3059 e) {
            throw e;
        } catch (Exception e2) {
            throw m33456(e2.getMessage() == null ? "Invalid valueXml" : e2.getMessage());
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m33453(C19220 c19220, String str, boolean z, boolean z2) throws C3059 {
        if (z2) {
            return;
        }
        for (C18514 c18514 : c19220.m44351()) {
            if ("parent".equals(c18514.m43025()) && c18514.m43026().startsWith("@")) {
                m33461(c18514.m43026().substring(1));
            } else if ("item".equals(c19220.m44350()) && "name".equals(c18514.m43025())) {
                m33461(c18514.m43026());
            } else if ("enum".equals(c19220.m44350()) || "flag".equals(c19220.m44350())) {
                if ("name".equals(c18514.m43025())) {
                    m33461(c18514.m43026());
                }
            }
        }
        if (c19220.m44346()) {
            try {
                String strM3219 = c19220.m44347().m3219();
                if (strM3219.startsWith("@") || strM3219.startsWith("?")) {
                    m33461(strM3219.substring(1));
                }
            } catch (C1580 e) {
                throw m33456(e.getMessage() == null ? "Invalid valueXml" : e.getMessage());
            }
        }
        boolean zM33447 = m33447(c19220, str, z);
        Iterator itM44337 = C19220.m44337(c19220);
        while (itM44337.hasNext()) {
            m33453((C19220) itM44337.next(), c19220.m44350(), false, zM33447);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m33447(C19220 c19220, String str, boolean z) {
        String strM44350 = c19220.m44350();
        if ("string".equals(strM44350) || MotionUtils.EASING_TYPE_PATH.equals(strM44350)) {
            return z || "array".equals(str) || "attr".equals(str) || "complex".equals(str) || "style".equals(str);
        }
        if ("item".equals(strM44350)) {
            return "string-array".equals(str) || "plurals".equals(str) || "style".equals(str);
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static void m33461(String str) throws C3059 {
        if (!str.equals("null") && !str.equals(com.umeng.commonsdk.statistics.b.f) && m33458(str) == null && !str.startsWith("android:")) {
            throw C3059.m9361(null, "APP_NAME_REFERENCES_NOT_ACCEPTED", "APP resource name references are not accepted when resources.arsc is confused; use hex resource ids.", "warning");
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m33445(C22405 c22405, C18906 c18906, String str) throws C3059 {
        if ("style".equals(str)) {
            if (c18906.getParent() != 0 && !"style".equals(c22405.m50277(c18906.getParent()))) {
                throw m33456("style parent must resolve to a style resource.");
            }
            Iterator it = c18906.values().iterator();
            while (it.hasNext()) {
                String strM50277 = c22405.m50277(((InterfaceC1454) it.next()).mo5006());
                if (!"attr".equals(strM50277) && !"^attr-private".equals(strM50277)) {
                    throw m33456("style item name must resolve to an attr resource.");
                }
            }
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static Integer m33458(String str) {
        if (str.length() == 10 && str.regionMatches(true, 0, "0x", 0, 2)) {
            str = str.substring(2);
        }
        if (str.length() == 8 && C9896.m24990(str)) {
            return Integer.valueOf(C9896.m24993(str));
        }
        return null;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static C3059 m33456(String str) {
        return C3059.m9361(null, "INVALID_VALUE_XML", str, "warning");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3397 m33436(C22405 c22405, C20289 c20289, C4808 c4808, String str, String str2, C16096 c16096, HashMap map) throws C3059 {
        InterfaceC21211 interfaceC21211M52501;
        byte[] bArr = (byte[]) map.get(C9042.m23325(c20289.f65541, c20289.f65540));
        if (bArr == null) {
            interfaceC21211M52501 = c20289.f65539;
        } else {
            interfaceC21211M52501 = C23816.m52501(c20289.f65538, c20289.f65541 & 65535, bArr);
        }
        boolean z = true;
        if (!m33454(interfaceC21211M52501)) {
            C19220 c19220M33455 = m33455(c4808.f15218);
            String strMo29406 = interfaceC21211M52501.mo29406();
            if (!f41691.contains(c19220M33455.m44350())) {
                throw C3059.m9361(null, "UNSUPPORTED_VALUE_XML", "Unsupported valueXml root tag: " + c19220M33455.m44350(), "warning");
            }
            C18514 c18514M44343 = c19220M33455.m44343("name");
            if (c18514M44343 == null) {
                throw m33456("valueXml root must keep the original name attribute.");
            }
            if (!strMo29406.equals(c18514M44343.m43026())) {
                throw m33456("valueXml root name is read-only and must not change.");
            }
            Iterator it = c19220M33455.m44351().iterator();
            while (it.hasNext()) {
                String strM43025 = ((C18514) it.next()).m43025();
                if ("public".equals(strM43025) || "weak".equals(strM43025) || "compact".equals(strM43025)) {
                    throw C3059.m9361(null, "UNSUPPORTED_VALUE_XML", "valueXml does not support public, weak, or compact attributes.", "warning");
                }
            }
            String strM44350 = c19220M33455.m44350();
            strM44350.getClass();
            switch (strM44350) {
                case "string-array":
                    Iterator itM44337 = C19220.m44337(c19220M33455);
                    while (itM44337.hasNext()) {
                        m33443((C19220) itM44337.next());
                    }
                    break;
                case "string":
                case "path":
                    m33443(c19220M33455);
                    break;
                case "plurals":
                    Iterator itM44338 = C19220.m44338(c19220M33455, "item");
                    while (itM44338.hasNext()) {
                        m33443((C19220) itM44338.next());
                    }
                    break;
                case "attr":
                case "array":
                case "complex":
                    Iterator itM44339 = C19220.m44337(c19220M33455);
                    while (itM44339.hasNext()) {
                        C19220 c19220 = (C19220) itM44339.next();
                        if ("string".equals(c19220.m44350()) || MotionUtils.EASING_TYPE_PATH.equals(c19220.m44350())) {
                            m33443(c19220);
                        }
                    }
                    break;
                case "style":
                    Iterator itM443310 = C19220.m44337(c19220M33455);
                    while (itM443310.hasNext()) {
                        C19220 c19221 = (C19220) itM443310.next();
                        if ("item".equals(c19221.m44350())) {
                            m33443(c19221);
                        } else if ("string".equals(c19221.m44350()) || MotionUtils.EASING_TYPE_PATH.equals(c19221.m44350())) {
                            m33443(c19221);
                        }
                    }
                    break;
            }
            m33444(c19220M33455, (String) null, true, false);
            boolean zMo29405 = interfaceC21211M52501.mo29405();
            boolean zMo29411 = interfaceC21211M52501.mo29411();
            boolean zMo29408 = interfaceC21211M52501.mo29408();
            if (c16096.f49590) {
                m33453(c19220M33455, (String) null, true, false);
            }
            try {
                C19220 c19220M44340 = C19220.m44340("<resources>" + c4808.f15218 + "</resources>", true);
                HashMap map2 = new HashMap();
                map2.put(interfaceC21211M52501.mo29406(), Integer.valueOf(interfaceC21211M52501.mo47883()));
                C2678 c2678 = m33440(interfaceC21211M52501).f69712;
                C12569 c12569 = new C12569(c22405, c16096);
                c12569.m26165();
                try {
                    C11766.m28799(c19220M44340, c2678, c12569, map2, new C18116());
                    c12569.m26159();
                    C18906 c18906Mo2346 = c2678.mo2346(interfaceC21211M52501.mo47883());
                    if (c18906Mo2346 == null || c18906Mo2346.mo29409() == 0) {
                        throw new C1580("Resource entry was not encoded", c19220M44340);
                    }
                    c18906Mo2346.m43649(zMo29405);
                    c18906Mo2346.m43650(zMo29411);
                    if (!zMo29408 || c18906Mo2346.mo29412()) {
                        z = false;
                    }
                    c18906Mo2346.m43646(z);
                    m33445(c22405, c18906Mo2346, c19220M33455.m44350());
                    byte[] bArrM52503 = C23816.m52503(c18906Mo2346);
                    return new C3397(c4808.f15215, c4808.f15216, c4808.f15217, str2, C23816.m52500(bArrM52503), str, bArrM52503);
                } catch (Throwable th) {
                    c12569.m26159();
                    throw th;
                }
            } catch (C3059 e) {
                throw e;
            } catch (Exception e2) {
                throw C3059.m9361(null, "INVALID_VALUE_XML", e2.getMessage() == null ? "Invalid valueXml" : e2.getMessage(), "warning");
            }
        }
        C3059 c3059M9361 = C3059.m9361(null, "UNSUPPORTED_VALUE_XML", "Resource attr definitions are not supported by valueXml editing.", "warning");
        c3059M9361.f9609.put("_suppressResourceRetry", true);
        throw c3059M9361;
    }
}
