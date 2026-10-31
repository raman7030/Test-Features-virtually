package l;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.۬ۖᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 7CAF */
/* JADX INFO: loaded from: classes4.dex */
public final class C12831 implements InterfaceC0877 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12126 f38534;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f38535;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f38536;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f38537;

    @Override // l.InterfaceC15234
    public final int characteristics() {
        return 16721;
    }

    @Override // l.InterfaceC0418, l.InterfaceC15234
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C5111.m14655(this, consumer);
    }

    @Override // l.InterfaceC15234
    public /* synthetic */ long getExactSizeIfKnown() {
        return C2536.$default$getExactSizeIfKnown(this);
    }

    @Override // l.InterfaceC15234
    public /* synthetic */ boolean hasCharacteristics(int i) {
        return C2536.$default$hasCharacteristics(this, i);
    }

    @Override // l.InterfaceC0418, l.InterfaceC15234
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C5111.m14656(this, consumer);
    }

    @Override // l.InterfaceC15234
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    public C12831(C12126 c12126) {
        this(c12126, 0, c12126.f36216, false);
    }

    public C12831(C12126 c12126, int i, int i2, boolean z) {
        this.f38534 = c12126;
        this.f38535 = i;
        this.f38537 = i2;
        this.f38536 = z;
    }

    @Override // l.InterfaceC15234
    public final long estimateSize() {
        return (this.f38536 ? this.f38537 : this.f38534.f36216) - this.f38535;
    }

    @Override // l.InterfaceC15234
    public final InterfaceC0877 trySplit() {
        boolean z = this.f38536;
        C12126 c12126 = this.f38534;
        int i = z ? this.f38537 : c12126.f36216;
        int i2 = this.f38535;
        int i3 = (i - i2) >> 1;
        if (i3 <= 1) {
            return null;
        }
        this.f38537 = i;
        int i4 = i3 + i2;
        this.f38535 = i4;
        this.f38536 = true;
        return new C12831(c12126, i2, i4, true);
    }

    @Override // l.InterfaceC1124
    public final boolean tryAdvance(LongConsumer longConsumer) {
        int i = this.f38535;
        boolean z = this.f38536;
        C12126 c12126 = this.f38534;
        if (i >= (z ? this.f38537 : c12126.f36216)) {
            return false;
        }
        long[] jArr = c12126.f36215;
        this.f38535 = i + 1;
        longConsumer.accept(jArr[i]);
        return true;
    }

    @Override // l.InterfaceC1124
    public final void forEachRemaining(LongConsumer longConsumer) {
        C12126 c12126 = this.f38534;
        long[] jArr = c12126.f36215;
        int i = this.f38536 ? this.f38537 : c12126.f36216;
        while (true) {
            int i2 = this.f38535;
            if (i2 >= i) {
                return;
            }
            longConsumer.accept(jArr[i2]);
            this.f38535++;
        }
    }
}
