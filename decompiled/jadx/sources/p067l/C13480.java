package p067l;

import java.util.LinkedHashMap;

/* JADX INFO: renamed from: l.ۨۨ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: L78I */
/* JADX INFO: loaded from: classes3.dex */
public final class C13480 {

    /* JADX INFO: renamed from: ֫ */
    public C10443 f37856;

    /* JADX INFO: renamed from: ֫ */
    public final void m30629(C10443 c10443) {
        this.f37856 = c10443;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C17147 m30628(C16484 c16484, String str, boolean z, C17502 c17502) throws Throwable {
        C19160 c19160 = (C19160) c16484.f48418.get(C16477.m37400(str));
        if (c19160 == null) {
            throw C19553.m44405(c16484.f48416, "");
        }
        C17818 c17818M46252 = c16484.f48429.m46252(c19160.f57226, c17502.m39869());
        String string = c17818M46252.f53174;
        if (c17818M46252.f53172) {
            m30630(c16484);
        }
        if (!z && string != null) {
            return new C17147(string, new LinkedHashMap(), new LinkedHashMap());
        }
        try {
            C9952 c9952M30624 = m30624(c16484, c19160);
            if (string == null) {
                C23616 c23616 = new C23616();
                C13220 c13220 = new C13220();
                C22946.m51262(new C23948(c13220), c9952M30624, c23616);
                string = c13220.toString();
            }
            return new C17147(string, z ? C10685.m24618(c9952M30624) : new LinkedHashMap(), z ? C10685.m24609(c9952M30624) : new LinkedHashMap());
        } catch (C5276 e) {
            throw e;
        } catch (Exception e2) {
            throw C5276.m11410("SMALI_READ_FAILED", e2.getMessage() == null ? "Failed to disassemble class" : e2.getMessage());
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C9952 m30624(C16484 c16484, C19160 c19160) {
        return new C9952(c16484.m37408(c19160.f57227), c19160.f57225, c19160.f57228);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C9952 m30627(C16484 c16484, C19160 c19160, C17502 c17502) {
        if (c17502 == null) {
            return m30624(c16484, c19160);
        }
        return new C9952(c17502.m39868(c16484.f48416, c19160.f57227, new C20100(this, c16484)), c19160.f57225, c19160.f57228);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C9952 m30625(C16484 c16484, C19160 c19160, C14645 c14645) throws C5276 {
        try {
            C9952 c9952 = new C9952(c14645, c19160.f57225, c19160.f57228);
            if (C16477.m37402(c19160.f57226).equals(c9952.getType())) {
                return c9952;
            }
            throw C19553.m44408(c16484.f48427, c16484.f48412);
        } catch (C5276 e) {
            throw e;
        } catch (Exception unused) {
            throw C19553.m44408(c16484.f48427, c16484.f48412);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C8115 m30626(C16484 c16484, C19160 c19160, C23948 c23948, C14679 c14679, C11785 c11785, C18988 c18988) throws Throwable {
        c23948.m53044();
        C17818 c17818M46253 = c16484.f48429.m46253(c19160.f57226, c23948, c14679, c11785);
        boolean z = c17818M46253.f53172;
        if (!c17818M46253.f53173) {
            try {
                C22946.m51262(c23948, m30625(c16484, c19160, c18988.m43135(c19160.f57227)), new C23616());
                return new C8115(z, true, null);
            } catch (C5276 e) {
                return new C8115(z, false, e);
            } catch (Exception e2) {
                return new C8115(z, false, C5276.m11410("SMALI_READ_FAILED", e2.getMessage() == null ? "Failed to disassemble class" : e2.getMessage()));
            }
        }
        return new C8115(z, false, null);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m30630(C16484 c16484) {
        C10443 c10443 = this.f37856;
        if (c10443 != null) {
            c10443.m24157(c16484);
        }
    }
}
