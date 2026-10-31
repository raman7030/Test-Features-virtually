package l;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.PriorityQueue;

/* JADX INFO: renamed from: l.᩻۠֫, reason: contains not printable characters */
/* JADX INFO: compiled from: E7TQ */
/* JADX INFO: loaded from: classes.dex */
public final class C23565 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C17215 f75641;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC14392 f75642;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f75643 = new ArrayDeque();

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f75645 = new ArrayDeque();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final PriorityQueue f75644 = new PriorityQueue();

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f75646 = -1;

    public C23565(InterfaceC14392 interfaceC14392) {
        this.f75642 = interfaceC14392;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m52032(int i) {
        C22632.m50634(i >= 0);
        this.f75646 = i;
        m52030(i);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m52035() {
        return this.f75646;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
    
        if (r9 < r0.f52819) goto L32;
     */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m52033(long j, C17714 c17714) {
        C17714 c17715;
        C17215 c17215;
        int i = this.f75646;
        if (i != 0) {
            PriorityQueue priorityQueue = this.f75644;
            if (i != -1 && priorityQueue.size() >= this.f75646) {
                C17215 c17216 = (C17215) priorityQueue.peek();
                String str = C3603.f11424;
            }
            ArrayDeque arrayDeque = this.f75643;
            if (arrayDeque.isEmpty()) {
                c17715 = new C17714();
            } else {
                c17715 = (C17714) arrayDeque.pop();
            }
            c17715.m41481(c17714.m41457());
            System.arraycopy(c17714.m41482(), c17714.m41485(), c17715.m41482(), 0, c17715.m41457());
            C17215 c17217 = this.f75641;
            if (c17217 != null && j == c17217.f52819) {
                c17217.f52818.add(c17715);
                return;
            }
            ArrayDeque arrayDeque2 = this.f75645;
            if (arrayDeque2.isEmpty()) {
                c17215 = new C17215();
            } else {
                c17215 = (C17215) arrayDeque2.pop();
            }
            ArrayList arrayList = c17215.f52818;
            C22632.m50631(j != -9223372036854775807L);
            C22632.m50634(arrayList.isEmpty());
            c17215.f52819 = j;
            arrayList.add(c17715);
            priorityQueue.add(c17215);
            this.f75641 = c17215;
            int i2 = this.f75646;
            if (i2 != -1) {
                m52030(i2);
                return;
            }
            return;
        }
        this.f75642.mo14710(j, c17714);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m52031() {
        this.f75644.clear();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m52034() {
        m52030(0);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m52030(int i) {
        ArrayList arrayList;
        while (true) {
            PriorityQueue priorityQueue = this.f75644;
            if (priorityQueue.size() <= i) {
                return;
            }
            C17215 c17215 = (C17215) priorityQueue.poll();
            String str = C3603.f11424;
            int i2 = 0;
            while (true) {
                arrayList = c17215.f52818;
                if (i2 >= arrayList.size()) {
                    break;
                }
                this.f75642.mo14710(c17215.f52819, (C17714) arrayList.get(i2));
                this.f75643.push((C17714) arrayList.get(i2));
                i2++;
            }
            arrayList.clear();
            C17215 c17216 = this.f75641;
            if (c17216 != null && c17216.f52819 == c17215.f52819) {
                this.f75641 = null;
            }
            this.f75645.push(c17215);
        }
    }
}
