package l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۤۧۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: R78D */
/* JADX INFO: loaded from: classes3.dex */
public final class C10247 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final HashMap f30890 = new HashMap();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final HashMap f30892 = new HashMap();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Object f30891 = new Object();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C9042 m25971(C14852 c14852) throws C3059 {
        C9042 c9042 = c14852.f45309;
        if (c9042 != null) {
            return c9042;
        }
        C3059 c3059 = c14852.f45310;
        if (c3059 != null) {
            throw c3059;
        }
        if (!c14852.f45301) {
            C3059 c3059M9368 = C3059.m9368("RESOURCE_TABLE_UNAVAILABLE", "Resource table is unavailable.");
            c14852.f45310 = c3059M9368;
            throw c3059M9368;
        }
        if ("parse_error".equals(c14852.f45290)) {
            String str = c14852.f45295;
            C3059 c3059M9369 = C3059.m9368("RESOURCE_TABLE_PARSE_FAILED", str != null ? str : "Failed to parse resources.arsc");
            c14852.f45310 = c3059M9369;
            throw c3059M9369;
        }
        C19626 c19626 = c14852.f45291;
        if (c19626 == null) {
            C3059 c3059M93610 = C3059.m9368("RESOURCE_TABLE_PARSE_FAILED", "Failed to parse resources.arsc");
            c14852.f45310 = c3059M93610;
            throw c3059M93610;
        }
        try {
            C9042 c9042M23304 = C9042.m23304(c19626);
            c14852.f45309 = c9042M23304;
            return c9042M23304;
        } catch (C3059 e) {
            c14852.f45310 = e;
            throw e;
        } catch (Exception e2) {
            C3059 c3059M93611 = C3059.m9368("RESOURCE_TABLE_PARSE_FAILED", e2.getMessage() != null ? e2.getMessage() : "Failed to parse resources.arsc");
            c14852.f45310 = c3059M93611;
            throw c3059M93611;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C9042 m25979(C14852 c14852, C15799 c15799, String str) {
        String strM34531;
        c15799.getClass();
        if (C15799.m37396(str)) {
            return m25971(c14852);
        }
        ArrayList arrayListM37429 = c15799.m37429(c14852, str);
        if (arrayListM37429.isEmpty()) {
            return m25971(c14852);
        }
        if (c14852.f45291 == null) {
            return m25971(c14852);
        }
        String str2 = c14852.f45300 + ":" + str + ":";
        synchronized (this.f30891) {
            C12363 c12363 = (C12363) this.f30892.get(str2);
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            if (c12363 != null) {
                strM34531 = c12363.f37054;
            } else {
                strM34531 = C14460.m34531(C4103.m12324(arrayListM37429, new byte[32]));
            }
            sb.append(strM34531);
            String string = sb.toString();
            C9042 c9042 = (C9042) this.f30890.get(string);
            if (c9042 != null) {
                return c9042;
            }
            C9042 c9042M23305 = C9042.m23305(c14852.f45291, arrayListM37429);
            synchronized (this.f30891) {
                C9042 c9043 = (C9042) this.f30890.get(string);
                if (c9043 != null) {
                    return c9043;
                }
                this.f30890.put(string, c9042M23305);
                return c9042M23305;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m25978(String str, String str2) {
        m25973(str + ":" + str2 + ":");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m25977(String str) {
        m25973(C16014.m37867(str, ":"));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList m25974(int i, String str, String str2) {
        String str3 = str + ":" + str2 + ":";
        synchronized (this.f30891) {
            C12363 c12363 = (C12363) this.f30892.get(str3);
            if (c12363 == null) {
                return null;
            }
            if (c12363.f37056 != i) {
                this.f30892.remove(str3);
                return null;
            }
            return new ArrayList(c12363.f37055);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList m25975(int i, String str, String str2, ArrayList arrayList) {
        ArrayList arrayList2;
        String str3 = str + ":" + str2 + ":";
        String strM34531 = C14460.m34531(C4103.m12324(arrayList, new byte[32]));
        synchronized (this.f30891) {
            C9042 c9042 = (C9042) this.f30890.get(str3 + strM34531);
            ArrayList arrayList3 = c9042 == null ? new ArrayList(arrayList) : c9042.m23339();
            this.f30892.put(str3, new C12363(i, strM34531, arrayList3));
            arrayList2 = new ArrayList(arrayList3);
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m25973(String str) {
        synchronized (this.f30891) {
            Iterator it = this.f30890.keySet().iterator();
            while (it.hasNext()) {
                if (((String) it.next()).startsWith(str)) {
                    it.remove();
                }
            }
            C5378.removeIf(this.f30892.keySet(), new C13068(0, str));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m25972(C14852 c14852, C3059 c3059) {
        String str = c3059.f9610;
        if ("RESOURCE_TABLE_UNAVAILABLE".equals(str) || "RESOURCE_TABLE_PARSE_FAILED".equals(str)) {
            c14852.f45309 = null;
            c14852.f45310 = c3059;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C12534 m25976(C14852 c14852, C15799 c15799, String str) {
        if (!c14852.f45297.f59607) {
            return new C12534();
        }
        try {
            return m25979(c14852, c15799, str).m23333();
        } catch (RuntimeException unused) {
            return new C12534();
        } catch (C3059 e) {
            if (C15799.m37396(str)) {
                m25972(c14852, e);
            }
            return new C12534();
        }
    }
}
