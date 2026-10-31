package l;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.۬᩵֨, reason: contains not printable characters */
/* JADX INFO: compiled from: R450 */
/* JADX INFO: loaded from: classes3.dex */
public final class C13311 implements Iterator {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Predicate f39845;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ EnumC1317 f39846;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f39847;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C14722 f39848;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C10490 f39849;

    public C13311(C10490 c10490, EnumC1317 enumC1317, Predicate predicate) {
        this.f39846 = enumC1317;
        this.f39845 = predicate;
        this.f39849 = c10490;
        this.f39848 = c10490.f31469;
        this.f39847 = c10490.f31473;
        m32292();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        C14722 c14722;
        if (this.f39847 != this.f39849.f31473 && (c14722 = this.f39848) != null && !c14722.f44962.mo20482(c14722.f44963)) {
            C14722 c14723 = this.f39848;
            if (c14723 != null) {
                this.f39848 = c14723.f44960;
            }
            m32292();
            this.f39847 = this.f39849.f31473;
        }
        return this.f39848 != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        C14722 c14722 = this.f39848;
        AbstractC5698 abstractC5698 = c14722 == null ? null : c14722.f44963;
        if (c14722 != null) {
            this.f39848 = c14722.f44960;
        }
        m32292();
        return abstractC5698;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m32292() {
        Predicate predicate;
        C10490 c10490;
        while (true) {
            C14722 c14722 = this.f39848;
            predicate = this.f39845;
            if (c14722 == null || predicate == null || predicate.test(c14722.f44963)) {
                break;
            } else {
                this.f39848 = this.f39848.f44960;
            }
        }
        if (this.f39846 == EnumC1317.RECURSIVE) {
            while (this.f39848 == null && (c10490 = this.f39849.f31468) != null) {
                this.f39849 = c10490;
                this.f39848 = c10490.f31469;
                this.f39847 = c10490.f31473;
                while (true) {
                    C14722 c14723 = this.f39848;
                    if (c14723 == null || predicate == null || predicate.test(c14723.f44963)) {
                        break;
                    } else {
                        this.f39848 = this.f39848.f44960;
                    }
                }
            }
        }
    }
}
