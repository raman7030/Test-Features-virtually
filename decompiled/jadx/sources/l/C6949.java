package l;

import bin.mt.json.JSONObject;
import bin.mt.plus.R;
import com.umeng.analytics.pro.d;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: l.ۜᩴۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: R7AS */
/* JADX INFO: loaded from: classes2.dex */
public final class C6949 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C23176 f21424;

    public C6949(C2884 c2884, C23176 c23176, C11183 c11183) {
        this.f21424 = c23176;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C8236 m18773(C15996 c15996) {
        if (!EnumC4003.GET.equals(c15996.m37807())) {
            return m18770(c15996, EnumC1180.METHOD_NOT_ALLOWED, R.string.MT_Protector, new Object[0]);
        }
        return C2884.m8817(this.f21424.m51394());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C8236 m18771(C15996 c15996) {
        String strM40231;
        if (!EnumC4003.POST.equals(c15996.m37807())) {
            return m18770(c15996, EnumC1180.METHOD_NOT_ALLOWED, R.string.MT_Protector, new Object[0]);
        }
        C23176 c23176 = this.f21424;
        C10477 c10477M51403 = c23176.m51403(c15996);
        if (c10477M51403 != null) {
            return m18770(c15996, EnumC1180.UNAUTHORIZED, c10477M51403.f31440, c10477M51403.f31438);
        }
        if (!C17140.m40235(c15996) && (strM40231 = C17140.m40231(c15996, "content-length")) != null) {
            String strTrim = strM40231.trim();
            if (!strTrim.isEmpty()) {
                for (int i = 0; i < strTrim.length(); i++) {
                    char cCharAt = strTrim.charAt(i);
                    if (cCharAt >= '0' && cCharAt <= '9') {
                    }
                }
                try {
                    if (Long.parseLong(strTrim) <= 8192) {
                        try {
                            C10477 c10477M51391 = c23176.m51391(c15996, C17140.m40239(c15996));
                            Object[] objArr = c10477M51391.f31438;
                            int i2 = c10477M51391.f31440;
                            String str = c10477M51391.f31437;
                            if (!c10477M51391.f31439) {
                                if (str.isEmpty()) {
                                    return C2884.m8818(EnumC1180.UNAUTHORIZED, C4925.m14306(i2, objArr));
                                }
                                return AbstractC4708.m13784(EnumC1180.UNAUTHORIZED, "application/json", new JSONObject().add(d.O, C4925.m14306(i2, objArr)).add("code", str).toString());
                            }
                            return C2884.m8817(Collections.singletonMap("deviceId", c10477M51391.f31436));
                        } catch (IOException | C15290 unused) {
                            c23176.m51401(c15996);
                            return m18770(c15996, EnumC1180.BAD_REQUEST, R.string.MT_Protector, new Object[0]);
                        }
                    }
                } catch (NumberFormatException unused2) {
                }
            }
        }
        c23176.m51401(c15996);
        return m18770(c15996, EnumC1180.BAD_REQUEST, R.string.MT_Protector, new Object[0]);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C8236 m18770(C15996 c15996, EnumC1180 enumC1180, int i, Object... objArr) {
        C8236 c8236M8818 = C2884.m8818(enumC1180, C4925.m14306(i, objArr));
        if (C17140.m40237(c15996)) {
            c8236M8818.m21803();
        }
        return c8236M8818;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C8236 m18776(C15996 c15996, C15414 c15414) {
        if (!EnumC4003.GET.equals(c15996.m37807())) {
            return C2884.m8818(EnumC1180.METHOD_NOT_ALLOWED, C4925.m14306(R.string.MT_Protector, new Object[0]));
        }
        return C2884.m8817(this.f21424.m51388(c15414));
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C8236 m18775(C15996 c15996, C15414 c15414) {
        if (!EnumC4003.DELETE.equals(c15996.m37807())) {
            return C2884.m8818(EnumC1180.METHOD_NOT_ALLOWED, C4925.m14306(R.string.MT_Protector, new Object[0]));
        }
        String strM40234 = C17140.m40234(c15996, "deviceId");
        if (strM40234 == null || strM40234.isEmpty()) {
            return C2884.m8818(EnumC1180.BAD_REQUEST, C4925.m14306(R.string.MT_Protector, "deviceId"));
        }
        return C2884.m8817(Collections.singletonMap("deleted", Boolean.valueOf(this.f21424.m51397(c15414, strM40234))));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C8236 m18774(C15996 c15996, C15414 c15414) {
        EnumC1180 enumC1180;
        String strM14306;
        if (!EnumC4003.POST.equals(c15996.m37807())) {
            enumC1180 = EnumC1180.METHOD_NOT_ALLOWED;
            strM14306 = C4925.m14306(R.string.MT_Protector, new Object[0]);
        } else {
            try {
                LinkedHashMap linkedHashMapM51389 = this.f21424.m51389(c15414, C17140.m40239(c15996));
                if (linkedHashMapM51389 == null) {
                    enumC1180 = EnumC1180.BAD_REQUEST;
                    strM14306 = C4925.m14306(R.string.MT_Protector, new Object[0]);
                } else {
                    return C2884.m8817(linkedHashMapM51389);
                }
            } catch (IOException | C15290 unused) {
                enumC1180 = EnumC1180.BAD_REQUEST;
                strM14306 = C4925.m14306(R.string.MT_Protector, new Object[0]);
            }
        }
        return C2884.m8818(enumC1180, strM14306);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C8236 m18772(C15996 c15996, C15414 c15414) {
        EnumC1180 enumC1180;
        String strM14306;
        if (!EnumC4003.POST.equals(c15996.m37807())) {
            enumC1180 = EnumC1180.METHOD_NOT_ALLOWED;
            strM14306 = C4925.m14306(R.string.MT_Protector, new Object[0]);
        } else {
            try {
                LinkedHashMap linkedHashMapM51390 = this.f21424.m51390(c15414, C11183.m27733(C17140.m40239(c15996)));
                if (linkedHashMapM51390 == null) {
                    return C2884.m8818(EnumC1180.BAD_REQUEST, C4925.m14306(R.string.MT_Protector, new Object[0]));
                }
                return C2884.m8817(linkedHashMapM51390);
            } catch (IOException | C15290 | C22743 unused) {
                enumC1180 = EnumC1180.BAD_REQUEST;
                strM14306 = C4925.m14306(R.string.MT_Protector, new Object[0]);
            }
        }
        return C2884.m8818(enumC1180, strM14306);
    }
}
