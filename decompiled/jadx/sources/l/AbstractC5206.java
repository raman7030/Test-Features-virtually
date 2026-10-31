package l;

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
public abstract class AbstractC5206 implements InterfaceC22139, InterfaceC8028 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static TimeZone f16308 = TimeZone.getDefault();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Locale f16309 = Locale.getDefault();

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static int f16312 = (EnumC13671.UseBigDecimal.f40811 | EnumC13671.SortFeidFastMatch.f40811) | EnumC13671.IgnoreNotMatch.f40811;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static String f16310 = "yyyy-MM-dd HH:mm:ss";

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static int f16311 = ((EnumC20837.QuoteFieldNames.f67472 | EnumC20837.SkipTransientField.f67472) | EnumC20837.WriteEnumUsingToString.f67472) | EnumC20837.SortField.f67472;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final C21434 m14983(String str) {
        int i = f16312;
        Object objM14981 = m14981(i, str);
        if ((objM14981 instanceof C21434) || objM14981 == null) {
            return (C21434) objM14981;
        }
        C21434 c21434 = (C21434) m14982(objM14981);
        if ((i & EnumC13671.SupportAutoType.f40811) != 0) {
            c21434.m48549("@type", objM14981.getClass().getName());
        }
        return c21434;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final Object m14981(int i, String str) {
        if (str == null) {
            return null;
        }
        C11556 c11556 = new C11556(str, C23389.f75137, i);
        Object objM28434 = c11556.m28434((Object) null);
        c11556.m28450();
        c11556.close();
        return objM28434;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final C21434 m14984(String str, EnumC13671... enumC13671Arr) {
        int i = f16312;
        int i2 = i;
        for (EnumC13671 enumC13671 : enumC13671Arr) {
            i2 |= enumC13671.f40811;
        }
        Object objM14981 = m14981(i2, str);
        if (objM14981 instanceof C21434) {
            return (C21434) objM14981;
        }
        C21434 c21434 = (C21434) m14982(objM14981);
        boolean z = (i & EnumC13671.SupportAutoType.f40811) != 0;
        if (!z) {
            for (EnumC13671 enumC13672 : enumC13671Arr) {
                if (enumC13672 == EnumC13671.SupportAutoType) {
                    z = true;
                }
            }
        }
        if (z) {
            c21434.m48549("@type", objM14981.getClass().getName());
        }
        return c21434;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final String m14985(Object obj) {
        C23658 c23658 = C23658.f76648;
        C6725 c6725 = new C6725(f16311, new EnumC20837[0]);
        try {
            new C5751(c6725, c23658).m16188(obj);
            return c6725.toString();
        } finally {
            c6725.close();
        }
    }

    public final String toString() {
        return mo14987();
    }

    @Override // l.InterfaceC8028
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String mo14987() {
        C6725 c6725 = new C6725(f16311, EnumC20837.f67460);
        try {
            new C5751(c6725, C23658.f76648).m16188(this);
            return c6725.toString();
        } finally {
            c6725.close();
        }
    }

    @Override // l.InterfaceC22139
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo14986(Appendable appendable) {
        C6725 c6725 = new C6725(f16311, EnumC20837.f67460);
        try {
            try {
                new C5751(c6725, C23658.f76648).m16188(this);
                appendable.append(c6725.toString());
                c6725.close();
            } catch (IOException e) {
                throw new C15082(e.getMessage(), (Throwable) e);
            }
        } catch (Throwable th) {
            c6725.close();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final Object m14982(Object obj) {
        Map map;
        C23658 c23658 = C23658.f76648;
        if (obj != null) {
            if (obj instanceof AbstractC5206) {
                return (AbstractC5206) obj;
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
                C21434 c21434 = new C21434(map);
                for (Map.Entry entry : map2.entrySet()) {
                    Object key = entry.getKey();
                    int i = C19426.f62834;
                    c21434.m48549(key == null ? null : key.toString(), m14982(entry.getValue()));
                }
                return c21434;
            }
            if (obj instanceof Collection) {
                Collection collection = (Collection) obj;
                C0972 c0972 = new C0972(collection.size());
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    c0972.add(m14982(it.next()));
                }
                return c0972;
            }
            Class<?> cls = obj.getClass();
            if (cls.isEnum()) {
                return ((Enum) obj).name();
            }
            if (cls.isArray()) {
                int length = Array.getLength(obj);
                C0972 c0973 = new C0972(length);
                for (int i2 = 0; i2 < length; i2++) {
                    c0973.add(m14982(Array.get(obj, i2)));
                }
                return c0973;
            }
            if (C23389.m51835((Class) cls)) {
                return obj;
            }
            InterfaceC16602 interfaceC16602M52187 = c23658.m52187(cls);
            if (interfaceC16602M52187 instanceof C11396) {
                C11396 c11396 = (C11396) interfaceC16602M52187;
                C21434 c21435 = new C21434();
                try {
                    for (Map.Entry entry2 : c11396.m28160(obj).entrySet()) {
                        c21435.m48549((String) entry2.getKey(), m14982(entry2.getValue()));
                    }
                    return c21435;
                } catch (Exception e) {
                    throw new C15082("toJSON error", (Throwable) e);
                }
            }
        }
        return null;
    }
}
