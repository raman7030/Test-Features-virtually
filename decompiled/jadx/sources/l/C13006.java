package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import com.google.android.material.motion.MotionUtils;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;

/* JADX INFO: renamed from: l.۬ۡۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: M6XL */
/* JADX INFO: loaded from: classes3.dex */
public final class C13006 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C20177 f38933;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C17760 f38934;

    public C13006(C17760 c17760) {
        C20177 c20177 = new C20177();
        this.f38934 = c17760;
        this.f38933 = c20177;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C3129 m31586(String str, String str2, boolean z) throws C3059 {
        C17760 c17760 = this.f38934;
        C7383 c7383M41607 = c17760.m41607();
        String strM41605 = C17760.m41605(str, c7383M41607, "sourcePath");
        String strM41606 = C17760.m41605(str2, c7383M41607, "destinationPath");
        if (strM41605.equals(strM41606)) {
            throw m31584("FILE_MOVE_FAILED", "Source and destination must identify different paths.", strM41605, strM41606, c7383M41607.f22729, "prepare", "same_path");
        }
        C10000 c10000M41609 = c17760.m41609(Arrays.asList(strM41605, strM41606));
        try {
            C3129 c3129M31580 = m31580(c7383M41607, strM41605, strM41606, z);
            c10000M41609.close();
            return c3129M31580;
        } catch (Throwable th) {
            try {
                c10000M41609.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C3129 m31580(C7383 c7383, String str, String str2, boolean z) throws C3059 {
        C4540 c4540M13314;
        C20177 c20177 = this.f38933;
        String str3 = c7383.f22729;
        C17760 c17760 = this.f38934;
        AbstractC15440 abstractC15440M41612 = c17760.m41612(str);
        AbstractC15440 abstractC15440M41613 = c17760.m41612(str2);
        C12619 c12619M31581 = m31581(abstractC15440M41612);
        C12619 c12619M31582 = m31581(abstractC15440M41613);
        String str4 = c7383.f22729;
        int[] iArr = C20063.f64985;
        int i = iArr[c12619M31581.m30885().ordinal()];
        if (i == 3) {
            throw m31584("FILE_NOT_FOUND", "The source path does not exist.", str, str2, str4, "source_stat", "missing");
        }
        if (i == 4) {
            throw m31584("FILE_IS_SYMLINK", "Symbolic links cannot be moved by the generic file tool.", str, str2, str4, "source_stat", "link");
        }
        if (i == 5) {
            throw m31584("FILE_UNSUPPORTED_TYPE", "The source node type cannot be moved by the generic file tool.", str, str2, str4, "source_stat", "other");
        }
        String str5 = c7383.f22729;
        EnumC3447 enumC3447M30885 = c12619M31581.m30885();
        EnumC3447 enumC3447 = EnumC3447.DIRECTORY;
        if (enumC3447M30885 == enumC3447) {
            if (z) {
                throw m31584("FILE_DIRECTORY_MERGE_UNSUPPORTED", "Directory moves require overwrite=false and never replace a target.", str, str2, str5, "prepare", "directory_overwrite_unsupported");
            }
            int i2 = iArr[c12619M31582.m30885().ordinal()];
            if (i2 == 1) {
                throw m31584("FILE_ALREADY_EXISTS", "The destination of a directory move must not already exist.", str, str2, str5, "destination_stat", "file");
            }
            if (i2 == 2) {
                throw m31584("FILE_DIRECTORY_MERGE_UNSUPPORTED", "Directory merging is not supported by the generic file tool.", str, str2, str5, "destination_stat", "directory");
            }
            if (i2 == 4) {
                throw m31584("FILE_IS_SYMLINK", "Symbolic links cannot be replaced by the generic file tool.", str, str2, str5, "destination_stat", "link");
            }
            if (i2 == 5) {
                throw m31584("FILE_UNSUPPORTED_TYPE", "The destination node type cannot be replaced by the generic file tool.", str, str2, str5, "destination_stat", "other");
            }
        } else {
            if (!z && c12619M31582.m30885() != EnumC3447.MISSING) {
                throw m31584("FILE_ALREADY_EXISTS", "The destination already exists and overwrite is false.", str, str2, str5, "destination_stat", m31578(c12619M31582.m30885()));
            }
            if (z) {
                if (c12619M31582.m30885() == EnumC3447.LINK) {
                    throw m31584("FILE_IS_SYMLINK", "Symbolic links cannot be replaced by the generic file tool.", str, str2, str5, "destination_stat", "link");
                }
                if (c12619M31582.m30885() == EnumC3447.OTHER) {
                    throw m31584("FILE_UNSUPPORTED_TYPE", "The destination node type cannot be replaced by the generic file tool.", str, str2, str5, "destination_stat", "other");
                }
                if (c12619M31582.m30885() == enumC3447) {
                    throw m31584("FILE_NOT_REGULAR", "A regular file cannot replace a directory.", str, str2, str5, "destination_stat", "directory");
                }
            }
        }
        if (c12619M31581.m30885() == enumC3447 && C12301.m29846(str2, str)) {
            throw m31584("FILE_MOVE_INTO_DESCENDANT", "A directory cannot be moved into itself or one of its descendants.", str, str2, c7383.f22729, "prepare", "destination_is_descendant");
        }
        String strM31577 = m31577(str, str2, abstractC15440M41612, str3, "source");
        String strM31578 = m31577(str, str2, abstractC15440M41613, str3, "destination");
        c7383.m19884(strM31577);
        c7383.m19884(strM31578);
        String str6 = strM31578;
        m31582(str, str2, strM31577, c7383.f22729, "source");
        m31582(str, str2, str6, c7383.f22729, "destination");
        m31585(str, str2, abstractC15440M41612, c7383.f22729, "source_parent_links");
        m31585(str, str2, abstractC15440M41613, c7383.f22729, "destination_parent_links");
        EnumC13324 enumC13324 = c12619M31582.m30885() == EnumC3447.MISSING ? EnumC13324.RENAME_NO_REPLACE : EnumC13324.REPLACE;
        if (abstractC15440M41612.mo23558().mo8669(enumC13324) == EnumC4858.UNSUPPORTED) {
            throw m31584("FILE_DIRECT_MOVE_UNSUPPORTED", "The storage backend cannot perform this move as a direct operation.", str, str2, c7383.f22729, enumC13324.name().toLowerCase(Locale.ROOT), "unsupported");
        }
        while (true) {
            C7383 c7383M41607 = c17760.m41607();
            c7383M41607.m19884(str);
            String str7 = c7383M41607.f22729;
            c7383M41607.m19882(str);
            c7383M41607.m19884(str2);
            c7383M41607.m19882(str2);
            c7383M41607.m19884(strM31577);
            String str8 = str6;
            c7383M41607.m19884(str8);
            AbstractC15440 abstractC15440M41614 = c17760.m41612(str);
            AbstractC15440 abstractC15440M41615 = c17760.m41612(str2);
            C12619 c12619M31583 = m31581(abstractC15440M41614);
            C20177 c20178 = c20177;
            m31583(str, str2, c12619M31581, c12619M31582, c12619M31583, m31581(abstractC15440M41615), c7383M41607.f22729);
            m31582(str, str2, strM31577, c7383M41607.f22729, "source");
            m31582(str, str2, str8, c7383M41607.f22729, "destination");
            m31585(str, str2, abstractC15440M41614, c7383M41607.f22729, "source_parent_links");
            m31585(str, str2, abstractC15440M41615, c7383M41607.f22729, "destination_parent_links");
            if (c12619M31583.m30885() == EnumC3447.DIRECTORY) {
                ArrayDeque arrayDeque = new ArrayDeque();
                HashSet hashSet = new HashSet();
                arrayDeque.add(c12619M31583);
                while (!arrayDeque.isEmpty()) {
                    C12619 c12619 = (C12619) arrayDeque.removeFirst();
                    if (hashSet.add(m31576(c12619.m30882().mo23554(), str, str2, str7))) {
                        try {
                            for (C12619 c126110 : c12619.m30882().mo23558().mo8668(c12619)) {
                                String strM31576 = m31576(c126110.m30882().mo23554(), str, str2, str7);
                                StringBuilder sbM15339 = C5368.m15339(str2);
                                sbM15339.append(strM31576.substring(str.length()));
                                String string = sbM15339.toString();
                                HashSet hashSet2 = hashSet;
                                if (c126110.m30885() != EnumC3447.MISSING) {
                                    c7383M41607.m19884(strM31576);
                                    c7383M41607.m19884(string);
                                    int i3 = C20063.f64985[c126110.m30885().ordinal()];
                                    if (i3 == 2) {
                                        arrayDeque.addLast(c126110);
                                    } else if (i3 == 5) {
                                        throw m31584("FILE_UNSUPPORTED_TYPE", "A directory move cannot include an unsupported special node.", strM31576, string, c7383M41607.f22729, "source_tree", "other");
                                    }
                                }
                                hashSet = hashSet2;
                            }
                        } catch (C22497 e) {
                            throw C17760.m41604(e);
                        }
                    }
                }
            }
            C7383 c7383M41608 = c17760.m41607();
            if (str7.equals(c7383M41608.f22729)) {
                AbstractC15440 abstractC15440M41616 = c17760.m41612(str);
                AbstractC15440 abstractC15440M41617 = c17760.m41612(str2);
                m31583(str, str2, c12619M31581, c12619M31582, m31581(abstractC15440M41616), m31581(abstractC15440M41617), c7383M41608.f22729);
                m31582(str, str2, strM31577, c7383M41608.f22729, "source");
                m31582(str, str2, str8, c7383M41608.f22729, "destination");
                m31585(str, str2, abstractC15440M41616, c7383M41608.f22729, "source_parent_links");
                m31585(str, str2, abstractC15440M41617, c7383M41608.f22729, "destination_parent_links");
                AbstractC10503 abstractC10503Mo23558 = abstractC15440M41616.mo23558();
                EnumC4858 enumC4858Mo8669 = abstractC10503Mo23558.mo8669(enumC13324);
                if (enumC4858Mo8669 == EnumC4858.UNSUPPORTED) {
                    throw m31584("FILE_DIRECT_MOVE_UNSUPPORTED", "The storage backend cannot perform this move as a direct operation.", str, str2, c7383M41608.f22729, enumC13324.name().toLowerCase(Locale.ROOT), "unsupported");
                }
                String str9 = enumC4858Mo8669 == EnumC4858.ATOMIC ? "atomic" : "best_effort";
                JSONArray jSONArrayArray = JSON.array();
                try {
                    if (enumC13324 == EnumC13324.REPLACE) {
                        abstractC10503Mo23558.mo10993(abstractC15440M41617);
                    } else {
                        abstractC10503Mo23558.mo8670(abstractC15440M41617);
                    }
                    boolean z2 = c12619M31581.m30885() == EnumC3447.DIRECTORY;
                    try {
                        c20178.getClass();
                        C18081.m42150();
                        if (z2) {
                            C14463.m34559(str);
                            C14463.m34554(str2, false);
                        } else {
                            C14463.m34560(str);
                            C14463.m34554(str2, true);
                        }
                        C16669.m39185();
                    } catch (RuntimeException unused) {
                        jSONArrayArray.add("File move notification could not be completed.");
                    }
                    return new C3129(new JSONArray(jSONArrayArray), str, str2, m31578(c12619M31581.m30885()));
                } catch (C22497 e2) {
                    if (enumC4858Mo8669 == EnumC4858.ATOMIC) {
                        c4540M13314 = C4540.m13315(false);
                    } else {
                        EnumC3447 enumC3447M30886 = c12619M31581.m30885();
                        try {
                            AbstractC15440 abstractC15440M41618 = c17760.m41612(str);
                            AbstractC15440 abstractC15440M41619 = c17760.m41612(str2);
                            EnumC3447 enumC3447M30887 = abstractC15440M41618.mo23558().mo8672().m30885();
                            EnumC3447 enumC3447M30888 = abstractC15440M41619.mo23558().mo8672().m30885();
                            EnumC3447 enumC3448 = EnumC3447.MISSING;
                            c4540M13314 = (enumC3447M30887 == enumC3448 && enumC3447M30888 == enumC3447M30886) ? C4540.m13315(true) : (enumC13324 == EnumC13324.RENAME_NO_REPLACE && enumC3447M30887 == enumC3447M30886 && enumC3447M30888 == enumC3448) ? C4540.m13315(false) : C4540.m13314();
                        } catch (RuntimeException | C22497 unused2) {
                            c4540M13314 = C4540.m13314();
                        }
                    }
                    boolean z3 = c4540M13314.f14422;
                    boolean z4 = c4540M13314.f14421;
                    boolean z5 = c12619M31581.m30885() == EnumC3447.DIRECTORY;
                    if (z4 || !z3) {
                        try {
                            c20178.getClass();
                            C18081.m42150();
                            if (z5) {
                                C14463.m34559(str);
                                C14463.m34554(str2, false);
                            } else {
                                C14463.m34560(str);
                                C14463.m34554(str2, true);
                            }
                            C16669.m39185();
                        } catch (RuntimeException unused3) {
                            jSONArrayArray.add("File move notification could not be completed.");
                        }
                    }
                    if (!z4 && z3 && (e2.m50458() == EnumC21792.CROSS_BACKEND || e2.m50458() == EnumC21792.UNSUPPORTED)) {
                        String str10 = c7383M41608.f22729;
                        String strName = e2.m50458().name();
                        Locale locale = Locale.ROOT;
                        throw C3059.m9369("FILE_DIRECT_MOVE_UNSUPPORTED", "The storage backend cannot perform this move as a direct operation.", "fatal", null, m31575(str, str2, str10, enumC13324.name().toLowerCase(locale), strName.toLowerCase(locale), false, str9, true, jSONArrayArray));
                    }
                    String str11 = c7383M41608.f22729;
                    String strName2 = e2.m50458().name();
                    Locale locale2 = Locale.ROOT;
                    String lowerCase = strName2.toLowerCase(locale2);
                    boolean z6 = c4540M13314.f14421;
                    boolean z7 = c4540M13314.f14422;
                    throw C3059.m9365(z7 ? "FILE_MOVE_FAILED" : "FILE_OPERATION_STATE_UNKNOWN", z7 ? "The direct file move failed." : "The direct file move failed and its final state is unknown.", "warning", (JSONArray) null, m31575(str, str2, str11, enumC13324.name().toLowerCase(locale2), lowerCase, z6, str9, z7, jSONArrayArray));
                }
            }
            c20177 = c20178;
            str6 = str8;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m31577(String str, String str2, AbstractC15440 abstractC15440, String str3, String str4) throws C3059 {
        String parent = abstractC15440.getParent();
        if (parent != null) {
            return parent;
        }
        throw m31584("FILE_PARENT_NOT_FOUND", C4860.m14172("The ", str4, " path has no parent directory."), str, str2, str3, str4.concat("_parent_stat"), "parent_missing");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m31582(String str, String str2, String str3, String str4, String str5) throws C3059 {
        C12619 c12619M31581 = m31581(this.f38934.m41612(str3));
        if (c12619M31581.m30885() == EnumC3447.MISSING) {
            throw m31584("FILE_PARENT_NOT_FOUND", C4860.m14172("The ", str5, " parent directory does not exist."), str, str2, str4, str5.concat("_parent_stat"), "missing");
        }
        if (c12619M31581.m30885() == EnumC3447.LINK) {
            throw m31584("FILE_IS_SYMLINK", "A symbolic-link parent cannot be traversed by a destructive file tool.", str, str2, str4, str5.concat("_parent_stat"), "parent_is_link");
        }
        if (c12619M31581.m30885() != EnumC3447.DIRECTORY) {
            throw m31584("FILE_NOT_DIRECTORY", C4860.m14172("The ", str5, " parent is not a directory."), str, str2, str4, str5.concat("_parent_stat"), m31578(c12619M31581.m30885()));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m31576(String str, String str2, String str3, String str4) throws C3059 {
        try {
            String strM29847 = C12301.m29847(str, "sourcePath");
            if (C12301.m29846(strM29847, str2)) {
                return strM29847;
            }
            throw m31584("FILE_MOVE_FAILED", "The storage backend returned an entry outside the source directory.", str2, str3, str4, "source_tree", "entry_outside_source");
        } catch (C3059 unused) {
            throw m31584("FILE_MOVE_FAILED", "The storage backend returned an invalid directory entry path.", str2, str3, str4, "source_tree", "invalid_entry_path");
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m31585(final String str, final String str2, AbstractC15440 abstractC15440, final String str3, final String str4) throws C3059 {
        this.f38934.m41610(abstractC15440, new InterfaceC16348() { // from class: l.᩹ۡۜ
            @Override // l.InterfaceC16348
            /* JADX INFO: renamed from: ֫ */
            public final C3059 mo22666(String str5, String str6, String str7) {
                return C13006.m31579(str, str2, str3, str4, str5, str6, str7);
            }
        });
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ C3059 m31579(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        String str8;
        String str9;
        String str10;
        if (!"parent_missing".equals(str7) && !"ancestor_missing".equals(str7)) {
            if (!"FILE_NOT_DIRECTORY".equals(str5)) {
                str8 = str5;
                str10 = str6;
                str9 = str7;
            }
            return m31584(str8, str10, str, str2, str3, str4, str9);
        }
        str5 = "FILE_LINK_CHECK_FAILED";
        str7 = "missing";
        str8 = str5;
        str9 = str7;
        str10 = "The existing parent chain could not be verified safely.";
        return m31584(str8, str10, str, str2, str3, str4, str9);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m31583(String str, String str2, C12619 c12619, C12619 c126110, C12619 c126111, C12619 c126112, String str3) throws C3059 {
        if (c12619.m30885() != c126111.m30885() || c126110.m30885() != c126112.m30885()) {
            throw m31584("FILE_MOVE_FAILED", "A source or destination node changed during move validation.", str, str2, str3, "pre_move_stat", "node_type_changed");
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C12619 m31581(AbstractC15440 abstractC15440) throws C3059 {
        try {
            return abstractC15440.mo23558().mo8672();
        } catch (C22497 e) {
            this.f38934.getClass();
            throw C17760.m41604(e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m31578(EnumC3447 enumC3447) {
        int i = C20063.f64985[enumC3447.ordinal()];
        if (i == 1) {
            return "file";
        }
        if (i == 2) {
            return "directory";
        }
        if (i == 3) {
            return "missing";
        }
        if (i == 4) {
            return "link";
        }
        if (i == 5) {
            return "other";
        }
        throw new IncompatibleClassChangeError();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C3059 m31584(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        JSONObject jSONObjectM31575 = m31575(str3, str4, str5, str6, str7, false, null, true, JSON.array());
        if (("FILE_NOT_FOUND".equals(str) && "source_stat".equals(str6) && "missing".equals(str7)) || (("FILE_NOT_REGULAR".equals(str) && "destination_stat".equals(str6) && "directory".equals(str7)) || ((("source_parent_stat".equals(str6) || "destination_parent_stat".equals(str6)) && (("FILE_PARENT_NOT_FOUND".equals(str) && "missing".equals(str7)) || ("FILE_NOT_DIRECTORY".equals(str) && "file".equals(str7)))) || "FILE_ALREADY_EXISTS".equals(str)))) {
            return C3059.m9365(str, str2, "warning", (JSONArray) null, jSONObjectM31575);
        }
        return C3059.m9369(str, str2, "fatal", null, jSONObjectM31575);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONObject m31575(String str, String str2, String str3, String str4, String str5, boolean z, String str6, boolean z2, JSONArray jSONArray) {
        return C7416.m19939(MotionUtils.EASING_TYPE_PATH, str, "targetPath", str2).add("policyRevision", str3).add("operation", str4).add("backendReason", str5).add("changed", z).add("operationMode", str6 == null ? JSON.NULL : JSON.value(str6)).add("stateKnown", z2).add("warnings", new JSONArray(jSONArray));
    }
}
