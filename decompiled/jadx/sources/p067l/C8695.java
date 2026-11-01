package p067l;

import bin.p000mt.json.JSON;
import bin.p000mt.json.JSONArray;
import bin.p000mt.json.JSONObject;
import bin.p000mt.json.JSONValue;
import com.google.android.material.motion.MotionUtils;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: renamed from: l.ۜۡۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: D6WW */
/* JADX INFO: loaded from: classes2.dex */
public final class C8695 {

    /* JADX INFO: renamed from: ֫ */
    public final C21545 f23549;

    /* JADX INFO: renamed from: ۧ */
    public final C19247 f23550;

    public C8695(C19247 c19247) {
        C21545 c21545 = new C21545();
        this.f23550 = c19247;
        this.f23549 = c21545;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C24788 m20140(String str) throws C5276 {
        C19247 c19247 = this.f23550;
        C9385 c9385M43852 = c19247.m43852();
        String strM31903 = C14059.m31903(c9385M43852, str, MotionUtils.EASING_TYPE_PATH, false);
        c9385M43852.m21857(strM31903);
        C11872 c11872M43856 = c19247.m43856(strM31903);
        try {
            C24788 c24788M20141 = m20141(strM31903);
            c11872M43856.close();
            return c24788M20141;
        } catch (Throwable th) {
            try {
                c11872M43856.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 8 */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 6931. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:99)
        */
    /* JADX INFO: renamed from: ۧ */
    public final p067l.C24788 m20141(java.lang.String r26) throws p067l.C5276 {
        /*
            Method dump skipped, instruction units count: 693
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p067l.C8695.m20141(java.lang.String):l.᩻ۡۜ");
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m20142(String str) throws C5276 {
        m20137(str, this.f23550.m43852());
    }

    /* JADX INFO: renamed from: ֫ */
    private C16070 m20137(String str, C9385 c9385) throws C5276 {
        ArrayDeque arrayDeque = new ArrayDeque();
        C19247 c19247 = this.f23550;
        AbstractC17043 abstractC17043M43857 = c19247.m43857(str);
        String strM20139 = str;
        do {
            c9385.m21857(strM20139);
            String str2 = c9385.f25641;
            AbstractC17043 abstractC17043M43858 = c19247.m43857(strM20139);
            C14362 c14362M20136 = m20136(abstractC17043M43858);
            if (c14362M20136.m32962() == EnumC5645.DIRECTORY) {
                if (!arrayDeque.isEmpty()) {
                    c9385.m21857(strM20139);
                }
                if (abstractC17043M43857.mo29978() || (abstractC17043M43857 instanceof C14912) || (abstractC17043M43857 instanceof C14717)) {
                    String strM201310 = m20139(strM20139);
                    while (strM201310 != null) {
                        AbstractC17043 abstractC17043M43859 = c19247.m43857(strM201310);
                        try {
                            C14362 c14362Mo10732 = abstractC17043M43859.mo25509().mo10732();
                            if (c14362Mo10732.m32962() == EnumC5645.LINK) {
                                throw m20131("FILE_IS_SYMLINK", "A symbolic-link parent cannot be traversed by a modifying file tool.", str, str2, "parent_is_link");
                            }
                            if (c14362Mo10732.m32962() != EnumC5645.DIRECTORY) {
                                throw m20131(c14362Mo10732.m32962() != EnumC5645.MISSING ? "FILE_NOT_DIRECTORY" : "FILE_LINK_CHECK_FAILED", "The existing parent chain could not be verified safely.", str, str2, c14362Mo10732.m32962().name().toLowerCase(Locale.ROOT));
                            }
                            strM201310 = abstractC17043M43859.getParent();
                        } catch (C23750 e) {
                            throw m20131("FILE_LINK_CHECK_FAILED", "A parent link status could not be verified safely.", str, str2, e.m52799().name().toLowerCase(Locale.ROOT));
                        }
                    }
                }
                return new C16070(new ArrayList(arrayDeque));
            }
            if (c14362M20136.m32962() != EnumC5645.MISSING) {
                throw m20133(strM20139, c14362M20136.m32962());
            }
            m20135(abstractC17043M43858, str2);
            arrayDeque.addFirst(strM20139);
            strM20139 = m20139(strM20139);
        } while (strM20139 != null);
        throw m20132("FILE_PARENT_NOT_FOUND", "No existing writable parent directory was found.", str, c9385.f25641, "preflight", "parent_missing", false, (String) null, JSON.array(), 0, (String) null, str);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C5276 m20131(String str, String str2, String str3, String str4, String str5) {
        return C5276.m11411(str, str2, "fatal", null, C9417.m21913(MotionUtils.EASING_TYPE_PATH, str3, "policyRevision", str4).add("operation", "check_parent_links").add("backendReason", str5).add("changed", false).add("stateKnown", true).add("warnings", JSON.array()));
    }

    /* JADX INFO: renamed from: ֫ */
    private C14362 m20136(AbstractC17043 abstractC17043) throws C5276 {
        try {
            return abstractC17043.mo25509().mo10732();
        } catch (C23750 e) {
            this.f23550.getClass();
            throw C19247.m43849(e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private C5276 m20133(String str, EnumC5645 enumC5645) {
        int i = C18753.f56037[enumC5645.ordinal()];
        C19247 c19247 = this.f23550;
        if (i == 1) {
            c19247.getClass();
            return C19247.m43848("FILE_IS_SYMLINK", "A symbolic link cannot be used as a mkdir -p directory component.", str, enumC5645);
        }
        if (i == 2) {
            c19247.getClass();
            return C19247.m43848("FILE_UNSUPPORTED_TYPE", "A special node cannot be used as a mkdir -p directory component.", str, enumC5645);
        }
        c19247.getClass();
        return C19247.m43848("FILE_NOT_DIRECTORY", "An existing mkdir -p path component is not a directory.", str, enumC5645);
    }

    /* JADX INFO: renamed from: ֫ */
    public static EnumC6986 m20135(AbstractC17043 abstractC17043, String str) throws C5276 {
        EnumC6986 enumC6986Mo10729 = abstractC17043.mo25509().mo10729(EnumC15032.CREATE_DIRECTORY_SINGLE);
        if (enumC6986Mo10729 != EnumC6986.UNSUPPORTED) {
            return enumC6986Mo10729;
        }
        throw m20132("FILE_BACKEND_UNSUPPORTED", "The file backend does not support checked directory creation.", abstractC17043.mo25505(), str, "create_directory", "unsupported", false, (String) null, JSON.array(), 0, (String) null, abstractC17043.mo25505());
    }

    /* JADX INFO: renamed from: ֫ */
    public static C5276 m20134(C5276 c5276, String str, String str2, String str3, boolean z, boolean z2, JSONArray jSONArray, int i, String str4, String str5, String str6, boolean z3) {
        JSONObject jSONObject = c5276.f12412;
        JSONArray jSONArray2 = c5276.f12407;
        String str7 = c5276.f12414;
        String str8 = c5276.f12413;
        JSONObject jSONObject2 = new JSONObject(jSONObject);
        jSONObject2.put(MotionUtils.EASING_TYPE_PATH, str);
        jSONObject2.put("policyRevision", str2);
        jSONObject2.put("changed", z);
        jSONObject2.put("operationMode", JSON.value(str3));
        jSONObject2.put("stateKnown", z2);
        jSONObject2.put("warnings", new JSONArray(jSONArray));
        jSONObject2.put("createdDirectories", i);
        jSONObject2.put("deepestCreatedPath", str4 == null ? JSON.NULL : JSON.value(str4));
        jSONObject2.put("failedPath", str5 == null ? JSON.NULL : JSON.value(str5));
        jSONObject2.put("failureStage", str6 == null ? JSON.NULL : JSON.value(str6));
        jSONObject2.put("safeToRetry", z3);
        if (c5276.f12410) {
            return C5276.m11407(str8, c5276.getMessage(), str7, jSONArray2, jSONObject2);
        }
        return C5276.m11411(str8, c5276.getMessage(), str7, jSONArray2, jSONObject2);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C5276 m20132(String str, String str2, String str3, String str4, String str5, String str6, boolean z, String str7, JSONArray jSONArray, int i, String str8, String str9) {
        JSONObject jSONObjectAdd = C9417.m21913(MotionUtils.EASING_TYPE_PATH, str3, "policyRevision", str4).add("operation", str5).add("backendReason", str6).add("changed", z).add("operationMode", str7 == null ? JSON.NULL : JSON.value(str7)).add("stateKnown", true).add("warnings", new JSONArray(jSONArray)).add("createdDirectories", i).add("deepestCreatedPath", str8 == null ? JSON.NULL : JSON.value(str8)).add("failedPath", str9 == null ? JSON.NULL : JSON.value(str9)).add("failureStage", str5).add("safeToRetry", true);
        return "FILE_STORAGE_ERROR".equals(str) ? C5276.m11407(str, str2, "warning", (JSONArray) null, jSONObjectAdd) : C5276.m11411(str, str2, "fatal", null, jSONObjectAdd);
    }

    /* JADX INFO: renamed from: ᩳ */
    public static String m20139(String str) {
        if ("/".equals(str)) {
            return null;
        }
        int iLastIndexOf = str.lastIndexOf(47);
        return iLastIndexOf == 0 ? "/" : str.substring(0, iLastIndexOf);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m20138(JSONArray jSONArray, String str) {
        Iterator it = jSONArray.iterator();
        while (it.hasNext()) {
            JSONValue jSONValue = (JSONValue) it.next();
            if (jSONValue.isString() && str.equals(jSONValue.asString())) {
                return;
            }
        }
        jSONArray.add(str);
    }
}
