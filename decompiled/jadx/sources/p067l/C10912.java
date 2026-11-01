package p067l;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۡܺᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: AAP5 */
/* JADX INFO: loaded from: classes4.dex */
public class C10912 implements InterfaceC18287 {

    /* JADX INFO: renamed from: ۗ */
    public long f30247;

    /* JADX INFO: renamed from: ᩶ */
    public final InterfaceC8705 f30249;

    /* JADX INFO: renamed from: ᩸ */
    public final int f30250;

    /* JADX INFO: renamed from: ۙ */
    public int f30248 = 1024;

    /* JADX INFO: renamed from: ᩹ */
    public InterfaceC18287 f30251 = null;

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
    public /* bridge */ /* synthetic */ Comparator getComparator() {
        return getComparator();
    }

    @Override // p067l.InterfaceC18287, p067l.InterfaceC16847
    public InterfaceC6713 getComparator() {
        throw new IllegalStateException();
    }

    /* JADX INFO: renamed from: ֫ */
    public InterfaceC18287 mo25174(int i, int[] iArr) {
        C11755.m26983(iArr.length, 0, i);
        return new C18958(0, i, this.f30250, iArr);
    }

    public C10912(InterfaceC8705 interfaceC8705, long j, int i) {
        this.f30249 = interfaceC8705;
        this.f30247 = j;
        if ((i & 4096) != 0) {
            this.f30250 = i | 256;
        } else {
            this.f30250 = i | 16704;
        }
    }

    @Override // p067l.InterfaceC3437
    public final boolean tryAdvance(IntConsumer intConsumer) {
        InterfaceC18287 interfaceC18287 = this.f30251;
        if (interfaceC18287 != null) {
            boolean zTryAdvance = interfaceC18287.tryAdvance(intConsumer);
            if (!zTryAdvance) {
                this.f30251 = null;
            }
            return zTryAdvance;
        }
        InterfaceC8705 interfaceC8705 = this.f30249;
        if (!interfaceC8705.hasNext()) {
            return false;
        }
        this.f30247--;
        intConsumer.accept(interfaceC8705.nextInt());
        return true;
    }

    @Override // p067l.InterfaceC3437
    public final void forEachRemaining(IntConsumer intConsumer) {
        InterfaceC18287 interfaceC18287 = this.f30251;
        if (interfaceC18287 != null) {
            interfaceC18287.forEachRemaining(intConsumer);
            this.f30251 = null;
        }
        this.f30249.forEachRemaining(intConsumer);
        this.f30247 = 0L;
    }

    @Override // p067l.InterfaceC16847
    public final long estimateSize() {
        InterfaceC18287 interfaceC18287 = this.f30251;
        if (interfaceC18287 != null) {
            return interfaceC18287.estimateSize();
        }
        if (!this.f30249.hasNext()) {
            return 0L;
        }
        long j = this.f30247;
        return j >= 0 ? j : C14849.FOREVER_NS;
    }

    @Override // p067l.InterfaceC16847
    public final int characteristics() {
        return this.f30250;
    }

    @Override // p067l.InterfaceC20202, p067l.InterfaceC3437, p067l.InterfaceC16847
    public final InterfaceC18287 trySplit() {
        InterfaceC8705 interfaceC8705 = this.f30249;
        if (!interfaceC8705.hasNext()) {
            return null;
        }
        long j = this.f30247;
        int iMin = j > 0 ? (int) Math.min(this.f30248, j) : this.f30248;
        int[] iArrCopyOf = new int[iMin];
        int i = 0;
        while (i < iMin && interfaceC8705.hasNext()) {
            iArrCopyOf[i] = interfaceC8705.nextInt();
            this.f30247--;
            i++;
        }
        if (iMin < this.f30248 && interfaceC8705.hasNext()) {
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, this.f30248);
            while (interfaceC8705.hasNext() && i < this.f30248) {
                iArrCopyOf[i] = interfaceC8705.nextInt();
                this.f30247--;
                i++;
            }
        }
        this.f30248 = Math.min(33554432, this.f30248 + 1024);
        InterfaceC18287 interfaceC18287Mo25174 = mo25174(i, iArrCopyOf);
        if (interfaceC8705.hasNext()) {
            return interfaceC18287Mo25174;
        }
        this.f30251 = interfaceC18287Mo25174;
        return ((C18958) interfaceC18287Mo25174).trySplit();
    }
}
