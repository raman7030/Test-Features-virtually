package l;

import java.util.ArrayDeque;

/* JADX INFO: renamed from: l.᩸ۧܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D70T */
/* JADX INFO: loaded from: classes4.dex */
public final class C21541 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f69227 = new ArrayDeque();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C15189 m48698() {
        ArrayDeque arrayDeque = this.f69227;
        C18013 c18013 = (C18013) arrayDeque.peekLast();
        return new C15189(arrayDeque.size(), c18013 == null ? 0 : c18013.length());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C9047 m48697(int i, byte[] bArr) {
        if (i == 0) {
            return null;
        }
        int i2 = 0;
        C9047 c9047M45139 = null;
        while (i > 0) {
            ArrayDeque arrayDeque = this.f69227;
            C18013 c18013 = (C18013) arrayDeque.peekLast();
            if (c18013 == null || c18013.m42068() == 0) {
                c18013 = new C18013(65536);
                arrayDeque.addLast(c18013);
            }
            int iMin = Math.min(i, c18013.m42068());
            c9047M45139 = C19631.m45139(c9047M45139, C19631.m45108(new C21042(c18013, c18013.m42069(i2, iMin, bArr), iMin, null)));
            i2 += iMin;
            i -= iMin;
        }
        return c9047M45139;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m48699(C15189 c15189) {
        ArrayDeque arrayDeque;
        while (true) {
            arrayDeque = this.f69227;
            if (arrayDeque.size() <= c15189.f46404) {
                break;
            } else {
                arrayDeque.removeLast();
            }
        }
        C18013 c18013 = (C18013) arrayDeque.peekLast();
        if (c18013 != null) {
            c18013.m42067(c15189.f46405);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m48700() {
        while (true) {
            ArrayDeque arrayDeque = this.f69227;
            if (arrayDeque.size() <= 1) {
                return;
            } else {
                arrayDeque.removeFirst();
            }
        }
    }
}
