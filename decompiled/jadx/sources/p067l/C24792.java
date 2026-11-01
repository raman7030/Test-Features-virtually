package p067l;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.᩻ۡۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y8QE */
/* JADX INFO: loaded from: classes.dex */
public final class C24792 extends AbstractC22111 {

    /* JADX INFO: renamed from: ۧ */
    public long f79241;

    /* JADX INFO: renamed from: ܽ */
    public long[] f79242;

    /* JADX INFO: renamed from: ᩳ */
    public long[] f79243;

    public C24792() {
        super(new C21105());
        this.f79241 = -9223372036854775807L;
        this.f79243 = new long[0];
        this.f79242 = new long[0];
    }

    /* JADX INFO: renamed from: ֫ */
    public final long m54469() {
        return this.f79241;
    }

    /* JADX INFO: renamed from: ܽ */
    public final long[] m54472() {
        return this.f79243;
    }

    /* JADX INFO: renamed from: ۧ */
    public final long[] m54471() {
        return this.f79242;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m54470(long j, C19203 c19203) {
        if (c19203.m43702() != 2 || !"onMetaData".equals(m54468(c19203)) || c19203.m43703() == 0 || c19203.m43702() != 8) {
            return false;
        }
        HashMap mapM54467 = m54467(c19203);
        Object obj = mapM54467.get("duration");
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            if (dDoubleValue > 0.0d) {
                this.f79241 = (long) (dDoubleValue * 1000000.0d);
            }
        }
        Object obj2 = mapM54467.get("keyframes");
        if (obj2 instanceof Map) {
            Map map = (Map) obj2;
            Object obj3 = map.get("filepositions");
            Object obj4 = map.get("times");
            if ((obj3 instanceof List) && (obj4 instanceof List)) {
                List list = (List) obj3;
                List list2 = (List) obj4;
                int size = list2.size();
                this.f79243 = new long[size];
                this.f79242 = new long[size];
                for (int i = 0; i < size; i++) {
                    Object obj5 = list.get(i);
                    Object obj6 = list2.get(i);
                    if ((obj6 instanceof Double) && (obj5 instanceof Double)) {
                        this.f79243[i] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                        this.f79242[i] = ((Double) obj5).longValue();
                    } else {
                        this.f79243 = new long[0];
                        this.f79242 = new long[0];
                        break;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧ */
    public static String m54468(C19203 c19203) {
        int iM43710 = c19203.m43710();
        int iM43731 = c19203.m43731();
        c19203.m43724(iM43710);
        return new String(c19203.m43728(), iM43731, iM43710);
    }

    /* JADX INFO: renamed from: ֫ */
    public static HashMap m54467(C19203 c19203) {
        int iM43738 = c19203.m43738();
        HashMap map = new HashMap(iM43738);
        for (int i = 0; i < iM43738; i++) {
            String strM54468 = m54468(c19203);
            Serializable serializableM54466 = m54466(c19203.m43702(), c19203);
            if (serializableM54466 != null) {
                map.put(strM54468, serializableM54466);
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: ֫ */
    public static Serializable m54466(int i, C19203 c19203) {
        if (i == 0) {
            return Double.valueOf(Double.longBitsToDouble(c19203.m43733()));
        }
        if (i == 1) {
            return Boolean.valueOf(c19203.m43702() == 1);
        }
        if (i == 2) {
            return m54468(c19203);
        }
        if (i != 3) {
            if (i == 8) {
                return m54467(c19203);
            }
            if (i != 10) {
                if (i != 11) {
                    return null;
                }
                Date date = new Date((long) Double.longBitsToDouble(c19203.m43733()));
                c19203.m43724(2);
                return date;
            }
            int iM43738 = c19203.m43738();
            ArrayList arrayList = new ArrayList(iM43738);
            for (int i2 = 0; i2 < iM43738; i2++) {
                Serializable serializableM54466 = m54466(c19203.m43702(), c19203);
                if (serializableM54466 != null) {
                    arrayList.add(serializableM54466);
                }
            }
            return arrayList;
        }
        HashMap map = new HashMap();
        while (true) {
            String strM54468 = m54468(c19203);
            int iM43702 = c19203.m43702();
            if (iM43702 == 9) {
                return map;
            }
            Serializable serializableM54467 = m54466(iM43702, c19203);
            if (serializableM54467 != null) {
                map.put(strM54468, serializableM54467);
            }
        }
    }
}
