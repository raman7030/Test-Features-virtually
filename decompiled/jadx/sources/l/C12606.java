package l;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.۫᩵֨, reason: contains not printable characters */
/* JADX INFO: compiled from: R450 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12606 implements Iterator {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Predicate f38007;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ EnumC1317 f38008;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10490 f38009;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C14722 f38010;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f38011;

    public C12606(C10490 c10490, AbstractC10370 abstractC10370, Predicate predicate, EnumC1317 enumC1317) {
        this.f38009 = c10490;
        this.f38007 = predicate;
        this.f38008 = enumC1317;
        C14722 c14722M26378 = c10490.m26378(abstractC10370, predicate);
        this.f38010 = c14722M26378;
        C10490 c10491 = c14722M26378.f44962;
        this.f38011 = c10491 != null ? c10491.f31473 : -1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        C14722 c14722 = this.f38010;
        C10490 c10490 = c14722.f44962;
        if (c10490 != null && this.f38011 != c10490.f31473 && !c10490.mo20482(c14722.f44963)) {
            this.f38010 = this.f38010.m35029(this.f38007);
        }
        C10490 c10491 = this.f38010.f44962;
        if (c10491 != null) {
            return this.f38008 == EnumC1317.RECURSIVE || c10491 == this.f38009;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        C14722 c14722 = this.f38010;
        this.f38010 = c14722.m35029(this.f38007);
        return c14722.f44963;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
