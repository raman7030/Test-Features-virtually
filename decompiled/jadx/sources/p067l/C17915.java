package p067l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.ܽۖᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: GQL */
/* JADX INFO: loaded from: classes5.dex */
public final class C17915 implements InterfaceC24660, InterfaceC14185 {

    /* JADX INFO: renamed from: ᩸ */
    public int f53518 = 0;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C18586 f53519;

    @Override // p067l.InterfaceC8802, java.util.Iterator, p067l.InterfaceC14185
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C15942.m36199(this, consumer);
    }

    @Override // java.util.Iterator
    public final Long next() {
        return Long.valueOf(nextLong());
    }

    public C17915(C18586 c18586) {
        this.f53519 = c18586;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f53518 < this.f53519.f55499.f31141;
    }

    @Override // p067l.InterfaceC8802
    public final long nextLong() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        long[] jArr = this.f53519.f55499.f31145;
        int i = this.f53518;
        this.f53518 = i + 1;
        return jArr[i];
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.f53518;
        if (i == 0) {
            throw new IllegalStateException();
        }
        C18586 c18586 = this.f53519;
        C11211 c11211 = c18586.f55499;
        int i2 = c11211.f31141 - i;
        long[] jArr = c11211.f31145;
        System.arraycopy(jArr, i, jArr, i - 1, i2);
        Object[] objArr = c18586.f55499.f31140;
        int i3 = this.f53518;
        System.arraycopy(objArr, i3, objArr, i3 - 1, i2);
        C11211 c11212 = c18586.f55499;
        int i4 = c11212.f31141 - 1;
        c11212.f31141 = i4;
        this.f53518--;
        c11212.f31140[i4] = null;
    }

    @Override // p067l.InterfaceC22214
    public final void forEachRemaining(LongConsumer longConsumer) {
        C11211 c11211 = this.f53519.f55499;
        long[] jArr = c11211.f31145;
        int i = c11211.f31141;
        while (true) {
            int i2 = this.f53518;
            if (i2 >= i) {
                return;
            }
            this.f53518 = i2 + 1;
            longConsumer.accept(jArr[i2]);
        }
    }
}
