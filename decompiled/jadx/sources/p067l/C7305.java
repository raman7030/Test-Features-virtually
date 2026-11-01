package p067l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۚۜᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: VZ3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7305 implements InterfaceC8705, InterfaceC14185 {

    /* JADX INFO: renamed from: ᩸ */
    public int f19120 = 0;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C9987 f19121;

    @Override // p067l.InterfaceC8705, p067l.InterfaceC16177, java.util.Iterator, p067l.InterfaceC14185
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C24798.m54480(this, consumer);
    }

    @Override // java.util.Iterator
    public final Integer next() {
        return Integer.valueOf(nextInt());
    }

    public C7305(C9987 c9987) {
        this.f19121 = c9987;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f19120 < this.f19121.f27668.f17107;
    }

    @Override // p067l.InterfaceC16177
    public final int nextInt() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int[] iArr = this.f19121.f27668.f17111;
        int i = this.f19120;
        this.f19120 = i + 1;
        return iArr[i];
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.f19120;
        if (i == 0) {
            throw new IllegalStateException();
        }
        C9987 c9987 = this.f19121;
        C6634 c6634 = c9987.f27668;
        int i2 = c6634.f17107 - i;
        int[] iArr = c6634.f17111;
        System.arraycopy(iArr, i, iArr, i - 1, i2);
        Object[] objArr = c9987.f27668.f17106;
        int i3 = this.f19120;
        System.arraycopy(objArr, i3, objArr, i3 - 1, i2);
        C6634 c6635 = c9987.f27668;
        int i4 = c6635.f17107 - 1;
        c6635.f17107 = i4;
        this.f19120--;
        c6635.f17106[i4] = null;
    }

    @Override // p067l.InterfaceC22214
    public final void forEachRemaining(IntConsumer intConsumer) {
        C6634 c6634 = this.f19121.f27668;
        int[] iArr = c6634.f17111;
        int i = c6634.f17107;
        while (true) {
            int i2 = this.f19120;
            if (i2 >= i) {
                return;
            }
            this.f19120 = i2 + 1;
            intConsumer.accept(iArr[i2]);
        }
    }
}
