package p067l;

import bin.p000mt.json.JSON;
import bin.p000mt.json.JSONArray;
import bin.p000mt.json.JSONObject;
import bin.p000mt.json.JSONValue;
import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ܶۡۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: O6XG */
/* JADX INFO: loaded from: classes4.dex */
public final class C16740 {

    /* JADX INFO: renamed from: ֫ */
    public final C21545 f49359;

    /* JADX INFO: renamed from: ۧ */
    public final C19247 f49360;

    public C16740(C19247 c19247) {
        C21545 c21545 = new C21545();
        this.f49360 = c19247;
        this.f49359 = c21545;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C10036 m37984(String str) throws C5276 {
        C19247 c19247 = this.f49360;
        C9385 c9385M43852 = c19247.m43852();
        String strM43850 = C19247.m43850(str, c9385M43852, MotionUtils.EASING_TYPE_PATH);
        C11872 c11872M43856 = c19247.m43856(strM43850);
        try {
            C10036 c10036M37981 = m37981(strM43850, c9385M43852);
            c11872M43856.close();
            return c10036M37981;
        } catch (Throwable th) {
            try {
                c11872M43856.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private C10036 m37981(String str, C9385 c9385) throws C5276 {
        String str2;
        C9385 c9385M43852;
        String str3;
        C3330 c3330;
        boolean z;
        boolean z2;
        C5276 c5276M37979;
        C19247 c19247 = this.f49360;
        AbstractC17043 abstractC17043M43857 = c19247.m43857(str);
        m37983(m37982(abstractC17043M43857), str);
        m37980(abstractC17043M43857, c9385.f25641);
        String parent = abstractC17043M43857.getParent();
        do {
            C9385 c9385M43853 = c19247.m43852();
            c9385M43853.m21857(str);
            str2 = c9385M43853.f25641;
            if (parent != null) {
                c9385M43853.m21857(parent);
            }
            c9385M43853.m21855(str);
            AbstractC17043 abstractC17043M43858 = c19247.m43857(str);
            c19247.m43855(abstractC17043M43858, new C13544(str, str2));
            m37983(m37982(abstractC17043M43858), str);
            m37980(abstractC17043M43858, str2);
            c9385M43852 = c19247.m43852();
            str3 = c9385M43852.f25641;
        } while (!str2.equals(str3));
        AbstractC17043 abstractC17043M43859 = c19247.m43857(str);
        c19247.m43855(abstractC17043M43859, new C13544(str, str3));
        m37983(m37982(abstractC17043M43859), str);
        EnumC6986 enumC6986M37980 = m37980(abstractC17043M43859, str3);
        String str4 = enumC6986M37980 == EnumC6986.ATOMIC ? "atomic" : "best_effort";
        JSONArray<JSONValue> jSONArrayArray = JSON.array();
        try {
            abstractC17043M43859.mo25509().mo10736();
            c5276M37979 = null;
            z = true;
            z2 = true;
        } catch (C23750 e) {
            try {
                C14362 c14362Mo10732 = c19247.m43857(str).mo25509().mo10732();
                if (c14362Mo10732.m32962() == EnumC5645.MISSING) {
                    c3330 = new C3330(true, true);
                } else if (c14362Mo10732.m32962() == EnumC5645.REGULAR) {
                    c3330 = new C3330(false, true);
                } else {
                    c3330 = new C3330(true, false);
                }
            } catch (RuntimeException | C23750 unused) {
                boolean z3 = enumC6986M37980 == EnumC6986.ATOMIC;
                c3330 = new C3330(!z3, z3);
            }
            C5276 c5276M43849 = C19247.m43849(e);
            C5276 c5276M11407 = e.m52799() != EnumC23080.IO_ERROR ? c5276M43849 : C5276.m11407("FILE_DELETE_FAILED", "Failed to permanently delete the local file.", "warning", (JSONArray) null, new JSONObject(c5276M43849.f12412));
            String str5 = c9385M43852.f25641;
            z = c3330.f6507;
            z2 = c3330.f6508;
            c5276M37979 = m37979(c5276M11407, str, str5, str4, z, z2, jSONArrayArray);
        }
        if (z || !z2) {
            try {
                this.f49359.getClass();
                C19553.m44409();
                C16114.m36694(str);
                C18211.m41420();
            } catch (RuntimeException unused2) {
                for (JSONValue jSONValue : jSONArrayArray) {
                    if (!jSONValue.isString() || !"File change notification could not be completed.".equals(jSONValue.asString())) {
                    }
                }
                jSONArrayArray.add("File change notification could not be completed.");
            }
        }
        if (c5276M37979 != null) {
            throw m37979(c5276M37979, str, c9385M43852.f25641, str4, z, z2, jSONArrayArray);
        }
        return new C10036(new JSONArray(jSONArrayArray), str);
    }

    /* JADX INFO: renamed from: ֫ */
    private C14362 m37982(AbstractC17043 abstractC17043) throws C5276 {
        try {
            return abstractC17043.mo25509().mo10732();
        } catch (C23750 e) {
            this.f49360.getClass();
            throw C19247.m43849(e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m37983(C14362 c14362, String str) throws C5276 {
        int i = C7354.f19272[c14362.m32962().ordinal()];
        C19247 c19247 = this.f49360;
        if (i == 2) {
            c19247.getClass();
            throw C19247.m43851(str);
        }
        if (i == 3) {
            throw C21740.m49020(c14362, c19247, "FILE_NOT_REGULAR", "Directory paths must be deleted with mt_file_delete_directory.", str);
        }
        if (i == 4) {
            throw C21740.m49020(c14362, c19247, "FILE_IS_SYMLINK", "Symbolic links are not accepted by mt_file_delete.", str);
        }
        if (i == 5) {
            throw C21740.m49020(c14362, c19247, "FILE_UNSUPPORTED_TYPE", "Special nodes cannot be deleted by general file tools.", str);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static EnumC6986 m37980(AbstractC17043 abstractC17043, String str) throws C5276 {
        EnumC6986 enumC6986Mo10729 = abstractC17043.mo25509().mo10729(EnumC15032.DELETE_FILE_OR_LINK);
        if (enumC6986Mo10729 != EnumC6986.UNSUPPORTED) {
            return enumC6986Mo10729;
        }
        throw C5276.m11411("FILE_BACKEND_UNSUPPORTED", "The file backend does not support checked permanent deletion.", "fatal", null, C9417.m21913(MotionUtils.EASING_TYPE_PATH, abstractC17043.mo25505(), "policyRevision", str).add("operation", "delete_file").add("backendReason", "unsupported").add("changed", false).add("operationMode", JSON.NULL).add("stateKnown", true).add("warnings", new JSONArray(JSON.array())));
    }

    /* JADX INFO: renamed from: ֫ */
    public static C5276 m37979(C5276 c5276, String str, String str2, String str3, boolean z, boolean z2, JSONArray jSONArray) {
        JSONObject jSONObject = c5276.f12412;
        JSONArray jSONArray2 = c5276.f12407;
        String str4 = c5276.f12414;
        String str5 = c5276.f12413;
        JSONObject jSONObject2 = new JSONObject(jSONObject);
        jSONObject2.put(MotionUtils.EASING_TYPE_PATH, str);
        jSONObject2.put("policyRevision", str2);
        jSONObject2.put("changed", z);
        jSONObject2.put("operationMode", JSON.value(str3));
        jSONObject2.put("stateKnown", z2);
        jSONObject2.put("warnings", new JSONArray(jSONArray));
        if (c5276.f12410) {
            return C5276.m11407(str5, c5276.getMessage(), str4, jSONArray2, jSONObject2);
        }
        return C5276.m11411(str5, c5276.getMessage(), str4, jSONArray2, jSONObject2);
    }
}
