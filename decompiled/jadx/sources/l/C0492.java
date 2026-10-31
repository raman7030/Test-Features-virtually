package l;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.֡ܶۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 41XE */
/* JADX INFO: loaded from: classes2.dex */
public final class C0492 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public List f2116;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public String[] f2117;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public String f2118;

    public C0492(String str, String[] strArr) {
        this.f2118 = str;
        this.f2117 = strArr;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m2168(String... strArr) {
        for (int i = 0; i < strArr.length; i++) {
            String strConcat = strArr[i];
            if (!strConcat.isEmpty() && !strConcat.endsWith(".")) {
                strConcat = strConcat.concat(".");
            }
            strArr[i] = "L" + strConcat.replace('.', '/');
        }
        this.f2116 = Arrays.asList(strArr);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m2167(C12918 c12918) {
        boolean z;
        int i;
        int i2;
        HashMap map = new HashMap();
        for (C7980 c7980 : (AbstractC18605) c12918.mo27438()) {
            map.put(c7980.getType(), c7980);
        }
        Iterator it = map.values().iterator();
        while (true) {
            z = false;
            if (!it.hasNext()) {
                break;
            }
            C7980 c7981 = (C7980) it.next();
            if (C5432.m15522(map, c7981)) {
                z = true;
                int i3 = 0;
                int i4 = 0;
                for (C16611 c16611 : c7981.m21299(true)) {
                    if (c16611.getName().startsWith("on") && c16611.mo3570() != null) {
                        try {
                            Iterator it2 = ((C17317) c16611.mo3570().mo3817()).iterator();
                            i = 0;
                            i2 = 0;
                            while (true) {
                                try {
                                    AbstractC1349 abstractC1349 = (AbstractC1349) it2;
                                    if (!abstractC1349.hasNext()) {
                                        break;
                                    }
                                    if (((InterfaceC22677) abstractC1349.next()).mo3975() == EnumC0841.f3065) {
                                        i++;
                                    } else {
                                        i2++;
                                    }
                                } catch (Throwable unused) {
                                }
                            }
                        } catch (Throwable unused2) {
                            i = 0;
                            i2 = 0;
                        }
                        if (i2 > 2 || i <= 5) {
                            i4++;
                        } else {
                            i3++;
                        }
                    }
                }
                if (i3 > i4) {
                    break;
                }
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m2166(C12918 c12918) {
        HashMap map = new HashMap();
        for (C7980 c7980 : (AbstractC18605) c12918.mo27438()) {
            map.put(c7980.getType(), c7980);
        }
        Iterator it = map.values().iterator();
        while (true) {
            int i = 0;
            if (!it.hasNext()) {
                return false;
            }
            C7980 c7981 = (C7980) it.next();
            if (C5432.m15522(map, c7981)) {
                int i2 = 0;
                for (C16611 c16611 : c7981.m21299(true)) {
                    if (c16611.getName().startsWith("on")) {
                        if (EnumC15657.NATIVE.m36866(c16611.f51042)) {
                            System.out.println("Native: " + c16611);
                            i++;
                        } else {
                            i2++;
                        }
                    }
                }
                if (i > i2) {
                    return true;
                }
            }
        }
    }
}
