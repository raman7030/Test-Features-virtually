package l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ܳ᩵֨, reason: contains not printable characters */
/* JADX INFO: compiled from: R450 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14722 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C14722 f44960;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C14722 f44961;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C10490 f44962;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public AbstractC5698 f44963;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C14722 f44964;

    public C14722(AbstractC5698 abstractC5698, C14722 c14722, C14722 c14723, C10490 c10490) {
        this.f44963 = abstractC5698;
        this.f44964 = c14722;
        this.f44960 = c14723;
        this.f44962 = c10490;
        if (c14723 != null) {
            c14723.f44961 = this;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C14722 m35028() {
        return this.f44964;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C14722 m35029(Predicate predicate) {
        AbstractC5698 abstractC5698 = this.f44964.f44963;
        if (abstractC5698 == null || predicate == null || predicate.test(abstractC5698)) {
            return this.f44964;
        }
        return this.f44964.m35029(predicate);
    }
}
