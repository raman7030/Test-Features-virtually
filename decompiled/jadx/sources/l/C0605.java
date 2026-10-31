package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.֡ᩴᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: W1E0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0605 implements InterfaceC6667, InterfaceC12433 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f2348 = 0;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1311 f2349;

    @Override // l.InterfaceC6667, l.InterfaceC14529, java.util.Iterator, l.InterfaceC12433
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C23600.m52077(this, consumer);
    }

    @Override // java.util.Iterator
    public final Integer next() {
        return Integer.valueOf(nextInt());
    }

    public C0605(C1311 c1311) {
        this.f2349 = c1311;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f2348 < this.f2349.f4712.f25674;
    }

    @Override // l.InterfaceC14529
    public final int nextInt() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int[] iArr = this.f2349.f4712.f25673;
        int i = this.f2348;
        this.f2348 = i + 1;
        return iArr[i];
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.f2348;
        if (i == 0) {
            throw new IllegalStateException();
        }
        C1311 c1311 = this.f2349;
        C8367 c8367 = c1311.f4712;
        int i2 = c8367.f25674 - i;
        Object[] objArr = c8367.f25678;
        System.arraycopy(objArr, i, objArr, i - 1, i2);
        int[] iArr = c1311.f4712.f25673;
        int i3 = this.f2348;
        System.arraycopy(iArr, i3, iArr, i3 - 1, i2);
        C8367 c8368 = c1311.f4712;
        int i4 = c8368.f25674 - 1;
        c8368.f25674 = i4;
        this.f2348--;
        c8368.f25678[i4] = null;
    }

    @Override // l.InterfaceC20881
    public final void forEachRemaining(IntConsumer intConsumer) {
        C8367 c8367 = this.f2349.f4712;
        int[] iArr = c8367.f25673;
        int i = c8367.f25674;
        while (true) {
            int i2 = this.f2348;
            if (i2 >= i) {
                return;
            }
            this.f2348 = i2 + 1;
            intConsumer.accept(iArr[i2]);
        }
    }
}
