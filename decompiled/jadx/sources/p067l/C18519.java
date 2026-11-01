package p067l;

import bin.p000mt.json.JSONArray;
import bin.p000mt.json.JSONObject;
import bin.p000mt.json.JSONValue;
import bin.p000mt.plus.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import org.bouncycastle.i18n.TextBundle;

/* JADX INFO: renamed from: l.ܿ֡ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3786 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18519 {
    /* JADX INFO: renamed from: ᩳ */
    public final C10196 m42078(C17571 c17571) {
        if (EnumC6173.GET.equals(c17571.m39993())) {
            return C5109.m10884(m42073());
        }
        return C5109.m10885(EnumC3490.METHOD_NOT_ALLOWED, C7050.m16203(R.string.MT_Protector, new Object[0]));
    }

    /* JADX INFO: renamed from: ܽ */
    public final C10196 m42077(C17571 c17571) {
        JSONObject jSONObjectM19683;
        if (!EnumC6173.POST.equals(c17571.m39993())) {
            return C5109.m10885(EnumC3490.METHOD_NOT_ALLOWED, C7050.m16203(R.string.MT_Protector, new Object[0]));
        }
        try {
            jSONObjectM19683 = C8461.m19683(c17571);
        } catch (IOException | RuntimeException | C16900 unused) {
            jSONObjectM19683 = null;
        }
        if (jSONObjectM19683 == null) {
            return C5109.m10885(EnumC3490.BAD_REQUEST, C7050.m16203(R.string.MT_Protector, new Object[0]));
        }
        if (m42074(jSONObjectM19683, "showSystemHiddenFiles")) {
            return C5109.m10885(EnumC3490.BAD_REQUEST, C7050.m16203(R.string.MT_Protector, "showSystemHiddenFiles"));
        }
        if (m42074(jSONObjectM19683, "showManuallyHiddenFiles")) {
            return C5109.m10885(EnumC3490.BAD_REQUEST, C7050.m16203(R.string.MT_Protector, "showManuallyHiddenFiles"));
        }
        try {
            JSONValue jSONValue = jSONObjectM19683.get("showSystemHiddenFiles");
            if (jSONValue == null || !jSONValue.isBoolean()) {
                throw C8461.m19686((RuntimeException) new IllegalArgumentException("boolean required"));
            }
            boolean zAsBoolean = jSONValue.asBoolean();
            JSONValue jSONValue2 = jSONObjectM19683.get("showManuallyHiddenFiles");
            if (jSONValue2 == null || !jSONValue2.isBoolean()) {
                throw C8461.m19686((RuntimeException) new IllegalArgumentException("boolean required"));
            }
            boolean zAsBoolean2 = jSONValue2.asBoolean();
            if (C18825.m42882() != zAsBoolean) {
                C18825.m42879(zAsBoolean);
            }
            if (C18825.m42880() != zAsBoolean2) {
                C18825.m42876(zAsBoolean2);
            }
            return C5109.m10884(m42073());
        } catch (RuntimeException unused2) {
            return C5109.m10885(EnumC3490.BAD_REQUEST, C7050.m16203(R.string.MT_Protector, new Object[0]));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C10196 m42075(C17571 c17571) {
        JSONObject jSONObjectM19683;
        if (!EnumC6173.POST.equals(c17571.m39993())) {
            return C5109.m10885(EnumC3490.METHOD_NOT_ALLOWED, C7050.m16203(R.string.MT_Protector, new Object[0]));
        }
        try {
            jSONObjectM19683 = C8461.m19683(c17571);
        } catch (IOException | RuntimeException | C16900 unused) {
            jSONObjectM19683 = null;
        }
        if (jSONObjectM19683 == null) {
            return C5109.m10885(EnumC3490.BAD_REQUEST, C7050.m16203(R.string.MT_Protector, new Object[0]));
        }
        if (m42074(jSONObjectM19683, "paths")) {
            return C5109.m10885(EnumC3490.BAD_REQUEST, C7050.m16203(R.string.MT_Protector, "paths"));
        }
        try {
            C18825.m42875(m42072(jSONObjectM19683.get("paths")));
            return C5109.m10884(m42073());
        } catch (RuntimeException unused2) {
            return C5109.m10885(EnumC3490.BAD_REQUEST, C7050.m16203(R.string.MT_Protector, new Object[0]));
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final C10196 m42076(C17571 c17571) {
        JSONObject jSONObjectM19683;
        if (!EnumC6173.POST.equals(c17571.m39993())) {
            return C5109.m10885(EnumC3490.METHOD_NOT_ALLOWED, C7050.m16203(R.string.MT_Protector, new Object[0]));
        }
        try {
            jSONObjectM19683 = C8461.m19683(c17571);
        } catch (IOException | RuntimeException | C16900 unused) {
            jSONObjectM19683 = null;
        }
        if (jSONObjectM19683 == null) {
            return C5109.m10885(EnumC3490.BAD_REQUEST, C7050.m16203(R.string.MT_Protector, new Object[0]));
        }
        if (m42074(jSONObjectM19683, TextBundle.TEXT_ENTRY)) {
            return C5109.m10885(EnumC3490.BAD_REQUEST, C7050.m16203(R.string.MT_Protector, TextBundle.TEXT_ENTRY));
        }
        try {
            JSONValue jSONValue = jSONObjectM19683.get(TextBundle.TEXT_ENTRY);
            if (jSONValue == null || !jSONValue.isString()) {
                throw C8461.m19686((RuntimeException) new IllegalArgumentException("string required"));
            }
            C18825.m42885(jSONValue.asString());
            return C5109.m10884(m42073());
        } catch (RuntimeException unused2) {
            return C5109.m10885(EnumC3490.BAD_REQUEST, C7050.m16203(R.string.MT_Protector, new Object[0]));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static LinkedHashMap m42073() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("showSystemHiddenFiles", Boolean.valueOf(C18825.m42882()));
        linkedHashMap.put("showManuallyHiddenFiles", Boolean.valueOf(C18825.m42880()));
        linkedHashMap.put("manuallyHiddenFilesText", C18825.m42872());
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m42074(JSONObject jSONObject, String str) {
        JSONValue jSONValue = jSONObject.get(str);
        return jSONValue == null || jSONValue.isNull();
    }

    /* JADX INFO: renamed from: ֫ */
    public static ArrayList m42072(JSONValue jSONValue) {
        if (jSONValue == null || !jSONValue.isArray()) {
            throw C8461.m19686((RuntimeException) new IllegalArgumentException("array required"));
        }
        JSONArray jSONArrayAsArray = jSONValue.asArray();
        ArrayList arrayList = new ArrayList(jSONArrayAsArray.size());
        for (int i = 0; i < jSONArrayAsArray.size(); i++) {
            JSONValue jSONValue2 = jSONArrayAsArray.get(i);
            if (jSONValue2 == null || !jSONValue2.isString()) {
                throw C8461.m19686((RuntimeException) new IllegalArgumentException("path string required"));
            }
            String strAsString = jSONValue2.asString();
            if (strAsString.isEmpty() || !strAsString.startsWith("/")) {
                throw C8461.m19686((RuntimeException) new IllegalArgumentException("absolute path required"));
            }
            arrayList.add(strAsString);
        }
        return arrayList;
    }
}
