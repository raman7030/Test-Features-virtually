package l;

import java.util.function.DoublePredicate;
import java.util.function.IntPredicate;
import java.util.function.LongPredicate;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ۗۧ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3202 implements Supplier {
    public final /* synthetic */ int a;
    public final /* synthetic */ EnumC20342 b;
    public final /* synthetic */ Object c;

    public /* synthetic */ C3202(EnumC20342 enumC20342, Object obj, int i) {
        this.a = i;
        this.b = enumC20342;
        this.c = obj;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.a) {
            case 0:
                return new C4777(this.b, (LongPredicate) this.c);
            case 1:
                return new C4072(this.b, (IntPredicate) this.c);
            case 2:
                return new C11170(this.b, (DoublePredicate) this.c);
            default:
                return new C16771(this.b, (Predicate) this.c);
        }
    }
}
