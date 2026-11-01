package p067l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ܺۙᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: R6U3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17302 implements Iterable {

    /* JADX INFO: renamed from: ᩸ */
    public final C11269 f51603;

    public C17302() {
        this(null);
    }

    public C17302(C11269 c11269) {
        this.f51603 = c11269;
    }

    public final boolean isEmpty() {
        return this.f51603 == null;
    }

    public final Object get(int i) {
        if (i < 0 || i >= m39213()) {
            throw new IndexOutOfBoundsException("Invalid history index");
        }
        C11269 c11269 = this.f51603;
        while (true) {
            Object obj = c11269.f31388;
            if (obj != null) {
                return obj;
            }
            C11269 c112610 = c11269.f31390;
            int i2 = c112610.f31393;
            if (i < i2) {
                c11269 = c112610;
            } else {
                i -= i2;
                c11269 = c11269.f31389;
            }
        }
    }

    public final Object last() {
        return get(m39213() - 1);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C17302 m39211(Object obj) {
        C12826.requireNonNull(obj);
        return new C17302(m39210(this.f51603, new C11269(obj)));
    }

    /* JADX INFO: renamed from: ֫ */
    public final C17302 m39212(C17302 c17302) {
        return new C17302(m39210(this.f51603, c17302.f51603));
    }

    /* JADX INFO: renamed from: ۧ */
    public final C17302 m39214(Object obj) {
        C11269 c11269 = this.f51603;
        if (c11269 == null) {
            throw new NoSuchElementException();
        }
        return new C17302(m39208(c11269, obj));
    }

    public final C17302 removeLast() {
        C11269 c11269 = this.f51603;
        if (c11269 == null) {
            throw new NoSuchElementException();
        }
        int iM39213 = m39213() - 1;
        if (iM39213 >= 0 && iM39213 <= m39213()) {
            return new C17302(m39207(c11269, iM39213).f29344);
        }
        throw new IndexOutOfBoundsException("Invalid history count");
    }

    public final C17302 removeFirst() {
        C11269 c11269 = this.f51603;
        if (c11269 == null) {
            throw new NoSuchElementException();
        }
        if (1 <= m39213()) {
            return new C17302(m39207(c11269, 1).f29345);
        }
        throw new IndexOutOfBoundsException("Invalid history count");
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C21998(this, false);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C11269 m39208(C11269 c11269, Object obj) {
        return c11269.f31388 != null ? new C11269(obj) : new C11269(c11269.f31390, m39208(c11269.f31389, obj));
    }

    /* JADX INFO: renamed from: ֫ */
    public static C10598 m39207(C11269 c11269, int i) {
        if (i == 0) {
            return new C10598(null, c11269);
        }
        if (i == (c11269 == null ? 0 : c11269.f31393)) {
            return new C10598(c11269, null);
        }
        C11269 c112610 = c11269.f31390;
        C11269 c112611 = c11269.f31389;
        int i2 = c112610.f31393;
        if (i < i2) {
            C10598 c10598M39207 = m39207(c112610, i);
            return new C10598(c10598M39207.f29344, m39210(c10598M39207.f29345, c112611));
        }
        C10598 c10598M39208 = m39207(c112611, i - i2);
        return new C10598(m39210(c11269.f31390, c10598M39208.f29344), c10598M39208.f29345);
    }

    /* JADX INFO: renamed from: ۧ */
    public static C11269 m39210(C11269 c11269, C11269 c112610) {
        if (c11269 == null) {
            return c112610;
        }
        if (c112610 == null) {
            return c11269;
        }
        int i = c11269.f31387;
        int i2 = c112610.f31387;
        if (i > i2 + 1) {
            return m39209(c11269.f31390, m39210(c11269.f31389, c112610));
        }
        if (i2 > i + 1) {
            return m39209(m39210(c11269, c112610.f31390), c112610.f31389);
        }
        return new C11269(c11269, c112610);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C11269 m39209(C11269 c11269, C11269 c112610) {
        int i = c11269.f31387;
        C11269 c112611 = c11269.f31389;
        int i2 = c112610.f31387;
        C11269 c112612 = c112610.f31390;
        C11269 c112613 = c112610.f31389;
        if (i > i2 + 1) {
            C11269 c112614 = c11269.f31390;
            return c112614.f31387 >= c112611.f31387 ? new C11269(c112614, new C11269(c112611, c112610)) : new C11269(new C11269(c112614, c112611.f31390), new C11269(c112611.f31389, c112610));
        }
        if (i2 > i + 1) {
            return c112613.f31387 >= c112612.f31387 ? new C11269(new C11269(c11269, c112612), c112613) : new C11269(new C11269(c11269, c112612.f31390), new C11269(c112612.f31389, c112613));
        }
        return new C11269(c11269, c112610);
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m39213() {
        C11269 c11269 = this.f51603;
        if (c11269 == null) {
            return 0;
        }
        return c11269.f31393;
    }
}
