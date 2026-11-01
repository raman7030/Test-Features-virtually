package p067l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩷ᩴᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: W1E0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C22392 implements InterfaceC13833, InterfaceC14185 {

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ C17696 f70653;

    /* JADX INFO: renamed from: ᩹ */
    public C21051 f70656;

    /* JADX INFO: renamed from: ᩸ */
    public int f70655 = -1;

    /* JADX INFO: renamed from: ᩶ */
    public int f70654 = 0;

    public C22392(C17696 c17696) {
        this.f70653 = c17696;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f70654 < this.f70653.f52859.f28587;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        C10321 c10321 = this.f70653.f52859;
        int i = this.f70654;
        this.f70654 = i + 1;
        this.f70655 = i;
        C21051 c21051 = new C21051(c10321, i);
        this.f70656 = c21051;
        return c21051;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.f70655 == -1) {
            throw new IllegalStateException();
        }
        this.f70655 = -1;
        C17696 c17696 = this.f70653;
        C10321 c10321 = c17696.f52859;
        int i = c10321.f28587;
        c10321.f28587 = i - 1;
        int i2 = this.f70654;
        int i3 = i2 - 1;
        this.f70654 = i3;
        int i4 = i - i2;
        Object[] objArr = c10321.f28591;
        System.arraycopy(objArr, i2, objArr, i3, i4);
        int[] iArr = c17696.f52859.f28586;
        int i5 = this.f70654;
        System.arraycopy(iArr, i5 + 1, iArr, i5, i4);
        this.f70656.f66089 = -1;
        C10321 c10322 = c17696.f52859;
        c10322.f28591[c10322.f28587] = null;
    }

    @Override // java.util.Iterator, p067l.InterfaceC14185
    public final void forEachRemaining(Consumer consumer) {
        C17696 c17696 = this.f70653;
        int i = c17696.f52859.f28587;
        while (true) {
            int i2 = this.f70654;
            if (i2 >= i) {
                return;
            }
            C10321 c10321 = c17696.f52859;
            this.f70654 = i2 + 1;
            this.f70655 = i2;
            C21051 c21051 = new C21051(c10321, i2);
            this.f70656 = c21051;
            consumer.accept(c21051);
        }
    }
}
