package p067l;

import bin.p000mt.json.JSON;
import bin.p000mt.json.JSONArray;
import bin.p000mt.json.JSONObject;
import com.google.android.material.motion.MotionUtils;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;

/* JADX INFO: renamed from: l.۬ۡۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: M6XL */
/* JADX INFO: loaded from: classes3.dex */
public final class C14729 {

    /* JADX INFO: renamed from: ֫ */
    public final C21545 f41980;

    /* JADX INFO: renamed from: ۧ */
    public final C19247 f41981;

    public C14729(C19247 c19247) {
        C21545 c21545 = new C21545();
        this.f41981 = c19247;
        this.f41980 = c21545;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C5342 m33671(String str, String str2, boolean z) throws C5276 {
        C19247 c19247 = this.f41981;
        C9385 c9385M43852 = c19247.m43852();
        String strM43850 = C19247.m43850(str, c9385M43852, "sourcePath");
        String strM43851 = C19247.m43850(str2, c9385M43852, "destinationPath");
        if (strM43850.equals(strM43851)) {
            throw m33669("FILE_MOVE_FAILED", "Source and destination must identify different paths.", strM43850, strM43851, c9385M43852.f25641, "prepare", "same_path");
        }
        C11872 c11872M43854 = c19247.m43854(Arrays.asList(strM43850, strM43851));
        try {
            C5342 c5342M33665 = m33665(c9385M43852, strM43850, strM43851, z);
            c11872M43854.close();
            return c5342M33665;
        } catch (Throwable th) {
            try {
                c11872M43854.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private C5342 m33665(C9385 c9385, String str, String str2, boolean z) throws C5276 {
        C6683 c6683M15202;
        C21545 c21545 = this.f41980;
        String str3 = c9385.f25641;
        C19247 c19247 = this.f41981;
        AbstractC17043 abstractC17043M43857 = c19247.m43857(str);
        AbstractC17043 abstractC17043M43858 = c19247.m43857(str2);
        C14362 c14362M33666 = m33666(abstractC17043M43857);
        C14362 c14362M33667 = m33666(abstractC17043M43858);
        String str4 = c9385.f25641;
        int[] iArr = C21436.f67626;
        int i = iArr[c14362M33666.m32962().ordinal()];
        if (i == 3) {
            throw m33669("FILE_NOT_FOUND", "The source path does not exist.", str, str2, str4, "source_stat", "missing");
        }
        if (i == 4) {
            throw m33669("FILE_IS_SYMLINK", "Symbolic links cannot be moved by the generic file tool.", str, str2, str4, "source_stat", "link");
        }
        if (i == 5) {
            throw m33669("FILE_UNSUPPORTED_TYPE", "The source node type cannot be moved by the generic file tool.", str, str2, str4, "source_stat", "other");
        }
        String str5 = c9385.f25641;
        EnumC5645 enumC5645M32962 = c14362M33666.m32962();
        EnumC5645 enumC5645 = EnumC5645.DIRECTORY;
        if (enumC5645M32962 == enumC5645) {
            if (z) {
                throw m33669("FILE_DIRECTORY_MERGE_UNSUPPORTED", "Directory moves require overwrite=false and never replace a target.", str, str2, str5, "prepare", "directory_overwrite_unsupported");
            }
            int i2 = iArr[c14362M33667.m32962().ordinal()];
            if (i2 == 1) {
                throw m33669("FILE_ALREADY_EXISTS", "The destination of a directory move must not already exist.", str, str2, str5, "destination_stat", "file");
            }
            if (i2 == 2) {
                throw m33669("FILE_DIRECTORY_MERGE_UNSUPPORTED", "Directory merging is not supported by the generic file tool.", str, str2, str5, "destination_stat", "directory");
            }
            if (i2 == 4) {
                throw m33669("FILE_IS_SYMLINK", "Symbolic links cannot be replaced by the generic file tool.", str, str2, str5, "destination_stat", "link");
            }
            if (i2 == 5) {
                throw m33669("FILE_UNSUPPORTED_TYPE", "The destination node type cannot be replaced by the generic file tool.", str, str2, str5, "destination_stat", "other");
            }
        } else {
            if (!z && c14362M33667.m32962() != EnumC5645.MISSING) {
                throw m33669("FILE_ALREADY_EXISTS", "The destination already exists and overwrite is false.", str, str2, str5, "destination_stat", m33663(c14362M33667.m32962()));
            }
            if (z) {
                if (c14362M33667.m32962() == EnumC5645.LINK) {
                    throw m33669("FILE_IS_SYMLINK", "Symbolic links cannot be replaced by the generic file tool.", str, str2, str5, "destination_stat", "link");
                }
                if (c14362M33667.m32962() == EnumC5645.OTHER) {
                    throw m33669("FILE_UNSUPPORTED_TYPE", "The destination node type cannot be replaced by the generic file tool.", str, str2, str5, "destination_stat", "other");
                }
                if (c14362M33667.m32962() == enumC5645) {
                    throw m33669("FILE_NOT_REGULAR", "A regular file cannot replace a directory.", str, str2, str5, "destination_stat", "directory");
                }
            }
        }
        if (c14362M33666.m32962() == enumC5645 && C14059.m31906(str2, str)) {
            throw m33669("FILE_MOVE_INTO_DESCENDANT", "A directory cannot be moved into itself or one of its descendants.", str, str2, c9385.f25641, "prepare", "destination_is_descendant");
        }
        String strM33662 = m33662(str, str2, abstractC17043M43857, str3, "source");
        String strM33663 = m33662(str, str2, abstractC17043M43858, str3, "destination");
        c9385.m21857(strM33662);
        c9385.m21857(strM33663);
        String str6 = strM33663;
        m33667(str, str2, strM33662, c9385.f25641, "source");
        m33667(str, str2, str6, c9385.f25641, "destination");
        m33670(str, str2, abstractC17043M43857, c9385.f25641, "source_parent_links");
        m33670(str, str2, abstractC17043M43858, c9385.f25641, "destination_parent_links");
        EnumC15032 enumC15032 = c14362M33667.m32962() == EnumC5645.MISSING ? EnumC15032.RENAME_NO_REPLACE : EnumC15032.REPLACE;
        if (abstractC17043M43857.mo25509().mo10729(enumC15032) == EnumC6986.UNSUPPORTED) {
            throw m33669("FILE_DIRECT_MOVE_UNSUPPORTED", "The storage backend cannot perform this move as a direct operation.", str, str2, c9385.f25641, enumC15032.name().toLowerCase(Locale.ROOT), "unsupported");
        }
        while (true) {
            C9385 c9385M43852 = c19247.m43852();
            c9385M43852.m21857(str);
            String str7 = c9385M43852.f25641;
            c9385M43852.m21855(str);
            c9385M43852.m21857(str2);
            c9385M43852.m21855(str2);
            c9385M43852.m21857(strM33662);
            String str8 = str6;
            c9385M43852.m21857(str8);
            AbstractC17043 abstractC17043M43859 = c19247.m43857(str);
            AbstractC17043 abstractC17043M438510 = c19247.m43857(str2);
            C14362 c14362M33668 = m33666(abstractC17043M43859);
            C21545 c21546 = c21545;
            m33668(str, str2, c14362M33666, c14362M33667, c14362M33668, m33666(abstractC17043M438510), c9385M43852.f25641);
            m33667(str, str2, strM33662, c9385M43852.f25641, "source");
            m33667(str, str2, str8, c9385M43852.f25641, "destination");
            m33670(str, str2, abstractC17043M43859, c9385M43852.f25641, "source_parent_links");
            m33670(str, str2, abstractC17043M438510, c9385M43852.f25641, "destination_parent_links");
            if (c14362M33668.m32962() == EnumC5645.DIRECTORY) {
                ArrayDeque arrayDeque = new ArrayDeque();
                HashSet hashSet = new HashSet();
                arrayDeque.add(c14362M33668);
                while (!arrayDeque.isEmpty()) {
                    C14362 c14362 = (C14362) arrayDeque.removeFirst();
                    if (hashSet.add(m33661(c14362.m32959().mo25505(), str, str2, str7))) {
                        try {
                            for (C14362 c14363 : c14362.m32959().mo25509().mo10728(c14362)) {
                                String strM33661 = m33661(c14363.m32959().mo25505(), str, str2, str7);
                                StringBuilder sbM17248 = C7470.m17248(str2);
                                sbM17248.append(strM33661.substring(str.length()));
                                String string = sbM17248.toString();
                                HashSet hashSet2 = hashSet;
                                if (c14363.m32962() != EnumC5645.MISSING) {
                                    c9385M43852.m21857(strM33661);
                                    c9385M43852.m21857(string);
                                    int i3 = C21436.f67626[c14363.m32962().ordinal()];
                                    if (i3 == 2) {
                                        arrayDeque.addLast(c14363);
                                    } else if (i3 == 5) {
                                        throw m33669("FILE_UNSUPPORTED_TYPE", "A directory move cannot include an unsupported special node.", strM33661, string, c9385M43852.f25641, "source_tree", "other");
                                    }
                                }
                                hashSet = hashSet2;
                            }
                        } catch (C23750 e) {
                            throw C19247.m43849(e);
                        }
                    }
                }
            }
            C9385 c9385M43853 = c19247.m43852();
            if (str7.equals(c9385M43853.f25641)) {
                AbstractC17043 abstractC17043M438511 = c19247.m43857(str);
                AbstractC17043 abstractC17043M438512 = c19247.m43857(str2);
                m33668(str, str2, c14362M33666, c14362M33667, m33666(abstractC17043M438511), m33666(abstractC17043M438512), c9385M43853.f25641);
                m33667(str, str2, strM33662, c9385M43853.f25641, "source");
                m33667(str, str2, str8, c9385M43853.f25641, "destination");
                m33670(str, str2, abstractC17043M438511, c9385M43853.f25641, "source_parent_links");
                m33670(str, str2, abstractC17043M438512, c9385M43853.f25641, "destination_parent_links");
                AbstractC12351 abstractC12351Mo25509 = abstractC17043M438511.mo25509();
                EnumC6986 enumC6986Mo10729 = abstractC12351Mo25509.mo10729(enumC15032);
                if (enumC6986Mo10729 == EnumC6986.UNSUPPORTED) {
                    throw m33669("FILE_DIRECT_MOVE_UNSUPPORTED", "The storage backend cannot perform this move as a direct operation.", str, str2, c9385M43853.f25641, enumC15032.name().toLowerCase(Locale.ROOT), "unsupported");
                }
                String str9 = enumC6986Mo10729 == EnumC6986.ATOMIC ? "atomic" : "best_effort";
                JSONArray jSONArrayArray = JSON.array();
                try {
                    if (enumC15032 == EnumC15032.REPLACE) {
                        abstractC12351Mo25509.mo12969(abstractC17043M438512);
                    } else {
                        abstractC12351Mo25509.mo10730(abstractC17043M438512);
                    }
                    boolean z2 = c14362M33666.m32962() == EnumC5645.DIRECTORY;
                    try {
                        c21546.getClass();
                        C19553.m44409();
                        if (z2) {
                            C16114.m36693(str);
                            C16114.m36688(str2, false);
                        } else {
                            C16114.m36694(str);
                            C16114.m36688(str2, true);
                        }
                        C18211.m41420();
                    } catch (RuntimeException unused) {
                        jSONArrayArray.add("File move notification could not be completed.");
                    }
                    return new C5342(new JSONArray(jSONArrayArray), str, str2, m33663(c14362M33666.m32962()));
                } catch (C23750 e2) {
                    if (enumC6986Mo10729 == EnumC6986.ATOMIC) {
                        c6683M15202 = C6683.m15203(false);
                    } else {
                        EnumC5645 enumC5645M32963 = c14362M33666.m32962();
                        try {
                            AbstractC17043 abstractC17043M438513 = c19247.m43857(str);
                            AbstractC17043 abstractC17043M438514 = c19247.m43857(str2);
                            EnumC5645 enumC5645M32964 = abstractC17043M438513.mo25509().mo10732().m32962();
                            EnumC5645 enumC5645M32965 = abstractC17043M438514.mo25509().mo10732().m32962();
                            EnumC5645 enumC5646 = EnumC5645.MISSING;
                            c6683M15202 = (enumC5645M32964 == enumC5646 && enumC5645M32965 == enumC5645M32963) ? C6683.m15203(true) : (enumC15032 == EnumC15032.RENAME_NO_REPLACE && enumC5645M32964 == enumC5645M32963 && enumC5645M32965 == enumC5646) ? C6683.m15203(false) : C6683.m15202();
                        } catch (RuntimeException | C23750 unused2) {
                            c6683M15202 = C6683.m15202();
                        }
                    }
                    boolean z3 = c6683M15202.f17253;
                    boolean z4 = c6683M15202.f17252;
                    boolean z5 = c14362M33666.m32962() == EnumC5645.DIRECTORY;
                    if (z4 || !z3) {
                        try {
                            c21546.getClass();
                            C19553.m44409();
                            if (z5) {
                                C16114.m36693(str);
                                C16114.m36688(str2, false);
                            } else {
                                C16114.m36694(str);
                                C16114.m36688(str2, true);
                            }
                            C18211.m41420();
                        } catch (RuntimeException unused3) {
                            jSONArrayArray.add("File move notification could not be completed.");
                        }
                    }
                    if (!z4 && z3 && (e2.m52799() == EnumC23080.CROSS_BACKEND || e2.m52799() == EnumC23080.UNSUPPORTED)) {
                        String str10 = c9385M43853.f25641;
                        String strName = e2.m52799().name();
                        Locale locale = Locale.ROOT;
                        throw C5276.m11411("FILE_DIRECT_MOVE_UNSUPPORTED", "The storage backend cannot perform this move as a direct operation.", "fatal", null, m33660(str, str2, str10, enumC15032.name().toLowerCase(locale), strName.toLowerCase(locale), false, str9, true, jSONArrayArray));
                    }
                    String str11 = c9385M43853.f25641;
                    String strName2 = e2.m52799().name();
                    Locale locale2 = Locale.ROOT;
                    String lowerCase = strName2.toLowerCase(locale2);
                    boolean z6 = c6683M15202.f17252;
                    boolean z7 = c6683M15202.f17253;
                    throw C5276.m11407(z7 ? "FILE_MOVE_FAILED" : "FILE_OPERATION_STATE_UNKNOWN", z7 ? "The direct file move failed." : "The direct file move failed and its final state is unknown.", "warning", (JSONArray) null, m33660(str, str2, str11, enumC15032.name().toLowerCase(locale2), lowerCase, z6, str9, z7, jSONArrayArray));
                }
            }
            c21545 = c21546;
            str6 = str8;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m33662(String str, String str2, AbstractC17043 abstractC17043, String str3, String str4) throws C5276 {
        String parent = abstractC17043.getParent();
        if (parent != null) {
            return parent;
        }
        throw m33669("FILE_PARENT_NOT_FOUND", C6988.m16053("The ", str4, " path has no parent directory."), str, str2, str3, str4.concat("_parent_stat"), "parent_missing");
    }

    /* JADX INFO: renamed from: ֫ */
    private void m33667(String str, String str2, String str3, String str4, String str5) throws C5276 {
        C14362 c14362M33666 = m33666(this.f41981.m43857(str3));
        if (c14362M33666.m32962() == EnumC5645.MISSING) {
            throw m33669("FILE_PARENT_NOT_FOUND", C6988.m16053("The ", str5, " parent directory does not exist."), str, str2, str4, str5.concat("_parent_stat"), "missing");
        }
        if (c14362M33666.m32962() == EnumC5645.LINK) {
            throw m33669("FILE_IS_SYMLINK", "A symbolic-link parent cannot be traversed by a destructive file tool.", str, str2, str4, str5.concat("_parent_stat"), "parent_is_link");
        }
        if (c14362M33666.m32962() != EnumC5645.DIRECTORY) {
            throw m33669("FILE_NOT_DIRECTORY", C6988.m16053("The ", str5, " parent is not a directory."), str, str2, str4, str5.concat("_parent_stat"), m33663(c14362M33666.m32962()));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m33661(String str, String str2, String str3, String str4) throws C5276 {
        try {
            String strM31907 = C14059.m31907(str, "sourcePath");
            if (C14059.m31906(strM31907, str2)) {
                return strM31907;
            }
            throw m33669("FILE_MOVE_FAILED", "The storage backend returned an entry outside the source directory.", str2, str3, str4, "source_tree", "entry_outside_source");
        } catch (C5276 unused) {
            throw m33669("FILE_MOVE_FAILED", "The storage backend returned an invalid directory entry path.", str2, str3, str4, "source_tree", "invalid_entry_path");
        }
    }

    /* JADX INFO: renamed from: ۧ */
    private void m33670(final String str, final String str2, AbstractC17043 abstractC17043, final String str3, final String str4) throws C5276 {
        this.f41981.m43855(abstractC17043, new InterfaceC17905() { // from class: l.᩹ۡۜ
            @Override // p067l.InterfaceC17905
            /* JADX INFO: renamed from: ֫ */
            public final C5276 mo24636(String str5, String str6, String str7) {
                return C14729.m33664(str, str2, str3, str4, str5, str6, str7);
            }
        });
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ C5276 m33664(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        String str8;
        String str9;
        String str10;
        if (!"parent_missing".equals(str7) && !"ancestor_missing".equals(str7)) {
            if (!"FILE_NOT_DIRECTORY".equals(str5)) {
                str8 = str5;
                str10 = str6;
                str9 = str7;
            }
            return m33669(str8, str10, str, str2, str3, str4, str9);
        }
        str5 = "FILE_LINK_CHECK_FAILED";
        str7 = "missing";
        str8 = str5;
        str9 = str7;
        str10 = "The existing parent chain could not be verified safely.";
        return m33669(str8, str10, str, str2, str3, str4, str9);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m33668(String str, String str2, C14362 c14362, C14362 c14363, C14362 c14364, C14362 c14365, String str3) throws C5276 {
        if (c14362.m32962() != c14364.m32962() || c14363.m32962() != c14365.m32962()) {
            throw m33669("FILE_MOVE_FAILED", "A source or destination node changed during move validation.", str, str2, str3, "pre_move_stat", "node_type_changed");
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private C14362 m33666(AbstractC17043 abstractC17043) throws C5276 {
        try {
            return abstractC17043.mo25509().mo10732();
        } catch (C23750 e) {
            this.f41981.getClass();
            throw C19247.m43849(e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m33663(EnumC5645 enumC5645) {
        int i = C21436.f67626[enumC5645.ordinal()];
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

    /* JADX INFO: renamed from: ۧ */
    public static C5276 m33669(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        JSONObject jSONObjectM33660 = m33660(str3, str4, str5, str6, str7, false, null, true, JSON.array());
        if (("FILE_NOT_FOUND".equals(str) && "source_stat".equals(str6) && "missing".equals(str7)) || (("FILE_NOT_REGULAR".equals(str) && "destination_stat".equals(str6) && "directory".equals(str7)) || ((("source_parent_stat".equals(str6) || "destination_parent_stat".equals(str6)) && (("FILE_PARENT_NOT_FOUND".equals(str) && "missing".equals(str7)) || ("FILE_NOT_DIRECTORY".equals(str) && "file".equals(str7)))) || "FILE_ALREADY_EXISTS".equals(str)))) {
            return C5276.m11407(str, str2, "warning", (JSONArray) null, jSONObjectM33660);
        }
        return C5276.m11411(str, str2, "fatal", null, jSONObjectM33660);
    }

    /* JADX INFO: renamed from: ֫ */
    public static JSONObject m33660(String str, String str2, String str3, String str4, String str5, boolean z, String str6, boolean z2, JSONArray jSONArray) {
        return C9417.m21913(MotionUtils.EASING_TYPE_PATH, str, "targetPath", str2).add("policyRevision", str3).add("operation", str4).add("backendReason", str5).add("changed", z).add("operationMode", str6 == null ? JSON.NULL : JSON.value(str6)).add("stateKnown", z2).add("warnings", new JSONArray(jSONArray));
    }
}
