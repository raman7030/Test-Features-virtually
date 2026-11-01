package p067l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۘۜᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: VZ3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5964 implements InterfaceC13833, InterfaceC14185 {

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ C2610 f14757;

    /* JADX INFO: renamed from: ᩹ */
    public C16691 f14760;

    /* JADX INFO: renamed from: ᩸ */
    public int f14759 = -1;

    /* JADX INFO: renamed from: ᩶ */
    public int f14758 = 0;

    public C5964(C2610 c2610) {
        this.f14757 = c2610;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f14758 < this.f14757.f4315.f17107;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        C6634 c6634 = this.f14757.f4315;
        int i = this.f14758;
        this.f14758 = i + 1;
        this.f14759 = i;
        C16691 c16691 = new C16691(c6634, i);
        this.f14760 = c16691;
        return c16691;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.f14759 == -1) {
            throw new IllegalStateException();
        }
        this.f14759 = -1;
        C2610 c2610 = this.f14757;
        C6634 c6634 = c2610.f4315;
        int i = c6634.f17107;
        c6634.f17107 = i - 1;
        int i2 = this.f14758;
        int i3 = i2 - 1;
        this.f14758 = i3;
        int i4 = i - i2;
        int[] iArr = c6634.f17111;
        System.arraycopy(iArr, i2, iArr, i3, i4);
        Object[] objArr = c2610.f4315.f17106;
        int i5 = this.f14758;
        System.arraycopy(objArr, i5 + 1, objArr, i5, i4);
        this.f14760.f49165 = -1;
        C6634 c6635 = c2610.f4315;
        c6635.f17106[c6635.f17107] = null;
    }

    @Override // java.util.Iterator, p067l.InterfaceC14185
    public final void forEachRemaining(Consumer consumer) {
        C2610 c2610 = this.f14757;
        int i = c2610.f4315.f17107;
        while (true) {
            int i2 = this.f14758;
            if (i2 >= i) {
                return;
            }
            C6634 c6634 = c2610.f4315;
            this.f14758 = i2 + 1;
            this.f14759 = i2;
            C16691 c16691 = new C16691(c6634, i2);
            this.f14760 = c16691;
            consumer.accept(c16691);
        }
    }
}
