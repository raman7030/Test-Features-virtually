package p067l;

import java.util.LinkedList;
import java.util.ListIterator;

/* JADX INFO: renamed from: l.᩻֡֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 88WZ */
/* JADX INFO: loaded from: classes.dex */
public final class C24545 implements InterfaceC2436 {

    /* JADX INFO: renamed from: ֫ */
    public final char f77740;

    /* JADX INFO: renamed from: ۧ */
    public int f77741 = 0;

    /* JADX INFO: renamed from: ܽ */
    public LinkedList f77742 = new LinkedList();

    public C24545(char c) {
        this.f77740 = c;
    }

    @Override // p067l.InterfaceC2436
    /* JADX INFO: renamed from: ܽ */
    public final char mo3419() {
        return this.f77740;
    }

    @Override // p067l.InterfaceC2436
    /* JADX INFO: renamed from: ֫ */
    public final char mo3416() {
        return this.f77740;
    }

    @Override // p067l.InterfaceC2436
    /* JADX INFO: renamed from: ۧ */
    public final int mo3418() {
        return this.f77741;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m54134(InterfaceC2436 interfaceC2436) {
        int iMo3418 = interfaceC2436.mo3418();
        LinkedList linkedList = this.f77742;
        ListIterator listIterator = linkedList.listIterator();
        while (listIterator.hasNext()) {
            InterfaceC2436 interfaceC2437 = (InterfaceC2436) listIterator.next();
            int iMo3419 = interfaceC2437.mo3418();
            if (iMo3418 > iMo3419) {
                listIterator.previous();
                listIterator.add(interfaceC2436);
                return;
            } else if (iMo3418 == iMo3419) {
                throw new IllegalArgumentException("Cannot add two delimiter processors for char '" + this.f77740 + "' and minimum length " + iMo3418 + "; conflicting processors: " + interfaceC2437 + ", " + interfaceC2436);
            }
        }
        linkedList.add(interfaceC2436);
        this.f77741 = iMo3418;
    }

    @Override // p067l.InterfaceC2436
    /* JADX INFO: renamed from: ֫ */
    public final int mo3417(C17700 c17700, C17700 c17701) {
        int size = c17700.f52867.size();
        LinkedList<InterfaceC2436> linkedList = this.f77742;
        for (InterfaceC2436 interfaceC2436 : linkedList) {
            if (interfaceC2436.mo3418() <= size) {
                return interfaceC2436.mo3417(c17700, c17701);
            }
        }
        interfaceC2436 = (InterfaceC2436) linkedList.getFirst();
        return interfaceC2436.mo3417(c17700, c17701);
    }
}
