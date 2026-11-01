package com.umeng.analytics.pro;

import java.nio.ByteBuffer;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import org.bouncycastle.math.p080ec.custom.sec.SecP521R1Field;

/* JADX INFO: renamed from: com.umeng.analytics.pro.aw */
/* JADX INFO: compiled from: G69X */
/* JADX INFO: loaded from: classes.dex */
public final class C0665aw {

    /* JADX INFO: renamed from: a */
    public static final Comparator f2450a = new a();

    /* JADX INFO: renamed from: a */
    public static int m2276a(byte b, byte b2) {
        if (b < b2) {
            return -1;
        }
        return b2 < b ? 1 : 0;
    }

    /* JADX INFO: renamed from: a */
    public static int m2277a(double d, double d2) {
        if (d < d2) {
            return -1;
        }
        return d2 < d ? 1 : 0;
    }

    /* JADX INFO: renamed from: a */
    public static int m2278a(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i2 < i ? 1 : 0;
    }

    /* JADX INFO: renamed from: a */
    public static int m2279a(long j, long j2) {
        if (j < j2) {
            return -1;
        }
        return j2 < j ? 1 : 0;
    }

    /* JADX INFO: renamed from: a */
    public static int m2287a(short s, short s2) {
        if (s < s2) {
            return -1;
        }
        return s2 < s ? 1 : 0;
    }

    /* JADX INFO: renamed from: a */
    public static int m2281a(Object obj, Object obj2) {
        if (obj instanceof Comparable) {
            return m2280a((Comparable) obj, (Comparable) obj2);
        }
        if (obj instanceof List) {
            return m2284a((List) obj, (List) obj2);
        }
        if (obj instanceof Set) {
            return m2286a((Set) obj, (Set) obj2);
        }
        if (obj instanceof Map) {
            return m2285a((Map) obj, (Map) obj2);
        }
        if (obj instanceof byte[]) {
            return m2289a((byte[]) obj, (byte[]) obj2);
        }
        throw new IllegalArgumentException("Cannot compare objects of type " + obj.getClass());
    }

    /* JADX INFO: renamed from: a */
    public static int m2288a(boolean z, boolean z2) {
        return Boolean.valueOf(z).compareTo(Boolean.valueOf(z2));
    }

    /* JADX INFO: renamed from: a */
    public static int m2282a(String str, String str2) {
        return str.compareTo(str2);
    }

    /* JADX INFO: renamed from: a */
    public static int m2289a(byte[] bArr, byte[] bArr2) {
        int iM2278a = m2278a(bArr.length, bArr2.length);
        if (iM2278a != 0) {
            return iM2278a;
        }
        for (int i = 0; i < bArr.length; i++) {
            int iM2276a = m2276a(bArr[i], bArr2[i]);
            if (iM2276a != 0) {
                return iM2276a;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: a */
    public static int m2280a(Comparable comparable, Comparable comparable2) {
        return comparable.compareTo(comparable2);
    }

    /* JADX INFO: renamed from: a */
    public static int m2284a(List list, List list2) {
        int iM2278a = m2278a(list.size(), list2.size());
        if (iM2278a != 0) {
            return iM2278a;
        }
        for (int i = 0; i < list.size(); i++) {
            int iCompare = f2450a.compare(list.get(i), list2.get(i));
            if (iCompare != 0) {
                return iCompare;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: a */
    public static int m2286a(Set set, Set set2) {
        int iM2278a = m2278a(set.size(), set2.size());
        if (iM2278a != 0) {
            return iM2278a;
        }
        Comparator comparator = f2450a;
        TreeSet treeSet = new TreeSet(comparator);
        treeSet.addAll(set);
        TreeSet treeSet2 = new TreeSet(comparator);
        treeSet2.addAll(set2);
        Iterator it = treeSet.iterator();
        Iterator it2 = treeSet2.iterator();
        while (it.hasNext() && it2.hasNext()) {
            int iCompare = f2450a.compare(it.next(), it2.next());
            if (iCompare != 0) {
                return iCompare;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: a */
    public static int m2285a(Map map, Map map2) {
        int iM2278a = m2278a(map.size(), map2.size());
        if (iM2278a != 0) {
            return iM2278a;
        }
        Comparator comparator = f2450a;
        TreeMap treeMap = new TreeMap(comparator);
        treeMap.putAll(map);
        Iterator it = treeMap.entrySet().iterator();
        TreeMap treeMap2 = new TreeMap(comparator);
        treeMap2.putAll(map2);
        Iterator it2 = treeMap2.entrySet().iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Map.Entry entry2 = (Map.Entry) it2.next();
            Comparator comparator2 = f2450a;
            int iCompare = comparator2.compare(entry.getKey(), entry2.getKey());
            if (iCompare != 0) {
                return iCompare;
            }
            int iCompare2 = comparator2.compare(entry.getValue(), entry2.getValue());
            if (iCompare2 != 0) {
                return iCompare2;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: com.umeng.analytics.pro.aw$a */
    /* JADX INFO: compiled from: G69X */
    public class a implements Comparator {
        public a() {
        }

        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            if (obj == null && obj2 == null) {
                return 0;
            }
            if (obj == null) {
                return -1;
            }
            if (obj2 == null) {
                return 1;
            }
            if (obj instanceof List) {
                return C0665aw.m2284a((List) obj, (List) obj2);
            }
            if (obj instanceof Set) {
                return C0665aw.m2286a((Set) obj, (Set) obj2);
            }
            if (obj instanceof Map) {
                return C0665aw.m2285a((Map) obj, (Map) obj2);
            }
            if (obj instanceof byte[]) {
                return C0665aw.m2289a((byte[]) obj, (byte[]) obj2);
            }
            return C0665aw.m2280a((Comparable) obj, (Comparable) obj2);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m2291a(ByteBuffer byteBuffer, StringBuilder sb) {
        byte[] bArrArray = byteBuffer.array();
        int iArrayOffset = byteBuffer.arrayOffset();
        int iPosition = byteBuffer.position() + iArrayOffset;
        int iLimit = byteBuffer.limit() + iArrayOffset;
        int i = iLimit - iPosition > 128 ? iPosition + 128 : iLimit;
        for (int i2 = iPosition; i2 < i; i2++) {
            if (i2 > iPosition) {
                sb.append(" ");
            }
            sb.append(m2290a(bArrArray[i2]));
        }
        if (iLimit != i) {
            sb.append("...");
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m2290a(byte b) {
        return Integer.toHexString((b | 256) & SecP521R1Field.P16).toUpperCase().substring(1);
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m2292a(ByteBuffer byteBuffer) {
        if (m2294b(byteBuffer)) {
            return byteBuffer.array();
        }
        byte[] bArr = new byte[byteBuffer.remaining()];
        m2283a(byteBuffer, bArr, 0);
        return bArr;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m2294b(ByteBuffer byteBuffer) {
        return byteBuffer.hasArray() && byteBuffer.position() == 0 && byteBuffer.arrayOffset() == 0 && byteBuffer.remaining() == byteBuffer.capacity();
    }

    /* JADX INFO: renamed from: a */
    public static int m2283a(ByteBuffer byteBuffer, byte[] bArr, int i) {
        int iRemaining = byteBuffer.remaining();
        System.arraycopy(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), bArr, i, iRemaining);
        return iRemaining;
    }

    /* JADX INFO: renamed from: c */
    public static ByteBuffer m2295c(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return null;
        }
        return m2294b(byteBuffer) ? byteBuffer : ByteBuffer.wrap(m2292a(byteBuffer));
    }

    /* JADX INFO: renamed from: d */
    public static ByteBuffer m2296d(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return null;
        }
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[byteBuffer.remaining()]);
        if (byteBuffer.hasArray()) {
            System.arraycopy(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBufferWrap.array(), 0, byteBuffer.remaining());
            return byteBufferWrap;
        }
        byteBuffer.slice().get(byteBufferWrap.array());
        return byteBufferWrap;
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m2293a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }
}
