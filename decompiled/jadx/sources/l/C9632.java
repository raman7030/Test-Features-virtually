package l;

import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.LongBinaryOperator;

/* JADX INFO: renamed from: l.ۢܰᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9632 extends AbstractC9198 {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;

    public /* synthetic */ C9632(EnumC8578 enumC8578, Object obj, int i) {
        this.h = i;
        this.i = obj;
    }

    @Override // l.AbstractC9198
    public final InterfaceC18204 e0() {
        switch (this.h) {
            case 0:
                return new C13285((LongBinaryOperator) this.i);
            case 1:
                return new C20737((DoubleBinaryOperator) this.i);
            case 2:
                return new C5756((BinaryOperator) this.i);
            default:
                return new C12538((IntBinaryOperator) this.i);
        }
    }
}
