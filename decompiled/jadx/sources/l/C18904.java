package l;

import bin.mt.plus.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* JADX INFO: renamed from: l.ᩴܿܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D6KJ */
/* JADX INFO: loaded from: classes4.dex */
public final class C18904 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final List f59572;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f59573;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f59574;

    public C18904(String str, String str2, String str3, String str4) {
        this.f59574 = str;
        String strM43633 = m43633(str2);
        this.f59573 = strM43633;
        String strM43634 = m43634(str3);
        if (!strM43633.startsWith(strM43634)) {
            throw new IllegalArgumentException("HTML document is outside the root boundary");
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C4087(strM43634, str4));
        int length = strM43634.length();
        while (true) {
            int iIndexOf = this.f59573.indexOf(47, length);
            if (iIndexOf >= 0) {
                int i = iIndexOf + 1;
                arrayList.add(new C4087(this.f59573.substring(0, i), this.f59573.substring(length, iIndexOf)));
                length = i;
            } else {
                this.f59572 = C20195.unmodifiableList(arrayList);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C18904 m43631(C16560 c16560, InterfaceC17889 interfaceC17889) {
        int iIndexOf;
        AbstractC16891 abstractC16891M39044 = c16560.m39044();
        AbstractC13921 abstractC13921Mo6020 = abstractC16891M39044.mo6020();
        if (abstractC13921Mo6020 instanceof C2499) {
            return m43632(interfaceC17889.getPath());
        }
        String strSubstring = "/";
        if (!(abstractC13921Mo6020 instanceof AbstractC3163)) {
            String strM43627 = m43627(abstractC13921Mo6020);
            if (strM43627 != null) {
                return new C18904(m43628(abstractC16891M39044, m43629(c16560.m39016()), new ArrayList()), interfaceC17889.getPath(), "/", C16999.m39866(strM43627, new String[0]).getName());
            }
            throw new IllegalArgumentException("Unsupported HTML preview source");
        }
        AbstractC3163 abstractC3163 = (AbstractC3163) abstractC13921Mo6020;
        String path = interfaceC17889.getPath();
        String name = abstractC3163.m9690().getName();
        if ((abstractC3163 instanceof C12771) && (iIndexOf = path.indexOf(47, 1)) > 1) {
            strSubstring = path.substring(0, iIndexOf + 1);
            StringBuilder sbM19190 = C7166.m19190(name, " / ");
            sbM19190.append(path.substring(1, iIndexOf));
            name = sbM19190.toString();
        }
        return new C18904(m43626(abstractC3163.m9690()), path, strSubstring, name);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static C18904 m43632(String str) {
        String name;
        String strMo23554;
        String strM39885 = C16999.m39885(m43633(str));
        String strM14327 = C4925.m14327(R.string.MT_Protector);
        if (C16999.m39887(strM39885)) {
            strMo23554 = C16293.f50120.mo23554();
            name = C4925.m14327(R.string.MT_Protector);
        } else {
            AbstractC15440 abstractC15440M39866 = C16999.m39866(strM39885, new String[0]);
            if (abstractC15440M39866.mo23126()) {
                C4027 c4027M23116 = abstractC15440M39866.mo23124().m23116();
                name = c4027M23116.m12120();
                strM14327 = c4027M23116.f12781;
                if (strM14327 == null) {
                    strMo23554 = name;
                } else {
                    String str2 = name;
                    name = strM14327;
                    strMo23554 = str2;
                }
            } else {
                C4216 c4216M45449 = C19739.m45449(strM39885);
                if (c4216M45449 != null) {
                    File file = c4216M45449.f13687;
                    String path = file.getPath();
                    name = c4216M45449.f13686;
                    if (name == null) {
                        name = file.getName();
                    }
                    strMo23554 = path;
                } else {
                    name = "/";
                    String str3 = name;
                    name = strM14327;
                    strMo23554 = str3;
                }
            }
        }
        return new C18904("local", strM39885, strMo23554, name);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m43626(AbstractC3577 abstractC3577) {
        return "network:" + abstractC3577.f11356 + ":" + C14460.m34530(abstractC3577.getClass().getName() + WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR + abstractC3577.mo6365());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m43628(AbstractC16891 abstractC16891, ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList2.contains(Integer.valueOf(abstractC16891.m39746()))) {
            return null;
        }
        arrayList2.add(Integer.valueOf(abstractC16891.m39746()));
        AbstractC13921 abstractC13921Mo6020 = abstractC16891.mo6020();
        if (abstractC13921Mo6020 instanceof C2499) {
            return "local";
        }
        if (abstractC13921Mo6020 instanceof AbstractC3163) {
            return m43626(((AbstractC3163) abstractC13921Mo6020).m9690());
        }
        String strM43627 = m43627(abstractC13921Mo6020);
        if (strM43627 == null) {
            return null;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC16891 abstractC16892 = (AbstractC16891) it.next();
            if (abstractC16892.m39746() == abstractC16891.m39732()) {
                for (C5977 c5977 : abstractC16892.m39739()) {
                    if (C16999.m39878(strM43627, c5977.m16768().mo23554())) {
                        String strM43628 = m43628(abstractC16892, arrayList, arrayList2);
                        if (strM43628 == null) {
                            return null;
                        }
                        return m43625(abstractC13921Mo6020.mo7654(), strM43628, c5977.m16770());
                    }
                }
                break;
            }
        }
        if (C16999.m39872(strM43627, C16293.f50111.mo23554()) || C16999.m39872(strM43627, C16293.f50116.mo23554()) || C16999.m39872(strM43627, C16293.f50110.mo23554())) {
            return null;
        }
        return m43625(abstractC13921Mo6020.mo7654(), "local", C16999.m39885(strM43627));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m43625(String str, String str2, String str3) {
        if (!str3.startsWith("/")) {
            str3 = "/".concat(str3);
        }
        StringBuilder sbM19190 = C7166.m19190(str, ":");
        StringBuilder sbM19191 = C7166.m19190(str2, WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR);
        sbM19191.append(m43633(str3));
        sbM19190.append(C14460.m34530(sbM19191.toString()));
        return sbM19190.toString();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m43627(AbstractC13921 abstractC13921) {
        if (abstractC13921 instanceof C19247) {
            return ((C19247) abstractC13921).m44391();
        }
        if (abstractC13921 instanceof C17626) {
            return ((C17626) abstractC13921).m41202();
        }
        if (abstractC13921 instanceof C2346) {
            return ((C2346) abstractC13921).m7650();
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m43629(C9340 c9340) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(c9340.m24091().m39044());
        arrayList.add(c9340.m24072().m39044());
        c9340.m24074();
        try {
            arrayList.addAll(c9340.m24094());
            return arrayList;
        } finally {
            c9340.m24083();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static List m43630(C16560 c16560) {
        AbstractC13921 abstractC13921M39063 = c16560.m39063();
        String strM43627 = m43627(abstractC13921M39063);
        if (strM43627 == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(strM43627);
        if (abstractC13921M39063 instanceof C17626) {
            arrayList.add(((C17626) abstractC13921M39063).m41206());
        }
        if (abstractC13921M39063 instanceof C2346) {
            Iterator it = ((C2346) abstractC13921M39063).m7649().iterator();
            while (it.hasNext()) {
                arrayList.add(((C8696) it.next()).m22478().mo23554());
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (AbstractC16891 abstractC16891 : m43629(c16560.m39016())) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                long jM39733 = abstractC16891.m39733((String) it2.next());
                if (jM39733 != 0) {
                    arrayList2.add(Long.valueOf(jM39733));
                    break;
                }
            }
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static String m43634(String str) {
        String strM43633 = m43633(str);
        return strM43633.endsWith("/") ? strM43633 : strM43633.concat("/");
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static String m43633(String str) {
        if (!str.startsWith("/")) {
            throw new IllegalArgumentException("Invalid HTML preview path");
        }
        String strM18702 = C6909.m18702(str);
        if (strM18702 == null) {
            throw new IllegalArgumentException("Invalid HTML preview path");
        }
        return "/".concat(strM18702);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m43635(String str) {
        int i = 0;
        while (true) {
            List list = this.f59572;
            if (i >= list.size()) {
                return -1;
            }
            if (((C4087) list.get(i)).f13016.equals(str)) {
                return i;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m43637(String str) {
        if (m43635(str) < 0) {
            throw new IllegalArgumentException("Invalid HTML preview root");
        }
        return this.f59573.substring(str.length());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m43636() {
        return ((C4087) C7166.m19188(1, this.f59572)).f13016;
    }
}
