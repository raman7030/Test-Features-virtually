package l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.᩺ۛ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: M43N */
/* JADX INFO: loaded from: classes.dex */
public final enum C22797 extends EnumC10969 {
    public /* synthetic */ C22797(EnumC19125 enumC19125) {
        this("THROWS", 2, enumC19125);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m50886(C0384 c0384, AbstractC4308 abstractC4308) {
        return !abstractC4308.m12928(c0384.f1817);
    }

    public C22797(String str, int i, EnumC19125 enumC19125) {
        super(str, i, enumC19125, 0);
    }

    @Override // l.EnumC10969
    /* JADX INFO: renamed from: ֫ */
    public boolean mo5982(C0779 c0779, final C0384 c0384) {
        if (!c0779.m2968()) {
            return false;
        }
        final C6319 c6319 = c0384.f1816;
        final C20661 c20661 = c0384.f1815.f20922;
        return C5378.stream(c0779.m2963(EnumC19125.f60272)).filter(new Predicate() { // from class: l.ۛۛ֨
            @Override // java.util.function.Predicate
            public /* synthetic */ Predicate and(Predicate predicate) {
                return C19285.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* JADX INFO: renamed from: negate */
            public /* synthetic */ Predicate mo4928negate() {
                return C19285.$default$negate(this);
            }

            public /* synthetic */ Predicate or(Predicate predicate) {
                return C19285.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return C22797.m50886(c0384, (AbstractC4308) obj);
            }
        }).allMatch(new Predicate() { // from class: l.ۨۛ֨
            @Override // java.util.function.Predicate
            public /* synthetic */ Predicate and(Predicate predicate) {
                return C19285.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* JADX INFO: renamed from: negate */
            public /* synthetic */ Predicate mo4928negate() {
                return C19285.$default$negate(this);
            }

            public /* synthetic */ Predicate or(Predicate predicate) {
                return C19285.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return C22797.m50887(c6319, c20661, (AbstractC4308) obj);
            }
        });
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m50887(C6319 c6319, C20661 c20661, AbstractC4308 abstractC4308) {
        return c6319.m17546(c20661.f66453, abstractC4308, true);
    }

    @Override // l.EnumC10969
    /* JADX INFO: renamed from: ܽ */
    public AbstractC4308 mo5983(C0779 c0779, C0384 c0384) {
        return c0384.f1815.f20922.f66453;
    }
}
