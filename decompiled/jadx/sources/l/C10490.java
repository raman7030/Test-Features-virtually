package l;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۤ᩵֨, reason: contains not printable characters */
/* JADX INFO: compiled from: R450 */
/* JADX INFO: loaded from: classes4.dex */
public class C10490 extends AbstractC14016 {

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final C14722 f31466 = new C14722(null, null, null, null);

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f31467;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C10490 f31468;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C14722 f31469;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f31470;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f31471;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C14722[] f31472;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f31473;

    public /* synthetic */ C10490(C23895 c23895, AbstractC5698 abstractC5698, C14722[] c14722Arr) {
        this((C10490) c23895, abstractC5698, c14722Arr);
    }

    public C10490(C10490 c10490, AbstractC5698 abstractC5698, C14722[] c14722Arr) {
        super(abstractC5698);
        this.f31470 = 0;
        this.f31473 = 0;
        this.f31468 = c10490;
        C12171.m29642(abstractC5698 != null);
        this.f31472 = c14722Arr;
        this.f31471 = c14722Arr.length - 1;
    }

    public C10490(C10490 c10490, AbstractC5698 abstractC5698, C14722[] c14722Arr, int i) {
        this(c10490, abstractC5698, c14722Arr);
        this.f31470 = i;
    }

    public C10490(AbstractC5698 abstractC5698) {
        this((C10490) null, abstractC5698, new C14722[16]);
    }

    @Override // l.AbstractC14016
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public AbstractC14016 mo26380(AbstractC5698 abstractC5698) {
        C10490 c10490 = new C10490(this, abstractC5698, this.f31472, this.f31470);
        this.f31467++;
        return c10490;
    }

    @Override // l.AbstractC14016
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public AbstractC14016 mo26383(AbstractC5698 abstractC5698) {
        if (this.f31467 > 0) {
            Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
            for (C10490 c10490 = this; c10490 != null; c10490 = c10490.f31468) {
                setNewSetFromMap.add(c10490);
            }
            C14722[] c14722Arr = this.f31472;
            C14722[] c14722Arr2 = new C14722[c14722Arr.length];
            int i = 0;
            for (int i2 = 0; i2 < c14722Arr.length; i2++) {
                C14722 c14722 = c14722Arr[i2];
                while (c14722 != null && c14722 != f31466 && !setNewSetFromMap.contains(c14722.f44962)) {
                    c14722 = c14722.f44964;
                }
                if (c14722 != null) {
                    i++;
                    c14722Arr2[i2] = c14722;
                }
            }
            return new C10490(this, abstractC5698, c14722Arr2, i);
        }
        return new C10490(this, abstractC5698, (C14722[]) this.f31472.clone(), this.f31470);
    }

    @Override // l.AbstractC14016
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public AbstractC14016 mo26377() {
        C12171.m29642(this.f31467 == 0);
        C14722[] c14722Arr = this.f31472;
        C10490 c10490 = this.f31468;
        if (c14722Arr != c10490.f31472) {
            return c10490;
        }
        while (true) {
            C14722 c14722 = this.f31469;
            if (c14722 == null) {
                break;
            }
            int iM26376 = m26376(c14722.f44963.f17562);
            C14722 c14723 = this.f31472[iM26376];
            C14722 c14724 = this.f31469;
            C12171.m29639(c14724.f44963, c14723 == c14724);
            this.f31472[iM26376] = this.f31469.f44964;
            this.f31469 = this.f31469.f44960;
        }
        C12171.m29642(c10490.f31467 > 0);
        c10490.f31467--;
        c10490.f31470 = this.f31470;
        return c10490;
    }

    @Override // l.AbstractC14016
    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public void mo26382(AbstractC5698 abstractC5698) {
        int i = 0;
        C12171.m29642(this.f31467 == 0);
        int i2 = this.f31470 * 3;
        int i3 = this.f31471 * 2;
        C14722 c14722 = f31466;
        if (i2 >= i3) {
            C12171.m29642(this.f31467 == 0);
            C14722[] c14722Arr = this.f31472;
            int length = c14722Arr.length * 2;
            C14722[] c14722Arr2 = new C14722[length];
            C10490 c10490 = this;
            while (c10490 != null) {
                if (c10490.f31472 == c14722Arr) {
                    C12171.m29642(c10490 == this || c10490.f31467 != 0);
                    c10490.f31472 = c14722Arr2;
                    c10490.f31471 = length - 1;
                }
                c10490 = c10490.f31468;
            }
            int length2 = c14722Arr.length;
            while (true) {
                length2--;
                if (length2 < 0) {
                    break;
                }
                C14722 c14723 = c14722Arr[length2];
                if (c14723 != null && c14723 != c14722) {
                    this.f31472[m26376(c14723.f44963.f17562)] = c14723;
                    i++;
                }
            }
            this.f31470 = i;
        }
        int iM26376 = m26376(abstractC5698.f17562);
        C14722 c14724 = this.f31472[iM26376];
        if (c14724 == null) {
            this.f31470++;
        } else {
            c14722 = c14724;
        }
        C14722 c14725 = new C14722(abstractC5698, c14722, this.f31469, this);
        this.f31472[iM26376] = c14725;
        this.f31469 = c14725;
        this.f23672.m29027(this, abstractC5698);
    }

    @Override // l.AbstractC14016
    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public void mo26384(final AbstractC5698 abstractC5698) {
        C12171.m29642(this.f31467 == 0);
        C14722 c14722M26378 = m26378(abstractC5698.f17562, new Predicate() { // from class: l.ۗ᩵֨
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
                return ((AbstractC5698) obj) == abstractC5698;
            }
        });
        if (c14722M26378.f44962 == null) {
            return;
        }
        int iM26376 = m26376(abstractC5698.f17562);
        C14722[] c14722Arr = this.f31472;
        C14722 c14722 = c14722Arr[iM26376];
        if (c14722 == c14722M26378) {
            c14722Arr[iM26376] = c14722M26378.f44964;
        } else {
            while (c14722.f44964 != c14722M26378) {
                c14722 = c14722.f44964;
            }
            c14722.f44964 = c14722M26378.f44964;
        }
        if (this.f31469 == c14722M26378) {
            C14722 c14723 = c14722M26378.f44960;
            this.f31469 = c14723;
            if (c14723 != null) {
                c14723.f44961 = null;
            }
        } else {
            C12171.m29639(c14722M26378.f44963, c14722M26378.f44961 != null);
            C14722 c14724 = c14722M26378.f44961;
            c14724.f44960 = c14722M26378.f44960;
            C14722 c14725 = c14722M26378.f44960;
            if (c14725 != null) {
                c14725.f44961 = c14724;
            }
        }
        this.f31473++;
        this.f23672.m29028(this, abstractC5698);
    }

    @Override // l.AbstractC14016
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public void mo26379(AbstractC5698 abstractC5698) {
        C10490 c10490;
        C12171.m29642(this.f31467 == 0);
        C14722 c14722Mo26381 = mo26381(abstractC5698.f17562);
        while (true) {
            c10490 = c14722Mo26381.f44962;
            if (c10490 != this || c14722Mo26381.f44963.f17559 == abstractC5698.f17559) {
                break;
            } else {
                c14722Mo26381 = c14722Mo26381.m35028();
            }
        }
        if (c10490 != this) {
            mo26382(abstractC5698);
        }
    }

    @Override // l.AbstractC7667
    /* JADX INFO: renamed from: ۧ */
    public boolean mo20482(AbstractC5698 abstractC5698) {
        for (C14722 c14722Mo26381 = mo26381(abstractC5698.f17562); c14722Mo26381.f44962 == this; c14722Mo26381 = c14722Mo26381.m35028()) {
            if (c14722Mo26381.f44963 == abstractC5698) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C14722 mo26381(AbstractC10370 abstractC10370) {
        return m26378(abstractC10370, null);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C14722 m26378(AbstractC10370 abstractC10370, Predicate predicate) {
        C14722 c14722 = this.f31472[m26376(abstractC10370)];
        C14722 c14723 = f31466;
        if (c14722 == null || c14722 == c14723) {
            return c14723;
        }
        while (c14722.f44962 != null) {
            AbstractC5698 abstractC5698 = c14722.f44963;
            if (abstractC5698.f17562 == abstractC10370 && (predicate == null || predicate.test(abstractC5698))) {
                break;
            }
            c14722 = c14722.f44964;
        }
        return c14722;
    }

    @Override // l.AbstractC7667
    /* JADX INFO: renamed from: ֫ */
    public AbstractC5698 mo20478(AbstractC10370 abstractC10370, Predicate predicate) {
        return m26378(abstractC10370, predicate).f44963;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m26376(AbstractC10370 abstractC10370) {
        int iHashCode = abstractC10370.hashCode();
        int i = this.f31471;
        int i2 = iHashCode & i;
        int i3 = i - ((iHashCode + (iHashCode >> 16)) << 1);
        int i4 = -1;
        while (true) {
            C14722 c14722 = this.f31472[i2];
            if (c14722 != null) {
                if (c14722 == f31466) {
                    if (i4 < 0) {
                        i4 = i2;
                    }
                } else if (c14722.f44963.f17562 == abstractC10370) {
                    break;
                }
                i2 = (i2 + i3) & this.f31471;
            } else if (i4 >= 0) {
                return i4;
            }
        }
        return i2;
    }

    @Override // l.AbstractC7667
    /* JADX INFO: renamed from: ֫ */
    public boolean mo20481(C18709 c18709) {
        return ((C20368) mo20475(c18709, EnumC1317.NON_RECURSIVE)).iterator().hasNext();
    }

    @Override // l.AbstractC7667
    /* JADX INFO: renamed from: ֫ */
    public Iterable mo20475(Predicate predicate, EnumC1317 enumC1317) {
        return new C20368(this, enumC1317, predicate);
    }

    @Override // l.AbstractC7667
    /* JADX INFO: renamed from: ֫ */
    public Iterable mo20477(AbstractC10370 abstractC10370, Predicate predicate, EnumC1317 enumC1317) {
        return new C4845(this, abstractC10370, predicate, enumC1317);
    }

    @Override // l.AbstractC7667
    /* JADX INFO: renamed from: ֫ */
    public AbstractC7667 mo20479(AbstractC5698 abstractC5698) {
        for (C14722 c14722Mo26381 = mo26381(abstractC5698.f17562); c14722Mo26381.f44962 != null; c14722Mo26381 = c14722Mo26381.m35028()) {
            if (c14722Mo26381.f44963 == abstractC5698) {
                return this;
            }
        }
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Scope[");
        for (C10490 c10490 = this; c10490 != null; c10490 = c10490.f31468) {
            if (c10490 != this) {
                sb.append(" | ");
            }
            for (C14722 c14722 = c10490.f31469; c14722 != null; c14722 = c14722.f44960) {
                if (c14722 != c10490.f31469) {
                    sb.append(", ");
                }
                sb.append(c14722.f44963);
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
