package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
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
public final class C19793 {

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static final ReentrantLock f63928 = new ReentrantLock(true);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC10280 f63929;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C10537 f63930;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C0741 f63931;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C5493 f63932;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C20415 f63933;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C15799 f63934;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C9209 f63935;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C8420 f63936;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C16969 f63937;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C7092 f63938;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C8495 f63939;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C5681 f63940;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C21204 f63941;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m45506(AbstractC15440 abstractC15440) throws C3059 {
        try {
            EnumC3447 enumC3447M30885 = abstractC15440.mo23558().mo8672().m30885();
            if (enumC3447M30885 == EnumC3447.MISSING) {
                throw C3059.m9363("PATH_NOT_FOUND", "Path does not exist");
            }
            if (enumC3447M30885 == EnumC3447.REGULAR) {
                return;
            }
            throw C3059.m9368("PATH_NOT_FILE", "APK source must be a regular file: " + enumC3447M30885.name());
        } catch (C22497 e) {
            throw C3059.m9363(e.m50458() == EnumC21792.PERMISSION_DENIED ? "FILE_ACCESS_DENIED" : "PATH_READ_FAILED", "Cannot access APK source: " + e.m50458().name());
        }
    }

    public C19793() {
        C8420 c8420 = new C8420();
        C9915 c9915 = new C9915();
        C3897 c3897 = new C3897();
        this.f63935 = new C9209(this);
        this.f63936 = c8420;
        C8751 c8751 = new C8751();
        C11691 c11691 = new C11691();
        C10247 c10247 = new C10247();
        C15799 c15799 = new C15799(c11691, c10247, c9915);
        this.f63934 = c15799;
        C7092 c7092 = new C7092(c8420, c9915);
        this.f63938 = c7092;
        C8495 c8495 = new C8495(c11691, c8751, new C9209(this));
        this.f63939 = c8495;
        c11691.m28581(c8495);
        this.f63940 = new C5681(c8420, c9915, c7092, c8495, c10247);
        this.f63937 = new C16969(c8420);
        this.f63941 = new C21204(c8420, c11691, c15799, c10247);
        this.f63931 = new C0741(c15799, c10247);
        this.f63932 = new C5493(c11691, c15799, c10247, c3897);
        this.f63930 = new C10537(c11691, c15799);
        this.f63933 = new C20415(c15799, c10247);
        C18081.m42150();
        this.f63929 = new C0859();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m45510(String str, String str2) {
        ReentrantLock reentrantLock = f63928;
        reentrantLock.lock();
        try {
            return this.f63934.m37424(this.f63940.m15997(str), str2);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object m45511(String str, String str2, String str3, InterfaceC4270 interfaceC4270) {
        ReentrantLock reentrantLock = f63928;
        reentrantLock.lock();
        try {
            int iM37424 = this.f63934.m37424(this.f63940.m15997(str), str2);
            if (str3 != null) {
                C18747.m43400(str3, iM37424, str, str2);
            }
            return interfaceC4270.mo12044(iM37424);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object m45512(String str, InterfaceC2859 interfaceC2859) {
        ReentrantLock reentrantLock = f63928;
        reentrantLock.lock();
        try {
            return interfaceC2859.mo8746(this.f63940.m15997(str), this.f63934);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object m45513(String str, InterfaceC16263 interfaceC16263) {
        ReentrantLock reentrantLock = f63928;
        reentrantLock.lock();
        try {
            return interfaceC16263.mo1083(this.f63940.m15997(str), this.f63934);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C2070 m45514(C12736 c12736) {
        ReentrantLock reentrantLock = f63928;
        reentrantLock.lock();
        try {
            return this.f63934.m37410(this.f63940.m15997(c12736.f38304), c12736);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C2776 m45515(C9418 c9418, C15923 c15923) {
        ReentrantLock reentrantLock = f63928;
        reentrantLock.lock();
        try {
            return this.f63930.m26462(this.f63940.m15997(c9418.f28566), c9418, c15923);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC2821 m45516(C1656 c1656, C15923 c15923) {
        AbstractC2821 abstractC2821M2854;
        ReentrantLock reentrantLock = f63928;
        reentrantLock.lock();
        try {
            C0741 c0741 = this.f63931;
            C14852 c14852M15997 = this.f63940.m15997(c1656.f5788);
            if ("resource_item".equals(c1656.f5784.f54616)) {
                abstractC2821M2854 = c0741.m2857(c14852M15997, c1656);
            } else if ("hex".equals(c1656.f5786)) {
                abstractC2821M2854 = c0741.m2856(c14852M15997, c1656);
            } else {
                abstractC2821M2854 = c0741.m2854(c14852M15997, c1656, c15923);
            }
            return abstractC2821M2854;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C3067 m45517(C23319 c23319) {
        ReentrantLock reentrantLock = f63928;
        reentrantLock.lock();
        try {
            return m45502(this, c23319);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C3773 m45518(C21909 c21909, String str) {
        ReentrantLock reentrantLock = f63928;
        reentrantLock.lock();
        try {
            C14852 c14852M15997 = this.f63940.m15997(c21909.f70154);
            C15799 c15799 = this.f63934;
            String str2 = c21909.f70151;
            C3773 c3773M3169 = ((C0859) this.f63929).m3169(c14852M15997, c21909, c15799.m37419(c14852M15997, str2), str);
            c15799.m37423(c14852M15997, str2);
            return c3773M3169;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C5184 m45519(C20498 c20498, C15923 c15923) {
        ReentrantLock reentrantLock = f63928;
        reentrantLock.lock();
        try {
            return this.f63934.m37411(this.f63940.m15997(c20498.f66071), c20498, c15923);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C5889 m45520(C15557 c15557) {
        ReentrantLock reentrantLock = f63928;
        reentrantLock.lock();
        try {
            return this.f63934.m37412(this.f63940.m15997(c15557.f47957), c15557);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C7009 m45521(C23528 c23528, C15923 c15923) {
        ReentrantLock reentrantLock = f63928;
        reentrantLock.lock();
        try {
            return this.f63932.m15620(this.f63940.m15997(c23528.f75547), c23528, c15923);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C12239 m45525(C7797 c7797) {
        ReentrantLock reentrantLock = f63928;
        reentrantLock.lock();
        try {
            return this.f63934.m37417(this.f63940.m15997(c7797.f24095), c7797);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C13649 m45526(C16472 c16472) {
        ReentrantLock reentrantLock = f63928;
        reentrantLock.lock();
        try {
            return this.f63931.m2855(this.f63940.m15997(c16472.f50633), c16472);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C15060 m45527(C4975 c4975) {
        ReentrantLock reentrantLock = f63928;
        reentrantLock.lock();
        try {
            return m45503(this, c4975);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C17592 m45528(C17178 c17178, C15923 c15923) {
        ReentrantLock reentrantLock = f63928;
        reentrantLock.lock();
        try {
            return this.f63933.m46820(this.f63940.m15997(c17178.f52648), c17178, c15923);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C19296 m45529(C22614 c22614) {
        ReentrantLock reentrantLock = f63928;
        reentrantLock.lock();
        try {
            return m45504(this, c22614);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C20001 m45530(C12031 c12031, C15923 c15923) {
        ReentrantLock reentrantLock = f63928;
        reentrantLock.lock();
        try {
            return m45505(this, c12031, c15923);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C21412 m45531(C3564 c3564) {
        ReentrantLock reentrantLock = f63928;
        reentrantLock.lock();
        try {
            return this.f63934.m37420(this.f63940.m15997(c3564.f11311));
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C21412 m45532(C6386 c6386, C15923 c15923) {
        ReentrantLock reentrantLock = f63928;
        reentrantLock.lock();
        try {
            return this.f63934.m37421(this.f63940.m15997(c6386.f19752), c6386, c15923);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C8315 m45534(String str) {
        ReentrantLock reentrantLock = f63928;
        reentrantLock.lock();
        try {
            return C21721.m49048(this.f63940.m15997(str).m35253());
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m45537(String str) {
        ReentrantLock reentrantLock = f63928;
        reentrantLock.lock();
        try {
            this.f63940.m15997(str);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C14769 m45538(String str) {
        ReentrantLock reentrantLock = f63928;
        reentrantLock.lock();
        try {
            C14852 c14852M15997 = this.f63940.m15997(str);
            this.f63932.getClass();
            String str2 = c14852M15997.f45300;
            C7457 c7457 = c14852M15997.f45315;
            boolean z = c7457.f22879;
            boolean z2 = false;
            boolean z3 = z && c7457.f22880 > 0;
            if (z && c7457.f22882 > 0) {
                z2 = true;
            }
            return new C14769(str2, z3, z2, c14852M15997.f45297.f59607);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m45508(C19793 c19793, C14852 c14852) {
        ReentrantLock reentrantLock = f63928;
        reentrantLock.lock();
        try {
            c19793.f63940.m15993(c14852);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C11326 m45524() {
        C16969 c16969 = this.f63937;
        C11003.requireNonNull(c16969);
        ReentrantLock reentrantLock = f63928;
        reentrantLock.lock();
        try {
            return c16969.m39795();
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3067 m45502(C19793 c19793, C23319 c23319) throws C3059 {
        C8420 c8420 = c19793.f63936;
        C5681 c5681 = c19793.f63940;
        String str = c23319.f74947;
        if (str != null) {
            try {
                C0658 c0658M22052 = c8420.m22052(str);
                if (c0658M22052.f2540) {
                    throw C3059.m9367(JSON.array(), "TEMPORARY_WORKSPACE_REOPEN_UNSUPPORTED", "Temporary workspaces cannot be reopened. Open the APK path again instead.", "fatal");
                }
                C14852 c14852M15992 = c5681.m15992(c0658M22052.f2550);
                C18041.m42095(c14852M15992.f45293.f65279);
                return c19793.m45501(c14852M15992);
            } catch (C3059 e) {
                if ("WORKSPACE_NOT_FOUND".equals(e.f9610)) {
                    throw m45498(e);
                }
                throw e;
            }
        }
        String strM27292 = c23319.f74944;
        if (strM27292 == null && (strM27292 = C10986.m27292()) == null) {
            throw m45498(C3059.m9361(null, "CURRENT_APK_NOT_AVAILABLE", "Current APK is not available.", "warning"));
        }
        AbstractC15440 abstractC15440M39866 = C16999.m39866(C12301.m29847(strM27292, MotionUtils.EASING_TYPE_PATH), new String[0]);
        try {
            m45506(abstractC15440M39866);
            if (c23319.f74945) {
                try {
                    C0658 c0658M22053 = c8420.m22053(abstractC15440M39866);
                    if (c0658M22053 != null) {
                        try {
                            C14852 c14852M15993 = c5681.m15992(c0658M22053.f2550);
                            C18041.m42095(c14852M15993.f45293.f65279);
                            return c19793.m45501(c14852M15993);
                        } catch (C3059 e2) {
                            if (!"WORKSPACE_CORRUPT".equals(e2.f9610)) {
                                throw e2;
                            }
                        }
                    }
                } catch (IOException e3) {
                    throw m45498(C3059.m9368("PATH_READ_FAILED", e3.getMessage() == null ? "Failed to read APK" : e3.getMessage()));
                }
            }
            try {
                C14852 c14852M19097 = c19793.f63938.m19097(abstractC15440M39866, c23319.f74946);
                c5681.m15991(c14852M19097);
                c5681.m15994(c14852M19097.f45300);
                C15972.m37753();
                return c19793.m45501(c14852M19097);
            } catch (C3059 e4) {
                if ("APK_OPEN_BLOCKED".equals(e4.f9610)) {
                    throw e4;
                }
                throw m45498(e4);
            }
        } catch (C3059 e5) {
            throw m45498(e5);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m45509(C20864 c20864, Supplier supplier) {
        ReentrantLock reentrantLock = f63928;
        reentrantLock.lock();
        try {
            C19793 c19793 = (C19793) supplier.get();
            if (c19793 != null) {
                c19793.f63940.m15996(c20864.f67521);
            }
            new C9575().m24456(c20864);
            if (c19793 != null) {
                c19793.f63940.m15995(c20864.f67521);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m45507(C17876 c17876) {
        ReentrantLock reentrantLock = f63928;
        reentrantLock.lock();
        try {
            ArrayList arrayListM24454 = new C9575().m24454();
            int size = arrayListM24454.size();
            int size2 = arrayListM24454.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    break;
                }
                C18081.m42150();
                if (size <= C19911.m45803()) {
                    break;
                }
                C20864 c20864 = (C20864) arrayListM24454.get(size2);
                try {
                    m45509(c20864, c17876);
                    size--;
                } catch (IOException e) {
                    C19926.m45879("MT MCP excess workspace delete failed, workspaceId=" + c20864.f67521, e);
                }
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C19296 m45504(C19793 c19793, C22614 c22614) throws C3059 {
        String str = c22614.f73061;
        C5681 c5681 = c19793.f63940;
        try {
            C0658 c0658M22052 = c19793.f63936.m22052(str);
            AbstractC15440 abstractC15440 = c0658M22052.f2547;
            String str2 = c0658M22052.f2550;
            c5681.m15996(str2);
            try {
                ((C19793) c19793.f63935.f27895).f63936.getClass();
                C8420.m22048(abstractC15440);
                if (abstractC15440.mo23120()) {
                    throw new IOException("Workspace directory still exists");
                }
                c5681.m15995(str2);
                C15972.m37753();
                return new C19296(str2, c0658M22052.f2540);
            } catch (IOException e) {
                throw m45499(C3059.m9367(JSON.array(), "WORKSPACE_CLOSE_FAILED", e.getMessage() == null ? "Failed to close workspace." : e.getMessage(), "warning"), str2, Boolean.valueOf(c0658M22052.f2540));
            }
        } catch (C3059 e2) {
            throw m45499(e2, str, (Boolean) null);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C20001 m45505(C19793 c19793, C12031 c12031, C15923 c15923) throws C3059 {
        C21204 c21204 = c19793.f63941;
        C14852 c14852M15997 = c19793.f63940.m15997(c12031.f35995);
        String str = c12031.f35989;
        if ("dex_class_outline".equals(str)) {
            return c21204.m48144(c14852M15997, c12031, c15923);
        }
        if ("zip_entries".equals(str)) {
            return c21204.m48145(c14852M15997, c12031);
        }
        if ("dex_classes".equals(str)) {
            return c21204.m48143(c14852M15997, c12031);
        }
        if ("resource_table".equals(str)) {
            return c21204.m48146(c14852M15997, c12031);
        }
        throw C3059.m9364("Unsupported view", (String) null, (JSONValue) null, (JSONArray) null, (JSONObject) null);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C9126 m45522(C6595 c6595, OutputStream outputStream) throws C3059 {
        String str = c6595.f20313;
        try {
            ReentrantLock reentrantLock = f63928;
            reentrantLock.lock();
            try {
                return this.f63934.m37415(this.f63940.m15997(str), c6595, outputStream);
            } finally {
                reentrantLock.unlock();
            }
        } catch (C3059 e) {
            throw m45500(e, str, c6595.f20311, c6595.f20312);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C9126 m45523(C20707 c20707, InterfaceC19087 interfaceC19087) throws C3059 {
        String str = c20707.f66691;
        try {
            ReentrantLock reentrantLock = f63928;
            reentrantLock.lock();
            try {
                return this.f63934.m37416(this.f63940.m15997(str), c20707, interfaceC19087);
            } finally {
                reentrantLock.unlock();
            }
        } catch (C3059 e) {
            throw m45500(e, str, c20707.f66688, c20707.f66689);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3059 m45500(C3059 c3059, String str, String str2, String str3) {
        String str4 = c3059.f9610;
        if (!"EDIT_SESSION_STORAGE_FAILED".equals(str4)) {
            return c3059;
        }
        return C3059.m9369(str4, "Edit session storage failed.", c3059.f9611, JSON.array(), JSON.object().add("workspaceId", str).add("editSessionId", str2 == null ? JSON.NULL : JSON.value(str2)).add("entryName", str3).add("backendReason", c3059.f9609.getString("backendReason", "workspace_storage_failure")));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C15060 m45503(C19793 c19793, C4975 c4975) {
        C15799 c15799 = c19793.f63934;
        C5681 c5681 = c19793.f63940;
        String str = c4975.f15668;
        String str2 = c4975.f15666;
        C14852 c14852M15997 = c5681.m15997(str);
        if (!c4975.f15667) {
            C21412 c21412M37435 = c15799.m37435(c14852M15997, str2);
            String str3 = c21412M37435.f68959;
            String str4 = c21412M37435.f68958;
            c15799.m37424(c14852M15997, str2);
            int i = c21412M37435.f68963;
            int i2 = c21412M37435.f68960;
            ArrayList arrayList = new ArrayList(c21412M37435.f68962);
            new ArrayList();
            return new C15060(str3, str4, false, i, i2, arrayList, "not_run", new ArrayList(), 0, 0, new ArrayList(), new ArrayList(), new ArrayList());
        }
        return ((C0859) c19793.f63929).m3170(c14852M15997, c15799.m37419(c14852M15997, str2));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m45533(String str) {
        ReentrantLock reentrantLock = f63928;
        try {
            reentrantLock.lock();
            try {
                C14852 c14852M15990 = this.f63940.m15990(str);
                if (c14852M15990 != null && !c14852M15990.f45299 && !c14852M15990.f45296) {
                    this.f63939.m22186(c14852M15990);
                }
            } finally {
                reentrantLock.unlock();
            }
        } catch (Exception e) {
            C19926.m45879("MT MCP smali cache activation failed, workspaceId=" + str, e);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC19785 m45535() {
        return this.f63939.m22185();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m45536() {
        this.f63939.m22188();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3059 m45499(C3059 c3059, String str, Boolean bool) {
        return C3059.m9369(c3059.f9610, c3059.getMessage(), c3059.f9611, JSON.array(), new JSONObject(c3059.f9609).put("workspaceId", str).put("temporary", bool == null ? JSON.NULL : JSON.value(bool.booleanValue())));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3059 m45498(C3059 c3059) {
        JSONArray jSONArray = c3059.f9604;
        JSONObject jSONObject = c3059.f9609;
        String str = c3059.f9611;
        String str2 = c3059.f9610;
        JSONArray jSONArray2 = new JSONArray(jSONArray);
        jSONArray2.add(C10115.m25398(JSON.object().add("prefix", "").add("limit", 50), "mt_apk_list_available_apks", "inspect", "List APK targets that mt_apk_workspace_open can open"));
        if (c3059.f9607) {
            return C3059.m9365(str2, c3059.getMessage(), str, jSONArray2, jSONObject);
        }
        return C3059.m9369(str2, c3059.getMessage(), str, jSONArray2, jSONObject);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C3067 m45501(C14852 c14852) {
        String str = c14852.f45300;
        boolean z = c14852.f45296;
        String strSubstring = c14852.f45311;
        if (strSubstring == null || strSubstring.isEmpty() || strSubstring.endsWith("/")) {
            strSubstring = null;
        } else {
            int iLastIndexOf = strSubstring.lastIndexOf(47);
            if (iLastIndexOf >= 0) {
                strSubstring = strSubstring.substring(iLastIndexOf + 1);
            }
        }
        String str2 = strSubstring;
        AbstractC15440 abstractC15440M35253 = c14852.m35253();
        this.f63938.getClass();
        try {
            InputStream inputStreamMo27926 = abstractC15440M35253.mo27926();
            try {
                int i = 65536;
                C0521 c0521 = new C0521(65536);
                byte[] bArr = new byte[8192];
                while (i > 0) {
                    int i2 = inputStreamMo27926.read(bArr, 0, Math.min(8192, i));
                    if (i2 == -1) {
                        break;
                    }
                    c0521.write(bArr, 0, i2);
                    i -= i2;
                }
                byte[] bArr2 = c0521.f2176;
                int i3 = c0521.f2177;
                MessageDigest messageDigestM34534 = C14460.m34534();
                messageDigestM34534.update(bArr2, 0, i3);
                C14460.m34531(messageDigestM34534.digest());
                if (inputStreamMo27926 != null) {
                    inputStreamMo27926.close();
                }
            } catch (Throwable th) {
                if (inputStreamMo27926 != null) {
                    try {
                        inputStreamMo27926.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (Exception unused) {
        }
        ArrayList arrayList = c14852.f45312;
        ArrayList arrayList2 = c14852.f45307;
        C20158 c20158 = c14852.f45293;
        C7457 c7457 = c14852.f45315;
        C18920 c18920 = c14852.f45297;
        Iterator it = arrayList.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            if (((C13874) it.next()).f41355.toLowerCase(Locale.ROOT).endsWith(".xml")) {
                i4++;
            }
        }
        C7457 c7458 = c14852.f45315;
        boolean z2 = c7458.f22879;
        return new C3067(str, z, str2, arrayList, arrayList2, c20158, c7457, c18920, i4, z2 && c7458.f22880 > 0, z2 && c7458.f22882 > 0, C21721.m49048(c14852.m35253()));
    }
}
