package p067l;

import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܿܿᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: OAQ5 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18998 implements InterfaceC18327 {

    /* JADX INFO: renamed from: ۗ */
    public final int f56641;

    /* JADX INFO: renamed from: ۙ */
    public int f56642;

    /* JADX INFO: renamed from: ᩶ */
    public int f56643;

    /* JADX INFO: renamed from: ᩸ */
    public final float[] f56644;

    /* JADX INFO: renamed from: ᩹ */
    public final int f56645;

    @Override // p067l.InterfaceC16847
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C12964.m29727(this, consumer);
    }

    @Override // p067l.InterfaceC16847
    public /* synthetic */ long getExactSizeIfKnown() {
        return C4779.$default$getExactSizeIfKnown(this);
    }

    @Override // p067l.InterfaceC16847
    public /* synthetic */ boolean hasCharacteristics(int i) {
        return C4779.$default$hasCharacteristics(this, i);
    }

    @Override // p067l.InterfaceC16847
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C12964.m29728(this, consumer);
    }

    @Override // p067l.InterfaceC16847
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    @Override // p067l.InterfaceC3437
    public final void forEachRemaining(Object obj) {
        InterfaceC6278 interfaceC6278 = (InterfaceC6278) obj;
        C12826.requireNonNull(interfaceC6278);
        while (true) {
            int i = this.f56643;
            if (i >= this.f56642) {
                return;
            }
            interfaceC6278.mo14251(this.f56644[this.f56641 + i]);
            this.f56643++;
        }
    }

    @Override // p067l.InterfaceC3437
    public final boolean tryAdvance(Object obj) {
        InterfaceC6278 interfaceC6278 = (InterfaceC6278) obj;
        if (this.f56643 >= this.f56642) {
            return false;
        }
        C12826.requireNonNull(interfaceC6278);
        int i = this.f56643;
        this.f56643 = i + 1;
        interfaceC6278.mo14251(this.f56644[this.f56641 + i]);
        return true;
    }

    public C18998(int i, int i2, int i3, float[] fArr) {
        this.f56644 = fArr;
        this.f56641 = i;
        this.f56642 = i2;
        this.f56645 = i3 | 16720;
    }

    @Override // p067l.InterfaceC16847
    public final long estimateSize() {
        return this.f56642 - this.f56643;
    }

    @Override // p067l.InterfaceC16847
    public final int characteristics() {
        return this.f56645;
    }

    @Override // p067l.InterfaceC16847
    public final InterfaceC18327 trySplit() {
        int i = this.f56643;
        int i2 = (this.f56642 - i) >> 1;
        if (i2 <= 1) {
            return null;
        }
        int i3 = this.f56641 + i;
        this.f56643 = i + i2;
        return new C18998(i3, i2, this.f56645, this.f56644);
    }
}
