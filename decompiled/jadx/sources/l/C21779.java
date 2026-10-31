package l;

import java.util.Collections;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.᩸᩵֨, reason: contains not printable characters */
/* JADX INFO: compiled from: R450 */
/* JADX INFO: loaded from: classes.dex */
public final class C21779 extends AbstractC7667 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C2609 f69768;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final AbstractC19810 f69769;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final AbstractC7667 f69770;

    public C21779(AbstractC5698 abstractC5698, AbstractC19810 abstractC19810, AbstractC7667 abstractC7667) {
        super(abstractC5698);
        this.f69769 = abstractC19810;
        this.f69768 = C2609.of((Object) abstractC19810);
        this.f69770 = abstractC7667;
    }

    @Override // l.AbstractC7667
    /* JADX INFO: renamed from: ֫ */
    public final Iterable mo20475(Predicate predicate, EnumC1317 enumC1317) {
        return (predicate == null || predicate.test(this.f69769)) ? this.f69768 : Collections.EMPTY_LIST;
    }

    @Override // l.AbstractC7667
    /* JADX INFO: renamed from: ֫ */
    public final Iterable mo20477(AbstractC10370 abstractC10370, Predicate predicate, EnumC1317 enumC1317) {
        AbstractC19810 abstractC19810 = this.f69769;
        return (abstractC19810.f17562 == abstractC10370 && (predicate == null || predicate.test(abstractC19810))) ? this.f69768 : Collections.EMPTY_LIST;
    }

    @Override // l.AbstractC7667
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC7667 mo20479(AbstractC5698 abstractC5698) {
        if (this.f69769 == abstractC5698) {
            return this.f69770;
        }
        return null;
    }
}
