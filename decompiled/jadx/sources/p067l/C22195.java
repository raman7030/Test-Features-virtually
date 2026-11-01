package p067l;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.᩷ۨᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C22195 implements InterfaceC2766 {

    /* JADX INFO: renamed from: a */
    public final long[] f70198a;

    /* JADX INFO: renamed from: b */
    public int f70199b;

    /* JADX INFO: renamed from: c */
    public final int f70200c;

    /* JADX INFO: renamed from: d */
    public final int f70201d;

    @Override // p067l.InterfaceC2766, p067l.InterfaceC16847
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C20873.m47164a(this, consumer);
    }

    @Override // p067l.InterfaceC16847
    public final /* synthetic */ long getExactSizeIfKnown() {
        return C4779.$default$getExactSizeIfKnown(this);
    }

    @Override // p067l.InterfaceC16847
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return C4779.$default$hasCharacteristics(this, i);
    }

    @Override // p067l.InterfaceC2766, p067l.InterfaceC16847
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C20873.m47165b(this, consumer);
    }

    public C22195(long[] jArr, int i, int i2, int i3) {
        this.f70198a = jArr;
        this.f70199b = i;
        this.f70200c = i2;
        this.f70201d = i3 | 16448;
    }

    @Override // p067l.InterfaceC16847
    public final InterfaceC2766 trySplit() {
        int i = this.f70199b;
        int i2 = (this.f70200c + i) >>> 1;
        if (i >= i2) {
            return null;
        }
        this.f70199b = i2;
        return new C22195(this.f70198a, i, i2, this.f70201d);
    }

    @Override // p067l.InterfaceC3437
    public final void forEachRemaining(LongConsumer longConsumer) {
        int i;
        longConsumer.getClass();
        long[] jArr = this.f70198a;
        int length = jArr.length;
        int i2 = this.f70200c;
        if (length < i2 || (i = this.f70199b) < 0) {
            return;
        }
        this.f70199b = i2;
        if (i < i2) {
            do {
                longConsumer.accept(jArr[i]);
                i++;
            } while (i < i2);
        }
    }

    @Override // p067l.InterfaceC3437
    public final boolean tryAdvance(LongConsumer longConsumer) {
        longConsumer.getClass();
        int i = this.f70199b;
        if (i < 0 || i >= this.f70200c) {
            return false;
        }
        this.f70199b = i + 1;
        longConsumer.accept(this.f70198a[i]);
        return true;
    }

    @Override // p067l.InterfaceC16847
    public final long estimateSize() {
        return this.f70200c - this.f70199b;
    }

    @Override // p067l.InterfaceC16847
    public final int characteristics() {
        return this.f70201d;
    }

    @Override // p067l.InterfaceC16847
    public final Comparator getComparator() {
        if (C4779.$default$hasCharacteristics(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }
}
