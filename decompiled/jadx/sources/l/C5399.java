package l;

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
public final class C5399 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public ThreadPoolExecutor f16806;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f16807 = new ArrayDeque();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f16808 = new ArrayDeque();

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f16809 = new ArrayDeque();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized ExecutorService m15408() {
        if (this.f16806 == null) {
            this.f16806 = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), C20032.m46177("OkHttp Dispatcher", false));
        }
        return this.f16806;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m15410(C20738 c20738) {
        this.f16809.add(c20738);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final synchronized int m15411() {
        return this.f16808.size() + this.f16809.size();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m15409(C6626 c6626) {
        synchronized (this) {
            this.f16807.add(c6626);
        }
        m15407();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m15407() {
        int i;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator it = this.f16807.iterator();
            while (true) {
                i = 0;
                if (!it.hasNext()) {
                    break;
                }
                C6626 c6626 = (C6626) it.next();
                if (this.f16808.size() >= 64) {
                    break;
                }
                Iterator it2 = this.f16808.iterator();
                while (it2.hasNext()) {
                    if (((C6626) it2.next()).f20396.f66762.f26640.f35068.equals(c6626.f20396.f66762.f26640.f35068)) {
                        i++;
                    }
                }
                if (i < 5) {
                    it.remove();
                    arrayList.add(c6626);
                    this.f16808.add(c6626);
                }
            }
            m15411();
        }
        int size = arrayList.size();
        while (i < size) {
            ((C6626) arrayList.get(i)).m18157(m15408());
            i++;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m15412(C6626 c6626) {
        m15406(this.f16808, c6626);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m15413(C20738 c20738) {
        m15406(this.f16809, c20738);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m15406(ArrayDeque arrayDeque, Object obj) {
        synchronized (this) {
            if (!arrayDeque.remove(obj)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        m15407();
    }
}
