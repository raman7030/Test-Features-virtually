package p067l;

import java.io.InputStream;

/* JADX INFO: renamed from: l.ۖۢ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: Q7KW */
/* JADX INFO: loaded from: classes2.dex */
public final class C4693 {

    /* JADX INFO: renamed from: ֫ */
    public int f10589;

    /* JADX INFO: renamed from: ۧ */
    public C16525 f10590 = new C16525(65520);

    /* JADX INFO: renamed from: ܽ */
    public C21457 f10591;

    /* JADX INFO: renamed from: ֫ */
    public final String m9940(InputStream inputStream) throws C17432 {
        this.f10589 = 0;
        C16525 c16525 = this.f10590;
        c16525.f48564 = 0;
        c16525.m37502(inputStream);
        int iM37505 = c16525.m37505(this.f10589);
        this.f10589 += 4;
        if (iM37505 != -889275714) {
            throw new C17432("illegal.start.of.class.file");
        }
        m9939();
        char cM9939 = m9939();
        if (cM9939 < '5') {
            throw new C17432(C20778.m46922(cM9939, "bad major version number for module: "));
        }
        C21457 c21457 = new C21457(null, c16525, null, null);
        this.f10591 = c21457;
        this.f10589 = c21457.m48594(c16525, this.f10589);
        char cM99310 = m9939();
        if (cM99310 != 32768) {
            throw new C17432(C1514.m34687(new StringBuilder("invalid access flags for module: 0x"), cM99310));
        }
        m9939();
        m9938(m9939(), "super_class");
        m9938(m9939(), "interface_count");
        m9938(m9939(), "fields_count");
        m9938(m9939(), "methods_count");
        char cM99311 = m9939();
        for (int i = 0; i < cM99311; i++) {
            char cM99312 = m9939();
            int iM37506 = c16525.m37505(this.f10589);
            this.f10589 += 4;
            if (((String) this.f10591.m48600(cM99312, new C10927())).equals("Module") && iM37506 > 2) {
                return (String) this.f10591.m48598(m9939(), new C21545());
            }
            this.f10589 += iM37506;
        }
        throw new C17432("no Module attribute");
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m9938(int i, String str) throws C17432 {
        if (i == 0) {
            return;
        }
        throw new C17432("invalid " + str + " for module: " + i);
    }

    /* JADX INFO: renamed from: ֫ */
    public final char m9939() {
        char cM37506 = this.f10590.m37506(this.f10589);
        this.f10589 += 2;
        return cM37506;
    }
}
