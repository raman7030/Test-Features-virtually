package p067l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.ۗۖᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 7CAF */
/* JADX INFO: loaded from: classes3.dex */
public final class C5176 implements InterfaceC24660, InterfaceC14185 {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ C13893 f12181;

    /* JADX INFO: renamed from: ᩸ */
    public int f12182 = -1;

    /* JADX INFO: renamed from: ᩹ */
    public int f12183 = 0;

    @Override // p067l.InterfaceC8802, java.util.Iterator, p067l.InterfaceC14185
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C15942.m36199(this, consumer);
    }

    @Override // java.util.Iterator
    public final Long next() {
        return Long.valueOf(nextLong());
    }

    public C5176(C13893 c13893) {
        this.f12181 = c13893;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f12183 < this.f12181.f39228;
    }

    @Override // p067l.InterfaceC8802
    public final long nextLong() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        long[] jArr = this.f12181.f39227;
        int i = this.f12183;
        this.f12183 = i + 1;
        this.f12182 = i;
        return jArr[i];
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.f12182 == -1) {
            throw new IllegalStateException();
        }
        this.f12182 = -1;
        C13893 c13893 = this.f12181;
        int i = c13893.f39228;
        c13893.f39228 = i - 1;
        int i2 = this.f12183;
        int i3 = i2 - 1;
        this.f12183 = i3;
        long[] jArr = c13893.f39227;
        System.arraycopy(jArr, i2, jArr, i3, i - i2);
    }

    @Override // p067l.InterfaceC22214
    public final void forEachRemaining(LongConsumer longConsumer) {
        C13893 c13893 = this.f12181;
        long[] jArr = c13893.f39227;
        while (true) {
            int i = this.f12183;
            if (i >= c13893.f39228) {
                return;
            }
            this.f12183 = i + 1;
            longConsumer.accept(jArr[i]);
        }
    }
}
