package l;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.ۙۘᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: DAOW */
/* JADX INFO: loaded from: classes3.dex */
public final class C4406 implements InterfaceC0877 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public long f14102;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final InterfaceC23455 f14104;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f14105;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f14103 = 1024;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public InterfaceC0877 f14106 = null;

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

    public C4406(InterfaceC23455 interfaceC23455, long j, int i) {
        this.f14104 = interfaceC23455;
        this.f14102 = j;
        this.f14105 = i | 16704;
    }

    @Override // l.InterfaceC1124
    public final boolean tryAdvance(LongConsumer longConsumer) {
        InterfaceC0877 interfaceC0877 = this.f14106;
        if (interfaceC0877 != null) {
            boolean zTryAdvance = interfaceC0877.tryAdvance(longConsumer);
            if (!zTryAdvance) {
                this.f14106 = null;
            }
            return zTryAdvance;
        }
        InterfaceC23455 interfaceC23455 = this.f14104;
        if (!interfaceC23455.hasNext()) {
            return false;
        }
        this.f14102--;
        longConsumer.accept(interfaceC23455.nextLong());
        return true;
    }

    @Override // l.InterfaceC1124
    public final void forEachRemaining(LongConsumer longConsumer) {
        InterfaceC0877 interfaceC0877 = this.f14106;
        if (interfaceC0877 != null) {
            interfaceC0877.forEachRemaining(longConsumer);
            this.f14106 = null;
        }
        this.f14104.forEachRemaining(longConsumer);
        this.f14102 = 0L;
    }

    @Override // l.InterfaceC15234
    public final long estimateSize() {
        InterfaceC0877 interfaceC0877 = this.f14106;
        if (interfaceC0877 != null) {
            return interfaceC0877.estimateSize();
        }
        if (!this.f14104.hasNext()) {
            return 0L;
        }
        long j = this.f14102;
        return j >= 0 ? j : C13132.FOREVER_NS;
    }

    @Override // l.InterfaceC15234
    public final int characteristics() {
        return this.f14105;
    }

    @Override // l.InterfaceC15234
    public final InterfaceC0877 trySplit() {
        InterfaceC23455 interfaceC23455 = this.f14104;
        if (!interfaceC23455.hasNext()) {
            return null;
        }
        long j = this.f14102;
        int iMin = j > 0 ? (int) Math.min(this.f14103, j) : this.f14103;
        long[] jArrCopyOf = new long[iMin];
        int i = 0;
        while (i < iMin && interfaceC23455.hasNext()) {
            jArrCopyOf[i] = interfaceC23455.nextLong();
            this.f14102--;
            i++;
        }
        if (iMin < this.f14103 && interfaceC23455.hasNext()) {
            jArrCopyOf = Arrays.copyOf(jArrCopyOf, this.f14103);
            while (interfaceC23455.hasNext() && i < this.f14103) {
                jArrCopyOf[i] = interfaceC23455.nextLong();
                this.f14102--;
                i++;
            }
        }
        this.f14103 = Math.min(33554432, this.f14103 + 1024);
        C9876.m24968(jArrCopyOf.length, 0, i);
        C14988 c14988 = new C14988(jArrCopyOf, 0, i, this.f14105);
        if (interfaceC23455.hasNext()) {
            return c14988;
        }
        this.f14106 = c14988;
        return c14988.trySplit();
    }
}
