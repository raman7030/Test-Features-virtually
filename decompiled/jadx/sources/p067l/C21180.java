package p067l;

import bin.p000mt.json.JSON;
import bin.p000mt.json.JSONArray;
import bin.p000mt.json.JSONObject;
import bin.p000mt.json.JSONValue;
import com.google.android.material.motion.MotionUtils;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.᩵᩻ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: J7AM */
/* JADX INFO: loaded from: classes4.dex */
public final class C21180 {

    /* JADX INFO: renamed from: ۘ */
    public static final ReentrantLock f66565 = new ReentrantLock(true);

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC12139 f66566;

    /* JADX INFO: renamed from: ۖ */
    public final C12383 f66567;

    /* JADX INFO: renamed from: ۜ */
    public final C3073 f66568;

    /* JADX INFO: renamed from: ۡ */
    public final C7589 f66569;

    /* JADX INFO: renamed from: ۢ */
    public final C21771 f66570;

    /* JADX INFO: renamed from: ۧ */
    public final C17384 f66571;

    /* JADX INFO: renamed from: ܳ */
    public C11121 f66572;

    /* JADX INFO: renamed from: ܺ */
    public final C10371 f66573;

    /* JADX INFO: renamed from: ܽ */
    public final C18496 f66574;

    /* JADX INFO: renamed from: ܿ */
    public final C9109 f66575;

    /* JADX INFO: renamed from: ᩳ */
    public final C10443 f66576;

    /* JADX INFO: renamed from: ᩷ */
    public final C7768 f66577;

    /* JADX INFO: renamed from: ᩻ */
    public final C22521 f66578;

    /* JADX INFO: renamed from: ֫ */
    public static void m47817(AbstractC17043 abstractC17043) throws C5276 {
        try {
            EnumC5645 enumC5645M32962 = abstractC17043.mo25509().mo10732().m32962();
            if (enumC5645M32962 == EnumC5645.MISSING) {
                throw C5276.m11405("PATH_NOT_FOUND", "Path does not exist");
            }
            if (enumC5645M32962 == EnumC5645.REGULAR) {
                return;
            }
            throw C5276.m11410("PATH_NOT_FILE", "APK source must be a regular file: " + enumC5645M32962.name());
        } catch (C23750 e) {
            throw C5276.m11405(e.m52799() == EnumC23080.PERMISSION_DENIED ? "FILE_ACCESS_DENIED" : "PATH_READ_FAILED", "Cannot access APK source: " + e.m52799().name());
        }
    }

    public C21180() {
        C10371 c10371 = new C10371();
        C11792 c11792 = new C11792();
        C6072 c6072 = new C6072();
        this.f66572 = new C11121(this);
        this.f66573 = c10371;
        C10685 c10685 = new C10685();
        C13480 c13480 = new C13480();
        C12107 c12107 = new C12107();
        C17384 c17384 = new C17384(c13480, c12107, c11792);
        this.f66571 = c17384;
        C9109 c9109 = new C9109(c10371, c11792);
        this.f66575 = c9109;
        C10443 c10443 = new C10443(c13480, c10685, new C11121(this));
        this.f66576 = c10443;
        c13480.m30629(c10443);
        this.f66577 = new C7768(c10371, c11792, c9109, c10443, c12107);
        this.f66574 = new C18496(c10371);
        this.f66578 = new C22521(c10371, c13480, c17384, c12107);
        this.f66568 = new C3073(c17384, c12107);
        this.f66569 = new C7589(c13480, c17384, c12107, c6072);
        this.f66567 = new C12383(c13480, c17384);
        this.f66570 = new C21771(c17384, c12107);
        C19553.m44409();
        this.f66566 = new C3185();
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m47821(String str, String str2) {
        ReentrantLock reentrantLock = f66565;
        reentrantLock.lock();
        try {
            return this.f66571.m39595(this.f66577.m17932(str), str2);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final Object m47822(String str, String str2, String str3, InterfaceC6427 interfaceC6427) {
        ReentrantLock reentrantLock = f66565;
        reentrantLock.lock();
        try {
            int iM39595 = this.f66571.m39595(this.f66577.m17932(str), str2);
            if (str3 != null) {
                C20186.m45667(str3, iM39595, str, str2);
            }
            return interfaceC6427.mo13964(iM39595);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final Object m47823(String str, InterfaceC5086 interfaceC5086) {
        ReentrantLock reentrantLock = f66565;
        reentrantLock.lock();
        try {
            return interfaceC5086.mo10813(this.f66577.m17932(str), this.f66571);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final Object m47824(String str, InterfaceC17825 interfaceC17825) {
        ReentrantLock reentrantLock = f66565;
        reentrantLock.lock();
        try {
            return interfaceC17825.mo3479(this.f66577.m17932(str), this.f66571);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C4336 m47825(C14473 c14473) {
        ReentrantLock reentrantLock = f66565;
        reentrantLock.lock();
        try {
            return this.f66571.m39581(this.f66577.m17932(c14473.f41344), c14473);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C5007 m47826(C11319 c11319, C17502 c17502) {
        ReentrantLock reentrantLock = f66565;
        reentrantLock.lock();
        try {
            return this.f66567.m28495(this.f66577.m17932(c11319.f31513), c11319, c17502);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC5050 m47827(C3942 c3942, C17502 c17502) {
        AbstractC5050 abstractC5050M5183;
        ReentrantLock reentrantLock = f66565;
        reentrantLock.lock();
        try {
            C3073 c3073 = this.f66568;
            C16484 c16484M17932 = this.f66577.m17932(c3942.f8568);
            if ("resource_item".equals(c3942.f8564.f57813)) {
                abstractC5050M5183 = c3073.m5186(c16484M17932, c3942);
            } else if ("hex".equals(c3942.f8566)) {
                abstractC5050M5183 = c3073.m5185(c16484M17932, c3942);
            } else {
                abstractC5050M5183 = c3073.m5183(c16484M17932, c3942, c17502);
            }
            return abstractC5050M5183;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C5283 m47828(C24531 c24531) {
        ReentrantLock reentrantLock = f66565;
        reentrantLock.lock();
        try {
            return m47813(this, c24531);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C5954 m47829(C23191 c23191, String str) {
        ReentrantLock reentrantLock = f66565;
        reentrantLock.lock();
        try {
            C16484 c16484M17932 = this.f66577.m17932(c23191.f72868);
            C17384 c17384 = this.f66571;
            String str2 = c23191.f72865;
            C5954 c5954M5483 = ((C3185) this.f66566).m5483(c16484M17932, c23191, c17384.m39590(c16484M17932, str2), str);
            c17384.m39594(c16484M17932, str2);
            return c5954M5483;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C7295 m47830(C21850 c21850, C17502 c17502) {
        ReentrantLock reentrantLock = f66565;
        reentrantLock.lock();
        try {
            return this.f66571.m39582(this.f66577.m17932(c21850.f68750), c21850, c17502);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C7965 m47831(C17154 c17154) {
        ReentrantLock reentrantLock = f66565;
        reentrantLock.lock();
        try {
            return this.f66571.m39583(this.f66577.m17932(c17154.f51089), c17154);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C9030 m47832(C24729 c24729, C17502 c17502) {
        ReentrantLock reentrantLock = f66565;
        reentrantLock.lock();
        try {
            return this.f66569.m17531(this.f66577.m17932(c24729.f78293), c24729, c17502);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C14000 m47836(C9779 c9779) {
        ReentrantLock reentrantLock = f66565;
        reentrantLock.lock();
        try {
            return this.f66571.m39588(this.f66577.m17932(c9779.f27012), c9779);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C15340 m47837(C18023 c18023) {
        ReentrantLock reentrantLock = f66565;
        reentrantLock.lock();
        try {
            return this.f66568.m5184(this.f66577.m17932(c18023.f53811), c18023);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C16681 m47838(C7097 c7097) {
        ReentrantLock reentrantLock = f66565;
        reentrantLock.lock();
        try {
            return m47814(this, c7097);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C19088 m47839(C18694 c18694, C17502 c17502) {
        ReentrantLock reentrantLock = f66565;
        reentrantLock.lock();
        try {
            return this.f66570.m49143(this.f66577.m17932(c18694.f55829), c18694, c17502);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C20707 m47840(C23861 c23861) {
        ReentrantLock reentrantLock = f66565;
        reentrantLock.lock();
        try {
            return m47815(this, c23861);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C21377 m47841(C13803 c13803, C17502 c17502) {
        ReentrantLock reentrantLock = f66565;
        reentrantLock.lock();
        try {
            return m47816(this, c13803, c17502);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C22718 m47842(C5756 c5756) {
        ReentrantLock reentrantLock = f66565;
        reentrantLock.lock();
        try {
            return this.f66571.m39591(this.f66577.m17932(c5756.f14117));
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C22718 m47843(C8438 c8438, C17502 c17502) {
        ReentrantLock reentrantLock = f66565;
        reentrantLock.lock();
        try {
            return this.f66571.m39592(this.f66577.m17932(c8438.f22625), c8438, c17502);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final C10271 m47845(String str) {
        ReentrantLock reentrantLock = f66565;
        reentrantLock.lock();
        try {
            return C23012.m51397(this.f66577.m17932(str).m37409());
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m47848(String str) {
        ReentrantLock reentrantLock = f66565;
        reentrantLock.lock();
        try {
            this.f66577.m17932(str);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public final C16405 m47849(String str) {
        ReentrantLock reentrantLock = f66565;
        reentrantLock.lock();
        try {
            C16484 c16484M17932 = this.f66577.m17932(str);
            this.f66569.getClass();
            String str2 = c16484M17932.f48416;
            C9456 c9456 = c16484M17932.f48431;
            boolean z = c9456.f25792;
            boolean z2 = false;
            boolean z3 = z && c9456.f25793 > 0;
            if (z && c9456.f25795 > 0) {
                z2 = true;
            }
            return new C16405(str2, z3, z2, c16484M17932.f48413.f62838);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m47819(C21180 c21180, C16484 c16484) {
        ReentrantLock reentrantLock = f66565;
        reentrantLock.lock();
        try {
            c21180.f66577.m17928(c16484);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C13133 m47835() {
        C18496 c18496 = this.f66574;
        C12826.requireNonNull(c18496);
        ReentrantLock reentrantLock = f66565;
        reentrantLock.lock();
        try {
            return c18496.m42038();
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C5283 m47813(C21180 c21180, C24531 c24531) throws C5276 {
        C10371 c10371 = c21180.f66573;
        C7768 c7768 = c21180.f66577;
        String str = c24531.f77694;
        if (str != null) {
            try {
                C2994 c2994M24022 = c10371.m24022(str);
                if (c2994M24022.f5313) {
                    throw C5276.m11409(JSON.array(), "TEMPORARY_WORKSPACE_REOPEN_UNSUPPORTED", "Temporary workspaces cannot be reopened. Open the APK path again instead.", "fatal");
                }
                C16484 c16484M17927 = c7768.m17927(c2994M24022.f5323);
                C19515.m44346(c16484M17927.f48409.f67922);
                return c21180.m47812(c16484M17927);
            } catch (C5276 e) {
                if ("WORKSPACE_NOT_FOUND".equals(e.f12413)) {
                    throw m47809(e);
                }
                throw e;
            }
        }
        String strM29354 = c24531.f77691;
        if (strM29354 == null && (strM29354 = C12810.m29354()) == null) {
            throw m47809(C5276.m11403(null, "CURRENT_APK_NOT_AVAILABLE", "Current APK is not available.", "warning"));
        }
        AbstractC17043 abstractC17043M42109 = C18524.m42109(C14059.m31907(strM29354, MotionUtils.EASING_TYPE_PATH), new String[0]);
        try {
            m47817(abstractC17043M42109);
            if (c24531.f77692) {
                try {
                    C2994 c2994M24023 = c10371.m24023(abstractC17043M42109);
                    if (c2994M24023 != null) {
                        try {
                            C16484 c16484M17928 = c7768.m17927(c2994M24023.f5323);
                            C19515.m44346(c16484M17928.f48409.f67922);
                            return c21180.m47812(c16484M17928);
                        } catch (C5276 e2) {
                            if (!"WORKSPACE_CORRUPT".equals(e2.f12413)) {
                                throw e2;
                            }
                        }
                    }
                } catch (IOException e3) {
                    throw m47809(C5276.m11410("PATH_READ_FAILED", e3.getMessage() == null ? "Failed to read APK" : e3.getMessage()));
                }
            }
            try {
                C16484 c16484M21055 = c21180.f66575.m21055(abstractC17043M42109, c24531.f77693);
                c7768.m17926(c16484M21055);
                c7768.m17929(c16484M21055.f48416);
                C17548.m39937();
                return c21180.m47812(c16484M21055);
            } catch (C5276 e4) {
                if ("APK_OPEN_BLOCKED".equals(e4.f12413)) {
                    throw e4;
                }
                throw m47809(e4);
            }
        } catch (C5276 e5) {
            throw m47809(e5);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m47820(C22198 c22198, Supplier supplier) {
        ReentrantLock reentrantLock = f66565;
        reentrantLock.lock();
        try {
            C21180 c21180 = (C21180) supplier.get();
            if (c21180 != null) {
                c21180.f66577.m17931(c22198.f70207);
            }
            new C11469().m26468(c22198);
            if (c21180 != null) {
                c21180.f66577.m17930(c22198.f70207);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m47818(C19358 c19358) {
        ReentrantLock reentrantLock = f66565;
        reentrantLock.lock();
        try {
            ArrayList arrayListM26466 = new C11469().m26466();
            int size = arrayListM26466.size();
            int size2 = arrayListM26466.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    break;
                }
                C19553.m44409();
                if (size <= C21292.m48115()) {
                    break;
                }
                C22198 c22198 = (C22198) arrayListM26466.get(size2);
                try {
                    m47820(c22198, c19358);
                    size--;
                } catch (IOException e) {
                    C21306.m48192("MT MCP excess workspace delete failed, workspaceId=" + c22198.f70207, e);
                }
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C20707 m47815(C21180 c21180, C23861 c23861) throws C5276 {
        String str = c23861.f75789;
        C7768 c7768 = c21180.f66577;
        try {
            C2994 c2994M24022 = c21180.f66573.m24022(str);
            AbstractC17043 abstractC17043 = c2994M24022.f5320;
            String str2 = c2994M24022.f5323;
            c7768.m17931(str2);
            try {
                ((C21180) c21180.f66572.f30841).f66573.getClass();
                C10371.m24018(abstractC17043);
                if (abstractC17043.mo25094()) {
                    throw new IOException("Workspace directory still exists");
                }
                c7768.m17930(str2);
                C17548.m39937();
                return new C20707(str2, c2994M24022.f5313);
            } catch (IOException e) {
                throw m47810(C5276.m11409(JSON.array(), "WORKSPACE_CLOSE_FAILED", e.getMessage() == null ? "Failed to close workspace." : e.getMessage(), "warning"), str2, Boolean.valueOf(c2994M24022.f5313));
            }
        } catch (C5276 e2) {
            throw m47810(e2, str, (Boolean) null);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C21377 m47816(C21180 c21180, C13803 c13803, C17502 c17502) throws C5276 {
        C22521 c22521 = c21180.f66578;
        C16484 c16484M17932 = c21180.f66577.m17932(c13803.f39006);
        String str = c13803.f39000;
        if ("dex_class_outline".equals(str)) {
            return c22521.m50475(c16484M17932, c13803, c17502);
        }
        if ("zip_entries".equals(str)) {
            return c22521.m50476(c16484M17932, c13803);
        }
        if ("dex_classes".equals(str)) {
            return c22521.m50474(c16484M17932, c13803);
        }
        if ("resource_table".equals(str)) {
            return c22521.m50477(c16484M17932, c13803);
        }
        throw C5276.m11406("Unsupported view", (String) null, (JSONValue) null, (JSONArray) null, (JSONObject) null);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C11042 m47833(C8636 c8636, OutputStream outputStream) throws C5276 {
        String str = c8636.f23190;
        try {
            ReentrantLock reentrantLock = f66565;
            reentrantLock.lock();
            try {
                return this.f66571.m39586(this.f66577.m17932(str), c8636, outputStream);
            } finally {
                reentrantLock.unlock();
            }
        } catch (C5276 e) {
            throw m47811(e, str, c8636.f23188, c8636.f23189);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C11042 m47834(C22048 c22048, InterfaceC20509 interfaceC20509) throws C5276 {
        String str = c22048.f69372;
        try {
            ReentrantLock reentrantLock = f66565;
            reentrantLock.lock();
            try {
                return this.f66571.m39587(this.f66577.m17932(str), c22048, interfaceC20509);
            } finally {
                reentrantLock.unlock();
            }
        } catch (C5276 e) {
            throw m47811(e, str, c22048.f69369, c22048.f69370);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C5276 m47811(C5276 c5276, String str, String str2, String str3) {
        String str4 = c5276.f12413;
        if (!"EDIT_SESSION_STORAGE_FAILED".equals(str4)) {
            return c5276;
        }
        return C5276.m11411(str4, "Edit session storage failed.", c5276.f12414, JSON.array(), JSON.object().add("workspaceId", str).add("editSessionId", str2 == null ? JSON.NULL : JSON.value(str2)).add("entryName", str3).add("backendReason", c5276.f12412.getString("backendReason", "workspace_storage_failure")));
    }

    /* JADX INFO: renamed from: ֫ */
    public static C16681 m47814(C21180 c21180, C7097 c7097) {
        C17384 c17384 = c21180.f66571;
        C7768 c7768 = c21180.f66577;
        String str = c7097.f18502;
        String str2 = c7097.f18500;
        C16484 c16484M17932 = c7768.m17932(str);
        if (!c7097.f18501) {
            C22718 c22718M39606 = c17384.m39606(c16484M17932, str2);
            String str3 = c22718M39606.f71657;
            String str4 = c22718M39606.f71656;
            c17384.m39595(c16484M17932, str2);
            int i = c22718M39606.f71661;
            int i2 = c22718M39606.f71658;
            ArrayList arrayList = new ArrayList(c22718M39606.f71660);
            new ArrayList();
            return new C16681(str3, str4, false, i, i2, arrayList, "not_run", new ArrayList(), 0, 0, new ArrayList(), new ArrayList(), new ArrayList());
        }
        return ((C3185) c21180.f66566).m5484(c16484M17932, c17384.m39590(c16484M17932, str2));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m47844(String str) {
        ReentrantLock reentrantLock = f66565;
        try {
            reentrantLock.lock();
            try {
                C16484 c16484M17925 = this.f66577.m17925(str);
                if (c16484M17925 != null && !c16484M17925.f48415 && !c16484M17925.f48412) {
                    this.f66576.m24154(c16484M17925);
                }
            } finally {
                reentrantLock.unlock();
            }
        } catch (Exception e) {
            C21306.m48192("MT MCP smali cache activation failed, workspaceId=" + str, e);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC21173 m47846() {
        return this.f66576.m24153();
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m47847() {
        this.f66576.m24156();
    }

    /* JADX INFO: renamed from: ֫ */
    public static C5276 m47810(C5276 c5276, String str, Boolean bool) {
        return C5276.m11411(c5276.f12413, c5276.getMessage(), c5276.f12414, JSON.array(), new JSONObject(c5276.f12412).put("workspaceId", str).put("temporary", bool == null ? JSON.NULL : JSON.value(bool.booleanValue())));
    }

    /* JADX INFO: renamed from: ֫ */
    public static C5276 m47809(C5276 c5276) {
        JSONArray jSONArray = c5276.f12407;
        JSONObject jSONObject = c5276.f12412;
        String str = c5276.f12414;
        String str2 = c5276.f12413;
        JSONArray jSONArray2 = new JSONArray(jSONArray);
        jSONArray2.add(C11982.m27418(JSON.object().add("prefix", "").add("limit", 50), "mt_apk_list_available_apks", "inspect", "List APK targets that mt_apk_workspace_open can open"));
        if (c5276.f12410) {
            return C5276.m11407(str2, c5276.getMessage(), str, jSONArray2, jSONObject);
        }
        return C5276.m11411(str2, c5276.getMessage(), str, jSONArray2, jSONObject);
    }

    /* JADX INFO: renamed from: ֫ */
    private C5283 m47812(C16484 c16484) {
        String str = c16484.f48416;
        boolean z = c16484.f48412;
        String strSubstring = c16484.f48427;
        if (strSubstring == null || strSubstring.isEmpty() || strSubstring.endsWith("/")) {
            strSubstring = null;
        } else {
            int iLastIndexOf = strSubstring.lastIndexOf(47);
            if (iLastIndexOf >= 0) {
                strSubstring = strSubstring.substring(iLastIndexOf + 1);
            }
        }
        String str2 = strSubstring;
        AbstractC17043 abstractC17043M37409 = c16484.m37409();
        this.f66575.getClass();
        try {
            InputStream inputStreamMo29987 = abstractC17043M37409.mo29987();
            try {
                int i = 65536;
                C2864 c2864 = new C2864(65536);
                byte[] bArr = new byte[8192];
                while (i > 0) {
                    int i2 = inputStreamMo29987.read(bArr, 0, Math.min(8192, i));
                    if (i2 == -1) {
                        break;
                    }
                    c2864.write(bArr, 0, i2);
                    i -= i2;
                }
                byte[] bArr2 = c2864.f4949;
                int i3 = c2864.f4950;
                MessageDigest messageDigestM36668 = C16111.m36668();
                messageDigestM36668.update(bArr2, 0, i3);
                C16111.m36665(messageDigestM36668.digest());
                if (inputStreamMo29987 != null) {
                    inputStreamMo29987.close();
                }
            } catch (Throwable th) {
                if (inputStreamMo29987 != null) {
                    try {
                        inputStreamMo29987.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (Exception unused) {
        }
        ArrayList arrayList = c16484.f48428;
        ArrayList arrayList2 = c16484.f48423;
        C21527 c21527 = c16484.f48409;
        C9456 c9456 = c16484.f48431;
        C20350 c20350 = c16484.f48413;
        Iterator it = arrayList.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            if (((C15554) it.next()).f44436.toLowerCase(Locale.ROOT).endsWith(".xml")) {
                i4++;
            }
        }
        C9456 c9457 = c16484.f48431;
        boolean z2 = c9457.f25792;
        return new C5283(str, z, str2, arrayList, arrayList2, c21527, c9456, c20350, i4, z2 && c9457.f25793 > 0, z2 && c9457.f25795 > 0, C23012.m51397(c16484.m37409()));
    }
}
