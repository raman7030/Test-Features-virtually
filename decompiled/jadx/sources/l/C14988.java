package l;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.ܶۘᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: DAOW */
/* JADX INFO: loaded from: classes5.dex */
public final class C14988 implements InterfaceC0877 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final int f45704;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f45705;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f45706;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final long[] f45707;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f45708;

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

    public C14988(long[] jArr, int i, int i2, int i3) {
        this.f45707 = jArr;
        this.f45704 = i;
        this.f45705 = i2;
        this.f45708 = i3 | 16720;
    }

    @Override // l.InterfaceC1124
    public final boolean tryAdvance(LongConsumer longConsumer) {
        if (this.f45706 >= this.f45705) {
            return false;
        }
        C11003.requireNonNull(longConsumer);
        int i = this.f45706;
        this.f45706 = i + 1;
        longConsumer.accept(this.f45707[this.f45704 + i]);
        return true;
    }

    @Override // l.InterfaceC15234
    public final long estimateSize() {
        return this.f45705 - this.f45706;
    }

    @Override // l.InterfaceC15234
    public final int characteristics() {
        return this.f45708;
    }

    @Override // l.InterfaceC15234
    public final InterfaceC0877 trySplit() {
        int i = this.f45706;
        int i2 = (this.f45705 - i) >> 1;
        if (i2 <= 1) {
            return null;
        }
        int i3 = this.f45704 + i;
        this.f45706 = i + i2;
        return new C14988(this.f45707, i3, i2, this.f45708);
    }

    @Override // l.InterfaceC1124
    public final void forEachRemaining(LongConsumer longConsumer) {
        C11003.requireNonNull(longConsumer);
        while (true) {
            int i = this.f45706;
            if (i >= this.f45705) {
                return;
            }
            longConsumer.accept(this.f45707[this.f45704 + i]);
            this.f45706++;
        }
    }
}
