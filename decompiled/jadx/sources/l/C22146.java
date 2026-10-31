package l;

import java.util.LinkedList;

/* JADX INFO: renamed from: l.᩹۟ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: L1GV */
/* JADX INFO: loaded from: classes.dex */
public final class C22146 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public LinkedList f71852 = new LinkedList();

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m49758() {
        return !this.f71852.isEmpty();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C21441 m49756() {
        LinkedList linkedList = this.f71852;
        if (linkedList.isEmpty()) {
            return null;
        }
        return (C21441) linkedList.getLast();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C21441 m49757() {
        LinkedList linkedList = this.f71852;
        if (linkedList.isEmpty()) {
            return null;
        }
        return (C21441) linkedList.removeLast();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49755(C21441 c21441) {
        LinkedList linkedList = this.f71852;
        linkedList.addLast(c21441);
        if (linkedList.size() > 100) {
            linkedList.removeFirst();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49752() {
        this.f71852.clear();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49753(C10130 c10130) {
        c10130.writeInt(-1568513661);
        LinkedList<C21441> linkedList = this.f71852;
        c10130.mo13231(linkedList.size());
        for (C21441 c21441 : linkedList) {
            c10130.writeInt(c21441.f69027);
            c10130.writeInt(c21441.f69026);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49754(C12951 c12951) {
        LinkedList linkedList = this.f71852;
        linkedList.clear();
        if (c12951.m31490(-1568513661)) {
            int iM31494 = c12951.m31494();
            for (int i = 0; i < iM31494; i++) {
                linkedList.addLast(new C21441(c12951.readInt(), c12951.readInt()));
            }
        }
    }
}
