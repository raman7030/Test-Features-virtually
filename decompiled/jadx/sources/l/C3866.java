package l;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۘۢᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 91Q1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3866 implements InterfaceC16749 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18683 f12364;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f12365;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f12366;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f12367;

    @Override // l.InterfaceC15234
    public final int characteristics() {
        return 16721;
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

    public C3866(C18683 c18683) {
        this(c18683, 0, c18683.f59087, false);
    }

    public C3866(C18683 c18683, int i, int i2, boolean z) {
        this.f12364 = c18683;
        this.f12365 = i;
        this.f12367 = i2;
        this.f12366 = z;
    }

    @Override // l.InterfaceC15234
    public final long estimateSize() {
        return (this.f12366 ? this.f12367 : this.f12364.f59087) - this.f12365;
    }

    @Override // l.InterfaceC18764, l.InterfaceC1124, l.InterfaceC15234
    public final InterfaceC16749 trySplit() {
        boolean z = this.f12366;
        C18683 c18683 = this.f12364;
        int i = z ? this.f12367 : c18683.f59087;
        int i2 = this.f12365;
        int i3 = (i - i2) >> 1;
        if (i3 <= 1) {
            return null;
        }
        this.f12367 = i;
        int i4 = i3 + i2;
        this.f12365 = i4;
        this.f12366 = true;
        return new C3866(c18683, i2, i4, true);
    }

    @Override // l.InterfaceC1124
    public final boolean tryAdvance(IntConsumer intConsumer) {
        int i = this.f12365;
        boolean z = this.f12366;
        C18683 c18683 = this.f12364;
        if (i >= (z ? this.f12367 : c18683.f59087)) {
            return false;
        }
        int[] iArr = c18683.f59086;
        this.f12365 = i + 1;
        intConsumer.accept(iArr[i]);
        return true;
    }

    @Override // l.InterfaceC1124
    public final void forEachRemaining(IntConsumer intConsumer) {
        C18683 c18683 = this.f12364;
        int[] iArr = c18683.f59086;
        int i = this.f12366 ? this.f12367 : c18683.f59087;
        while (true) {
            int i2 = this.f12365;
            if (i2 >= i) {
                return;
            }
            intConsumer.accept(iArr[i2]);
            this.f12365++;
        }
    }
}
