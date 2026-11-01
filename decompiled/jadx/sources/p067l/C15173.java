package p067l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܰ֡ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1CGN */
/* JADX INFO: loaded from: classes4.dex */
public final class C15173 implements InterfaceC12631, InterfaceC14185 {

    /* JADX INFO: renamed from: ۗ */
    public final /* synthetic */ C9139 f43287;

    /* JADX INFO: renamed from: ᩶ */
    public int f43289;

    /* JADX INFO: renamed from: ۙ */
    public int f43288 = -1;

    /* JADX INFO: renamed from: ᩸ */
    public int f43290 = -1;

    /* JADX INFO: renamed from: ᩹ */
    public int f43291 = 0;

    @Override // p067l.InterfaceC12631, java.util.ListIterator
    public final /* synthetic */ void add(Object obj) {
        C6406.m14672();
        throw null;
    }

    @Override // p067l.InterfaceC12631, java.util.ListIterator
    public final /* synthetic */ void set(Object obj) {
        C6406.m14674();
        throw null;
    }

    public C15173(C9139 c9139) {
        this.f43287 = c9139;
        this.f43289 = c9139.f24734;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f43289 != -1;
    }

    @Override // p067l.InterfaceC16514
    public final boolean hasPrevious() {
        return this.f43288 != -1;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f43289;
        this.f43290 = i;
        C9139 c9139 = this.f43287;
        this.f43289 = (int) c9139.f24732[i];
        this.f43288 = i;
        int i2 = this.f43291;
        if (i2 >= 0) {
            this.f43291 = i2 + 1;
        }
        return c9139.f24727[i];
    }

    @Override // p067l.InterfaceC16514
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f43288;
        this.f43290 = i;
        C9139 c9139 = this.f43287;
        this.f43288 = (int) (c9139.f24732[i] >>> 32);
        this.f43289 = i;
        int i2 = this.f43291;
        if (i2 >= 0) {
            this.f43291 = i2 - 1;
        }
        return c9139.f24727[i];
    }

    @Override // java.util.Iterator, p067l.InterfaceC14185
    public final void forEachRemaining(Consumer consumer) {
        C9139 c9139 = this.f43287;
        Object[] objArr = c9139.f24727;
        long[] jArr = c9139.f24732;
        while (true) {
            int i = this.f43289;
            if (i == -1) {
                return;
            }
            this.f43290 = i;
            this.f43289 = (int) jArr[i];
            this.f43288 = i;
            int i2 = this.f43291;
            if (i2 >= 0) {
                this.f43291 = i2 + 1;
            }
            consumer.accept(objArr[i]);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private final void m34588() {
        if (this.f43291 >= 0) {
            return;
        }
        if (this.f43288 == -1) {
            this.f43291 = 0;
            return;
        }
        int i = this.f43289;
        C9139 c9139 = this.f43287;
        if (i == -1) {
            this.f43291 = c9139.f24737;
            return;
        }
        int i2 = c9139.f24734;
        this.f43291 = 1;
        while (i2 != this.f43288) {
            i2 = (int) c9139.f24732[i2];
            this.f43291++;
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        m34588();
        return this.f43291;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        m34588();
        return this.f43291 - 1;
    }

    @Override // p067l.InterfaceC12631, java.util.Iterator, java.util.ListIterator
    public final void remove() {
        Object obj;
        m34588();
        int i = this.f43290;
        if (i == -1) {
            throw new IllegalStateException();
        }
        int i2 = this.f43288;
        C9139 c9139 = this.f43287;
        if (i == i2) {
            this.f43291--;
            this.f43288 = (int) (c9139.f24732[i] >>> 32);
        } else {
            this.f43289 = (int) c9139.f24732[i];
        }
        c9139.f24737--;
        int i3 = this.f43288;
        if (i3 == -1) {
            c9139.f24734 = this.f43289;
        } else {
            long[] jArr = c9139.f24732;
            long j = jArr[i3];
            jArr[i3] = j ^ (((((long) this.f43289) & 4294967295L) ^ j) & 4294967295L);
        }
        int i4 = this.f43289;
        if (i4 == -1) {
            c9139.f24726 = i3;
        } else {
            long[] jArr2 = c9139.f24732;
            long j2 = jArr2[i4];
            jArr2[i4] = ((((4294967295L & ((long) i3)) << 32) ^ j2) & (-4294967296L)) ^ j2;
        }
        this.f43290 = -1;
        int i5 = c9139.f24730;
        if (i == i5) {
            c9139.f24735 = false;
            c9139.f24727[i5] = null;
            return;
        }
        Object[] objArr = c9139.f24727;
        while (true) {
            int i6 = (i + 1) & c9139.f24731;
            while (true) {
                obj = objArr[i6];
                if (obj == null) {
                    objArr[i] = null;
                    return;
                }
                int iM34881 = C15322.m34881(c9139.f24733.mo10800(obj));
                int i7 = c9139.f24731;
                int i8 = iM34881 & i7;
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
            if (this.f43289 == i6) {
                this.f43289 = i;
            }
            if (this.f43288 == i6) {
                this.f43288 = i;
            }
            c9139.m21083(i6, i);
            i = i6;
        }
    }
}
