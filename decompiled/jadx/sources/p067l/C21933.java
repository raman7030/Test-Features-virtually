package p067l;

import bin.p000mt.radare2.Radare2Native;

/* JADX INFO: renamed from: l.᩷ۖۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: F764 */
/* JADX INFO: loaded from: classes4.dex */
public final class C21933 {

    /* JADX INFO: renamed from: ֫ */
    public static InterfaceC8521 f68954 = new C9417();

    /* JADX INFO: renamed from: ۧ */
    public static volatile boolean f68955;

    /* JADX INFO: renamed from: ֫ */
    public static void m49463(C17423 c17423) {
        synchronized (C21933.class) {
            if (!f68955) {
                f68954 = c17423;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m49462() {
        if (f68955) {
            return;
        }
        synchronized (C21933.class) {
            if (f68955) {
                return;
            }
            try {
                f68954.mo19814();
                Radare2Native.nativeVersion();
                f68955 = true;
            } catch (LinkageError e) {
                throw new C11204("Failed to load libmt-radare2.so", e);
            } catch (C11204 e2) {
                throw e2;
            }
        }
    }
}
