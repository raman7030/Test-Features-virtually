package l;

import java.util.Iterator;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.۟᩵֨, reason: contains not printable characters */
/* JADX INFO: compiled from: R450 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7667 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C11901 f23672;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC5698 f23673;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract Iterable mo20475(Predicate predicate, EnumC1317 enumC1317);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract Iterable mo20477(AbstractC10370 abstractC10370, Predicate predicate, EnumC1317 enumC1317);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract AbstractC7667 mo20479(AbstractC5698 abstractC5698);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract boolean mo20481(C18709 c18709);

    public AbstractC7667(AbstractC5698 abstractC5698) {
        C11901 c11901 = new C11901();
        c11901.f35544 = C2609.m8239();
        this.f23672 = c11901;
        this.f23673 = abstractC5698;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Iterable m20476(AbstractC10370 abstractC10370) {
        return mo20477(abstractC10370, null, EnumC1317.RECURSIVE);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public AbstractC5698 mo20478(AbstractC10370 abstractC10370, Predicate predicate) {
        Iterator it = mo20477(abstractC10370, predicate, EnumC1317.RECURSIVE).iterator();
        if (it.hasNext()) {
            return (AbstractC5698) it.next();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean mo20482(AbstractC5698 abstractC5698) {
        return mo20477(abstractC5698.f17562, new C7646(abstractC5698), EnumC1317.RECURSIVE).iterator().hasNext();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m20480() {
        return !mo20475((Predicate) null, EnumC1317.NON_RECURSIVE).iterator().hasNext();
    }
}
