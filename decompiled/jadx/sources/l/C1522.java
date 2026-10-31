package l;

import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.֫֫᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1522 extends AbstractC21984 implements InterfaceC15234, Consumer {
    public Object f;

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return C23517.$default$andThen(this, consumer);
    }

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

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f = obj;
    }

    @Override // l.InterfaceC15234
    public final boolean tryAdvance(Consumer consumer) {
        C11003.requireNonNull(consumer);
        while (e() != EnumC15632.NO_MORE && this.a.tryAdvance(this)) {
            if (a(1L) == 1) {
                consumer.accept(this.f);
                this.f = null;
                return true;
            }
        }
        return false;
    }

    @Override // l.InterfaceC15234
    public final void forEachRemaining(Consumer consumer) {
        C11003.requireNonNull(consumer);
        C21006 c21006 = null;
        while (true) {
            EnumC15632 enumC15632E = e();
            if (enumC15632E == EnumC15632.NO_MORE) {
                return;
            }
            EnumC15632 enumC15632 = EnumC15632.MAYBE_MORE;
            InterfaceC15234 interfaceC15234 = this.a;
            if (enumC15632E == enumC15632) {
                int i = this.c;
                if (c21006 == null) {
                    c21006 = new C21006(i);
                } else {
                    c21006.a = 0;
                }
                long j = 0;
                while (interfaceC15234.tryAdvance(c21006)) {
                    j++;
                    if (j >= i) {
                        break;
                    }
                }
                if (j == 0) {
                    return;
                }
                long jA = a(j);
                for (int i2 = 0; i2 < jA; i2++) {
                    consumer.accept(c21006.b[i2]);
                }
            } else {
                interfaceC15234.forEachRemaining(consumer);
                return;
            }
        }
    }

    @Override // l.AbstractC21984
    public final InterfaceC15234 b(InterfaceC15234 interfaceC15234) {
        return new C1522(interfaceC15234, this);
    }
}
