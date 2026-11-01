package p067l;

import android.content.res.Resources;
import android.util.TypedValue;
import com.umeng.analytics.pro.C0708d;
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
public final class C14281 {

    /* JADX INFO: renamed from: ܳ */
    public static final String[] f40680 = {"px", "dp", "sp", "pt", "in", "mm"};

    /* JADX INFO: renamed from: ᩻ */
    public static final String[] f40681 = {"%", "%p"};

    /* JADX INFO: renamed from: ֫ */
    public final boolean f40682;

    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC11799 f40683;

    /* JADX INFO: renamed from: ܽ */
    public volatile C19015 f40684;

    /* JADX INFO: renamed from: ܿ */
    public final boolean f40685;

    /* JADX INFO: renamed from: ᩳ */
    public HashMap f40686;

    public C14281() {
        this.f40686 = new HashMap();
        this.f40683 = null;
        this.f40682 = false;
        this.f40685 = false;
    }

    public C14281(AbstractC17043 abstractC17043) {
        this(0, new C24538(abstractC17043));
    }

    public C14281(int i, InterfaceC11799 interfaceC11799) {
        boolean z;
        this.f40686 = new HashMap();
        this.f40683 = interfaceC11799;
        if (interfaceC11799 == null) {
            z = false;
        } else {
            HashSet hashSet = new HashSet();
            HashSet hashSet2 = new HashSet();
            Iterator it = interfaceC11799.mo23906().iterator();
            while (true) {
                if (it.hasNext()) {
                    InterfaceC6434 interfaceC6434 = (InterfaceC6434) it.next();
                    if (!interfaceC6434.getPackageName().equals("bin.mt.plus.TranslationData")) {
                        hashSet.clear();
                        Iterator it2 = interfaceC6434.mo14714().iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                InterfaceC3080 interfaceC3080 = (InterfaceC3080) it2.next();
                                if (hashSet.add(interfaceC3080.getTypeName())) {
                                    hashSet2.clear();
                                    if (interfaceC3080.mo5197(new C21658(hashSet2)) != null) {
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
        this.f40682 = z;
        if (interfaceC11799 instanceof C24538) {
            ((C24538) interfaceC11799).m54128();
        } else if (interfaceC11799 instanceof C7302) {
            ((C7302) interfaceC11799).m16868();
        }
        this.f40685 = m32833(interfaceC11799);
    }

    public C14281(InterfaceC11799 interfaceC11799, C19015 c19015) {
        this(0, interfaceC11799);
        this.f40684 = c19015;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C14281(C19561 c19561) {
        C5738 entry;
        try {
            entry = c19561.getEntry("resources.arsc");
        } catch (Exception unused) {
        }
        this(0, entry != null ? new C24538(c19561.m44448(entry)) : null);
    }

    /* JADX INFO: renamed from: ۧ */
    public final C19015 m32845() {
        if (this.f40684 == null) {
            synchronized (this) {
                if (this.f40684 == null) {
                    this.f40684 = new C19015(this.f40683);
                }
            }
        }
        return this.f40684;
    }

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC11799 m32841() {
        return this.f40683;
    }

    /* JADX INFO: renamed from: ֫ */
    public final ArrayList m32840(String str) {
        InterfaceC11799 interfaceC11799;
        ArrayList arrayList = new ArrayList();
        C14951 c14951M32836 = m32836(str);
        int i = c14951M32836.f42696;
        String str2 = c14951M32836.f42695;
        int iIndexOf = str2.indexOf(47);
        if (iIndexOf != -1) {
            String strSubstring = str2.substring(0, iIndexOf);
            String strSubstring2 = str2.substring(iIndexOf + 1);
            if (!strSubstring.isEmpty() && !strSubstring2.isEmpty() && strSubstring2.indexOf(47) == -1) {
                if (!this.f40685 && i == 1) {
                    m32832(arrayList, C12981.m29762(), 1, strSubstring, strSubstring2);
                }
                if (arrayList.isEmpty() && (interfaceC11799 = this.f40683) != null) {
                    m32832(arrayList, interfaceC11799, i, strSubstring, strSubstring2);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m32832(ArrayList arrayList, InterfaceC11799 interfaceC11799, int i, String str, String str2) {
        for (InterfaceC6434 interfaceC6434 : interfaceC11799.mo23906()) {
            if (interfaceC6434.mo14722() == i) {
                for (InterfaceC3080 interfaceC3080 : interfaceC6434.mo14714()) {
                    if (interfaceC3080.getTypeName().equals(str)) {
                        int iMo5196 = interfaceC3080.mo5196(new C6905(str2));
                        if (iMo5196 != -1) {
                            for (InterfaceC9116 interfaceC9116 : interfaceC3080.mo5205()) {
                                if (interfaceC9116.mo4718(iMo5196)) {
                                    arrayList.add(interfaceC9116.mo4717(iMo5196));
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

    /* JADX INFO: renamed from: ֫ */
    public final ArrayList m32839(int i) {
        InterfaceC11799 interfaceC11799;
        int i2 = (i >>> 24) & 255;
        int i3 = (i >>> 16) & 255;
        int i4 = i & 65535;
        ArrayList arrayList = new ArrayList();
        if (!this.f40685 && i2 == 1) {
            m32831(arrayList, C12981.m29762(), 1, i3, i4, true);
        }
        if (arrayList.isEmpty() && (interfaceC11799 = this.f40683) != null) {
            m32831(arrayList, interfaceC11799, i2, i3, i4, true);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m32831(ArrayList arrayList, InterfaceC11799 interfaceC11799, int i, int i2, int i3, boolean z) {
        InterfaceC22528 interfaceC22528Mo4717;
        for (InterfaceC6434 interfaceC6434 : interfaceC11799.mo23906()) {
            if (interfaceC6434.mo14722() == i) {
                for (InterfaceC3080 interfaceC3080 : interfaceC6434.mo14714()) {
                    if (interfaceC3080.mo5199() == i2) {
                        for (InterfaceC9116 interfaceC9116 : z ? interfaceC3080.mo5205() : interfaceC3080.mo5201()) {
                            if (interfaceC9116.mo4718(i3) && (interfaceC22528Mo4717 = interfaceC9116.mo4717(i3)) != null) {
                                arrayList.add(interfaceC22528Mo4717);
                            }
                        }
                        return;
                    }
                }
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m32842(int i, TypedValue typedValue, boolean z) {
        int i2 = (i >>> 24) & 255;
        if (i2 == 1) {
            C7050.m16235().getValue(i, typedValue, z);
            return;
        }
        if (this.f40683 == null) {
            throw new Resources.NotFoundException(String.format("id: %08x", Integer.valueOf(i)));
        }
        ArrayList<InterfaceC22528> arrayList = new ArrayList();
        m32831(arrayList, this.f40683, i2, (i >>> 16) & 255, i & 65535, false);
        if (arrayList.isEmpty()) {
            throw new Resources.NotFoundException(String.format("id: %08x", Integer.valueOf(i)));
        }
        C22999 c22999M51347 = C22999.m51347(C7050.m16235());
        InterfaceC22528 interfaceC22528 = null;
        for (InterfaceC22528 interfaceC22529 : arrayList) {
            if (!interfaceC22529.mo31474() && interfaceC22529.mo31472().mo20693().m51375(c22999M51347) && (interfaceC22528 == null || interfaceC22529.mo31472().mo20693().m51372(interfaceC22528.mo31472().mo20693(), c22999M51347))) {
                interfaceC22528 = interfaceC22529;
            }
        }
        if (interfaceC22528 == null) {
            throw new Resources.NotFoundException(String.format("id: %08x", Integer.valueOf(i)));
        }
        InterfaceC3751 value = interfaceC22528.getValue();
        typedValue.data = value.getValue();
        typedValue.type = value.mo7247();
        typedValue.resourceId = value.mo7249();
        if (typedValue.type == 3) {
            typedValue.string = value.mo7251().getValue();
        } else {
            typedValue.string = null;
        }
        if (z) {
            for (int i3 = 0; i3 < 20 && typedValue.type == 1; i3++) {
                m32842(typedValue.data, typedValue, false);
            }
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m32847() {
        return this.f40682;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m32843(String str) {
        Integer num;
        InterfaceC11799 interfaceC11799;
        C14951 c14951M32836 = m32836(str);
        int i = c14951M32836.f42696;
        String str2 = c14951M32836.f42695;
        int iIndexOf = str2.indexOf(47);
        if (iIndexOf == -1) {
            return -1;
        }
        String strSubstring = str2.substring(0, iIndexOf);
        String strSubstring2 = str2.substring(iIndexOf + 1);
        if (strSubstring.isEmpty() || strSubstring2.isEmpty() || strSubstring2.indexOf(47) != -1) {
            return -1;
        }
        int iM32827 = (this.f40685 || i != 1) ? -1 : m32827(C12981.m29762(), 1, strSubstring, strSubstring2);
        if (iM32827 == -1 && (interfaceC11799 = this.f40683) != null && !this.f40682) {
            iM32827 = m32827(interfaceC11799, i, strSubstring, strSubstring2);
        }
        return (iM32827 != -1 || (num = (Integer) this.f40686.get(str)) == null) ? iM32827 : num.intValue();
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m32827(InterfaceC11799 interfaceC11799, int i, String str, String str2) {
        for (InterfaceC6434 interfaceC6434 : interfaceC11799.mo23906()) {
            if (i == -1 || interfaceC6434.mo14722() == i) {
                for (InterfaceC3080 interfaceC3080 : interfaceC6434.mo14714()) {
                    if (interfaceC3080.getTypeName().equals(str)) {
                        int iMo5196 = interfaceC3080.mo5196(new C5564(0, str2));
                        if (iMo5196 == -1) {
                            break;
                        }
                        return (interfaceC6434.mo14722() << 24) | (interfaceC3080.mo5199() << 16) | iMo5196;
                    }
                }
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ܳ */
    public static String m32835(int i) {
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

    /* JADX INFO: renamed from: ֫ */
    public final String m32838(InterfaceC3751 interfaceC3751) {
        int iMo7247 = interfaceC3751.mo7247();
        int value = interfaceC3751.getValue();
        if (iMo7247 == 17) {
            return C1514.m34687(new StringBuilder("0x"), value);
        }
        if (iMo7247 == 18) {
            return value != 0 ? "true" : "false";
        }
        switch (iMo7247) {
            case 0:
                return "null";
            case 1:
                return "@".concat(m32848(value));
            case 2:
                return "?".concat(m32848(value));
            case 3:
                String value2 = interfaceC3751.mo7251().getValue();
                return value2.length() > 100 ? value2.substring(0, 97).replaceFirst("[\\s]{0,6}$", "...") : value2;
            case 4:
                return Float.toString(Float.intBitsToFloat(value));
            case 5:
                return m32837(value);
            case 6:
                return m32834(value);
            default:
                if (iMo7247 < 28 || iMo7247 > 31) {
                    return (iMo7247 < 16 || iMo7247 > 31) ? C0708d.f2599O : Integer.toString(value);
                }
                return String.format("#%08x", Integer.valueOf(value));
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final String m32844(int i) {
        String strM32828 = m32828(i, this.f40683);
        return strM32828 != null ? strM32828 : String.format("%08x", Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: ܽ */
    public final String m32846(int i) {
        return m32828(i, this.f40683);
    }

    /* JADX INFO: renamed from: ܿ */
    public final String m32848(int i) {
        int i2 = 65535 & i;
        int i3 = (i >> 16) & 255;
        int i4 = (i >> 24) & 255;
        boolean z = this.f40682;
        InterfaceC11799 interfaceC11799 = this.f40683;
        String strM32830 = null;
        String strM32831 = z ? null : m32830(interfaceC11799, i4, i3, i2, true);
        if (strM32831 != null) {
            strM32830 = strM32831;
        } else if (!m32833(interfaceC11799)) {
            strM32830 = m32830((InterfaceC11799) C12981.m29762(), i4, i3, i2, false);
        }
        return strM32830 != null ? strM32830 : String.format("%08x", Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m32828(int i, InterfaceC11799 interfaceC11799) {
        int i2 = 65535 & i;
        int i3 = (i >> 16) & 255;
        int i4 = (i >> 24) & 255;
        String strM32829 = m32829(interfaceC11799, i4, i3, i2);
        if (strM32829 != null) {
            return strM32829;
        }
        if (m32833(interfaceC11799)) {
            return null;
        }
        return m32829(C12981.m29762(), i4, i3, i2);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final String m32849(int i) {
        int i2 = 65535 & i;
        int i3 = (i >> 16) & 255;
        int i4 = (i >> 24) & 255;
        InterfaceC11799 interfaceC11799 = this.f40683;
        String strM32829 = m32829(interfaceC11799, i4, i3, i2);
        if (strM32829 == null && !m32833(interfaceC11799)) {
            strM32829 = m32829(C12981.m29762(), i4, i3, i2);
        }
        return strM32829 != null ? String.format("%s(%08x)", strM32829, Integer.valueOf(i)) : String.format("%08x", Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m32829(InterfaceC11799 interfaceC11799, int i, int i2, int i3) {
        if (interfaceC11799 == null) {
            return null;
        }
        for (InterfaceC6434 interfaceC6434 : interfaceC11799.mo23906()) {
            if (interfaceC6434.mo14722() == i) {
                for (InterfaceC3080 interfaceC3080 : interfaceC6434.mo14714()) {
                    if (interfaceC3080.mo5199() == i2) {
                        Iterator it = interfaceC3080.mo5201().iterator();
                        while (it.hasNext()) {
                            InterfaceC22528 interfaceC22528Mo4717 = ((InterfaceC9116) it.next()).mo4717(i3);
                            if (interfaceC22528Mo4717 != null) {
                                StringBuilder sb = new StringBuilder();
                                sb.append(i == 1 ? "android:" : i != 127 ? String.format("app%02x:", Integer.valueOf(i)) : "");
                                sb.append(interfaceC22528Mo4717.mo31468());
                                return sb.toString();
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m32830(InterfaceC11799 interfaceC11799, int i, int i2, int i3, boolean z) {
        if (interfaceC11799 == null) {
            return null;
        }
        for (InterfaceC6434 interfaceC6434 : interfaceC11799.mo23906()) {
            if (interfaceC6434.mo14722() == i) {
                for (InterfaceC3080 interfaceC3080 : interfaceC6434.mo14714()) {
                    if (interfaceC3080.mo5199() == i2) {
                        Iterator it = interfaceC3080.mo5201().iterator();
                        while (it.hasNext()) {
                            InterfaceC22528 interfaceC22528Mo4717 = ((InterfaceC9116) it.next()).mo4717(i3);
                            if (interfaceC22528Mo4717 != null && (z || interfaceC22528Mo4717.mo31467())) {
                                StringBuilder sb = new StringBuilder();
                                sb.append(i == 1 ? "android:" : i != 127 ? String.format("app%02x:", Integer.valueOf(i)) : "");
                                sb.append(interfaceC3080.getTypeName());
                                sb.append("/");
                                sb.append(interfaceC22528Mo4717.mo31468());
                                return sb.toString();
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m32833(InterfaceC11799 interfaceC11799) {
        if (interfaceC11799 == null) {
            return false;
        }
        for (InterfaceC6434 interfaceC6434 : interfaceC11799.mo23906()) {
            if (interfaceC6434.mo14722() == 1) {
                InterfaceC3080 type = interfaceC6434.getType("attr");
                InterfaceC3080 type2 = interfaceC6434.getType("id");
                return type != null && type.mo5207() > 50 && type2 != null && type2.mo5207() > 50;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩻ */
    public static String m32837(int i) {
        return TypedValue.complexToFloat(i) + f40680[i & 15];
    }

    /* JADX INFO: renamed from: ۜ */
    public static String m32834(int i) {
        return (TypedValue.complexToFloat(i) * 100.0f) + f40681[i & 15];
    }

    /* JADX INFO: renamed from: ܽ */
    public static C14951 m32836(String str) {
        String[] strArrSplit = str.split(":", 2);
        if (strArrSplit.length == 2) {
            if (strArrSplit[0].equals("android")) {
                return new C14951(1, strArrSplit[1]);
            }
            if (strArrSplit[0].startsWith("app") && strArrSplit[0].length() == 5) {
                String strSubstring = strArrSplit[0].substring(3);
                if (C11774.m27005(strSubstring)) {
                    return new C14951(Integer.parseInt(strSubstring, 16), strArrSplit[1]);
                }
            }
        }
        return new C14951(127, str);
    }
}
