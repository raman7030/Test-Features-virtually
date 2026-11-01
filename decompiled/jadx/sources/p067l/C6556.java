package p067l;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.ۙۘᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: DAOW */
/* JADX INFO: loaded from: classes3.dex */
public final class C6556 implements InterfaceC3202 {

    /* JADX INFO: renamed from: ۗ */
    public long f16918;

    /* JADX INFO: renamed from: ᩶ */
    public final InterfaceC24660 f16920;

    /* JADX INFO: renamed from: ᩸ */
    public final int f16921;

    /* JADX INFO: renamed from: ۙ */
    public int f16919 = 1024;

    /* JADX INFO: renamed from: ᩹ */
    public InterfaceC3202 f16922 = null;

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

    public C6556(InterfaceC24660 interfaceC24660, long j, int i) {
        this.f16920 = interfaceC24660;
        this.f16918 = j;
        this.f16921 = i | 16704;
    }

    @Override // p067l.InterfaceC3437
    public final boolean tryAdvance(LongConsumer longConsumer) {
        InterfaceC3202 interfaceC3202 = this.f16922;
        if (interfaceC3202 != null) {
            boolean zTryAdvance = interfaceC3202.tryAdvance(longConsumer);
            if (!zTryAdvance) {
                this.f16922 = null;
            }
            return zTryAdvance;
        }
        InterfaceC24660 interfaceC24660 = this.f16920;
        if (!interfaceC24660.hasNext()) {
            return false;
        }
        this.f16918--;
        longConsumer.accept(interfaceC24660.nextLong());
        return true;
    }

    @Override // p067l.InterfaceC3437
    public final void forEachRemaining(LongConsumer longConsumer) {
        InterfaceC3202 interfaceC3202 = this.f16922;
        if (interfaceC3202 != null) {
            interfaceC3202.forEachRemaining(longConsumer);
            this.f16922 = null;
        }
        this.f16920.forEachRemaining(longConsumer);
        this.f16918 = 0L;
    }

    @Override // p067l.InterfaceC16847
    public final long estimateSize() {
        InterfaceC3202 interfaceC3202 = this.f16922;
        if (interfaceC3202 != null) {
            return interfaceC3202.estimateSize();
        }
        if (!this.f16920.hasNext()) {
            return 0L;
        }
        long j = this.f16918;
        return j >= 0 ? j : C14849.FOREVER_NS;
    }

    @Override // p067l.InterfaceC16847
    public final int characteristics() {
        return this.f16921;
    }

    @Override // p067l.InterfaceC16847
    public final InterfaceC3202 trySplit() {
        InterfaceC24660 interfaceC24660 = this.f16920;
        if (!interfaceC24660.hasNext()) {
            return null;
        }
        long j = this.f16918;
        int iMin = j > 0 ? (int) Math.min(this.f16919, j) : this.f16919;
        long[] jArrCopyOf = new long[iMin];
        int i = 0;
        while (i < iMin && interfaceC24660.hasNext()) {
            jArrCopyOf[i] = interfaceC24660.nextLong();
            this.f16918--;
            i++;
        }
        if (iMin < this.f16919 && interfaceC24660.hasNext()) {
            jArrCopyOf = Arrays.copyOf(jArrCopyOf, this.f16919);
            while (interfaceC24660.hasNext() && i < this.f16919) {
                jArrCopyOf[i] = interfaceC24660.nextLong();
                this.f16918--;
                i++;
            }
        }
        this.f16919 = Math.min(33554432, this.f16919 + 1024);
        C11755.m26983(jArrCopyOf.length, 0, i);
        C16613 c16613 = new C16613(jArrCopyOf, 0, i, this.f16921);
        if (interfaceC24660.hasNext()) {
            return c16613;
        }
        this.f16922 = c16613;
        return c16613.trySplit();
    }
}
