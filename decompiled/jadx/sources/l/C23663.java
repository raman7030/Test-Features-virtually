package l;

import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.᩻ۧ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public final class C23663 extends AbstractC9198 {
    public final /* synthetic */ BinaryOperator h;
    public final /* synthetic */ BiConsumer i;
    public final /* synthetic */ Supplier j;
    public final /* synthetic */ InterfaceC11688 k;

    @Override // l.AbstractC9198
    public final InterfaceC18204 e0() {
        return new C5319(this.j, this.i, this.h);
    }

    @Override // l.AbstractC9198, l.InterfaceC21048
    public final int j() {
        if (this.k.characteristics().contains(EnumC6043.UNORDERED)) {
            return EnumC7330.r;
        }
        return 0;
    }

    public C23663(EnumC8578 enumC8578, BinaryOperator binaryOperator, BiConsumer biConsumer, Supplier supplier, InterfaceC11688 interfaceC11688) {
        this.h = binaryOperator;
        this.i = biConsumer;
        this.j = supplier;
        this.k = interfaceC11688;
    }
}
