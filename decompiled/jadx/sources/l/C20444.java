package l;

import com.umeng.analytics.pro.d;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩶᩸ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y9BP */
/* JADX INFO: loaded from: classes4.dex */
public final class C20444 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList f65943 = new ArrayList();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static synchronized void m46839() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        int i = 0;
        for (int size = f65943.size() - 1; size >= 0; size--) {
            C19697 c19697 = (C19697) f65943.get(size);
            if (!c19697.f63631.get()) {
                c19697.m45351();
                f65943.remove(size);
            } else if (!c19697.m45378() && jCurrentTimeMillis - c19697.f63634 >= 30000) {
                if (i >= 2) {
                    c19697.m45381();
                    c19697.m45351();
                    f65943.remove(size);
                } else {
                    c19697.m45381();
                    i++;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static synchronized void m46841() {
        ArrayList arrayList = f65943;
        f65943 = new ArrayList();
        C1802.f6208.execute(new RunnableC5254(1, arrayList));
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static synchronized C19697 m46842() {
        ArrayList arrayList = new ArrayList(0);
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            for (C19697 c19697 : f65943) {
                if (!c19697.f63631.get()) {
                    arrayList.add(c19697);
                } else if (!c19697.f63638 && !c19697.m45378()) {
                    synchronized (c19697) {
                        if (jCurrentTimeMillis - c19697.f63634 > 50) {
                            c19697.f63634 = jCurrentTimeMillis;
                            m46840(arrayList);
                            return c19697;
                        }
                    }
                }
            }
            m46840(arrayList);
            return m46843();
        } catch (Throwable th) {
            m46840(arrayList);
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static boolean m46844() {
        return f65943.isEmpty();
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static C19697 m46843() throws IOException {
        try {
            C19926.m45874("creating connection");
            C19697 c19697M51583 = ((AbstractC23265) C22518.m50492()).m51583(true);
            C19926.m45874("connection created uid-" + c19697M51583.f63635);
            ArrayList arrayList = new ArrayList(0);
            for (C19697 c19697 : f65943) {
                if (!c19697.f63631.get()) {
                    arrayList.add(c19697);
                }
            }
            m46840(arrayList);
            f65943.add(c19697M51583);
            C19926.m45874("connection count " + f65943.size());
            return c19697M51583;
        } catch (IOException e) {
            int i = C19926.f64510;
            C19926.m45879("mtio ".concat(d.O), e);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m46840(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        f65943.removeAll(arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C19697) it.next()).m45351();
        }
    }
}
