package l;

import java.util.function.DoubleConsumer;
import java.util.function.DoublePredicate;

/* JADX INFO: renamed from: l.ۧᩳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11170 extends AbstractC2703 implements InterfaceC5483 {
    public final /* synthetic */ EnumC20342 c;
    public final /* synthetic */ DoublePredicate d;

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        n((Double) obj);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return AbstractC16169.a(this, doubleConsumer);
    }

    @Override // l.InterfaceC5483
    public final /* synthetic */ void n(Double d) {
        AbstractC9198.n(this, d);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11170(EnumC20342 enumC20342, DoublePredicate doublePredicate) {
        super(enumC20342);
        this.c = enumC20342;
        this.d = doublePredicate;
    }

    @Override // l.AbstractC2703, l.InterfaceC0585
    public final void accept(double d) {
        if (this.a) {
            return;
        }
        boolean zTest = this.d.test(d);
        EnumC20342 enumC20342 = this.c;
        if (zTest == enumC20342.a) {
            this.a = true;
            this.b = enumC20342.b;
        }
    }
}
