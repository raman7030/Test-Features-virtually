package p067l;

import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩻ۚᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: VFO */
/* JADX INFO: loaded from: classes.dex */
public final class C24700 implements InterfaceC9948 {

    /* JADX INFO: renamed from: ۗ */
    public int f78184;

    /* JADX INFO: renamed from: ۙ */
    public boolean f78185;

    /* JADX INFO: renamed from: ۬ */
    public final /* synthetic */ C8607 f78186;

    /* JADX INFO: renamed from: ᩶ */
    public int f78187;

    /* JADX INFO: renamed from: ᩸ */
    public int f78188;

    /* JADX INFO: renamed from: ᩹ */
    public boolean f78189;

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

    public C24700(C8607 c8607) {
        this.f78186 = c8607;
        this.f78184 = 0;
        this.f78187 = c8607.f23131;
        this.f78188 = 0;
        this.f78185 = c8607.f23134;
        this.f78189 = false;
    }

    public C24700(C8607 c8607, int i, int i2, boolean z) {
        this.f78186 = c8607;
        this.f78188 = 0;
        this.f78184 = i;
        this.f78187 = i2;
        this.f78185 = z;
        this.f78189 = true;
    }

    @Override // p067l.InterfaceC16847
    public final boolean tryAdvance(Consumer consumer) {
        boolean z = this.f78185;
        C8607 c8607 = this.f78186;
        if (z) {
            this.f78185 = false;
            this.f78188++;
            consumer.accept(c8607.f23133[c8607.f23131]);
            return true;
        }
        Object[] objArr = c8607.f23133;
        while (true) {
            int i = this.f78184;
            if (i >= this.f78187) {
                return false;
            }
            Object obj = objArr[i];
            if (obj != null) {
                this.f78188++;
                this.f78184 = i + 1;
                consumer.accept(obj);
                return true;
            }
            this.f78184 = i + 1;
        }
    }

    @Override // p067l.InterfaceC16847
    public final void forEachRemaining(Consumer consumer) {
        C8607 c8607 = this.f78186;
        Object[] objArr = c8607.f23133;
        if (this.f78185) {
            this.f78185 = false;
            consumer.accept(objArr[c8607.f23131]);
            this.f78188++;
        }
        while (true) {
            int i = this.f78184;
            if (i >= this.f78187) {
                return;
            }
            Object obj = objArr[i];
            if (obj != null) {
                consumer.accept(obj);
                this.f78188++;
            }
            this.f78184++;
        }
    }

    @Override // p067l.InterfaceC16847
    public final int characteristics() {
        return this.f78189 ? 1 : 65;
    }

    @Override // p067l.InterfaceC16847
    public final long estimateSize() {
        boolean z = this.f78189;
        C8607 c8607 = this.f78186;
        if (!z) {
            return c8607.f23130 - this.f78188;
        }
        int i = c8607.f23130;
        long j = i - this.f78188;
        if (c8607.f23134) {
            i--;
        }
        return Math.min(j, ((long) ((((double) i) / ((double) c8607.f23131)) * ((double) (this.f78187 - this.f78184)))) + (this.f78185 ? 1L : 0L));
    }

    @Override // p067l.InterfaceC16847
    public final InterfaceC16847 trySplit() {
        int i;
        int i2 = this.f78184;
        int i3 = this.f78187;
        if (i2 >= i3 - 1 || (i = (i3 - i2) >> 1) <= 1) {
            return null;
        }
        int i4 = i + i2;
        C24700 c24700 = new C24700(this.f78186, i2, i4, this.f78185);
        this.f78184 = i4;
        this.f78185 = false;
        this.f78189 = true;
        return c24700;
    }
}
