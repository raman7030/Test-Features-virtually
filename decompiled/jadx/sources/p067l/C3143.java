package p067l;

import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.֨֫ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: UCGS */
/* JADX INFO: loaded from: classes3.dex */
public final class C3143 implements InterfaceC18307 {

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ C23261 f5751;

    /* JADX INFO: renamed from: ᩶ */
    public int f5752;

    /* JADX INFO: renamed from: ᩸ */
    public boolean f5753;

    /* JADX INFO: renamed from: ᩹ */
    public int f5754;

    @Override // p067l.InterfaceC16847
    public final int characteristics() {
        return 16720;
    }

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
    public final /* bridge */ /* synthetic */ Comparator getComparator() {
        getComparator();
        throw null;
    }

    @Override // p067l.InterfaceC18307, p067l.InterfaceC16847
    public final InterfaceC4070 getComparator() {
        throw new IllegalStateException();
    }

    @Override // p067l.InterfaceC3437
    public final void forEachRemaining(Object obj) {
        InterfaceC24857 interfaceC24857 = (InterfaceC24857) obj;
        C23261 c23261 = this.f5751;
        char[] cArr = c23261.f73099;
        int i = this.f5753 ? this.f5754 : c23261.f73100;
        while (true) {
            int i2 = this.f5752;
            if (i2 >= i) {
                return;
            }
            interfaceC24857.mo20276(cArr[i2]);
            this.f5752++;
        }
    }

    @Override // p067l.InterfaceC3437
    public final boolean tryAdvance(Object obj) {
        InterfaceC24857 interfaceC24857 = (InterfaceC24857) obj;
        int i = this.f5752;
        boolean z = this.f5753;
        C23261 c23261 = this.f5751;
        if (i >= (z ? this.f5754 : c23261.f73100)) {
            return false;
        }
        char[] cArr = c23261.f73099;
        this.f5752 = i + 1;
        interfaceC24857.mo20276(cArr[i]);
        return true;
    }

    public C3143(C23261 c23261) {
        this(c23261, 0, c23261.f73100, false);
    }

    public C3143(C23261 c23261, int i, int i2, boolean z) {
        this.f5751 = c23261;
        this.f5752 = i;
        this.f5754 = i2;
        this.f5753 = z;
    }

    @Override // p067l.InterfaceC16847
    public final long estimateSize() {
        return (this.f5753 ? this.f5754 : this.f5751.f73100) - this.f5752;
    }

    @Override // p067l.InterfaceC16847
    public final InterfaceC18307 trySplit() {
        boolean z = this.f5753;
        C23261 c23261 = this.f5751;
        int i = z ? this.f5754 : c23261.f73100;
        int i2 = this.f5752;
        int i3 = (i - i2) >> 1;
        if (i3 <= 1) {
            return null;
        }
        this.f5754 = i;
        int i4 = i3 + i2;
        this.f5752 = i4;
        this.f5753 = true;
        return new C3143(c23261, i2, i4, true);
    }
}
