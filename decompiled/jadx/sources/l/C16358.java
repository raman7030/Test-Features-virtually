package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.ܽۖᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: GQL */
/* JADX INFO: loaded from: classes5.dex */
public final class C16358 implements InterfaceC23455, InterfaceC12433 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f50345 = 0;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17064 f50346;

    @Override // l.InterfaceC6769, java.util.Iterator, l.InterfaceC12433
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C14282.m34066(this, consumer);
    }

    @Override // java.util.Iterator
    public final Long next() {
        return Long.valueOf(nextLong());
    }

    public C16358(C17064 c17064) {
        this.f50346 = c17064;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f50345 < this.f50346.f52317.f28192;
    }

    @Override // l.InterfaceC6769
    public final long nextLong() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        long[] jArr = this.f50346.f52317.f28196;
        int i = this.f50345;
        this.f50345 = i + 1;
        return jArr[i];
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.f50345;
        if (i == 0) {
            throw new IllegalStateException();
        }
        C17064 c17064 = this.f50346;
        C9304 c9304 = c17064.f52317;
        int i2 = c9304.f28192 - i;
        long[] jArr = c9304.f28196;
        System.arraycopy(jArr, i, jArr, i - 1, i2);
        Object[] objArr = c17064.f52317.f28191;
        int i3 = this.f50345;
        System.arraycopy(objArr, i3, objArr, i3 - 1, i2);
        C9304 c9305 = c17064.f52317;
        int i4 = c9305.f28192 - 1;
        c9305.f28192 = i4;
        this.f50345--;
        c9305.f28191[i4] = null;
    }

    @Override // l.InterfaceC20881
    public final void forEachRemaining(LongConsumer longConsumer) {
        C9304 c9304 = this.f50346.f52317;
        long[] jArr = c9304.f28196;
        int i = c9304.f28192;
        while (true) {
            int i2 = this.f50345;
            if (i2 >= i) {
                return;
            }
            this.f50345 = i2 + 1;
            longConsumer.accept(jArr[i2]);
        }
    }
}
