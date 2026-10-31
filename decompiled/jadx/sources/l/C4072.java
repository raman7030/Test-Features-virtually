package l;

import java.util.function.IntConsumer;
import java.util.function.IntPredicate;

/* JADX INFO: renamed from: l.ۘܽ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4072 extends AbstractC2703 implements InterfaceC10422 {
    public final /* synthetic */ EnumC20342 c;
    public final /* synthetic */ IntPredicate d;

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        d((Integer) obj);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return C9407.$default$andThen(this, intConsumer);
    }

    @Override // l.InterfaceC10422
    public final /* synthetic */ void d(Integer num) {
        AbstractC9198.p(this, num);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4072(EnumC20342 enumC20342, IntPredicate intPredicate) {
        super(enumC20342);
        this.c = enumC20342;
        this.d = intPredicate;
    }

    @Override // l.AbstractC2703, l.InterfaceC0585
    public final void accept(int i) {
        if (this.a) {
            return;
        }
        boolean zTest = this.d.test(i);
        EnumC20342 enumC20342 = this.c;
        if (zTest == enumC20342.a) {
            this.a = true;
            this.b = enumC20342.b;
        }
    }
}
