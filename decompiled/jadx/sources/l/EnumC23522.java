package l;

import java.util.BitSet;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.᩻ۜ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: D971 */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC23522 {
    SLL,
    LL,
    LL_EXACT_AMBIG_DETECTION;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m51952(EnumC23522 enumC23522, C13163 c13163) {
        if (m51951(c13163)) {
            return true;
        }
        if (enumC23522 == SLL && c13163.f39356) {
            C13163 c13164 = new C13163();
            for (C22336 c22336 : c13163.f39354) {
                c13164.m31894(new C22336(c22336, c22336.f72393, c22336.f72391, C2356.f7548), null);
            }
            c13163 = c13164;
        }
        return m51957(m51960(c13163)) && !m51958(c13163);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m51951(C13163 c13163) {
        Iterator it = c13163.f39354.iterator();
        while (it.hasNext()) {
            if (!(((C22336) it.next()).f72393 instanceof C9412)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static boolean m51962(C13163 c13163) {
        Iterator it = c13163.f39354.iterator();
        while (it.hasNext()) {
            if (((C22336) it.next()).f72393 instanceof C9412) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static int m51954(Collection collection) {
        return m51963(collection);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m51950(Collection collection) {
        return !m51965(collection);
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static boolean m51965(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (((BitSet) it.next()).cardinality() == 1) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static boolean m51957(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (((BitSet) it.next()).cardinality() > 1) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m51956(Collection collection) {
        Iterator it = collection.iterator();
        BitSet bitSet = (BitSet) it.next();
        while (it.hasNext()) {
            if (!((BitSet) it.next()).equals(bitSet)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static int m51961(Collection collection) {
        BitSet bitSetM51959 = m51959(collection);
        if (bitSetM51959.cardinality() == 1) {
            return bitSetM51959.nextSetBit(0);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static BitSet m51959(Collection collection) {
        BitSet bitSet = new BitSet();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            bitSet.or((BitSet) it.next());
        }
        return bitSet;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static BitSet m51955(C13163 c13163) {
        BitSet bitSet = new BitSet();
        Iterator it = c13163.f39354.iterator();
        while (it.hasNext()) {
            bitSet.set(((C22336) it.next()).f72390);
        }
        return bitSet;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static Collection m51960(C13163 c13163) {
        C14349 c14349 = new C14349(C17172.f52624);
        for (C22336 c22336 : c13163.f39354) {
            BitSet bitSet = (BitSet) c14349.get(c22336);
            if (bitSet == null) {
                bitSet = new BitSet();
                c14349.put(c22336, bitSet);
            }
            bitSet.set(c22336.f72390);
        }
        return c14349.values();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static Map m51964(C13163 c13163) {
        HashMap map = new HashMap();
        for (C22336 c22336 : c13163.f39354) {
            BitSet bitSet = (BitSet) map.get(c22336.f72393);
            if (bitSet == null) {
                bitSet = new BitSet();
                map.put(c22336.f72393, bitSet);
            }
            bitSet.set(c22336.f72390);
        }
        return map;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static boolean m51958(C13163 c13163) {
        Iterator it = m51964(c13163).values().iterator();
        while (it.hasNext()) {
            if (((BitSet) it.next()).cardinality() == 1) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static int m51963(Collection collection) {
        BitSet bitSet = new BitSet();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            bitSet.set(((BitSet) it.next()).nextSetBit(0));
            if (bitSet.cardinality() > 1) {
                return 0;
            }
        }
        return bitSet.nextSetBit(0);
    }
}
