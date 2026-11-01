package p067l;

import java.io.InputStream;

/* JADX INFO: renamed from: l.᩸ܶܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 21YS */
/* JADX INFO: loaded from: classes4.dex */
public final class C22959 {

    /* JADX INFO: renamed from: ֫ */
    public static final String[] f72225 = {".jpg", ".jpeg", ".png", ".gif", ".wav", ".mp2", ".mp3", ".ogg", ".aac", ".mpg", ".mpeg", ".mid", ".midi", ".smf", ".jet", ".rtttl", ".imy", ".xmf", ".mp4", ".m4a", ".m4v", ".3gp", ".3gpp", ".3g2", ".3gpp2", ".amr", ".awb", ".wma", ".wmv", ".apk", ".zip", ".jar", ".xz"};

    /* JADX INFO: renamed from: ֫ */
    public static int m51283(String str, C16922 c16922) {
        boolean z;
        String lowerCase = str.toLowerCase();
        if ((c16922.f50093 && lowerCase.toLowerCase().startsWith("lib/")) || ((c16922.f50092 && lowerCase.toLowerCase().endsWith(".dex")) || lowerCase.startsWith("assets/dexopt/"))) {
            z = false;
            break;
        }
        z = true;
        if (lowerCase.equals("resources.arsc")) {
            z = true ^ c16922.f50091;
        } else {
            for (int i = 0; i < 33; i++) {
                if (lowerCase.endsWith(f72225[i])) {
                    z = false;
                    break;
                }
            }
        }
        return z ? 8 : 0;
    }

    /* JADX INFO: renamed from: ۧ */
    public static boolean m51286(C5738 c5738, C16922 c16922) {
        String name = c5738.getName();
        return ((c16922.f50093 && name.toLowerCase().startsWith("lib/")) || (c16922.f50092 && name.toLowerCase().endsWith(".dex"))) && c5738.m12748() != 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m51285(C19561 c19561, C10844 c10844, C5738 c5738, C16922 c16922, InterfaceC3693 interfaceC3693) {
        if (!m51286(c5738, c16922)) {
            if (interfaceC3693 == null) {
                c10844.m24988(c5738, c19561);
                return;
            } else {
                c10844.m24989(c5738, c19561, interfaceC3693);
                return;
            }
        }
        int iM24996 = c10844.m24996();
        try {
            c10844.m24992(0);
            c10844.m24987(c5738);
            InputStream inputStreamM44448 = c19561.m44448(c5738);
            try {
                byte[] bArr = new byte[8192];
                long j = 0;
                while (true) {
                    int i = inputStreamM44448.read(bArr);
                    if (i != -1) {
                        c10844.write(bArr, 0, i);
                        long j2 = i;
                        long j3 = j + j2;
                        if (interfaceC3693 != null) {
                            interfaceC3693.mo4047(j2, j3, c5738.getSize());
                            if (interfaceC3693.mo3924()) {
                                inputStreamM44448.close();
                                c10844.m24992(iM24996);
                                return;
                            }
                        }
                        j = j3;
                    } else {
                        inputStreamM44448.close();
                        c10844.m24997();
                        c10844.m24992(iM24996);
                        return;
                    }
                    c10844.m24992(iM24996);
                    throw th;
                }
            } catch (Throwable th) {
                try {
                    inputStreamM44448.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } catch (Throwable th3) {
            c10844.m24992(iM24996);
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static long m51284(C5738 c5738, C16922 c16922) {
        return m51286(c5738, c16922) ? c5738.getSize() : c5738.m12774();
    }
}
