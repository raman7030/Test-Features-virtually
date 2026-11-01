package p067l;

import java.util.function.IntPredicate;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۚۢᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51QH */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C7384 {
    @Deprecated
    /* JADX INFO: renamed from: ֫ */
    public static boolean m17107(InterfaceC3360 interfaceC3360, final Predicate predicate) {
        return interfaceC3360.mo5871(predicate instanceof IntPredicate ? (IntPredicate) predicate : new IntPredicate() { // from class: l.֡ۢᩴ
            public /* synthetic */ IntPredicate and(IntPredicate intPredicate) {
                return C10638.$default$and(this, intPredicate);
            }

            public /* synthetic */ IntPredicate negate() {
                return C10638.$default$negate(this);
            }

            /* JADX INFO: renamed from: or */
            public /* synthetic */ IntPredicate m4155or(IntPredicate intPredicate) {
                return C10638.$default$or(this, intPredicate);
            }

            @Override // java.util.function.IntPredicate
            public final boolean test(int i) {
                return predicate.test(Integer.valueOf(i));
            }
        });
    }
}
