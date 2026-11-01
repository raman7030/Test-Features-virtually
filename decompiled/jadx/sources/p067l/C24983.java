package p067l;

import bin.p000mt.json.JSON;
import bin.p000mt.json.JSONArray;
import com.google.android.material.motion.MotionUtils;
import com.umeng.commonsdk.internal.C0773c;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.᩻ܺۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: L6Y6 */
/* JADX INFO: loaded from: classes.dex */
public final class C24983 {

    /* JADX INFO: renamed from: ܳ */
    public static final C8349 f79750 = C8349.ofPattern("yyyy-MM-dd'T'HH:mm:ssXXX", Locale.ROOT);

    /* JADX INFO: renamed from: ܿ */
    public static final long f79751 = TimeUnit.SECONDS.toNanos(30);

    /* JADX INFO: renamed from: ֫ */
    public int f79752;

    /* JADX INFO: renamed from: ۧ */
    public final LinkedHashMap f79753;

    /* JADX INFO: renamed from: ܽ */
    public final C13241 f79754;

    /* JADX INFO: renamed from: ᩳ */
    public final C19247 f79755;

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ boolean m54879(C24983 c24983, long j, C13389 c13389) {
        c24983.getClass();
        if (j - c13389.f37574 < f79751) {
            return false;
        }
        c24983.f79752 -= c13389.f37573.size();
        return true;
    }

    public C24983(C19247 c19247) {
        C13241 c13241 = new C13241();
        this.f79753 = new LinkedHashMap(16, 0.75f, true);
        this.f79755 = c19247;
        this.f79754 = c13241;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C19619 m54884(String str, int i, String str2, boolean z) throws C5276 {
        C19247 c19247 = this.f79755;
        C9385 c9385M43852 = c19247.m43852();
        String strM31903 = C14059.m31903(c9385M43852, str, MotionUtils.EASING_TYPE_PATH, true);
        C22107 c22107M26331 = C11378.m26331(str2, strM31903, z, i, c9385M43852.f25641, "");
        c9385M43852.m21856(strM31903);
        C11872 c11872M43853 = c19247.m43853(strM31903);
        try {
            C14362 c14362M43858 = c19247.m43858(strM31903);
            if (c14362M43858.m32962() == EnumC5645.MISSING) {
                throw C19247.m43851(strM31903);
            }
            if (c14362M43858.m32962() != EnumC5645.DIRECTORY) {
                throw C19247.m43848("FILE_NOT_DIRECTORY", "The requested path is not a directory.", strM31903, c14362M43858.m32962());
            }
            C9365 c9365 = new C9365(this, c14362M43858.m32959(), strM31903, z, c9385M43852, c22107M26331);
            ArrayList arrayList = new ArrayList(i);
            while (arrayList.size() < i && c9365.m21762()) {
                arrayList.add(C9365.m21767(c9365));
            }
            boolean zM21762 = c9365.m21762();
            String strM26329 = zM21762 ? C11378.m26329(strM31903, z, i, c9385M43852.f25641, new C22107(((C18277) arrayList.get(arrayList.size() - 1)).f54567, c22107M26331.f69960), "") : "";
            ArrayList arrayListM54875 = m54875(arrayList);
            arrayList.size();
            C19619 c19619 = new C19619(strM31903, arrayListM54875, zM21762, strM26329, z, i);
            c11872M43853.close();
            return c19619;
        } catch (Throwable th) {
            try {
                c11872M43853.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C19619 m54885(String str, boolean z, String str2, int i, String str3, C22302 c22302) throws C5276 {
        C19247 c19247 = this.f79755;
        C9385 c9385M43852 = c19247.m43852();
        int i2 = 0;
        String strM31903 = C14059.m31903(c9385M43852, str, MotionUtils.EASING_TYPE_PATH, false);
        C22107 c22107M26331 = C11378.m26331(str2, strM31903, z, i, c9385M43852.f25641, str3);
        c9385M43852.m21856(strM31903);
        C11872 c11872M43853 = c19247.m43853(strM31903);
        try {
            C14362 c14362M43858 = c19247.m43858(strM31903);
            if (c14362M43858.m32962() == EnumC5645.MISSING) {
                throw C19247.m43851(strM31903);
            }
            if (c14362M43858.m32962() != EnumC5645.DIRECTORY) {
                throw C19247.m43848("FILE_NOT_DIRECTORY", "The requested path is not a directory.", strM31903, c14362M43858.m32962());
            }
            C9365 c9365 = new C9365(this, c14362M43858.m32959(), strM31903, z, c9385M43852, c22107M26331, c22302, 0);
            ArrayList arrayList = new ArrayList();
            String str4 = c22107M26331.f69959;
            long jNanoTime = System.nanoTime();
            while (arrayList.size() < i && i2 < 2000 && c9365.m21762()) {
                C4867.m10326();
                C18277 c18277M21767 = C9365.m21767(c9365);
                String str5 = c18277M21767.f54567;
                i2++;
                if (c22302.m50119(c18277M21767.f54568)) {
                    arrayList.add(c18277M21767);
                }
                long j = jNanoTime;
                str4 = str5;
                if (System.nanoTime() - jNanoTime >= TimeUnit.SECONDS.toNanos(2L)) {
                    break;
                }
                jNanoTime = j;
            }
            boolean zM21765 = C9365.m21765(c9365);
            String strM26329 = zM21765 ? C11378.m26329(strM31903, z, i, c9385M43852.f25641, new C22107(str4, c22107M26331.f69960), str3) : "";
            ArrayList arrayListM54875 = m54875(arrayList);
            arrayList.size();
            C19619 c19619 = new C19619(strM31903, arrayListM54875, zM21765, strM26329, z, i);
            c11872M43853.close();
            return c19619;
        } catch (Throwable th) {
            try {
                c11872M43853.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C16265 m54883(String str) throws C5276 {
        Long lValueOf;
        String strSubstring;
        String str2;
        C19247 c19247 = this.f79755;
        C9385 c9385M43852 = c19247.m43852();
        String strM43844 = C19247.m43844(str, c9385M43852, MotionUtils.EASING_TYPE_PATH);
        String str3 = c9385M43852.f25641;
        C11872 c11872M43853 = c19247.m43853(strM43844);
        try {
            C14362 c14362M43858 = c19247.m43858(strM43844);
            if (c14362M43858.m32962() == EnumC5645.MISSING) {
                throw C19247.m43851(strM43844);
            }
            EnumC5645 enumC5645M32962 = c14362M43858.m32962();
            EnumC5645 enumC5645 = EnumC5645.REGULAR;
            if (enumC5645M32962 != enumC5645 || c14362M43858.m32961() < 0) {
                lValueOf = null;
            } else {
                long jM32961 = c14362M43858.m32961();
                if (jM32961 > 9007199254740991L) {
                    throw C5276.m11407("FILE_STORAGE_ERROR", "The file size exceeds the supported JSON integer range.", "warning", (JSONArray) null, C9417.m21913(MotionUtils.EASING_TYPE_PATH, strM43844, "policyRevision", str3).add("operation", C0773c.f3251h).add("backendReason", "size_out_of_range"));
                }
                lValueOf = Long.valueOf(jM32961);
            }
            if (c14362M43858.m32962() == enumC5645) {
                try {
                    AbstractC17043 abstractC17043M32959 = c14362M43858.m32959();
                    abstractC17043M32959.getClass();
                    MessageDigest messageDigestM36666 = C16111.m36666();
                    C16111.m36661(messageDigestM36666, abstractC17043M32959.mo29987());
                    strSubstring = C16111.m36665(messageDigestM36666.digest()).substring(0, 16);
                    C14362 c14362M43859 = c19247.m43858(strM43844);
                    if (c14362M43859.m32962() != enumC5645 || c14362M43858.m32961() != c14362M43859.m32961()) {
                        throw C5276.m11407("FILE_CHANGED_DURING_READ", "The file changed while its content version was being calculated.", "warning", (JSONArray) null, JSON.object().add(MotionUtils.EASING_TYPE_PATH, strM43844).add("policyRevision", str3).add("operation", "stat_hash"));
                    }
                } catch (IOException e) {
                    throw C19247.m43846(strM43844, e);
                }
            } else {
                strSubstring = null;
            }
            long jM32960 = c14362M43858.m32960();
            String str4 = jM32960 <= 0 ? null : f79750.format(C6398.ofEpochMilli(jM32960).atZone(AbstractC7739.systemDefault()));
            int i = C8024.f21104[c14362M43858.m32962().ordinal()];
            if (i == 1) {
                str2 = "file";
            } else if (i == 2) {
                str2 = "directory";
            } else if (i == 3) {
                str2 = "link";
            } else {
                if (i != 4) {
                    if (i != 5) {
                        throw new IncompatibleClassChangeError();
                    }
                    throw new IllegalArgumentException("Missing node has no stat type");
                }
                str2 = "other";
            }
            C16265 c16265 = new C16265(strM43844, str2, lValueOf, str4, c9385M43852.m21854(strM43844).f76571.m18664(), strSubstring);
            c11872M43853.close();
            return c16265;
        } catch (Throwable th) {
            try {
                c11872M43853.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static ArrayList m54875(ArrayList arrayList) {
        String str;
        String str2;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C18277 c18277 = (C18277) it.next();
            StringBuilder sb = new StringBuilder();
            C14362 c14362 = c18277.f54568;
            int i = C8024.f21104[c14362.m32962().ordinal()];
            if (i == 1) {
                str = "f";
            } else if (i == 2) {
                str = "d";
            } else if (i == 3) {
                str = "l";
            } else {
                if (i != 4) {
                    if (i != 5) {
                        throw new IncompatibleClassChangeError();
                    }
                    throw new IllegalArgumentException("Missing node cannot be listed");
                }
                str = "o";
            }
            sb.append(str);
            sb.append(' ');
            if (c14362.m32962() == EnumC5645.REGULAR && c14362.m32961() >= 0) {
                sb.append(c14362.m32961());
            } else {
                sb.append('-');
            }
            sb.append(' ');
            long jM32960 = c14362.m32960();
            if (jM32960 <= 0) {
                str2 = null;
            } else {
                str2 = f79750.format(C6398.ofEpochMilli(jM32960).atZone(AbstractC7739.systemDefault()));
            }
            if (str2 == null) {
                str2 = "-";
            }
            sb.append(str2);
            sb.append(' ');
            sb.append(c18277.f54567);
            arrayList2.add(sb.toString());
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: ֫ */
    public static List m54876(final C24983 c24983, C4196 c4196) {
        ArrayList arrayList;
        synchronized (c24983) {
            c24983.f79754.getClass();
            final long jNanoTime = System.nanoTime();
            C7480.removeIf(c24983.f79753.values(), new Predicate() { // from class: l.ۤۡۜ
                @Override // java.util.function.Predicate
                public /* synthetic */ Predicate and(Predicate predicate) {
                    return C20697.$default$and(this, predicate);
                }

                @Override // java.util.function.Predicate
                /* JADX INFO: renamed from: negate */
                public /* synthetic */ Predicate mo55838negate() {
                    return C20697.$default$negate(this);
                }

                /* JADX INFO: renamed from: or */
                public /* synthetic */ Predicate m27606or(Predicate predicate) {
                    return C20697.$default$or(this, predicate);
                }

                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return C24983.m54879(this.f33563, jNanoTime, (C13389) obj);
                }
            });
            C13389 c13389 = (C13389) c24983.f79753.get(c4196);
            arrayList = c13389 == null ? null : c13389.f37573;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m54878(C24983 c24983, C4196 c4196, ArrayList arrayList) {
        synchronized (c24983) {
            if (arrayList.size() > 20000) {
                return;
            }
            LinkedHashMap linkedHashMap = c24983.f79753;
            c24983.f79754.getClass();
            C13389 c13389 = (C13389) linkedHashMap.put(c4196, new C13389(arrayList, System.nanoTime()));
            c24983.f79752 = (arrayList.size() - (c13389 == null ? 0 : c13389.f37573.size())) + c24983.f79752;
            while (true) {
                if (c24983.f79753.size() <= 64 && c24983.f79752 <= 20000) {
                    return;
                }
                Iterator it = c24983.f79753.values().iterator();
                c24983.f79752 -= ((C13389) it.next()).f37573.size();
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static String m54880(String str, String str2) throws C5276 {
        try {
            String strM31907 = C14059.m31907(str2, "backendPath");
            m54882(str, strM31907);
            return strM31907;
        } catch (C5276 unused) {
            throw m54881(str);
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public static String m54882(String str, String str2) throws C5276 {
        String strM40053 = "/".equals(str) ? "/" : C17588.m40053(str, "/");
        if (!str2.startsWith(strM40053)) {
            throw m54881(str);
        }
        String strSubstring = str2.substring(strM40053.length());
        if (strSubstring.isEmpty() || strSubstring.indexOf(47) >= 0 || ".".equals(strSubstring) || "..".equals(strSubstring)) {
            throw m54881(str);
        }
        return strSubstring;
    }

    /* JADX INFO: renamed from: ۧ */
    public static C5276 m54881(String str) {
        return C5276.m11407("FILE_STORAGE_ERROR", "The file backend returned an invalid direct child path.", "warning", (JSONArray) null, C9417.m21913(MotionUtils.EASING_TYPE_PATH, str, "operation", "list").add("backendReason", "invalid_child_path"));
    }
}
