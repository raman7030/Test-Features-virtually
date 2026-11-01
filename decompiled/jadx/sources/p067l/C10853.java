package p067l;

import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.ۡܰ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 54FG */
/* JADX INFO: loaded from: classes3.dex */
public final class C10853 {

    /* JADX INFO: renamed from: ᩻ */
    public static final ThreadPoolExecutor f30074 = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), C21407.m48493("OkHttp ConnectionPool", true));

    /* JADX INFO: renamed from: ֫ */
    public final Runnable f30075;

    /* JADX INFO: renamed from: ۧ */
    public boolean f30076;

    /* JADX INFO: renamed from: ܳ */
    public final C10996 f30077;

    /* JADX INFO: renamed from: ܽ */
    public final ArrayDeque f30078;

    /* JADX INFO: renamed from: ܿ */
    public final int f30079;

    /* JADX INFO: renamed from: ᩳ */
    public final long f30080;

    public C10853() {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        this.f30075 = new RunnableC11524(this);
        this.f30078 = new ArrayDeque();
        this.f30077 = new C10996(1);
        this.f30079 = 5;
        this.f30080 = timeUnit.toNanos(5L);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C24585 m25007(C7088 c7088, C17208 c17208, C7325 c7325) {
        for (C24585 c24585 : this.f30078) {
            if (c24585.m54220(c7088, c7325)) {
                c17208.m38973(c24585, true);
                return c24585;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final Socket m25006(C7088 c7088, C17208 c17208) {
        for (C24585 c24585 : this.f30078) {
            if (c24585.m54220(c7088, null) && c24585.m54224() && c24585 != c17208.m38977()) {
                return c17208.m38969(c24585);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m25009(C24585 c24585) {
        if (!this.f30076) {
            this.f30076 = true;
            f30074.execute(this.f30075);
        }
        this.f30078.add(c24585);
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m25008(C24585 c24585) {
        if (c24585.f77851 || this.f30079 == 0) {
            this.f30078.remove(c24585);
            return true;
        }
        notifyAll();
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public final long m25005(long j) {
        synchronized (this) {
            C24585 c24585 = null;
            long j2 = Long.MIN_VALUE;
            int i = 0;
            int i2 = 0;
            for (C24585 c24586 : this.f30078) {
                if (m25004(c24586, j) > 0) {
                    i2++;
                } else {
                    i++;
                    long j3 = j - c24586.f77862;
                    if (j3 > j2) {
                        c24585 = c24586;
                        j2 = j3;
                    }
                }
            }
            long j4 = this.f30080;
            if (j2 < j4 && i <= this.f30079) {
                if (i > 0) {
                    return j4 - j2;
                }
                if (i2 > 0) {
                    return j4;
                }
                this.f30076 = false;
                return -1L;
            }
            this.f30078.remove(c24585);
            C21407.m48497(c24585.m54225());
            return 0L;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private int m25004(C24585 c24585, long j) {
        ArrayList arrayList = c24585.f77857;
        int i = 0;
        while (i < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                C20304.m45846().mo45849(((C10504) reference).f29079, "A connection to " + c24585.m54226().f19165.f18472 + " was leaked. Did you forget to close a response body?");
                arrayList.remove(i);
                c24585.f77851 = true;
                if (arrayList.isEmpty()) {
                    c24585.f77862 = j - this.f30080;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }
}
