package p067l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ᩴۡᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0C94 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20105 implements InterfaceC16750, InterfaceC14185 {

    /* JADX INFO: renamed from: ۗ */
    public final /* synthetic */ C20776 f62198;

    /* JADX INFO: renamed from: ᩶ */
    public int f62200;

    /* JADX INFO: renamed from: ۙ */
    public int f62199 = -1;

    /* JADX INFO: renamed from: ᩸ */
    public int f62201 = -1;

    /* JADX INFO: renamed from: ᩹ */
    public int f62202 = 0;

    @Override // p067l.InterfaceC16750
    public final /* synthetic */ void add(int i) {
        C10046.m23408();
        throw null;
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void add(Object obj) {
        mo7884((Integer) obj);
    }

    @Override // java.util.Iterator, p067l.InterfaceC8705, p067l.InterfaceC16177, p067l.InterfaceC14185
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C24798.m54480(this, consumer);
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void set(Object obj) {
        mo7886((Integer) obj);
    }

    @Override // p067l.InterfaceC16750
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ void mo7883(int i) {
        C10046.m23411();
        throw null;
    }

    @Override // p067l.InterfaceC16750
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ void mo7884(Integer num) {
        C10046.m23409((InterfaceC16750) this, num);
    }

    @Override // p067l.InterfaceC16750
    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ void mo7886(Integer num) {
        C10046.m23412((InterfaceC16750) this, num);
    }

    @Override // java.util.ListIterator, p067l.InterfaceC16514
    public final Object previous() {
        return Integer.valueOf(mo7885());
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Integer next() {
        return C24798.m54479(this);
    }

    public C20105(C20776 c20776) {
        this.f62198 = c20776;
        this.f62200 = c20776.f65312;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f62200 != -1;
    }

    @Override // java.util.ListIterator, p067l.InterfaceC16514
    public final boolean hasPrevious() {
        return this.f62199 != -1;
    }

    @Override // p067l.InterfaceC16177
    public final int nextInt() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f62200;
        this.f62201 = i;
        C20776 c20776 = this.f62198;
        this.f62200 = (int) c20776.f65311[i];
        this.f62199 = i;
        int i2 = this.f62202;
        if (i2 >= 0) {
            this.f62202 = i2 + 1;
        }
        return c20776.f65306[i];
    }

    @Override // p067l.InterfaceC16750
    /* JADX INFO: renamed from: ۖ֫ */
    public final int mo7885() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f62199;
        this.f62201 = i;
        C20776 c20776 = this.f62198;
        this.f62199 = (int) (c20776.f65311[i] >>> 32);
        this.f62200 = i;
        int i2 = this.f62202;
        if (i2 >= 0) {
            this.f62202 = i2 - 1;
        }
        return c20776.f65306[i];
    }

    @Override // p067l.InterfaceC22214
    public final void forEachRemaining(IntConsumer intConsumer) {
        C20776 c20776 = this.f62198;
        int[] iArr = c20776.f65306;
        long[] jArr = c20776.f65311;
        while (true) {
            int i = this.f62200;
            if (i == -1) {
                return;
            }
            this.f62201 = i;
            this.f62200 = (int) jArr[i];
            this.f62199 = i;
            int i2 = this.f62202;
            if (i2 >= 0) {
                this.f62202 = i2 + 1;
            }
            intConsumer.accept(iArr[i]);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private final void m45534() {
        if (this.f62202 >= 0) {
            return;
        }
        if (this.f62199 == -1) {
            this.f62202 = 0;
            return;
        }
        int i = this.f62200;
        C20776 c20776 = this.f62198;
        if (i == -1) {
            this.f62202 = c20776.f65315;
            return;
        }
        int i2 = c20776.f65312;
        this.f62202 = 1;
        while (i2 != this.f62199) {
            i2 = (int) c20776.f65311[i2];
            this.f62202++;
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        m45534();
        return this.f62202;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        m45534();
        return this.f62202 - 1;
    }

    @Override // p067l.InterfaceC16750, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i;
        m45534();
        int i2 = this.f62201;
        if (i2 == -1) {
            throw new IllegalStateException();
        }
        int i3 = this.f62199;
        C20776 c20776 = this.f62198;
        if (i2 == i3) {
            this.f62202--;
            this.f62199 = (int) (c20776.f65311[i2] >>> 32);
        } else {
            this.f62200 = (int) c20776.f65311[i2];
        }
        c20776.f65315--;
        int i4 = this.f62199;
        if (i4 == -1) {
            c20776.f65312 = this.f62200;
        } else {
            long[] jArr = c20776.f65311;
            long j = jArr[i4];
            jArr[i4] = j ^ (((((long) this.f62200) & 4294967295L) ^ j) & 4294967295L);
        }
        int i5 = this.f62200;
        if (i5 == -1) {
            c20776.f65305 = i4;
        } else {
            long[] jArr2 = c20776.f65311;
            long j2 = jArr2[i5];
            jArr2[i5] = ((((4294967295L & ((long) i4)) << 32) ^ j2) & (-4294967296L)) ^ j2;
        }
        this.f62201 = -1;
        int i6 = c20776.f65309;
        if (i2 == i6) {
            c20776.f65313 = false;
            c20776.f65306[i6] = 0;
            return;
        }
        int[] iArr = c20776.f65306;
        while (true) {
            int i7 = (i2 + 1) & c20776.f65310;
            while (true) {
                i = iArr[i7];
                if (i == 0) {
                    iArr[i2] = 0;
                    return;
                }
                int iM34881 = C15322.m34881(i);
                int i8 = c20776.f65310;
                int i9 = iM34881 & i8;
                if (i2 > i7) {
                    if (i2 >= i9 && i9 > i7) {
                        break;
                    } else {
                        i7 = (i7 + 1) & i8;
                    }
                } else if (i2 >= i9 || i9 > i7) {
                    break;
                } else {
                    i7 = (i7 + 1) & i8;
                }
            }
            iArr[i2] = i;
            if (this.f62200 == i7) {
                this.f62200 = i2;
            }
            if (this.f62199 == i7) {
                this.f62199 = i2;
            }
            c20776.m46920(i7, i2);
            i2 = i7;
        }
    }
}
