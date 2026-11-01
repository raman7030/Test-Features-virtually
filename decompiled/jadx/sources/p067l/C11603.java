package p067l;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۢܽᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4AQC */
/* JADX INFO: loaded from: classes4.dex */
public class C11603 implements InterfaceC18307 {

    /* JADX INFO: renamed from: ۗ */
    public long f32363;

    /* JADX INFO: renamed from: ᩶ */
    public final InterfaceC17480 f32365;

    /* JADX INFO: renamed from: ᩸ */
    public final int f32366;

    /* JADX INFO: renamed from: ۙ */
    public int f32364 = 1024;

    /* JADX INFO: renamed from: ᩹ */
    public InterfaceC18307 f32367 = null;

    @Override // p067l.InterfaceC16847
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C12944.m29673(this, consumer);
    }

    @Override // p067l.InterfaceC16847
    public /* synthetic */ long getExactSizeIfKnown() {
        return C4779.$default$getExactSizeIfKnown(this);
    }

    @Override // p067l.InterfaceC16847
    public /* synthetic */ boolean hasCharacteristics(int i) {
        return C4779.$default$hasCharacteristics(this, i);
    }

    @Override // p067l.InterfaceC16847
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C12944.m29674(this, consumer);
    }

    @Override // p067l.InterfaceC16847
    public /* bridge */ /* synthetic */ Comparator getComparator() {
        return getComparator();
    }

    @Override // p067l.InterfaceC18307, p067l.InterfaceC16847
    public InterfaceC4070 getComparator() {
        throw new IllegalStateException();
    }

    /* JADX INFO: renamed from: ֫ */
    public InterfaceC18307 mo25199(char[] cArr, int i) {
        C11755.m26983(cArr.length, 0, i);
        return new C18978(0, i, cArr, this.f32366);
    }

    @Override // p067l.InterfaceC3437
    public final void forEachRemaining(Object obj) {
        InterfaceC24857 interfaceC24857 = (InterfaceC24857) obj;
        InterfaceC18307 interfaceC18307 = this.f32367;
        if (interfaceC18307 != null) {
            interfaceC18307.forEachRemaining((Object) interfaceC24857);
            this.f32367 = null;
        }
        this.f32365.forEachRemaining(interfaceC24857);
        this.f32363 = 0L;
    }

    @Override // p067l.InterfaceC3437
    public final boolean tryAdvance(Object obj) {
        InterfaceC24857 interfaceC24857 = (InterfaceC24857) obj;
        InterfaceC18307 interfaceC18307 = this.f32367;
        if (interfaceC18307 != null) {
            boolean zTryAdvance = interfaceC18307.tryAdvance((Object) interfaceC24857);
            if (!zTryAdvance) {
                this.f32367 = null;
            }
            return zTryAdvance;
        }
        InterfaceC17480 interfaceC17480 = this.f32365;
        if (!interfaceC17480.hasNext()) {
            return false;
        }
        this.f32363--;
        interfaceC24857.mo20276(interfaceC17480.mo9752());
        return true;
    }

    public C11603(InterfaceC17480 interfaceC17480, long j, int i) {
        this.f32365 = interfaceC17480;
        this.f32363 = j;
        if ((i & 4096) != 0) {
            this.f32366 = i | 256;
        } else {
            this.f32366 = i | 16704;
        }
    }

    @Override // p067l.InterfaceC16847
    public final long estimateSize() {
        InterfaceC18307 interfaceC18307 = this.f32367;
        if (interfaceC18307 != null) {
            return interfaceC18307.estimateSize();
        }
        if (!this.f32365.hasNext()) {
            return 0L;
        }
        long j = this.f32363;
        return j >= 0 ? j : C14849.FOREVER_NS;
    }

    @Override // p067l.InterfaceC16847
    public final int characteristics() {
        return this.f32366;
    }

    @Override // p067l.InterfaceC16847
    public final InterfaceC18307 trySplit() {
        InterfaceC17480 interfaceC17480 = this.f32365;
        if (!interfaceC17480.hasNext()) {
            return null;
        }
        long j = this.f32363;
        int iMin = j > 0 ? (int) Math.min(this.f32364, j) : this.f32364;
        char[] cArrCopyOf = new char[iMin];
        int i = 0;
        while (i < iMin && interfaceC17480.hasNext()) {
            cArrCopyOf[i] = interfaceC17480.mo9752();
            this.f32363--;
            i++;
        }
        if (iMin < this.f32364 && interfaceC17480.hasNext()) {
            cArrCopyOf = Arrays.copyOf(cArrCopyOf, this.f32364);
            while (interfaceC17480.hasNext() && i < this.f32364) {
                cArrCopyOf[i] = interfaceC17480.mo9752();
                this.f32363--;
                i++;
            }
        }
        this.f32364 = Math.min(33554432, this.f32364 + 1024);
        InterfaceC18307 interfaceC18307Mo25199 = mo25199(cArrCopyOf, i);
        if (interfaceC17480.hasNext()) {
            return interfaceC18307Mo25199;
        }
        this.f32367 = interfaceC18307Mo25199;
        return ((C18978) interfaceC18307Mo25199).trySplit();
    }
}
