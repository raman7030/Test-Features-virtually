package p067l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ᩴۜᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: VZ3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20046 implements InterfaceC13833, InterfaceC14185 {

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ C2610 f60916;

    /* JADX INFO: renamed from: ᩶ */
    public int f60917 = 0;

    /* JADX INFO: renamed from: ᩸ */
    public int f60918 = -1;

    /* JADX INFO: renamed from: ᩹ */
    public C16691 f60919;

    public C20046(C2610 c2610) {
        this.f60916 = c2610;
        this.f60919 = new C16691(c2610.f4315);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f60917 < this.f60916.f4315.f17107;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f60917;
        this.f60917 = i + 1;
        this.f60918 = i;
        C16691 c16691 = this.f60919;
        c16691.f49165 = i;
        return c16691;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.f60918 == -1) {
            throw new IllegalStateException();
        }
        this.f60918 = -1;
        C2610 c2610 = this.f60916;
        C6634 c6634 = c2610.f4315;
        int i = c6634.f17107;
        c6634.f17107 = i - 1;
        int i2 = this.f60917;
        int i3 = i2 - 1;
        this.f60917 = i3;
        int i4 = i - i2;
        int[] iArr = c6634.f17111;
        System.arraycopy(iArr, i2, iArr, i3, i4);
        Object[] objArr = c2610.f4315.f17106;
        int i5 = this.f60917;
        System.arraycopy(objArr, i5 + 1, objArr, i5, i4);
        this.f60919.f49165 = -1;
        C6634 c6635 = c2610.f4315;
        c6635.f17106[c6635.f17107] = null;
    }

    @Override // java.util.Iterator, p067l.InterfaceC14185
    public final void forEachRemaining(Consumer consumer) {
        int i = this.f60916.f4315.f17107;
        while (true) {
            int i2 = this.f60917;
            if (i2 >= i) {
                return;
            }
            this.f60917 = i2 + 1;
            this.f60918 = i2;
            C16691 c16691 = this.f60919;
            c16691.f49165 = i2;
            consumer.accept(c16691);
        }
    }
}
