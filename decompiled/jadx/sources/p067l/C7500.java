package p067l;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.ۚܰ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 54FB */
/* JADX INFO: loaded from: classes2.dex */
public final class C7500 {

    /* JADX INFO: renamed from: ֫ */
    public ThreadPoolExecutor f19644;

    /* JADX INFO: renamed from: ۧ */
    public final ArrayDeque f19645 = new ArrayDeque();

    /* JADX INFO: renamed from: ܽ */
    public final ArrayDeque f19646 = new ArrayDeque();

    /* JADX INFO: renamed from: ᩳ */
    public final ArrayDeque f19647 = new ArrayDeque();

    /* JADX INFO: renamed from: ֫ */
    public final synchronized ExecutorService m17319() {
        if (this.f19644 == null) {
            this.f19644 = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), C21407.m48493("OkHttp Dispatcher", false));
        }
        return this.f19644;
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized void m17321(C22078 c22078) {
        this.f19647.add(c22078);
    }

    /* JADX INFO: renamed from: ۧ */
    public final synchronized int m17322() {
        return this.f19646.size() + this.f19647.size();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m17320(C8666 c8666) {
        synchronized (this) {
            this.f19645.add(c8666);
        }
        m17318();
    }

    /* JADX INFO: renamed from: ܽ */
    private void m17318() {
        int i;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator it = this.f19645.iterator();
            while (true) {
                i = 0;
                if (!it.hasNext()) {
                    break;
                }
                C8666 c8666 = (C8666) it.next();
                if (this.f19646.size() >= 64) {
                    break;
                }
                Iterator it2 = this.f19646.iterator();
                while (it2.hasNext()) {
                    if (((C8666) it2.next()).f23272.f69446.f29566.f38067.equals(c8666.f23272.f69446.f29566.f38067)) {
                        i++;
                    }
                }
                if (i < 5) {
                    it.remove();
                    arrayList.add(c8666);
                    this.f19646.add(c8666);
                }
            }
            m17322();
        }
        int size = arrayList.size();
        while (i < size) {
            ((C8666) arrayList.get(i)).m20109(m17319());
            i++;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m17323(C8666 c8666) {
        m17317(this.f19646, c8666);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m17324(C22078 c22078) {
        m17317(this.f19647, c22078);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m17317(ArrayDeque arrayDeque, Object obj) {
        synchronized (this) {
            if (!arrayDeque.remove(obj)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        m17318();
    }
}
