package l;

import android.text.TextUtils;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.timepicker.RadialViewGroup;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: renamed from: l.᩹᩵ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 07BV */
/* JADX INFO: loaded from: classes.dex */
public final class C22492 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C10645 f72816;

    public C22492(C2884 c2884, C10645 c10645) {
        this.f72816 = c10645;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C8236 m50449(C15996 c15996) {
        EnumC1180 enumC1180;
        String strM14306;
        EnumC4003 enumC4003M37807 = c15996.m37807();
        boolean zEquals = EnumC4003.POST.equals(enumC4003M37807);
        C10645 c10645 = this.f72816;
        if (zEquals) {
            try {
                C21787 c21787M50445 = m50445(c15996);
                String strM43782 = C18965.m43782(c21787M50445.f69788);
                if (TextUtils.isEmpty(strM43782)) {
                    enumC1180 = EnumC1180.BAD_REQUEST;
                    strM14306 = C4925.m14306(R.string.MT_Protector, "targetPath");
                } else {
                    List list = c21787M50445.f69787;
                    if (list == null || list.isEmpty()) {
                        enumC1180 = EnumC1180.BAD_REQUEST;
                        strM14306 = C4925.m14306(R.string.MT_Protector, "entries");
                    } else {
                        try {
                            LinkedHashMap linkedHashMapM26736 = c10645.m26736(c10645.m26731(strM43782, list));
                            if (linkedHashMapM26736 != null) {
                                return C2884.m8817(linkedHashMapM26736);
                            }
                            enumC1180 = EnumC1180.INTERNAL_ERROR;
                            strM14306 = C4925.m14306(R.string.MT_Protector, new Object[0]);
                        } catch (RuntimeException e) {
                            EnumC1180 enumC1181 = EnumC1180.CONFLICT;
                            String message = e.getMessage();
                            if (TextUtils.isEmpty(message)) {
                                message = C4925.m14327(R.string.MT_Protector);
                            }
                            return C2884.m8818(enumC1181, message);
                        }
                    }
                }
            } catch (IOException | C15290 | C23344 unused) {
                return C2884.m8818(EnumC1180.BAD_REQUEST, C4925.m14306(R.string.MT_Protector, new Object[0]));
            }
        } else if (EnumC4003.GET.equals(enumC4003M37807)) {
            String strM40234 = C17140.m40234(c15996, "taskId");
            if (TextUtils.isEmpty(strM40234)) {
                enumC1180 = EnumC1180.BAD_REQUEST;
                strM14306 = C4925.m14306(R.string.MT_Protector, "taskId");
            } else {
                LinkedHashMap linkedHashMapM26737 = c10645.m26736(strM40234);
                if (linkedHashMapM26737 != null) {
                    return C2884.m8817(linkedHashMapM26737);
                }
                enumC1180 = EnumC1180.NOT_FOUND;
                strM14306 = C4925.m14306(R.string.MT_Protector, new Object[0]);
            }
        } else if (EnumC4003.PUT.equals(enumC4003M37807)) {
            try {
                C15435 c15435M50444 = m50444(c15996);
                if (TextUtils.isEmpty(c15435M50444.f47253)) {
                    enumC1180 = EnumC1180.BAD_REQUEST;
                    strM14306 = C4925.m14306(R.string.MT_Protector, "taskId");
                } else if (TextUtils.isEmpty(c15435M50444.f47252)) {
                    enumC1180 = EnumC1180.BAD_REQUEST;
                    strM14306 = C4925.m14306(R.string.MT_Protector, "conflictId");
                } else {
                    String str = c15435M50444.f47250;
                    if (!TextUtils.equals(str, "replace") && !TextUtils.equals(str, RadialViewGroup.SKIP_TAG) && !TextUtils.equals(str, "keep_both")) {
                        enumC1180 = EnumC1180.BAD_REQUEST;
                        strM14306 = C4925.m14306(R.string.MT_Protector, "action");
                    } else if (c10645.m26736(c15435M50444.f47253) == null) {
                        enumC1180 = EnumC1180.NOT_FOUND;
                        strM14306 = C4925.m14306(R.string.MT_Protector, new Object[0]);
                    } else {
                        this.f72816.m26735(c15435M50444.f47253, c15435M50444.f47252, c15435M50444.f47250, c15435M50444.f47251, c15435M50444.f47254);
                        LinkedHashMap linkedHashMapM26738 = c10645.m26736(c15435M50444.f47253);
                        if (linkedHashMapM26738 != null) {
                            return C2884.m8817(linkedHashMapM26738);
                        }
                        enumC1180 = EnumC1180.NOT_FOUND;
                        strM14306 = C4925.m14306(R.string.MT_Protector, new Object[0]);
                    }
                }
            } catch (IOException | C15290 | C23344 unused2) {
                enumC1180 = EnumC1180.BAD_REQUEST;
                strM14306 = C4925.m14306(R.string.MT_Protector, new Object[0]);
            }
        } else if (EnumC4003.DELETE.equals(enumC4003M37807)) {
            String strM40235 = C17140.m40234(c15996, "taskId");
            if (TextUtils.isEmpty(strM40235)) {
                enumC1180 = EnumC1180.BAD_REQUEST;
                strM14306 = C4925.m14306(R.string.MT_Protector, "taskId");
            } else if (c10645.m26738(strM40235)) {
                LinkedHashMap linkedHashMapM26739 = c10645.m26736(strM40235);
                if (linkedHashMapM26739 != null) {
                    return C2884.m8817(linkedHashMapM26739);
                }
                enumC1180 = EnumC1180.NOT_FOUND;
                strM14306 = C4925.m14306(R.string.MT_Protector, new Object[0]);
            } else {
                enumC1180 = EnumC1180.NOT_FOUND;
                strM14306 = C4925.m14306(R.string.MT_Protector, new Object[0]);
            }
        } else {
            enumC1180 = EnumC1180.METHOD_NOT_ALLOWED;
            strM14306 = C4925.m14306(R.string.MT_Protector, new Object[0]);
        }
        return C2884.m8818(enumC1180, strM14306);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C8236 m50450(C15996 c15996) {
        EnumC1180 enumC1180;
        String strM14306;
        if (!EnumC4003.POST.equals(c15996.m37807())) {
            enumC1180 = EnumC1180.METHOD_NOT_ALLOWED;
            strM14306 = C4925.m14306(R.string.MT_Protector, new Object[0]);
        } else {
            String strM40234 = C17140.m40234(c15996, "taskId");
            if (TextUtils.isEmpty(strM40234)) {
                enumC1180 = EnumC1180.BAD_REQUEST;
                strM14306 = C4925.m14306(R.string.MT_Protector, "taskId");
            } else {
                try {
                    LinkedHashMap linkedHashMapM26737 = this.f72816.m26737(strM40234);
                    return linkedHashMapM26737 == null ? C2884.m8818(EnumC1180.NOT_FOUND, C4925.m14306(R.string.MT_Protector, new Object[0])) : C2884.m8817(linkedHashMapM26737);
                } catch (IOException e) {
                    return m50443(strM40234, e);
                }
            }
        }
        return C2884.m8818(enumC1180, strM14306);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C8236 m50446(C15996 c15996) {
        EnumC1180 enumC1180;
        String strM14306;
        if (EnumC4003.POST.equals(c15996.m37807())) {
            String strM40234 = C17140.m40234(c15996, "taskId");
            if (TextUtils.isEmpty(strM40234)) {
                enumC1180 = EnumC1180.BAD_REQUEST;
                strM14306 = C4925.m14306(R.string.MT_Protector, "taskId");
            } else {
                String strM50442 = m50442(C17140.m40234(c15996, MotionUtils.EASING_TYPE_PATH));
                if (TextUtils.isEmpty(strM50442)) {
                    enumC1180 = EnumC1180.BAD_REQUEST;
                    strM14306 = C4925.m14306(R.string.MT_Protector, new Object[0]);
                } else {
                    LinkedHashMap linkedHashMapM26733 = this.f72816.m26733(strM40234, strM50442);
                    if (linkedHashMapM26733 != null) {
                        return C2884.m8817(linkedHashMapM26733);
                    }
                    enumC1180 = EnumC1180.NOT_FOUND;
                    strM14306 = C4925.m14306(R.string.MT_Protector, new Object[0]);
                }
            }
        } else {
            enumC1180 = EnumC1180.METHOD_NOT_ALLOWED;
            strM14306 = C4925.m14306(R.string.MT_Protector, new Object[0]);
        }
        return C2884.m8818(enumC1180, strM14306);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C8236 m50448(C15996 c15996) throws Throwable {
        C8236 c8236M8818;
        EnumC1180 enumC1180;
        String strM14306;
        if (EnumC4003.POST.equals(c15996.m37807())) {
            String strM40234 = C17140.m40234(c15996, "taskId");
            if (TextUtils.isEmpty(strM40234)) {
                enumC1180 = EnumC1180.BAD_REQUEST;
                strM14306 = C4925.m14306(R.string.MT_Protector, "taskId");
            } else {
                String strM50442 = m50442(C17140.m40234(c15996, MotionUtils.EASING_TYPE_PATH));
                if (!TextUtils.isEmpty(strM50442)) {
                    String strM40235 = C17140.m40234(c15996, "armToken");
                    if (TextUtils.isEmpty(strM40235)) {
                        enumC1180 = EnumC1180.BAD_REQUEST;
                        strM14306 = C4925.m14306(R.string.MT_Protector, "armToken");
                    } else {
                        try {
                            try {
                                LinkedHashMap linkedHashMapM26734 = this.f72816.m26734(strM40234, strM50442, strM40235, C17140.m40236(c15996), c15996.m37810());
                                if (linkedHashMapM26734 == null) {
                                    C8236 c8236M8819 = C2884.m8818(EnumC1180.NOT_FOUND, C4925.m14306(R.string.MT_Protector, new Object[0]));
                                    c8236M8819.m21803();
                                    return c8236M8819;
                                }
                                C8236 c8236M8817 = C2884.m8817(linkedHashMapM26734);
                                c8236M8817.m21803();
                                return c8236M8817;
                            } catch (IOException e) {
                                c8236M8818 = m50443(strM40234, e);
                            } catch (C6264 e2) {
                                c8236M8818 = C2884.m8818(EnumC1180.BAD_REQUEST, e2.getMessage());
                            }
                        } catch (C10791 e3) {
                            c8236M8818 = C2884.m8818(EnumC1180.BAD_REQUEST, C4925.m14306(e3.f32453, e3.f32452));
                        }
                    }
                    c8236M8818.m21803();
                    return c8236M8818;
                }
                enumC1180 = EnumC1180.BAD_REQUEST;
                strM14306 = C4925.m14306(R.string.MT_Protector, new Object[0]);
            }
        } else {
            enumC1180 = EnumC1180.METHOD_NOT_ALLOWED;
            strM14306 = C4925.m14306(R.string.MT_Protector, new Object[0]);
        }
        c8236M8818 = C2884.m8818(enumC1180, strM14306);
        c8236M8818.m21803();
        return c8236M8818;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C8236 m50447(C15996 c15996) {
        EnumC1180 enumC1180;
        String strM14306;
        if (!EnumC4003.POST.equals(c15996.m37807())) {
            enumC1180 = EnumC1180.METHOD_NOT_ALLOWED;
            strM14306 = C4925.m14306(R.string.MT_Protector, new Object[0]);
        } else {
            String strM40234 = C17140.m40234(c15996, "taskId");
            if (TextUtils.isEmpty(strM40234)) {
                enumC1180 = EnumC1180.BAD_REQUEST;
                strM14306 = C4925.m14306(R.string.MT_Protector, "taskId");
            } else {
                LinkedHashMap linkedHashMapM26732 = this.f72816.m26732(strM40234);
                if (linkedHashMapM26732 == null) {
                    enumC1180 = EnumC1180.NOT_FOUND;
                    strM14306 = C4925.m14306(R.string.MT_Protector, new Object[0]);
                } else {
                    return C2884.m8817(linkedHashMapM26732);
                }
            }
        }
        return C2884.m8818(enumC1180, strM14306);
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static C21787 m50445(C15996 c15996) {
        ArrayList arrayList;
        JSONObject jSONObjectM17736 = C6411.m17736(c15996);
        C21787 c21787 = new C21787();
        c21787.f69788 = C6411.m17742(jSONObjectM17736, "targetPath");
        try {
            JSONArray jSONArray = jSONObjectM17736.getJSONArray("entries");
            if (jSONArray == null) {
                arrayList = null;
            } else {
                ArrayList arrayList2 = new ArrayList(jSONArray.size());
                for (int i = 0; i < jSONArray.size(); i++) {
                    try {
                        JSONObject jSONObject = jSONArray.getJSONObject(i);
                        C14024 c14024 = new C14024();
                        c14024.f42405 = C6411.m17742(jSONObject, MotionUtils.EASING_TYPE_PATH);
                        c14024.f42408 = C6411.m17742(jSONObject, "type");
                        c14024.f42406 = C6411.m17741(jSONObject, "size");
                        c14024.f42407 = C6411.m17741(jSONObject, "time");
                        c14024.f42409 = C6411.m17740(jSONObject, "topLevel");
                        arrayList2.add(c14024);
                    } catch (RuntimeException e) {
                        throw C6411.m17739(e);
                    }
                }
                arrayList = arrayList2;
            }
            c21787.f69787 = arrayList;
            return c21787;
        } catch (RuntimeException e2) {
            throw C6411.m17739(e2);
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static C15435 m50444(C15996 c15996) {
        JSONObject jSONObjectM17736 = C6411.m17736(c15996);
        C15435 c15435 = new C15435();
        c15435.f47253 = C6411.m17742(jSONObjectM17736, "taskId");
        c15435.f47252 = C6411.m17742(jSONObjectM17736, "conflictId");
        c15435.f47250 = C6411.m17742(jSONObjectM17736, "action");
        c15435.f47251 = C6411.m17740(jSONObjectM17736, "applyAll");
        c15435.f47254 = C6411.m17740(jSONObjectM17736, "moveToRecycleBin");
        return c15435;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m50442(String str) {
        int i;
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String strReplace = str.replace('\\', '/');
        while (strReplace.startsWith("./")) {
            strReplace = strReplace.substring(2);
        }
        while (strReplace.startsWith("/")) {
            strReplace = strReplace.substring(1);
        }
        while (true) {
            if (!strReplace.endsWith("/") || strReplace.length() <= 1) {
                break;
            }
            strReplace = C15472.m36561(1, 0, strReplace);
        }
        if (TextUtils.isEmpty(strReplace) || ".".equals(strReplace)) {
            return "";
        }
        for (String str2 : strReplace.split("/")) {
            if (TextUtils.isEmpty(str2) || ".".equals(str2) || "..".equals(str2)) {
                return "";
            }
        }
        return strReplace;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C8236 m50443(String str, IOException iOException) {
        LinkedHashMap linkedHashMapM26736 = this.f72816.m26736(str);
        if (linkedHashMapM26736 != null && Boolean.TRUE.equals(linkedHashMapM26736.get("done"))) {
            return C2884.m8817(linkedHashMapM26736);
        }
        EnumC1180 enumC1180 = EnumC1180.CONFLICT;
        String message = iOException.getMessage();
        if (TextUtils.isEmpty(message)) {
            message = C4925.m14327(R.string.MT_Protector);
        }
        return C2884.m8818(enumC1180, message);
    }
}
