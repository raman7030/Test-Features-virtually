package l;

import bin.mt.json.JSONObject;
import bin.mt.plus.R;
import java.io.IOException;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ᩳ᩵ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 07BN */
/* JADX INFO: loaded from: classes4.dex */
public final class C18259 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C8236 m42595(C15996 c15996) {
        boolean zMo23546;
        int i = 0;
        if (!EnumC4003.POST.equals(c15996.m37807())) {
            return C2884.m8818(EnumC1180.METHOD_NOT_ALLOWED, C4925.m14306(R.string.MT_Protector, new Object[0]));
        }
        try {
            C16847 c16847M42594 = m42594(c15996);
            if (c16847M42594.f51710 == null || c16847M42594.f51710.isEmpty()) {
                return C2884.m8818(EnumC1180.BAD_REQUEST, C4925.m14306(R.string.MT_Protector, "targetPath"));
            }
            if (c16847M42594.f51709 == null || c16847M42594.f51709.isEmpty()) {
                return C2884.m8818(EnumC1180.BAD_REQUEST, C4925.m14306(R.string.MT_Protector, "name"));
            }
            if (c16847M42594.f51708 == null) {
                return C2884.m8818(EnumC1180.BAD_REQUEST, C4925.m14306(R.string.MT_Protector, "isDirectory"));
            }
            if (c16847M42594.f51709.contains("\\") || "/".equals(c16847M42594.f51709)) {
                return C2884.m8818(EnumC1180.BAD_REQUEST, C4925.m14327(R.string.MT_Protector));
            }
            String strM39731 = AbstractC16891.m39731(c16847M42594.f51710);
            try {
                C17721.m41503(strM39731, EnumC16309.MODIFY_DIRECTORY_LINKED);
                AbstractC15440 abstractC15440M39866 = c16847M42594.f51709.startsWith("/") ? C16999.m39866(c16847M42594.f51709, new String[0]) : C16999.m39866(strM39731, c16847M42594.f51709);
                if (abstractC15440M39866.mo23120()) {
                    return C2884.m8818(EnumC1180.CONFLICT, C4925.m14327(abstractC15440M39866.mo23113() ? R.string.MT_Protector : R.string.MT_Protector));
                }
                if (c16847M42594.f51708.booleanValue()) {
                    zMo23546 = abstractC15440M39866.mo23546();
                } else {
                    AbstractC15440 abstractC15440M36536 = abstractC15440M39866.m36536();
                    zMo23546 = (abstractC15440M36536 == null || abstractC15440M36536.mo23120() || abstractC15440M36536.mo23546()) && abstractC15440M39866.mo23545();
                }
                if (!zMo23546) {
                    RunnableC15608 runnableC15608 = new RunnableC15608(0);
                    if (C10975.m27285()) {
                        C15528.m36596();
                    } else {
                        C4925.m14315(runnableC15608);
                    }
                    return C2884.m8818(EnumC1180.INTERNAL_ERROR, C4925.m14306(c16847M42594.f51708.booleanValue() ? R.string.MT_Protector : R.string.MT_Protector, c16847M42594.f51709));
                }
                RunnableC9940 runnableC9940 = new RunnableC9940(i, abstractC15440M39866);
                if (C10975.m27285()) {
                    runnableC9940.run();
                } else {
                    C4925.m14315(runnableC9940);
                }
                HashMap map = new HashMap();
                map.put("item", C21082.m47981(new C9555(abstractC15440M39866)));
                map.put("parentPath", abstractC15440M39866.getParent());
                return C2884.m8817(map);
            } catch (C1637 e) {
                return C2884.m8818(EnumC1180.CONFLICT, e.getMessage());
            }
        } catch (IOException | RuntimeException | C15290 unused) {
            return C2884.m8818(EnumC1180.BAD_REQUEST, C4925.m14306(R.string.MT_Protector, new Object[0]));
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C16847 m42594(C15996 c15996) {
        JSONObject jSONObjectM17736 = C6411.m17736(c15996);
        C16847 c16847 = new C16847();
        c16847.f51710 = C6411.m17742(jSONObjectM17736, "targetPath");
        c16847.f51709 = C6411.m17742(jSONObjectM17736, "name");
        c16847.f51708 = (jSONObjectM17736.get("isDirectory") == null || jSONObjectM17736.get("isDirectory").isNull()) ? null : Boolean.valueOf(C6411.m17740(jSONObjectM17736, "isDirectory"));
        return c16847;
    }
}
