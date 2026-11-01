package p067l;

import bin.p000mt.json.JSONObject;
import bin.p000mt.json.JSONValue;
import bin.p000mt.plus.R;
import com.alipay.sdk.p010m.p049t.AbstractC0213e;
import com.google.android.material.motion.MotionUtils;
import java.io.IOException;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: l.ۢ᩵ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: S77A */
/* JADX INFO: loaded from: classes3.dex */
public final class C11676 {
    /* JADX INFO: renamed from: ۧ */
    public final C10196 m26843(C17571 c17571) {
        if (EnumC6173.GET.equals(c17571.m39993())) {
            String strM42479 = C18658.m42479(c17571, MotionUtils.EASING_TYPE_PATH);
            if (strM42479 != null && !strM42479.isEmpty()) {
                return C5109.m10884(m26840(AbstractC18422.m41972(strM42479)));
            }
            return C5109.m10885(EnumC3490.BAD_REQUEST, C7050.m16203(R.string.MT_Protector, new Object[0]));
        }
        return C5109.m10885(EnumC3490.METHOD_NOT_ALLOWED, C7050.m16203(R.string.MT_Protector, new Object[0]));
    }

    /* JADX INFO: renamed from: ֫ */
    public final C10196 m26842(C17571 c17571) {
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
        if (m26841(jSONObjectM19683, MotionUtils.EASING_TYPE_PATH)) {
            return C5109.m10885(EnumC3490.BAD_REQUEST, C7050.m16203(R.string.MT_Protector, MotionUtils.EASING_TYPE_PATH));
        }
        if (m26841(jSONObjectM19683, "enabled")) {
            return C5109.m10885(EnumC3490.BAD_REQUEST, C7050.m16203(R.string.MT_Protector, "enabled"));
        }
        try {
            JSONValue jSONValue = jSONObjectM19683.get(MotionUtils.EASING_TYPE_PATH);
            if (jSONValue == null || !jSONValue.isString()) {
                throw C8461.m19686((RuntimeException) new IllegalArgumentException("string required"));
            }
            String strAsString = jSONValue.asString();
            if (strAsString.isEmpty()) {
                return C5109.m10885(EnumC3490.BAD_REQUEST, C7050.m16203(R.string.MT_Protector, new Object[0]));
            }
            String strM41972 = AbstractC18422.m41972(strAsString);
            JSONValue jSONValue2 = jSONObjectM19683.get("enabled");
            if (jSONValue2 == null || !jSONValue2.isBoolean()) {
                throw C8461.m19686((RuntimeException) new IllegalArgumentException("boolean required"));
            }
            if (!jSONValue2.asBoolean()) {
                C21272.f66918.remove("local:" + strM41972);
                C21272.m48056();
                return C5109.m10884(m26840(strM41972));
            }
            if (m26841(jSONObjectM19683, AbstractC0213e.f995s)) {
                return C5109.m10885(EnumC3490.BAD_REQUEST, C7050.m16203(R.string.MT_Protector, AbstractC0213e.f995s));
            }
            if (m26841(jSONObjectM19683, "reverse")) {
                return C5109.m10885(EnumC3490.BAD_REQUEST, C7050.m16203(R.string.MT_Protector, "reverse"));
            }
            try {
                JSONValue jSONValue3 = jSONObjectM19683.get(AbstractC0213e.f995s);
                if (jSONValue3 == null || !jSONValue3.isString()) {
                    throw C8461.m19686((RuntimeException) new IllegalArgumentException("string required"));
                }
                String strAsString2 = jSONValue3.asString();
                JSONValue jSONValue4 = jSONObjectM19683.get("reverse");
                if (jSONValue4 == null || !jSONValue4.isBoolean()) {
                    throw C8461.m19686((RuntimeException) new IllegalArgumentException("boolean required"));
                }
                try {
                    C21272.f66918.put(C21466.m48631("local:", strM41972), Integer.valueOf(C9486.m22089(C17709.m40245(strAsString2), jSONValue4.asBoolean())));
                    C21272.m48056();
                    return C5109.m10884(m26840(strM41972));
                } catch (RuntimeException unused2) {
                    return C5109.m10885(EnumC3490.BAD_REQUEST, C7050.m16203(R.string.MT_Protector, AbstractC0213e.f995s));
                }
            } catch (RuntimeException unused3) {
                return C5109.m10885(EnumC3490.BAD_REQUEST, C7050.m16203(R.string.MT_Protector, new Object[0]));
            }
        } catch (RuntimeException unused4) {
            return C5109.m10885(EnumC3490.BAD_REQUEST, C7050.m16203(R.string.MT_Protector, new Object[0]));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static LinkedHashMap m26840(String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(MotionUtils.EASING_TYPE_PATH, str);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        C11005 c11005M40244 = C17709.m40244(str);
        linkedHashMap2.put("enabled", Boolean.valueOf(c11005M40244 != null));
        if (c11005M40244 == null) {
            c11005M40244 = new C11005(0, false);
        }
        int i = c11005M40244.f30475;
        String str2 = "name";
        if (i != 0) {
            if (i == 1) {
                str2 = "date";
            } else if (i == 2) {
                str2 = "size";
            } else if (i == 3) {
                str2 = "type";
            }
        }
        linkedHashMap2.put(AbstractC0213e.f995s, str2);
        linkedHashMap2.put("reverse", Boolean.valueOf(c11005M40244.f30476));
        linkedHashMap.put("folder", linkedHashMap2);
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m26841(JSONObject jSONObject, String str) {
        JSONValue jSONValue = jSONObject.get(str);
        return jSONValue == null || jSONValue.isNull();
    }
}
