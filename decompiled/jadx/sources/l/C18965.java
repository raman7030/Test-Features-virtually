package l;

import android.text.TextUtils;
import bin.mt.json.JSONObject;
import bin.mt.plus.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: renamed from: l.ᩴ᩵ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: L7BP */
/* JADX INFO: loaded from: classes4.dex */
public final class C18965 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C8381 f59819;

    public C18965(C2884 c2884, C8381 c8381) {
        this.f59819 = c8381;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C8236 m43786(C15996 c15996) {
        EnumC1180 enumC1180;
        String strM14306;
        EnumC4003 enumC4003M37807 = c15996.m37807();
        boolean zEquals = EnumC4003.POST.equals(enumC4003M37807);
        C8381 c8381 = this.f59819;
        if (!zEquals) {
            if (EnumC4003.GET.equals(enumC4003M37807)) {
                String strM40234 = C17140.m40234(c15996, "taskId");
                if (TextUtils.isEmpty(strM40234)) {
                    return C2884.m8818(EnumC1180.BAD_REQUEST, C4925.m14306(R.string.MT_Protector, "taskId"));
                }
                LinkedHashMap linkedHashMapM21988 = c8381.m21988(strM40234);
                return linkedHashMapM21988 == null ? C2884.m8818(EnumC1180.NOT_FOUND, C4925.m14306(R.string.MT_Protector, new Object[0])) : C2884.m8817(linkedHashMapM21988);
            }
            if (!EnumC4003.PUT.equals(enumC4003M37807)) {
                if (!EnumC4003.DELETE.equals(enumC4003M37807)) {
                    return C2884.m8818(EnumC1180.METHOD_NOT_ALLOWED, C4925.m14306(R.string.MT_Protector, new Object[0]));
                }
                String strM40235 = C17140.m40234(c15996, "taskId");
                if (TextUtils.isEmpty(strM40235)) {
                    return C2884.m8818(EnumC1180.BAD_REQUEST, C4925.m14306(R.string.MT_Protector, "taskId"));
                }
                if (!c8381.m21989(strM40235)) {
                    return C2884.m8818(EnumC1180.NOT_FOUND, C4925.m14306(R.string.MT_Protector, new Object[0]));
                }
                LinkedHashMap linkedHashMapM21989 = c8381.m21988(strM40235);
                return linkedHashMapM21989 == null ? C2884.m8818(EnumC1180.NOT_FOUND, C4925.m14306(R.string.MT_Protector, new Object[0])) : C2884.m8817(linkedHashMapM21989);
            }
            try {
                C2737 c2737M43783 = m43783(c15996);
                if (TextUtils.isEmpty(c2737M43783.f8527)) {
                    return C2884.m8818(EnumC1180.BAD_REQUEST, C4925.m14306(R.string.MT_Protector, "taskId"));
                }
                if (TextUtils.isEmpty(c2737M43783.f8526)) {
                    return C2884.m8818(EnumC1180.BAD_REQUEST, C4925.m14306(R.string.MT_Protector, "conflictId"));
                }
                if (C18891.m43612(c2737M43783.f8524) == -1) {
                    return C2884.m8818(EnumC1180.BAD_REQUEST, C4925.m14306(R.string.MT_Protector, "action"));
                }
                if (c8381.m21988(c2737M43783.f8527) == null) {
                    return C2884.m8818(EnumC1180.NOT_FOUND, C4925.m14306(R.string.MT_Protector, new Object[0]));
                }
                if (!this.f59819.m21987(c2737M43783.f8527, c2737M43783.f8526, c2737M43783.f8524, c2737M43783.f8525, c2737M43783.f8528)) {
                    return C2884.m8818(EnumC1180.CONFLICT, C4925.m14306(R.string.MT_Protector, new Object[0]));
                }
                LinkedHashMap linkedHashMapM219810 = c8381.m21988(c2737M43783.f8527);
                return linkedHashMapM219810 == null ? C2884.m8818(EnumC1180.NOT_FOUND, C4925.m14306(R.string.MT_Protector, new Object[0])) : C2884.m8817(linkedHashMapM219810);
            } catch (IOException | C15290 | C23344 unused) {
                return C2884.m8818(EnumC1180.BAD_REQUEST, C4925.m14306(R.string.MT_Protector, new Object[0]));
            }
        }
        try {
            C4148 c4148M43785 = m43785(c15996);
            List list = c4148M43785.f13548;
            if (list == null || list.isEmpty()) {
                return C2884.m8818(EnumC1180.BAD_REQUEST, C4925.m14306(R.string.MT_Protector, "paths"));
            }
            if (!"copy".equals(c4148M43785.f13549) && !"move".equals(c4148M43785.f13549) && !"delete".equals(c4148M43785.f13549)) {
                return C2884.m8818(EnumC1180.BAD_REQUEST, C4925.m14306(R.string.MT_Protector, "type"));
            }
            if (!"delete".equals(c4148M43785.f13549) && TextUtils.isEmpty(c4148M43785.f13551)) {
                return C2884.m8818(EnumC1180.BAD_REQUEST, C4925.m14306(R.string.MT_Protector, "targetPath"));
            }
            String str = "";
            if (!"delete".equals(c4148M43785.f13549)) {
                String str2 = c4148M43785.f13552;
                List list2 = c4148M43785.f13548;
                if (list2 != null && !list2.isEmpty()) {
                    Iterator it = list2.iterator();
                    String str3 = "";
                    while (true) {
                        if (!it.hasNext()) {
                            String strM43782 = m43782(str2);
                            if (!TextUtils.isEmpty(strM43782)) {
                                if (!strM43782.equals(str3)) {
                                    break;
                                }
                                str = strM43782;
                                break;
                            }
                            str = str3;
                            break;
                        }
                        String strM43780 = m43780(m43784((String) it.next()));
                        if (!TextUtils.isEmpty(str3)) {
                            if (!str3.equals(strM43780)) {
                                break;
                            }
                        } else {
                            str3 = strM43780;
                        }
                    }
                }
            }
            if (!"delete".equals(c4148M43785.f13549) && TextUtils.isEmpty(str)) {
                return C2884.m8818(EnumC1180.BAD_REQUEST, C4925.m14306(R.string.MT_Protector, "sourcePath"));
            }
            ArrayList<InterfaceC17889> arrayList = new ArrayList(c4148M43785.f13548.size());
            Iterator it2 = c4148M43785.f13548.iterator();
            while (it2.hasNext()) {
                try {
                    InterfaceC17889 interfaceC17889M33351 = C2499.f7958.m33351((String) it2.next());
                    if (!"delete".equals(c4148M43785.f13549) && !str.equals(m43782(((C15688) interfaceC17889M33351).getParent()))) {
                        return C2884.m8818(EnumC1180.BAD_REQUEST, C4925.m14306(R.string.MT_Protector, new Object[0]));
                    }
                    arrayList.add(interfaceC17889M33351);
                } catch (IOException unused2) {
                    enumC1180 = EnumC1180.NOT_FOUND;
                    strM14306 = C4925.m14306(R.string.MT_Protector, new Object[0]);
                    return C2884.m8818(enumC1180, strM14306);
                }
            }
            if ("delete".equals(c4148M43785.f13549)) {
                if (c4148M43785.f13547) {
                    for (InterfaceC17889 interfaceC17889 : arrayList) {
                        if (!m43781(interfaceC17889.mo24433())) {
                            return C2884.m8818(EnumC1180.CONFLICT, C4925.m14306(R.string.MT_Protector, interfaceC17889.getName()));
                        }
                    }
                }
                String strM21981 = c8381.m21981(c4148M43785.f13549);
                int i = C15104.f46193;
                C0994 c0994 = new C0994(C4074.class);
                c0994.m3477("ARG_PATHS", (String[]) c4148M43785.f13548.toArray(new String[0]));
                c0994.m3474("deleteFrom", C4925.m14327(R.string.MT_Protector));
                c0994.m3475("recycle", c4148M43785.f13547);
                c0994.m3475("speedMode", false);
                c0994.m3470(c4148M43785.f13548.size(), "minTotal");
                c0994.m3474("remoteTaskId", strM21981);
                c8381.m21982(c0994.m3482(), strM21981);
                LinkedHashMap linkedHashMapM219811 = c8381.m21988(strM21981);
                return linkedHashMapM219811 == null ? C2884.m8818(EnumC1180.INTERNAL_ERROR, C4925.m14306(R.string.MT_Protector, new Object[0])) : C2884.m8817(linkedHashMapM219811);
            }
            String strM43783 = m43782(c4148M43785.f13551);
            if ("copy".equals(c4148M43785.f13549) && str.equals(strM43783)) {
                if (arrayList.size() != 1) {
                    return C2884.m8818(EnumC1180.CONFLICT, C4925.m14327(R.string.MT_Protector));
                }
                if (TextUtils.isEmpty(c4148M43785.f13550)) {
                    return C2884.m8818(EnumC1180.BAD_REQUEST, C4925.m14306(R.string.MT_Protector, "replacedName"));
                }
                if (c4148M43785.f13550.contains("/") || c4148M43785.f13550.contains("\\")) {
                    return C2884.m8818(EnumC1180.CONFLICT, C4925.m14327(R.string.MT_Protector));
                }
                if (C16999.m39866(C9523.m24393(strM43783, c4148M43785.f13550), new String[0]).mo23120()) {
                    return C2884.m8818(EnumC1180.CONFLICT, C4925.m14327(R.string.MT_Protector));
                }
            }
            if ("move".equals(c4148M43785.f13549)) {
                if (str.equals(strM43783)) {
                    return C2884.m8818(EnumC1180.CONFLICT, C4925.m14327(R.string.MT_Protector));
                }
                AbstractC15440 abstractC15440M39866 = C16999.m39866(strM43783, new String[0]);
                for (InterfaceC17889 interfaceC178810 : arrayList) {
                    if (interfaceC178810.isDirectory() && abstractC15440M39866.m36504(interfaceC178810.mo24433())) {
                        return C2884.m8818(EnumC1180.CONFLICT, C4925.m14306(R.string.MT_Protector, interfaceC178810.getName()));
                    }
                }
            }
            String strM21982 = c8381.m21981(c4148M43785.f13549);
            Class cls = "copy".equals(c4148M43785.f13549) ? C9013.class : C19597.class;
            int i2 = C15104.f46193;
            C0994 c0995 = new C0994(cls);
            c0995.m3477("ARG_PATHS", (String[]) c4148M43785.f13548.toArray(new String[0]));
            c0995.m3474("sourcePath", str);
            c0995.m3474("targetPath", strM43783);
            c0995.m3474("remoteTaskId", strM21982);
            if (!TextUtils.isEmpty(c4148M43785.f13550)) {
                c0995.m3474("replacedName", c4148M43785.f13550);
            }
            c8381.m21982(c0995.m3482(), strM21982);
            LinkedHashMap linkedHashMapM219812 = c8381.m21988(strM21982);
            return linkedHashMapM219812 == null ? C2884.m8818(EnumC1180.INTERNAL_ERROR, C4925.m14306(R.string.MT_Protector, new Object[0])) : C2884.m8817(linkedHashMapM219812);
        } catch (IOException | C15290 | C23344 unused3) {
            enumC1180 = EnumC1180.BAD_REQUEST;
            strM14306 = C4925.m14306(R.string.MT_Protector, new Object[0]);
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static C4148 m43785(C15996 c15996) {
        JSONObject jSONObjectM17736 = C6411.m17736(c15996);
        C4148 c4148 = new C4148();
        c4148.f13548 = Collections.EMPTY_LIST;
        c4148.f13549 = C6411.m17742(jSONObjectM17736, "type");
        c4148.f13552 = C6411.m17742(jSONObjectM17736, "sourcePath");
        c4148.f13551 = C6411.m17742(jSONObjectM17736, "targetPath");
        c4148.f13550 = C6411.m17742(jSONObjectM17736, "replacedName");
        c4148.f13547 = C6411.m17740(jSONObjectM17736, "moveToRecycleBin");
        c4148.f13548 = C6411.m17738(jSONObjectM17736);
        return c4148;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C2737 m43783(C15996 c15996) {
        JSONObject jSONObjectM17736 = C6411.m17736(c15996);
        C2737 c2737 = new C2737();
        c2737.f8527 = C6411.m17742(jSONObjectM17736, "taskId");
        c2737.f8526 = C6411.m17742(jSONObjectM17736, "conflictId");
        c2737.f8524 = C6411.m17742(jSONObjectM17736, "action");
        c2737.f8525 = C6411.m17740(jSONObjectM17736, "applyAll");
        c2737.f8528 = C6411.m17740(jSONObjectM17736, "moveToRecycleBin");
        return c2737;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m43781(AbstractC15440 abstractC15440) {
        return abstractC15440 != null && C21939.m49417() && abstractC15440.mo29016();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static String m43784(String str) {
        return TextUtils.isEmpty(str) ? "" : m43782(AbstractC16891.m39731(str));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m43782(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String strM39731 = AbstractC16891.m39731(str);
        if ("/".equals(strM39731)) {
            return "/";
        }
        while (strM39731.length() > 1 && strM39731.endsWith("/")) {
            strM39731 = C15472.m36561(1, 0, strM39731);
        }
        return strM39731;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m43780(String str) {
        int iLastIndexOf;
        return (TextUtils.isEmpty(str) || "/".equals(str) || (iLastIndexOf = str.lastIndexOf(47)) <= 0) ? "/" : str.substring(0, iLastIndexOf);
    }
}
