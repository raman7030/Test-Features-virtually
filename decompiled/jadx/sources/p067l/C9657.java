package p067l;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: l.۟᩵ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: R9OP */
/* JADX INFO: loaded from: classes3.dex */
public final class C9657 extends LinkedHashMap {

    /* JADX INFO: renamed from: ᩹ */
    public static final C9657 f26588;

    /* JADX INFO: renamed from: ᩸ */
    public boolean f26589 = true;

    static {
        C9657 c9657 = new C9657();
        f26588 = c9657;
        c9657.f26589 = false;
    }

    /* JADX INFO: renamed from: ᩷ */
    public static C9657 m22468() {
        return f26588;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m22469(C9657 c9657) {
        m22466();
        if (c9657.isEmpty()) {
            return;
        }
        putAll(c9657);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return isEmpty() ? Collections.EMPTY_SET : super.entrySet();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        m22466();
        super.clear();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        m22466();
        byte[] bArr = C15671.f44805;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        m22466();
        for (Object obj : map.keySet()) {
            byte[] bArr = C15671.f44805;
            obj.getClass();
            map.get(obj).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        m22466();
        return super.remove(obj);
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m22465(Map map, Map map2) {
        boolean zEquals;
        if (map == map2) {
            return true;
        }
        if (map.size() != map2.size()) {
            return false;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (!map2.containsKey(entry.getKey())) {
                return false;
            }
            Object value = entry.getValue();
            Object obj = map2.get(entry.getKey());
            if ((value instanceof byte[]) && (obj instanceof byte[])) {
                zEquals = Arrays.equals((byte[]) value, (byte[]) obj);
            } else {
                zEquals = value.equals(obj);
            }
            if (!zEquals) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        return (obj instanceof Map) && m22465(this, (Map) obj);
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m22463(Object obj) {
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length;
            byte[] bArr2 = C15671.f44805;
            int i = length;
            for (byte b : bArr) {
                i = (i * 31) + b;
            }
            if (i == 0) {
                return 1;
            }
            return i;
        }
        if (obj instanceof InterfaceC5614) {
            throw new UnsupportedOperationException();
        }
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m22464(Map map) {
        int iM22463 = 0;
        for (Map.Entry entry : map.entrySet()) {
            iM22463 += m22463(entry.getValue()) ^ m22463(entry.getKey());
        }
        return iM22463;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return m22464((Map) this);
    }

    /* JADX INFO: renamed from: ۧ */
    public static LinkedHashMap m22467(Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(((map.size() * 4) / 3) + 1);
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr = (byte[]) value;
                value = Arrays.copyOf(bArr, bArr.length);
            }
            linkedHashMap.put(key, value);
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: ܿ */
    public final C9657 m22472() {
        if (isEmpty()) {
            return new C9657();
        }
        C9657 c9657 = new C9657(this);
        c9657.f26589 = true;
        return c9657;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m22471() {
        this.f26589 = false;
    }

    /* JADX INFO: renamed from: ۢ */
    private void m22466() {
        if (!this.f26589) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m22470() {
        return this.f26589;
    }
}
