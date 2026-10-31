package l;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۢܽᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4AQC */
/* JADX INFO: loaded from: classes4.dex */
public class C9716 implements InterfaceC16770 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public long f29414;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final InterfaceC15900 f29416;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f29417;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f29415 = 1024;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public InterfaceC16770 f29418 = null;

    @Override // l.InterfaceC15234
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C11127.m27611(this, consumer);
    }

    @Override // l.InterfaceC15234
    public /* synthetic */ long getExactSizeIfKnown() {
        return C2536.$default$getExactSizeIfKnown(this);
    }

    @Override // l.InterfaceC15234
    public /* synthetic */ boolean hasCharacteristics(int i) {
        return C2536.$default$hasCharacteristics(this, i);
    }

    @Override // l.InterfaceC15234
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C11127.m27612(this, consumer);
    }

    @Override // l.InterfaceC15234
    public /* bridge */ /* synthetic */ Comparator getComparator() {
        return getComparator();
    }

    @Override // l.InterfaceC16770, l.InterfaceC15234
    public InterfaceC1790 getComparator() {
        throw new IllegalStateException();
    }

    /* JADX INFO: renamed from: ֫ */
    public InterfaceC16770 mo23255(char[] cArr, int i) {
        C9876.m24968(cArr.length, 0, i);
        return new C17476(0, i, cArr, this.f29417);
    }

    @Override // l.InterfaceC1124
    public final void forEachRemaining(Object obj) {
        InterfaceC23662 interfaceC23662 = (InterfaceC23662) obj;
        InterfaceC16770 interfaceC16770 = this.f29418;
        if (interfaceC16770 != null) {
            interfaceC16770.forEachRemaining((Object) interfaceC23662);
            this.f29418 = null;
        }
        this.f29416.forEachRemaining(interfaceC23662);
        this.f29414 = 0L;
    }

    @Override // l.InterfaceC1124
    public final boolean tryAdvance(Object obj) {
        InterfaceC23662 interfaceC23662 = (InterfaceC23662) obj;
        InterfaceC16770 interfaceC16770 = this.f29418;
        if (interfaceC16770 != null) {
            boolean zTryAdvance = interfaceC16770.tryAdvance((Object) interfaceC23662);
            if (!zTryAdvance) {
                this.f29418 = null;
            }
            return zTryAdvance;
        }
        InterfaceC15900 interfaceC15900 = this.f29416;
        if (!interfaceC15900.hasNext()) {
            return false;
        }
        this.f29414--;
        interfaceC23662.mo18328(interfaceC15900.mo7691());
        return true;
    }

    public C9716(InterfaceC15900 interfaceC15900, long j, int i) {
        this.f29416 = interfaceC15900;
        this.f29414 = j;
        if ((i & 4096) != 0) {
            this.f29417 = i | 256;
        } else {
            this.f29417 = i | 16704;
        }
    }

    @Override // l.InterfaceC15234
    public final long estimateSize() {
        InterfaceC16770 interfaceC16770 = this.f29418;
        if (interfaceC16770 != null) {
            return interfaceC16770.estimateSize();
        }
        if (!this.f29416.hasNext()) {
            return 0L;
        }
        long j = this.f29414;
        return j >= 0 ? j : C13132.FOREVER_NS;
    }

    @Override // l.InterfaceC15234
    public final int characteristics() {
        return this.f29417;
    }

    @Override // l.InterfaceC15234
    public final InterfaceC16770 trySplit() {
        InterfaceC15900 interfaceC15900 = this.f29416;
        if (!interfaceC15900.hasNext()) {
            return null;
        }
        long j = this.f29414;
        int iMin = j > 0 ? (int) Math.min(this.f29415, j) : this.f29415;
        char[] cArrCopyOf = new char[iMin];
        int i = 0;
        while (i < iMin && interfaceC15900.hasNext()) {
            cArrCopyOf[i] = interfaceC15900.mo7691();
            this.f29414--;
            i++;
        }
        if (iMin < this.f29415 && interfaceC15900.hasNext()) {
            cArrCopyOf = Arrays.copyOf(cArrCopyOf, this.f29415);
            while (interfaceC15900.hasNext() && i < this.f29415) {
                cArrCopyOf[i] = interfaceC15900.mo7691();
                this.f29414--;
                i++;
            }
        }
        this.f29415 = Math.min(33554432, this.f29415 + 1024);
        InterfaceC16770 interfaceC16770Mo23255 = mo23255(cArrCopyOf, i);
        if (interfaceC15900.hasNext()) {
            return interfaceC16770Mo23255;
        }
        this.f29418 = interfaceC16770Mo23255;
        return ((C17476) interfaceC16770Mo23255).trySplit();
    }
}
