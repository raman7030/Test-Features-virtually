package p067l;

import bin.p000mt.plus.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* JADX INFO: renamed from: l.ᩴܿܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D6KJ */
/* JADX INFO: loaded from: classes4.dex */
public final class C20335 {

    /* JADX INFO: renamed from: ֫ */
    public final List f62802;

    /* JADX INFO: renamed from: ۧ */
    public final String f62803;

    /* JADX INFO: renamed from: ܽ */
    public final String f62804;

    public C20335(String str, String str2, String str3, String str4) {
        this.f62804 = str;
        String strM45899 = m45899(str2);
        this.f62803 = strM45899;
        String strM45900 = m45900(str3);
        if (!strM45899.startsWith(strM45900)) {
            throw new IllegalArgumentException("HTML document is outside the root boundary");
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C6253(strM45900, str4));
        int length = strM45900.length();
        while (true) {
            int iIndexOf = this.f62803.indexOf(47, length);
            if (iIndexOf >= 0) {
                int i = iIndexOf + 1;
                arrayList.add(new C6253(this.f62803.substring(0, i), this.f62803.substring(length, iIndexOf)));
                length = i;
            } else {
                this.f62802 = C21562.unmodifiableList(arrayList);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C20335 m45897(C18107 c18107, InterfaceC19370 interfaceC19370) {
        int iIndexOf;
        AbstractC18422 abstractC18422M41270 = c18107.m41270();
        AbstractC15599 abstractC15599Mo8217 = abstractC18422M41270.mo8217();
        if (abstractC15599Mo8217 instanceof C4744) {
            return m45898(interfaceC19370.getPath());
        }
        String strSubstring = "/";
        if (!(abstractC15599Mo8217 instanceof AbstractC5375)) {
            String strM45893 = m45893(abstractC15599Mo8217);
            if (strM45893 != null) {
                return new C20335(m45894(abstractC18422M41270, m45895(c18107.m41242()), new ArrayList()), interfaceC19370.getPath(), "/", C18524.m42109(strM45893, new String[0]).getName());
            }
            throw new IllegalArgumentException("Unsupported HTML preview source");
        }
        AbstractC5375 abstractC5375 = (AbstractC5375) abstractC15599Mo8217;
        String path = interfaceC19370.getPath();
        String name = abstractC5375.m11734().getName();
        if ((abstractC5375 instanceof C14506) && (iIndexOf = path.indexOf(47, 1)) > 1) {
            strSubstring = path.substring(0, iIndexOf + 1);
            StringBuilder sbM21133 = C9179.m21133(name, " / ");
            sbM21133.append(path.substring(1, iIndexOf));
            name = sbM21133.toString();
        }
        return new C20335(m45892(abstractC5375.m11734()), path, strSubstring, name);
    }

    /* JADX INFO: renamed from: ܽ */
    public static C20335 m45898(String str) {
        String name;
        String strMo25505;
        String strM42128 = C18524.m42128(m45899(str));
        String strM16224 = C7050.m16224(R.string.MT_Protector);
        if (C18524.m42130(strM42128)) {
            strMo25505 = C17853.f53287.mo25505();
            name = C7050.m16224(R.string.MT_Protector);
        } else {
            AbstractC17043 abstractC17043M42109 = C18524.m42109(strM42128, new String[0]);
            if (abstractC17043M42109.mo25100()) {
                C6196 c6196M25090 = abstractC17043M42109.mo25098().m25090();
                name = c6196M25090.m14040();
                strM16224 = c6196M25090.f15596;
                if (strM16224 == null) {
                    strMo25505 = name;
                } else {
                    String str2 = name;
                    name = strM16224;
                    strMo25505 = str2;
                }
            } else {
                C6376 c6376M47753 = C21129.m47753(strM42128);
                if (c6376M47753 != null) {
                    File file = c6376M47753.f16500;
                    String path = file.getPath();
                    name = c6376M47753.f16499;
                    if (name == null) {
                        name = file.getName();
                    }
                    strMo25505 = path;
                } else {
                    name = "/";
                    String str3 = name;
                    name = strM16224;
                    strMo25505 = str3;
                }
            }
        }
        return new C20335("local", strM42128, strMo25505, name);
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m45892(AbstractC5769 abstractC5769) {
        return "network:" + abstractC5769.f14161 + ":" + C16111.m36664(abstractC5769.getClass().getName() + WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR + abstractC5769.mo8538());
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m45894(AbstractC18422 abstractC18422, ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList2.contains(Integer.valueOf(abstractC18422.m41987()))) {
            return null;
        }
        arrayList2.add(Integer.valueOf(abstractC18422.m41987()));
        AbstractC15599 abstractC15599Mo8217 = abstractC18422.mo8217();
        if (abstractC15599Mo8217 instanceof C4744) {
            return "local";
        }
        if (abstractC15599Mo8217 instanceof AbstractC5375) {
            return m45892(((AbstractC5375) abstractC15599Mo8217).m11734());
        }
        String strM45893 = m45893(abstractC15599Mo8217);
        if (strM45893 == null) {
            return null;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC18422 abstractC18423 = (AbstractC18422) it.next();
            if (abstractC18423.m41987() == abstractC18422.m41973()) {
                for (C8049 c8049 : abstractC18423.m41980()) {
                    if (C18524.m42121(strM45893, c8049.m18694().mo25505())) {
                        String strM45894 = m45894(abstractC18423, arrayList, arrayList2);
                        if (strM45894 == null) {
                            return null;
                        }
                        return m45891(abstractC15599Mo8217.mo9725(), strM45894, c8049.m18696());
                    }
                }
                break;
            }
        }
        if (C18524.m42115(strM45893, C17853.f53278.mo25505()) || C18524.m42115(strM45893, C17853.f53283.mo25505()) || C18524.m42115(strM45893, C17853.f53277.mo25505())) {
            return null;
        }
        return m45891(abstractC15599Mo8217.mo9725(), "local", C18524.m42128(strM45893));
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m45891(String str, String str2, String str3) {
        if (!str3.startsWith("/")) {
            str3 = "/".concat(str3);
        }
        StringBuilder sbM21133 = C9179.m21133(str, ":");
        StringBuilder sbM21134 = C9179.m21133(str2, WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR);
        sbM21134.append(m45899(str3));
        sbM21133.append(C16111.m36664(sbM21134.toString()));
        return sbM21133.toString();
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m45893(AbstractC15599 abstractC15599) {
        if (abstractC15599 instanceof C20661) {
            return ((C20661) abstractC15599).m46685();
        }
        if (abstractC15599 instanceof C19121) {
            return ((C19121) abstractC15599).m43448();
        }
        if (abstractC15599 instanceof C4598) {
            return ((C4598) abstractC15599).m9721();
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public static ArrayList m45895(C11245 c11245) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(c11245.m26100().m41270());
        arrayList.add(c11245.m26081().m41270());
        c11245.m26083();
        try {
            arrayList.addAll(c11245.m26103());
            return arrayList;
        } finally {
            c11245.m26092();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static List m45896(C18107 c18107) {
        AbstractC15599 abstractC15599M41289 = c18107.m41289();
        String strM45893 = m45893(abstractC15599M41289);
        if (strM45893 == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(strM45893);
        if (abstractC15599M41289 instanceof C19121) {
            arrayList.add(((C19121) abstractC15599M41289).m43452());
        }
        if (abstractC15599M41289 instanceof C4598) {
            Iterator it = ((C4598) abstractC15599M41289).m9720().iterator();
            while (it.hasNext()) {
                arrayList.add(((C10633) it.next()).m24447().mo25505());
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (AbstractC18422 abstractC18422 : m45895(c18107.m41242())) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                long jM41974 = abstractC18422.m41974((String) it2.next());
                if (jM41974 != 0) {
                    arrayList2.add(Long.valueOf(jM41974));
                    break;
                }
            }
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: ᩳ */
    public static String m45900(String str) {
        String strM45899 = m45899(str);
        return strM45899.endsWith("/") ? strM45899 : strM45899.concat("/");
    }

    /* JADX INFO: renamed from: ܿ */
    public static String m45899(String str) {
        if (!str.startsWith("/")) {
            throw new IllegalArgumentException("Invalid HTML preview path");
        }
        String strM20651 = C8935.m20651(str);
        if (strM20651 == null) {
            throw new IllegalArgumentException("Invalid HTML preview path");
        }
        return "/".concat(strM20651);
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m45901(String str) {
        int i = 0;
        while (true) {
            List list = this.f62802;
            if (i >= list.size()) {
                return -1;
            }
            if (((C6253) list.get(i)).f15831.equals(str)) {
                return i;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final String m45903(String str) {
        if (m45901(str) < 0) {
            throw new IllegalArgumentException("Invalid HTML preview root");
        }
        return this.f62803.substring(str.length());
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m45902() {
        return ((C6253) C9179.m21131(1, this.f62802)).f15831;
    }
}
