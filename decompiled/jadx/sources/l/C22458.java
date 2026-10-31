package l;

import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntToLongFunction;
import java.util.function.IntUnaryOperator;

/* JADX INFO: renamed from: l.᩹ᩳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final class C22458 extends AbstractC1085 {
    public final /* synthetic */ int b;
    public final /* synthetic */ AbstractC12725 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C22458(AbstractC12725 abstractC12725, InterfaceC0585 interfaceC0585, int i) {
        super(interfaceC0585);
        this.b = i;
        this.c = abstractC12725;
    }

    @Override // l.AbstractC1085, l.InterfaceC0585
    public void c(long j) {
        switch (this.b) {
            case 5:
                this.a.c(-1L);
                break;
            default:
                super.c(j);
                break;
        }
    }

    @Override // l.InterfaceC10422, l.InterfaceC0585
    public final void accept(int i) {
        switch (this.b) {
            case 0:
                this.a.accept(((IntFunction) ((C9053) this.c).t).apply(i));
                break;
            case 1:
                ((IntConsumer) ((C7641) this.c).t).accept(i);
                this.a.accept(i);
                break;
            case 2:
                this.a.accept(((IntUnaryOperator) ((C7641) this.c).t).applyAsInt(i));
                break;
            case 3:
                this.a.accept(((IntToLongFunction) ((C21732) this.c).t).applyAsLong(i));
                break;
            case 4:
                this.a.accept(((IntToDoubleFunction) ((C21753) this.c).t).applyAsDouble(i));
                break;
            default:
                if (((IntPredicate) ((C7641) this.c).t).test(i)) {
                    this.a.accept(i);
                }
                break;
        }
    }
}
