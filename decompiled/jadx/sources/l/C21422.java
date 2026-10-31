package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩸ۜᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: VZ3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21422 implements InterfaceC12063, InterfaceC12433 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f68987 = 0;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20011 f68988;

    public C21422(C20011 c20011) {
        this.f68988 = c20011;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f68987 < this.f68988.f64825.f14280;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object[] objArr = this.f68988.f64825.f14279;
        int i = this.f68987;
        this.f68987 = i + 1;
        return objArr[i];
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.f68987;
        if (i == 0) {
            throw new IllegalStateException();
        }
        C20011 c20011 = this.f68988;
        C4488 c4488 = c20011.f64825;
        int i2 = c4488.f14280 - i;
        int[] iArr = c4488.f14284;
        System.arraycopy(iArr, i, iArr, i - 1, i2);
        Object[] objArr = c20011.f64825.f14279;
        int i3 = this.f68987;
        System.arraycopy(objArr, i3, objArr, i3 - 1, i2);
        C4488 c4489 = c20011.f64825;
        int i4 = c4489.f14280 - 1;
        c4489.f14280 = i4;
        this.f68987--;
        c4489.f14279[i4] = null;
    }

    @Override // java.util.Iterator, l.InterfaceC12433
    public final void forEachRemaining(Consumer consumer) {
        C4488 c4488 = this.f68988.f64825;
        Object[] objArr = c4488.f14279;
        int i = c4488.f14280;
        while (true) {
            int i2 = this.f68987;
            if (i2 >= i) {
                return;
            }
            this.f68987 = i2 + 1;
            consumer.accept(objArr[i2]);
        }
    }
}
