package p067l;

import java.io.IOException;

/* JADX INFO: renamed from: l.۬ۡ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 9AFA */
/* JADX INFO: loaded from: classes3.dex */
public final class C14742 {

    /* JADX INFO: renamed from: ֫ */
    public static final C20139 f42015 = new C20139(new C5355(), new C8192());

    /* JADX INFO: renamed from: ۧ */
    public static void m33685(C5550 c5550) {
        f42015.m45584(c5550);
    }

    /* JADX INFO: renamed from: ֫ */
    public static InterfaceC14937 m33683(C5550 c5550) {
        try {
            return (InterfaceC14937) f42015.m45582(c5550);
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

    /* JADX INFO: renamed from: ۧ */
    public static void m33686(InterfaceC14937 interfaceC14937) {
        try {
            f42015.m45585(interfaceC14937.getKey(), interfaceC14937);
        } catch (IllegalStateException unused) {
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m33684(InterfaceC14937 interfaceC14937) {
        try {
            f42015.m45583(interfaceC14937.getKey(), interfaceC14937);
        } catch (Exception unused) {
        }
    }
}
