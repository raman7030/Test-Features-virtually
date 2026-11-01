package p067l;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.ܶۘᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: DAOW */
/* JADX INFO: loaded from: classes5.dex */
public final class C16613 implements InterfaceC3202 {

    /* JADX INFO: renamed from: ۗ */
    public final int f48817;

    /* JADX INFO: renamed from: ۙ */
    public int f48818;

    /* JADX INFO: renamed from: ᩶ */
    public int f48819;

    /* JADX INFO: renamed from: ᩸ */
    public final long[] f48820;

    /* JADX INFO: renamed from: ᩹ */
    public final int f48821;

    @Override // p067l.InterfaceC2766, p067l.InterfaceC16847
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C7226.m16563(this, consumer);
    }

    @Override // p067l.InterfaceC16847
    public /* synthetic */ long getExactSizeIfKnown() {
        return C4779.$default$getExactSizeIfKnown(this);
    }

    @Override // p067l.InterfaceC16847
    public /* synthetic */ boolean hasCharacteristics(int i) {
        return C4779.$default$hasCharacteristics(this, i);
    }

    @Override // p067l.InterfaceC2766, p067l.InterfaceC16847
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C7226.m16564(this, consumer);
    }

    @Override // p067l.InterfaceC16847
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    public C16613(long[] jArr, int i, int i2, int i3) {
        this.f48820 = jArr;
        this.f48817 = i;
        this.f48818 = i2;
        this.f48821 = i3 | 16720;
    }

    @Override // p067l.InterfaceC3437
    public final boolean tryAdvance(LongConsumer longConsumer) {
        if (this.f48819 >= this.f48818) {
            return false;
        }
        C12826.requireNonNull(longConsumer);
        int i = this.f48819;
        this.f48819 = i + 1;
        longConsumer.accept(this.f48820[this.f48817 + i]);
        return true;
    }

    @Override // p067l.InterfaceC16847
    public final long estimateSize() {
        return this.f48818 - this.f48819;
    }

    @Override // p067l.InterfaceC16847
    public final int characteristics() {
        return this.f48821;
    }

    @Override // p067l.InterfaceC16847
    public final InterfaceC3202 trySplit() {
        int i = this.f48819;
        int i2 = (this.f48818 - i) >> 1;
        if (i2 <= 1) {
            return null;
        }
        int i3 = this.f48817 + i;
        this.f48819 = i + i2;
        return new C16613(this.f48820, i3, i2, this.f48821);
    }

    @Override // p067l.InterfaceC3437
    public final void forEachRemaining(LongConsumer longConsumer) {
        C12826.requireNonNull(longConsumer);
        while (true) {
            int i = this.f48819;
            if (i >= this.f48818) {
                return;
            }
            longConsumer.accept(this.f48820[this.f48817 + i]);
            this.f48819++;
        }
    }
}
