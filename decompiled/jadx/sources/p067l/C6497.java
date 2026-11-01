package p067l;

import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۙ֫ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1DS */
/* JADX INFO: loaded from: classes3.dex */
public final class C6497 implements InterfaceC18307 {

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ C5156 f16794;

    /* JADX INFO: renamed from: ᩶ */
    public int f16795;

    /* JADX INFO: renamed from: ᩸ */
    public boolean f16796;

    /* JADX INFO: renamed from: ᩹ */
    public int f16797;

    @Override // p067l.InterfaceC16847
    public final int characteristics() {
        return 16721;
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
        C5156 c5156 = this.f16794;
        char[] cArr = c5156.f12129;
        int i = this.f16796 ? this.f16797 : c5156.f12130;
        while (true) {
            int i2 = this.f16795;
            if (i2 >= i) {
                return;
            }
            interfaceC24857.mo20276(cArr[i2]);
            this.f16795++;
        }
    }

    @Override // p067l.InterfaceC3437
    public final boolean tryAdvance(Object obj) {
        InterfaceC24857 interfaceC24857 = (InterfaceC24857) obj;
        int i = this.f16795;
        boolean z = this.f16796;
        C5156 c5156 = this.f16794;
        if (i >= (z ? this.f16797 : c5156.f12130)) {
            return false;
        }
        char[] cArr = c5156.f12129;
        this.f16795 = i + 1;
        interfaceC24857.mo20276(cArr[i]);
        return true;
    }

    public C6497(C5156 c5156) {
        this(c5156, 0, c5156.f12130, false);
    }

    public C6497(C5156 c5156, int i, int i2, boolean z) {
        this.f16794 = c5156;
        this.f16795 = i;
        this.f16797 = i2;
        this.f16796 = z;
    }

    @Override // p067l.InterfaceC16847
    public final long estimateSize() {
        return (this.f16796 ? this.f16797 : this.f16794.f12130) - this.f16795;
    }

    @Override // p067l.InterfaceC16847
    public final InterfaceC18307 trySplit() {
        boolean z = this.f16796;
        C5156 c5156 = this.f16794;
        int i = z ? this.f16797 : c5156.f12130;
        int i2 = this.f16795;
        int i3 = (i - i2) >> 1;
        if (i3 <= 1) {
            return null;
        }
        this.f16797 = i;
        int i4 = i3 + i2;
        this.f16795 = i4;
        this.f16796 = true;
        return new C6497(c5156, i2, i4, true);
    }
}
