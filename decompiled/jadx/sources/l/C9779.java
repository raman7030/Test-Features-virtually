package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۢᩴᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: W1E0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9779 implements InterfaceC12063, InterfaceC12433 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16127 f29566;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f29567 = 0;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f29568 = -1;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C19657 f29569;

    public C9779(C16127 c16127) {
        this.f29566 = c16127;
        this.f29569 = new C19657(c16127.f49693);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f29567 < this.f29566.f49693.f25674;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f29567;
        this.f29567 = i + 1;
        this.f29568 = i;
        C19657 c19657 = this.f29569;
        c19657.f63466 = i;
        return c19657;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.f29568 == -1) {
            throw new IllegalStateException();
        }
        this.f29568 = -1;
        C16127 c16127 = this.f29566;
        C8367 c8367 = c16127.f49693;
        int i = c8367.f25674;
        c8367.f25674 = i - 1;
        int i2 = this.f29567;
        int i3 = i2 - 1;
        this.f29567 = i3;
        int i4 = i - i2;
        Object[] objArr = c8367.f25678;
        System.arraycopy(objArr, i2, objArr, i3, i4);
        int[] iArr = c16127.f49693.f25673;
        int i5 = this.f29567;
        System.arraycopy(iArr, i5 + 1, iArr, i5, i4);
        this.f29569.f63466 = -1;
        C8367 c8368 = c16127.f49693;
        c8368.f25678[c8368.f25674] = null;
    }

    @Override // java.util.Iterator, l.InterfaceC12433
    public final void forEachRemaining(Consumer consumer) {
        int i = this.f29566.f49693.f25674;
        while (true) {
            int i2 = this.f29567;
            if (i2 >= i) {
                return;
            }
            this.f29567 = i2 + 1;
            this.f29568 = i2;
            C19657 c19657 = this.f29569;
            c19657.f63466 = i2;
            consumer.accept(c19657);
        }
    }
}
