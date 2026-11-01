package p067l;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۜۢᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N1QM */
/* JADX INFO: loaded from: classes3.dex */
public final class C8725 implements InterfaceC18287 {

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ C17441 f23653;

    /* JADX INFO: renamed from: ᩶ */
    public int f23654;

    /* JADX INFO: renamed from: ᩸ */
    public boolean f23655;

    /* JADX INFO: renamed from: ᩹ */
    public int f23656;

    @Override // p067l.InterfaceC16847
    public final int characteristics() {
        return 16720;
    }

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

    public C8725(C17441 c17441) {
        this(c17441, 0, c17441.f52159, false);
    }

    public C8725(C17441 c17441, int i, int i2, boolean z) {
        this.f23653 = c17441;
        this.f23654 = i;
        this.f23656 = i2;
        this.f23655 = z;
    }

    @Override // p067l.InterfaceC16847
    public final long estimateSize() {
        return (this.f23655 ? this.f23656 : this.f23653.f52159) - this.f23654;
    }

    @Override // p067l.InterfaceC20202, p067l.InterfaceC3437, p067l.InterfaceC16847
    public final InterfaceC18287 trySplit() {
        boolean z = this.f23655;
        C17441 c17441 = this.f23653;
        int i = z ? this.f23656 : c17441.f52159;
        int i2 = this.f23654;
        int i3 = (i - i2) >> 1;
        if (i3 <= 1) {
            return null;
        }
        this.f23656 = i;
        int i4 = i3 + i2;
        this.f23654 = i4;
        this.f23655 = true;
        return new C8725(c17441, i2, i4, true);
    }

    @Override // p067l.InterfaceC3437
    public final boolean tryAdvance(IntConsumer intConsumer) {
        int i = this.f23654;
        boolean z = this.f23655;
        C17441 c17441 = this.f23653;
        if (i >= (z ? this.f23656 : c17441.f52159)) {
            return false;
        }
        int[] iArr = c17441.f52158;
        this.f23654 = i + 1;
        intConsumer.accept(iArr[i]);
        return true;
    }

    @Override // p067l.InterfaceC3437
    public final void forEachRemaining(IntConsumer intConsumer) {
        C17441 c17441 = this.f23653;
        int[] iArr = c17441.f52158;
        int i = this.f23655 ? this.f23656 : c17441.f52159;
        while (true) {
            int i2 = this.f23654;
            if (i2 >= i) {
                return;
            }
            intConsumer.accept(iArr[i2]);
            this.f23654++;
        }
    }
}
