package p067l;

import java.util.function.DoubleConsumer;
import java.util.function.DoublePredicate;

/* JADX INFO: renamed from: l.ۧᩳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12985 extends AbstractC4938 implements InterfaceC7580 {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ EnumC21702 f36530c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ DoublePredicate f36531d;

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        mo12365n((Double) obj);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return AbstractC17736.m40299a(this, doubleConsumer);
    }

    @Override // p067l.InterfaceC7580
    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void mo12365n(Double d) {
        AbstractC11111.m25612n(this, d);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12985(EnumC21702 enumC21702, DoublePredicate doublePredicate) {
        super(enumC21702);
        this.f36530c = enumC21702;
        this.f36531d = doublePredicate;
    }

    @Override // p067l.AbstractC4938, p067l.InterfaceC2925
    public final void accept(double d) {
        if (this.f11241a) {
            return;
        }
        boolean zTest = this.f36531d.test(d);
        EnumC21702 enumC21702 = this.f36530c;
        if (zTest == enumC21702.f68337a) {
            this.f11241a = true;
            this.f11242b = enumC21702.f68338b;
        }
    }
}
