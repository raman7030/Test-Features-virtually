package l;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: l.᩹ۚ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: L8SE */
/* JADX INFO: loaded from: classes.dex */
public final class C22072 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC16427 f70723;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final Object f70724;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f70725;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f70726;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final InterfaceC19251 f70727;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final CopyOnWriteArraySet f70728;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC15015 f70729;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f70730;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f70731;

    public C22072(Looper looper, InterfaceC16427 interfaceC16427, InterfaceC15015 interfaceC15015) {
        this(new CopyOnWriteArraySet(), looper, interfaceC16427, interfaceC15015, true);
    }

    public C22072(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, InterfaceC16427 interfaceC16427, InterfaceC15015 interfaceC15015, boolean z) {
        this.f70723 = interfaceC16427;
        this.f70728 = copyOnWriteArraySet;
        this.f70729 = interfaceC15015;
        this.f70724 = new Object();
        this.f70725 = new ArrayDeque();
        this.f70726 = new ArrayDeque();
        this.f70727 = interfaceC16427.mo33832(looper, new Handler.Callback() { // from class: l.ۚۚ֫
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                C22072.m49651(this.f16078);
                return true;
            }
        });
        this.f70730 = z;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49656(Object obj) {
        obj.getClass();
        synchronized (this.f70724) {
            if (this.f70731) {
                return;
            }
            this.f70728.add(new C21367(obj));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C22072 m49653(Looper looper, C17054 c17054) {
        return new C22072(this.f70728, looper, this.f70723, c17054, this.f70730);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49657(InterfaceC0612 interfaceC0612) {
        m49652();
        CopyOnWriteArraySet<C21367> copyOnWriteArraySet = this.f70728;
        for (C21367 c21367 : copyOnWriteArraySet) {
            if (c21367.f68830.equals(interfaceC0612)) {
                c21367.m48415(this.f70729);
                copyOnWriteArraySet.remove(c21367);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49655(final int i, final InterfaceC7961 interfaceC7961) {
        m49652();
        final CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(this.f70728);
        this.f70726.add(new Runnable() { // from class: l.֨ۚ֫
            @Override // java.lang.Runnable
            public final void run() {
                Iterator it = copyOnWriteArraySet.iterator();
                while (it.hasNext()) {
                    ((C21367) it.next()).m48413(i, interfaceC7961);
                }
            }
        });
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49654() {
        m49652();
        ArrayDeque arrayDeque = this.f70726;
        if (arrayDeque.isEmpty()) {
            return;
        }
        InterfaceC19251 interfaceC19251 = this.f70727;
        if (!interfaceC19251.mo17758()) {
            interfaceC19251.mo17761(interfaceC19251.mo17754(1));
        }
        ArrayDeque arrayDeque2 = this.f70725;
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

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m49659(int i, InterfaceC7961 interfaceC7961) {
        m49655(i, interfaceC7961);
        m49654();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m49658() {
        m49652();
        synchronized (this.f70724) {
            this.f70731 = true;
        }
        Iterator it = this.f70728.iterator();
        while (it.hasNext()) {
            ((C21367) it.next()).m48415(this.f70729);
        }
        this.f70728.clear();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m49651(C22072 c22072) {
        Iterator it = c22072.f70728.iterator();
        while (it.hasNext()) {
            ((C21367) it.next()).m48414(c22072.f70729);
            if (c22072.f70727.mo17758()) {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m49652() {
        if (this.f70730) {
            C22632.m50634(Thread.currentThread() == this.f70727.mo17764().getThread());
        }
    }
}
