package p067l;

import bin.p000mt.json.JSON;
import bin.p000mt.json.JSONArray;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: renamed from: l.ܳۘۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 46YI */
/* JADX INFO: loaded from: classes3.dex */
public final class C15932 {

    /* JADX INFO: renamed from: ֫ */
    public static final C19286[] f46068 = {new C19286("utf-32be-bom", C16412.f48237, new byte[]{0, 0, -2, -1}), new C19286("utf-32le-bom", C16412.f48247, new byte[]{-1, -2, 0, 0}), new C19286("utf-8-bom", C16412.f48248, new byte[]{-17, -69, -65}), new C19286("utf-16be-bom", C16412.f48243, new byte[]{-2, -1}), new C19286("utf-16le-bom", C16412.f48236, new byte[]{-1, -2})};

    /* JADX INFO: renamed from: ۧ */
    public static final List f46069;

    /* JADX INFO: renamed from: ܽ */
    public static final Map f46070;

    static {
        int i = 0;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (i < C16412.f48239) {
            int i2 = C16412.f48234;
            int i3 = i == i2 ? C16412.f48248 : i;
            C15525.putIfAbsent(linkedHashMap, m36052(i3), Integer.valueOf(i3));
            if (i == i2) {
                linkedHashMap.put("utf-8-bom", Integer.valueOf(C16412.f48248));
            } else if (i == C16412.f48243) {
                linkedHashMap.put("utf-16be-bom", Integer.valueOf(i));
            } else if (i == C16412.f48236) {
                linkedHashMap.put("utf-16le-bom", Integer.valueOf(i));
            } else if (i == C16412.f48237) {
                linkedHashMap.put("utf-32be-bom", Integer.valueOf(i));
            } else if (i == C16412.f48247) {
                linkedHashMap.put("utf-32le-bom", Integer.valueOf(i));
            }
            i++;
        }
        f46070 = C21562.unmodifiableMap(linkedHashMap);
        f46069 = C21562.unmodifiableList(new ArrayList(linkedHashMap.keySet()));
    }

    /* JADX INFO: renamed from: ۧ */
    public static C19286 m36057(byte[] bArr) {
        boolean zM29898 = C13061.m29898(bArr.length, bArr);
        C19286[] c19286Arr = f46068;
        if (!zM29898) {
            if (!C13061.m29900(bArr.length, bArr)) {
                if (!C13061.m29899(bArr.length, bArr)) {
                    if (!C13061.m29892(bArr.length, bArr)) {
                        if (C13061.m29896(bArr.length, bArr)) {
                            return c19286Arr[4];
                        }
                        return null;
                    }
                    return c19286Arr[3];
                }
                return c19286Arr[2];
            }
            return c19286Arr[1];
        }
        return c19286Arr[0];
    }

    /* JADX INFO: renamed from: ֫ */
    public static C18615 m36053(String str, byte[] bArr) throws C5276 {
        int iM37296;
        if (str == null) {
            throw m36056((String) null);
        }
        int length = 0;
        if (!str.isEmpty()) {
            if (!str.equals(str.trim())) {
                throw m36056(str);
            }
            Integer num = (Integer) f46070.get(str);
            if (num == null) {
                throw m36056(str);
            }
            C19286 c19286M36057 = m36057(bArr);
            if (c19286M36057 != null && c19286M36057.f57621 == num.intValue()) {
                length = c19286M36057.f57620.length;
            }
            return new C18615(C16412.m37298(num.intValue()), length == 0 ? m36052(num.intValue()) : c19286M36057.f57622, length, length != 0 ? c19286M36057.f57620 : null);
        }
        C19286 c19286M36058 = m36057(bArr);
        if (c19286M36058 != null) {
            Charset charsetM37298 = C16412.m37298(c19286M36058.f57621);
            String str2 = c19286M36058.f57622;
            byte[] bArr2 = c19286M36058.f57620;
            return new C18615(charsetM37298, str2, bArr2.length, bArr2);
        }
        int i = C16412.f48248;
        if (bArr.length > 0) {
            String strM40868 = C17953.m40868(bArr.length, bArr);
            iM37296 = strM40868 == null ? -1 : C16412.m37296(strM40868);
            if (iM37296 == -1) {
                iM37296 = C16412.m37299(bArr.length, bArr);
            }
        } else {
            iM37296 = i;
        }
        if (iM37296 != C16412.f48234) {
            i = iM37296;
        }
        return new C18615(C16412.m37298(i), m36052(i), 0, null);
    }

    /* JADX INFO: renamed from: ܽ */
    public static C18615 m36058(String str) throws C5276 {
        C19286 c19286;
        if (str == null || str.isEmpty() || !str.equals(str.trim())) {
            throw m36056(str);
        }
        Integer num = (Integer) f46070.get(str);
        if (num == null) {
            throw m36056(str);
        }
        C19286[] c19286Arr = f46068;
        int length = c19286Arr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                c19286 = null;
                break;
            }
            c19286 = c19286Arr[i];
            if (c19286.f57622.equals(str)) {
                break;
            }
            i++;
        }
        return new C18615(C16412.m37298(num.intValue()), str, c19286 != null ? c19286.f57620.length : 0, c19286 != null ? c19286.f57620 : null);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C19286 m36054(String str) {
        for (C19286 c19286 : f46068) {
            if (c19286.f57622.equals(str)) {
                return c19286;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m36052(int i) {
        if (i == C16412.f48234) {
            i = C16412.f48248;
        }
        return C16412.m37300(i).toLowerCase(Locale.ROOT).replace('_', '-');
    }

    /* JADX INFO: renamed from: ۧ */
    public static C5276 m36056(String str) {
        JSONArray jSONArrayArray = JSON.array();
        Iterator it = f46069.iterator();
        while (it.hasNext()) {
            jSONArrayArray.add((String) it.next());
        }
        return C5276.m11406("Unsupported text encoding token", "encoding", str == null ? JSON.NULL : JSON.value(str), jSONArrayArray, JSON.object().add("encoding", "utf-8"));
    }
}
