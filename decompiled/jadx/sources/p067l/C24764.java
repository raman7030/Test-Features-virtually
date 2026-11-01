package p067l;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.PriorityQueue;

/* JADX INFO: renamed from: l.᩻۠֫, reason: contains not printable characters */
/* JADX INFO: compiled from: E7TQ */
/* JADX INFO: loaded from: classes.dex */
public final class C24764 {

    /* JADX INFO: renamed from: ֫ */
    public C18729 f78387;

    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC16046 f78388;

    /* JADX INFO: renamed from: ܳ */
    public final ArrayDeque f78389 = new ArrayDeque();

    /* JADX INFO: renamed from: ܿ */
    public final ArrayDeque f78391 = new ArrayDeque();

    /* JADX INFO: renamed from: ܽ */
    public final PriorityQueue f78390 = new PriorityQueue();

    /* JADX INFO: renamed from: ᩳ */
    public int f78392 = -1;

    public C24764(InterfaceC16046 interfaceC16046) {
        this.f78388 = interfaceC16046;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m54434(int i) {
        C23877.m52960(i >= 0);
        this.f78392 = i;
        m54432(i);
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m54437() {
        return this.f78392;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
    
        if (r9 < r0.f56001) goto L32;
     */
    /* JADX INFO: renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m54435(long j, C19203 c19203) {
        C19203 c19204;
        C18729 c18729;
        int i = this.f78392;
        if (i != 0) {
            PriorityQueue priorityQueue = this.f78390;
            if (i != -1 && priorityQueue.size() >= this.f78392) {
                C18729 c187210 = (C18729) priorityQueue.peek();
                String str = C5792.f14228;
            }
            ArrayDeque arrayDeque = this.f78389;
            if (arrayDeque.isEmpty()) {
                c19204 = new C19203();
            } else {
                c19204 = (C19203) arrayDeque.pop();
            }
            c19204.m43727(c19203.m43703());
            System.arraycopy(c19203.m43728(), c19203.m43731(), c19204.m43728(), 0, c19204.m43703());
            C18729 c187211 = this.f78387;
            if (c187211 != null && j == c187211.f56001) {
                c187211.f56000.add(c19204);
                return;
            }
            ArrayDeque arrayDeque2 = this.f78391;
            if (arrayDeque2.isEmpty()) {
                c18729 = new C18729();
            } else {
                c18729 = (C18729) arrayDeque2.pop();
            }
            ArrayList arrayList = c18729.f56000;
            C23877.m52957(j != -9223372036854775807L);
            C23877.m52960(arrayList.isEmpty());
            c18729.f56001 = j;
            arrayList.add(c19204);
            priorityQueue.add(c18729);
            this.f78387 = c18729;
            int i2 = this.f78392;
            if (i2 != -1) {
                m54432(i2);
                return;
            }
            return;
        }
        this.f78388.mo16618(j, c19203);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m54433() {
        this.f78390.clear();
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m54436() {
        m54432(0);
    }

    /* JADX INFO: renamed from: ۧ */
    private void m54432(int i) {
        ArrayList arrayList;
        while (true) {
            PriorityQueue priorityQueue = this.f78390;
            if (priorityQueue.size() <= i) {
                return;
            }
            C18729 c18729 = (C18729) priorityQueue.poll();
            String str = C5792.f14228;
            int i2 = 0;
            while (true) {
                arrayList = c18729.f56000;
                if (i2 >= arrayList.size()) {
                    break;
                }
                this.f78388.mo16618(c18729.f56001, (C19203) arrayList.get(i2));
                this.f78389.push((C19203) arrayList.get(i2));
                i2++;
            }
            arrayList.clear();
            C18729 c187210 = this.f78387;
            if (c187210 != null && c187210.f56001 == c18729.f56001) {
                this.f78387 = null;
            }
            this.f78391.push(c18729);
        }
    }
}
