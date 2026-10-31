package l;

import android.net.Uri;
import java.io.IOException;

/* JADX INFO: renamed from: l.ܺ۠ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 474R */
/* JADX INFO: loaded from: classes4.dex */
public final class C15807 implements AutoCloseable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C21453 f48765;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C12053 f48766;

    public C15807(C21453 c21453, C12053 c12053) {
        this.f48765 = c21453;
        this.f48766 = c12053;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C15807 m37444(C23713 c23713, final Uri uri, InterfaceC15097 interfaceC15097, C0991 c0991) {
        C21453 c21453M9475;
        boolean zM1627;
        try {
            c21453M9475 = C3108.m9475(c23713, uri, interfaceC15097, null);
            try {
                final String strM48603 = c21453M9475.m48603();
                if (strM48603 == null) {
                    c21453M9475.close();
                    return null;
                }
                long jM48604 = c21453M9475.m48604();
                C16197 c16197M52288 = c23713.m52288();
                if (jM48604 <= 0 && c16197M52288 != null) {
                    jM48604 = C13325.m32306(c16197M52288.mo38139(strM48603));
                }
                boolean z = jM48604 > 0 && c16197M52288 != null && c16197M52288.m38148(strM48603, 0L, jM48604);
                Boolean boolM48605 = c21453M9475.m48605();
                if (jM48604 <= 0) {
                    C0285 c0285M3463 = c0991.m3463(uri, interfaceC15097);
                    jM48604 = c0285M3463.m1626();
                    z = jM48604 > 0 && c16197M52288 != null && c16197M52288.m38148(strM48603, 0L, jM48604);
                    zM1627 = c0285M3463.m1627();
                } else if (z) {
                    zM1627 = true;
                } else if (boolM48605 != null) {
                    zM1627 = boolM48605.booleanValue();
                } else {
                    try {
                        zM1627 = c0991.m3463(uri, interfaceC15097).m1627();
                    } catch (IOException unused) {
                        zM1627 = false;
                    }
                }
                final long j = jM48604;
                if ((z || zM1627) && j > 0 && j != -1) {
                    final C17075 c17075 = new C17075(c23713, new C9315(c23713, interfaceC15097, new C7037(strM48603)), strM48603, zM1627 && !z);
                    return new C15807(c21453M9475, C12053.m29427(strM48603, new InterfaceC5703() { // from class: l.ۡ۠ۜ
                        @Override // l.InterfaceC5703
                        /* JADX INFO: renamed from: ֫ */
                        public final InterfaceC7505 mo16113() {
                            return new C4871(c17075, uri, strM48603, j);
                        }
                    }, C12053.m29430(uri.getPath())));
                }
                c21453M9475.close();
                return null;
            } catch (IOException | RuntimeException unused2) {
                if (c21453M9475 != null) {
                    c21453M9475.close();
                }
            }
        } catch (IOException | RuntimeException unused3) {
            c21453M9475 = null;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C12053 m37445() {
        return this.f48766;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f48765.close();
    }
}
