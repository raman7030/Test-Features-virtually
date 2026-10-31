package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۚۜᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: VZ3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5194 implements InterfaceC6667, InterfaceC12433 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f16279 = 0;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8016 f16280;

    @Override // l.InterfaceC6667, l.InterfaceC14529, java.util.Iterator, l.InterfaceC12433
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C23600.m52077(this, consumer);
    }

    @Override // java.util.Iterator
    public final Integer next() {
        return Integer.valueOf(nextInt());
    }

    public C5194(C8016 c8016) {
        this.f16280 = c8016;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f16279 < this.f16280.f24754.f14280;
    }

    @Override // l.InterfaceC14529
    public final int nextInt() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int[] iArr = this.f16280.f24754.f14284;
        int i = this.f16279;
        this.f16279 = i + 1;
        return iArr[i];
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.f16279;
        if (i == 0) {
            throw new IllegalStateException();
        }
        C8016 c8016 = this.f16280;
        C4488 c4488 = c8016.f24754;
        int i2 = c4488.f14280 - i;
        int[] iArr = c4488.f14284;
        System.arraycopy(iArr, i, iArr, i - 1, i2);
        Object[] objArr = c8016.f24754.f14279;
        int i3 = this.f16279;
        System.arraycopy(objArr, i3, objArr, i3 - 1, i2);
        C4488 c4489 = c8016.f24754;
        int i4 = c4489.f14280 - 1;
        c4489.f14280 = i4;
        this.f16279--;
        c4489.f14279[i4] = null;
    }

    @Override // l.InterfaceC20881
    public final void forEachRemaining(IntConsumer intConsumer) {
        C4488 c4488 = this.f16280.f24754;
        int[] iArr = c4488.f14284;
        int i = c4488.f14280;
        while (true) {
            int i2 = this.f16279;
            if (i2 >= i) {
                return;
            }
            this.f16279 = i2 + 1;
            intConsumer.accept(iArr[i2]);
        }
    }
}
