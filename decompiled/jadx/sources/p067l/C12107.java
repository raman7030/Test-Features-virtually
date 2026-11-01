package p067l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۤۧۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: R78D */
/* JADX INFO: loaded from: classes3.dex */
public final class C12107 {

    /* JADX INFO: renamed from: ֫ */
    public final HashMap f33851 = new HashMap();

    /* JADX INFO: renamed from: ܽ */
    public final HashMap f33853 = new HashMap();

    /* JADX INFO: renamed from: ۧ */
    public final Object f33852 = new Object();

    /* JADX INFO: renamed from: ֫ */
    public static C10962 m27993(C16484 c16484) throws C5276 {
        C10962 c10962 = c16484.f48425;
        if (c10962 != null) {
            return c10962;
        }
        C5276 c5276 = c16484.f48426;
        if (c5276 != null) {
            throw c5276;
        }
        if (!c16484.f48417) {
            C5276 c5276M11410 = C5276.m11410("RESOURCE_TABLE_UNAVAILABLE", "Resource table is unavailable.");
            c16484.f48426 = c5276M11410;
            throw c5276M11410;
        }
        if ("parse_error".equals(c16484.f48406)) {
            String str = c16484.f48411;
            C5276 c5276M11411 = C5276.m11410("RESOURCE_TABLE_PARSE_FAILED", str != null ? str : "Failed to parse resources.arsc");
            c16484.f48426 = c5276M11411;
            throw c5276M11411;
        }
        C21021 c21021 = c16484.f48407;
        if (c21021 == null) {
            C5276 c5276M11412 = C5276.m11410("RESOURCE_TABLE_PARSE_FAILED", "Failed to parse resources.arsc");
            c16484.f48426 = c5276M11412;
            throw c5276M11412;
        }
        try {
            C10962 c10962M25249 = C10962.m25249(c21021);
            c16484.f48425 = c10962M25249;
            return c10962M25249;
        } catch (C5276 e) {
            c16484.f48426 = e;
            throw e;
        } catch (Exception e2) {
            C5276 c5276M11413 = C5276.m11410("RESOURCE_TABLE_PARSE_FAILED", e2.getMessage() != null ? e2.getMessage() : "Failed to parse resources.arsc");
            c16484.f48426 = c5276M11413;
            throw c5276M11413;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final C10962 m28001(C16484 c16484, C17384 c17384, String str) {
        String strM36665;
        c17384.getClass();
        if (C17384.m39567(str)) {
            return m27993(c16484);
        }
        ArrayList arrayListM39600 = c17384.m39600(c16484, str);
        if (arrayListM39600.isEmpty()) {
            return m27993(c16484);
        }
        if (c16484.f48407 == null) {
            return m27993(c16484);
        }
        String str2 = c16484.f48416 + ":" + str + ":";
        synchronized (this.f33852) {
            C14118 c14118 = (C14118) this.f33853.get(str2);
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            if (c14118 != null) {
                strM36665 = c14118.f40070;
            } else {
                strM36665 = C16111.m36665(C6268.m14229(arrayListM39600, new byte[32]));
            }
            sb.append(strM36665);
            String string = sb.toString();
            C10962 c10962 = (C10962) this.f33851.get(string);
            if (c10962 != null) {
                return c10962;
            }
            C10962 c10962M25250 = C10962.m25250(c16484.f48407, arrayListM39600);
            synchronized (this.f33852) {
                C10962 c10963 = (C10962) this.f33851.get(string);
                if (c10963 != null) {
                    return c10963;
                }
                this.f33851.put(string, c10962M25250);
                return c10962M25250;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m28000(String str, String str2) {
        m27995(str + ":" + str2 + ":");
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m27999(String str) {
        m27995(C17588.m40053(str, ":"));
    }

    /* JADX INFO: renamed from: ֫ */
    public final ArrayList m27996(int i, String str, String str2) {
        String str3 = str + ":" + str2 + ":";
        synchronized (this.f33852) {
            C14118 c14118 = (C14118) this.f33853.get(str3);
            if (c14118 == null) {
                return null;
            }
            if (c14118.f40072 != i) {
                this.f33853.remove(str3);
                return null;
            }
            return new ArrayList(c14118.f40071);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final ArrayList m27997(int i, String str, String str2, ArrayList arrayList) {
        ArrayList arrayList2;
        String str3 = str + ":" + str2 + ":";
        String strM36665 = C16111.m36665(C6268.m14229(arrayList, new byte[32]));
        synchronized (this.f33852) {
            C10962 c10962 = (C10962) this.f33851.get(str3 + strM36665);
            ArrayList arrayList3 = c10962 == null ? new ArrayList(arrayList) : c10962.m25284();
            this.f33853.put(str3, new C14118(i, strM36665, arrayList3));
            arrayList2 = new ArrayList(arrayList3);
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: ۧ */
    private void m27995(String str) {
        synchronized (this.f33852) {
            Iterator it = this.f33851.keySet().iterator();
            while (it.hasNext()) {
                if (((String) it.next()).startsWith(str)) {
                    it.remove();
                }
            }
            C7480.removeIf(this.f33853.keySet(), new C14788(0, str));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m27994(C16484 c16484, C5276 c5276) {
        String str = c5276.f12413;
        if ("RESOURCE_TABLE_UNAVAILABLE".equals(str) || "RESOURCE_TABLE_PARSE_FAILED".equals(str)) {
            c16484.f48425 = null;
            c16484.f48426 = c5276;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C14281 m27998(C16484 c16484, C17384 c17384, String str) {
        if (!c16484.f48413.f62838) {
            return new C14281();
        }
        try {
            return m28001(c16484, c17384, str).m25278();
        } catch (RuntimeException unused) {
            return new C14281();
        } catch (C5276 e) {
            if (C17384.m39567(str)) {
                m27994(c16484, e);
            }
            return new C14281();
        }
    }
}
