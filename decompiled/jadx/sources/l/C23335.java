package l;

import java.util.LinkedList;
import java.util.ListIterator;

/* JADX INFO: renamed from: l.᩻֡֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 88WZ */
/* JADX INFO: loaded from: classes.dex */
public final class C23335 implements InterfaceC0072 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final char f74993;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f74994 = 0;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public LinkedList f74995 = new LinkedList();

    public C23335(char c) {
        this.f74993 = c;
    }

    @Override // l.InterfaceC0072
    /* JADX INFO: renamed from: ܽ */
    public final char mo1023() {
        return this.f74993;
    }

    @Override // l.InterfaceC0072
    /* JADX INFO: renamed from: ֫ */
    public final char mo1020() {
        return this.f74993;
    }

    @Override // l.InterfaceC0072
    /* JADX INFO: renamed from: ۧ */
    public final int mo1022() {
        return this.f74994;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m51737(InterfaceC0072 interfaceC0072) {
        int iMo1022 = interfaceC0072.mo1022();
        LinkedList linkedList = this.f74995;
        ListIterator listIterator = linkedList.listIterator();
        while (listIterator.hasNext()) {
            InterfaceC0072 interfaceC0073 = (InterfaceC0072) listIterator.next();
            int iMo1023 = interfaceC0073.mo1022();
            if (iMo1022 > iMo1023) {
                listIterator.previous();
                listIterator.add(interfaceC0072);
                return;
            } else if (iMo1022 == iMo1023) {
                throw new IllegalArgumentException("Cannot add two delimiter processors for char '" + this.f74993 + "' and minimum length " + iMo1022 + "; conflicting processors: " + interfaceC0073 + ", " + interfaceC0072);
            }
        }
        linkedList.add(interfaceC0072);
        this.f74994 = iMo1022;
    }

    @Override // l.InterfaceC0072
    /* JADX INFO: renamed from: ֫ */
    public final int mo1021(C16132 c16132, C16132 c16133) {
        int size = c16132.f49701.size();
        LinkedList<InterfaceC0072> linkedList = this.f74995;
        for (InterfaceC0072 interfaceC0072 : linkedList) {
            if (interfaceC0072.mo1022() <= size) {
                return interfaceC0072.mo1021(c16132, c16133);
            }
        }
        interfaceC0072 = (InterfaceC0072) linkedList.getFirst();
        return interfaceC0072.mo1021(c16132, c16133);
    }
}
