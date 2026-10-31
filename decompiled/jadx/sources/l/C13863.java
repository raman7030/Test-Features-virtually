package l;

import java.util.function.Function;

/* JADX INFO: renamed from: l.ܰܰᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13863 extends AbstractC7872 {
    public final /* synthetic */ int s;
    public final /* synthetic */ Function t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13863(AbstractC11401 abstractC11401, int i, Function function, int i2) {
        super(abstractC11401, i);
        this.s = i2;
        this.t = function;
    }

    @Override // l.AbstractC12725
    public final InterfaceC0585 q0(int i, InterfaceC0585 interfaceC0585) {
        switch (this.s) {
            case 0:
                return new C1955(this, interfaceC0585, 3);
            default:
                return new C20136(this, interfaceC0585);
        }
    }
}
