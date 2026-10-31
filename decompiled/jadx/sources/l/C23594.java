package l;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.᩻ۡۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y8QE */
/* JADX INFO: loaded from: classes.dex */
public final class C23594 extends AbstractC20773 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public long f76496;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public long[] f76497;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public long[] f76498;

    public C23594() {
        super(new C19714());
        this.f76496 = -9223372036854775807L;
        this.f76498 = new long[0];
        this.f76497 = new long[0];
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m52066() {
        return this.f76496;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long[] m52069() {
        return this.f76498;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long[] m52068() {
        return this.f76497;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m52067(long j, C17714 c17714) {
        if (c17714.m41456() != 2 || !"onMetaData".equals(m52065(c17714)) || c17714.m41457() == 0 || c17714.m41456() != 8) {
            return false;
        }
        HashMap mapM52064 = m52064(c17714);
        Object obj = mapM52064.get("duration");
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            if (dDoubleValue > 0.0d) {
                this.f76496 = (long) (dDoubleValue * 1000000.0d);
            }
        }
        Object obj2 = mapM52064.get("keyframes");
        if (obj2 instanceof Map) {
            Map map = (Map) obj2;
            Object obj3 = map.get("filepositions");
            Object obj4 = map.get("times");
            if ((obj3 instanceof List) && (obj4 instanceof List)) {
                List list = (List) obj3;
                List list2 = (List) obj4;
                int size = list2.size();
                this.f76498 = new long[size];
                this.f76497 = new long[size];
                for (int i = 0; i < size; i++) {
                    Object obj5 = list.get(i);
                    Object obj6 = list2.get(i);
                    if ((obj6 instanceof Double) && (obj5 instanceof Double)) {
                        this.f76498[i] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                        this.f76497[i] = ((Double) obj5).longValue();
                    } else {
                        this.f76498 = new long[0];
                        this.f76497 = new long[0];
                        break;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m52065(C17714 c17714) {
        int iM41464 = c17714.m41464();
        int iM41485 = c17714.m41485();
        c17714.m41478(iM41464);
        return new String(c17714.m41482(), iM41485, iM41464);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static HashMap m52064(C17714 c17714) {
        int iM41492 = c17714.m41492();
        HashMap map = new HashMap(iM41492);
        for (int i = 0; i < iM41492; i++) {
            String strM52065 = m52065(c17714);
            Serializable serializableM52063 = m52063(c17714.m41456(), c17714);
            if (serializableM52063 != null) {
                map.put(strM52065, serializableM52063);
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Serializable m52063(int i, C17714 c17714) {
        if (i == 0) {
            return Double.valueOf(Double.longBitsToDouble(c17714.m41487()));
        }
        if (i == 1) {
            return Boolean.valueOf(c17714.m41456() == 1);
        }
        if (i == 2) {
            return m52065(c17714);
        }
        if (i != 3) {
            if (i == 8) {
                return m52064(c17714);
            }
            if (i != 10) {
                if (i != 11) {
                    return null;
                }
                Date date = new Date((long) Double.longBitsToDouble(c17714.m41487()));
                c17714.m41478(2);
                return date;
            }
            int iM41492 = c17714.m41492();
            ArrayList arrayList = new ArrayList(iM41492);
            for (int i2 = 0; i2 < iM41492; i2++) {
                Serializable serializableM52063 = m52063(c17714.m41456(), c17714);
                if (serializableM52063 != null) {
                    arrayList.add(serializableM52063);
                }
            }
            return arrayList;
        }
        HashMap map = new HashMap();
        while (true) {
            String strM52065 = m52065(c17714);
            int iM41456 = c17714.m41456();
            if (iM41456 == 9) {
                return map;
            }
            Serializable serializableM52064 = m52063(iM41456, c17714);
            if (serializableM52064 != null) {
                map.put(strM52065, serializableM52064);
            }
        }
    }
}
