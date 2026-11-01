package p067l;

import bin.p000mt.json.JSON;
import bin.p000mt.json.JSONArray;
import bin.p000mt.json.JSONObject;
import com.google.android.material.motion.MotionUtils;
import com.umeng.commonsdk.internal.C0773c;
import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: l.ᩳۖۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: U6XZ */
/* JADX INFO: loaded from: classes4.dex */
public final class C19247 {

    /* JADX INFO: renamed from: ֫ */
    public final C22829 f57522;

    /* JADX INFO: renamed from: ۧ */
    public final C5410 f57523;

    /* JADX INFO: renamed from: ܽ */
    public final C7848 f57524;

    public C19247(C22829 c22829, C7848 c7848) {
        C5410 c5410 = new C5410(10);
        this.f57522 = c22829;
        C12826.requireNonNull(c7848, "pathCoordinator");
        this.f57524 = c7848;
        this.f57523 = c5410;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C9385 m43852() {
        return this.f57522.m51035();
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m43844(String str, C9385 c9385, String str2) throws C5276 {
        String strM31903 = C14059.m31903(c9385, str, str2, false);
        c9385.m21856(strM31903);
        return strM31903;
    }

    /* JADX INFO: renamed from: ۧ */
    public static String m43850(String str, C9385 c9385, String str2) throws C5276 {
        String strM31903 = C14059.m31903(c9385, str, str2, false);
        c9385.m21857(strM31903);
        c9385.m21855(strM31903);
        return strM31903;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C11872 m43853(String str) {
        return this.f57524.m18139(str);
    }

    /* JADX INFO: renamed from: ۧ */
    public final C11872 m43856(String str) {
        return this.f57524.m18142(str);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C11872 m43854(List list) {
        return this.f57524.m18140((Collection) list);
    }

    /* JADX INFO: renamed from: ܽ */
    public final AbstractC17043 m43857(String str) {
        return this.f57523.m11882(str);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final C14362 m43858(String str) throws C5276 {
        try {
            return this.f57523.m11882(str).mo25509().mo10732();
        } catch (C23750 e) {
            throw m43849(e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m43855(AbstractC17043 abstractC17043, InterfaceC17905 interfaceC17905) throws C5276 {
        if (abstractC17043.mo29978() || (abstractC17043 instanceof C14912) || (abstractC17043 instanceof C14717)) {
            String parent = abstractC17043.getParent();
            boolean z = true;
            while (parent != null) {
                this.f57523.getClass();
                AbstractC17043 abstractC17043M42109 = C18524.m42109(parent, new String[0]);
                try {
                    C14362 c14362Mo10732 = abstractC17043M42109.mo25509().mo10732();
                    if (c14362Mo10732.m32962() == EnumC5645.LINK) {
                        throw interfaceC17905.mo24636("FILE_IS_SYMLINK", "A symbolic-link parent cannot be traversed by a destructive file tool.", "parent_is_link");
                    }
                    if (c14362Mo10732.m32962() == EnumC5645.MISSING) {
                        throw interfaceC17905.mo24636(z ? "FILE_PARENT_NOT_FOUND" : "FILE_LINK_CHECK_FAILED", z ? "The target parent directory does not exist." : "An existing parent chain could not be verified safely.", z ? "parent_missing" : "ancestor_missing");
                    }
                    if (c14362Mo10732.m32962() != EnumC5645.DIRECTORY) {
                        throw interfaceC17905.mo24636("FILE_NOT_DIRECTORY", "A target parent is not a directory.", c14362Mo10732.m32962().name().toLowerCase(Locale.ROOT));
                    }
                    parent = abstractC17043M42109.getParent();
                    z = false;
                } catch (C23750 e) {
                    throw interfaceC17905.mo24636("FILE_LINK_CHECK_FAILED", "A parent link status could not be verified safely.", e.m52799().name().toLowerCase(Locale.ROOT));
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C5276 m43849(C23750 c23750) {
        String str;
        boolean z = false;
        switch (C12542.f35251[c23750.m52799().ordinal()]) {
            case 1:
                str = "FILE_NOT_FOUND";
                z = true;
                break;
            case 2:
                str = "FILE_ALREADY_EXISTS";
                z = true;
                break;
            case 3:
                str = "FILE_NOT_REGULAR";
                break;
            case 4:
                str = "FILE_NOT_DIRECTORY";
                break;
            case 5:
                str = "FILE_DIRECTORY_NOT_EMPTY";
                z = true;
                break;
            case 6:
                str = "FILE_ACCESS_DENIED";
                break;
            case 7:
            case 8:
                str = "FILE_BACKEND_UNSUPPORTED";
                break;
            default:
                str = "FILE_STORAGE_ERROR";
                z = true;
                break;
        }
        JSONObject jSONObjectAdd = JSON.object().add(MotionUtils.EASING_TYPE_PATH, c23750.m52798()).add("targetPath", c23750.m52800() == null ? JSON.NULL : JSON.value(c23750.m52800()));
        String strName = c23750.m52797().name();
        Locale locale = Locale.ROOT;
        JSONObject jSONObjectAdd2 = jSONObjectAdd.add("operation", strName.toLowerCase(locale)).add("backendReason", c23750.m52799().name().toLowerCase(locale));
        if (z) {
            return C5276.m11407(str, c23750.getMessage(), "warning", (JSONArray) null, jSONObjectAdd2);
        }
        return C5276.m11411(str, c23750.getMessage(), "fatal", null, jSONObjectAdd2);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C5276 m43846(String str, IOException iOException) {
        return m43847(str, iOException.getClass().getSimpleName());
    }

    /* JADX INFO: renamed from: ֫ */
    public static C5276 m43845(RuntimeException runtimeException, String str) {
        return m43847(str, runtimeException.getClass().getSimpleName());
    }

    /* JADX INFO: renamed from: ֫ */
    public static C5276 m43847(String str, String str2) {
        return C5276.m11407("FILE_STORAGE_ERROR", "Failed to read local file content.", "warning", (JSONArray) null, C9417.m21913(MotionUtils.EASING_TYPE_PATH, str, "operation", "read").add("backendReason", str2));
    }

    /* JADX INFO: renamed from: ܿ */
    public static C5276 m43851(String str) {
        return C5276.m11407("FILE_NOT_FOUND", "The requested file path does not exist.", "warning", (JSONArray) null, C9417.m21913(MotionUtils.EASING_TYPE_PATH, str, "operation", C0773c.f3251h));
    }

    /* JADX INFO: renamed from: ֫ */
    public static C5276 m43848(String str, String str2, String str3, EnumC5645 enumC5645) {
        String str4;
        int i = C12542.f35252[enumC5645.ordinal()];
        if (i == 1) {
            str4 = "regular file";
        } else if (i == 2) {
            str4 = "directory";
        } else if (i == 3) {
            str4 = "symbolic link";
        } else if (i == 4) {
            str4 = "special node";
        } else {
            if (i != 5) {
                throw new IncompatibleClassChangeError();
            }
            str4 = "missing path";
        }
        JSONObject jSONObjectAdd = C9417.m21913(MotionUtils.EASING_TYPE_PATH, str3, "operation", C0773c.f3251h).add("backendReason", enumC5645.name().toLowerCase(Locale.ROOT));
        if (("FILE_NOT_REGULAR".equals(str) && enumC5645 == EnumC5645.DIRECTORY) || ("FILE_NOT_DIRECTORY".equals(str) && enumC5645 == EnumC5645.REGULAR)) {
            return C5276.m11407(str, str2 + " Found: " + str4 + ".", "warning", (JSONArray) null, jSONObjectAdd);
        }
        return C5276.m11411(str, str2 + " Found: " + str4 + ".", "fatal", null, jSONObjectAdd);
    }
}
