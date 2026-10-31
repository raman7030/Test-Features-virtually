package l;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: renamed from: l.᩸ۚۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: V9PU */
/* JADX INFO: loaded from: classes4.dex */
public class C21368 extends AbstractMap {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f68833 = 0;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final int f68834;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public volatile C15016 f68835;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public Map f68836;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public Map f68837;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public volatile C18546 f68838;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public List f68839 = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f68840;

    public C21368(int i) {
        this.f68834 = i;
        Map map = Collections.EMPTY_MAP;
        this.f68837 = map;
        this.f68836 = map;
    }

    /* JADX INFO: renamed from: ᩻ */
    public void mo7575() {
        Map mapUnmodifiableMap;
        Map mapUnmodifiableMap2;
        if (this.f68840) {
            return;
        }
        if (this.f68837.isEmpty()) {
            mapUnmodifiableMap = Collections.EMPTY_MAP;
        } else {
            mapUnmodifiableMap = C20195.unmodifiableMap(this.f68837);
        }
        this.f68837 = mapUnmodifiableMap;
        if (this.f68836.isEmpty()) {
            mapUnmodifiableMap2 = Collections.EMPTY_MAP;
        } else {
            mapUnmodifiableMap2 = C20195.unmodifiableMap(this.f68836);
        }
        this.f68836 = mapUnmodifiableMap2;
        this.f68840 = true;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean m48430() {
        return this.f68840;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.f68839.size();
        int iHashCode = 0;
        for (int i = 0; i < size; i++) {
            iHashCode += ((C0906) this.f68839.get(i)).hashCode();
        }
        return this.f68837.size() > 0 ? this.f68837.hashCode() + iHashCode : iHashCode;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m48427() {
        return this.f68839.size();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Map.Entry m48428(int i) {
        return (Map.Entry) this.f68839.get(i);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Iterable m48429() {
        if (this.f68837.isEmpty()) {
            return C5140.m14700();
        }
        return this.f68837.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f68837.size() + this.f68839.size();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m48416(comparable) >= 0 || this.f68837.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iM48416 = m48416(comparable);
        if (iM48416 >= 0) {
            return ((C0906) this.f68839.get(iM48416)).getValue();
        }
        return this.f68837.get(comparable);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object m48425(Comparable comparable, Object obj) {
        m48424();
        int iM48416 = m48416(comparable);
        if (iM48416 >= 0) {
            return ((C0906) this.f68839.get(iM48416)).setValue(obj);
        }
        m48424();
        boolean zIsEmpty = this.f68839.isEmpty();
        int i = this.f68834;
        if (zIsEmpty && !(this.f68839 instanceof ArrayList)) {
            this.f68839 = new ArrayList(i);
        }
        int i2 = -(iM48416 + 1);
        if (i2 >= i) {
            return m48419().put(comparable, obj);
        }
        if (this.f68839.size() == i) {
            C0906 c0906 = (C0906) this.f68839.remove(i - 1);
            m48419().put(c0906.getKey(), c0906.getValue());
        }
        this.f68839.add(i2, new C0906(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        m48424();
        if (!this.f68839.isEmpty()) {
            this.f68839.clear();
        }
        if (this.f68837.isEmpty()) {
            return;
        }
        this.f68837.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        m48424();
        Comparable comparable = (Comparable) obj;
        int iM48416 = m48416(comparable);
        if (iM48416 >= 0) {
            return m48421(iM48416);
        }
        if (this.f68837.isEmpty()) {
            return null;
        }
        return this.f68837.remove(comparable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public Object m48421(int i) {
        m48424();
        Object value = ((C0906) this.f68839.remove(i)).getValue();
        if (!this.f68837.isEmpty()) {
            Iterator it = m48419().entrySet().iterator();
            List list = this.f68839;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new C0906(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return value;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0025  */
    /* JADX WARN: Code duplicated, block: B:15:0x0040  */
    /* JADX WARN: Code duplicated, block: B:20:0x003e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:21:0x003b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x0043 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m48416(Comparable comparable) {
        int i;
        int iCompareTo;
        int size = this.f68839.size();
        int i2 = size - 1;
        if (i2 < 0) {
            size = 0;
            while (size <= i2) {
                i = (size + i2) / 2;
                iCompareTo = comparable.compareTo(((C0906) this.f68839.get(i)).getKey());
                if (iCompareTo < 0) {
                    i2 = i - 1;
                } else {
                    if (iCompareTo > 0) {
                        return i;
                    }
                    size = i + 1;
                }
            }
        } else {
            int iCompareTo2 = comparable.compareTo(((C0906) this.f68839.get(i2)).getKey());
            if (iCompareTo2 <= 0) {
                if (iCompareTo2 == 0) {
                    return i2;
                }
                size = 0;
                while (size <= i2) {
                    i = (size + i2) / 2;
                    iCompareTo = comparable.compareTo(((C0906) this.f68839.get(i)).getKey());
                    if (iCompareTo < 0) {
                        i2 = i - 1;
                    } else {
                        if (iCompareTo > 0) {
                            return i;
                        }
                        size = i + 1;
                    }
                }
            }
        }
        return -(size + 1);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f68835 == null) {
            this.f68835 = new C15016(this);
        }
        return this.f68835;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Set m48426() {
        if (this.f68838 == null) {
            this.f68838 = new C18546(this);
        }
        return this.f68838;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public void m48424() {
        if (this.f68840) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    private SortedMap m48419() {
        m48424();
        if (this.f68837.isEmpty() && !(this.f68837 instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f68837 = treeMap;
            this.f68836 = treeMap.descendingMap();
        }
        return (SortedMap) this.f68837;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21368)) {
            return super.equals(obj);
        }
        C21368 c21368 = (C21368) obj;
        int size = size();
        if (size == c21368.size()) {
            int size2 = this.f68839.size();
            if (size2 != c21368.f68839.size()) {
                return ((AbstractSet) entrySet()).equals(c21368.entrySet());
            }
            for (int i = 0; i < size2; i++) {
                if (m48428(i).equals(c21368.m48428(i))) {
                }
            }
            if (size2 != size) {
                return this.f68837.equals(c21368.f68837);
            }
            return true;
        }
        return false;
    }
}
