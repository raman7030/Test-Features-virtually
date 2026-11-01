package p067l;

import bin.p000mt.json.JSONObject;
import bin.p000mt.plus.R;
import com.umeng.analytics.pro.C0708d;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: l.ۜᩴۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: R7AS */
/* JADX INFO: loaded from: classes2.dex */
public final class C8973 {

    /* JADX INFO: renamed from: ֫ */
    public final C24395 f24306;

    public C8973(C5109 c5109, C24395 c24395, C12997 c12997) {
        this.f24306 = c24395;
    }

    /* JADX INFO: renamed from: ۧ */
    public final C10196 m20727(C17571 c17571) {
        if (!EnumC6173.GET.equals(c17571.m39993())) {
            return m20724(c17571, EnumC3490.METHOD_NOT_ALLOWED, R.string.MT_Protector, new Object[0]);
        }
        return C5109.m10884(this.f24306.m53790());
    }

    /* JADX INFO: renamed from: ֫ */
    public final C10196 m20725(C17571 c17571) {
        String strM42476;
        if (!EnumC6173.POST.equals(c17571.m39993())) {
            return m20724(c17571, EnumC3490.METHOD_NOT_ALLOWED, R.string.MT_Protector, new Object[0]);
        }
        C24395 c24395 = this.f24306;
        C12326 c12326M53799 = c24395.m53799(c17571);
        if (c12326M53799 != null) {
            return m20724(c17571, EnumC3490.UNAUTHORIZED, c12326M53799.f34404, c12326M53799.f34402);
        }
        if (!C18658.m42480(c17571) && (strM42476 = C18658.m42476(c17571, "content-length")) != null) {
            String strTrim = strM42476.trim();
            if (!strTrim.isEmpty()) {
                for (int i = 0; i < strTrim.length(); i++) {
                    char cCharAt = strTrim.charAt(i);
                    if (cCharAt >= '0' && cCharAt <= '9') {
                    }
                }
                try {
                    if (Long.parseLong(strTrim) <= 8192) {
                        try {
                            C12326 c12326M53787 = c24395.m53787(c17571, C18658.m42484(c17571));
                            Object[] objArr = c12326M53787.f34402;
                            int i2 = c12326M53787.f34404;
                            String str = c12326M53787.f34401;
                            if (!c12326M53787.f34403) {
                                if (str.isEmpty()) {
                                    return C5109.m10885(EnumC3490.UNAUTHORIZED, C7050.m16203(i2, objArr));
                                }
                                return AbstractC6843.m15660(EnumC3490.UNAUTHORIZED, "application/json", new JSONObject().add(C0708d.f2599O, C7050.m16203(i2, objArr)).add("code", str).toString());
                            }
                            return C5109.m10884(Collections.singletonMap("deviceId", c12326M53787.f34400));
                        } catch (IOException | C16900 unused) {
                            c24395.m53797(c17571);
                            return m20724(c17571, EnumC3490.BAD_REQUEST, R.string.MT_Protector, new Object[0]);
                        }
                    }
                } catch (NumberFormatException unused2) {
                }
            }
        }
        c24395.m53797(c17571);
        return m20724(c17571, EnumC3490.BAD_REQUEST, R.string.MT_Protector, new Object[0]);
    }

    /* JADX INFO: renamed from: ֫ */
    private C10196 m20724(C17571 c17571, EnumC3490 enumC3490, int i, Object... objArr) {
        C10196 c10196M10885 = C5109.m10885(enumC3490, C7050.m16203(i, objArr));
        if (C18658.m42482(c17571)) {
            c10196M10885.m23772();
        }
        return c10196M10885;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final C10196 m20730(C17571 c17571, C17018 c17018) {
        if (!EnumC6173.GET.equals(c17571.m39993())) {
            return C5109.m10885(EnumC3490.METHOD_NOT_ALLOWED, C7050.m16203(R.string.MT_Protector, new Object[0]));
        }
        return C5109.m10884(this.f24306.m53784(c17018));
    }

    /* JADX INFO: renamed from: ܽ */
    public final C10196 m20729(C17571 c17571, C17018 c17018) {
        if (!EnumC6173.DELETE.equals(c17571.m39993())) {
            return C5109.m10885(EnumC3490.METHOD_NOT_ALLOWED, C7050.m16203(R.string.MT_Protector, new Object[0]));
        }
        String strM42479 = C18658.m42479(c17571, "deviceId");
        if (strM42479 == null || strM42479.isEmpty()) {
            return C5109.m10885(EnumC3490.BAD_REQUEST, C7050.m16203(R.string.MT_Protector, "deviceId"));
        }
        return C5109.m10884(Collections.singletonMap("deleted", Boolean.valueOf(this.f24306.m53793(c17018, strM42479))));
    }

    /* JADX INFO: renamed from: ۧ */
    public final C10196 m20728(C17571 c17571, C17018 c17018) {
        EnumC3490 enumC3490;
        String strM16203;
        if (!EnumC6173.POST.equals(c17571.m39993())) {
            enumC3490 = EnumC3490.METHOD_NOT_ALLOWED;
            strM16203 = C7050.m16203(R.string.MT_Protector, new Object[0]);
        } else {
            try {
                LinkedHashMap linkedHashMapM53785 = this.f24306.m53785(c17018, C18658.m42484(c17571));
                if (linkedHashMapM53785 == null) {
                    enumC3490 = EnumC3490.BAD_REQUEST;
                    strM16203 = C7050.m16203(R.string.MT_Protector, new Object[0]);
                } else {
                    return C5109.m10884(linkedHashMapM53785);
                }
            } catch (IOException | C16900 unused) {
                enumC3490 = EnumC3490.BAD_REQUEST;
                strM16203 = C7050.m16203(R.string.MT_Protector, new Object[0]);
            }
        }
        return C5109.m10885(enumC3490, strM16203);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C10196 m20726(C17571 c17571, C17018 c17018) {
        EnumC3490 enumC3490;
        String strM16203;
        if (!EnumC6173.POST.equals(c17571.m39993())) {
            enumC3490 = EnumC3490.METHOD_NOT_ALLOWED;
            strM16203 = C7050.m16203(R.string.MT_Protector, new Object[0]);
        } else {
            try {
                LinkedHashMap linkedHashMapM53786 = this.f24306.m53786(c17018, C12997.m29795(C18658.m42484(c17571)));
                if (linkedHashMapM53786 == null) {
                    return C5109.m10885(EnumC3490.BAD_REQUEST, C7050.m16203(R.string.MT_Protector, new Object[0]));
                }
                return C5109.m10884(linkedHashMapM53786);
            } catch (IOException | C16900 | C23983 unused) {
                enumC3490 = EnumC3490.BAD_REQUEST;
                strM16203 = C7050.m16203(R.string.MT_Protector, new Object[0]);
            }
        }
        return C5109.m10885(enumC3490, strM16203);
    }
}
