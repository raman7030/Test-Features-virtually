package l;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.ܶۖᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: QCDS */
/* JADX INFO: loaded from: classes5.dex */
public final class C14947 implements InterfaceC0877 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4365 f45566;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f45567;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f45568;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f45569;

    @Override // l.InterfaceC15234
    public final int characteristics() {
        return 16720;
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

    public C14947(C4365 c4365) {
        this(c4365, 0, c4365.f14035, false);
    }

    public C14947(C4365 c4365, int i, int i2, boolean z) {
        this.f45566 = c4365;
        this.f45567 = i;
        this.f45569 = i2;
        this.f45568 = z;
    }

    @Override // l.InterfaceC15234
    public final long estimateSize() {
        return (this.f45568 ? this.f45569 : this.f45566.f14035) - this.f45567;
    }

    @Override // l.InterfaceC15234
    public final InterfaceC0877 trySplit() {
        boolean z = this.f45568;
        C4365 c4365 = this.f45566;
        int i = z ? this.f45569 : c4365.f14035;
        int i2 = this.f45567;
        int i3 = (i - i2) >> 1;
        if (i3 <= 1) {
            return null;
        }
        this.f45569 = i;
        int i4 = i3 + i2;
        this.f45567 = i4;
        this.f45568 = true;
        return new C14947(c4365, i2, i4, true);
    }

    @Override // l.InterfaceC1124
    public final boolean tryAdvance(LongConsumer longConsumer) {
        int i = this.f45567;
        boolean z = this.f45568;
        C4365 c4365 = this.f45566;
        if (i >= (z ? this.f45569 : c4365.f14035)) {
            return false;
        }
        long[] jArr = c4365.f14034;
        this.f45567 = i + 1;
        longConsumer.accept(jArr[i]);
        return true;
    }

    @Override // l.InterfaceC1124
    public final void forEachRemaining(LongConsumer longConsumer) {
        C4365 c4365 = this.f45566;
        long[] jArr = c4365.f14034;
        int i = this.f45568 ? this.f45569 : c4365.f14035;
        while (true) {
            int i2 = this.f45567;
            if (i2 >= i) {
                return;
            }
            longConsumer.accept(jArr[i2]);
            this.f45567++;
        }
    }
}
