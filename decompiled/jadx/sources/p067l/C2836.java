package p067l;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.֡ܶۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 41XE */
/* JADX INFO: loaded from: classes2.dex */
public final class C2836 {

    /* JADX INFO: renamed from: ֫ */
    public List f4888;

    /* JADX INFO: renamed from: ۧ */
    public String[] f4889;

    /* JADX INFO: renamed from: ܽ */
    public String f4890;

    public C2836(String str, String[] strArr) {
        this.f4890 = str;
        this.f4889 = strArr;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m4535(String... strArr) {
        for (int i = 0; i < strArr.length; i++) {
            String strConcat = strArr[i];
            if (!strConcat.isEmpty() && !strConcat.endsWith(".")) {
                strConcat = strConcat.concat(".");
            }
            strArr[i] = "L" + strConcat.replace('.', '/');
        }
        this.f4888 = Arrays.asList(strArr);
    }

    /* JADX INFO: renamed from: ۧ */
    public static boolean m4534(C14645 c14645) {
        boolean z;
        int i;
        int i2;
        HashMap map = new HashMap();
        for (C9952 c9952 : (AbstractC20050) c14645.mo29500()) {
            map.put(c9952.getType(), c9952);
        }
        Iterator it = map.values().iterator();
        while (true) {
            z = false;
            if (!it.hasNext()) {
                break;
            }
            C9952 c9953 = (C9952) it.next();
            if (C7531.m17433(map, c9953)) {
                z = true;
                int i3 = 0;
                int i4 = 0;
                for (C18155 c18155 : c9953.m23265(true)) {
                    if (c18155.getName().startsWith("on") && c18155.mo5857() != null) {
                        try {
                            Iterator it2 = ((C18826) c18155.mo5857().mo6074()).iterator();
                            i = 0;
                            i2 = 0;
                            while (true) {
                                try {
                                    AbstractC3651 abstractC3651 = (AbstractC3651) it2;
                                    if (!abstractC3651.hasNext()) {
                                        break;
                                    }
                                    if (((InterfaceC23920) abstractC3651.next()).mo6217() == EnumC3167.f5839) {
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

    /* JADX INFO: renamed from: ֫ */
    public static boolean m4533(C14645 c14645) {
        HashMap map = new HashMap();
        for (C9952 c9952 : (AbstractC20050) c14645.mo29500()) {
            map.put(c9952.getType(), c9952);
        }
        Iterator it = map.values().iterator();
        while (true) {
            int i = 0;
            if (!it.hasNext()) {
                return false;
            }
            C9952 c9953 = (C9952) it.next();
            if (C7531.m17433(map, c9953)) {
                int i2 = 0;
                for (C18155 c18155 : c9953.m23265(true)) {
                    if (c18155.getName().startsWith("on")) {
                        if (EnumC17248.NATIVE.m39032(c18155.f54219)) {
                            System.out.println("Native: " + c18155);
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
