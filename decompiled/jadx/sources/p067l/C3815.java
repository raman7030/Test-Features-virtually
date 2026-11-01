package p067l;

import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.֫֫᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3815 extends AbstractC23262 implements InterfaceC16847, Consumer {

    /* JADX INFO: renamed from: f */
    public Object f8175f;

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return C24719.$default$andThen(this, consumer);
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

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f8175f = obj;
    }

    @Override // p067l.InterfaceC16847
    public final boolean tryAdvance(Consumer consumer) {
        C12826.requireNonNull(consumer);
        while (m51805e() != EnumC17225.NO_MORE && this.f73101a.tryAdvance(this)) {
            if (m51804a(1L) == 1) {
                consumer.accept(this.f8175f);
                this.f8175f = null;
                return true;
            }
        }
        return false;
    }

    @Override // p067l.InterfaceC16847
    public final void forEachRemaining(Consumer consumer) {
        C12826.requireNonNull(consumer);
        C22333 c22333 = null;
        while (true) {
            EnumC17225 enumC17225M51805e = m51805e();
            if (enumC17225M51805e == EnumC17225.NO_MORE) {
                return;
            }
            EnumC17225 enumC17225 = EnumC17225.MAYBE_MORE;
            InterfaceC16847 interfaceC16847 = this.f73101a;
            if (enumC17225M51805e == enumC17225) {
                int i = this.f73103c;
                if (c22333 == null) {
                    c22333 = new C22333(i);
                } else {
                    c22333.f28412a = 0;
                }
                long j = 0;
                while (interfaceC16847.tryAdvance(c22333)) {
                    j++;
                    if (j >= i) {
                        break;
                    }
                }
                if (j == 0) {
                    return;
                }
                long jM51804a = m51804a(j);
                for (int i2 = 0; i2 < jM51804a; i2++) {
                    consumer.accept(c22333.f70501b[i2]);
                }
            } else {
                interfaceC16847.forEachRemaining(consumer);
                return;
            }
        }
    }

    @Override // p067l.AbstractC23262
    /* JADX INFO: renamed from: b */
    public final InterfaceC16847 mo7434b(InterfaceC16847 interfaceC16847) {
        return new C3815(interfaceC16847, this);
    }
}
