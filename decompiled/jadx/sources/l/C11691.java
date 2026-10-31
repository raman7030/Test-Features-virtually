package l;

import java.util.LinkedHashMap;

/* JADX INFO: renamed from: l.ۨۨ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: L78I */
/* JADX INFO: loaded from: classes3.dex */
public final class C11691 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C8495 f34857;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m28581(C8495 c8495) {
        this.f34857 = c8495;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C15549 m28580(C14852 c14852, String str, boolean z, C15923 c15923) throws Throwable {
        C17667 c17667 = (C17667) c14852.f45302.get(C14844.m35244(str));
        if (c17667 == null) {
            throw C18081.m42146(c14852.f45300, "");
        }
        C16255 c16255M43958 = c14852.f45313.m43958(c17667.f54033, c15923.m37694());
        String string = c16255M43958.f50005;
        if (c16255M43958.f50003) {
            m28582(c14852);
        }
        if (!z && string != null) {
            return new C15549(string, new LinkedHashMap(), new LinkedHashMap());
        }
        try {
            C7980 c7980M28576 = m28576(c14852, c17667);
            if (string == null) {
                C22357 c22357 = new C22357();
                C11418 c11418 = new C11418();
                C21652.m48913(new C22706(c11418), c7980M28576, c22357);
                string = c11418.toString();
            }
            return new C15549(string, z ? C8751.m22648(c7980M28576) : new LinkedHashMap(), z ? C8751.m22639(c7980M28576) : new LinkedHashMap());
        } catch (C3059 e) {
            throw e;
        } catch (Exception e2) {
            throw C3059.m9368("SMALI_READ_FAILED", e2.getMessage() == null ? "Failed to disassemble class" : e2.getMessage());
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C7980 m28576(C14852 c14852, C17667 c17667) {
        return new C7980(c14852.m35252(c17667.f54034), c17667.f54032, c17667.f54035);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C7980 m28579(C14852 c14852, C17667 c17667, C15923 c15923) {
        if (c15923 == null) {
            return m28576(c14852, c17667);
        }
        return new C7980(c15923.m37693(c14852.f45300, c17667.f54034, new C18657(this, c14852)), c17667.f54032, c17667.f54035);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C7980 m28577(C14852 c14852, C17667 c17667, C12918 c12918) throws C3059 {
        try {
            C7980 c7980 = new C7980(c12918, c17667.f54032, c17667.f54035);
            if (C14844.m35246(c17667.f54033).equals(c7980.getType())) {
                return c7980;
            }
            throw C18081.m42149(c14852.f45311, c14852.f45296);
        } catch (C3059 e) {
            throw e;
        } catch (Exception unused) {
            throw C18081.m42149(c14852.f45311, c14852.f45296);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C6046 m28578(C14852 c14852, C17667 c17667, C22706 c22706, C12953 c12953, C9907 c9907, C17487 c17487) throws Throwable {
        c22706.m50718();
        C16255 c16255M43959 = c14852.f45313.m43959(c17667.f54033, c22706, c12953, c9907);
        boolean z = c16255M43959.f50003;
        if (!c16255M43959.f50004) {
            try {
                C21652.m48913(c22706, m28577(c14852, c17667, c17487.m40877(c17667.f54034)), new C22357());
                return new C6046(z, true, null);
            } catch (C3059 e) {
                return new C6046(z, false, e);
            } catch (Exception e2) {
                return new C6046(z, false, C3059.m9368("SMALI_READ_FAILED", e2.getMessage() == null ? "Failed to disassemble class" : e2.getMessage()));
            }
        }
        return new C6046(z, false, null);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m28582(C14852 c14852) {
        C8495 c8495 = this.f34857;
        if (c8495 != null) {
            c8495.m22189(c14852);
        }
    }
}
