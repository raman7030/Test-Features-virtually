package p067l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩻ۖᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: GQL */
/* JADX INFO: loaded from: classes.dex */
public final class C24621 implements InterfaceC13833, InterfaceC14185 {

    /* JADX INFO: renamed from: ᩸ */
    public int f77934 = 0;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C21940 f77935;

    public C24621(C21940 c21940) {
        this.f77935 = c21940;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f77934 < this.f77935.f68977.f31141;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object[] objArr = this.f77935.f68977.f31140;
        int i = this.f77934;
        this.f77934 = i + 1;
        return objArr[i];
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.f77934;
        if (i == 0) {
            throw new IllegalStateException();
        }
        C21940 c21940 = this.f77935;
        C11211 c11211 = c21940.f68977;
        int i2 = c11211.f31141 - i;
        long[] jArr = c11211.f31145;
        System.arraycopy(jArr, i, jArr, i - 1, i2);
        Object[] objArr = c21940.f68977.f31140;
        int i3 = this.f77934;
        System.arraycopy(objArr, i3, objArr, i3 - 1, i2);
        C11211 c11212 = c21940.f68977;
        int i4 = c11212.f31141 - 1;
        c11212.f31141 = i4;
        this.f77934--;
        c11212.f31140[i4] = null;
    }

    @Override // java.util.Iterator, p067l.InterfaceC14185
    public final void forEachRemaining(Consumer consumer) {
        C11211 c11211 = this.f77935.f68977;
        Object[] objArr = c11211.f31140;
        int i = c11211.f31141;
        while (true) {
            int i2 = this.f77934;
            if (i2 >= i) {
                return;
            }
            this.f77934 = i2 + 1;
            consumer.accept(objArr[i2]);
        }
    }
}
