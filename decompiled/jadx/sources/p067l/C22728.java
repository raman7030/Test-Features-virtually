package p067l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩸ۜᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: VZ3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C22728 implements InterfaceC13833, InterfaceC14185 {

    /* JADX INFO: renamed from: ᩸ */
    public int f71685 = 0;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C21387 f71686;

    public C22728(C21387 c21387) {
        this.f71686 = c21387;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f71685 < this.f71686.f67467.f17107;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object[] objArr = this.f71686.f67467.f17106;
        int i = this.f71685;
        this.f71685 = i + 1;
        return objArr[i];
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.f71685;
        if (i == 0) {
            throw new IllegalStateException();
        }
        C21387 c21387 = this.f71686;
        C6634 c6634 = c21387.f67467;
        int i2 = c6634.f17107 - i;
        int[] iArr = c6634.f17111;
        System.arraycopy(iArr, i, iArr, i - 1, i2);
        Object[] objArr = c21387.f67467.f17106;
        int i3 = this.f71685;
        System.arraycopy(objArr, i3, objArr, i3 - 1, i2);
        C6634 c6635 = c21387.f67467;
        int i4 = c6635.f17107 - 1;
        c6635.f17107 = i4;
        this.f71685--;
        c6635.f17106[i4] = null;
    }

    @Override // java.util.Iterator, p067l.InterfaceC14185
    public final void forEachRemaining(Consumer consumer) {
        C6634 c6634 = this.f71686.f67467;
        Object[] objArr = c6634.f17106;
        int i = c6634.f17107;
        while (true) {
            int i2 = this.f71685;
            if (i2 >= i) {
                return;
            }
            this.f71685 = i2 + 1;
            consumer.accept(objArr[i2]);
        }
    }
}
