package l;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.᩷ۨᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20861 implements InterfaceC0418 {
    public final long[] a;
    public int b;
    public final int c;
    public final int d;

    @Override // l.InterfaceC0418, l.InterfaceC15234
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C19470.a(this, consumer);
    }

    @Override // l.InterfaceC15234
    public final /* synthetic */ long getExactSizeIfKnown() {
        return C2536.$default$getExactSizeIfKnown(this);
    }

    @Override // l.InterfaceC15234
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return C2536.$default$hasCharacteristics(this, i);
    }

    @Override // l.InterfaceC0418, l.InterfaceC15234
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C19470.b(this, consumer);
    }

    public C20861(long[] jArr, int i, int i2, int i3) {
        this.a = jArr;
        this.b = i;
        this.c = i2;
        this.d = i3 | 16448;
    }

    @Override // l.InterfaceC15234
    public final InterfaceC0418 trySplit() {
        int i = this.b;
        int i2 = (this.c + i) >>> 1;
        if (i >= i2) {
            return null;
        }
        this.b = i2;
        return new C20861(this.a, i, i2, this.d);
    }

    @Override // l.InterfaceC1124
    public final void forEachRemaining(LongConsumer longConsumer) {
        int i;
        longConsumer.getClass();
        long[] jArr = this.a;
        int length = jArr.length;
        int i2 = this.c;
        if (length < i2 || (i = this.b) < 0) {
            return;
        }
        this.b = i2;
        if (i < i2) {
            do {
                longConsumer.accept(jArr[i]);
                i++;
            } while (i < i2);
        }
    }

    @Override // l.InterfaceC1124
    public final boolean tryAdvance(LongConsumer longConsumer) {
        longConsumer.getClass();
        int i = this.b;
        if (i < 0 || i >= this.c) {
            return false;
        }
        this.b = i + 1;
        longConsumer.accept(this.a[i]);
        return true;
    }

    @Override // l.InterfaceC15234
    public final long estimateSize() {
        return this.c - this.b;
    }

    @Override // l.InterfaceC15234
    public final int characteristics() {
        return this.d;
    }

    @Override // l.InterfaceC15234
    public final Comparator getComparator() {
        if (C2536.$default$hasCharacteristics(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }
}
