package p067l;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.TreeMap;

/* JADX INFO: renamed from: l.ۚ۟ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 5AV2 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7316 implements InterfaceC23409, InterfaceC9998 {

    /* JADX INFO: renamed from: ۗ */
    public static TimeZone f19149 = TimeZone.getDefault();

    /* JADX INFO: renamed from: ۙ */
    public static Locale f19150 = Locale.getDefault();

    /* JADX INFO: renamed from: ᩹ */
    public static int f19153 = (EnumC15361.UseBigDecimal.f43892 | EnumC15361.SortFeidFastMatch.f43892) | EnumC15361.IgnoreNotMatch.f43892;

    /* JADX INFO: renamed from: ᩶ */
    public static String f19151 = "yyyy-MM-dd HH:mm:ss";

    /* JADX INFO: renamed from: ᩸ */
    public static int f19152 = ((EnumC22172.QuoteFieldNames.f70155 | EnumC22172.SkipTransientField.f70155) | EnumC22172.WriteEnumUsingToString.f70155) | EnumC22172.SortField.f70155;

    /* JADX INFO: renamed from: ֫ */
    public static final C22739 m16893(String str) {
        int i = f19153;
        Object objM16891 = m16891(i, str);
        if ((objM16891 instanceof C22739) || objM16891 == null) {
            return (C22739) objM16891;
        }
        C22739 c22739 = (C22739) m16892(objM16891);
        if ((i & EnumC15361.SupportAutoType.f43892) != 0) {
            c22739.m50886("@type", objM16891.getClass().getName());
        }
        return c22739;
    }

    /* JADX INFO: renamed from: ֫ */
    public static final Object m16891(int i, String str) {
        if (str == null) {
            return null;
        }
        C13351 c13351 = new C13351(str, C24597.f77883, i);
        Object objM30480 = c13351.m30480((Object) null);
        c13351.m30496();
        c13351.close();
        return objM30480;
    }

    /* JADX INFO: renamed from: ֫ */
    public static final C22739 m16894(String str, EnumC15361... enumC15361Arr) {
        int i = f19153;
        int i2 = i;
        for (EnumC15361 enumC15361 : enumC15361Arr) {
            i2 |= enumC15361.f43892;
        }
        Object objM16891 = m16891(i2, str);
        if (objM16891 instanceof C22739) {
            return (C22739) objM16891;
        }
        C22739 c22739 = (C22739) m16892(objM16891);
        boolean z = (i & EnumC15361.SupportAutoType.f43892) != 0;
        if (!z) {
            for (EnumC15361 enumC15362 : enumC15361Arr) {
                if (enumC15362 == EnumC15361.SupportAutoType) {
                    z = true;
                }
            }
        }
        if (z) {
            c22739.m50886("@type", objM16891.getClass().getName());
        }
        return c22739;
    }

    /* JADX INFO: renamed from: ۧ */
    public static final String m16895(Object obj) {
        C24853 c24853 = C24853.f79394;
        C8760 c8760 = new C8760(f19152, new EnumC22172[0]);
        try {
            new C7834(c8760, c24853).m18107(obj);
            return c8760.toString();
        } finally {
            c8760.close();
        }
    }

    public final String toString() {
        return mo16897();
    }

    @Override // p067l.InterfaceC9998
    /* JADX INFO: renamed from: ܽ */
    public final String mo16897() {
        C8760 c8760 = new C8760(f19152, EnumC22172.f70143);
        try {
            new C7834(c8760, C24853.f79394).m18107(this);
            return c8760.toString();
        } finally {
            c8760.close();
        }
    }

    @Override // p067l.InterfaceC23409
    /* JADX INFO: renamed from: ֫ */
    public final void mo16896(Appendable appendable) {
        C8760 c8760 = new C8760(f19152, EnumC22172.f70143);
        try {
            try {
                new C7834(c8760, C24853.f79394).m18107(this);
                appendable.append(c8760.toString());
                c8760.close();
            } catch (IOException e) {
                throw new C16702(e.getMessage(), (Throwable) e);
            }
        } catch (Throwable th) {
            c8760.close();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static final Object m16892(Object obj) {
        Map map;
        C24853 c24853 = C24853.f79394;
        if (obj != null) {
            if (obj instanceof AbstractC7316) {
                return (AbstractC7316) obj;
            }
            if (obj instanceof Map) {
                Map map2 = (Map) obj;
                int size = map2.size();
                if (map2 instanceof LinkedHashMap) {
                    map = new LinkedHashMap(size);
                } else if (map2 instanceof TreeMap) {
                    map = new TreeMap();
                } else {
                    map = new HashMap(size);
                }
                C22739 c22739 = new C22739(map);
                for (Map.Entry entry : map2.entrySet()) {
                    Object key = entry.getKey();
                    int i = C20831.f65447;
                    c22739.m50886(key == null ? null : key.toString(), m16892(entry.getValue()));
                }
                return c22739;
            }
            if (obj instanceof Collection) {
                Collection collection = (Collection) obj;
                C3292 c3292 = new C3292(collection.size());
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    c3292.add(m16892(it.next()));
                }
                return c3292;
            }
            Class<?> cls = obj.getClass();
            if (cls.isEnum()) {
                return ((Enum) obj).name();
            }
            if (cls.isArray()) {
                int length = Array.getLength(obj);
                C3292 c3293 = new C3292(length);
                for (int i2 = 0; i2 < length; i2++) {
                    c3293.add(m16892(Array.get(obj, i2)));
                }
                return c3293;
            }
            if (C24597.m54232((Class) cls)) {
                return obj;
            }
            InterfaceC18147 interfaceC18147M54590 = c24853.m54590(cls);
            if (interfaceC18147M54590 instanceof C13199) {
                C13199 c13199 = (C13199) interfaceC18147M54590;
                C22739 c227310 = new C22739();
                try {
                    for (Map.Entry entry2 : c13199.m30204(obj).entrySet()) {
                        c227310.m50886((String) entry2.getKey(), m16892(entry2.getValue()));
                    }
                    return c227310;
                } catch (Exception e) {
                    throw new C16702("toJSON error", (Throwable) e);
                }
            }
        }
        return null;
    }
}
