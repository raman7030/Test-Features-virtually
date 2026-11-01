package p067l;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;

/* JADX INFO: renamed from: l.᩸ۨܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: O5F3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C22861 extends AbstractC8583 {

    /* JADX INFO: renamed from: ۙ */
    public final C15444 f71983;

    /* JADX INFO: renamed from: ᩶ */
    public final NavigableMap f71984;

    /* JADX INFO: renamed from: ᩸ */
    public final C15444 f71985;

    /* JADX INFO: renamed from: ᩹ */
    public final NavigableMap f71986;

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return C14774.f42115;
    }

    public /* synthetic */ C22861(C15444 c15444, C15444 c15445, NavigableMap navigableMap, int i) {
        this(c15444, c15445, navigableMap);
    }

    @Override // java.util.NavigableMap
    public final NavigableMap headMap(Object obj, boolean z) {
        return m51066(C15444.m35181((AbstractC5861) obj, EnumC5901.m13256(z)));
    }

    @Override // java.util.NavigableMap
    public final NavigableMap subMap(Object obj, boolean z, Object obj2, boolean z2) {
        return m51066(C15444.m35177((AbstractC5861) obj, EnumC5901.m13256(z), (AbstractC5861) obj2, EnumC5901.m13256(z2)));
    }

    @Override // java.util.NavigableMap
    public final NavigableMap tailMap(Object obj, boolean z) {
        return m51066(C15444.m35176((AbstractC5861) obj, EnumC5901.m13256(z)));
    }

    /* JADX INFO: renamed from: ֫ */
    private NavigableMap m51066(C15444 c15444) {
        C15444 c15445 = this.f71985;
        if (!c15444.m35193(c15445)) {
            return C19527.m44362of();
        }
        return new C22861(c15445.m35191(c15444), this.f71983, this.f71986);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final C15444 get(Object obj) {
        C15444 c15444 = this.f71983;
        if (obj instanceof AbstractC5861) {
            try {
                AbstractC5861 abstractC5861 = (AbstractC5861) obj;
                if (this.f71985.m35188(abstractC5861) && abstractC5861.compareTo(c15444.f44130) >= 0 && abstractC5861.compareTo(c15444.f44131) < 0) {
                    boolean zEquals = abstractC5861.equals(c15444.f44130);
                    NavigableMap navigableMap = this.f71986;
                    if (zEquals) {
                        Map.Entry entryFloorEntry = navigableMap.floorEntry(abstractC5861);
                        C15444 c15445 = (C15444) (entryFloorEntry == null ? null : entryFloorEntry.getValue());
                        if (c15445 != null && c15445.f44131.compareTo(c15444.f44130) > 0) {
                            return c15445.m35191(c15444);
                        }
                    } else {
                        C15444 c15446 = (C15444) navigableMap.get(abstractC5861);
                        if (c15446 != null) {
                            return c15446.m35191(c15444);
                        }
                    }
                }
            } catch (ClassCastException unused) {
            }
        }
        return null;
    }

    @Override // p067l.AbstractC11423
    /* JADX INFO: renamed from: ֫ */
    public final Iterator mo17188() {
        Iterator it;
        C15444 c15444 = this.f71983;
        boolean zM35187 = c15444.m35187();
        AbstractC5861 abstractC5861 = c15444.f44130;
        if (zM35187) {
            return C2762.f4657;
        }
        C15444 c15445 = this.f71985;
        AbstractC5861 abstractC5862 = c15445.f44131;
        AbstractC5861 abstractC5863 = c15445.f44130;
        if (abstractC5862.mo9571((Comparable) abstractC5861)) {
            return C2762.f4657;
        }
        if (abstractC5863.mo9571((Comparable) abstractC5861)) {
            it = ((C7438) this.f71984).tailMap(abstractC5861, false).values().iterator();
        } else {
            it = this.f71986.tailMap((AbstractC5861) abstractC5863.mo13148(), abstractC5863.mo9572() == EnumC5901.CLOSED).values().iterator();
        }
        return new C10120(this, it, (AbstractC5861) C14774.f42115.mo24450(c15445.f44131, AbstractC5861.m13146(c15444.f44131)));
    }

    @Override // p067l.AbstractC8583
    /* JADX INFO: renamed from: ۧ */
    public final Iterator mo17189() {
        C15444 c15444 = this.f71983;
        if (c15444.m35187()) {
            return C2762.f4657;
        }
        AbstractC5861 abstractC5861 = (AbstractC5861) C14774.f42115.mo24450(this.f71985.f44131, AbstractC5861.m13146(c15444.f44131));
        return new C16824(this, this.f71986.headMap((AbstractC5861) abstractC5861.mo13148(), abstractC5861.mo9574() == EnumC5901.CLOSED).descendingMap().values().iterator());
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return C6786.m15491(mo17188());
    }

    public C22861(C15444 c15444, C15444 c15445, NavigableMap navigableMap) {
        c15444.getClass();
        this.f71985 = c15444;
        c15445.getClass();
        this.f71983 = c15445;
        navigableMap.getClass();
        this.f71986 = navigableMap;
        this.f71984 = new C7438(navigableMap);
    }
}
