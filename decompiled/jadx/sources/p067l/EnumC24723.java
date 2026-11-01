package p067l;

import java.util.BitSet;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.᩻ۜ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: D971 */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC24723 {
    SLL,
    LL,
    LL_EXACT_AMBIG_DETECTION;

    /* JADX INFO: renamed from: ֫ */
    public static boolean m54354(EnumC24723 enumC24723, C14878 c14878) {
        if (m54353(c14878)) {
            return true;
        }
        if (enumC24723 == SLL && c14878.f42418) {
            C14878 c14879 = new C14878();
            for (C23596 c23596 : c14878.f42416) {
                c14879.m33990(new C23596(c23596, c23596.f75119, c23596.f75117, C4607.f10339), null);
            }
            c14878 = c14879;
        }
        return m54359(m54362(c14878)) && !m54360(c14878);
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m54353(C14878 c14878) {
        Iterator it = c14878.f42416.iterator();
        while (it.hasNext()) {
            if (!(((C23596) it.next()).f75119 instanceof C11313)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ܿ */
    public static boolean m54364(C14878 c14878) {
        Iterator it = c14878.f42416.iterator();
        while (it.hasNext()) {
            if (((C23596) it.next()).f75119 instanceof C11313) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۜ */
    public static int m54356(Collection collection) {
        return m54365(collection);
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m54352(Collection collection) {
        return !m54367(collection);
    }

    /* JADX INFO: renamed from: ᩻ */
    public static boolean m54367(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (((BitSet) it.next()).cardinality() == 1) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ܳ */
    public static boolean m54359(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (((BitSet) it.next()).cardinality() > 1) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧ */
    public static boolean m54358(Collection collection) {
        Iterator it = collection.iterator();
        BitSet bitSet = (BitSet) it.next();
        while (it.hasNext()) {
            if (!((BitSet) it.next()).equals(bitSet)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ܿ */
    public static int m54363(Collection collection) {
        BitSet bitSetM54361 = m54361(collection);
        if (bitSetM54361.cardinality() == 1) {
            return bitSetM54361.nextSetBit(0);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ܽ */
    public static BitSet m54361(Collection collection) {
        BitSet bitSet = new BitSet();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            bitSet.or((BitSet) it.next());
        }
        return bitSet;
    }

    /* JADX INFO: renamed from: ۧ */
    public static BitSet m54357(C14878 c14878) {
        BitSet bitSet = new BitSet();
        Iterator it = c14878.f42416.iterator();
        while (it.hasNext()) {
            bitSet.set(((C23596) it.next()).f75116);
        }
        return bitSet;
    }

    /* JADX INFO: renamed from: ܽ */
    public static Collection m54362(C14878 c14878) {
        C16005 c16005 = new C16005(C18688.f55805);
        for (C23596 c23596 : c14878.f42416) {
            BitSet bitSet = (BitSet) c16005.get(c23596);
            if (bitSet == null) {
                bitSet = new BitSet();
                c16005.put(c23596, bitSet);
            }
            bitSet.set(c23596.f75116);
        }
        return c16005.values();
    }

    /* JADX INFO: renamed from: ᩳ */
    public static Map m54366(C14878 c14878) {
        HashMap map = new HashMap();
        for (C23596 c23596 : c14878.f42416) {
            BitSet bitSet = (BitSet) map.get(c23596.f75119);
            if (bitSet == null) {
                bitSet = new BitSet();
                map.put(c23596.f75119, bitSet);
            }
            bitSet.set(c23596.f75116);
        }
        return map;
    }

    /* JADX INFO: renamed from: ܳ */
    public static boolean m54360(C14878 c14878) {
        Iterator it = m54366(c14878).values().iterator();
        while (it.hasNext()) {
            if (((BitSet) it.next()).cardinality() == 1) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩳ */
    public static int m54365(Collection collection) {
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
