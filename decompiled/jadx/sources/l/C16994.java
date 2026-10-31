package l;

import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import bin.mt.plus.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import org.bouncycastle.i18n.TextBundle;

/* JADX INFO: renamed from: l.ܿ֡ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3786 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16994 {
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C8236 m39835(C15996 c15996) {
        if (EnumC4003.GET.equals(c15996.m37807())) {
            return C2884.m8817(m39830());
        }
        return C2884.m8818(EnumC1180.METHOD_NOT_ALLOWED, C4925.m14306(R.string.MT_Protector, new Object[0]));
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C8236 m39834(C15996 c15996) {
        JSONObject jSONObjectM17736;
        if (!EnumC4003.POST.equals(c15996.m37807())) {
            return C2884.m8818(EnumC1180.METHOD_NOT_ALLOWED, C4925.m14306(R.string.MT_Protector, new Object[0]));
        }
        try {
            jSONObjectM17736 = C6411.m17736(c15996);
        } catch (IOException | RuntimeException | C15290 unused) {
            jSONObjectM17736 = null;
        }
        if (jSONObjectM17736 == null) {
            return C2884.m8818(EnumC1180.BAD_REQUEST, C4925.m14306(R.string.MT_Protector, new Object[0]));
        }
        if (m39831(jSONObjectM17736, "showSystemHiddenFiles")) {
            return C2884.m8818(EnumC1180.BAD_REQUEST, C4925.m14306(R.string.MT_Protector, "showSystemHiddenFiles"));
        }
        if (m39831(jSONObjectM17736, "showManuallyHiddenFiles")) {
            return C2884.m8818(EnumC1180.BAD_REQUEST, C4925.m14306(R.string.MT_Protector, "showManuallyHiddenFiles"));
        }
        try {
            JSONValue jSONValue = jSONObjectM17736.get("showSystemHiddenFiles");
            if (jSONValue == null || !jSONValue.isBoolean()) {
                throw C6411.m17739((RuntimeException) new IllegalArgumentException("boolean required"));
            }
            boolean zAsBoolean = jSONValue.asBoolean();
            JSONValue jSONValue2 = jSONObjectM17736.get("showManuallyHiddenFiles");
            if (jSONValue2 == null || !jSONValue2.isBoolean()) {
                throw C6411.m17739((RuntimeException) new IllegalArgumentException("boolean required"));
            }
            boolean zAsBoolean2 = jSONValue2.asBoolean();
            if (C17315.m40631() != zAsBoolean) {
                C17315.m40628(zAsBoolean);
            }
            if (C17315.m40629() != zAsBoolean2) {
                C17315.m40625(zAsBoolean2);
            }
            return C2884.m8817(m39830());
        } catch (RuntimeException unused2) {
            return C2884.m8818(EnumC1180.BAD_REQUEST, C4925.m14306(R.string.MT_Protector, new Object[0]));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C8236 m39832(C15996 c15996) {
        JSONObject jSONObjectM17736;
        if (!EnumC4003.POST.equals(c15996.m37807())) {
            return C2884.m8818(EnumC1180.METHOD_NOT_ALLOWED, C4925.m14306(R.string.MT_Protector, new Object[0]));
        }
        try {
            jSONObjectM17736 = C6411.m17736(c15996);
        } catch (IOException | RuntimeException | C15290 unused) {
            jSONObjectM17736 = null;
        }
        if (jSONObjectM17736 == null) {
            return C2884.m8818(EnumC1180.BAD_REQUEST, C4925.m14306(R.string.MT_Protector, new Object[0]));
        }
        if (m39831(jSONObjectM17736, "paths")) {
            return C2884.m8818(EnumC1180.BAD_REQUEST, C4925.m14306(R.string.MT_Protector, "paths"));
        }
        try {
            C17315.m40624(m39829(jSONObjectM17736.get("paths")));
            return C2884.m8817(m39830());
        } catch (RuntimeException unused2) {
            return C2884.m8818(EnumC1180.BAD_REQUEST, C4925.m14306(R.string.MT_Protector, new Object[0]));
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C8236 m39833(C15996 c15996) {
        JSONObject jSONObjectM17736;
        if (!EnumC4003.POST.equals(c15996.m37807())) {
            return C2884.m8818(EnumC1180.METHOD_NOT_ALLOWED, C4925.m14306(R.string.MT_Protector, new Object[0]));
        }
        try {
            jSONObjectM17736 = C6411.m17736(c15996);
        } catch (IOException | RuntimeException | C15290 unused) {
            jSONObjectM17736 = null;
        }
        if (jSONObjectM17736 == null) {
            return C2884.m8818(EnumC1180.BAD_REQUEST, C4925.m14306(R.string.MT_Protector, new Object[0]));
        }
        if (m39831(jSONObjectM17736, TextBundle.TEXT_ENTRY)) {
            return C2884.m8818(EnumC1180.BAD_REQUEST, C4925.m14306(R.string.MT_Protector, TextBundle.TEXT_ENTRY));
        }
        try {
            JSONValue jSONValue = jSONObjectM17736.get(TextBundle.TEXT_ENTRY);
            if (jSONValue == null || !jSONValue.isString()) {
                throw C6411.m17739((RuntimeException) new IllegalArgumentException("string required"));
            }
            C17315.m40634(jSONValue.asString());
            return C2884.m8817(m39830());
        } catch (RuntimeException unused2) {
            return C2884.m8818(EnumC1180.BAD_REQUEST, C4925.m14306(R.string.MT_Protector, new Object[0]));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static LinkedHashMap m39830() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("showSystemHiddenFiles", Boolean.valueOf(C17315.m40631()));
        linkedHashMap.put("showManuallyHiddenFiles", Boolean.valueOf(C17315.m40629()));
        linkedHashMap.put("manuallyHiddenFilesText", C17315.m40621());
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m39831(JSONObject jSONObject, String str) {
        JSONValue jSONValue = jSONObject.get(str);
        return jSONValue == null || jSONValue.isNull();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m39829(JSONValue jSONValue) {
        if (jSONValue == null || !jSONValue.isArray()) {
            throw C6411.m17739((RuntimeException) new IllegalArgumentException("array required"));
        }
        JSONArray jSONArrayAsArray = jSONValue.asArray();
        ArrayList arrayList = new ArrayList(jSONArrayAsArray.size());
        for (int i = 0; i < jSONArrayAsArray.size(); i++) {
            JSONValue jSONValue2 = jSONArrayAsArray.get(i);
            if (jSONValue2 == null || !jSONValue2.isString()) {
                throw C6411.m17739((RuntimeException) new IllegalArgumentException("path string required"));
            }
            String strAsString = jSONValue2.asString();
            if (strAsString.isEmpty() || !strAsString.startsWith("/")) {
                throw C6411.m17739((RuntimeException) new IllegalArgumentException("absolute path required"));
            }
            arrayList.add(strAsString);
        }
        return arrayList;
    }
}
