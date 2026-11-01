package p067l;

import java.util.function.DoublePredicate;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.֫ᩳᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0C0V */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C4266 {
    @Deprecated
    /* JADX INFO: renamed from: ֫ */
    public static boolean m8670(InterfaceC12984 interfaceC12984, final Predicate predicate) {
        return interfaceC12984.mo14152(predicate instanceof InterfaceC24382 ? (InterfaceC24382) predicate : new InterfaceC24382() { // from class: l.۟ܽᩴ
            @Override // java.util.function.DoublePredicate
            public final /* synthetic */ boolean test(double d) {
                return C13654.m31051(this, d);
            }

            public final /* synthetic */ DoublePredicate and(DoublePredicate doublePredicate) {
                return C13654.m31050(this, doublePredicate);
            }

            /* JADX INFO: renamed from: or */
            public final /* synthetic */ DoublePredicate m22327or(DoublePredicate doublePredicate) {
                return C13654.m31053(this, doublePredicate);
            }

            @Override // java.util.function.Predicate
            public final /* synthetic */ boolean test(Object obj) {
                return C13654.m31052(this, (Float) obj);
            }

            @Override // p067l.InterfaceC24382
            /* JADX INFO: renamed from: ۧ */
            public final C12313 mo19087(InterfaceC24382 interfaceC24382) {
                return new C12313(this, interfaceC24382);
            }

            @Override // java.util.function.Predicate
            public final Predicate and(Predicate predicate2) {
                return C20697.$default$and(this, predicate2);
            }

            public final DoublePredicate negate() {
                return new C14994(this);
            }

            @Override // java.util.function.Predicate
            /* JADX INFO: renamed from: negate */
            public final Predicate mo55838negate() {
                return new C14994(this);
            }

            @Override // p067l.InterfaceC24382
            /* JADX INFO: renamed from: ֫ */
            public final C8289 mo19086(InterfaceC24382 interfaceC24382) {
                return new C8289(this, interfaceC24382);
            }

            /* JADX INFO: renamed from: or */
            public final Predicate m22328or(Predicate predicate2) {
                return C20697.$default$or(this, predicate2);
            }

            @Override // p067l.InterfaceC24382
            /* JADX INFO: renamed from: ܽ */
            public final boolean mo19088(float f) {
                return predicate.test(Float.valueOf(C5065.m10797(f)));
            }
        });
    }
}
