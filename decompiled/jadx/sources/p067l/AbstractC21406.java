package p067l;

import java.util.Comparator;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.᩶۟ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC21406 extends AbstractC23262 implements InterfaceC3437 {
    /* JADX INFO: renamed from: g */
    public abstract void mo9815g(Object obj);

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

    /* JADX INFO: renamed from: j */
    public abstract AbstractC24187 mo9816j(int i);

    @Override // p067l.InterfaceC3437
    public final boolean tryAdvance(Object obj) {
        C12826.requireNonNull(obj);
        while (m51805e() != EnumC17225.NO_MORE && ((InterfaceC3437) this.f73101a).tryAdvance(this)) {
            if (m51804a(1L) == 1) {
                mo9815g(obj);
                return true;
            }
        }
        return false;
    }

    @Override // p067l.InterfaceC3437
    public final void forEachRemaining(Object obj) {
        C12826.requireNonNull(obj);
        AbstractC24187 abstractC24187Mo9816j = null;
        while (true) {
            EnumC17225 enumC17225M51805e = m51805e();
            if (enumC17225M51805e == EnumC17225.NO_MORE) {
                return;
            }
            EnumC17225 enumC17225 = EnumC17225.MAYBE_MORE;
            InterfaceC16847 interfaceC16847 = this.f73101a;
            if (enumC17225M51805e == enumC17225) {
                int i = this.f73103c;
                if (abstractC24187Mo9816j == null) {
                    abstractC24187Mo9816j = mo9816j(i);
                } else {
                    abstractC24187Mo9816j.f76672b = 0;
                }
                long j = 0;
                while (((InterfaceC3437) interfaceC16847).tryAdvance(abstractC24187Mo9816j)) {
                    j++;
                    if (j >= i) {
                        break;
                    }
                }
                if (j == 0) {
                    return;
                } else {
                    abstractC24187Mo9816j.mo26438a(obj, m51804a(j));
                }
            } else {
                ((InterfaceC3437) interfaceC16847).forEachRemaining(obj);
                return;
            }
        }
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        forEachRemaining((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return tryAdvance((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        forEachRemaining((Object) longConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(LongConsumer longConsumer) {
        return tryAdvance((Object) longConsumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        forEachRemaining((Object) doubleConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(DoubleConsumer doubleConsumer) {
        return tryAdvance((Object) doubleConsumer);
    }
}
