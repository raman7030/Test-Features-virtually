package p067l;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.۬ۚᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: AAQM */
/* JADX INFO: loaded from: classes4.dex */
public class C14641 implements InterfaceC9948 {

    /* JADX INFO: renamed from: ۗ */
    public long f41787;

    /* JADX INFO: renamed from: ᩶ */
    public final InterfaceC13833 f41789;

    /* JADX INFO: renamed from: ᩸ */
    public final int f41790;

    /* JADX INFO: renamed from: ۙ */
    public int f41788 = 1024;

    /* JADX INFO: renamed from: ᩹ */
    public InterfaceC9948 f41791 = null;

    @Override // p067l.InterfaceC16847
    public /* synthetic */ Comparator getComparator() {
        return C4779.$default$getComparator(this);
    }

    @Override // p067l.InterfaceC16847
    public /* synthetic */ long getExactSizeIfKnown() {
        return C4779.$default$getExactSizeIfKnown(this);
    }

    @Override // p067l.InterfaceC16847
    public /* synthetic */ boolean hasCharacteristics(int i) {
        return C4779.$default$hasCharacteristics(this, i);
    }

    /* JADX INFO: renamed from: ֫ */
    public InterfaceC9948 mo31747(int i, Object[] objArr) {
        C11755.m26983(objArr.length, 0, i);
        return new C22689(0, i, this.f41790, objArr);
    }

    public C14641(InterfaceC13833 interfaceC13833, long j, int i) {
        this.f41789 = interfaceC13833;
        this.f41787 = j;
        if ((i & 4096) != 0) {
            this.f41790 = i;
        } else {
            this.f41790 = i | 16448;
        }
    }

    @Override // p067l.InterfaceC16847
    public final boolean tryAdvance(Consumer consumer) {
        InterfaceC9948 interfaceC9948 = this.f41791;
        if (interfaceC9948 != null) {
            boolean zTryAdvance = interfaceC9948.tryAdvance(consumer);
            if (!zTryAdvance) {
                this.f41791 = null;
            }
            return zTryAdvance;
        }
        InterfaceC13833 interfaceC13833 = this.f41789;
        if (!interfaceC13833.hasNext()) {
            return false;
        }
        this.f41787--;
        consumer.accept(interfaceC13833.next());
        return true;
    }

    @Override // p067l.InterfaceC16847
    public final void forEachRemaining(Consumer consumer) {
        InterfaceC9948 interfaceC9948 = this.f41791;
        if (interfaceC9948 != null) {
            interfaceC9948.forEachRemaining(consumer);
            this.f41791 = null;
        }
        C14855.forEachRemaining(this.f41789, consumer);
        this.f41787 = 0L;
    }

    @Override // p067l.InterfaceC16847
    public final long estimateSize() {
        InterfaceC9948 interfaceC9948 = this.f41791;
        if (interfaceC9948 != null) {
            return interfaceC9948.estimateSize();
        }
        if (!this.f41789.hasNext()) {
            return 0L;
        }
        long j = this.f41787;
        return j >= 0 ? j : C14849.FOREVER_NS;
    }

    @Override // p067l.InterfaceC16847
    public final int characteristics() {
        return this.f41790;
    }

    @Override // p067l.InterfaceC16847
    public final InterfaceC16847 trySplit() {
        InterfaceC13833 interfaceC13833 = this.f41789;
        if (!interfaceC13833.hasNext()) {
            return null;
        }
        long j = this.f41787;
        int iMin = j > 0 ? (int) Math.min(this.f41788, j) : this.f41788;
        Object[] objArrCopyOf = new Object[iMin];
        int i = 0;
        while (i < iMin && interfaceC13833.hasNext()) {
            objArrCopyOf[i] = interfaceC13833.next();
            this.f41787--;
            i++;
        }
        if (iMin < this.f41788 && interfaceC13833.hasNext()) {
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, this.f41788);
            while (interfaceC13833.hasNext() && i < this.f41788) {
                objArrCopyOf[i] = interfaceC13833.next();
                this.f41787--;
                i++;
            }
        }
        this.f41788 = Math.min(33554432, this.f41788 + 1024);
        InterfaceC9948 interfaceC9948Mo31747 = mo31747(i, objArrCopyOf);
        if (interfaceC13833.hasNext()) {
            return interfaceC9948Mo31747;
        }
        this.f41791 = interfaceC9948Mo31747;
        return ((C22689) interfaceC9948Mo31747).trySplit();
    }
}
