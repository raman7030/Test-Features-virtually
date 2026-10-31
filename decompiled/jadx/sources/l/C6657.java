package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import com.google.android.material.motion.MotionUtils;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: renamed from: l.ۜۡۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: D6WW */
/* JADX INFO: loaded from: classes2.dex */
public final class C6657 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C20177 f20673;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C17760 f20674;

    public C6657(C17760 c17760) {
        C20177 c20177 = new C20177();
        this.f20674 = c17760;
        this.f20673 = c20177;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C23590 m18192(String str) throws C3059 {
        C17760 c17760 = this.f20674;
        C7383 c7383M41607 = c17760.m41607();
        String strM29843 = C12301.m29843(c7383M41607, str, MotionUtils.EASING_TYPE_PATH, false);
        c7383M41607.m19884(strM29843);
        C10000 c10000M41611 = c17760.m41611(strM29843);
        try {
            C23590 c23590M18193 = m18193(strM29843);
            c10000M41611.close();
            return c23590M18193;
        } catch (Throwable th) {
            try {
                c10000M41611.close();
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
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final l.C23590 m18193(java.lang.String r26) throws l.C3059 {
        /*
            Method dump skipped, instruction units count: 693
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C6657.m18193(java.lang.String):l.᩻ۡۜ");
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m18194(String str) throws C3059 {
        m18189(str, this.f20674.m41607());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C14417 m18189(String str, C7383 c7383) throws C3059 {
        ArrayDeque arrayDeque = new ArrayDeque();
        C17760 c17760 = this.f20674;
        AbstractC15440 abstractC15440M41612 = c17760.m41612(str);
        String strM18191 = str;
        do {
            c7383.m19884(strM18191);
            String str2 = c7383.f22729;
            AbstractC15440 abstractC15440M41613 = c17760.m41612(strM18191);
            C12619 c12619M18188 = m18188(abstractC15440M41613);
            if (c12619M18188.m30885() == EnumC3447.DIRECTORY) {
                if (!arrayDeque.isEmpty()) {
                    c7383.m19884(strM18191);
                }
                if (abstractC15440M41612.mo27917() || (abstractC15440M41612 instanceof C13198) || (abstractC15440M41612 instanceof C12993)) {
                    String strM18192 = m18191(strM18191);
                    while (strM18192 != null) {
                        AbstractC15440 abstractC15440M41614 = c17760.m41612(strM18192);
                        try {
                            C12619 c12619Mo8672 = abstractC15440M41614.mo23558().mo8672();
                            if (c12619Mo8672.m30885() == EnumC3447.LINK) {
                                throw m18183("FILE_IS_SYMLINK", "A symbolic-link parent cannot be traversed by a modifying file tool.", str, str2, "parent_is_link");
                            }
                            if (c12619Mo8672.m30885() != EnumC3447.DIRECTORY) {
                                throw m18183(c12619Mo8672.m30885() != EnumC3447.MISSING ? "FILE_NOT_DIRECTORY" : "FILE_LINK_CHECK_FAILED", "The existing parent chain could not be verified safely.", str, str2, c12619Mo8672.m30885().name().toLowerCase(Locale.ROOT));
                            }
                            strM18192 = abstractC15440M41614.getParent();
                        } catch (C22497 e) {
                            throw m18183("FILE_LINK_CHECK_FAILED", "A parent link status could not be verified safely.", str, str2, e.m50458().name().toLowerCase(Locale.ROOT));
                        }
                    }
                }
                return new C14417(new ArrayList(arrayDeque));
            }
            if (c12619M18188.m30885() != EnumC3447.MISSING) {
                throw m18185(strM18191, c12619M18188.m30885());
            }
            m18187(abstractC15440M41613, str2);
            arrayDeque.addFirst(strM18191);
            strM18191 = m18191(strM18191);
        } while (strM18191 != null);
        throw m18184("FILE_PARENT_NOT_FOUND", "No existing writable parent directory was found.", str, c7383.f22729, "preflight", "parent_missing", false, (String) null, JSON.array(), 0, (String) null, str);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3059 m18183(String str, String str2, String str3, String str4, String str5) {
        return C3059.m9369(str, str2, "fatal", null, C7416.m19939(MotionUtils.EASING_TYPE_PATH, str3, "policyRevision", str4).add("operation", "check_parent_links").add("backendReason", str5).add("changed", false).add("stateKnown", true).add("warnings", JSON.array()));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C12619 m18188(AbstractC15440 abstractC15440) throws C3059 {
        try {
            return abstractC15440.mo23558().mo8672();
        } catch (C22497 e) {
            this.f20674.getClass();
            throw C17760.m41604(e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C3059 m18185(String str, EnumC3447 enumC3447) {
        int i = C17240.f52854[enumC3447.ordinal()];
        C17760 c17760 = this.f20674;
        if (i == 1) {
            c17760.getClass();
            return C17760.m41603("FILE_IS_SYMLINK", "A symbolic link cannot be used as a mkdir -p directory component.", str, enumC3447);
        }
        if (i == 2) {
            c17760.getClass();
            return C17760.m41603("FILE_UNSUPPORTED_TYPE", "A special node cannot be used as a mkdir -p directory component.", str, enumC3447);
        }
        c17760.getClass();
        return C17760.m41603("FILE_NOT_DIRECTORY", "An existing mkdir -p path component is not a directory.", str, enumC3447);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC4858 m18187(AbstractC15440 abstractC15440, String str) throws C3059 {
        EnumC4858 enumC4858Mo8669 = abstractC15440.mo23558().mo8669(EnumC13324.CREATE_DIRECTORY_SINGLE);
        if (enumC4858Mo8669 != EnumC4858.UNSUPPORTED) {
            return enumC4858Mo8669;
        }
        throw m18184("FILE_BACKEND_UNSUPPORTED", "The file backend does not support checked directory creation.", abstractC15440.mo23554(), str, "create_directory", "unsupported", false, (String) null, JSON.array(), 0, (String) null, abstractC15440.mo23554());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3059 m18186(C3059 c3059, String str, String str2, String str3, boolean z, boolean z2, JSONArray jSONArray, int i, String str4, String str5, String str6, boolean z3) {
        JSONObject jSONObject = c3059.f9609;
        JSONArray jSONArray2 = c3059.f9604;
        String str7 = c3059.f9611;
        String str8 = c3059.f9610;
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
        if (c3059.f9607) {
            return C3059.m9365(str8, c3059.getMessage(), str7, jSONArray2, jSONObject2);
        }
        return C3059.m9369(str8, c3059.getMessage(), str7, jSONArray2, jSONObject2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3059 m18184(String str, String str2, String str3, String str4, String str5, String str6, boolean z, String str7, JSONArray jSONArray, int i, String str8, String str9) {
        JSONObject jSONObjectAdd = C7416.m19939(MotionUtils.EASING_TYPE_PATH, str3, "policyRevision", str4).add("operation", str5).add("backendReason", str6).add("changed", z).add("operationMode", str7 == null ? JSON.NULL : JSON.value(str7)).add("stateKnown", true).add("warnings", new JSONArray(jSONArray)).add("createdDirectories", i).add("deepestCreatedPath", str8 == null ? JSON.NULL : JSON.value(str8)).add("failedPath", str9 == null ? JSON.NULL : JSON.value(str9)).add("failureStage", str5).add("safeToRetry", true);
        return "FILE_STORAGE_ERROR".equals(str) ? C3059.m9365(str, str2, "warning", (JSONArray) null, jSONObjectAdd) : C3059.m9369(str, str2, "fatal", null, jSONObjectAdd);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static String m18191(String str) {
        if ("/".equals(str)) {
            return null;
        }
        int iLastIndexOf = str.lastIndexOf(47);
        return iLastIndexOf == 0 ? "/" : str.substring(0, iLastIndexOf);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m18190(JSONArray jSONArray, String str) {
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
