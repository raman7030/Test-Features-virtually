package l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ܺۙᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: R6U3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15713 implements Iterable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C9365 f48465;

    public C15713() {
        this(null);
    }

    public C15713(C9365 c9365) {
        this.f48465 = c9365;
    }

    public final boolean isEmpty() {
        return this.f48465 == null;
    }

    public final Object get(int i) {
        if (i < 0 || i >= m37046()) {
            throw new IndexOutOfBoundsException("Invalid history index");
        }
        C9365 c9365 = this.f48465;
        while (true) {
            Object obj = c9365.f28439;
            if (obj != null) {
                return obj;
            }
            C9365 c9366 = c9365.f28441;
            int i2 = c9366.f28444;
            if (i < i2) {
                c9365 = c9366;
            } else {
                i -= i2;
                c9365 = c9365.f28440;
            }
        }
    }

    public final Object last() {
        return get(m37046() - 1);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C15713 m37044(Object obj) {
        C11003.requireNonNull(obj);
        return new C15713(m37043(this.f48465, new C9365(obj)));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C15713 m37045(C15713 c15713) {
        return new C15713(m37043(this.f48465, c15713.f48465));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C15713 m37047(Object obj) {
        C9365 c9365 = this.f48465;
        if (c9365 == null) {
            throw new NoSuchElementException();
        }
        return new C15713(m37041(c9365, obj));
    }

    public final C15713 removeLast() {
        C9365 c9365 = this.f48465;
        if (c9365 == null) {
            throw new NoSuchElementException();
        }
        int iM37046 = m37046() - 1;
        if (iM37046 >= 0 && iM37046 <= m37046()) {
            return new C15713(m37040(c9365, iM37046).f26426);
        }
        throw new IndexOutOfBoundsException("Invalid history count");
    }

    public final C15713 removeFirst() {
        C9365 c9365 = this.f48465;
        if (c9365 == null) {
            throw new NoSuchElementException();
        }
        if (1 <= m37046()) {
            return new C15713(m37040(c9365, 1).f26427);
        }
        throw new IndexOutOfBoundsException("Invalid history count");
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C20654(this, false);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C9365 m37041(C9365 c9365, Object obj) {
        return c9365.f28439 != null ? new C9365(obj) : new C9365(c9365.f28441, m37041(c9365.f28440, obj));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C8659 m37040(C9365 c9365, int i) {
        if (i == 0) {
            return new C8659(null, c9365);
        }
        if (i == (c9365 == null ? 0 : c9365.f28444)) {
            return new C8659(c9365, null);
        }
        C9365 c9366 = c9365.f28441;
        C9365 c9367 = c9365.f28440;
        int i2 = c9366.f28444;
        if (i < i2) {
            C8659 c8659M37040 = m37040(c9366, i);
            return new C8659(c8659M37040.f26426, m37043(c8659M37040.f26427, c9367));
        }
        C8659 c8659M37041 = m37040(c9367, i - i2);
        return new C8659(m37043(c9365.f28441, c8659M37041.f26426), c8659M37041.f26427);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C9365 m37043(C9365 c9365, C9365 c9366) {
        if (c9365 == null) {
            return c9366;
        }
        if (c9366 == null) {
            return c9365;
        }
        int i = c9365.f28438;
        int i2 = c9366.f28438;
        if (i > i2 + 1) {
            return m37042(c9365.f28441, m37043(c9365.f28440, c9366));
        }
        if (i2 > i + 1) {
            return m37042(m37043(c9365, c9366.f28441), c9366.f28440);
        }
        return new C9365(c9365, c9366);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C9365 m37042(C9365 c9365, C9365 c9366) {
        int i = c9365.f28438;
        C9365 c9367 = c9365.f28440;
        int i2 = c9366.f28438;
        C9365 c9368 = c9366.f28441;
        C9365 c9369 = c9366.f28440;
        if (i > i2 + 1) {
            C9365 c93610 = c9365.f28441;
            return c93610.f28438 >= c9367.f28438 ? new C9365(c93610, new C9365(c9367, c9366)) : new C9365(new C9365(c93610, c9367.f28441), new C9365(c9367.f28440, c9366));
        }
        if (i2 > i + 1) {
            return c9369.f28438 >= c9368.f28438 ? new C9365(new C9365(c9365, c9368), c9369) : new C9365(new C9365(c9365, c9368.f28441), new C9365(c9368.f28440, c9369));
        }
        return new C9365(c9365, c9366);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m37046() {
        C9365 c9365 = this.f48465;
        if (c9365 == null) {
            return 0;
        }
        return c9365.f28444;
    }
}
