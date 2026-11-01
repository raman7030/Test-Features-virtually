package p067l;

import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩸ۚᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: AAQM */
/* JADX INFO: loaded from: classes5.dex */
public class C22689 implements InterfaceC9948 {

    /* JADX INFO: renamed from: ۗ */
    public final int f71567;

    /* JADX INFO: renamed from: ۙ */
    public int f71568;

    /* JADX INFO: renamed from: ᩶ */
    public int f71569;

    /* JADX INFO: renamed from: ᩸ */
    public final Object[] f71570;

    /* JADX INFO: renamed from: ᩹ */
    public final int f71571;

    @Override // p067l.InterfaceC16847
    public /* synthetic */ Comparator getComparator() {
        return C4779.$default$getComparator(this);
    }

    @Override // p067l.InterfaceC16847
    public /* synthetic */ long getExactSizeIfKnown() {
        return C4779.$default$getExactSizeIfKnown(this);
    }

    @Override // p067l.InterfaceC16847
    public /* synthetic */ boolean hasCharacteristics(int i) {
        return C4779.$default$hasCharacteristics(this, i);
    }

    public C22689(int i, int i2, int i3, Object[] objArr) {
        this.f71570 = objArr;
        this.f71567 = i;
        this.f71568 = i2;
        this.f71571 = i3 | 16464;
    }

    @Override // p067l.InterfaceC16847
    public final boolean tryAdvance(Consumer consumer) {
        if (this.f71569 >= this.f71568) {
            return false;
        }
        C12826.requireNonNull(consumer);
        int i = this.f71569;
        this.f71569 = i + 1;
        consumer.accept(this.f71570[this.f71567 + i]);
        return true;
    }

    @Override // p067l.InterfaceC16847
    public final long estimateSize() {
        return this.f71568 - this.f71569;
    }

    @Override // p067l.InterfaceC16847
    public final int characteristics() {
        return this.f71571;
    }

    /* JADX INFO: renamed from: ֫ */
    public C22689 mo50806(int i, int i2) {
        return new C22689(i, i2, this.f71571, this.f71570);
    }

    @Override // p067l.InterfaceC16847
    public final InterfaceC9948 trySplit() {
        int i = this.f71569;
        int i2 = (this.f71568 - i) >> 1;
        if (i2 <= 1) {
            return null;
        }
        int i3 = this.f71567 + i;
        this.f71569 = i + i2;
        return mo50806(i3, i2);
    }

    @Override // p067l.InterfaceC16847
    public final void forEachRemaining(Consumer consumer) {
        C12826.requireNonNull(consumer);
        while (true) {
            int i = this.f71569;
            if (i >= this.f71568) {
                return;
            }
            consumer.accept(this.f71570[this.f71567 + i]);
            this.f71569++;
        }
    }
}
