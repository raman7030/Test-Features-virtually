package p067l;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: l.ۡۚۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9OQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C10606 {

    /* JADX INFO: renamed from: ֫ */
    public static final /* synthetic */ int f29361 = 0;

    /* JADX INFO: renamed from: ۧ */
    public static final Class f29362 = AbstractC6285.class;

    /* JADX INFO: renamed from: ܽ */
    public static final AbstractC18533 f29363;

    /* JADX INFO: renamed from: ᩳ */
    public static final C17191 f29364;

    /* JADX INFO: renamed from: ֫ */
    public static void m24401(Class cls) {
        Class cls2;
        if (!AbstractC23049.class.isAssignableFrom(cls) && (cls2 = f29362) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m24412(int i, List list, InterfaceC8672 interfaceC8672, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ((C25120) interfaceC8672).m55158(i, z, list);
    }

    /* JADX INFO: renamed from: ܳ */
    public static void m24414(int i, List list, InterfaceC8672 interfaceC8672, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ((C25120) interfaceC8672).m55160(i, z, list);
    }

    /* JADX INFO: renamed from: ۜ */
    public static void m24405(int i, List list, InterfaceC8672 interfaceC8672, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ((C25120) interfaceC8672).m55149(i, z, list);
    }

    /* JADX INFO: renamed from: ۘ */
    public static void m24404(int i, List list, InterfaceC8672 interfaceC8672, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ((C25120) interfaceC8672).m55148(i, z, list);
    }

    /* JADX INFO: renamed from: ܺ */
    public static void m24415(int i, List list, InterfaceC8672 interfaceC8672, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ((C25120) interfaceC8672).m55161(i, z, list);
    }

    /* JADX INFO: renamed from: ܿ */
    public static void m24419(int i, List list, InterfaceC8672 interfaceC8672, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ((C25120) interfaceC8672).m55168(i, z, list);
    }

    /* JADX INFO: renamed from: ۢ */
    public static void m24407(int i, List list, InterfaceC8672 interfaceC8672, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ((C25120) interfaceC8672).m55151(i, z, list);
    }

    /* JADX INFO: renamed from: ᩻ */
    public static void m24424(int i, List list, InterfaceC8672 interfaceC8672, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ((C25120) interfaceC8672).m55173(i, z, list);
    }

    /* JADX INFO: renamed from: ۖ */
    public static void m24403(int i, List list, InterfaceC8672 interfaceC8672, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ((C25120) interfaceC8672).m55147(i, z, list);
    }

    /* JADX INFO: renamed from: ۡ */
    public static void m24406(int i, List list, InterfaceC8672 interfaceC8672, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ((C25120) interfaceC8672).m55150(i, z, list);
    }

    /* JADX INFO: renamed from: ᩳ */
    public static void m24421(int i, List list, InterfaceC8672 interfaceC8672, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ((C25120) interfaceC8672).m55171(i, z, list);
    }

    /* JADX INFO: renamed from: ᩷ */
    public static void m24422(int i, List list, InterfaceC8672 interfaceC8672, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ((C25120) interfaceC8672).m55172(i, z, list);
    }

    /* JADX INFO: renamed from: ܽ */
    public static void m24417(int i, List list, InterfaceC8672 interfaceC8672, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ((C25120) interfaceC8672).m55165(i, z, list);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m24400(int i, List list, InterfaceC8672 interfaceC8672, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ((C25120) interfaceC8672).m55146(i, z, list);
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m24411(int i, List list, InterfaceC8672 interfaceC8672, InterfaceC11277 interfaceC11277) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C25120 c25120 = (C25120) interfaceC8672;
        c25120.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            c25120.m55156(i, list.get(i2), interfaceC11277);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m24399(int i, List list, InterfaceC8672 interfaceC8672, InterfaceC11277 interfaceC11277) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C25120 c25120 = (C25120) interfaceC8672;
        c25120.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            c25120.m55140(i, list.get(i2), interfaceC11277);
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public static int m24416(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C7646)) {
            int iM37224 = 0;
            while (i < size) {
                iM37224 += AbstractC16402.m37224(((Long) list.get(i)).longValue());
                i++;
            }
            return iM37224;
        }
        C7646 c7646 = (C7646) list;
        int iM37225 = 0;
        while (i < size) {
            iM37225 += AbstractC16402.m37224(c7646.getLong(i));
            i++;
        }
        return iM37225;
    }

    /* JADX INFO: renamed from: ᩻ */
    public static int m24423(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C7646)) {
            int iM37224 = 0;
            while (i < size) {
                iM37224 += AbstractC16402.m37224(((Long) list.get(i)).longValue());
                i++;
            }
            return iM37224;
        }
        C7646 c7646 = (C7646) list;
        int iM37225 = 0;
        while (i < size) {
            iM37225 += AbstractC16402.m37224(c7646.getLong(i));
            i++;
        }
        return iM37225;
    }

    /* JADX INFO: renamed from: ܿ */
    public static int m24418(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C7646)) {
            int iM37224 = 0;
            while (i < size) {
                long jLongValue = ((Long) list.get(i)).longValue();
                iM37224 += AbstractC16402.m37224((jLongValue >> 63) ^ (jLongValue << 1));
                i++;
            }
            return iM37224;
        }
        C7646 c7646 = (C7646) list;
        int iM37225 = 0;
        while (i < size) {
            long j = c7646.getLong(i);
            iM37225 += AbstractC16402.m37224((j >> 63) ^ (j << 1));
            i++;
        }
        return iM37225;
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m24395(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C23719)) {
            int iM37224 = 0;
            while (i < size) {
                iM37224 += AbstractC16402.m37224(((Integer) list.get(i)).intValue());
                i++;
            }
            return iM37224;
        }
        C23719 c23719 = (C23719) list;
        int iM37225 = 0;
        while (i < size) {
            iM37225 += AbstractC16402.m37224(c23719.getInt(i));
            i++;
        }
        return iM37225;
    }

    /* JADX INFO: renamed from: ۧ */
    public static int m24409(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C23719)) {
            int iM37224 = 0;
            while (i < size) {
                iM37224 += AbstractC16402.m37224(((Integer) list.get(i)).intValue());
                i++;
            }
            return iM37224;
        }
        C23719 c23719 = (C23719) list;
        int iM37225 = 0;
        while (i < size) {
            iM37225 += AbstractC16402.m37224(c23719.getInt(i));
            i++;
        }
        return iM37225;
    }

    /* JADX INFO: renamed from: ܳ */
    public static int m24413(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C23719)) {
            int iM37230 = 0;
            while (i < size) {
                iM37230 += AbstractC16402.m37230(((Integer) list.get(i)).intValue());
                i++;
            }
            return iM37230;
        }
        C23719 c23719 = (C23719) list;
        int iM37231 = 0;
        while (i < size) {
            iM37231 += AbstractC16402.m37230(c23719.getInt(i));
            i++;
        }
        return iM37231;
    }

    /* JADX INFO: renamed from: ᩳ */
    public static int m24420(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C23719)) {
            int iM37230 = 0;
            while (i < size) {
                int iIntValue = ((Integer) list.get(i)).intValue();
                iM37230 += AbstractC16402.m37230((iIntValue >> 31) ^ (iIntValue << 1));
                i++;
            }
            return iM37230;
        }
        C23719 c23719 = (C23719) list;
        int iM37231 = 0;
        while (i < size) {
            int i2 = c23719.getInt(i);
            iM37231 += AbstractC16402.m37230((i2 >> 31) ^ (i2 << 1));
            i++;
        }
        return iM37231;
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m24394(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return AbstractC16402.m37225(i) * size;
    }

    /* JADX INFO: renamed from: ۧ */
    public static int m24408(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (AbstractC16402.m37220(i) + 8) * size;
    }

    /* JADX INFO: renamed from: ֫ */
    public static AbstractC18533 m24398() {
        return f29363;
    }

    /* JADX INFO: renamed from: ۧ */
    public static C17191 m24410() {
        return f29364;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    static {
        AbstractC18533 abstractC18533 = null;
        if (C4452.class != 0) {
            try {
                abstractC18533 = (AbstractC18533) C4452.class.getConstructor(null).newInstance(null);
            } catch (Throwable unused) {
            }
        }
        f29363 = abstractC18533;
        f29364 = new C17191();
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m24402(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public static Object m24397(Object obj, int i, List list, InterfaceC14331 interfaceC14331, Object obj2, AbstractC18533 abstractC18533) {
        if (interfaceC14331 == null) {
            return obj2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                Integer num = (Integer) list.get(i3);
                int iIntValue = num.intValue();
                if (interfaceC14331.mo20899(iIntValue)) {
                    if (i3 != i2) {
                        list.set(i2, num);
                    }
                    i2++;
                } else {
                    obj2 = m24396(obj, i, iIntValue, obj2, abstractC18533);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
            return obj2;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int iIntValue2 = ((Integer) it.next()).intValue();
            if (!interfaceC14331.mo20899(iIntValue2)) {
                obj2 = m24396(obj, i, iIntValue2, obj2, abstractC18533);
                it.remove();
            }
        }
        return obj2;
    }

    /* JADX INFO: renamed from: ֫ */
    public static Object m24396(Object obj, int i, int i2, Object obj2, AbstractC18533 abstractC18533) {
        if (obj2 == null) {
            obj2 = abstractC18533.mo9307(obj);
        }
        abstractC18533.mo9316(i, i2, obj2);
        return obj2;
    }
}
