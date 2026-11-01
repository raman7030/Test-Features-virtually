package p067l;

import bin.p000mt.json.JSON;
import bin.p000mt.json.JSONArray;
import com.alipay.sdk.p010m.p052u0.C0226b;
import com.google.android.material.color.ColorResourcesTableCreator;
import com.google.android.material.motion.MotionUtils;
import com.tencent.p062mm.opensdk.modelmsg.WXMediaMessage;
import com.umeng.commonsdk.statistics.C0795b;
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
public final class C15654 {

    /* JADX INFO: renamed from: ֫ */
    public static final HashSet f44774 = new HashSet(Arrays.asList("string", MotionUtils.EASING_TYPE_PATH, "bool", ColorResourcesTableCreator.RESOURCE_TYPE_NAME_COLOR, "dimen", ClassTransform.FLOAT, "fraction", "id", "integer", Name.REFER, "dynamic-reference", AnnotationHandler.ATTRIBUTE, "dynamic-attribute", "string-array", "integer-array", "array", "plurals", "style", "complex"));

    /* JADX INFO: renamed from: ֫ */
    public static C17666 m35558(C16232 c16232) {
        return new C17666(new C14281(c16232.m36997(), c16232.m36999()).m32847());
    }

    /* JADX INFO: renamed from: ֫ */
    public static C21691 m35559(C16232 c16232, InterfaceC22528 interfaceC22528, int i) {
        String strM54909 = C25003.m54909(C25003.m54912(interfaceC22528));
        try {
            if (m35574(interfaceC22528)) {
                return C21691.m48967(strM54909, "UNSUPPORTED_VALUE_XML");
            }
            m35579(interfaceC22528);
            m35577(interfaceC22528);
            String strM35555 = m35555(c16232, interfaceC22528, m35558(c16232));
            int iCodePointCount = strM35555.codePointCount(0, strM35555.length());
            if (iCodePointCount > i) {
                return C21691.m48964(iCodePointCount, strM54909);
            }
            return C21691.m48965(iCodePointCount, strM54909, strM35555);
        } catch (C8279 unused) {
            return C21691.m48967(strM54909, "UNSUPPORTED_STYLED_TEXT_XML");
        } catch (C13644 unused2) {
            return C21691.m48967(strM54909, "UNSUPPORTED_VALUE_XML");
        } catch (C24372 unused3) {
            return C21691.m48966(strM54909);
        } catch (Exception unused4) {
            return C21691.m48967(strM54909, "VALUE_XML_UNAVAILABLE");
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C16995 m35557(C10962 c10962, ArrayList arrayList) throws C5276 {
        C23662 c23662M25282 = c10962.m25282();
        C17666 c17666M52621 = c23662M25282.m52621();
        C21651[] c21651Arr = new C21651[arrayList.size()];
        String[] strArr = new String[arrayList.size()];
        String[] strArr2 = new String[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            C6938 c6938 = (C6938) arrayList.get(i);
            C21651 c21651M52620 = c23662M25282.m52620((int) Long.parseLong(c6938.f18049.substring(2), 16), c6938.f18050);
            if (c21651M52620 == null) {
                C5276 c5276M11405 = C5276.m11405("RESOURCE_VARIANT_NOT_FOUND", "Resource variant not found.");
                m35561(c5276M11405, c6938, (String) null, c17666M52621);
                throw c5276M11405;
            }
            c21651Arr[i] = c21651M52620;
            InterfaceC22528 interfaceC22528 = c21651M52620.f68212;
            strArr[i] = interfaceC22528 == null ? "missing" : C25003.m54909(C25003.m54912(interfaceC22528));
            String strM54909 = C25003.m54909(C25003.m54912(c21651M52620.f68214));
            strArr2[i] = strM54909;
            if (!strM54909.equals(c6938.f18047)) {
                C5276 c5276M11407 = C5276.m11407("STALE_TARGET_VERSION", "targetVersion does not match current resource value. Re-read the resource and retry.", "warning", (JSONArray) null, JSON.object().add("currentTargetVersion", strM54909));
                m35561(c5276M11407, c6938, strM54909, c17666M52621);
                throw c5276M11407;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        HashMap map = new HashMap();
        int i2 = 0;
        while (i2 < arrayList.size()) {
            C6938 c6939 = (C6938) arrayList.get(i2);
            try {
                C23662 c23662 = c23662M25282;
                try {
                    C5597 c5597M35556 = m35556(c23662M25282, c21651Arr[i2], c6939, strArr[i2], strArr2[i2], c17666M52621, map);
                    arrayList2.add(c5597M35556);
                    C21651 c21651 = c21651Arr[i2];
                    map.put(C10962.m25270(c21651.f68216, c21651.f68215), c5597M35556.f13561);
                    i2++;
                    c23662M25282 = c23662;
                } catch (C5276 e) {
                    e = e;
                    m35561(e, c6939, strArr2[i2], c17666M52621);
                    throw e;
                }
            } catch (C5276 e2) {
                e = e2;
            }
        }
        return new C16995(c17666M52621, arrayList2);
    }

    /* JADX INFO: renamed from: ֫ */
    public static byte[] m35568(C23662 c23662, int i, String str, String str2) {
        C21651 c21651M52620 = c23662.m52620(i, str);
        if (c21651M52620 == null) {
            throw new IllegalStateException("Missing planned resource target");
        }
        return m35556(c23662, c21651M52620, new C6938(0, C10962.m25239(i), str, "missing", str2), "missing", "missing", c23662.m52621(), new HashMap()).f13561;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C23032 m35560(InterfaceC22528 interfaceC22528) {
        C21678 c21678M23895 = C10949.m25224().m25225(interfaceC22528.mo31469().mo14722(), interfaceC22528.mo31469().getPackageName()).m23895(interfaceC22528.getType().mo5199(), interfaceC22528.getType().getTypeName());
        c21678M23895.m48934(interfaceC22528.mo50213(), interfaceC22528.mo31468(), false);
        C4914 c4914M48931 = c21678M23895.m48931(interfaceC22528.mo31472().mo20693());
        c4914M48931.m10443(interfaceC22528.mo31472().mo4716());
        c4914M48931.m10441(interfaceC22528.mo31472().mo4720());
        c4914M48931.m10438(interfaceC22528.mo50213());
        return new C23032(c4914M48931);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m35561(C5276 c5276, C6938 c6938, String str, C17666 c17666) {
        c5276.f12412.put("failedEditIndex", c6938.f18048).put("resourceId", c6938.f18049).put("variant", c6938.f18050).put("currentTargetVersion", str == null ? JSON.NULL : JSON.value(str)).put("resourceNamePolicy", c17666 == null ? JSON.NULL : c17666.m40176());
    }

    /* JADX WARN: Code duplicated, block: B:126:0x0272  */
    /* JADX WARN: Code duplicated, block: B:30:0x00dc  */
    /* JADX INFO: renamed from: ֫ */
    public static String m35555(C16232 c16232, InterfaceC22528 interfaceC22528, C17666 c17666) {
        String str;
        int i;
        String strM35570;
        InterfaceC22528 interfaceC22528Mo4717;
        String string;
        String strM41784;
        boolean z = c17666.f52753;
        C12303 c12303 = new C12303();
        if (interfaceC22528.mo31474() && "style".equals(C4927.m10471(interfaceC22528.getType().getTypeName()))) {
            c12303.mo3702("style");
            c12303.mo3699("name", interfaceC22528.mo31468());
            if (interfaceC22528.getParent() != 0) {
                c12303.mo3699("parent", "@".concat(m35553(interfaceC22528.mo31469().mo14722(), interfaceC22528.getParent(), c16232, c17666)));
            }
            C19015 c19015M36999 = c16232.m36999();
            for (InterfaceC3751 interfaceC3751 : interfaceC22528.values()) {
                C18344 c18344M43191 = c19015M36999.m43191(interfaceC3751.mo7249());
                if (c18344M43191 != null) {
                    if (((C20125) c18344M43191.m41782()).contains(interfaceC3751.mo7247())) {
                        c12303.mo3702("item");
                        int iMo14722 = interfaceC22528.mo31469().mo14722();
                        int i2 = c18344M43191.f54786;
                        int i3 = (i2 >>> 24) & 255;
                        if (!z || i3 == 1) {
                            StringBuilder sbM17248 = C7470.m17248(c16232.m36995(iMo14722, i3));
                            sbM17248.append(c18344M43191.f54787);
                            string = sbM17248.toString();
                        } else {
                            string = m35570(i2);
                        }
                        c12303.mo3699("name", string);
                        if (interfaceC3751.mo7250()) {
                            int i4 = c18344M43191.f54790;
                            if ((65536 & i4) != 0) {
                                strM41784 = c18344M43191.m41781(interfaceC3751.getValue());
                            } else if ((i4 & WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT) != 0) {
                                strM41784 = c18344M43191.m41784(interfaceC3751.getValue());
                            } else {
                                strM41784 = null;
                            }
                        } else {
                            strM41784 = null;
                        }
                        if (strM41784 == null) {
                            m35571(c12303, interfaceC3751, c16232, c17666);
                        } else {
                            c12303.text(strM41784.toString());
                        }
                        c12303.mo3698("item");
                    }
                }
                m35562(c12303, interfaceC3751, c16232, c17666);
            }
            c12303.mo3698("style");
        } else if (interfaceC22528.mo31474() && m35574(interfaceC22528) && interfaceC22528.mo31471() != 0 && interfaceC22528.getValue().mo7249() == 16777216 && interfaceC22528.getValue().mo7250()) {
            c12303.mo3702("attr");
            c12303.mo3699("name", interfaceC22528.mo31468());
            int value = interfaceC22528.getValue().getValue();
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
                c12303.mo3699("format", sb.toString());
            } else {
                str = null;
            }
            InterfaceC3080 type = interfaceC22528.mo31469().getType("id");
            InterfaceC9116 interfaceC9116Mo5206 = (type == null || type.mo5200() == 0) ? null : type.mo5206(0);
            int iMo14723 = interfaceC22528.mo31469().mo14722() << 24;
            int i5 = 16;
            if (type != null) {
                iMo14723 |= type.mo5199() << 16;
            }
            int i6 = 1;
            while (i6 < interfaceC22528.mo31471()) {
                InterfaceC3751 value2 = interfaceC22528.getValue(i6);
                if (str == null) {
                    m35562(c12303, value2, c16232, c17666);
                } else {
                    if (value2.mo7247() != i5) {
                        i = 65535;
                        if (value2.mo7247() != 17) {
                            m35562(c12303, value2, c16232, c17666);
                        }
                    } else {
                        i = 65535;
                    }
                    c12303.mo3702(str);
                    int iMo7249 = value2.mo7249();
                    int i7 = (iMo7249 >>> 24) & 255;
                    if ((!z || i7 == 1) && interfaceC9116Mo5206 != null && ((-65536) & iMo7249) == iMo14723 && (interfaceC22528Mo4717 = interfaceC9116Mo5206.mo4717(iMo7249 & i)) != null) {
                        String strMo31468 = interfaceC22528Mo4717.mo31468();
                        strM35570 = m35580(strMo31468) ? m35570(iMo7249) : strMo31468;
                    } else {
                        strM35570 = m35570(iMo7249);
                    }
                    c12303.mo3699("name", strM35570);
                    c12303.mo3699(C0226b.f1011d, C11540.m26599(c16232, value2).toString());
                    c12303.mo3698(str);
                }
                i6++;
                i5 = 16;
            }
            c12303.mo3698("attr");
        } else {
            C11540.m26605(c12303, interfaceC22528, new C14984(c16232.m36997(), c17666), new C19586());
        }
        return c12303.f34348.toString();
    }

    /* JADX INFO: renamed from: ۧ */
    public static boolean m35574(InterfaceC22528 interfaceC22528) {
        String strM10471 = C4927.m10471(interfaceC22528.getType().getTypeName());
        return "attr".equals(strM10471) || "^attr-private".equals(strM10471);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m35562(InterfaceC15641 interfaceC15641, InterfaceC3751 interfaceC3751, C16232 c16232, C17666 c17666) {
        C12303 c12303 = (C12303) interfaceC15641;
        c12303.mo3702(m35554(interfaceC3751));
        if (interfaceC3751.mo7249() != -1) {
            c12303.mo3699("id", m35570(interfaceC3751.mo7249()));
        }
        m35571(interfaceC15641, interfaceC3751, c16232, c17666);
        c12303.mo3698(m35554(interfaceC3751));
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m35571(InterfaceC15641 interfaceC15641, InterfaceC3751 interfaceC3751, C16232 c16232, C17666 c17666) {
        int iMo7247 = interfaceC3751.mo7247();
        if (iMo7247 == 0) {
            ((C12303) interfaceC15641).text(interfaceC3751.getValue() == 1 ? "@empty" : "@null");
            return;
        }
        if (iMo7247 != 1) {
            if (iMo7247 != 2) {
                if (iMo7247 == 3) {
                    InterfaceC5763 interfaceC5763Mo7251 = interfaceC3751.mo7251();
                    if (interfaceC5763Mo7251 == null) {
                        ((C12303) interfaceC15641).text("");
                        return;
                    } else {
                        C11540.m26604(interfaceC15641, interfaceC5763Mo7251.getValue(), interfaceC5763Mo7251.mo12868());
                        return;
                    }
                }
                if (iMo7247 != 7) {
                    if (iMo7247 != 8) {
                        ((C12303) interfaceC15641).text(C11540.m26599(c16232, interfaceC3751).toString());
                        return;
                    }
                }
            }
            ((C12303) interfaceC15641).text(interfaceC3751.getValue() == 0 ? "?null" : "?".concat(m35553(interfaceC3751.mo3908().mo14722(), interfaceC3751.getValue(), c16232, c17666)));
            return;
        }
        ((C12303) interfaceC15641).text(interfaceC3751.getValue() != 0 ? "@".concat(m35553(interfaceC3751.mo3908().mo14722(), interfaceC3751.getValue(), c16232, c17666)) : "@null");
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m35554(InterfaceC3751 interfaceC3751) throws IOException {
        int iMo7247 = interfaceC3751.mo7247();
        switch (iMo7247) {
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
                switch (iMo7247) {
                    case 16:
                    case 17:
                        return "integer";
                    case 18:
                        return "bool";
                    default:
                        switch (iMo7247) {
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                                return ColorResourcesTableCreator.RESOURCE_TYPE_NAME_COLOR;
                            default:
                                throw new IOException("Unsupported value type: ".concat(C14281.m32835(interfaceC3751.mo7247())));
                        }
                }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m35553(int i, int i2, C16232 c16232, C17666 c17666) {
        int i3 = (i2 >>> 24) & 255;
        if (c17666.f52753 && i3 != 1) {
            return m35570(i2);
        }
        String strMo34338 = c16232.mo34338(i, i2);
        return m35580(strMo34338) ? m35570(i2) : strMo34338;
    }

    /* JADX INFO: renamed from: ᩳ */
    public static boolean m35580(String str) {
        return str != null && str.length() == 8 && C11774.m27005(str);
    }

    /* JADX INFO: renamed from: ۧ */
    public static String m35570(int i) {
        return String.format(Locale.ROOT, "%08X", Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: ܽ */
    public static void m35577(InterfaceC22528 interfaceC22528) throws C8279 {
        C23198[] c23198ArrMo12360;
        boolean zM21157;
        for (InterfaceC3751 interfaceC3751 : interfaceC22528.values()) {
            if (interfaceC3751.mo7247() == 3 && interfaceC3751.mo7251() != null) {
                InterfaceC5763 interfaceC5763Mo7251 = interfaceC3751.mo7251();
                if (interfaceC5763Mo7251.mo12361() && (c23198ArrMo12360 = interfaceC5763Mo7251.mo12360()) != null) {
                    int length = interfaceC5763Mo7251.getValue().length();
                    for (C23198 c23198 : c23198ArrMo12360) {
                        if (c23198.m51680(length)) {
                            String str = c23198.f72883;
                            int iIndexOf = str.indexOf(59);
                            if (iIndexOf < 0) {
                                zM21157 = C9196.m21157(str);
                            } else if (C9196.m21157(str.substring(0, iIndexOf))) {
                                while (true) {
                                    if (iIndexOf >= 0) {
                                        int i = iIndexOf + 1;
                                        if (i < str.length()) {
                                            int iIndexOf2 = str.indexOf(61, i);
                                            if (iIndexOf2 >= 0) {
                                                String strSubstring = str.substring(i, iIndexOf2);
                                                if (strSubstring.indexOf(59) < 0 && strSubstring.indexOf(61) < 0 && C9196.m21157(strSubstring)) {
                                                    iIndexOf = str.indexOf(59, iIndexOf2 + 1);
                                                }
                                            }
                                            zM21157 = false;
                                        }
                                    }
                                    zM21157 = true;
                                }
                            } else {
                                zM21157 = false;
                            }
                            if (zM21157) {
                            }
                        }
                        throw new C8279();
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public static void m35579(InterfaceC22528 interfaceC22528) throws C13644 {
        if (interfaceC22528.mo31474()) {
            for (InterfaceC3751 interfaceC3751 : interfaceC22528.values()) {
                if (interfaceC3751.mo7247() == 0 && interfaceC3751.getValue() == 1) {
                    throw new C13644();
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m35563(C20635 c20635) throws C5276 {
        if (c20635.m46640()) {
            return;
        }
        Iterator itM46631 = C20635.m46631(c20635);
        while (itM46631.hasNext()) {
            m35572((C20635) itM46631.next());
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m35572(C20635 c20635) throws C5276 {
        if (!C9196.m21157(c20635.m46644())) {
            throw C5276.m11403(null, "UNSUPPORTED_STYLED_TEXT_XML", "Unsupported styled text tag name: " + c20635.m46644(), "warning");
        }
        for (C19964 c19964 : c20635.m46645()) {
            String strM45303 = c19964.m45303();
            String strM45304 = c19964.m45304();
            if (!C9196.m21157(strM45303) || strM45303.indexOf(61) >= 0 || strM45303.indexOf(59) >= 0) {
                throw C5276.m11403(null, "UNSUPPORTED_STYLED_TEXT_XML", "Unsupported styled text attribute name: ".concat(strM45303), "warning");
            }
            if (strM45304.indexOf(59) >= 0) {
                throw C5276.m11403(null, "UNSUPPORTED_STYLED_TEXT_XML", "Unsupported styled text attribute value.", "warning");
            }
        }
        Iterator itM46631 = C20635.m46631(c20635);
        while (itM46631.hasNext()) {
            m35572((C20635) itM46631.next());
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m35564(C20635 c20635, String str, boolean z, boolean z2) throws C5276 {
        if (z2) {
            return;
        }
        if (c20635.m46640()) {
            try {
                if ("@empty".equals(c20635.m46641().m5533()) && (!z || !Name.REFER.equals(c20635.m46644()))) {
                    throw m35576("@empty is supported only by root <reference>.");
                }
            } catch (C3870 e) {
                throw m35576(e.getMessage() == null ? "Invalid valueXml" : e.getMessage());
            }
        }
        boolean zM35567 = m35567(c20635, str, z);
        Iterator itM46631 = C20635.m46631(c20635);
        while (itM46631.hasNext()) {
            m35564((C20635) itM46631.next(), c20635.m46644(), false, zM35567);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ܳ */
    public static C20635 m35575(String str) throws C5276 {
        if (str.trim().isEmpty()) {
            throw m35576("valueXml must contain one XML element.");
        }
        String upperCase = str.toUpperCase(Locale.ROOT);
        if (str.contains("<?") || upperCase.contains("<!DOCTYPE")) {
            throw m35576("valueXml must not contain processing instructions or DTD.");
        }
        try {
            int i = C7223.f18850;
            C9196 c9196 = new C9196();
            c9196.m21166(new StringReader(str));
            C7223 c7223M16562 = C7223.m16562(c9196, true);
            if (c7223M16562.size() != 1) {
                throw m35576("valueXml must contain exactly one root element.");
            }
            return (C20635) c7223M16562.get(0);
        } catch (C5276 e) {
            throw e;
        } catch (Exception e2) {
            throw m35576(e2.getMessage() == null ? "Invalid valueXml" : e2.getMessage());
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m35573(C20635 c20635, String str, boolean z, boolean z2) throws C5276 {
        if (z2) {
            return;
        }
        for (C19964 c19964 : c20635.m46645()) {
            if ("parent".equals(c19964.m45303()) && c19964.m45304().startsWith("@")) {
                m35581(c19964.m45304().substring(1));
            } else if ("item".equals(c20635.m46644()) && "name".equals(c19964.m45303())) {
                m35581(c19964.m45304());
            } else if ("enum".equals(c20635.m46644()) || "flag".equals(c20635.m46644())) {
                if ("name".equals(c19964.m45303())) {
                    m35581(c19964.m45304());
                }
            }
        }
        if (c20635.m46640()) {
            try {
                String strM5533 = c20635.m46641().m5533();
                if (strM5533.startsWith("@") || strM5533.startsWith("?")) {
                    m35581(strM5533.substring(1));
                }
            } catch (C3870 e) {
                throw m35576(e.getMessage() == null ? "Invalid valueXml" : e.getMessage());
            }
        }
        boolean zM35567 = m35567(c20635, str, z);
        Iterator itM46631 = C20635.m46631(c20635);
        while (itM46631.hasNext()) {
            m35573((C20635) itM46631.next(), c20635.m46644(), false, zM35567);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m35567(C20635 c20635, String str, boolean z) {
        String strM46644 = c20635.m46644();
        if ("string".equals(strM46644) || MotionUtils.EASING_TYPE_PATH.equals(strM46644)) {
            return z || "array".equals(str) || "attr".equals(str) || "complex".equals(str) || "style".equals(str);
        }
        if ("item".equals(strM46644)) {
            return "string-array".equals(str) || "plurals".equals(str) || "style".equals(str);
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩻ */
    public static void m35581(String str) throws C5276 {
        if (!str.equals("null") && !str.equals(C0795b.f3347f) && m35578(str) == null && !str.startsWith("android:")) {
            throw C5276.m11403(null, "APP_NAME_REFERENCES_NOT_ACCEPTED", "APP resource name references are not accepted when resources.arsc is confused; use hex resource ids.", "warning");
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m35565(C23662 c23662, C20337 c20337, String str) throws C5276 {
        if ("style".equals(str)) {
            if (c20337.getParent() != 0 && !"style".equals(c23662.m52617(c20337.getParent()))) {
                throw m35576("style parent must resolve to a style resource.");
            }
            Iterator it = c20337.values().iterator();
            while (it.hasNext()) {
                String strM52617 = c23662.m52617(((InterfaceC3751) it.next()).mo7249());
                if (!"attr".equals(strM52617) && !"^attr-private".equals(strM52617)) {
                    throw m35576("style item name must resolve to an attr resource.");
                }
            }
        }
    }

    /* JADX INFO: renamed from: ܿ */
    public static Integer m35578(String str) {
        if (str.length() == 10 && str.regionMatches(true, 0, "0x", 0, 2)) {
            str = str.substring(2);
        }
        if (str.length() == 8 && C11774.m27005(str)) {
            return Integer.valueOf(C11774.m27008(str));
        }
        return null;
    }

    /* JADX INFO: renamed from: ܽ */
    public static C5276 m35576(String str) {
        return C5276.m11403(null, "INVALID_VALUE_XML", str, "warning");
    }

    /* JADX INFO: renamed from: ֫ */
    public static C5597 m35556(C23662 c23662, C21651 c21651, C6938 c6938, String str, String str2, C17666 c17666, HashMap map) throws C5276 {
        InterfaceC22528 interfaceC22528M54910;
        byte[] bArr = (byte[]) map.get(C10962.m25270(c21651.f68216, c21651.f68215));
        if (bArr == null) {
            interfaceC22528M54910 = c21651.f68214;
        } else {
            interfaceC22528M54910 = C25003.m54910(c21651.f68213, c21651.f68216 & 65535, bArr);
        }
        boolean z = true;
        if (!m35574(interfaceC22528M54910)) {
            C20635 c20635M35575 = m35575(c6938.f18051);
            String strMo31468 = interfaceC22528M54910.mo31468();
            if (!f44774.contains(c20635M35575.m46644())) {
                throw C5276.m11403(null, "UNSUPPORTED_VALUE_XML", "Unsupported valueXml root tag: " + c20635M35575.m46644(), "warning");
            }
            C19964 c19964M46637 = c20635M35575.m46637("name");
            if (c19964M46637 == null) {
                throw m35576("valueXml root must keep the original name attribute.");
            }
            if (!strMo31468.equals(c19964M46637.m45304())) {
                throw m35576("valueXml root name is read-only and must not change.");
            }
            Iterator it = c20635M35575.m46645().iterator();
            while (it.hasNext()) {
                String strM45303 = ((C19964) it.next()).m45303();
                if ("public".equals(strM45303) || "weak".equals(strM45303) || "compact".equals(strM45303)) {
                    throw C5276.m11403(null, "UNSUPPORTED_VALUE_XML", "valueXml does not support public, weak, or compact attributes.", "warning");
                }
            }
            String strM46644 = c20635M35575.m46644();
            strM46644.getClass();
            switch (strM46644) {
                case "string-array":
                    Iterator itM46631 = C20635.m46631(c20635M35575);
                    while (itM46631.hasNext()) {
                        m35563((C20635) itM46631.next());
                    }
                    break;
                case "string":
                case "path":
                    m35563(c20635M35575);
                    break;
                case "plurals":
                    Iterator itM46632 = C20635.m46632(c20635M35575, "item");
                    while (itM46632.hasNext()) {
                        m35563((C20635) itM46632.next());
                    }
                    break;
                case "attr":
                case "array":
                case "complex":
                    Iterator itM46633 = C20635.m46631(c20635M35575);
                    while (itM46633.hasNext()) {
                        C20635 c20635 = (C20635) itM46633.next();
                        if ("string".equals(c20635.m46644()) || MotionUtils.EASING_TYPE_PATH.equals(c20635.m46644())) {
                            m35563(c20635);
                        }
                    }
                    break;
                case "style":
                    Iterator itM46634 = C20635.m46631(c20635M35575);
                    while (itM46634.hasNext()) {
                        C20635 c20636 = (C20635) itM46634.next();
                        if ("item".equals(c20636.m46644())) {
                            m35563(c20636);
                        } else if ("string".equals(c20636.m46644()) || MotionUtils.EASING_TYPE_PATH.equals(c20636.m46644())) {
                            m35563(c20636);
                        }
                    }
                    break;
            }
            m35564(c20635M35575, (String) null, true, false);
            boolean zMo31467 = interfaceC22528M54910.mo31467();
            boolean zMo31473 = interfaceC22528M54910.mo31473();
            boolean zMo31470 = interfaceC22528M54910.mo31470();
            if (c17666.f52753) {
                m35573(c20635M35575, (String) null, true, false);
            }
            try {
                C20635 c20635M46634 = C20635.m46634("<resources>" + c6938.f18051 + "</resources>", true);
                HashMap map2 = new HashMap();
                map2.put(interfaceC22528M54910.mo31468(), Integer.valueOf(interfaceC22528M54910.mo50213()));
                C4914 c4914 = m35560(interfaceC22528M54910).f72419;
                C14314 c14314 = new C14314(c23662, c17666);
                c14314.m28192();
                try {
                    C13551.m30846(c20635M46634, c4914, c14314, map2, new C19586());
                    c14314.m28186();
                    C20337 c20337Mo4717 = c4914.mo4717(interfaceC22528M54910.mo50213());
                    if (c20337Mo4717 == null || c20337Mo4717.mo31471() == 0) {
                        throw new C3870("Resource entry was not encoded", c20635M46634);
                    }
                    c20337Mo4717.m45915(zMo31467);
                    c20337Mo4717.m45916(zMo31473);
                    if (!zMo31470 || c20337Mo4717.mo31474()) {
                        z = false;
                    }
                    c20337Mo4717.m45912(z);
                    m35565(c23662, c20337Mo4717, c20635M35575.m46644());
                    byte[] bArrM54912 = C25003.m54912(c20337Mo4717);
                    return new C5597(c6938.f18048, c6938.f18049, c6938.f18050, str2, C25003.m54909(bArrM54912), str, bArrM54912);
                } catch (Throwable th) {
                    c14314.m28186();
                    throw th;
                }
            } catch (C5276 e) {
                throw e;
            } catch (Exception e2) {
                throw C5276.m11403(null, "INVALID_VALUE_XML", e2.getMessage() == null ? "Invalid valueXml" : e2.getMessage(), "warning");
            }
        }
        C5276 c5276M11403 = C5276.m11403(null, "UNSUPPORTED_VALUE_XML", "Resource attr definitions are not supported by valueXml editing.", "warning");
        c5276M11403.f12412.put("_suppressResourceRetry", true);
        throw c5276M11403;
    }
}
