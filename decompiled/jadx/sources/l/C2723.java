package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۖᩴᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: W1E0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2723 implements InterfaceC12063, InterfaceC12433 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f8495 = 0;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18951 f8496;

    public C2723(C18951 c18951) {
        this.f8496 = c18951;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f8495 < this.f8496.f59763.f25674;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object[] objArr = this.f8496.f59763.f25678;
        int i = this.f8495;
        this.f8495 = i + 1;
        return objArr[i];
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.f8495;
        if (i == 0) {
            throw new IllegalStateException();
        }
        C18951 c18951 = this.f8496;
        C8367 c8367 = c18951.f59763;
        int i2 = c8367.f25674 - i;
        Object[] objArr = c8367.f25678;
        System.arraycopy(objArr, i, objArr, i - 1, i2);
        int[] iArr = c18951.f59763.f25673;
        int i3 = this.f8495;
        System.arraycopy(iArr, i3, iArr, i3 - 1, i2);
        C8367 c8368 = c18951.f59763;
        int i4 = c8368.f25674 - 1;
        c8368.f25674 = i4;
        this.f8495--;
        c8368.f25678[i4] = null;
    }

    @Override // java.util.Iterator, l.InterfaceC12433
    public final void forEachRemaining(Consumer consumer) {
        C8367 c8367 = this.f8496.f59763;
        Object[] objArr = c8367.f25678;
        int i = c8367.f25674;
        while (true) {
            int i2 = this.f8495;
            if (i2 >= i) {
                return;
            }
            this.f8495 = i2 + 1;
            consumer.accept(objArr[i2]);
        }
    }
}
