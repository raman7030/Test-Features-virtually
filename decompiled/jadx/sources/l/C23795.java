package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import com.google.android.material.motion.MotionUtils;
import com.umeng.commonsdk.internal.c;
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
public final class C23795 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final C6292 f76997 = C6292.ofPattern("yyyy-MM-dd'T'HH:mm:ssXXX", Locale.ROOT);

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final long f76998 = TimeUnit.SECONDS.toNanos(30);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f76999;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f77000;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C11440 f77001;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C17760 f77002;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m52470(C23795 c23795, long j, C11596 c11596) {
        c23795.getClass();
        if (j - c11596.f34576 < f76998) {
            return false;
        }
        c23795.f76999 -= c11596.f34575.size();
        return true;
    }

    public C23795(C17760 c17760) {
        C11440 c11440 = new C11440();
        this.f77000 = new LinkedHashMap(16, 0.75f, true);
        this.f77002 = c17760;
        this.f77001 = c11440;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C18151 m52475(String str, int i, String str2, boolean z) throws C3059 {
        C17760 c17760 = this.f77002;
        C7383 c7383M41607 = c17760.m41607();
        String strM29843 = C12301.m29843(c7383M41607, str, MotionUtils.EASING_TYPE_PATH, true);
        C20769 c20769M24321 = C9480.m24321(str2, strM29843, z, i, c7383M41607.f22729, "");
        c7383M41607.m19883(strM29843);
        C10000 c10000M41608 = c17760.m41608(strM29843);
        try {
            C12619 c12619M41613 = c17760.m41613(strM29843);
            if (c12619M41613.m30885() == EnumC3447.MISSING) {
                throw C17760.m41606(strM29843);
            }
            if (c12619M41613.m30885() != EnumC3447.DIRECTORY) {
                throw C17760.m41603("FILE_NOT_DIRECTORY", "The requested path is not a directory.", strM29843, c12619M41613.m30885());
            }
            C7362 c7362 = new C7362(this, c12619M41613.m30882(), strM29843, z, c7383M41607, c20769M24321);
            ArrayList arrayList = new ArrayList(i);
            while (arrayList.size() < i && c7362.m19789()) {
                arrayList.add(C7362.m19794(c7362));
            }
            boolean zM19789 = c7362.m19789();
            String strM24319 = zM19789 ? C9480.m24319(strM29843, z, i, c7383M41607.f22729, new C20769(((C16739) arrayList.get(arrayList.size() - 1)).f51384, c20769M24321.f67276), "") : "";
            ArrayList arrayListM52466 = m52466(arrayList);
            arrayList.size();
            C18151 c18151 = new C18151(strM29843, arrayListM52466, zM19789, strM24319, z, i);
            c10000M41608.close();
            return c18151;
        } catch (Throwable th) {
            try {
                c10000M41608.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C18151 m52476(String str, boolean z, String str2, int i, String str3, C20974 c20974) throws C3059 {
        C17760 c17760 = this.f77002;
        C7383 c7383M41607 = c17760.m41607();
        int i2 = 0;
        String strM29843 = C12301.m29843(c7383M41607, str, MotionUtils.EASING_TYPE_PATH, false);
        C20769 c20769M24321 = C9480.m24321(str2, strM29843, z, i, c7383M41607.f22729, str3);
        c7383M41607.m19883(strM29843);
        C10000 c10000M41608 = c17760.m41608(strM29843);
        try {
            C12619 c12619M41613 = c17760.m41613(strM29843);
            if (c12619M41613.m30885() == EnumC3447.MISSING) {
                throw C17760.m41606(strM29843);
            }
            if (c12619M41613.m30885() != EnumC3447.DIRECTORY) {
                throw C17760.m41603("FILE_NOT_DIRECTORY", "The requested path is not a directory.", strM29843, c12619M41613.m30885());
            }
            C7362 c7362 = new C7362(this, c12619M41613.m30882(), strM29843, z, c7383M41607, c20769M24321, c20974, 0);
            ArrayList arrayList = new ArrayList();
            String str4 = c20769M24321.f67275;
            long jNanoTime = System.nanoTime();
            while (arrayList.size() < i && i2 < 2000 && c7362.m19789()) {
                C2629.m8282();
                C16739 c16739M19794 = C7362.m19794(c7362);
                String str5 = c16739M19794.f51384;
                i2++;
                if (c20974.m47789(c16739M19794.f51385)) {
                    arrayList.add(c16739M19794);
                }
                long j = jNanoTime;
                str4 = str5;
                if (System.nanoTime() - jNanoTime >= TimeUnit.SECONDS.toNanos(2L)) {
                    break;
                }
                jNanoTime = j;
            }
            boolean zM19792 = C7362.m19792(c7362);
            String strM24319 = zM19792 ? C9480.m24319(strM29843, z, i, c7383M41607.f22729, new C20769(str4, c20769M24321.f67276), str3) : "";
            ArrayList arrayListM52466 = m52466(arrayList);
            arrayList.size();
            C18151 c18151 = new C18151(strM29843, arrayListM52466, zM19792, strM24319, z, i);
            c10000M41608.close();
            return c18151;
        } catch (Throwable th) {
            try {
                c10000M41608.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C14622 m52474(String str) throws C3059 {
        Long lValueOf;
        String strSubstring;
        String str2;
        C17760 c17760 = this.f77002;
        C7383 c7383M41607 = c17760.m41607();
        String strM41599 = C17760.m41599(str, c7383M41607, MotionUtils.EASING_TYPE_PATH);
        String str3 = c7383M41607.f22729;
        C10000 c10000M41608 = c17760.m41608(strM41599);
        try {
            C12619 c12619M41613 = c17760.m41613(strM41599);
            if (c12619M41613.m30885() == EnumC3447.MISSING) {
                throw C17760.m41606(strM41599);
            }
            EnumC3447 enumC3447M30885 = c12619M41613.m30885();
            EnumC3447 enumC3447 = EnumC3447.REGULAR;
            if (enumC3447M30885 != enumC3447 || c12619M41613.m30884() < 0) {
                lValueOf = null;
            } else {
                long jM30884 = c12619M41613.m30884();
                if (jM30884 > 9007199254740991L) {
                    throw C3059.m9365("FILE_STORAGE_ERROR", "The file size exceeds the supported JSON integer range.", "warning", (JSONArray) null, C7416.m19939(MotionUtils.EASING_TYPE_PATH, strM41599, "policyRevision", str3).add("operation", c.h).add("backendReason", "size_out_of_range"));
                }
                lValueOf = Long.valueOf(jM30884);
            }
            if (c12619M41613.m30885() == enumC3447) {
                try {
                    AbstractC15440 abstractC15440M30882 = c12619M41613.m30882();
                    abstractC15440M30882.getClass();
                    MessageDigest messageDigestM34532 = C14460.m34532();
                    C14460.m34527(messageDigestM34532, abstractC15440M30882.mo27926());
                    strSubstring = C14460.m34531(messageDigestM34532.digest()).substring(0, 16);
                    C12619 c12619M41614 = c17760.m41613(strM41599);
                    if (c12619M41614.m30885() != enumC3447 || c12619M41613.m30884() != c12619M41614.m30884()) {
                        throw C3059.m9365("FILE_CHANGED_DURING_READ", "The file changed while its content version was being calculated.", "warning", (JSONArray) null, JSON.object().add(MotionUtils.EASING_TYPE_PATH, strM41599).add("policyRevision", str3).add("operation", "stat_hash"));
                    }
                } catch (IOException e) {
                    throw C17760.m41601(strM41599, e);
                }
            } else {
                strSubstring = null;
            }
            long jM30883 = c12619M41613.m30883();
            String str4 = jM30883 <= 0 ? null : f76997.format(C4239.ofEpochMilli(jM30883).atZone(AbstractC5650.systemDefault()));
            int i = C5951.f18249[c12619M41613.m30885().ordinal()];
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
            C14622 c14622 = new C14622(strM41599, str2, lValueOf, str4, c7383M41607.m19881(strM41599).f73841.m16738(), strSubstring);
            c10000M41608.close();
            return c14622;
        } catch (Throwable th) {
            try {
                c10000M41608.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m52466(ArrayList arrayList) {
        String str;
        String str2;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C16739 c16739 = (C16739) it.next();
            StringBuilder sb = new StringBuilder();
            C12619 c12619 = c16739.f51385;
            int i = C5951.f18249[c12619.m30885().ordinal()];
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
            if (c12619.m30885() == EnumC3447.REGULAR && c12619.m30884() >= 0) {
                sb.append(c12619.m30884());
            } else {
                sb.append('-');
            }
            sb.append(' ');
            long jM30883 = c12619.m30883();
            if (jM30883 <= 0) {
                str2 = null;
            } else {
                str2 = f76997.format(C4239.ofEpochMilli(jM30883).atZone(AbstractC5650.systemDefault()));
            }
            if (str2 == null) {
                str2 = "-";
            }
            sb.append(str2);
            sb.append(' ');
            sb.append(c16739.f51384);
            arrayList2.add(sb.toString());
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static List m52467(final C23795 c23795, C1923 c1923) {
        ArrayList arrayList;
        synchronized (c23795) {
            c23795.f77001.getClass();
            final long jNanoTime = System.nanoTime();
            C5378.removeIf(c23795.f77000.values(), new Predicate() { // from class: l.ۤۡۜ
                @Override // java.util.function.Predicate
                public /* synthetic */ Predicate and(Predicate predicate) {
                    return C19285.$default$and(this, predicate);
                }

                @Override // java.util.function.Predicate
                /* JADX INFO: renamed from: negate */
                public /* synthetic */ Predicate mo4928negate() {
                    return C19285.$default$negate(this);
                }

                public /* synthetic */ Predicate or(Predicate predicate) {
                    return C19285.$default$or(this, predicate);
                }

                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return C23795.m52470(this.f30601, jNanoTime, (C11596) obj);
                }
            });
            C11596 c11596 = (C11596) c23795.f77000.get(c1923);
            arrayList = c11596 == null ? null : c11596.f34575;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m52469(C23795 c23795, C1923 c1923, ArrayList arrayList) {
        synchronized (c23795) {
            if (arrayList.size() > 20000) {
                return;
            }
            LinkedHashMap linkedHashMap = c23795.f77000;
            c23795.f77001.getClass();
            C11596 c11596 = (C11596) linkedHashMap.put(c1923, new C11596(arrayList, System.nanoTime()));
            c23795.f76999 = (arrayList.size() - (c11596 == null ? 0 : c11596.f34575.size())) + c23795.f76999;
            while (true) {
                if (c23795.f77000.size() <= 64 && c23795.f76999 <= 20000) {
                    return;
                }
                Iterator it = c23795.f77000.values().iterator();
                c23795.f76999 -= ((C11596) it.next()).f34575.size();
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m52471(String str, String str2) throws C3059 {
        try {
            String strM29847 = C12301.m29847(str2, "backendPath");
            m52473(str, strM29847);
            return strM29847;
        } catch (C3059 unused) {
            throw m52472(str);
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static String m52473(String str, String str2) throws C3059 {
        String strM37867 = "/".equals(str) ? "/" : C16014.m37867(str, "/");
        if (!str2.startsWith(strM37867)) {
            throw m52472(str);
        }
        String strSubstring = str2.substring(strM37867.length());
        if (strSubstring.isEmpty() || strSubstring.indexOf(47) >= 0 || ".".equals(strSubstring) || "..".equals(strSubstring)) {
            throw m52472(str);
        }
        return strSubstring;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C3059 m52472(String str) {
        return C3059.m9365("FILE_STORAGE_ERROR", "The file backend returned an invalid direct child path.", "warning", (JSONArray) null, C7416.m19939(MotionUtils.EASING_TYPE_PATH, str, "operation", "list").add("backendReason", "invalid_child_path"));
    }
}
