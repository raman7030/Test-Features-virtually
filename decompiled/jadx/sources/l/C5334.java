package l;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;

/* JADX INFO: renamed from: l.ۚۨܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: O5F3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5334 extends AbstractC6539 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final NavigableMap f16636;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C13758 f16637;

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return C13053.f39070;
    }

    @Override // java.util.NavigableMap
    public final NavigableMap headMap(Object obj, boolean z) {
        return m15279(C13758.m33066((AbstractC3675) obj, EnumC3717.m11309(z)));
    }

    @Override // java.util.NavigableMap
    public final NavigableMap subMap(Object obj, boolean z, Object obj2, boolean z2) {
        return m15279(C13758.m33062((AbstractC3675) obj, EnumC3717.m11309(z), (AbstractC3675) obj2, EnumC3717.m11309(z2)));
    }

    @Override // java.util.NavigableMap
    public final NavigableMap tailMap(Object obj, boolean z) {
        return m15279(C13758.m33061((AbstractC3675) obj, EnumC3717.m11309(z)));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private NavigableMap m15279(C13758 c13758) {
        C13758 c13759 = this.f16637;
        if (c13758.m33078(c13759)) {
            return new C5334(this.f16636, c13758.m33076(c13759));
        }
        return C18054.of();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // l.AbstractC9527
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Iterator mo15281() {
        Iterator it;
        Map.Entry entryLowerEntry;
        C13758 c13758 = this.f16637;
        AbstractC3675 abstractC3675 = c13758.f41052;
        AbstractC3675 abstractC3676 = c13758.f41052;
        C15668 c15668 = C15668.f48229;
        NavigableMap navigableMap = this.f16636;
        if (abstractC3675 == c15668 || (entryLowerEntry = navigableMap.lowerEntry((AbstractC3675) abstractC3676.mo11188())) == null) {
            it = navigableMap.values().iterator();
        } else if (abstractC3676.mo7489((Comparable) ((C13758) entryLowerEntry.getValue()).f41053)) {
            it = navigableMap.tailMap((AbstractC3675) entryLowerEntry.getKey(), true).values().iterator();
        } else {
            it = navigableMap.tailMap((AbstractC3675) abstractC3676.mo11188(), true).values().iterator();
        }
        return new C19446(this, it);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final C13758 get(Object obj) {
        Map.Entry entryLowerEntry;
        if (obj instanceof AbstractC3675) {
            try {
                AbstractC3675 abstractC3675 = (AbstractC3675) obj;
                if (this.f16637.m33073(abstractC3675) && (entryLowerEntry = this.f16636.lowerEntry(abstractC3675)) != null && ((C13758) entryLowerEntry.getValue()).f41053.equals(abstractC3675)) {
                    return (C13758) entryLowerEntry.getValue();
                }
            } catch (ClassCastException unused) {
            }
        }
        return null;
    }

    @Override // l.AbstractC6539
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Iterator mo15282() {
        Collection collectionValues;
        C13758 c13758 = this.f16637;
        AbstractC3675 abstractC3675 = c13758.f41053;
        AbstractC3675 abstractC3676 = c13758.f41053;
        C9320 c9320 = C9320.f28269;
        NavigableMap navigableMap = this.f16636;
        if (abstractC3675 != c9320) {
            collectionValues = navigableMap.headMap((AbstractC3675) abstractC3676.mo11188(), false).descendingMap().values();
        } else {
            collectionValues = navigableMap.descendingMap().values();
        }
        InterfaceC5998 interfaceC5998M13612 = C4648.m13612(collectionValues.iterator());
        C22287 c22287 = (C22287) interfaceC5998M13612;
        if (c22287.hasNext() && abstractC3676.mo7489((Comparable) ((C13758) c22287.peek()).f41053)) {
            c22287.next();
        }
        return new C0394(this, interfaceC5998M13612);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        if (this.f16637.equals(C13758.m33070())) {
            return this.f16636.size();
        }
        return C4648.m13616(mo15281());
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        if (this.f16637.equals(C13758.m33070())) {
            return this.f16636.isEmpty();
        }
        return !((AbstractC1349) mo15281()).hasNext();
    }

    public C5334(NavigableMap navigableMap) {
        this.f16636 = navigableMap;
        this.f16637 = C13758.m33070();
    }

    public C5334(NavigableMap navigableMap, C13758 c13758) {
        this.f16636 = navigableMap;
        this.f16637 = c13758;
    }
}
