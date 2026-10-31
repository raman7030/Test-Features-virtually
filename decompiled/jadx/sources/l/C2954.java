package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.ۗۖᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 7CAF */
/* JADX INFO: loaded from: classes3.dex */
public final class C2954 implements InterfaceC23455, InterfaceC12433 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12126 f9381;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f9382 = -1;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f9383 = 0;

    @Override // l.InterfaceC6769, java.util.Iterator, l.InterfaceC12433
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C14282.m34066(this, consumer);
    }

    @Override // java.util.Iterator
    public final Long next() {
        return Long.valueOf(nextLong());
    }

    public C2954(C12126 c12126) {
        this.f9381 = c12126;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f9383 < this.f9381.f36216;
    }

    @Override // l.InterfaceC6769
    public final long nextLong() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        long[] jArr = this.f9381.f36215;
        int i = this.f9383;
        this.f9383 = i + 1;
        this.f9382 = i;
        return jArr[i];
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.f9382 == -1) {
            throw new IllegalStateException();
        }
        this.f9382 = -1;
        C12126 c12126 = this.f9381;
        int i = c12126.f36216;
        c12126.f36216 = i - 1;
        int i2 = this.f9383;
        int i3 = i2 - 1;
        this.f9383 = i3;
        long[] jArr = c12126.f36215;
        System.arraycopy(jArr, i2, jArr, i3, i - i2);
    }

    @Override // l.InterfaceC20881
    public final void forEachRemaining(LongConsumer longConsumer) {
        C12126 c12126 = this.f9381;
        long[] jArr = c12126.f36215;
        while (true) {
            int i = this.f9383;
            if (i >= c12126.f36216) {
                return;
            }
            this.f9383 = i + 1;
            longConsumer.accept(jArr[i]);
        }
    }
}
