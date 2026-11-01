package p067l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.۟ܺᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: GQL */
/* JADX INFO: loaded from: classes3.dex */
public final class C9570 implements InterfaceC13833, InterfaceC14185 {

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ C12552 f26355;

    /* JADX INFO: renamed from: ᩶ */
    public int f26356 = 0;

    /* JADX INFO: renamed from: ᩸ */
    public int f26357 = -1;

    /* JADX INFO: renamed from: ᩹ */
    public C15903 f26358;

    public C9570(C12552 c12552) {
        this.f26355 = c12552;
        this.f26358 = new C15903(c12552.f35271);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f26356 < this.f26355.f35271.f31141;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f26356;
        this.f26356 = i + 1;
        this.f26357 = i;
        C15903 c15903 = this.f26358;
        c15903.f46008 = i;
        return c15903;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.f26357 == -1) {
            throw new IllegalStateException();
        }
        this.f26357 = -1;
        C12552 c12552 = this.f26355;
        C11211 c11211 = c12552.f35271;
        int i = c11211.f31141;
        c11211.f31141 = i - 1;
        int i2 = this.f26356;
        int i3 = i2 - 1;
        this.f26356 = i3;
        int i4 = i - i2;
        long[] jArr = c11211.f31145;
        System.arraycopy(jArr, i2, jArr, i3, i4);
        Object[] objArr = c12552.f35271.f31140;
        int i5 = this.f26356;
        System.arraycopy(objArr, i5 + 1, objArr, i5, i4);
        this.f26358.f46008 = -1;
        C11211 c11212 = c12552.f35271;
        c11212.f31140[c11212.f31141] = null;
    }

    @Override // java.util.Iterator, p067l.InterfaceC14185
    public final void forEachRemaining(Consumer consumer) {
        int i = this.f26355.f35271.f31141;
        while (true) {
            int i2 = this.f26356;
            if (i2 >= i) {
                return;
            }
            this.f26356 = i2 + 1;
            this.f26357 = i2;
            C15903 c15903 = this.f26358;
            c15903.f46008 = i2;
            consumer.accept(c15903);
        }
    }
}
