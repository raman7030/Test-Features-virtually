package l;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۜۢᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N1QM */
/* JADX INFO: loaded from: classes3.dex */
public final class C6688 implements InterfaceC16749 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15859 f20778;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f20779;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f20780;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f20781;

    @Override // l.InterfaceC15234
    public final int characteristics() {
        return 16720;
    }

    @Override // l.InterfaceC18764, l.InterfaceC15234
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C11106.m27535(this, consumer);
    }

    @Override // l.InterfaceC15234
    public /* synthetic */ long getExactSizeIfKnown() {
        return C2536.$default$getExactSizeIfKnown(this);
    }

    @Override // l.InterfaceC15234
    public /* synthetic */ boolean hasCharacteristics(int i) {
        return C2536.$default$hasCharacteristics(this, i);
    }

    @Override // l.InterfaceC18764, l.InterfaceC15234
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C11106.m27536(this, consumer);
    }

    @Override // l.InterfaceC15234
    public final /* bridge */ /* synthetic */ Comparator getComparator() {
        getComparator();
        throw null;
    }

    @Override // l.InterfaceC16749, l.InterfaceC15234
    public final InterfaceC4571 getComparator() {
        throw new IllegalStateException();
    }

    public C6688(C15859 c15859) {
        this(c15859, 0, c15859.f49021, false);
    }

    public C6688(C15859 c15859, int i, int i2, boolean z) {
        this.f20778 = c15859;
        this.f20779 = i;
        this.f20781 = i2;
        this.f20780 = z;
    }

    @Override // l.InterfaceC15234
    public final long estimateSize() {
        return (this.f20780 ? this.f20781 : this.f20778.f49021) - this.f20779;
    }

    @Override // l.InterfaceC18764, l.InterfaceC1124, l.InterfaceC15234
    public final InterfaceC16749 trySplit() {
        boolean z = this.f20780;
        C15859 c15859 = this.f20778;
        int i = z ? this.f20781 : c15859.f49021;
        int i2 = this.f20779;
        int i3 = (i - i2) >> 1;
        if (i3 <= 1) {
            return null;
        }
        this.f20781 = i;
        int i4 = i3 + i2;
        this.f20779 = i4;
        this.f20780 = true;
        return new C6688(c15859, i2, i4, true);
    }

    @Override // l.InterfaceC1124
    public final boolean tryAdvance(IntConsumer intConsumer) {
        int i = this.f20779;
        boolean z = this.f20780;
        C15859 c15859 = this.f20778;
        if (i >= (z ? this.f20781 : c15859.f49021)) {
            return false;
        }
        int[] iArr = c15859.f49020;
        this.f20779 = i + 1;
        intConsumer.accept(iArr[i]);
        return true;
    }

    @Override // l.InterfaceC1124
    public final void forEachRemaining(IntConsumer intConsumer) {
        C15859 c15859 = this.f20778;
        int[] iArr = c15859.f49020;
        int i = this.f20780 ? this.f20781 : c15859.f49021;
        while (true) {
            int i2 = this.f20779;
            if (i2 >= i) {
                return;
            }
            intConsumer.accept(iArr[i2]);
            this.f20779++;
        }
    }
}
