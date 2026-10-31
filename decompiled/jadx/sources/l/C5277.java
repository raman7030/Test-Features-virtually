package l;

import java.util.function.IntPredicate;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۚۢᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51QH */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5277 {
    @Deprecated
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m15204(InterfaceC1043 interfaceC1043, final Predicate predicate) {
        return interfaceC1043.mo3584(predicate instanceof IntPredicate ? (IntPredicate) predicate : new IntPredicate() { // from class: l.֡ۢᩴ
            public /* synthetic */ IntPredicate and(IntPredicate intPredicate) {
                return C8701.$default$and(this, intPredicate);
            }

            public /* synthetic */ IntPredicate negate() {
                return C8701.$default$negate(this);
            }

            public /* synthetic */ IntPredicate or(IntPredicate intPredicate) {
                return C8701.$default$or(this, intPredicate);
            }

            @Override // java.util.function.IntPredicate
            public final boolean test(int i) {
                return predicate.test(Integer.valueOf(i));
            }
        });
    }
}
