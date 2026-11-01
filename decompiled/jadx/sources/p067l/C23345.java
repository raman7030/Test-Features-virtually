package p067l;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: l.᩹ۚ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: L8SE */
/* JADX INFO: loaded from: classes.dex */
public final class C23345 {

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC17980 f73444;

    /* JADX INFO: renamed from: ۜ */
    public final Object f73445;

    /* JADX INFO: renamed from: ۧ */
    public final ArrayDeque f73446;

    /* JADX INFO: renamed from: ܳ */
    public final ArrayDeque f73447;

    /* JADX INFO: renamed from: ܽ */
    public final InterfaceC20664 f73448;

    /* JADX INFO: renamed from: ܿ */
    public final CopyOnWriteArraySet f73449;

    /* JADX INFO: renamed from: ᩳ */
    public final InterfaceC16638 f73450;

    /* JADX INFO: renamed from: ᩷ */
    public boolean f73451;

    /* JADX INFO: renamed from: ᩻ */
    public boolean f73452;

    public C23345(Looper looper, InterfaceC17980 interfaceC17980, InterfaceC16638 interfaceC16638) {
        this(new CopyOnWriteArraySet(), looper, interfaceC17980, interfaceC16638, true);
    }

    public C23345(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, InterfaceC17980 interfaceC17980, InterfaceC16638 interfaceC16638, boolean z) {
        this.f73444 = interfaceC17980;
        this.f73449 = copyOnWriteArraySet;
        this.f73450 = interfaceC16638;
        this.f73445 = new Object();
        this.f73446 = new ArrayDeque();
        this.f73447 = new ArrayDeque();
        this.f73448 = interfaceC17980.mo35964(looper, new Handler.Callback() { // from class: l.ۚۚ֫
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                C23345.m51989(this.f18917);
                return true;
            }
        });
        this.f73451 = z;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m51994(Object obj) {
        obj.getClass();
        synchronized (this.f73445) {
            if (this.f73452) {
                return;
            }
            this.f73449.add(new C22675(obj));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C23345 m51991(Looper looper, C18576 c18576) {
        return new C23345(this.f73449, looper, this.f73444, c18576, this.f73451);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m51995(InterfaceC2950 interfaceC2950) {
        m51990();
        CopyOnWriteArraySet<C22675> copyOnWriteArraySet = this.f73449;
        for (C22675 c22675 : copyOnWriteArraySet) {
            if (c22675.f71526.equals(interfaceC2950)) {
                c22675.m50751(this.f73450);
                copyOnWriteArraySet.remove(c22675);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m51993(final int i, final InterfaceC9934 interfaceC9934) {
        m51990();
        final CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(this.f73449);
        this.f73447.add(new Runnable() { // from class: l.֨ۚ֫
            @Override // java.lang.Runnable
            public final void run() {
                Iterator it = copyOnWriteArraySet.iterator();
                while (it.hasNext()) {
                    ((C22675) it.next()).m50749(i, interfaceC9934);
                }
            }
        });
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m51992() {
        m51990();
        ArrayDeque arrayDeque = this.f73447;
        if (arrayDeque.isEmpty()) {
            return;
        }
        InterfaceC20664 interfaceC20664 = this.f73448;
        if (!interfaceC20664.mo19705()) {
            interfaceC20664.mo19708(interfaceC20664.mo19701(1));
        }
        ArrayDeque arrayDeque2 = this.f73446;
        boolean zIsEmpty = arrayDeque2.isEmpty();
        arrayDeque2.addAll(arrayDeque);
        arrayDeque.clear();
        if (zIsEmpty) {
            while (!arrayDeque2.isEmpty()) {
                ((Runnable) arrayDeque2.peekFirst()).run();
                arrayDeque2.removeFirst();
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m51997(int i, InterfaceC9934 interfaceC9934) {
        m51993(i, interfaceC9934);
        m51992();
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m51996() {
        m51990();
        synchronized (this.f73445) {
            this.f73452 = true;
        }
        Iterator it = this.f73449.iterator();
        while (it.hasNext()) {
            ((C22675) it.next()).m50751(this.f73450);
        }
        this.f73449.clear();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m51989(C23345 c23345) {
        Iterator it = c23345.f73449.iterator();
        while (it.hasNext()) {
            ((C22675) it.next()).m50750(c23345.f73450);
            if (c23345.f73448.mo19705()) {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ܽ */
    private void m51990() {
        if (this.f73451) {
            C23877.m52960(Thread.currentThread() == this.f73448.mo19711().getThread());
        }
    }
}
