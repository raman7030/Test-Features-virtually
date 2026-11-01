package p067l;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ܽۨᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18170 implements InterfaceC20202 {

    /* JADX INFO: renamed from: a */
    public final int[] f54246a;

    /* JADX INFO: renamed from: b */
    public int f54247b;

    /* JADX INFO: renamed from: c */
    public final int f54248c;

    /* JADX INFO: renamed from: d */
    public final int f54249d;

    @Override // p067l.InterfaceC20202, p067l.InterfaceC16847
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C6120.m13914a(this, consumer);
    }

    @Override // p067l.InterfaceC16847
    public final /* synthetic */ long getExactSizeIfKnown() {
        return C4779.$default$getExactSizeIfKnown(this);
    }

    @Override // p067l.InterfaceC16847
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return C4779.$default$hasCharacteristics(this, i);
    }

    @Override // p067l.InterfaceC20202, p067l.InterfaceC16847
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C6120.m13915b(this, consumer);
    }

    public C18170(int[] iArr, int i, int i2, int i3) {
        this.f54246a = iArr;
        this.f54247b = i;
        this.f54248c = i2;
        this.f54249d = i3 | 16448;
    }

    @Override // p067l.InterfaceC16847
    public final InterfaceC20202 trySplit() {
        int i = this.f54247b;
        int i2 = (this.f54248c + i) >>> 1;
        if (i >= i2) {
            return null;
        }
        this.f54247b = i2;
        return new C18170(this.f54246a, i, i2, this.f54249d);
    }

    @Override // p067l.InterfaceC3437
    public final void forEachRemaining(IntConsumer intConsumer) {
        int i;
        intConsumer.getClass();
        int[] iArr = this.f54246a;
        int length = iArr.length;
        int i2 = this.f54248c;
        if (length < i2 || (i = this.f54247b) < 0) {
            return;
        }
        this.f54247b = i2;
        if (i < i2) {
            do {
                intConsumer.accept(iArr[i]);
                i++;
            } while (i < i2);
        }
    }

    @Override // p067l.InterfaceC3437
    public final boolean tryAdvance(IntConsumer intConsumer) {
        intConsumer.getClass();
        int i = this.f54247b;
        if (i < 0 || i >= this.f54248c) {
            return false;
        }
        this.f54247b = i + 1;
        intConsumer.accept(this.f54246a[i]);
        return true;
    }

    @Override // p067l.InterfaceC16847
    public final long estimateSize() {
        return this.f54248c - this.f54247b;
    }

    @Override // p067l.InterfaceC16847
    public final int characteristics() {
        return this.f54249d;
    }

    @Override // p067l.InterfaceC16847
    public final Comparator getComparator() {
        if (C4779.$default$hasCharacteristics(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }
}
