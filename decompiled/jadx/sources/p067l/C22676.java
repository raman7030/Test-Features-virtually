package p067l;

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
public class C22676 extends AbstractMap {

    /* JADX INFO: renamed from: ۤ */
    public static final /* synthetic */ int f71529 = 0;

    /* JADX INFO: renamed from: ۗ */
    public final int f71530;

    /* JADX INFO: renamed from: ۙ */
    public volatile C16639 f71531;

    /* JADX INFO: renamed from: ۫ */
    public Map f71532;

    /* JADX INFO: renamed from: ۬ */
    public Map f71533;

    /* JADX INFO: renamed from: ᩶ */
    public volatile C19994 f71534;

    /* JADX INFO: renamed from: ᩸ */
    public List f71535 = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: ᩹ */
    public boolean f71536;

    public C22676(int i) {
        this.f71530 = i;
        Map map = Collections.EMPTY_MAP;
        this.f71533 = map;
        this.f71532 = map;
    }

    /* JADX INFO: renamed from: ᩻ */
    public void mo9645() {
        Map mapUnmodifiableMap;
        Map mapUnmodifiableMap2;
        if (this.f71536) {
            return;
        }
        if (this.f71533.isEmpty()) {
            mapUnmodifiableMap = Collections.EMPTY_MAP;
        } else {
            mapUnmodifiableMap = C21562.unmodifiableMap(this.f71533);
        }
        this.f71533 = mapUnmodifiableMap;
        if (this.f71532.isEmpty()) {
            mapUnmodifiableMap2 = Collections.EMPTY_MAP;
        } else {
            mapUnmodifiableMap2 = C21562.unmodifiableMap(this.f71532);
        }
        this.f71532 = mapUnmodifiableMap2;
        this.f71536 = true;
    }

    /* JADX INFO: renamed from: ܿ */
    public final boolean m50766() {
        return this.f71536;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.f71535.size();
        int iHashCode = 0;
        for (int i = 0; i < size; i++) {
            iHashCode += ((C3229) this.f71535.get(i)).hashCode();
        }
        return this.f71533.size() > 0 ? this.f71533.hashCode() + iHashCode : iHashCode;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m50763() {
        return this.f71535.size();
    }

    /* JADX INFO: renamed from: ۧ */
    public final Map.Entry m50764(int i) {
        return (Map.Entry) this.f71535.get(i);
    }

    /* JADX INFO: renamed from: ܽ */
    public final Iterable m50765() {
        if (this.f71533.isEmpty()) {
            return C7253.m16608();
        }
        return this.f71533.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f71533.size() + this.f71535.size();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m50752(comparable) >= 0 || this.f71533.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iM50752 = m50752(comparable);
        if (iM50752 >= 0) {
            return ((C3229) this.f71535.get(iM50752)).getValue();
        }
        return this.f71533.get(comparable);
    }

    /* JADX INFO: renamed from: ֫ */
    public final Object m50761(Comparable comparable, Object obj) {
        m50760();
        int iM50752 = m50752(comparable);
        if (iM50752 >= 0) {
            return ((C3229) this.f71535.get(iM50752)).setValue(obj);
        }
        m50760();
        boolean zIsEmpty = this.f71535.isEmpty();
        int i = this.f71530;
        if (zIsEmpty && !(this.f71535 instanceof ArrayList)) {
            this.f71535 = new ArrayList(i);
        }
        int i2 = -(iM50752 + 1);
        if (i2 >= i) {
            return m50755().put(comparable, obj);
        }
        if (this.f71535.size() == i) {
            C3229 c3229 = (C3229) this.f71535.remove(i - 1);
            m50755().put(c3229.getKey(), c3229.getValue());
        }
        this.f71535.add(i2, new C3229(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        m50760();
        if (!this.f71535.isEmpty()) {
            this.f71535.clear();
        }
        if (this.f71533.isEmpty()) {
            return;
        }
        this.f71533.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        m50760();
        Comparable comparable = (Comparable) obj;
        int iM50752 = m50752(comparable);
        if (iM50752 >= 0) {
            return m50757(iM50752);
        }
        if (this.f71533.isEmpty()) {
            return null;
        }
        return this.f71533.remove(comparable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܽ */
    public Object m50757(int i) {
        m50760();
        Object value = ((C3229) this.f71535.remove(i)).getValue();
        if (!this.f71533.isEmpty()) {
            Iterator it = m50755().entrySet().iterator();
            List list = this.f71535;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new C3229(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return value;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0025  */
    /* JADX WARN: Code duplicated, block: B:15:0x0040  */
    /* JADX WARN: Code duplicated, block: B:20:0x003e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:21:0x003b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x0043 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ֫ */
    private int m50752(Comparable comparable) {
        int i;
        int iCompareTo;
        int size = this.f71535.size();
        int i2 = size - 1;
        if (i2 < 0) {
            size = 0;
            while (size <= i2) {
                i = (size + i2) / 2;
                iCompareTo = comparable.compareTo(((C3229) this.f71535.get(i)).getKey());
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
            int iCompareTo2 = comparable.compareTo(((C3229) this.f71535.get(i2)).getKey());
            if (iCompareTo2 <= 0) {
                if (iCompareTo2 == 0) {
                    return i2;
                }
                size = 0;
                while (size <= i2) {
                    i = (size + i2) / 2;
                    iCompareTo = comparable.compareTo(((C3229) this.f71535.get(i)).getKey());
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
        if (this.f71531 == null) {
            this.f71531 = new C16639(this);
        }
        return this.f71531;
    }

    /* JADX INFO: renamed from: ֫ */
    public final Set m50762() {
        if (this.f71534 == null) {
            this.f71534 = new C19994(this);
        }
        return this.f71534;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩷ */
    public void m50760() {
        if (this.f71536) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: ۢ */
    private SortedMap m50755() {
        m50760();
        if (this.f71533.isEmpty() && !(this.f71533 instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f71533 = treeMap;
            this.f71532 = treeMap.descendingMap();
        }
        return (SortedMap) this.f71533;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22676)) {
            return super.equals(obj);
        }
        C22676 c22676 = (C22676) obj;
        int size = size();
        if (size == c22676.size()) {
            int size2 = this.f71535.size();
            if (size2 != c22676.f71535.size()) {
                return ((AbstractSet) entrySet()).equals(c22676.entrySet());
            }
            for (int i = 0; i < size2; i++) {
                if (m50764(i).equals(c22676.m50764(i))) {
                }
            }
            if (size2 != size) {
                return this.f71533.equals(c22676.f71533);
            }
            return true;
        }
        return false;
    }
}
