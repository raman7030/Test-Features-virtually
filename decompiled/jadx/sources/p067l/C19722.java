package p067l;

import bin.p000mt.json.JSONObject;
import bin.p000mt.plus.R;
import java.io.IOException;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ᩳ᩵ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 07BN */
/* JADX INFO: loaded from: classes4.dex */
public final class C19722 {
    /* JADX INFO: renamed from: ֫ */
    public final C10196 m44854(C17571 c17571) {
        boolean zMo25497;
        int i = 0;
        if (!EnumC6173.POST.equals(c17571.m39993())) {
            return C5109.m10885(EnumC3490.METHOD_NOT_ALLOWED, C7050.m16203(R.string.MT_Protector, new Object[0]));
        }
        try {
            C18380 c18380M44853 = m44853(c17571);
            if (c18380M44853.f54890 == null || c18380M44853.f54890.isEmpty()) {
                return C5109.m10885(EnumC3490.BAD_REQUEST, C7050.m16203(R.string.MT_Protector, "targetPath"));
            }
            if (c18380M44853.f54889 == null || c18380M44853.f54889.isEmpty()) {
                return C5109.m10885(EnumC3490.BAD_REQUEST, C7050.m16203(R.string.MT_Protector, "name"));
            }
            if (c18380M44853.f54888 == null) {
                return C5109.m10885(EnumC3490.BAD_REQUEST, C7050.m16203(R.string.MT_Protector, "isDirectory"));
            }
            if (c18380M44853.f54889.contains("\\") || "/".equals(c18380M44853.f54889)) {
                return C5109.m10885(EnumC3490.BAD_REQUEST, C7050.m16224(R.string.MT_Protector));
            }
            String strM41972 = AbstractC18422.m41972(c18380M44853.f54890);
            try {
                C19210.m43749(strM41972, EnumC17868.MODIFY_DIRECTORY_LINKED);
                AbstractC17043 abstractC17043M42109 = c18380M44853.f54889.startsWith("/") ? C18524.m42109(c18380M44853.f54889, new String[0]) : C18524.m42109(strM41972, c18380M44853.f54889);
                if (abstractC17043M42109.mo25094()) {
                    return C5109.m10885(EnumC3490.CONFLICT, C7050.m16224(abstractC17043M42109.mo25087() ? R.string.MT_Protector : R.string.MT_Protector));
                }
                if (c18380M44853.f54888.booleanValue()) {
                    zMo25497 = abstractC17043M42109.mo25497();
                } else {
                    AbstractC17043 abstractC17043M38694 = abstractC17043M42109.m38694();
                    zMo25497 = (abstractC17043M38694 == null || abstractC17043M38694.mo25094() || abstractC17043M38694.mo25497()) && abstractC17043M42109.mo25496();
                }
                if (!zMo25497) {
                    RunnableC17202 runnableC17202 = new RunnableC17202(0);
                    if (C12799.m29347()) {
                        C17127.m38756();
                    } else {
                        C7050.m16212(runnableC17202);
                    }
                    return C5109.m10885(EnumC3490.INTERNAL_ERROR, C7050.m16203(c18380M44853.f54888.booleanValue() ? R.string.MT_Protector : R.string.MT_Protector, c18380M44853.f54889));
                }
                RunnableC11815 runnableC11815 = new RunnableC11815(i, abstractC17043M42109);
                if (C12799.m29347()) {
                    runnableC11815.run();
                } else {
                    C7050.m16212(runnableC11815);
                }
                HashMap map = new HashMap();
                map.put("item", C22405.m50311(new C11450(abstractC17043M42109)));
                map.put("parentPath", abstractC17043M42109.getParent());
                return C5109.m10884(map);
            } catch (C3924 e) {
                return C5109.m10885(EnumC3490.CONFLICT, e.getMessage());
            }
        } catch (IOException | RuntimeException | C16900 unused) {
            return C5109.m10885(EnumC3490.BAD_REQUEST, C7050.m16203(R.string.MT_Protector, new Object[0]));
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static C18380 m44853(C17571 c17571) {
        JSONObject jSONObjectM19683 = C8461.m19683(c17571);
        C18380 c18380 = new C18380();
        c18380.f54890 = C8461.m19689(jSONObjectM19683, "targetPath");
        c18380.f54889 = C8461.m19689(jSONObjectM19683, "name");
        c18380.f54888 = (jSONObjectM19683.get("isDirectory") == null || jSONObjectM19683.get("isDirectory").isNull()) ? null : Boolean.valueOf(C8461.m19687(jSONObjectM19683, "isDirectory"));
        return c18380;
    }
}
