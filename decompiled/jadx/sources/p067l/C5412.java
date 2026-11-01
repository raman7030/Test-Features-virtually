package p067l;

import java.util.function.DoublePredicate;
import java.util.function.IntPredicate;
import java.util.function.LongPredicate;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ۗۧ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5412 implements Supplier {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f12888a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ EnumC21702 f12889b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f12890c;

    public /* synthetic */ C5412(EnumC21702 enumC21702, Object obj, int i) {
        this.f12888a = i;
        this.f12889b = enumC21702;
        this.f12890c = obj;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.f12888a) {
            case 0:
                return new C6909(this.f12889b, (LongPredicate) this.f12890c);
            case 1:
                return new C6239(this.f12889b, (IntPredicate) this.f12890c);
            case 2:
                return new C12985(this.f12889b, (DoublePredicate) this.f12890c);
            default:
                return new C18308(this.f12889b, (Predicate) this.f12890c);
        }
    }
}
