package p067l;

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
public final class C24262 extends AbstractC11111 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f76875h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f76876i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f76877j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f76878k;

    public /* synthetic */ C24262(EnumC10521 enumC10521, Object obj, Object obj2, Object obj3, int i) {
        this.f76875h = i;
        this.f76877j = obj;
        this.f76878k = obj2;
        this.f76876i = obj3;
    }

    @Override // p067l.AbstractC11111
    /* JADX INFO: renamed from: e0 */
    public final InterfaceC19670 mo4649e0() {
        switch (this.f76875h) {
            case 0:
                return new C15803((Supplier) this.f76876i, (ObjLongConsumer) this.f76878k, (C23673) this.f76877j);
            case 1:
                return new C13359((Supplier) this.f76876i, (ObjDoubleConsumer) this.f76878k, (C23673) this.f76877j);
            case 2:
                return new C3144(this.f76876i, (BiFunction) this.f76878k, (BinaryOperator) this.f76877j);
            case 3:
                return new C12118((Supplier) this.f76876i, (BiConsumer) this.f76878k, (BiConsumer) this.f76877j);
            default:
                return new C19019((Supplier) this.f76876i, (ObjIntConsumer) this.f76878k, (C23673) this.f76877j);
        }
    }
}
