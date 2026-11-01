package p067l;

import java.util.Comparator;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.ۧܰᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC12864 implements InterfaceC3437 {

    /* JADX INFO: renamed from: a */
    public int f36201a;

    /* JADX INFO: renamed from: b */
    public final int f36202b;

    /* JADX INFO: renamed from: c */
    public int f36203c;

    /* JADX INFO: renamed from: d */
    public final int f36204d;

    /* JADX INFO: renamed from: e */
    public Object f36205e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ AbstractC4817 f36206f;

    /* JADX INFO: renamed from: a */
    public abstract void mo4688a(int i, Object obj, Object obj2);

    /* JADX INFO: renamed from: b */
    public abstract InterfaceC3437 mo4689b(Object obj, int i, int i2);

    /* JADX INFO: renamed from: c */
    public abstract InterfaceC3437 mo4690c(int i, int i2, int i3, int i4);

    @Override // p067l.InterfaceC16847
    public final int characteristics() {
        return 16464;
    }

    @Override // p067l.InterfaceC16847
    public final /* synthetic */ Comparator getComparator() {
        return C4779.$default$getComparator(this);
    }

    @Override // p067l.InterfaceC16847
    public final /* synthetic */ long getExactSizeIfKnown() {
        return C4779.$default$getExactSizeIfKnown(this);
    }

    @Override // p067l.InterfaceC16847
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return C4779.$default$hasCharacteristics(this, i);
    }

    public AbstractC12864(AbstractC4817 abstractC4817, int i, int i2, int i3, int i4) {
        this.f36206f = abstractC4817;
        this.f36201a = i;
        this.f36202b = i2;
        this.f36203c = i3;
        this.f36204d = i4;
        Object[] objArr = abstractC4817.f10943f;
        this.f36205e = objArr == null ? abstractC4817.f10942e : objArr[i];
    }

    @Override // p067l.InterfaceC16847
    public final long estimateSize() {
        int i = this.f36201a;
        int i2 = this.f36204d;
        int i3 = this.f36202b;
        if (i == i3) {
            return ((long) i2) - ((long) this.f36203c);
        }
        long[] jArr = this.f36206f.f65671d;
        return ((jArr[i3] + ((long) i2)) - jArr[i]) - ((long) this.f36203c);
    }

    @Override // p067l.InterfaceC3437
    public final boolean tryAdvance(Object obj) {
        C12826.requireNonNull(obj);
        int i = this.f36201a;
        int i2 = this.f36202b;
        if (i >= i2 && (i != i2 || this.f36203c >= this.f36204d)) {
            return false;
        }
        Object obj2 = this.f36205e;
        int i3 = this.f36203c;
        this.f36203c = i3 + 1;
        mo4688a(i3, obj2, obj);
        int i4 = this.f36203c;
        Object obj3 = this.f36205e;
        AbstractC4817 abstractC4817 = this.f36206f;
        if (i4 == abstractC4817.mo10210q(obj3)) {
            this.f36203c = 0;
            int i5 = this.f36201a + 1;
            this.f36201a = i5;
            Object[] objArr = abstractC4817.f10943f;
            if (objArr != null && i5 <= i2) {
                this.f36205e = objArr[i5];
            }
        }
        return true;
    }

    @Override // p067l.InterfaceC3437
    public final void forEachRemaining(Object obj) {
        AbstractC4817 abstractC4817;
        C12826.requireNonNull(obj);
        int i = this.f36201a;
        int i2 = this.f36204d;
        int i3 = this.f36202b;
        if (i < i3 || (i == i3 && this.f36203c < i2)) {
            int i4 = this.f36203c;
            while (true) {
                abstractC4817 = this.f36206f;
                if (i >= i3) {
                    break;
                }
                Object obj2 = abstractC4817.f10943f[i];
                abstractC4817.mo10209p(obj2, i4, abstractC4817.mo10210q(obj2), obj);
                i++;
                i4 = 0;
            }
            abstractC4817.mo10209p(this.f36201a == i3 ? this.f36205e : abstractC4817.f10943f[i3], i4, i2, obj);
            this.f36201a = i3;
            this.f36203c = i2;
        }
    }

    @Override // p067l.InterfaceC16847
    public final InterfaceC3437 trySplit() {
        int i = this.f36201a;
        int i2 = this.f36202b;
        if (i < i2) {
            int i3 = i2 - 1;
            int i4 = this.f36203c;
            AbstractC4817 abstractC4817 = this.f36206f;
            InterfaceC3437 interfaceC3437Mo4690c = mo4690c(i, i3, i4, abstractC4817.mo10210q(abstractC4817.f10943f[i3]));
            this.f36201a = i2;
            this.f36203c = 0;
            this.f36205e = abstractC4817.f10943f[i2];
            return interfaceC3437Mo4690c;
        }
        if (i != i2) {
            return null;
        }
        int i5 = this.f36203c;
        int i6 = (this.f36204d - i5) / 2;
        if (i6 == 0) {
            return null;
        }
        InterfaceC3437 interfaceC3437Mo4689b = mo4689b(this.f36205e, i5, i6);
        this.f36203c += i6;
        return interfaceC3437Mo4689b;
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        forEachRemaining((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return tryAdvance((Object) intConsumer);
    }

    @Override // p067l.InterfaceC3437, p067l.InterfaceC16847
    public /* bridge */ /* synthetic */ InterfaceC20202 trySplit() {
        return (InterfaceC20202) trySplit();
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        forEachRemaining((Object) longConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(LongConsumer longConsumer) {
        return tryAdvance((Object) longConsumer);
    }

    @Override // p067l.InterfaceC3437, p067l.InterfaceC16847
    public /* bridge */ /* synthetic */ InterfaceC2766 trySplit() {
        return (InterfaceC2766) trySplit();
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        forEachRemaining((Object) doubleConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(DoubleConsumer doubleConsumer) {
        return tryAdvance((Object) doubleConsumer);
    }

    @Override // p067l.InterfaceC3437, p067l.InterfaceC16847
    public /* bridge */ /* synthetic */ InterfaceC10124 trySplit() {
        return (InterfaceC10124) trySplit();
    }
}
