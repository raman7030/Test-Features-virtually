package p067l;

import com.umeng.analytics.pro.C0708d;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۗ᩶ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: L17P */
/* JADX INFO: loaded from: classes2.dex */
public final class C5665 {

    /* JADX INFO: renamed from: ֫ */
    public static ArrayList f13783 = new ArrayList();

    /* JADX INFO: renamed from: ֫ */
    public static synchronized C21089 m12615(boolean z) {
        if (z) {
            return C21799.m49165();
        }
        ArrayList arrayList = new ArrayList(0);
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            for (C21089 c21089 : f13783) {
                if (!c21089.f66252.get()) {
                    arrayList.add(c21089);
                } else if (!c21089.f66259 && !c21089.m47675()) {
                    synchronized (c21089) {
                        if (jCurrentTimeMillis - c21089.f66255 > 50) {
                            c21089.f66255 = jCurrentTimeMillis;
                            m12617(arrayList);
                            return c21089;
                        }
                    }
                }
            }
            m12617(arrayList);
            return m12621();
        } catch (Throwable th) {
            m12617(arrayList);
            throw th;
        }
    }

    static {
        if (C7050.m16228()) {
            return;
        }
        Thread thread = new Thread(new RunnableC4458(1));
        thread.setDaemon(true);
        thread.setName("mtio-idle-cleaner");
        thread.start();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m12616() {
        while (true) {
            try {
                Thread.sleep(25000L);
                synchronized (C5665.class) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    int i = 0;
                    for (int size = f13783.size() - 1; size >= 0; size--) {
                        C21089 c21089 = (C21089) f13783.get(size);
                        if (!c21089.f66252.get()) {
                            c21089.m47648();
                            f13783.remove(size);
                        } else if (!c21089.m47675() && jCurrentTimeMillis - c21089.f66255 >= 30000) {
                            if (i >= 2) {
                                c21089.m47678();
                                c21089.m47648();
                                f13783.remove(size);
                            } else {
                                c21089.m47678();
                                i++;
                            }
                        }
                    }
                }
                C21799.m49162();
            } catch (InterruptedException unused) {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public static boolean m12620() {
        return f13783.isEmpty();
    }

    /* JADX INFO: renamed from: ֫ */
    public static C21089 m12614(String str) {
        return m12615(C23770.m52834().mo4998() && (!str.startsWith("/data") ? C21129.m47753(str) == null : !(str.startsWith("/data/data/") || str.startsWith("/data/user/") || str.startsWith("/data/user_de/"))));
    }

    /* JADX INFO: renamed from: ۧ */
    public static C21089 m12618(boolean z) throws IOException {
        C21089 c21089M12615;
        C21089 c21089M12616 = m12615(z);
        try {
            c21089M12616.m47662();
            return c21089M12616;
        } catch (IOException e) {
            c21089M12616.m47648();
            try {
                c21089M12615 = m12615(z);
                try {
                    c21089M12615.m47662();
                    return c21089M12615;
                } catch (IOException e2) {
                    e = e2;
                    if (c21089M12615 != null) {
                        c21089M12615.m47648();
                    }
                    e.addSuppressed(e);
                    throw e;
                }
            } catch (IOException e3) {
                e = e3;
                c21089M12615 = null;
            }
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public static C21089 m12621() throws IOException {
        try {
            C21306.m48187("creating connection");
            C21089 c21089M53979 = ((AbstractC24480) C23770.m52834()).m53979(false);
            int i = c21089M53979.f66256;
            C21306.m48187("connection created uid-" + i);
            ArrayList arrayList = new ArrayList(0);
            for (C21089 c21089 : f13783) {
                if (!c21089.f66252.get()) {
                    arrayList.add(c21089);
                } else if (c21089.f66256 != i) {
                    arrayList.add(c21089);
                }
            }
            m12617(arrayList);
            f13783.add(c21089M53979);
            C21306.m48187("connection count " + f13783.size());
            return c21089M53979;
        } catch (IOException e) {
            int i2 = C21306.f67147;
            C21306.m48192("mtio ".concat(C0708d.f2599O), e);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m12619() {
        ArrayList arrayList = f13783;
        f13783 = new ArrayList();
        C4081.f8987.execute(new RunnableC17751(1, arrayList));
        C21799.m49164();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m12617(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        f13783.removeAll(arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C21089) it.next()).m47648();
        }
    }
}
