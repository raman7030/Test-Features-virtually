package l;

import java.io.InputStream;

/* JADX INFO: renamed from: l.ۖۢ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: Q7KW */
/* JADX INFO: loaded from: classes2.dex */
public final class C2446 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f7799;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C14896 f7800 = new C14896(65520);

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C20085 f7801;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m7892(InputStream inputStream) throws C15850 {
        this.f7799 = 0;
        C14896 c14896 = this.f7800;
        c14896.f45449 = 0;
        c14896.m35350(inputStream);
        int iM35353 = c14896.m35353(this.f7799);
        this.f7799 += 4;
        if (iM35353 != -889275714) {
            throw new C15850("illegal.start.of.class.file");
        }
        m7891();
        char cM7891 = m7891();
        if (cM7891 < '5') {
            throw new C15850(C19370.m44628(cM7891, "bad major version number for module: "));
        }
        C20085 c20085 = new C20085(null, c14896, null, null);
        this.f7801 = c20085;
        this.f7799 = c20085.m46278(c14896, this.f7799);
        char cM7892 = m7891();
        if (cM7892 != 32768) {
            throw new C15850(C13540.m32584(new StringBuilder("invalid access flags for module: 0x"), cM7892));
        }
        m7891();
        m7890(m7891(), "super_class");
        m7890(m7891(), "interface_count");
        m7890(m7891(), "fields_count");
        m7890(m7891(), "methods_count");
        char cM7893 = m7891();
        for (int i = 0; i < cM7893; i++) {
            char cM7894 = m7891();
            int iM35354 = c14896.m35353(this.f7799);
            this.f7799 += 4;
            if (((String) this.f7801.m46284(cM7894, new C9005())).equals("Module") && iM35354 > 2) {
                return (String) this.f7801.m46282(m7891(), new C20177());
            }
            this.f7799 += iM35354;
        }
        throw new C15850("no Module attribute");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m7890(int i, String str) throws C15850 {
        if (i == 0) {
            return;
        }
        throw new C15850("invalid " + str + " for module: " + i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final char m7891() {
        char cM35354 = this.f7800.m35354(this.f7799);
        this.f7799 += 2;
        return cM35354;
    }
}
