package l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ܶ᩶֨, reason: contains not printable characters */
/* JADX INFO: compiled from: F416 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C15448 implements Predicate {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f47305;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f47306;

    public /* synthetic */ C15448(int i, Object obj) {
        this.f47305 = i;
        this.f47306 = obj;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C19285.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo4928negate() {
        switch (this.f47305) {
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
        switch (this.f47305) {
            case 0:
                return ((AbstractC4308) obj).f13890 == ((C14163) this.f47306);
            case 1:
                return !((C22267) this.f47306).mo3775(Integer.valueOf(((InterfaceC15086) obj).getPosition()));
            case 2:
                return ((String) obj).contains(((EnumC21309) this.f47306).m48344());
            default:
                AbstractC5144 abstractC5144 = (AbstractC5144) obj;
                return C7260.m19463(abstractC5144) && abstractC5144 != ((AbstractC5144) this.f47306);
        }
    }
}
