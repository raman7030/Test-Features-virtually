package p067l;

import java.util.Deque;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.ۛ۟ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7994 extends AbstractC7168 implements InterfaceC3437 {
    @Override // p067l.InterfaceC3437
    public final boolean tryAdvance(Object obj) {
        InterfaceC24758 interfaceC24758;
        if (!m16477c()) {
            return false;
        }
        boolean zTryAdvance = ((InterfaceC3437) this.f18717d).tryAdvance(obj);
        if (!zTryAdvance) {
            if (this.f18716c == null && (interfaceC24758 = (InterfaceC24758) AbstractC7168.m16475a(this.f18718e)) != null) {
                InterfaceC3437 interfaceC3437Spliterator = interfaceC24758.spliterator();
                this.f18717d = interfaceC3437Spliterator;
                return interfaceC3437Spliterator.tryAdvance(obj);
            }
            this.f18714a = null;
        }
        return zTryAdvance;
    }

    @Override // p067l.InterfaceC3437
    public final void forEachRemaining(Object obj) {
        if (this.f18714a == null) {
            return;
        }
        if (this.f18717d == null) {
            InterfaceC16847 interfaceC16847 = this.f18716c;
            if (interfaceC16847 == null) {
                Deque dequeM16476b = m16476b();
                while (true) {
                    InterfaceC24758 interfaceC24758 = (InterfaceC24758) AbstractC7168.m16475a(dequeM16476b);
                    if (interfaceC24758 != null) {
                        interfaceC24758.mo4234g(obj);
                    } else {
                        this.f18714a = null;
                        return;
                    }
                }
            } else {
                ((InterfaceC3437) interfaceC16847).forEachRemaining(obj);
            }
        } else {
            while (tryAdvance(obj)) {
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
