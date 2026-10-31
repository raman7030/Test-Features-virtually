package l;

import bin.mt.radare2.Radare2Native;

/* JADX INFO: renamed from: l.᩷ۖۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: F764 */
/* JADX INFO: loaded from: classes4.dex */
public final class C20586 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC6474 f66273 = new C7416();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static volatile boolean f66274;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m47137(C15840 c15840) {
        synchronized (C20586.class) {
            if (!f66274) {
                f66273 = c15840;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m47136() {
        if (f66274) {
            return;
        }
        synchronized (C20586.class) {
            if (f66274) {
                return;
            }
            try {
                f66273.mo17866();
                Radare2Native.nativeVersion();
                f66274 = true;
            } catch (LinkageError e) {
                throw new C9297("Failed to load libmt-radare2.so", e);
            } catch (C9297 e2) {
                throw e2;
            }
        }
    }
}
