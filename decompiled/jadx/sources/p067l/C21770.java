package p067l;

import bin.p000mt.plus.R;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: renamed from: l.᩶᩷ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: H5GB */
/* JADX INFO: loaded from: classes5.dex */
public final class C21770 extends C18416 implements InterfaceC6623 {

    /* JADX INFO: renamed from: ۧ */
    public final ConcurrentMapC12768 f68550;

    /* JADX INFO: renamed from: ܽ */
    public AbstractC16192 f68551;

    /* JADX INFO: renamed from: ᩳ */
    public static final InterfaceC20276 f68549 = new C7688();

    /* JADX INFO: renamed from: ܿ */
    public static final InterfaceC18263 f68548 = new C3664();

    /* JADX INFO: renamed from: ֡ */
    public final List m49102(Object obj) {
        List list = ((C3349) obj).f6544;
        if (C10810.m24923(list, f68549)) {
            return new C17074(list);
        }
        return null;
    }

    /* JADX INFO: renamed from: ֨ */
    public final int m49103(Object obj) {
        InterfaceC20568 interfaceC20568 = ((C3349) obj).f6546;
        if (interfaceC20568 == null) {
            return 0;
        }
        return interfaceC20568.mo6075();
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m49104(Comparable comparable) {
        return ((C2993) comparable).f5308;
    }

    /* JADX INFO: renamed from: ֫ */
    public final Map.Entry m49105(CharSequence charSequence) {
        C24787 c24787 = (C24787) charSequence;
        if (c24787 == null) {
            return null;
        }
        C2993 c2993 = (C2993) this.f68550.get(c24787.f79220.f25636);
        if (c2993 == null) {
            return null;
        }
        return new C10370(c2993);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m49106(int i, Comparable comparable) {
        ((C2993) comparable).f5309 = i;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m49107(int i, Object obj) {
        ((C3349) obj).f6549 = i;
    }

    /* JADX INFO: renamed from: ۖ */
    public final Iterable m49109(Object obj) {
        InterfaceC20568 interfaceC20568 = ((C3349) obj).f6546;
        if (interfaceC20568 == null) {
            return null;
        }
        return interfaceC20568.mo6074();
    }

    /* JADX INFO: renamed from: ۖ */
    public final C24787 m49110(Comparable comparable) {
        return ((C2993) comparable).f5310;
    }

    /* JADX INFO: renamed from: ۘ */
    public final int m49111(Object obj) {
        return ((C3349) obj).f6548;
    }

    /* JADX INFO: renamed from: ۘ */
    public final C24787 m49112(Comparable comparable) {
        return ((C2993) comparable).f5306;
    }

    /* JADX INFO: renamed from: ۚ */
    public final Iterable m49113(Object obj) {
        return C10810.m24920(((C3349) obj).f6544, new C23111());
    }

    /* JADX INFO: renamed from: ۜ */
    public final int m49114(Object obj) {
        return ((C3349) obj).f6543;
    }

    /* JADX INFO: renamed from: ۜ */
    public final Collection m49115(Comparable comparable) {
        C2993 c2993 = (C2993) comparable;
        c2993.getClass();
        return new C21100(c2993);
    }

    /* JADX INFO: renamed from: ۠ */
    public final List m49116(Object obj) {
        InterfaceC20568 interfaceC20568 = ((C3349) obj).f6546;
        if (interfaceC20568 == null) {
            return AbstractC16192.m36872of();
        }
        return interfaceC20568.mo6068();
    }

    /* JADX INFO: renamed from: ۡ */
    public final C9029 m49117(Object obj) {
        C17430 c17430 = (C17430) obj;
        if (c17430.f52101.isEmpty()) {
            return null;
        }
        return c17430.f52101;
    }

    /* JADX INFO: renamed from: ۡ */
    public final C9384 m49118(Comparable comparable) {
        return ((C2993) comparable).f5302;
    }

    /* JADX INFO: renamed from: ۢ */
    public final int m49119(Object obj) {
        return ((C17430) obj).f52100;
    }

    /* JADX INFO: renamed from: ۢ */
    public final AbstractC24891 m49120(Comparable comparable) {
        return ((C2993) comparable).f5301;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m49121(Comparable comparable) {
        return ((C2993) comparable).f5309;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m49122(int i, Object obj) {
        ((C3349) obj).f6543 = i;
    }

    /* JADX INFO: renamed from: ܳ */
    public final Collection m49123(Comparable comparable) {
        C2993 c2993 = (C2993) comparable;
        c2993.getClass();
        return new C20429(c2993);
    }

    /* JADX INFO: renamed from: ܶ */
    public final C3422 m49124(Object obj) {
        InterfaceC20568 interfaceC20568 = ((C3349) obj).f6546;
        if (interfaceC20568 instanceof C3422) {
            return (C3422) interfaceC20568;
        }
        return new C3422(interfaceC20568);
    }

    /* JADX INFO: renamed from: ܺ */
    public final Set m49125(Object obj) {
        return ((C17430) obj).f52098;
    }

    /* JADX INFO: renamed from: ܺ */
    public final C14393 m49126(Comparable comparable) {
        return ((C2993) comparable).f5303;
    }

    /* JADX INFO: renamed from: ܽ */
    public final C9029 m49127(Comparable comparable) {
        C2993 c2993 = (C2993) comparable;
        if (c2993.f5307.isEmpty()) {
            return null;
        }
        return c2993.f5307;
    }

    /* JADX INFO: renamed from: ܿ */
    public final AbstractC24891 m49129(Comparable comparable) {
        return ((C2993) comparable).f5298;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final C4000 m49130(Comparable comparable) {
        return ((C2993) comparable).f5304;
    }

    /* JADX INFO: renamed from: ᩴ */
    public final C9029 m49132(Object obj) {
        C3349 c3349 = (C3349) obj;
        if (c3349.f6547.isEmpty()) {
            return null;
        }
        return c3349.f6547;
    }

    /* JADX INFO: renamed from: ᩵ */
    public final Set m49133(Object obj) {
        return ((C3349) obj).f6542;
    }

    /* JADX INFO: renamed from: ᩷ */
    public final Iterable m49134(Object obj) {
        InterfaceC20568 interfaceC20568 = ((C3349) obj).f6546;
        if (interfaceC20568 == null) {
            return null;
        }
        return interfaceC20568.mo6069();
    }

    /* JADX INFO: renamed from: ᩷ */
    public final SortedSet m49135(Comparable comparable) {
        return ((C2993) comparable).f5300;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final int m49136(Object obj) {
        return ((C3349) obj).f6549;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final SortedSet m49137(Comparable comparable) {
        return ((C2993) comparable).f5305;
    }

    public C21770(C20765 c20765) {
        super(c20765);
        this.f68550 = new ConcurrentMapC12768();
        this.f68551 = null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m49108(C2993 c2993) {
        if (((C2993) this.f68550.put(c2993.getType(), c2993)) != null) {
            throw new C17034(null, C7050.m16203(R.string.MT_Protector, c2993.getType()), new Object[0]);
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public final AbstractC16192 m49131() {
        if (this.f68551 == null) {
            AbstractC12093 abstractC12093M27883 = AbstractC12093.m27883();
            Collection collectionValues = this.f68550.values();
            abstractC12093M27883.getClass();
            this.f68551 = AbstractC16192.m36880(abstractC12093M27883, collectionValues);
        }
        return this.f68551;
    }

    @Override // p067l.InterfaceC6623
    /* JADX INFO: renamed from: ֫ */
    public final Collection mo10634() {
        return new C23781(this.f68550.values());
    }

    @Override // p067l.InterfaceC6623
    public final int getItemCount() {
        return this.f68550.size();
    }

    /* JADX INFO: renamed from: ܽ */
    public final ConcurrentMapC12768 m49128() {
        return this.f68550;
    }
}
