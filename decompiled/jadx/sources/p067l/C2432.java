package p067l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.֡֡ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 21EP */
/* JADX INFO: loaded from: classes2.dex */
public final class C2432 implements InterfaceC13833, InterfaceC14185 {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ C3103 f3753;

    /* JADX INFO: renamed from: ᩸ */
    public int f3754 = -1;

    /* JADX INFO: renamed from: ᩹ */
    public int f3755 = 0;

    public C2432(C3103 c3103) {
        this.f3753 = c3103;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3755 < this.f3753.f5644;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object[] objArr = this.f3753.f5643;
        int i = this.f3755;
        this.f3755 = i + 1;
        this.f3754 = i;
        return objArr[i];
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.f3754 == -1) {
            throw new IllegalStateException();
        }
        this.f3754 = -1;
        C3103 c3103 = this.f3753;
        int i = c3103.f5644;
        c3103.f5644 = i - 1;
        int i2 = this.f3755;
        int i3 = i2 - 1;
        this.f3755 = i3;
        Object[] objArr = c3103.f5643;
        System.arraycopy(objArr, i2, objArr, i3, i - i2);
        c3103.f5643[c3103.f5644] = null;
    }

    @Override // java.util.Iterator, p067l.InterfaceC14185
    public final void forEachRemaining(Consumer consumer) {
        C3103 c3103 = this.f3753;
        Object[] objArr = c3103.f5643;
        while (true) {
            int i = this.f3755;
            if (i >= c3103.f5644) {
                return;
            }
            this.f3755 = i + 1;
            consumer.accept(objArr[i]);
        }
    }
}
