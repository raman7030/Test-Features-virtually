package p067l;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;

/* JADX INFO: renamed from: l.ۚۨܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: O5F3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7438 extends AbstractC8583 {

    /* JADX INFO: renamed from: ᩸ */
    public final NavigableMap f19475;

    /* JADX INFO: renamed from: ᩹ */
    public final C15444 f19476;

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return C14774.f42115;
    }

    @Override // java.util.NavigableMap
    public final NavigableMap headMap(Object obj, boolean z) {
        return m17186(C15444.m35181((AbstractC5861) obj, EnumC5901.m13256(z)));
    }

    @Override // java.util.NavigableMap
    public final NavigableMap subMap(Object obj, boolean z, Object obj2, boolean z2) {
        return m17186(C15444.m35177((AbstractC5861) obj, EnumC5901.m13256(z), (AbstractC5861) obj2, EnumC5901.m13256(z2)));
    }

    @Override // java.util.NavigableMap
    public final NavigableMap tailMap(Object obj, boolean z) {
        return m17186(C15444.m35176((AbstractC5861) obj, EnumC5901.m13256(z)));
    }

    /* JADX INFO: renamed from: ֫ */
    private NavigableMap m17186(C15444 c15444) {
        C15444 c15445 = this.f19476;
        if (c15444.m35193(c15445)) {
            return new C7438(this.f19475, c15444.m35191(c15445));
        }
        return C19527.m44362of();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // p067l.AbstractC11423
    /* JADX INFO: renamed from: ֫ */
    public final Iterator mo17188() {
        Iterator it;
        Map.Entry entryLowerEntry;
        C15444 c15444 = this.f19476;
        AbstractC5861 abstractC5861 = c15444.f44130;
        AbstractC5861 abstractC5862 = c15444.f44130;
        C17259 c17259 = C17259.f51368;
        NavigableMap navigableMap = this.f19475;
        if (abstractC5861 == c17259 || (entryLowerEntry = navigableMap.lowerEntry((AbstractC5861) abstractC5862.mo13148())) == null) {
            it = navigableMap.values().iterator();
        } else if (abstractC5862.mo9571((Comparable) ((C15444) entryLowerEntry.getValue()).f44131)) {
            it = navigableMap.tailMap((AbstractC5861) entryLowerEntry.getKey(), true).values().iterator();
        } else {
            it = navigableMap.tailMap((AbstractC5861) abstractC5862.mo13148(), true).values().iterator();
        }
        return new C20850(this, it);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final C15444 get(Object obj) {
        Map.Entry entryLowerEntry;
        if (obj instanceof AbstractC5861) {
            try {
                AbstractC5861 abstractC5861 = (AbstractC5861) obj;
                if (this.f19476.m35188(abstractC5861) && (entryLowerEntry = this.f19475.lowerEntry(abstractC5861)) != null && ((C15444) entryLowerEntry.getValue()).f44131.equals(abstractC5861)) {
                    return (C15444) entryLowerEntry.getValue();
                }
            } catch (ClassCastException unused) {
            }
        }
        return null;
    }

    @Override // p067l.AbstractC8583
    /* JADX INFO: renamed from: ۧ */
    public final Iterator mo17189() {
        Collection collectionValues;
        C15444 c15444 = this.f19476;
        AbstractC5861 abstractC5861 = c15444.f44131;
        AbstractC5861 abstractC5862 = c15444.f44131;
        C11226 c11226 = C11226.f31218;
        NavigableMap navigableMap = this.f19475;
        if (abstractC5861 != c11226) {
            collectionValues = navigableMap.headMap((AbstractC5861) abstractC5862.mo13148(), false).descendingMap().values();
        } else {
            collectionValues = navigableMap.descendingMap().values();
        }
        InterfaceC8069 interfaceC8069M15487 = C6786.m15487(collectionValues.iterator());
        C23550 c23550 = (C23550) interfaceC8069M15487;
        if (c23550.hasNext() && abstractC5862.mo9571((Comparable) ((C15444) c23550.peek()).f44131)) {
            c23550.next();
        }
        return new C2743(this, interfaceC8069M15487);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        if (this.f19476.equals(C15444.m35185())) {
            return this.f19475.size();
        }
        return C6786.m15491(mo17188());
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        if (this.f19476.equals(C15444.m35185())) {
            return this.f19475.isEmpty();
        }
        return !((AbstractC3651) mo17188()).hasNext();
    }

    public C7438(NavigableMap navigableMap) {
        this.f19475 = navigableMap;
        this.f19476 = C15444.m35185();
    }

    public C7438(NavigableMap navigableMap, C15444 c15444) {
        this.f19475 = navigableMap;
        this.f19476 = c15444;
    }
}
