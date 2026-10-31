package l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.᩻᩵֨, reason: contains not printable characters */
/* JADX INFO: compiled from: R450 */
/* JADX INFO: loaded from: classes2.dex */
public final class C23895 extends C10490 {
    @Override // l.C10490
    /* JADX INFO: renamed from: ܽ */
    public final C14722 mo26381(AbstractC10370 abstractC10370) {
        C14722 c14722M26378 = m26378(abstractC10370, null);
        return c14722M26378.f44962 == null ? new C14722(this.f23673, null, null, null) : c14722M26378;
    }

    @Override // l.C10490, l.AbstractC7667
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC5698 mo20478(AbstractC10370 abstractC10370, Predicate predicate) {
        return m26378(abstractC10370, predicate).f44963;
    }

    @Override // l.C10490, l.AbstractC7667
    /* JADX INFO: renamed from: ֫ */
    public final Iterable mo20475(Predicate predicate, EnumC1317 enumC1317) {
        return new C20368(this, enumC1317, predicate);
    }

    @Override // l.C10490, l.AbstractC7667
    /* JADX INFO: renamed from: ֫ */
    public final Iterable mo20477(AbstractC10370 abstractC10370, Predicate predicate, EnumC1317 enumC1317) {
        return new C4845(this, abstractC10370, predicate, enumC1317);
    }

    public C23895(C14163 c14163) {
        super(c14163);
    }

    @Override // l.C10490, l.AbstractC14016
    /* JADX INFO: renamed from: ܽ */
    public final AbstractC14016 mo26380(AbstractC5698 abstractC5698) {
        return new C23895(this, abstractC5698, this.f31472);
    }

    @Override // l.C10490, l.AbstractC14016
    /* JADX INFO: renamed from: ᩳ */
    public final AbstractC14016 mo26383(AbstractC5698 abstractC5698) {
        return new C23895(this, abstractC5698, (C14722[]) this.f31472.clone());
    }
}
