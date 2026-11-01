package p067l;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۤۡᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: DC36 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12058 implements InterfaceC18287 {

    /* JADX INFO: renamed from: ۗ */
    public int f33594;

    /* JADX INFO: renamed from: ۙ */
    public boolean f33595;

    /* JADX INFO: renamed from: ۬ */
    public final /* synthetic */ C8034 f33596;

    /* JADX INFO: renamed from: ᩶ */
    public int f33597;

    /* JADX INFO: renamed from: ᩸ */
    public int f33598;

    /* JADX INFO: renamed from: ᩹ */
    public boolean f33599;

    @Override // p067l.InterfaceC20202, p067l.InterfaceC16847
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C12924.m29597(this, consumer);
    }

    @Override // p067l.InterfaceC16847
    public /* synthetic */ long getExactSizeIfKnown() {
        return C4779.$default$getExactSizeIfKnown(this);
    }

    @Override // p067l.InterfaceC16847
    public /* synthetic */ boolean hasCharacteristics(int i) {
        return C4779.$default$hasCharacteristics(this, i);
    }

    @Override // p067l.InterfaceC20202, p067l.InterfaceC16847
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C12924.m29598(this, consumer);
    }

    @Override // p067l.InterfaceC16847
    public final /* bridge */ /* synthetic */ Comparator getComparator() {
        getComparator();
        throw null;
    }

    @Override // p067l.InterfaceC18287, p067l.InterfaceC16847
    public final InterfaceC6713 getComparator() {
        throw new IllegalStateException();
    }

    public C12058(C8034 c8034) {
        this.f33596 = c8034;
        this.f33594 = 0;
        this.f33597 = c8034.f21131;
        this.f33598 = 0;
        this.f33595 = c8034.f21134;
        this.f33599 = false;
    }

    public C12058(C8034 c8034, int i, int i2, boolean z) {
        this.f33596 = c8034;
        this.f33598 = 0;
        this.f33594 = i;
        this.f33597 = i2;
        this.f33595 = z;
        this.f33599 = true;
    }

    @Override // p067l.InterfaceC3437
    public final boolean tryAdvance(IntConsumer intConsumer) {
        boolean z = this.f33595;
        C8034 c8034 = this.f33596;
        if (z) {
            this.f33595 = false;
            this.f33598++;
            intConsumer.accept(c8034.f21133[c8034.f21131]);
            return true;
        }
        int[] iArr = c8034.f21133;
        while (true) {
            int i = this.f33594;
            if (i >= this.f33597) {
                return false;
            }
            int i2 = iArr[i];
            if (i2 != 0) {
                this.f33598++;
                this.f33594 = i + 1;
                intConsumer.accept(i2);
                return true;
            }
            this.f33594 = i + 1;
        }
    }

    @Override // p067l.InterfaceC3437
    public final void forEachRemaining(IntConsumer intConsumer) {
        C8034 c8034 = this.f33596;
        int[] iArr = c8034.f21133;
        if (this.f33595) {
            this.f33595 = false;
            intConsumer.accept(iArr[c8034.f21131]);
            this.f33598++;
        }
        while (true) {
            int i = this.f33594;
            if (i >= this.f33597) {
                return;
            }
            int i2 = iArr[i];
            if (i2 != 0) {
                intConsumer.accept(i2);
                this.f33598++;
            }
            this.f33594++;
        }
    }

    @Override // p067l.InterfaceC16847
    public final int characteristics() {
        return this.f33599 ? 257 : 321;
    }

    @Override // p067l.InterfaceC16847
    public final long estimateSize() {
        boolean z = this.f33599;
        C8034 c8034 = this.f33596;
        if (!z) {
            return c8034.f21130 - this.f33598;
        }
        int i = c8034.f21130;
        long j = i - this.f33598;
        if (c8034.f21134) {
            i--;
        }
        return Math.min(j, ((long) ((((double) i) / ((double) c8034.f21131)) * ((double) (this.f33597 - this.f33594)))) + (this.f33595 ? 1L : 0L));
    }

    @Override // p067l.InterfaceC20202, p067l.InterfaceC3437, p067l.InterfaceC16847
    public final C12058 trySplit() {
        int i;
        int i2 = this.f33594;
        int i3 = this.f33597;
        if (i2 >= i3 - 1 || (i = (i3 - i2) >> 1) <= 1) {
            return null;
        }
        int i4 = i + i2;
        C12058 c12058 = new C12058(this.f33596, i2, i4, this.f33595);
        this.f33594 = i4;
        this.f33595 = false;
        this.f33599 = true;
        return c12058;
    }
}
