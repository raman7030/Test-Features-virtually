package p067l;

import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.᩻ۧ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public final class C24858 extends AbstractC11111 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ BinaryOperator f79402h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ BiConsumer f79403i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Supplier f79404j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ InterfaceC13477 f79405k;

    @Override // p067l.AbstractC11111
    /* JADX INFO: renamed from: e0 */
    public final InterfaceC19670 mo4649e0() {
        return new C7424(this.f79404j, this.f79403i, this.f79402h);
    }

    @Override // p067l.AbstractC11111, p067l.InterfaceC22373
    /* JADX INFO: renamed from: j */
    public final int mo23312j() {
        if (this.f79405k.characteristics().contains(EnumC8112.UNORDERED)) {
            return EnumC9335.f25423r;
        }
        return 0;
    }

    public C24858(EnumC10521 enumC10521, BinaryOperator binaryOperator, BiConsumer biConsumer, Supplier supplier, InterfaceC13477 interfaceC13477) {
        this.f79402h = binaryOperator;
        this.f79403i = biConsumer;
        this.f79404j = supplier;
        this.f79405k = interfaceC13477;
    }
}
