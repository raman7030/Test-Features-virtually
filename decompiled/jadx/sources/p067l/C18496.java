package p067l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܽ᩻ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: K6YZ */
/* JADX INFO: loaded from: classes4.dex */
public final class C18496 {

    /* JADX INFO: renamed from: ֫ */
    public final C10371 f55237;

    public C18496(C10371 c10371) {
        this.f55237 = c10371;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0064  */
    /* JADX INFO: renamed from: ֫ */
    public final C13133 m42038() {
        boolean z;
        boolean zIsSymbolicLink;
        ArrayList arrayList = new ArrayList();
        C10371 c10371 = this.f55237;
        AbstractC17043 abstractC17043M24028 = c10371.m24028();
        if (!abstractC17043M24028.mo25087()) {
            return new C13133(arrayList, 0);
        }
        int i = 0;
        for (AbstractC17043 abstractC17043 : abstractC17043M24028.mo25500(true)) {
            String name = abstractC17043.getName();
            if (!abstractC17043.mo25087() || name.startsWith(".tmp-") || name.equals("xref")) {
                z = false;
            } else {
                if (abstractC17043.m38691()) {
                    zIsSymbolicLink = true;
                } else {
                    try {
                        zIsSymbolicLink = C18743.isSymbolicLink(C10697.get(abstractC17043.mo25505(), new String[0]));
                    } catch (Exception unused) {
                        zIsSymbolicLink = false;
                    }
                }
                if (zIsSymbolicLink) {
                    z = false;
                } else {
                    z = true;
                }
            }
            if (z) {
                try {
                    C2994 c2994M24027 = c10371.m24027(abstractC17043.getName());
                    if (!c2994M24027.f5313) {
                        arrayList.add(m42037(c2994M24027));
                    }
                } catch (Exception unused2) {
                    i++;
                }
            }
        }
        C8150.sort(arrayList, C16866.thenComparing(C16866.reversed(C10162.comparingLong(new C9520())), new C9982(2)));
        return new C13133(arrayList, i);
    }

    /* JADX INFO: renamed from: ֫ */
    private C4415 m42037(C2994 c2994) {
        boolean zMo25093;
        String name;
        Long lValueOf;
        C19561 c19561 = new C19561(c2994.f5320.m38684("original.apk"));
        try {
            C21527 c21527M11941 = C5433.m11941(c19561);
            c19561.close();
            String str = c21527M11941.f67913;
            if (str == null) {
                str = c21527M11941.f67916;
            }
            String str2 = str;
            long j = c2994.f5322;
            if (j < 0) {
                j = c2994.f5311;
            }
            long j2 = j;
            String str3 = c2994.f5323;
            String str4 = c2994.f5319;
            int i = 0;
            if (str4 == null || str4.isEmpty()) {
                zMo25093 = false;
            } else {
                try {
                    zMo25093 = C18524.m42109(str4, new String[0]).mo25093();
                } catch (RuntimeException unused) {
                    zMo25093 = false;
                }
            }
            String str5 = c2994.f5319;
            if (str5 == null || str5.isEmpty()) {
                name = null;
            } else {
                try {
                    name = C18524.m42109(str5, new String[0]).getName();
                } catch (RuntimeException unused2) {
                    name = null;
                }
            }
            String str6 = c21527M11941.f67922;
            String str7 = c21527M11941.f67915;
            String str8 = c21527M11941.f67921;
            if (str8 != null && !str8.isEmpty()) {
                while (true) {
                    if (i < str8.length()) {
                        char cCharAt = str8.charAt(i);
                        if (cCharAt >= '0' && cCharAt <= '9') {
                            i++;
                        }
                    } else {
                        try {
                            lValueOf = Long.valueOf(Long.parseLong(str8));
                            break;
                        } catch (NumberFormatException unused3) {
                            lValueOf = null;
                            break;
                        }
                    }
                    lValueOf = null;
                    break;
                }
            }
            lValueOf = null;
            break;
            return new C4415(str3, str4, zMo25093, name, str2, str6, str7, lValueOf, c2994.f5311, j2, c21527M11941.f67918, c21527M11941.f67920);
        } catch (Throwable th) {
            try {
                c19561.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }
}
