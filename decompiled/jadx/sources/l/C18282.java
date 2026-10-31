package l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ᩳ᩶ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: IB3L */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C18282 implements Predicate {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f56828;

    public /* synthetic */ C18282(int i) {
        this.f56828 = i;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C19285.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo4928negate() {
        switch (this.f56828) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return C19285.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        return C19285.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f56828) {
            case 0:
                return ((InterfaceC17889) obj).isDirectory();
            case 1:
                return (C7260.m19473((AbstractC5144) ((InterfaceC13206) obj)) & 16777216) == 0;
            case 2:
                return ((AbstractC4308) obj).f13890.f17559 == EnumC1296.f4581;
            default:
                C0779 c0779 = (C0779) obj;
                EnumC19125 enumC19125 = EnumC19125.f60272;
                C2609 c2609M2963 = c0779.m2963(enumC19125);
                C18837 c18837 = new C18837();
                int i = 0;
                for (AbstractC4308 abstractC4308 : c0779.m2963(enumC19125)) {
                    int i2 = i + 1;
                    if (i == c0779.f2883) {
                        C2609 c2609M8244 = c2609M2963.m8244(c18837.m43517());
                        C2609 c2609M2964 = c0779.m2963(EnumC19125.f60275, EnumC19125.f60273);
                        c2609M8244.getClass();
                        return c2609M2964.m8248(c2609M8244).m8249();
                    }
                    c18837.m43511(abstractC4308);
                    i = i2;
                }
                C2609 c2609M8245 = c2609M2963.m8244(c18837.m43517());
                C2609 c2609M2965 = c0779.m2963(EnumC19125.f60275, EnumC19125.f60273);
                c2609M8245.getClass();
                return c2609M2965.m8248(c2609M8245).m8249();
        }
    }
}
