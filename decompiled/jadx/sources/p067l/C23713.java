package p067l;

import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntToLongFunction;
import java.util.function.IntUnaryOperator;

/* JADX INFO: renamed from: l.᩹ᩳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final class C23713 extends AbstractC3400 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f75462b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AbstractC14463 f75463c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C23713(AbstractC14463 abstractC14463, InterfaceC2925 interfaceC2925, int i) {
        super(interfaceC2925);
        this.f75462b = i;
        this.f75463c = abstractC14463;
    }

    @Override // p067l.AbstractC3400, p067l.InterfaceC2925
    /* JADX INFO: renamed from: c */
    public void mo4231c(long j) {
        switch (this.f75462b) {
            case 5:
                this.f6750a.mo4231c(-1L);
                break;
            default:
                super.mo4231c(j);
                break;
        }
    }

    @Override // p067l.InterfaceC12274, p067l.InterfaceC2925
    public final void accept(int i) {
        switch (this.f75462b) {
            case 0:
                this.f6750a.accept(((IntFunction) ((C10973) this.f75463c).f30392t).apply(i));
                break;
            case 1:
                ((IntConsumer) ((C9631) this.f75463c).f26512t).accept(i);
                this.f6750a.accept(i);
                break;
            case 2:
                this.f6750a.accept(((IntUnaryOperator) ((C9631) this.f75463c).f26512t).applyAsInt(i));
                break;
            case 3:
                this.f6750a.accept(((IntToLongFunction) ((C23023) this.f75463c).f72404t).applyAsLong(i));
                break;
            case 4:
                this.f6750a.accept(((IntToDoubleFunction) ((C23043) this.f75463c).f72427t).applyAsDouble(i));
                break;
            default:
                if (((IntPredicate) ((C9631) this.f75463c).f26512t).test(i)) {
                    this.f6750a.accept(i);
                }
                break;
        }
    }
}
