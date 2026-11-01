package p067l;

import java.util.function.Function;

/* JADX INFO: renamed from: l.ܰܰᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15544 extends AbstractC9850 {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f44413s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ Function f44414t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15544(AbstractC13204 abstractC13204, int i, Function function, int i2) {
        super(abstractC13204, i);
        this.f44413s = i2;
        this.f44414t = function;
    }

    @Override // p067l.AbstractC14463
    /* JADX INFO: renamed from: q0 */
    public final InterfaceC2925 mo4008q0(int i, InterfaceC2925 interfaceC2925) {
        switch (this.f44413s) {
            case 0:
                return new C4227(this, interfaceC2925, 3);
            default:
                return new C21506(this, interfaceC2925);
        }
    }
}
