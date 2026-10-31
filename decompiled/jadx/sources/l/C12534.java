package l;

import android.content.res.Resources;
import android.util.TypedValue;
import com.umeng.analytics.pro.d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.simpleframework.xml.core.AnnotationHandler;
import org.simpleframework.xml.strategy.Name;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.۫ܽܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 45G7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12534 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final String[] f37656 = {"px", "dp", "sp", "pt", "in", "mm"};

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final String[] f37657 = {"%", "%p"};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean f37658;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC9922 f37659;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public volatile C17515 f37660;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean f37661;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public HashMap f37662;

    public C12534() {
        this.f37662 = new HashMap();
        this.f37659 = null;
        this.f37658 = false;
        this.f37661 = false;
    }

    public C12534(AbstractC15440 abstractC15440) {
        this(0, new C23326(abstractC15440));
    }

    public C12534(int i, InterfaceC9922 interfaceC9922) {
        boolean z;
        this.f37662 = new HashMap();
        this.f37659 = interfaceC9922;
        if (interfaceC9922 == null) {
            z = false;
        } else {
            HashSet hashSet = new HashSet();
            HashSet hashSet2 = new HashSet();
            Iterator it = interfaceC9922.mo21936().iterator();
            while (true) {
                if (it.hasNext()) {
                    InterfaceC4277 interfaceC4277 = (InterfaceC4277) it.next();
                    if (!interfaceC4277.getPackageName().equals("bin.mt.plus.TranslationData")) {
                        hashSet.clear();
                        Iterator it2 = interfaceC4277.mo12850().iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                InterfaceC0748 interfaceC0748 = (InterfaceC0748) it2.next();
                                if (hashSet.add(interfaceC0748.getTypeName())) {
                                    hashSet2.clear();
                                    if (interfaceC0748.mo2868(new C20296(hashSet2)) != null) {
                                    }
                                }
                                z = true;
                            } else {
                                continue;
                            }
                        }
                    }
                } else {
                    z = false;
                }
            }
        }
        this.f37658 = z;
        if (interfaceC9922 instanceof C23326) {
            ((C23326) interfaceC9922).m51731();
        } else if (interfaceC9922 instanceof C5191) {
            ((C5191) interfaceC9922).m14958();
        }
        this.f37661 = m30761(interfaceC9922);
    }

    public C12534(InterfaceC9922 interfaceC9922, C17515 c17515) {
        this(0, interfaceC9922);
        this.f37660 = c17515;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C12534(C18090 c18090) {
        C3545 entry;
        try {
            entry = c18090.getEntry("resources.arsc");
        } catch (Exception unused) {
        }
        this(0, entry != null ? new C23326(c18090.m42189(entry)) : null);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C17515 m30773() {
        if (this.f37660 == null) {
            synchronized (this) {
                if (this.f37660 == null) {
                    this.f37660 = new C17515(this.f37659);
                }
            }
        }
        return this.f37660;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC9922 m30769() {
        return this.f37659;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList m30768(String str) {
        InterfaceC9922 interfaceC9922;
        ArrayList arrayList = new ArrayList();
        C13239 c13239M30764 = m30764(str);
        int i = c13239M30764.f39632;
        String str2 = c13239M30764.f39631;
        int iIndexOf = str2.indexOf(47);
        if (iIndexOf != -1) {
            String strSubstring = str2.substring(0, iIndexOf);
            String strSubstring2 = str2.substring(iIndexOf + 1);
            if (!strSubstring.isEmpty() && !strSubstring2.isEmpty() && strSubstring2.indexOf(47) == -1) {
                if (!this.f37661 && i == 1) {
                    m30760(arrayList, C11166.m27700(), 1, strSubstring, strSubstring2);
                }
                if (arrayList.isEmpty() && (interfaceC9922 = this.f37659) != null) {
                    m30760(arrayList, interfaceC9922, i, strSubstring, strSubstring2);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m30760(ArrayList arrayList, InterfaceC9922 interfaceC9922, int i, String str, String str2) {
        for (InterfaceC4277 interfaceC4277 : interfaceC9922.mo21936()) {
            if (interfaceC4277.mo12858() == i) {
                for (InterfaceC0748 interfaceC0748 : interfaceC4277.mo12850()) {
                    if (interfaceC0748.getTypeName().equals(str)) {
                        int iMo2867 = interfaceC0748.mo2867(new C4773(str2));
                        if (iMo2867 != -1) {
                            for (InterfaceC7099 interfaceC7099 : interfaceC0748.mo2876()) {
                                if (interfaceC7099.mo2347(iMo2867)) {
                                    arrayList.add(interfaceC7099.mo2346(iMo2867));
                                }
                            }
                            return;
                        }
                        return;
                    }
                }
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList m30767(int i) {
        InterfaceC9922 interfaceC9922;
        int i2 = (i >>> 24) & 255;
        int i3 = (i >>> 16) & 255;
        int i4 = i & 65535;
        ArrayList arrayList = new ArrayList();
        if (!this.f37661 && i2 == 1) {
            m30759(arrayList, C11166.m27700(), 1, i3, i4, true);
        }
        if (arrayList.isEmpty() && (interfaceC9922 = this.f37659) != null) {
            m30759(arrayList, interfaceC9922, i2, i3, i4, true);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m30759(ArrayList arrayList, InterfaceC9922 interfaceC9922, int i, int i2, int i3, boolean z) {
        InterfaceC21211 interfaceC21211Mo2346;
        for (InterfaceC4277 interfaceC4277 : interfaceC9922.mo21936()) {
            if (interfaceC4277.mo12858() == i) {
                for (InterfaceC0748 interfaceC0748 : interfaceC4277.mo12850()) {
                    if (interfaceC0748.mo2870() == i2) {
                        for (InterfaceC7099 interfaceC7099 : z ? interfaceC0748.mo2876() : interfaceC0748.mo2872()) {
                            if (interfaceC7099.mo2347(i3) && (interfaceC21211Mo2346 = interfaceC7099.mo2346(i3)) != null) {
                                arrayList.add(interfaceC21211Mo2346);
                            }
                        }
                        return;
                    }
                }
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30770(int i, TypedValue typedValue, boolean z) {
        int i2 = (i >>> 24) & 255;
        if (i2 == 1) {
            C4925.m14338().getValue(i, typedValue, z);
            return;
        }
        if (this.f37659 == null) {
            throw new Resources.NotFoundException(String.format("id: %08x", Integer.valueOf(i)));
        }
        ArrayList<InterfaceC21211> arrayList = new ArrayList();
        m30759(arrayList, this.f37659, i2, (i >>> 16) & 255, i & 65535, false);
        if (arrayList.isEmpty()) {
            throw new Resources.NotFoundException(String.format("id: %08x", Integer.valueOf(i)));
        }
        C21707 c21707M48998 = C21707.m48998(C4925.m14338());
        InterfaceC21211 interfaceC21211 = null;
        for (InterfaceC21211 interfaceC21212 : arrayList) {
            if (!interfaceC21212.mo29412() && interfaceC21212.mo29410().mo18743().m49026(c21707M48998) && (interfaceC21211 == null || interfaceC21212.mo29410().mo18743().m49023(interfaceC21211.mo29410().mo18743(), c21707M48998))) {
                interfaceC21211 = interfaceC21212;
            }
        }
        if (interfaceC21211 == null) {
            throw new Resources.NotFoundException(String.format("id: %08x", Integer.valueOf(i)));
        }
        InterfaceC1454 value = interfaceC21211.getValue();
        typedValue.data = value.getValue();
        typedValue.type = value.mo5004();
        typedValue.resourceId = value.mo5006();
        if (typedValue.type == 3) {
            typedValue.string = value.mo5008().getValue();
        } else {
            typedValue.string = null;
        }
        if (z) {
            for (int i3 = 0; i3 < 20 && typedValue.type == 1; i3++) {
                m30770(typedValue.data, typedValue, false);
            }
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m30775() {
        return this.f37658;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m30771(String str) {
        Integer num;
        InterfaceC9922 interfaceC9922;
        C13239 c13239M30764 = m30764(str);
        int i = c13239M30764.f39632;
        String str2 = c13239M30764.f39631;
        int iIndexOf = str2.indexOf(47);
        if (iIndexOf == -1) {
            return -1;
        }
        String strSubstring = str2.substring(0, iIndexOf);
        String strSubstring2 = str2.substring(iIndexOf + 1);
        if (strSubstring.isEmpty() || strSubstring2.isEmpty() || strSubstring2.indexOf(47) != -1) {
            return -1;
        }
        int iM30755 = (this.f37661 || i != 1) ? -1 : m30755(C11166.m27700(), 1, strSubstring, strSubstring2);
        if (iM30755 == -1 && (interfaceC9922 = this.f37659) != null && !this.f37658) {
            iM30755 = m30755(interfaceC9922, i, strSubstring, strSubstring2);
        }
        return (iM30755 != -1 || (num = (Integer) this.f37662.get(str)) == null) ? iM30755 : num.intValue();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m30755(InterfaceC9922 interfaceC9922, int i, String str, String str2) {
        for (InterfaceC4277 interfaceC4277 : interfaceC9922.mo21936()) {
            if (i == -1 || interfaceC4277.mo12858() == i) {
                for (InterfaceC0748 interfaceC0748 : interfaceC4277.mo12850()) {
                    if (interfaceC0748.getTypeName().equals(str)) {
                        int iMo2867 = interfaceC0748.mo2867(new C3362(0, str2));
                        if (iMo2867 == -1) {
                            break;
                        }
                        return (interfaceC4277.mo12858() << 24) | (interfaceC0748.mo2870() << 16) | iMo2867;
                    }
                }
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static String m30763(int i) {
        switch (i) {
            case 0:
                return "null";
            case 1:
                return Name.REFER;
            case 2:
                return AnnotationHandler.ATTRIBUTE;
            case 3:
                return "string";
            case 4:
                return ClassTransform.FLOAT;
            case 5:
                return "dimension";
            case 6:
                return "fraction";
            case 7:
                return "dynamic-reference";
            case 8:
                return "dynamic-attribute";
            default:
                switch (i) {
                    case 16:
                        return "int-dec";
                    case 17:
                        return "int-hex";
                    case 18:
                        return ClassTransform.BOOLEAN;
                    default:
                        switch (i) {
                            case 28:
                                return "color-argb8";
                            case 29:
                                return "color-rgb8";
                            case 30:
                                return "color-argb4";
                            case 31:
                                return "color-rgb4";
                            default:
                                return String.format("unknown-type-%02x", Integer.valueOf(i));
                        }
                }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m30766(InterfaceC1454 interfaceC1454) {
        int iMo5004 = interfaceC1454.mo5004();
        int value = interfaceC1454.getValue();
        if (iMo5004 == 17) {
            return C13540.m32584(new StringBuilder("0x"), value);
        }
        if (iMo5004 == 18) {
            return value != 0 ? "true" : "false";
        }
        switch (iMo5004) {
            case 0:
                return "null";
            case 1:
                return "@".concat(m30776(value));
            case 2:
                return "?".concat(m30776(value));
            case 3:
                String value2 = interfaceC1454.mo5008().getValue();
                return value2.length() > 100 ? value2.substring(0, 97).replaceFirst("[\\s]{0,6}$", "...") : value2;
            case 4:
                return Float.toString(Float.intBitsToFloat(value));
            case 5:
                return m30765(value);
            case 6:
                return m30762(value);
            default:
                if (iMo5004 < 28 || iMo5004 > 31) {
                    return (iMo5004 < 16 || iMo5004 > 31) ? d.O : Integer.toString(value);
                }
                return String.format("#%08x", Integer.valueOf(value));
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m30772(int i) {
        String strM30756 = m30756(i, this.f37659);
        return strM30756 != null ? strM30756 : String.format("%08x", Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String m30774(int i) {
        return m30756(i, this.f37659);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String m30776(int i) {
        int i2 = 65535 & i;
        int i3 = (i >> 16) & 255;
        int i4 = (i >> 24) & 255;
        boolean z = this.f37658;
        InterfaceC9922 interfaceC9922 = this.f37659;
        String strM30758 = null;
        String strM30759 = z ? null : m30758(interfaceC9922, i4, i3, i2, true);
        if (strM30759 != null) {
            strM30758 = strM30759;
        } else if (!m30761(interfaceC9922)) {
            strM30758 = m30758((InterfaceC9922) C11166.m27700(), i4, i3, i2, false);
        }
        return strM30758 != null ? strM30758 : String.format("%08x", Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m30756(int i, InterfaceC9922 interfaceC9922) {
        int i2 = 65535 & i;
        int i3 = (i >> 16) & 255;
        int i4 = (i >> 24) & 255;
        String strM30757 = m30757(interfaceC9922, i4, i3, i2);
        if (strM30757 != null) {
            return strM30757;
        }
        if (m30761(interfaceC9922)) {
            return null;
        }
        return m30757(C11166.m27700(), i4, i3, i2);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String m30777(int i) {
        int i2 = 65535 & i;
        int i3 = (i >> 16) & 255;
        int i4 = (i >> 24) & 255;
        InterfaceC9922 interfaceC9922 = this.f37659;
        String strM30757 = m30757(interfaceC9922, i4, i3, i2);
        if (strM30757 == null && !m30761(interfaceC9922)) {
            strM30757 = m30757(C11166.m27700(), i4, i3, i2);
        }
        return strM30757 != null ? String.format("%s(%08x)", strM30757, Integer.valueOf(i)) : String.format("%08x", Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m30757(InterfaceC9922 interfaceC9922, int i, int i2, int i3) {
        if (interfaceC9922 == null) {
            return null;
        }
        for (InterfaceC4277 interfaceC4277 : interfaceC9922.mo21936()) {
            if (interfaceC4277.mo12858() == i) {
                for (InterfaceC0748 interfaceC0748 : interfaceC4277.mo12850()) {
                    if (interfaceC0748.mo2870() == i2) {
                        Iterator it = interfaceC0748.mo2872().iterator();
                        while (it.hasNext()) {
                            InterfaceC21211 interfaceC21211Mo2346 = ((InterfaceC7099) it.next()).mo2346(i3);
                            if (interfaceC21211Mo2346 != null) {
                                StringBuilder sb = new StringBuilder();
                                sb.append(i == 1 ? "android:" : i != 127 ? String.format("app%02x:", Integer.valueOf(i)) : "");
                                sb.append(interfaceC21211Mo2346.mo29406());
                                return sb.toString();
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m30758(InterfaceC9922 interfaceC9922, int i, int i2, int i3, boolean z) {
        if (interfaceC9922 == null) {
            return null;
        }
        for (InterfaceC4277 interfaceC4277 : interfaceC9922.mo21936()) {
            if (interfaceC4277.mo12858() == i) {
                for (InterfaceC0748 interfaceC0748 : interfaceC4277.mo12850()) {
                    if (interfaceC0748.mo2870() == i2) {
                        Iterator it = interfaceC0748.mo2872().iterator();
                        while (it.hasNext()) {
                            InterfaceC21211 interfaceC21211Mo2346 = ((InterfaceC7099) it.next()).mo2346(i3);
                            if (interfaceC21211Mo2346 != null && (z || interfaceC21211Mo2346.mo29405())) {
                                StringBuilder sb = new StringBuilder();
                                sb.append(i == 1 ? "android:" : i != 127 ? String.format("app%02x:", Integer.valueOf(i)) : "");
                                sb.append(interfaceC0748.getTypeName());
                                sb.append("/");
                                sb.append(interfaceC21211Mo2346.mo29406());
                                return sb.toString();
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m30761(InterfaceC9922 interfaceC9922) {
        if (interfaceC9922 == null) {
            return false;
        }
        for (InterfaceC4277 interfaceC4277 : interfaceC9922.mo21936()) {
            if (interfaceC4277.mo12858() == 1) {
                InterfaceC0748 type = interfaceC4277.getType("attr");
                InterfaceC0748 type2 = interfaceC4277.getType("id");
                return type != null && type.mo2878() > 50 && type2 != null && type2.mo2878() > 50;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static String m30765(int i) {
        return TypedValue.complexToFloat(i) + f37656[i & 15];
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static String m30762(int i) {
        return (TypedValue.complexToFloat(i) * 100.0f) + f37657[i & 15];
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static C13239 m30764(String str) {
        String[] strArrSplit = str.split(":", 2);
        if (strArrSplit.length == 2) {
            if (strArrSplit[0].equals("android")) {
                return new C13239(1, strArrSplit[1]);
            }
            if (strArrSplit[0].startsWith("app") && strArrSplit[0].length() == 5) {
                String strSubstring = strArrSplit[0].substring(3);
                if (C9896.m24990(strSubstring)) {
                    return new C13239(Integer.parseInt(strSubstring, 16), strArrSplit[1]);
                }
            }
        }
        return new C13239(127, str);
    }
}
