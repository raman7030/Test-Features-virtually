package p067l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ܿܺۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: B1PU */
/* JADX INFO: loaded from: classes4.dex */
public final class C18951 {
    /* JADX INFO: renamed from: ܽ */
    public static AbstractC17043 m43058() {
        return C17853.m40542().m38684("protector/tasks/" + C24414.m53855().toLowerCase());
    }

    /* JADX INFO: renamed from: ֫ */
    public static AbstractC17043 m43054(C18280 c18280) {
        return C17853.m40542().m38684("protector/export/" + C24414.m53855().toLowerCase() + "_" + c18280.f54573 + ".apk");
    }

    /* JADX INFO: renamed from: ۧ */
    public static AbstractC17043 m43057(C18280 c18280) {
        c18280.f54573.getClass();
        return m43058().m38684(c18280.f54573);
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m43055(AbstractC17043 abstractC17043, C18280 c18280) {
        if (c18280.f54573.equals(abstractC17043.getName()) && c18280.f54574.equalsIgnoreCase(C24414.m53855())) {
            return c18280.f54570.equals(C22148.m49955(abstractC17043.m38684("packageLocal"), "MD5"));
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public static ArrayList m43053() {
        ArrayList arrayList = new ArrayList();
        for (AbstractC17043 abstractC17043 : m43058().mo25500(true)) {
            if (abstractC17043.mo25087()) {
                AbstractC17043 abstractC17043M38684 = abstractC17043.m38684("info");
                AbstractC17043 abstractC17043M38685 = abstractC17043.m38684("packageLocal");
                AbstractC17043 abstractC17043M38686 = abstractC17043.m38684("packageUpload");
                if (abstractC17043M38684.mo25094() && abstractC17043M38685.mo25094() && abstractC17043M38686.mo25094()) {
                    try {
                        C18280 c18280M41619 = C18280.m41619(abstractC17043M38684.m38664());
                        if (!m43055(abstractC17043, c18280M41619)) {
                            throw new Exception();
                        }
                        if (ServiceC10905.m25161(c18280M41619.f54573)) {
                            c18280M41619.f54575 = -1;
                        } else if (ServiceC10905.f30232.contains(c18280M41619.f54573)) {
                            c18280M41619.f54575 = -2;
                        } else {
                            c18280M41619.f54575 = -3;
                        }
                        arrayList.add(c18280M41619);
                    } catch (Exception unused) {
                    }
                }
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: ۧ */
    public static List m43056() {
        List<C18280> listM8516 = C4199.m8516();
        for (C18280 c18280 : listM8516) {
            AbstractC17043 abstractC17043M43057 = m43057(c18280);
            AbstractC17043 abstractC17043M38684 = abstractC17043M43057.m38684("info");
            AbstractC17043 abstractC17043M38685 = abstractC17043M43057.m38684("packageLocal");
            AbstractC17043 abstractC17043M38686 = abstractC17043M43057.m38684("packageUpload");
            if (!abstractC17043M38684.mo25094() || !abstractC17043M38685.mo25094()) {
                c18280.f54575 = -4;
            } else {
                if (abstractC17043M38686.mo25094()) {
                    abstractC17043M38686.mo25503();
                }
                try {
                    C18280 c18280M41619 = C18280.m41619(abstractC17043M38684.m38664());
                    if (c18280M41619.f54573.equals(c18280.f54573) && m43055(abstractC17043M43057, c18280M41619)) {
                        c18280.f54577 = c18280M41619.f54577;
                        c18280.f54570 = c18280M41619.f54570;
                        c18280.f54579 = c18280M41619.f54579;
                    } else {
                        c18280.f54575 = -4;
                    }
                } catch (Exception unused) {
                }
            }
        }
        Collections.sort(listM8516);
        return listM8516;
    }
}
