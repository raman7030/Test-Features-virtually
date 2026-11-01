package p067l;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.bouncycastle.math.raw.Mod;

/* JADX INFO: renamed from: l.ܽۗܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: O2OZ */
/* JADX INFO: loaded from: classes4.dex */
public final class C17930 extends AbstractMap implements Serializable {

    /* JADX INFO: renamed from: ۨ */
    public static final Object f53543 = new Object();

    /* JADX INFO: renamed from: ۗ */
    public transient int f53544;

    /* JADX INFO: renamed from: ۙ */
    public transient Object[] f53545;

    /* JADX INFO: renamed from: ۛ */
    public transient Collection f53546;

    /* JADX INFO: renamed from: ۤ */
    public transient Object[] f53547;

    /* JADX INFO: renamed from: ۫ */
    public transient Object f53548;

    /* JADX INFO: renamed from: ۬ */
    public transient int f53549;

    /* JADX INFO: renamed from: ᩶ */
    public transient Set f53550;

    /* JADX INFO: renamed from: ᩸ */
    public transient int[] f53551;

    /* JADX INFO: renamed from: ᩹ */
    public transient Set f53552;

    /* JADX INFO: renamed from: ܳ */
    public static /* synthetic */ void m40769(C17930 c17930) {
        c17930.f53549--;
    }

    /* JADX INFO: renamed from: ᩻ */
    public static C17930 m40778() {
        C17930 c17930 = new C17930();
        c17930.m40783(3);
        return c17930;
    }

    /* JADX INFO: renamed from: ܿ */
    public static C17930 m40773(int i) {
        C17930 c17930 = new C17930();
        c17930.m40783(i);
        return c17930;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m40783(int i) {
        C6194.m14029("Expected size must be >= 0", i >= 0);
        this.f53544 = Math.min(Math.max(i, 1), Mod.M30);
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m40784() {
        return this.f53548 == null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final Map m40779() {
        Object obj = this.f53548;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩷ */
    public int m40776() {
        return (1 << (this.f53544 & 31)) - 1;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m40782() {
        this.f53544 += 32;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int iMin;
        int i = 1;
        if (m40784()) {
            C6194.m14035("Arrays already allocated", m40784());
            int i2 = this.f53544;
            int iMax = Math.max(i2 + 1, 2);
            int iHighestOneBit = Integer.highestOneBit(iMax);
            if (iMax > ((int) (((double) iHighestOneBit) * 1.0d)) && (iHighestOneBit = iHighestOneBit << 1) <= 0) {
                iHighestOneBit = 1073741824;
            }
            int iMax2 = Math.max(4, iHighestOneBit);
            this.f53548 = C19272.m43913(iMax2);
            this.f53544 = C19272.m43910(this.f53544, 32 - Integer.numberOfLeadingZeros(iMax2 - 1), 31);
            this.f53551 = new int[i2];
            this.f53545 = new Object[i2];
            this.f53547 = new Object[i2];
        }
        Map mapM40779 = m40779();
        if (mapM40779 != null) {
            return mapM40779.put(obj, obj2);
        }
        int[] iArrM40764 = m40764();
        Object[] objArrM40770 = m40770();
        Object[] objArrM40763 = m40763();
        int i3 = this.f53549;
        int i4 = i3 + 1;
        int iM11132 = C5191.m11132(obj);
        int iM40776 = m40776();
        int i5 = iM11132 & iM40776;
        Object obj3 = this.f53548;
        C12826.requireNonNull(obj3);
        int iM43911 = C19272.m43911(i5, obj3);
        if (iM43911 != 0) {
            int i6 = ~iM40776;
            int i7 = iM11132 & i6;
            int i8 = 0;
            while (true) {
                int i9 = iM43911 - i;
                int i10 = iArrM40764[i9];
                if ((i10 & i6) == i7 && C12826.equals(obj, objArrM40770[i9])) {
                    Object obj4 = objArrM40763[i9];
                    objArrM40763[i9] = obj2;
                    return obj4;
                }
                int i11 = i10 & iM40776;
                i8++;
                if (i11 == 0) {
                    if (i8 < 9) {
                        if (i4 > iM40776) {
                            iM40776 = m40757(iM40776, (iM40776 + 1) * (iM40776 < 32 ? 4 : 2), iM11132, i3);
                            break;
                        }
                        iArrM40764[i9] = C19272.m43910(i10, i4, iM40776);
                        break;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(m40776() + 1, 1.0f);
                    int iM40781 = isEmpty() ? -1 : 0;
                    while (iM40781 >= 0) {
                        linkedHashMap.put(m40770()[iM40781], m40763()[iM40781]);
                        iM40781 = m40781(iM40781);
                    }
                    this.f53548 = linkedHashMap;
                    this.f53551 = null;
                    this.f53545 = null;
                    this.f53547 = null;
                    m40782();
                    return linkedHashMap.put(obj, obj2);
                }
                i = 1;
                iM43911 = i11;
            }
        } else if (i4 > iM40776) {
            iM40776 = m40757(iM40776, (iM40776 + 1) * (iM40776 < 32 ? 4 : 2), iM11132, i3);
        } else {
            Object obj5 = this.f53548;
            C12826.requireNonNull(obj5);
            C19272.m43914(i5, i4, obj5);
        }
        int length = m40764().length;
        if (i4 > length && (iMin = Math.min(Mod.M30, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            this.f53551 = Arrays.copyOf(m40764(), iMin);
            this.f53545 = Arrays.copyOf(m40770(), iMin);
            this.f53547 = Arrays.copyOf(m40763(), iMin);
        }
        m40764()[i3] = C19272.m43910(iM11132, 0, iM40776);
        m40770()[i3] = obj;
        m40763()[i3] = obj2;
        this.f53549 = i4;
        m40782();
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    private int m40757(int i, int i2, int i3, int i4) {
        Object objM43913 = C19272.m43913(i2);
        int i5 = i2 - 1;
        if (i4 != 0) {
            C19272.m43914(i3 & i5, i4 + 1, objM43913);
        }
        Object obj = this.f53548;
        C12826.requireNonNull(obj);
        int[] iArrM40764 = m40764();
        for (int i6 = 0; i6 <= i; i6++) {
            int iM43911 = C19272.m43911(i6, obj);
            while (iM43911 != 0) {
                int i7 = iM43911 - 1;
                int i8 = iArrM40764[i7];
                int i9 = ((~i) & i8) | i6;
                int i10 = i9 & i5;
                int iM43912 = C19272.m43911(i10, objM43913);
                C19272.m43914(i10, iM43911, objM43913);
                iArrM40764[i7] = C19272.m43910(i9, iM43912, i5);
                iM43911 = i8 & i;
            }
        }
        this.f53548 = objM43913;
        this.f53544 = C19272.m43910(this.f53544, 32 - Integer.numberOfLeadingZeros(i5), 31);
        return i5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public int m40758(Object obj) {
        if (m40784()) {
            return -1;
        }
        int iM11132 = C5191.m11132(obj);
        int iM40776 = m40776();
        Object obj2 = this.f53548;
        C12826.requireNonNull(obj2);
        int iM43911 = C19272.m43911(iM11132 & iM40776, obj2);
        if (iM43911 == 0) {
            return -1;
        }
        int i = ~iM40776;
        int i2 = iM11132 & i;
        do {
            int i3 = iM43911 - 1;
            int i4 = m40764()[i3];
            if ((i4 & i) == i2 && C12826.equals(obj, m40770()[i3])) {
                return i3;
            }
            iM43911 = i4 & iM40776;
        } while (iM43911 != 0);
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map mapM40779 = m40779();
        if (mapM40779 != null) {
            return mapM40779.containsKey(obj);
        }
        return m40758(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map mapM40779 = m40779();
        if (mapM40779 != null) {
            return mapM40779.get(obj);
        }
        int iM40758 = m40758(obj);
        if (iM40758 == -1) {
            return null;
        }
        return m40763()[iM40758];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map mapM40779 = m40779();
        if (mapM40779 != null) {
            return mapM40779.remove(obj);
        }
        Object objM40766 = m40766(obj);
        if (objM40766 == f53543) {
            return null;
        }
        return objM40766;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۧ */
    public Object m40766(Object obj) {
        boolean zM40784 = m40784();
        Object obj2 = f53543;
        if (zM40784) {
            return obj2;
        }
        int iM40776 = m40776();
        Object obj3 = this.f53548;
        C12826.requireNonNull(obj3);
        int iM43912 = C19272.m43912(obj, null, iM40776, obj3, m40764(), m40770(), null);
        if (iM43912 == -1) {
            return obj2;
        }
        Object obj4 = m40763()[iM43912];
        m40780(iM43912, iM40776);
        this.f53549--;
        m40782();
        return obj4;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m40781(int i) {
        int i2 = i + 1;
        if (i2 < this.f53549) {
            return i2;
        }
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        Set set = this.f53550;
        if (set != null) {
            return set;
        }
        C9253 c9253 = new C9253(this);
        this.f53550 = c9253;
        return c9253;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.f53552;
        if (set != null) {
            return set;
        }
        C24005 c24005 = new C24005(this);
        this.f53552 = c24005;
        return c24005;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map mapM40779 = m40779();
        return mapM40779 != null ? mapM40779.size() : this.f53549;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map mapM40779 = m40779();
        if (mapM40779 != null) {
            return mapM40779.containsValue(obj);
        }
        for (int i = 0; i < this.f53549; i++) {
            if (C12826.equals(obj, m40763()[i])) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.f53546;
        if (collection != null) {
            return collection;
        }
        C12567 c12567 = new C12567(this);
        this.f53546 = c12567;
        return c12567;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (m40784()) {
            return;
        }
        m40782();
        Map mapM40779 = m40779();
        if (mapM40779 != null) {
            this.f53544 = Math.min(Math.max(size(), 3), Mod.M30);
            mapM40779.clear();
            this.f53548 = null;
            this.f53549 = 0;
            return;
        }
        Arrays.fill(m40770(), 0, this.f53549, (Object) null);
        Arrays.fill(m40763(), 0, this.f53549, (Object) null);
        Object obj = this.f53548;
        C12826.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(m40764(), 0, this.f53549, 0);
        this.f53549 = 0;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        Iterator c7912;
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Map mapM40779 = m40779();
        if (mapM40779 != null) {
            c7912 = mapM40779.entrySet().iterator();
        } else {
            c7912 = new C7912(this);
        }
        while (c7912.hasNext()) {
            Map.Entry entry = (Map.Entry) c7912.next();
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i = objectInputStream.readInt();
        if (i < 0) {
            throw new InvalidObjectException(C20778.m46922(i, "Invalid size: "));
        }
        m40783(i);
        for (int i2 = 0; i2 < i; i2++) {
            put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static Object m40767(C17930 c17930) {
        Object obj = c17930.f53548;
        C12826.requireNonNull(obj);
        return obj;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m40780(int i, int i2) {
        Object obj = this.f53548;
        C12826.requireNonNull(obj);
        int[] iArrM40764 = m40764();
        Object[] objArrM40770 = m40770();
        Object[] objArrM40763 = m40763();
        int size = size();
        int i3 = size - 1;
        if (i < i3) {
            Object obj2 = objArrM40770[i3];
            objArrM40770[i] = obj2;
            objArrM40763[i] = objArrM40763[i3];
            objArrM40770[i3] = null;
            objArrM40763[i3] = null;
            iArrM40764[i] = iArrM40764[i3];
            iArrM40764[i3] = 0;
            int iM11132 = C5191.m11132(obj2) & i2;
            int iM43911 = C19272.m43911(iM11132, obj);
            if (iM43911 == size) {
                C19272.m43914(iM11132, i + 1, obj);
                return;
            }
            while (true) {
                int i4 = iM43911 - 1;
                int i5 = iArrM40764[i4];
                int i6 = i5 & i2;
                if (i6 == size) {
                    iArrM40764[i4] = C19272.m43910(i5, i + 1, i2);
                    return;
                }
                iM43911 = i6;
            }
        } else {
            objArrM40770[i] = null;
            objArrM40763[i] = null;
            iArrM40764[i] = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۢ */
    public int[] m40764() {
        int[] iArr = this.f53551;
        C12826.requireNonNull(iArr);
        return iArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܺ */
    public Object[] m40770() {
        Object[] objArr = this.f53545;
        C12826.requireNonNull(objArr);
        return objArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۖ */
    public Object[] m40763() {
        Object[] objArr = this.f53547;
        C12826.requireNonNull(objArr);
        return objArr;
    }

    /* JADX INFO: renamed from: ֫ */
    public static Object m40760(C17930 c17930, int i) {
        return c17930.m40770()[i];
    }

    /* JADX INFO: renamed from: ۧ */
    public static Object m40768(C17930 c17930, int i) {
        return c17930.m40763()[i];
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m40762(C17930 c17930, int i, Object obj) {
        c17930.m40763()[i] = obj;
    }
}
