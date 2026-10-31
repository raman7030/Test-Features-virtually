package l;

import bin.mt.plus.R;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: renamed from: l.᩶᩷ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: H5GB */
/* JADX INFO: loaded from: classes5.dex */
public final class C20414 extends C16885 implements InterfaceC4477 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC10942 f65874;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public AbstractC14545 f65875;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC18842 f65873 = new C5597();

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC16724 f65872 = new C1363();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final List m46779(Object obj) {
        List list = ((C1032) obj).f3772;
        if (C8882.m22952(list, f65873)) {
            return new C15473(list);
        }
        return null;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int m46780(Object obj) {
        InterfaceC19150 interfaceC19150 = ((C1032) obj).f3774;
        if (interfaceC19150 == null) {
            return 0;
        }
        return interfaceC19150.mo3818();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m46781(Comparable comparable) {
        return ((C0657) comparable).f2535;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Map.Entry m46782(CharSequence charSequence) {
        C23589 c23589 = (C23589) charSequence;
        if (c23589 == null) {
            return null;
        }
        C0657 c0657 = (C0657) this.f65874.get(c23589.f76475.f22724);
        if (c0657 == null) {
            return null;
        }
        return new C8419(c0657);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m46783(int i, Comparable comparable) {
        ((C0657) comparable).f2536 = i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m46784(int i, Object obj) {
        ((C1032) obj).f3777 = i;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final Iterable m46786(Object obj) {
        InterfaceC19150 interfaceC19150 = ((C1032) obj).f3774;
        if (interfaceC19150 == null) {
            return null;
        }
        return interfaceC19150.mo3817();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C23589 m46787(Comparable comparable) {
        return ((C0657) comparable).f2537;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final int m46788(Object obj) {
        return ((C1032) obj).f3776;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C23589 m46789(Comparable comparable) {
        return ((C0657) comparable).f2533;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final Iterable m46790(Object obj) {
        return C8882.m22949(((C1032) obj).f3772, new C21825());
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int m46791(Object obj) {
        return ((C1032) obj).f3771;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final Collection m46792(Comparable comparable) {
        C0657 c0657 = (C0657) comparable;
        c0657.getClass();
        return new C19709(c0657);
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final List m46793(Object obj) {
        InterfaceC19150 interfaceC19150 = ((C1032) obj).f3774;
        if (interfaceC19150 == null) {
            return AbstractC14545.of();
        }
        return interfaceC19150.mo3811();
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C7008 m46794(Object obj) {
        C15848 c15848 = (C15848) obj;
        if (c15848.f48963.isEmpty()) {
            return null;
        }
        return c15848.f48963;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C7382 m46795(Comparable comparable) {
        return ((C0657) comparable).f2529;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final int m46796(Object obj) {
        return ((C15848) obj).f48962;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final AbstractC23698 m46797(Comparable comparable) {
        return ((C0657) comparable).f2528;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m46798(Comparable comparable) {
        return ((C0657) comparable).f2536;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m46799(int i, Object obj) {
        ((C1032) obj).f3771 = i;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final Collection m46800(Comparable comparable) {
        C0657 c0657 = (C0657) comparable;
        c0657.getClass();
        return new C19003(c0657);
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C1109 m46801(Object obj) {
        InterfaceC19150 interfaceC19150 = ((C1032) obj).f3774;
        if (interfaceC19150 instanceof C1109) {
            return (C1109) interfaceC19150;
        }
        return new C1109(interfaceC19150);
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final Set m46802(Object obj) {
        return ((C15848) obj).f48960;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C12652 m46803(Comparable comparable) {
        return ((C0657) comparable).f2530;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C7008 m46804(Comparable comparable) {
        C0657 c0657 = (C0657) comparable;
        if (c0657.f2534.isEmpty()) {
            return null;
        }
        return c0657.f2534;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final AbstractC23698 m46806(Comparable comparable) {
        return ((C0657) comparable).f2525;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C1717 m46807(Comparable comparable) {
        return ((C0657) comparable).f2531;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C7008 m46809(Object obj) {
        C1032 c1032 = (C1032) obj;
        if (c1032.f3775.isEmpty()) {
            return null;
        }
        return c1032.f3775;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final Set m46810(Object obj) {
        return ((C1032) obj).f3770;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Iterable m46811(Object obj) {
        InterfaceC19150 interfaceC19150 = ((C1032) obj).f3774;
        if (interfaceC19150 == null) {
            return null;
        }
        return interfaceC19150.mo3812();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final SortedSet m46812(Comparable comparable) {
        return ((C0657) comparable).f2527;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int m46813(Object obj) {
        return ((C1032) obj).f3777;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final SortedSet m46814(Comparable comparable) {
        return ((C0657) comparable).f2532;
    }

    public C20414(C19357 c19357) {
        super(c19357);
        this.f65874 = new ConcurrentMapC10942();
        this.f65875 = null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m46785(C0657 c0657) {
        if (((C0657) this.f65874.put(c0657.getType(), c0657)) != null) {
            throw new C15431(null, C4925.m14306(R.string.MT_Protector, c0657.getType()), new Object[0]);
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final AbstractC14545 m46808() {
        if (this.f65875 == null) {
            AbstractC10232 abstractC10232M25861 = AbstractC10232.m25861();
            Collection collectionValues = this.f65874.values();
            abstractC10232M25861.getClass();
            this.f65875 = AbstractC14545.m34731(abstractC10232M25861, collectionValues);
        }
        return this.f65875;
    }

    @Override // l.InterfaceC4477
    /* JADX INFO: renamed from: ֫ */
    public final Collection mo8571() {
        return new C22530(this.f65874.values());
    }

    @Override // l.InterfaceC4477
    public final int getItemCount() {
        return this.f65874.size();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC10942 m46805() {
        return this.f65874;
    }
}
