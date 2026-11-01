package p067l;

import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩺۫ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public final class C24224 implements InterfaceC16847 {

    /* JADX INFO: renamed from: a */
    public final Object[] f76775a;

    /* JADX INFO: renamed from: b */
    public int f76776b;

    /* JADX INFO: renamed from: c */
    public final int f76777c;

    /* JADX INFO: renamed from: d */
    public final int f76778d;

    @Override // p067l.InterfaceC16847
    public final /* synthetic */ long getExactSizeIfKnown() {
        return C4779.$default$getExactSizeIfKnown(this);
    }

    @Override // p067l.InterfaceC16847
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return C4779.$default$hasCharacteristics(this, i);
    }

    public C24224(Object[] objArr, int i, int i2, int i3) {
        this.f76775a = objArr;
        this.f76776b = i;
        this.f76777c = i2;
        this.f76778d = i3 | 16448;
    }

    @Override // p067l.InterfaceC16847
    public final InterfaceC16847 trySplit() {
        int i = this.f76776b;
        int i2 = (this.f76777c + i) >>> 1;
        if (i >= i2) {
            return null;
        }
        this.f76776b = i2;
        return new C24224(this.f76775a, i, i2, this.f76778d);
    }

    @Override // p067l.InterfaceC16847
    public final void forEachRemaining(Consumer consumer) {
        int i;
        consumer.getClass();
        Object[] objArr = this.f76775a;
        int length = objArr.length;
        int i2 = this.f76777c;
        if (length < i2 || (i = this.f76776b) < 0) {
            return;
        }
        this.f76776b = i2;
        if (i < i2) {
            do {
                consumer.accept(objArr[i]);
                i++;
            } while (i < i2);
        }
    }

    @Override // p067l.InterfaceC16847
    public final boolean tryAdvance(Consumer consumer) {
        consumer.getClass();
        int i = this.f76776b;
        if (i < 0 || i >= this.f76777c) {
            return false;
        }
        this.f76776b = i + 1;
        consumer.accept(this.f76775a[i]);
        return true;
    }

    @Override // p067l.InterfaceC16847
    public final long estimateSize() {
        return this.f76777c - this.f76776b;
    }

    @Override // p067l.InterfaceC16847
    public final int characteristics() {
        return this.f76778d;
    }

    @Override // p067l.InterfaceC16847
    public final Comparator getComparator() {
        if (C4779.$default$hasCharacteristics(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }
}
