package p067l;

import java.util.LinkedList;

/* JADX INFO: renamed from: l.᩹۟ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: L1GV */
/* JADX INFO: loaded from: classes.dex */
public final class C23416 {

    /* JADX INFO: renamed from: ֫ */
    public LinkedList f74572 = new LinkedList();

    /* JADX INFO: renamed from: ᩳ */
    public final boolean m52096() {
        return !this.f74572.isEmpty();
    }

    /* JADX INFO: renamed from: ۧ */
    public final C22746 m52094() {
        LinkedList linkedList = this.f74572;
        if (linkedList.isEmpty()) {
            return null;
        }
        return (C22746) linkedList.getLast();
    }

    /* JADX INFO: renamed from: ܽ */
    public final C22746 m52095() {
        LinkedList linkedList = this.f74572;
        if (linkedList.isEmpty()) {
            return null;
        }
        return (C22746) linkedList.removeLast();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m52093(C22746 c22746) {
        LinkedList linkedList = this.f74572;
        linkedList.addLast(c22746);
        if (linkedList.size() > 100) {
            linkedList.removeFirst();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m52090() {
        this.f74572.clear();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m52091(C11996 c11996) {
        c11996.writeInt(-1568513661);
        LinkedList<C22746> linkedList = this.f74572;
        c11996.mo15113(linkedList.size());
        for (C22746 c22746 : linkedList) {
            c11996.writeInt(c22746.f71724);
            c11996.writeInt(c22746.f71723);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m52092(C14677 c14677) {
        LinkedList linkedList = this.f74572;
        linkedList.clear();
        if (c14677.m33577(-1568513661)) {
            int iM33581 = c14677.m33581();
            for (int i = 0; i < iM33581; i++) {
                linkedList.addLast(new C22746(c14677.readInt(), c14677.readInt()));
            }
        }
    }
}
