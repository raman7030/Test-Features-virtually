package p067l;

import android.text.TextUtils;
import bin.p000mt.json.JSONArray;
import bin.p000mt.json.JSONObject;
import bin.p000mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.timepicker.RadialViewGroup;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: renamed from: l.᩹᩵ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 07BV */
/* JADX INFO: loaded from: classes.dex */
public final class C23745 {

    /* JADX INFO: renamed from: ֫ */
    public final C12485 f75542;

    public C23745(C5109 c5109, C12485 c12485) {
        this.f75542 = c12485;
    }

    /* JADX INFO: renamed from: ܿ */
    public final C10196 m52790(C17571 c17571) {
        EnumC3490 enumC3490;
        String strM16203;
        EnumC6173 enumC6173M39993 = c17571.m39993();
        boolean zEquals = EnumC6173.POST.equals(enumC6173M39993);
        C12485 c12485 = this.f75542;
        if (zEquals) {
            try {
                C23075 c23075M52786 = m52786(c17571);
                String strM46049 = C20393.m46049(c23075M52786.f72496);
                if (TextUtils.isEmpty(strM46049)) {
                    enumC3490 = EnumC3490.BAD_REQUEST;
                    strM16203 = C7050.m16203(R.string.MT_Protector, "targetPath");
                } else {
                    List list = c23075M52786.f72495;
                    if (list == null || list.isEmpty()) {
                        enumC3490 = EnumC3490.BAD_REQUEST;
                        strM16203 = C7050.m16203(R.string.MT_Protector, "entries");
                    } else {
                        try {
                            LinkedHashMap linkedHashMapM28775 = c12485.m28775(c12485.m28770(strM46049, list));
                            if (linkedHashMapM28775 != null) {
                                return C5109.m10884(linkedHashMapM28775);
                            }
                            enumC3490 = EnumC3490.INTERNAL_ERROR;
                            strM16203 = C7050.m16203(R.string.MT_Protector, new Object[0]);
                        } catch (RuntimeException e) {
                            EnumC3490 enumC3491 = EnumC3490.CONFLICT;
                            String message = e.getMessage();
                            if (TextUtils.isEmpty(message)) {
                                message = C7050.m16224(R.string.MT_Protector);
                            }
                            return C5109.m10885(enumC3491, message);
                        }
                    }
                }
            } catch (IOException | C16900 | C24554 unused) {
                return C5109.m10885(EnumC3490.BAD_REQUEST, C7050.m16203(R.string.MT_Protector, new Object[0]));
            }
        } else if (EnumC6173.GET.equals(enumC6173M39993)) {
            String strM42479 = C18658.m42479(c17571, "taskId");
            if (TextUtils.isEmpty(strM42479)) {
                enumC3490 = EnumC3490.BAD_REQUEST;
                strM16203 = C7050.m16203(R.string.MT_Protector, "taskId");
            } else {
                LinkedHashMap linkedHashMapM28776 = c12485.m28775(strM42479);
                if (linkedHashMapM28776 != null) {
                    return C5109.m10884(linkedHashMapM28776);
                }
                enumC3490 = EnumC3490.NOT_FOUND;
                strM16203 = C7050.m16203(R.string.MT_Protector, new Object[0]);
            }
        } else if (EnumC6173.PUT.equals(enumC6173M39993)) {
            try {
                C17038 c17038M52785 = m52785(c17571);
                if (TextUtils.isEmpty(c17038M52785.f50382)) {
                    enumC3490 = EnumC3490.BAD_REQUEST;
                    strM16203 = C7050.m16203(R.string.MT_Protector, "taskId");
                } else if (TextUtils.isEmpty(c17038M52785.f50381)) {
                    enumC3490 = EnumC3490.BAD_REQUEST;
                    strM16203 = C7050.m16203(R.string.MT_Protector, "conflictId");
                } else {
                    String str = c17038M52785.f50379;
                    if (!TextUtils.equals(str, "replace") && !TextUtils.equals(str, RadialViewGroup.SKIP_TAG) && !TextUtils.equals(str, "keep_both")) {
                        enumC3490 = EnumC3490.BAD_REQUEST;
                        strM16203 = C7050.m16203(R.string.MT_Protector, "action");
                    } else if (c12485.m28775(c17038M52785.f50382) == null) {
                        enumC3490 = EnumC3490.NOT_FOUND;
                        strM16203 = C7050.m16203(R.string.MT_Protector, new Object[0]);
                    } else {
                        this.f75542.m28774(c17038M52785.f50382, c17038M52785.f50381, c17038M52785.f50379, c17038M52785.f50380, c17038M52785.f50383);
                        LinkedHashMap linkedHashMapM28777 = c12485.m28775(c17038M52785.f50382);
                        if (linkedHashMapM28777 != null) {
                            return C5109.m10884(linkedHashMapM28777);
                        }
                        enumC3490 = EnumC3490.NOT_FOUND;
                        strM16203 = C7050.m16203(R.string.MT_Protector, new Object[0]);
                    }
                }
            } catch (IOException | C16900 | C24554 unused2) {
                enumC3490 = EnumC3490.BAD_REQUEST;
                strM16203 = C7050.m16203(R.string.MT_Protector, new Object[0]);
            }
        } else if (EnumC6173.DELETE.equals(enumC6173M39993)) {
            String strM424710 = C18658.m42479(c17571, "taskId");
            if (TextUtils.isEmpty(strM424710)) {
                enumC3490 = EnumC3490.BAD_REQUEST;
                strM16203 = C7050.m16203(R.string.MT_Protector, "taskId");
            } else if (c12485.m28777(strM424710)) {
                LinkedHashMap linkedHashMapM28778 = c12485.m28775(strM424710);
                if (linkedHashMapM28778 != null) {
                    return C5109.m10884(linkedHashMapM28778);
                }
                enumC3490 = EnumC3490.NOT_FOUND;
                strM16203 = C7050.m16203(R.string.MT_Protector, new Object[0]);
            } else {
                enumC3490 = EnumC3490.NOT_FOUND;
                strM16203 = C7050.m16203(R.string.MT_Protector, new Object[0]);
            }
        } else {
            enumC3490 = EnumC3490.METHOD_NOT_ALLOWED;
            strM16203 = C7050.m16203(R.string.MT_Protector, new Object[0]);
        }
        return C5109.m10885(enumC3490, strM16203);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final C10196 m52791(C17571 c17571) {
        EnumC3490 enumC3490;
        String strM16203;
        if (!EnumC6173.POST.equals(c17571.m39993())) {
            enumC3490 = EnumC3490.METHOD_NOT_ALLOWED;
            strM16203 = C7050.m16203(R.string.MT_Protector, new Object[0]);
        } else {
            String strM42479 = C18658.m42479(c17571, "taskId");
            if (TextUtils.isEmpty(strM42479)) {
                enumC3490 = EnumC3490.BAD_REQUEST;
                strM16203 = C7050.m16203(R.string.MT_Protector, "taskId");
            } else {
                try {
                    LinkedHashMap linkedHashMapM28776 = this.f75542.m28776(strM42479);
                    return linkedHashMapM28776 == null ? C5109.m10885(EnumC3490.NOT_FOUND, C7050.m16203(R.string.MT_Protector, new Object[0])) : C5109.m10884(linkedHashMapM28776);
                } catch (IOException e) {
                    return m52784(strM42479, e);
                }
            }
        }
        return C5109.m10885(enumC3490, strM16203);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C10196 m52787(C17571 c17571) {
        EnumC3490 enumC3490;
        String strM16203;
        if (EnumC6173.POST.equals(c17571.m39993())) {
            String strM42479 = C18658.m42479(c17571, "taskId");
            if (TextUtils.isEmpty(strM42479)) {
                enumC3490 = EnumC3490.BAD_REQUEST;
                strM16203 = C7050.m16203(R.string.MT_Protector, "taskId");
            } else {
                String strM52783 = m52783(C18658.m42479(c17571, MotionUtils.EASING_TYPE_PATH));
                if (TextUtils.isEmpty(strM52783)) {
                    enumC3490 = EnumC3490.BAD_REQUEST;
                    strM16203 = C7050.m16203(R.string.MT_Protector, new Object[0]);
                } else {
                    LinkedHashMap linkedHashMapM28772 = this.f75542.m28772(strM42479, strM52783);
                    if (linkedHashMapM28772 != null) {
                        return C5109.m10884(linkedHashMapM28772);
                    }
                    enumC3490 = EnumC3490.NOT_FOUND;
                    strM16203 = C7050.m16203(R.string.MT_Protector, new Object[0]);
                }
            }
        } else {
            enumC3490 = EnumC3490.METHOD_NOT_ALLOWED;
            strM16203 = C7050.m16203(R.string.MT_Protector, new Object[0]);
        }
        return C5109.m10885(enumC3490, strM16203);
    }

    /* JADX INFO: renamed from: ܽ */
    public final C10196 m52789(C17571 c17571) throws Throwable {
        C10196 c10196M10885;
        EnumC3490 enumC3490;
        String strM16203;
        if (EnumC6173.POST.equals(c17571.m39993())) {
            String strM42479 = C18658.m42479(c17571, "taskId");
            if (TextUtils.isEmpty(strM42479)) {
                enumC3490 = EnumC3490.BAD_REQUEST;
                strM16203 = C7050.m16203(R.string.MT_Protector, "taskId");
            } else {
                String strM52783 = m52783(C18658.m42479(c17571, MotionUtils.EASING_TYPE_PATH));
                if (!TextUtils.isEmpty(strM52783)) {
                    String strM424710 = C18658.m42479(c17571, "armToken");
                    if (TextUtils.isEmpty(strM424710)) {
                        enumC3490 = EnumC3490.BAD_REQUEST;
                        strM16203 = C7050.m16203(R.string.MT_Protector, "armToken");
                    } else {
                        try {
                            try {
                                LinkedHashMap linkedHashMapM28773 = this.f75542.m28773(strM42479, strM52783, strM424710, C18658.m42481(c17571), c17571.m39996());
                                if (linkedHashMapM28773 == null) {
                                    C10196 c10196M10886 = C5109.m10885(EnumC3490.NOT_FOUND, C7050.m16203(R.string.MT_Protector, new Object[0]));
                                    c10196M10886.m23772();
                                    return c10196M10886;
                                }
                                C10196 c10196M10884 = C5109.m10884(linkedHashMapM28773);
                                c10196M10884.m23772();
                                return c10196M10884;
                            } catch (IOException e) {
                                c10196M10885 = m52784(strM42479, e);
                            } catch (C8322 e2) {
                                c10196M10885 = C5109.m10885(EnumC3490.BAD_REQUEST, e2.getMessage());
                            }
                        } catch (C12624 e3) {
                            c10196M10885 = C5109.m10885(EnumC3490.BAD_REQUEST, C7050.m16203(e3.f35429, e3.f35428));
                        }
                    }
                    c10196M10885.m23772();
                    return c10196M10885;
                }
                enumC3490 = EnumC3490.BAD_REQUEST;
                strM16203 = C7050.m16203(R.string.MT_Protector, new Object[0]);
            }
        } else {
            enumC3490 = EnumC3490.METHOD_NOT_ALLOWED;
            strM16203 = C7050.m16203(R.string.MT_Protector, new Object[0]);
        }
        c10196M10885 = C5109.m10885(enumC3490, strM16203);
        c10196M10885.m23772();
        return c10196M10885;
    }

    /* JADX INFO: renamed from: ۧ */
    public final C10196 m52788(C17571 c17571) {
        EnumC3490 enumC3490;
        String strM16203;
        if (!EnumC6173.POST.equals(c17571.m39993())) {
            enumC3490 = EnumC3490.METHOD_NOT_ALLOWED;
            strM16203 = C7050.m16203(R.string.MT_Protector, new Object[0]);
        } else {
            String strM42479 = C18658.m42479(c17571, "taskId");
            if (TextUtils.isEmpty(strM42479)) {
                enumC3490 = EnumC3490.BAD_REQUEST;
                strM16203 = C7050.m16203(R.string.MT_Protector, "taskId");
            } else {
                LinkedHashMap linkedHashMapM28771 = this.f75542.m28771(strM42479);
                if (linkedHashMapM28771 == null) {
                    enumC3490 = EnumC3490.NOT_FOUND;
                    strM16203 = C7050.m16203(R.string.MT_Protector, new Object[0]);
                } else {
                    return C5109.m10884(linkedHashMapM28771);
                }
            }
        }
        return C5109.m10885(enumC3490, strM16203);
    }

    /* JADX INFO: renamed from: ᩻ */
    public static C23075 m52786(C17571 c17571) {
        ArrayList arrayList;
        JSONObject jSONObjectM19683 = C8461.m19683(c17571);
        C23075 c23075 = new C23075();
        c23075.f72496 = C8461.m19689(jSONObjectM19683, "targetPath");
        try {
            JSONArray jSONArray = jSONObjectM19683.getJSONArray("entries");
            if (jSONArray == null) {
                arrayList = null;
            } else {
                ArrayList arrayList2 = new ArrayList(jSONArray.size());
                for (int i = 0; i < jSONArray.size(); i++) {
                    try {
                        JSONObject jSONObject = jSONArray.getJSONObject(i);
                        C15697 c15697 = new C15697();
                        c15697.f45488 = C8461.m19689(jSONObject, MotionUtils.EASING_TYPE_PATH);
                        c15697.f45491 = C8461.m19689(jSONObject, "type");
                        c15697.f45489 = C8461.m19688(jSONObject, "size");
                        c15697.f45490 = C8461.m19688(jSONObject, "time");
                        c15697.f45492 = C8461.m19687(jSONObject, "topLevel");
                        arrayList2.add(c15697);
                    } catch (RuntimeException e) {
                        throw C8461.m19686(e);
                    }
                }
                arrayList = arrayList2;
            }
            c23075.f72495 = arrayList;
            return c23075;
        } catch (RuntimeException e2) {
            throw C8461.m19686(e2);
        }
    }

    /* JADX INFO: renamed from: ܳ */
    public static C17038 m52785(C17571 c17571) {
        JSONObject jSONObjectM19683 = C8461.m19683(c17571);
        C17038 c17038 = new C17038();
        c17038.f50382 = C8461.m19689(jSONObjectM19683, "taskId");
        c17038.f50381 = C8461.m19689(jSONObjectM19683, "conflictId");
        c17038.f50379 = C8461.m19689(jSONObjectM19683, "action");
        c17038.f50380 = C8461.m19687(jSONObjectM19683, "applyAll");
        c17038.f50383 = C8461.m19687(jSONObjectM19683, "moveToRecycleBin");
        return c17038;
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m52783(String str) {
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
            strReplace = C17073.m38720(1, 0, strReplace);
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

    /* JADX INFO: renamed from: ֫ */
    private C10196 m52784(String str, IOException iOException) {
        LinkedHashMap linkedHashMapM28775 = this.f75542.m28775(str);
        if (linkedHashMapM28775 != null && Boolean.TRUE.equals(linkedHashMapM28775.get("done"))) {
            return C5109.m10884(linkedHashMapM28775);
        }
        EnumC3490 enumC3490 = EnumC3490.CONFLICT;
        String message = iOException.getMessage();
        if (TextUtils.isEmpty(message)) {
            message = C7050.m16224(R.string.MT_Protector);
        }
        return C5109.m10885(enumC3490, message);
    }
}
