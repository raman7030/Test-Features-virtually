package l;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.ObjDoubleConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.᩺ܰᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public final class C23036 extends AbstractC9198 {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    public /* synthetic */ C23036(EnumC8578 enumC8578, Object obj, Object obj2, Object obj3, int i) {
        this.h = i;
        this.j = obj;
        this.k = obj2;
        this.i = obj3;
    }

    @Override // l.AbstractC9198
    public final InterfaceC18204 e0() {
        switch (this.h) {
            case 0:
                return new C14135((Supplier) this.i, (ObjLongConsumer) this.k, (C22416) this.j);
            case 1:
                return new C11564((Supplier) this.i, (ObjDoubleConsumer) this.k, (C22416) this.j);
            case 2:
                return new C0816(this.i, (BiFunction) this.k, (BinaryOperator) this.j);
            case 3:
                return new C10258((Supplier) this.i, (BiConsumer) this.k, (BiConsumer) this.j);
            default:
                return new C17519((Supplier) this.i, (ObjIntConsumer) this.k, (C22416) this.j);
        }
    }
}
