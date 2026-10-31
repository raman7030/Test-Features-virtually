package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.۬ۡ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 9AFA */
/* JADX INFO: loaded from: classes3.dex */
public final class C13019 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final C18698 f38969 = new C18698(new C3142(), new C6127());

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m31600(C3347 c3347) {
        f38969.m43318(c3347);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC13224 m31598(C3347 c3347) {
        try {
            return (InterfaceC13224) f38969.m43316(c3347);
        } catch (Exception e) {
            if (e instanceof IOException) {
                throw ((IOException) e);
            }
            Throwable cause = e.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            throw new IOException(e);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m31601(InterfaceC13224 interfaceC13224) {
        try {
            f38969.m43319(interfaceC13224.getKey(), interfaceC13224);
        } catch (IllegalStateException unused) {
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m31599(InterfaceC13224 interfaceC13224) {
        try {
            f38969.m43317(interfaceC13224.getKey(), interfaceC13224);
        } catch (Exception unused) {
        }
    }
}
