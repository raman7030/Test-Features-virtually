package p067l;

import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۙܽᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: HBSC */
/* JADX INFO: loaded from: classes3.dex */
public final class C6908 implements InterfaceC18327 {

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ C12273 f17982;

    /* JADX INFO: renamed from: ᩶ */
    public int f17983;

    /* JADX INFO: renamed from: ᩸ */
    public boolean f17984;

    /* JADX INFO: renamed from: ᩹ */
    public int f17985;

    @Override // p067l.InterfaceC16847
    public final int characteristics() {
        return 16720;
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
        C12273 c12273 = this.f17982;
        float[] fArr = c12273.f34289;
        int i = this.f17984 ? this.f17985 : c12273.f34290;
        while (true) {
            int i2 = this.f17983;
            if (i2 >= i) {
                return;
            }
            interfaceC6278.mo14251(fArr[i2]);
            this.f17983++;
        }
    }

    @Override // p067l.InterfaceC3437
    public final boolean tryAdvance(Object obj) {
        InterfaceC6278 interfaceC6278 = (InterfaceC6278) obj;
        int i = this.f17983;
        boolean z = this.f17984;
        C12273 c12273 = this.f17982;
        if (i >= (z ? this.f17985 : c12273.f34290)) {
            return false;
        }
        float[] fArr = c12273.f34289;
        this.f17983 = i + 1;
        interfaceC6278.mo14251(fArr[i]);
        return true;
    }

    public C6908(C12273 c12273) {
        this(c12273, 0, c12273.f34290, false);
    }

    public C6908(C12273 c12273, int i, int i2, boolean z) {
        this.f17982 = c12273;
        this.f17983 = i;
        this.f17985 = i2;
        this.f17984 = z;
    }

    @Override // p067l.InterfaceC16847
    public final long estimateSize() {
        return (this.f17984 ? this.f17985 : this.f17982.f34290) - this.f17983;
    }

    @Override // p067l.InterfaceC16847
    public final InterfaceC18327 trySplit() {
        boolean z = this.f17984;
        C12273 c12273 = this.f17982;
        int i = z ? this.f17985 : c12273.f34290;
        int i2 = this.f17983;
        int i3 = (i - i2) >> 1;
        if (i3 <= 1) {
            return null;
        }
        this.f17985 = i;
        int i4 = i3 + i2;
        this.f17983 = i4;
        this.f17984 = true;
        return new C6908(c12273, i2, i4, true);
    }
}
