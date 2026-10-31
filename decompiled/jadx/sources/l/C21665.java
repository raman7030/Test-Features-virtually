package l;

import java.io.InputStream;

/* JADX INFO: renamed from: l.᩸ܶܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 21YS */
/* JADX INFO: loaded from: classes4.dex */
public final class C21665 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final String[] f69521 = {".jpg", ".jpeg", ".png", ".gif", ".wav", ".mp2", ".mp3", ".ogg", ".aac", ".mpg", ".mpeg", ".mid", ".midi", ".smf", ".jet", ".rtttl", ".imy", ".xmf", ".mp4", ".m4a", ".m4v", ".3gp", ".3gpp", ".3g2", ".3gpp2", ".amr", ".awb", ".wma", ".wmv", ".apk", ".zip", ".jar", ".xz"};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m48934(String str, C15313 c15313) {
        boolean z;
        String lowerCase = str.toLowerCase();
        if ((c15313.f46967 && lowerCase.toLowerCase().startsWith("lib/")) || ((c15313.f46966 && lowerCase.toLowerCase().endsWith(".dex")) || lowerCase.startsWith("assets/dexopt/"))) {
            z = false;
            break;
        }
        z = true;
        if (lowerCase.equals("resources.arsc")) {
            z = true ^ c15313.f46965;
        } else {
            for (int i = 0; i < 33; i++) {
                if (lowerCase.endsWith(f69521[i])) {
                    z = false;
                    break;
                }
            }
        }
        return z ? 8 : 0;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m48937(C3545 c3545, C15313 c15313) {
        String name = c3545.getName();
        return ((c15313.f46967 && name.toLowerCase().startsWith("lib/")) || (c15313.f46966 && name.toLowerCase().endsWith(".dex"))) && c3545.m10767() != 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m48936(C18090 c18090, C8918 c8918, C3545 c3545, C15313 c15313, InterfaceC1393 interfaceC1393) {
        if (!m48937(c3545, c15313)) {
            if (interfaceC1393 == null) {
                c8918.m23014(c3545, c18090);
                return;
            } else {
                c8918.m23015(c3545, c18090, interfaceC1393);
                return;
            }
        }
        int iM23022 = c8918.m23022();
        try {
            c8918.m23018(0);
            c8918.m23013(c3545);
            InputStream inputStreamM42189 = c18090.m42189(c3545);
            try {
                byte[] bArr = new byte[8192];
                long j = 0;
                while (true) {
                    int i = inputStreamM42189.read(bArr);
                    if (i != -1) {
                        c8918.write(bArr, 0, i);
                        long j2 = i;
                        long j3 = j + j2;
                        if (interfaceC1393 != null) {
                            interfaceC1393.mo1647(j2, j3, c3545.getSize());
                            if (interfaceC1393.mo1526()) {
                                inputStreamM42189.close();
                                c8918.m23018(iM23022);
                                return;
                            }
                        }
                        j = j3;
                    } else {
                        inputStreamM42189.close();
                        c8918.m23023();
                        c8918.m23018(iM23022);
                        return;
                    }
                    c8918.m23018(iM23022);
                    throw th;
                }
            } catch (Throwable th) {
                try {
                    inputStreamM42189.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } catch (Throwable th3) {
            c8918.m23018(iM23022);
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m48935(C3545 c3545, C15313 c15313) {
        return m48937(c3545, c15313) ? c3545.getSize() : c3545.m10793();
    }
}
