package p067l;

import com.umeng.analytics.pro.C0708d;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩶᩸ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y9BP */
/* JADX INFO: loaded from: classes4.dex */
public final class C21799 {

    /* JADX INFO: renamed from: ֫ */
    public static ArrayList f68618 = new ArrayList();

    /* JADX INFO: renamed from: ֫ */
    public static synchronized void m49162() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        int i = 0;
        for (int size = f68618.size() - 1; size >= 0; size--) {
            C21089 c21089 = (C21089) f68618.get(size);
            if (!c21089.f66252.get()) {
                c21089.m47648();
                f68618.remove(size);
            } else if (!c21089.m47675() && jCurrentTimeMillis - c21089.f66255 >= 30000) {
                if (i >= 2) {
                    c21089.m47678();
                    c21089.m47648();
                    f68618.remove(size);
                } else {
                    c21089.m47678();
                    i++;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static synchronized void m49164() {
        ArrayList arrayList = f68618;
        f68618 = new ArrayList();
        C4081.f8987.execute(new RunnableC7362(1, arrayList));
    }

    /* JADX INFO: renamed from: ܽ */
    public static synchronized C21089 m49165() {
        ArrayList arrayList = new ArrayList(0);
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            for (C21089 c21089 : f68618) {
                if (!c21089.f66252.get()) {
                    arrayList.add(c21089);
                } else if (!c21089.f66259 && !c21089.m47675()) {
                    synchronized (c21089) {
                        if (jCurrentTimeMillis - c21089.f66255 > 50) {
                            c21089.f66255 = jCurrentTimeMillis;
                            m49163(arrayList);
                            return c21089;
                        }
                    }
                }
            }
            m49163(arrayList);
            return m49166();
        } catch (Throwable th) {
            m49163(arrayList);
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public static boolean m49167() {
        return f68618.isEmpty();
    }

    /* JADX INFO: renamed from: ܿ */
    public static C21089 m49166() throws IOException {
        try {
            C21306.m48187("creating connection");
            C21089 c21089M53979 = ((AbstractC24480) C23770.m52834()).m53979(true);
            C21306.m48187("connection created uid-" + c21089M53979.f66256);
            ArrayList arrayList = new ArrayList(0);
            for (C21089 c21089 : f68618) {
                if (!c21089.f66252.get()) {
                    arrayList.add(c21089);
                }
            }
            m49163(arrayList);
            f68618.add(c21089M53979);
            C21306.m48187("connection count " + f68618.size());
            return c21089M53979;
        } catch (IOException e) {
            int i = C21306.f67147;
            C21306.m48192("mtio ".concat(C0708d.f2599O), e);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m49163(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        f68618.removeAll(arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C21089) it.next()).m47648();
        }
    }
}
