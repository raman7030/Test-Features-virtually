package p067l;

import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۨܽᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: S6E */
/* JADX INFO: loaded from: classes4.dex */
public final class C13614 implements InterfaceC18327 {

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ C24342 f38300;

    /* JADX INFO: renamed from: ᩶ */
    public int f38301;

    /* JADX INFO: renamed from: ᩸ */
    public boolean f38302;

    /* JADX INFO: renamed from: ᩹ */
    public int f38303;

    @Override // p067l.InterfaceC16847
    public final int characteristics() {
        return 16721;
    }

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
        C24342 c24342 = this.f38300;
        float[] fArr = c24342.f77106;
        int i = this.f38302 ? this.f38303 : c24342.f77107;
        while (true) {
            int i2 = this.f38301;
            if (i2 >= i) {
                return;
            }
            interfaceC6278.mo14251(fArr[i2]);
            this.f38301++;
        }
    }

    @Override // p067l.InterfaceC3437
    public final boolean tryAdvance(Object obj) {
        InterfaceC6278 interfaceC6278 = (InterfaceC6278) obj;
        int i = this.f38301;
        boolean z = this.f38302;
        C24342 c24342 = this.f38300;
        if (i >= (z ? this.f38303 : c24342.f77107)) {
            return false;
        }
        float[] fArr = c24342.f77106;
        this.f38301 = i + 1;
        interfaceC6278.mo14251(fArr[i]);
        return true;
    }

    public C13614(C24342 c24342) {
        this(c24342, 0, c24342.f77107, false);
    }

    public C13614(C24342 c24342, int i, int i2, boolean z) {
        this.f38300 = c24342;
        this.f38301 = i;
        this.f38303 = i2;
        this.f38302 = z;
    }

    @Override // p067l.InterfaceC16847
    public final long estimateSize() {
        return (this.f38302 ? this.f38303 : this.f38300.f77107) - this.f38301;
    }

    @Override // p067l.InterfaceC16847
    public final InterfaceC18327 trySplit() {
        boolean z = this.f38302;
        C24342 c24342 = this.f38300;
        int i = z ? this.f38303 : c24342.f77107;
        int i2 = this.f38301;
        int i3 = (i - i2) >> 1;
        if (i3 <= 1) {
            return null;
        }
        this.f38303 = i;
        int i4 = i3 + i2;
        this.f38301 = i4;
        this.f38302 = true;
        return new C13614(c24342, i2, i4, true);
    }
}
