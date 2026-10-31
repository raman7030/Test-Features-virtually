package l;

import com.umeng.analytics.pro.d;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۗ᩶ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: L17P */
/* JADX INFO: loaded from: classes2.dex */
public final class C3468 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList f10982 = new ArrayList();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static synchronized C19697 m10607(boolean z) {
        if (z) {
            return C20444.m46842();
        }
        ArrayList arrayList = new ArrayList(0);
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            for (C19697 c19697 : f10982) {
                if (!c19697.f63631.get()) {
                    arrayList.add(c19697);
                } else if (!c19697.f63638 && !c19697.m45378()) {
                    synchronized (c19697) {
                        if (jCurrentTimeMillis - c19697.f63634 > 50) {
                            c19697.f63634 = jCurrentTimeMillis;
                            m10609(arrayList);
                            return c19697;
                        }
                    }
                }
            }
            m10609(arrayList);
            return m10613();
        } catch (Throwable th) {
            m10609(arrayList);
            throw th;
        }
    }

    static {
        if (C4925.m14331()) {
            return;
        }
        Thread thread = new Thread(new RunnableC2199(1));
        thread.setDaemon(true);
        thread.setName("mtio-idle-cleaner");
        thread.start();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m10608() {
        while (true) {
            try {
                Thread.sleep(25000L);
                synchronized (C3468.class) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    int i = 0;
                    for (int size = f10982.size() - 1; size >= 0; size--) {
                        C19697 c19697 = (C19697) f10982.get(size);
                        if (!c19697.f63631.get()) {
                            c19697.m45351();
                            f10982.remove(size);
                        } else if (!c19697.m45378() && jCurrentTimeMillis - c19697.f63634 >= 30000) {
                            if (i >= 2) {
                                c19697.m45381();
                                c19697.m45351();
                                f10982.remove(size);
                            } else {
                                c19697.m45381();
                                i++;
                            }
                        }
                    }
                }
                C20444.m46839();
            } catch (InterruptedException unused) {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static boolean m10612() {
        return f10982.isEmpty();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C19697 m10606(String str) {
        return m10607(C22518.m50492().mo2658() && (!str.startsWith("/data") ? C19739.m45449(str) == null : !(str.startsWith("/data/data/") || str.startsWith("/data/user/") || str.startsWith("/data/user_de/"))));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C19697 m10610(boolean z) throws IOException {
        C19697 c19697M10607;
        C19697 c19697M10608 = m10607(z);
        try {
            c19697M10608.m45365();
            return c19697M10608;
        } catch (IOException e) {
            c19697M10608.m45351();
            try {
                c19697M10607 = m10607(z);
                try {
                    c19697M10607.m45365();
                    return c19697M10607;
                } catch (IOException e2) {
                    e = e2;
                    if (c19697M10607 != null) {
                        c19697M10607.m45351();
                    }
                    e.addSuppressed(e);
                    throw e;
                }
            } catch (IOException e3) {
                e = e3;
                c19697M10607 = null;
            }
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static C19697 m10613() throws IOException {
        try {
            C19926.m45874("creating connection");
            C19697 c19697M51583 = ((AbstractC23265) C22518.m50492()).m51583(false);
            int i = c19697M51583.f63635;
            C19926.m45874("connection created uid-" + i);
            ArrayList arrayList = new ArrayList(0);
            for (C19697 c19697 : f10982) {
                if (!c19697.f63631.get()) {
                    arrayList.add(c19697);
                } else if (c19697.f63635 != i) {
                    arrayList.add(c19697);
                }
            }
            m10609(arrayList);
            f10982.add(c19697M51583);
            C19926.m45874("connection count " + f10982.size());
            return c19697M51583;
        } catch (IOException e) {
            int i2 = C19926.f64510;
            C19926.m45879("mtio ".concat(d.O), e);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m10611() {
        ArrayList arrayList = f10982;
        f10982 = new ArrayList();
        C1802.f6208.execute(new RunnableC16185(1, arrayList));
        C20444.m46841();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m10609(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        f10982.removeAll(arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C19697) it.next()).m45351();
        }
    }
}
