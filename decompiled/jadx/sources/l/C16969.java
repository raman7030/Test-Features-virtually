package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܽ᩻ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: K6YZ */
/* JADX INFO: loaded from: classes4.dex */
public final class C16969 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C8420 f52057;

    public C16969(C8420 c8420) {
        this.f52057 = c8420;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0064  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C11326 m39795() {
        boolean z;
        boolean zIsSymbolicLink;
        ArrayList arrayList = new ArrayList();
        C8420 c8420 = this.f52057;
        AbstractC15440 abstractC15440M22058 = c8420.m22058();
        if (!abstractC15440M22058.mo23113()) {
            return new C11326(arrayList, 0);
        }
        int i = 0;
        for (AbstractC15440 abstractC15440 : abstractC15440M22058.mo23549(true)) {
            String name = abstractC15440.getName();
            if (!abstractC15440.mo23113() || name.startsWith(".tmp-") || name.equals("xref")) {
                z = false;
            } else {
                if (abstractC15440.m36533()) {
                    zIsSymbolicLink = true;
                } else {
                    try {
                        zIsSymbolicLink = C17229.isSymbolicLink(C8763.get(abstractC15440.mo23554(), new String[0]));
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
                    C0658 c0658M22057 = c8420.m22057(abstractC15440.getName());
                    if (!c0658M22057.f2540) {
                        arrayList.add(m39794(c0658M22057));
                    }
                } catch (Exception unused2) {
                    i++;
                }
            }
        }
        C6083.sort(arrayList, C15254.thenComparing(C15254.reversed(C8200.comparingLong(new C7525())), new C8011(2)));
        return new C11326(arrayList, i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C2153 m39794(C0658 c0658) {
        boolean zMo23119;
        String name;
        Long lValueOf;
        C18090 c18090 = new C18090(c0658.f2547.m36526("original.apk"));
        try {
            C20158 c20158M9893 = C3224.m9893(c18090);
            c18090.close();
            String str = c20158M9893.f65270;
            if (str == null) {
                str = c20158M9893.f65273;
            }
            String str2 = str;
            long j = c0658.f2549;
            if (j < 0) {
                j = c0658.f2538;
            }
            long j2 = j;
            String str3 = c0658.f2550;
            String str4 = c0658.f2546;
            int i = 0;
            if (str4 == null || str4.isEmpty()) {
                zMo23119 = false;
            } else {
                try {
                    zMo23119 = C16999.m39866(str4, new String[0]).mo23119();
                } catch (RuntimeException unused) {
                    zMo23119 = false;
                }
            }
            String str5 = c0658.f2546;
            if (str5 == null || str5.isEmpty()) {
                name = null;
            } else {
                try {
                    name = C16999.m39866(str5, new String[0]).getName();
                } catch (RuntimeException unused2) {
                    name = null;
                }
            }
            String str6 = c20158M9893.f65279;
            String str7 = c20158M9893.f65272;
            String str8 = c20158M9893.f65278;
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
            return new C2153(str3, str4, zMo23119, name, str2, str6, str7, lValueOf, c0658.f2538, j2, c20158M9893.f65275, c20158M9893.f65277);
        } catch (Throwable th) {
            try {
                c18090.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }
}
