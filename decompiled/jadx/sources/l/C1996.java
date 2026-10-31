package l;

import java.util.function.DoublePredicate;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.֫ᩳᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0C0V */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1996 {
    @Deprecated
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m6528(InterfaceC11169 interfaceC11169, final Predicate predicate) {
        return interfaceC11169.mo12231(predicate instanceof InterfaceC23162 ? (InterfaceC23162) predicate : new InterfaceC23162() { // from class: l.۟ܽᩴ
            @Override // java.util.function.DoublePredicate
            public final /* synthetic */ boolean test(double d) {
                return C11874.m29000(this, d);
            }

            public final /* synthetic */ DoublePredicate and(DoublePredicate doublePredicate) {
                return C11874.m28999(this, doublePredicate);
            }

            public final /* synthetic */ DoublePredicate or(DoublePredicate doublePredicate) {
                return C11874.m29002(this, doublePredicate);
            }

            @Override // java.util.function.Predicate
            public final /* synthetic */ boolean test(Object obj) {
                return C11874.m29001(this, (Float) obj);
            }

            @Override // l.InterfaceC23162
            /* JADX INFO: renamed from: ۧ */
            public final C10463 mo17153(InterfaceC23162 interfaceC23162) {
                return new C10463(this, interfaceC23162);
            }

            @Override // java.util.function.Predicate
            public final Predicate and(Predicate predicate2) {
                return C19285.$default$and(this, predicate2);
            }

            public final DoublePredicate negate() {
                return new C13284(this);
            }

            @Override // java.util.function.Predicate
            /* JADX INFO: renamed from: negate */
            public final Predicate mo4928negate() {
                return new C13284(this);
            }

            @Override // l.InterfaceC23162
            /* JADX INFO: renamed from: ֫ */
            public final C6229 mo17152(InterfaceC23162 interfaceC23162) {
                return new C6229(this, interfaceC23162);
            }

            public final Predicate or(Predicate predicate2) {
                return C19285.$default$or(this, predicate2);
            }

            @Override // l.InterfaceC23162
            /* JADX INFO: renamed from: ܽ */
            public final boolean mo17154(float f) {
                return predicate.test(Float.valueOf(C2837.m8730(f)));
            }
        });
    }
}
