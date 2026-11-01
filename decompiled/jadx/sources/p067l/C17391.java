package p067l;

import android.net.Uri;
import java.io.IOException;

/* JADX INFO: renamed from: l.ܺ۠ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 474R */
/* JADX INFO: loaded from: classes4.dex */
public final class C17391 implements AutoCloseable {

    /* JADX INFO: renamed from: ᩸ */
    public final C22757 f51903;

    /* JADX INFO: renamed from: ᩹ */
    public final C13823 f51904;

    public C17391(C22757 c22757, C13823 c13823) {
        this.f51903 = c22757;
        this.f51904 = c13823;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C17391 m39616(C24905 c24905, final Uri uri, InterfaceC16716 interfaceC16716, C3310 c3310) {
        C22757 c22757M11518;
        boolean zM4027;
        try {
            c22757M11518 = C5322.m11518(c24905, uri, interfaceC16716, null);
            try {
                final String strM50940 = c22757M11518.m50940();
                if (strM50940 == null) {
                    c22757M11518.close();
                    return null;
                }
                long jM50941 = c22757M11518.m50941();
                C17762 c17762M54691 = c24905.m54691();
                if (jM50941 <= 0 && c17762M54691 != null) {
                    jM50941 = C15033.m34406(c17762M54691.mo40351(strM50940));
                }
                boolean z = jM50941 > 0 && c17762M54691 != null && c17762M54691.m40360(strM50940, 0L, jM50941);
                Boolean boolM50942 = c22757M11518.m50942();
                if (jM50941 <= 0) {
                    C2639 c2639M5766 = c3310.m5766(uri, interfaceC16716);
                    jM50941 = c2639M5766.m4026();
                    z = jM50941 > 0 && c17762M54691 != null && c17762M54691.m40360(strM50940, 0L, jM50941);
                    zM4027 = c2639M5766.m4027();
                } else if (z) {
                    zM4027 = true;
                } else if (boolM50942 != null) {
                    zM4027 = boolM50942.booleanValue();
                } else {
                    try {
                        zM4027 = c3310.m5766(uri, interfaceC16716).m4027();
                    } catch (IOException unused) {
                        zM4027 = false;
                    }
                }
                final long j = jM50941;
                if ((z || zM4027) && j > 0 && j != -1) {
                    final C18596 c18596 = new C18596(c24905, new C11221(c24905, interfaceC16716, new C9057(strM50940)), strM50940, zM4027 && !z);
                    return new C17391(c22757M11518, C13823.m31489(strM50940, new InterfaceC7788() { // from class: l.ۡ۠ۜ
                        @Override // p067l.InterfaceC7788
                        /* JADX INFO: renamed from: ֫ */
                        public final InterfaceC9501 mo18032() {
                            return new C6998(c18596, uri, strM50940, j);
                        }
                    }, C13823.m31492(uri.getPath())));
                }
                c22757M11518.close();
                return null;
            } catch (IOException | RuntimeException unused2) {
                if (c22757M11518 != null) {
                    c22757M11518.close();
                }
            }
        } catch (IOException | RuntimeException unused3) {
            c22757M11518 = null;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C13823 m39617() {
        return this.f51904;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f51903.close();
    }
}
