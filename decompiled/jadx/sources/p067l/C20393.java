package p067l;

import android.text.TextUtils;
import bin.p000mt.json.JSONObject;
import bin.p000mt.plus.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: renamed from: l.ᩴ᩵ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: L7BP */
/* JADX INFO: loaded from: classes4.dex */
public final class C20393 {

    /* JADX INFO: renamed from: ֫ */
    public final C10334 f63047;

    public C20393(C5109 c5109, C10334 c10334) {
        this.f63047 = c10334;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C10196 m46053(C17571 c17571) {
        EnumC3490 enumC3490;
        String strM16203;
        EnumC6173 enumC6173M39993 = c17571.m39993();
        boolean zEquals = EnumC6173.POST.equals(enumC6173M39993);
        C10334 c10334 = this.f63047;
        if (!zEquals) {
            if (EnumC6173.GET.equals(enumC6173M39993)) {
                String strM42479 = C18658.m42479(c17571, "taskId");
                if (TextUtils.isEmpty(strM42479)) {
                    return C5109.m10885(EnumC3490.BAD_REQUEST, C7050.m16203(R.string.MT_Protector, "taskId"));
                }
                LinkedHashMap linkedHashMapM23959 = c10334.m23959(strM42479);
                return linkedHashMapM23959 == null ? C5109.m10885(EnumC3490.NOT_FOUND, C7050.m16203(R.string.MT_Protector, new Object[0])) : C5109.m10884(linkedHashMapM23959);
            }
            if (!EnumC6173.PUT.equals(enumC6173M39993)) {
                if (!EnumC6173.DELETE.equals(enumC6173M39993)) {
                    return C5109.m10885(EnumC3490.METHOD_NOT_ALLOWED, C7050.m16203(R.string.MT_Protector, new Object[0]));
                }
                String strM424710 = C18658.m42479(c17571, "taskId");
                if (TextUtils.isEmpty(strM424710)) {
                    return C5109.m10885(EnumC3490.BAD_REQUEST, C7050.m16203(R.string.MT_Protector, "taskId"));
                }
                if (!c10334.m23960(strM424710)) {
                    return C5109.m10885(EnumC3490.NOT_FOUND, C7050.m16203(R.string.MT_Protector, new Object[0]));
                }
                LinkedHashMap linkedHashMapM239510 = c10334.m23959(strM424710);
                return linkedHashMapM239510 == null ? C5109.m10885(EnumC3490.NOT_FOUND, C7050.m16203(R.string.MT_Protector, new Object[0])) : C5109.m10884(linkedHashMapM239510);
            }
            try {
                C4970 c4970M46050 = m46050(c17571);
                if (TextUtils.isEmpty(c4970M46050.f11321)) {
                    return C5109.m10885(EnumC3490.BAD_REQUEST, C7050.m16203(R.string.MT_Protector, "taskId"));
                }
                if (TextUtils.isEmpty(c4970M46050.f11320)) {
                    return C5109.m10885(EnumC3490.BAD_REQUEST, C7050.m16203(R.string.MT_Protector, "conflictId"));
                }
                if (C20323.m45878(c4970M46050.f11318) == -1) {
                    return C5109.m10885(EnumC3490.BAD_REQUEST, C7050.m16203(R.string.MT_Protector, "action"));
                }
                if (c10334.m23959(c4970M46050.f11321) == null) {
                    return C5109.m10885(EnumC3490.NOT_FOUND, C7050.m16203(R.string.MT_Protector, new Object[0]));
                }
                if (!this.f63047.m23958(c4970M46050.f11321, c4970M46050.f11320, c4970M46050.f11318, c4970M46050.f11319, c4970M46050.f11322)) {
                    return C5109.m10885(EnumC3490.CONFLICT, C7050.m16203(R.string.MT_Protector, new Object[0]));
                }
                LinkedHashMap linkedHashMapM239511 = c10334.m23959(c4970M46050.f11321);
                return linkedHashMapM239511 == null ? C5109.m10885(EnumC3490.NOT_FOUND, C7050.m16203(R.string.MT_Protector, new Object[0])) : C5109.m10884(linkedHashMapM239511);
            } catch (IOException | C16900 | C24554 unused) {
                return C5109.m10885(EnumC3490.BAD_REQUEST, C7050.m16203(R.string.MT_Protector, new Object[0]));
            }
        }
        try {
            C6311 c6311M46052 = m46052(c17571);
            List list = c6311M46052.f16362;
            if (list == null || list.isEmpty()) {
                return C5109.m10885(EnumC3490.BAD_REQUEST, C7050.m16203(R.string.MT_Protector, "paths"));
            }
            if (!"copy".equals(c6311M46052.f16363) && !"move".equals(c6311M46052.f16363) && !"delete".equals(c6311M46052.f16363)) {
                return C5109.m10885(EnumC3490.BAD_REQUEST, C7050.m16203(R.string.MT_Protector, "type"));
            }
            if (!"delete".equals(c6311M46052.f16363) && TextUtils.isEmpty(c6311M46052.f16365)) {
                return C5109.m10885(EnumC3490.BAD_REQUEST, C7050.m16203(R.string.MT_Protector, "targetPath"));
            }
            String str = "";
            if (!"delete".equals(c6311M46052.f16363)) {
                String str2 = c6311M46052.f16366;
                List list2 = c6311M46052.f16362;
                if (list2 != null && !list2.isEmpty()) {
                    Iterator it = list2.iterator();
                    String str3 = "";
                    while (true) {
                        if (!it.hasNext()) {
                            String strM46049 = m46049(str2);
                            if (!TextUtils.isEmpty(strM46049)) {
                                if (!strM46049.equals(str3)) {
                                    break;
                                }
                                str = strM46049;
                                break;
                            }
                            str = str3;
                            break;
                        }
                        String strM46047 = m46047(m46051((String) it.next()));
                        if (!TextUtils.isEmpty(str3)) {
                            if (!str3.equals(strM46047)) {
                                break;
                            }
                        } else {
                            str3 = strM46047;
                        }
                    }
                }
            }
            if (!"delete".equals(c6311M46052.f16363) && TextUtils.isEmpty(str)) {
                return C5109.m10885(EnumC3490.BAD_REQUEST, C7050.m16203(R.string.MT_Protector, "sourcePath"));
            }
            ArrayList<InterfaceC19370> arrayList = new ArrayList(c6311M46052.f16362.size());
            Iterator it2 = c6311M46052.f16362.iterator();
            while (it2.hasNext()) {
                try {
                    InterfaceC19370 interfaceC19370M35470 = C4744.f10749.m35470((String) it2.next());
                    if (!"delete".equals(c6311M46052.f16363) && !str.equals(m46049(((C17278) interfaceC19370M35470).getParent()))) {
                        return C5109.m10885(EnumC3490.BAD_REQUEST, C7050.m16203(R.string.MT_Protector, new Object[0]));
                    }
                    arrayList.add(interfaceC19370M35470);
                } catch (IOException unused2) {
                    enumC3490 = EnumC3490.NOT_FOUND;
                    strM16203 = C7050.m16203(R.string.MT_Protector, new Object[0]);
                    return C5109.m10885(enumC3490, strM16203);
                }
            }
            if ("delete".equals(c6311M46052.f16363)) {
                if (c6311M46052.f16361) {
                    for (InterfaceC19370 interfaceC19370 : arrayList) {
                        if (!m46048(interfaceC19370.mo26445())) {
                            return C5109.m10885(EnumC3490.CONFLICT, C7050.m16203(R.string.MT_Protector, interfaceC19370.getName()));
                        }
                    }
                }
                String strM23952 = c10334.m23952(c6311M46052.f16363);
                int i = C16723.f49313;
                C3313 c3313 = new C3313(C6241.class);
                c3313.m5780("ARG_PATHS", (String[]) c6311M46052.f16362.toArray(new String[0]));
                c3313.m5777("deleteFrom", C7050.m16224(R.string.MT_Protector));
                c3313.m5778("recycle", c6311M46052.f16361);
                c3313.m5778("speedMode", false);
                c3313.m5773(c6311M46052.f16362.size(), "minTotal");
                c3313.m5777("remoteTaskId", strM23952);
                c10334.m23953(c3313.m5785(), strM23952);
                LinkedHashMap linkedHashMapM239512 = c10334.m23959(strM23952);
                return linkedHashMapM239512 == null ? C5109.m10885(EnumC3490.INTERNAL_ERROR, C7050.m16203(R.string.MT_Protector, new Object[0])) : C5109.m10884(linkedHashMapM239512);
            }
            String strM460410 = m46049(c6311M46052.f16365);
            if ("copy".equals(c6311M46052.f16363) && str.equals(strM460410)) {
                if (arrayList.size() != 1) {
                    return C5109.m10885(EnumC3490.CONFLICT, C7050.m16224(R.string.MT_Protector));
                }
                if (TextUtils.isEmpty(c6311M46052.f16364)) {
                    return C5109.m10885(EnumC3490.BAD_REQUEST, C7050.m16203(R.string.MT_Protector, "replacedName"));
                }
                if (c6311M46052.f16364.contains("/") || c6311M46052.f16364.contains("\\")) {
                    return C5109.m10885(EnumC3490.CONFLICT, C7050.m16224(R.string.MT_Protector));
                }
                if (C18524.m42109(C11419.m26403(strM460410, c6311M46052.f16364), new String[0]).mo25094()) {
                    return C5109.m10885(EnumC3490.CONFLICT, C7050.m16224(R.string.MT_Protector));
                }
            }
            if ("move".equals(c6311M46052.f16363)) {
                if (str.equals(strM460410)) {
                    return C5109.m10885(EnumC3490.CONFLICT, C7050.m16224(R.string.MT_Protector));
                }
                AbstractC17043 abstractC17043M42109 = C18524.m42109(strM460410, new String[0]);
                for (InterfaceC19370 interfaceC19371 : arrayList) {
                    if (interfaceC19371.isDirectory() && abstractC17043M42109.m38662(interfaceC19371.mo26445())) {
                        return C5109.m10885(EnumC3490.CONFLICT, C7050.m16203(R.string.MT_Protector, interfaceC19371.getName()));
                    }
                }
            }
            String strM23953 = c10334.m23952(c6311M46052.f16363);
            Class cls = "copy".equals(c6311M46052.f16363) ? C10935.class : C20994.class;
            int i2 = C16723.f49313;
            C3313 c3314 = new C3313(cls);
            c3314.m5780("ARG_PATHS", (String[]) c6311M46052.f16362.toArray(new String[0]));
            c3314.m5777("sourcePath", str);
            c3314.m5777("targetPath", strM460410);
            c3314.m5777("remoteTaskId", strM23953);
            if (!TextUtils.isEmpty(c6311M46052.f16364)) {
                c3314.m5777("replacedName", c6311M46052.f16364);
            }
            c10334.m23953(c3314.m5785(), strM23953);
            LinkedHashMap linkedHashMapM239513 = c10334.m23959(strM23953);
            return linkedHashMapM239513 == null ? C5109.m10885(EnumC3490.INTERNAL_ERROR, C7050.m16203(R.string.MT_Protector, new Object[0])) : C5109.m10884(linkedHashMapM239513);
        } catch (IOException | C16900 | C24554 unused3) {
            enumC3490 = EnumC3490.BAD_REQUEST;
            strM16203 = C7050.m16203(R.string.MT_Protector, new Object[0]);
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public static C6311 m46052(C17571 c17571) {
        JSONObject jSONObjectM19683 = C8461.m19683(c17571);
        C6311 c6311 = new C6311();
        c6311.f16362 = Collections.EMPTY_LIST;
        c6311.f16363 = C8461.m19689(jSONObjectM19683, "type");
        c6311.f16366 = C8461.m19689(jSONObjectM19683, "sourcePath");
        c6311.f16365 = C8461.m19689(jSONObjectM19683, "targetPath");
        c6311.f16364 = C8461.m19689(jSONObjectM19683, "replacedName");
        c6311.f16361 = C8461.m19687(jSONObjectM19683, "moveToRecycleBin");
        c6311.f16362 = C8461.m19685(jSONObjectM19683);
        return c6311;
    }

    /* JADX INFO: renamed from: ۧ */
    public static C4970 m46050(C17571 c17571) {
        JSONObject jSONObjectM19683 = C8461.m19683(c17571);
        C4970 c4970 = new C4970();
        c4970.f11321 = C8461.m19689(jSONObjectM19683, "taskId");
        c4970.f11320 = C8461.m19689(jSONObjectM19683, "conflictId");
        c4970.f11318 = C8461.m19689(jSONObjectM19683, "action");
        c4970.f11319 = C8461.m19687(jSONObjectM19683, "applyAll");
        c4970.f11322 = C8461.m19687(jSONObjectM19683, "moveToRecycleBin");
        return c4970;
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m46048(AbstractC17043 abstractC17043) {
        return abstractC17043 != null && C23219.m51754() && abstractC17043.mo31068();
    }

    /* JADX INFO: renamed from: ܽ */
    public static String m46051(String str) {
        return TextUtils.isEmpty(str) ? "" : m46049(AbstractC18422.m41972(str));
    }

    /* JADX INFO: renamed from: ۧ */
    public static String m46049(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String strM41972 = AbstractC18422.m41972(str);
        if ("/".equals(strM41972)) {
            return "/";
        }
        while (strM41972.length() > 1 && strM41972.endsWith("/")) {
            strM41972 = C17073.m38720(1, 0, strM41972);
        }
        return strM41972;
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m46047(String str) {
        int iLastIndexOf;
        return (TextUtils.isEmpty(str) || "/".equals(str) || (iLastIndexOf = str.lastIndexOf(47)) <= 0) ? "/" : str.substring(0, iLastIndexOf);
    }
}
