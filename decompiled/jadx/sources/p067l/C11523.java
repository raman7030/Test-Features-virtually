package p067l;

import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.LongBinaryOperator;

/* JADX INFO: renamed from: l.ۢܰᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11523 extends AbstractC11111 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f32138h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f32139i;

    public /* synthetic */ C11523(EnumC10521 enumC10521, Object obj, int i) {
        this.f32138h = i;
        this.f32139i = obj;
    }

    @Override // p067l.AbstractC11111
    /* JADX INFO: renamed from: e0 */
    public final InterfaceC19670 mo4649e0() {
        switch (this.f32138h) {
            case 0:
                return new C14995((LongBinaryOperator) this.f32139i);
            case 1:
                return new C22077((DoubleBinaryOperator) this.f32139i);
            case 2:
                return new C7839((BinaryOperator) this.f32139i);
            default:
                return new C14285((IntBinaryOperator) this.f32139i);
        }
    }
}
