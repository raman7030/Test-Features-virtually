package p067l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.֡ᩴᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: W1E0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2944 implements InterfaceC8705, InterfaceC14185 {

    /* JADX INFO: renamed from: ᩸ */
    public int f5122 = 0;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C3615 f5123;

    @Override // p067l.InterfaceC8705, p067l.InterfaceC16177, java.util.Iterator, p067l.InterfaceC14185
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C24798.m54480(this, consumer);
    }

    @Override // java.util.Iterator
    public final Integer next() {
        return Integer.valueOf(nextInt());
    }

    public C2944(C3615 c3615) {
        this.f5123 = c3615;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f5122 < this.f5123.f7483.f28587;
    }

    @Override // p067l.InterfaceC16177
    public final int nextInt() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int[] iArr = this.f5123.f7483.f28586;
        int i = this.f5122;
        this.f5122 = i + 1;
        return iArr[i];
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.f5122;
        if (i == 0) {
            throw new IllegalStateException();
        }
        C3615 c3615 = this.f5123;
        C10321 c10321 = c3615.f7483;
        int i2 = c10321.f28587 - i;
        Object[] objArr = c10321.f28591;
        System.arraycopy(objArr, i, objArr, i - 1, i2);
        int[] iArr = c3615.f7483.f28586;
        int i3 = this.f5122;
        System.arraycopy(iArr, i3, iArr, i3 - 1, i2);
        C10321 c10322 = c3615.f7483;
        int i4 = c10322.f28587 - 1;
        c10322.f28587 = i4;
        this.f5122--;
        c10322.f28591[i4] = null;
    }

    @Override // p067l.InterfaceC22214
    public final void forEachRemaining(IntConsumer intConsumer) {
        C10321 c10321 = this.f5123.f7483;
        int[] iArr = c10321.f28586;
        int i = c10321.f28587;
        while (true) {
            int i2 = this.f5122;
            if (i2 >= i) {
                return;
            }
            this.f5122 = i2 + 1;
            intConsumer.accept(iArr[i2]);
        }
    }
}
