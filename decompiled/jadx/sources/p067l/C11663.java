package p067l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۢᩴᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: W1E0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11663 implements InterfaceC13833, InterfaceC14185 {

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ C17696 f32518;

    /* JADX INFO: renamed from: ᩶ */
    public int f32519 = 0;

    /* JADX INFO: renamed from: ᩸ */
    public int f32520 = -1;

    /* JADX INFO: renamed from: ᩹ */
    public C21051 f32521;

    public C11663(C17696 c17696) {
        this.f32518 = c17696;
        this.f32521 = new C21051(c17696.f52859);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f32519 < this.f32518.f52859.f28587;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f32519;
        this.f32519 = i + 1;
        this.f32520 = i;
        C21051 c21051 = this.f32521;
        c21051.f66089 = i;
        return c21051;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.f32520 == -1) {
            throw new IllegalStateException();
        }
        this.f32520 = -1;
        C17696 c17696 = this.f32518;
        C10321 c10321 = c17696.f52859;
        int i = c10321.f28587;
        c10321.f28587 = i - 1;
        int i2 = this.f32519;
        int i3 = i2 - 1;
        this.f32519 = i3;
        int i4 = i - i2;
        Object[] objArr = c10321.f28591;
        System.arraycopy(objArr, i2, objArr, i3, i4);
        int[] iArr = c17696.f52859.f28586;
        int i5 = this.f32519;
        System.arraycopy(iArr, i5 + 1, iArr, i5, i4);
        this.f32521.f66089 = -1;
        C10321 c10322 = c17696.f52859;
        c10322.f28591[c10322.f28587] = null;
    }

    @Override // java.util.Iterator, p067l.InterfaceC14185
    public final void forEachRemaining(Consumer consumer) {
        int i = this.f32518.f52859.f28587;
        while (true) {
            int i2 = this.f32519;
            if (i2 >= i) {
                return;
            }
            this.f32519 = i2 + 1;
            this.f32520 = i2;
            C21051 c21051 = this.f32521;
            c21051.f66089 = i2;
            consumer.accept(c21051);
        }
    }
}
