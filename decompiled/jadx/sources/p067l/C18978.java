package p067l;

import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܿܽᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4AQC */
/* JADX INFO: loaded from: classes5.dex */
public class C18978 implements InterfaceC18307 {

    /* JADX INFO: renamed from: ۗ */
    public final int f56597;

    /* JADX INFO: renamed from: ۙ */
    public int f56598;

    /* JADX INFO: renamed from: ᩶ */
    public int f56599;

    /* JADX INFO: renamed from: ᩸ */
    public final char[] f56600;

    /* JADX INFO: renamed from: ᩹ */
    public final int f56601;

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

    @Override // p067l.InterfaceC3437
    public final void forEachRemaining(Object obj) {
        InterfaceC24857 interfaceC24857 = (InterfaceC24857) obj;
        C12826.requireNonNull(interfaceC24857);
        while (true) {
            int i = this.f56599;
            if (i >= this.f56598) {
                return;
            }
            interfaceC24857.mo20276(this.f56600[this.f56597 + i]);
            this.f56599++;
        }
    }

    @Override // p067l.InterfaceC3437
    public final boolean tryAdvance(Object obj) {
        InterfaceC24857 interfaceC24857 = (InterfaceC24857) obj;
        if (this.f56599 >= this.f56598) {
            return false;
        }
        C12826.requireNonNull(interfaceC24857);
        int i = this.f56599;
        this.f56599 = i + 1;
        interfaceC24857.mo20276(this.f56600[this.f56597 + i]);
        return true;
    }

    public C18978(int i, int i2, char[] cArr, int i3) {
        this.f56600 = cArr;
        this.f56597 = i;
        this.f56598 = i2;
        this.f56601 = i3 | 16720;
    }

    @Override // p067l.InterfaceC16847
    public final long estimateSize() {
        return this.f56598 - this.f56599;
    }

    @Override // p067l.InterfaceC16847
    public final int characteristics() {
        return this.f56601;
    }

    /* JADX INFO: renamed from: ֫ */
    public C18978 mo37089(int i, int i2) {
        return new C18978(i, i2, this.f56600, this.f56601);
    }

    @Override // p067l.InterfaceC16847
    public final InterfaceC18307 trySplit() {
        int i = this.f56599;
        int i2 = (this.f56598 - i) >> 1;
        if (i2 <= 1) {
            return null;
        }
        int i3 = this.f56597 + i;
        this.f56599 = i + i2;
        return mo37089(i3, i2);
    }
}
