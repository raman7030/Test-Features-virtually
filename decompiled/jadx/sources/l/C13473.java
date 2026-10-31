package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܰ֡ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1CGN */
/* JADX INFO: loaded from: classes4.dex */
public final class C13473 implements InterfaceC10798, InterfaceC12433 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7124 f40217;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f40219;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f40218 = -1;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f40220 = -1;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f40221 = 0;

    @Override // l.InterfaceC10798, java.util.ListIterator
    public final /* synthetic */ void add(Object obj) {
        C4248.m12792();
        throw null;
    }

    @Override // l.InterfaceC10798, java.util.ListIterator
    public final /* synthetic */ void set(Object obj) {
        C4248.m12794();
        throw null;
    }

    public C13473(C7124 c7124) {
        this.f40217 = c7124;
        this.f40219 = c7124.f21855;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f40219 != -1;
    }

    @Override // l.InterfaceC14884
    public final boolean hasPrevious() {
        return this.f40218 != -1;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f40219;
        this.f40220 = i;
        C7124 c7124 = this.f40217;
        this.f40219 = (int) c7124.f21853[i];
        this.f40218 = i;
        int i2 = this.f40221;
        if (i2 >= 0) {
            this.f40221 = i2 + 1;
        }
        return c7124.f21848[i];
    }

    @Override // l.InterfaceC14884
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f40218;
        this.f40220 = i;
        C7124 c7124 = this.f40217;
        this.f40218 = (int) (c7124.f21853[i] >>> 32);
        this.f40219 = i;
        int i2 = this.f40221;
        if (i2 >= 0) {
            this.f40221 = i2 - 1;
        }
        return c7124.f21848[i];
    }

    @Override // java.util.Iterator, l.InterfaceC12433
    public final void forEachRemaining(Consumer consumer) {
        C7124 c7124 = this.f40217;
        Object[] objArr = c7124.f21848;
        long[] jArr = c7124.f21853;
        while (true) {
            int i = this.f40219;
            if (i == -1) {
                return;
            }
            this.f40220 = i;
            this.f40219 = (int) jArr[i];
            this.f40218 = i;
            int i2 = this.f40221;
            if (i2 >= 0) {
                this.f40221 = i2 + 1;
            }
            consumer.accept(objArr[i]);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private final void m32486() {
        if (this.f40221 >= 0) {
            return;
        }
        if (this.f40218 == -1) {
            this.f40221 = 0;
            return;
        }
        int i = this.f40219;
        C7124 c7124 = this.f40217;
        if (i == -1) {
            this.f40221 = c7124.f21858;
            return;
        }
        int i2 = c7124.f21855;
        this.f40221 = 1;
        while (i2 != this.f40218) {
            i2 = (int) c7124.f21853[i2];
            this.f40221++;
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        m32486();
        return this.f40221;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        m32486();
        return this.f40221 - 1;
    }

    @Override // l.InterfaceC10798, java.util.Iterator, java.util.ListIterator
    public final void remove() {
        Object obj;
        m32486();
        int i = this.f40220;
        if (i == -1) {
            throw new IllegalStateException();
        }
        int i2 = this.f40218;
        C7124 c7124 = this.f40217;
        if (i == i2) {
            this.f40221--;
            this.f40218 = (int) (c7124.f21853[i] >>> 32);
        } else {
            this.f40219 = (int) c7124.f21853[i];
        }
        c7124.f21858--;
        int i3 = this.f40218;
        if (i3 == -1) {
            c7124.f21855 = this.f40219;
        } else {
            long[] jArr = c7124.f21853;
            long j = jArr[i3];
            jArr[i3] = j ^ (((((long) this.f40219) & 4294967295L) ^ j) & 4294967295L);
        }
        int i4 = this.f40219;
        if (i4 == -1) {
            c7124.f21847 = i3;
        } else {
            long[] jArr2 = c7124.f21853;
            long j2 = jArr2[i4];
            jArr2[i4] = ((((4294967295L & ((long) i3)) << 32) ^ j2) & (-4294967296L)) ^ j2;
        }
        this.f40220 = -1;
        int i5 = c7124.f21851;
        if (i == i5) {
            c7124.f21856 = false;
            c7124.f21848[i5] = null;
            return;
        }
        Object[] objArr = c7124.f21848;
        while (true) {
            int i6 = (i + 1) & c7124.f21852;
            while (true) {
                obj = objArr[i6];
                if (obj == null) {
                    objArr[i] = null;
                    return;
                }
                int iM32766 = C13630.m32766(c7124.f21854.mo8733(obj));
                int i7 = c7124.f21852;
                int i8 = iM32766 & i7;
                if (i > i6) {
                    if (i >= i8 && i8 > i6) {
                        break;
                    } else {
                        i6 = (i6 + 1) & i7;
                    }
                } else if (i >= i8 || i8 > i6) {
                    break;
                } else {
                    i6 = (i6 + 1) & i7;
                }
            }
            objArr[i] = obj;
            if (this.f40219 == i6) {
                this.f40219 = i;
            }
            if (this.f40218 == i6) {
                this.f40218 = i;
            }
            c7124.m19140(i6, i);
            i = i6;
        }
    }
}
