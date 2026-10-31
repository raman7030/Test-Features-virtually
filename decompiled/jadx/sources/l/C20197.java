package l;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.᩶۬᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: J1IP */
/* JADX INFO: loaded from: classes4.dex */
public final class C20197 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C11005 f65355;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C11005 f65356;

    /* JADX WARN: Code duplicated, block: B:25:0x0096  */
    /* JADX WARN: Code duplicated, block: B:40:0x00dd  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m46431(C11005 c11005) {
        Boolean bool;
        Boolean bool2;
        Iterator it = c11005.m27330("state").mo23549(true).iterator();
        while (it.hasNext()) {
            ((AbstractC15440) it.next()).mo23552();
        }
        Iterator it2 = c11005.m27330("dex/smali").mo23549(true).iterator();
        while (it2.hasNext()) {
            ((AbstractC15440) it2.next()).mo23552();
        }
        Iterator it3 = c11005.m27330("arsc/xml").mo23549(true).iterator();
        while (it3.hasNext()) {
            ((AbstractC15440) it3.next()).mo23552();
        }
        for (AbstractC15440 abstractC15440 : c11005.m27330("dex/config").mo23549(true)) {
            if (abstractC15440.mo23119()) {
                String name = abstractC15440.getName();
                name.getClass();
                if (name.equals("dex_name_map") || name.equals("map")) {
                    bool2 = Boolean.FALSE;
                } else {
                    bool2 = Boolean.TRUE;
                }
            } else {
                bool2 = Boolean.TRUE;
            }
            if (bool2.booleanValue()) {
                abstractC15440.mo23552();
            }
        }
        for (AbstractC15440 abstractC15441 : c11005.m27330("arsc/config").mo23549(true)) {
            if (abstractC15441.mo23119()) {
                String name2 = abstractC15441.getName();
                name2.getClass();
                if (name2.equals("pkgsort") || name2.equals("name")) {
                    bool = Boolean.FALSE;
                } else {
                    bool = Boolean.TRUE;
                }
            } else {
                bool = Boolean.TRUE;
            }
            if (bool.booleanValue()) {
                abstractC15441.mo23552();
            }
        }
    }

    public C20197(C11005 c11005) {
        this.f65356 = c11005;
        this.f65355 = new C11005(c11005, "backup");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m46434(String str) throws IOException {
        C11005 c11005 = this.f65355;
        if (c11005.m27340().mo23119()) {
            c11005.m27333();
        }
        if (!c11005.m27336()) {
            c11005.m27340().mo23546();
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        c11005.m27330(jCurrentTimeMillis + ".info").m36510(str);
        C8918 c8918 = new C8918(c11005.m27330(jCurrentTimeMillis + ".zip"));
        Charset charset = StandardCharsets.UTF_8;
        c8918.m23027();
        C11005 c11006 = this.f65356;
        m46432(c11006.m27330("state"), c8918, "");
        m46432(c11006.m27330("dex/config"), c8918, "dex/");
        m46432(c11006.m27330("dex/smali"), c8918, "dex/");
        m46432(c11006.m27330("arsc/config"), c8918, "arsc/");
        m46432(c11006.m27330("arsc/xml"), c8918, "arsc/");
        c8918.close();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m46435(AbstractC15440 abstractC15440) {
        C11005 c11005 = this.f65356;
        C11005 c11006 = new C11005(c11005, "temp");
        try {
            C18090 c18090 = new C18090(abstractC15440);
            try {
                for (C3545 c3545 : c18090.m42210()) {
                    C16999.m39860(c3545.getName(), c3545.isDirectory());
                }
                c11006.m27333();
                c11006.m27340().m36508();
                for (C3545 c3546 : c18090.m42210()) {
                    AbstractC15440 abstractC15440M27330 = c11006.m27330(C16999.m39860(c3546.getName(), c3546.isDirectory()));
                    if (c3546.isDirectory()) {
                        abstractC15440M27330.m36508();
                    } else {
                        abstractC15440M27330.mo35195();
                        abstractC15440M27330.m36493(c18090.m42189(c3546));
                    }
                    abstractC15440M27330.mo18537(c3546.getTime());
                }
                c18090.close();
                AbstractC15440 abstractC15440M27331 = c11006.m27330("state");
                AbstractC15440 abstractC15440M27332 = c11005.m27330("state");
                abstractC15440M27332.mo23552();
                if (abstractC15440M27331.mo23120()) {
                    abstractC15440M27331.m36498(abstractC15440M27332, (Runnable) null);
                }
                AbstractC15440 abstractC15440M27333 = c11006.m27330("dex/config");
                AbstractC15440 abstractC15440M27334 = c11005.m27330("dex/config");
                abstractC15440M27334.mo23552();
                if (abstractC15440M27333.mo23120()) {
                    abstractC15440M27333.m36498(abstractC15440M27334, (Runnable) null);
                }
                AbstractC15440 abstractC15440M27335 = c11006.m27330("dex/smali");
                AbstractC15440 abstractC15440M27336 = c11005.m27330("dex/smali");
                abstractC15440M27336.mo23552();
                if (abstractC15440M27335.mo23120()) {
                    abstractC15440M27335.m36498(abstractC15440M27336, (Runnable) null);
                }
                AbstractC15440 abstractC15440M27337 = c11006.m27330("arsc/config");
                AbstractC15440 abstractC15440M27338 = c11005.m27330("arsc/config");
                abstractC15440M27338.mo23552();
                if (abstractC15440M27337.mo23120()) {
                    abstractC15440M27337.m36498(abstractC15440M27338, (Runnable) null);
                }
                AbstractC15440 abstractC15440M27339 = c11006.m27330("arsc/xml");
                AbstractC15440 abstractC15440M273310 = c11005.m27330("arsc/xml");
                abstractC15440M273310.mo23552();
                if (abstractC15440M27339.mo23120()) {
                    abstractC15440M27339.m36498(abstractC15440M273310, (Runnable) null);
                }
                c11006.m27333();
            } catch (Throwable th) {
                try {
                    c18090.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            c11006.m27333();
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList m46433() {
        List<AbstractC15440> list = (List) C5378.stream(this.f65355.m27340().mo23549(true)).filter(new C21608(0)).collect(C22976.toList());
        ArrayList arrayList = new ArrayList(list.size());
        for (AbstractC15440 abstractC15440 : list) {
            String strMo23554 = abstractC15440.mo23554();
            AbstractC15440 abstractC15440M39866 = C16999.m39866(strMo23554.substring(0, strMo23554.length() - 3) + "info", new String[0]);
            if (abstractC15440M39866.mo23120()) {
                try {
                    String strM36489 = abstractC15440M39866.m36489();
                    if (!strM36489.isEmpty()) {
                        String name = abstractC15440.getName();
                        arrayList.add(new C22313(abstractC15440, abstractC15440M39866, strM36489, Long.parseLong(name.substring(0, name.length() - 4))));
                    }
                } catch (IOException | NumberFormatException unused) {
                }
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m46432(AbstractC15440 abstractC15440, C8918 c8918, String str) throws IOException {
        if (abstractC15440.mo23120()) {
            StringBuilder sbM15339 = C5368.m15339(str);
            sbM15339.append(abstractC15440.getName());
            sbM15339.append("/");
            String string = sbM15339.toString();
            C3545 c3545 = new C3545(string);
            c3545.setTime(abstractC15440.mo23117());
            c8918.m23013(c3545);
            c8918.m23023();
            for (AbstractC15440 abstractC15441 : abstractC15440.mo23549(true)) {
                if (abstractC15441.mo23113()) {
                    m46432(abstractC15441, c8918, string);
                } else {
                    StringBuilder sbM153310 = C5368.m15339(string);
                    sbM153310.append(abstractC15441.getName());
                    C3545 c3546 = new C3545(sbM153310.toString());
                    c3546.setTime(abstractC15441.mo23117());
                    c8918.m23013(c3546);
                    c8918.m23011(abstractC15441.mo27926());
                    c8918.m23023();
                }
            }
        }
    }
}
