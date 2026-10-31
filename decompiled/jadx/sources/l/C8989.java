package l;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۡܺᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: AAP5 */
/* JADX INFO: loaded from: classes4.dex */
public class C8989 implements InterfaceC16749 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public long f27313;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final InterfaceC6667 f27315;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f27316;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f27314 = 1024;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public InterfaceC16749 f27317 = null;

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
    public /* bridge */ /* synthetic */ Comparator getComparator() {
        return getComparator();
    }

    @Override // l.InterfaceC16749, l.InterfaceC15234
    public InterfaceC4571 getComparator() {
        throw new IllegalStateException();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC16749 mo23230(int i, int[] iArr) {
        C9876.m24968(iArr.length, 0, i);
        return new C17455(0, i, this.f27316, iArr);
    }

    public C8989(InterfaceC6667 interfaceC6667, long j, int i) {
        this.f27315 = interfaceC6667;
        this.f27313 = j;
        if ((i & 4096) != 0) {
            this.f27316 = i | 256;
        } else {
            this.f27316 = i | 16704;
        }
    }

    @Override // l.InterfaceC1124
    public final boolean tryAdvance(IntConsumer intConsumer) {
        InterfaceC16749 interfaceC16749 = this.f27317;
        if (interfaceC16749 != null) {
            boolean zTryAdvance = interfaceC16749.tryAdvance(intConsumer);
            if (!zTryAdvance) {
                this.f27317 = null;
            }
            return zTryAdvance;
        }
        InterfaceC6667 interfaceC6667 = this.f27315;
        if (!interfaceC6667.hasNext()) {
            return false;
        }
        this.f27313--;
        intConsumer.accept(interfaceC6667.nextInt());
        return true;
    }

    @Override // l.InterfaceC1124
    public final void forEachRemaining(IntConsumer intConsumer) {
        InterfaceC16749 interfaceC16749 = this.f27317;
        if (interfaceC16749 != null) {
            interfaceC16749.forEachRemaining(intConsumer);
            this.f27317 = null;
        }
        this.f27315.forEachRemaining(intConsumer);
        this.f27313 = 0L;
    }

    @Override // l.InterfaceC15234
    public final long estimateSize() {
        InterfaceC16749 interfaceC16749 = this.f27317;
        if (interfaceC16749 != null) {
            return interfaceC16749.estimateSize();
        }
        if (!this.f27315.hasNext()) {
            return 0L;
        }
        long j = this.f27313;
        return j >= 0 ? j : C13132.FOREVER_NS;
    }

    @Override // l.InterfaceC15234
    public final int characteristics() {
        return this.f27316;
    }

    @Override // l.InterfaceC18764, l.InterfaceC1124, l.InterfaceC15234
    public final InterfaceC16749 trySplit() {
        InterfaceC6667 interfaceC6667 = this.f27315;
        if (!interfaceC6667.hasNext()) {
            return null;
        }
        long j = this.f27313;
        int iMin = j > 0 ? (int) Math.min(this.f27314, j) : this.f27314;
        int[] iArrCopyOf = new int[iMin];
        int i = 0;
        while (i < iMin && interfaceC6667.hasNext()) {
            iArrCopyOf[i] = interfaceC6667.nextInt();
            this.f27313--;
            i++;
        }
        if (iMin < this.f27314 && interfaceC6667.hasNext()) {
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, this.f27314);
            while (interfaceC6667.hasNext() && i < this.f27314) {
                iArrCopyOf[i] = interfaceC6667.nextInt();
                this.f27313--;
                i++;
            }
        }
        this.f27314 = Math.min(33554432, this.f27314 + 1024);
        InterfaceC16749 interfaceC16749Mo23230 = mo23230(i, iArrCopyOf);
        if (interfaceC6667.hasNext()) {
            return interfaceC16749Mo23230;
        }
        this.f27317 = interfaceC16749Mo23230;
        return ((C17455) interfaceC16749Mo23230).trySplit();
    }
}
