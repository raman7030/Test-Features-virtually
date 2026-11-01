package p067l;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۜܿᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: OAQ5 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8940 implements InterfaceC18327 {

    /* JADX INFO: renamed from: ۗ */
    public long f24226;

    /* JADX INFO: renamed from: ᩶ */
    public final InterfaceC3595 f24228;

    /* JADX INFO: renamed from: ᩸ */
    public final int f24229;

    /* JADX INFO: renamed from: ۙ */
    public int f24227 = 1024;

    /* JADX INFO: renamed from: ᩹ */
    public InterfaceC18327 f24230 = null;

    @Override // p067l.InterfaceC16847
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C12964.m29727(this, consumer);
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
        return C12964.m29728(this, consumer);
    }

    @Override // p067l.InterfaceC16847
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    @Override // p067l.InterfaceC3437
    public final void forEachRemaining(Object obj) {
        InterfaceC6278 interfaceC6278 = (InterfaceC6278) obj;
        InterfaceC18327 interfaceC18327 = this.f24230;
        if (interfaceC18327 != null) {
            ((C18998) interfaceC18327).forEachRemaining((Object) interfaceC6278);
            this.f24230 = null;
        }
        this.f24228.forEachRemaining(interfaceC6278);
        this.f24226 = 0L;
    }

    @Override // p067l.InterfaceC3437
    public final boolean tryAdvance(Object obj) {
        InterfaceC6278 interfaceC6278 = (InterfaceC6278) obj;
        InterfaceC18327 interfaceC18327 = this.f24230;
        if (interfaceC18327 != null) {
            boolean zTryAdvance = interfaceC18327.tryAdvance((Object) interfaceC6278);
            if (!zTryAdvance) {
                this.f24230 = null;
            }
            return zTryAdvance;
        }
        InterfaceC3595 interfaceC3595 = this.f24228;
        if (!interfaceC3595.hasNext()) {
            return false;
        }
        this.f24226--;
        interfaceC6278.mo14251(interfaceC3595.nextFloat());
        return true;
    }

    public C8940(InterfaceC3595 interfaceC3595, long j, int i) {
        this.f24228 = interfaceC3595;
        this.f24226 = j;
        this.f24229 = i | 16704;
    }

    @Override // p067l.InterfaceC16847
    public final long estimateSize() {
        InterfaceC18327 interfaceC18327 = this.f24230;
        if (interfaceC18327 != null) {
            return interfaceC18327.estimateSize();
        }
        if (!this.f24228.hasNext()) {
            return 0L;
        }
        long j = this.f24226;
        return j >= 0 ? j : C14849.FOREVER_NS;
    }

    @Override // p067l.InterfaceC16847
    public final int characteristics() {
        return this.f24229;
    }

    @Override // p067l.InterfaceC16847
    public final InterfaceC18327 trySplit() {
        InterfaceC3595 interfaceC3595 = this.f24228;
        if (!interfaceC3595.hasNext()) {
            return null;
        }
        long j = this.f24226;
        int iMin = j > 0 ? (int) Math.min(this.f24227, j) : this.f24227;
        float[] fArrCopyOf = new float[iMin];
        int i = 0;
        while (i < iMin && interfaceC3595.hasNext()) {
            fArrCopyOf[i] = interfaceC3595.nextFloat();
            this.f24226--;
            i++;
        }
        if (iMin < this.f24227 && interfaceC3595.hasNext()) {
            fArrCopyOf = Arrays.copyOf(fArrCopyOf, this.f24227);
            while (interfaceC3595.hasNext() && i < this.f24227) {
                fArrCopyOf[i] = interfaceC3595.nextFloat();
                this.f24226--;
                i++;
            }
        }
        this.f24227 = Math.min(33554432, this.f24227 + 1024);
        C11755.m26983(fArrCopyOf.length, 0, i);
        C18998 c18998 = new C18998(0, i, this.f24229, fArrCopyOf);
        if (interfaceC3595.hasNext()) {
            return c18998;
        }
        this.f24230 = c18998;
        return c18998.trySplit();
    }
}
