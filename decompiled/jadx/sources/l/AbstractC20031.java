package l;

import java.util.Comparator;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.᩶۟ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC20031 extends AbstractC21984 implements InterfaceC1124 {
    public abstract void g(Object obj);

    @Override // l.InterfaceC15234
    public final /* synthetic */ Comparator getComparator() {
        return C2536.$default$getComparator(this);
    }

    @Override // l.InterfaceC15234
    public final /* synthetic */ long getExactSizeIfKnown() {
        return C2536.$default$getExactSizeIfKnown(this);
    }

    @Override // l.InterfaceC15234
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return C2536.$default$hasCharacteristics(this, i);
    }

    public abstract AbstractC22957 j(int i);

    @Override // l.InterfaceC1124
    public final boolean tryAdvance(Object obj) {
        C11003.requireNonNull(obj);
        while (e() != EnumC15632.NO_MORE && ((InterfaceC1124) this.a).tryAdvance(this)) {
            if (a(1L) == 1) {
                g(obj);
                return true;
            }
        }
        return false;
    }

    @Override // l.InterfaceC1124
    public final void forEachRemaining(Object obj) {
        C11003.requireNonNull(obj);
        AbstractC22957 abstractC22957J = null;
        while (true) {
            EnumC15632 enumC15632E = e();
            if (enumC15632E == EnumC15632.NO_MORE) {
                return;
            }
            EnumC15632 enumC15632 = EnumC15632.MAYBE_MORE;
            InterfaceC15234 interfaceC15234 = this.a;
            if (enumC15632E == enumC15632) {
                int i = this.c;
                if (abstractC22957J == null) {
                    abstractC22957J = j(i);
                } else {
                    abstractC22957J.b = 0;
                }
                long j = 0;
                while (((InterfaceC1124) interfaceC15234).tryAdvance(abstractC22957J)) {
                    j++;
                    if (j >= i) {
                        break;
                    }
                }
                if (j == 0) {
                    return;
                } else {
                    abstractC22957J.a(obj, a(j));
                }
            } else {
                ((InterfaceC1124) interfaceC15234).forEachRemaining(obj);
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
